package com.mes.eld_log.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mes.eld_log.dtos.DriveringStatusViewDto;
import com.mes.eld_log.dtos.EldReportDto;
import com.mes.eld_log.models.ClientMaster;
import com.mes.eld_log.models.ELDSettings;
import com.mes.eld_log.models.EmployeeMaster;
import com.mes.eld_log.models.MainTerminalMaster;
import com.mes.eld_log.models.StateMaster;
import com.mes.eld_log.models.VehicleMaster;
import com.mes.eld_log.repo.ClientMasterRepo;
import com.mes.eld_log.repo.ELDSettingsRepo;
import com.mes.eld_log.repo.EmployeeMasterRepo;
import com.mes.eld_log.repo.MainTerminalMasterRepo;
import com.mes.eld_log.repo.StateMasterRepo;
import com.mes.eld_log.repo.VehicleMasterRepo;
import java.io.File;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationOperation;
import org.springframework.data.mongodb.core.aggregation.MatchOperation;
import org.springframework.data.mongodb.core.aggregation.ProjectionOperation;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/api/jsoncrypto"})
public class JsonCryptoController {
   @Autowired
   private MongoTemplate mongoTemplate;
   @Autowired
   ClientMasterRepo clientMasterRepo;
   @Autowired
   ELDSettingsRepo eldSettingsRepo;
   @Autowired
   MainTerminalMasterRepo mainTerminalMasterRepo;
   @Autowired
   VehicleMasterRepo vehicleMasterRepo;
   @Autowired
   EmployeeMasterRepo employeeMasterRepo;
   @Autowired
   StateMasterRepo stateMasterRepo;
   @Autowired
   private JavaMailSender javaMailSender;
   private final PrivateKey privateKey;
   private final PublicKey publicKey;
   private final ObjectMapper mapper = new ObjectMapper();
   private static final Map<String, String> STATUS_MAP = new HashMap<>();

   public JsonCryptoController() throws Exception {
      this.privateKey = loadPrivateKey("private_key.pem");
      this.publicKey = loadPublicKey("public.pem");
   }

   public static String getStatusCode(String status) {
      return STATUS_MAP.getOrDefault(status, "Unknown");
   }

   @PostMapping({"/encrypt"})
   public ResponseEntity<?> encryptJson(@RequestBody Map<String, Object> requestData) {
      try {
         long driverId = Long.parseLong(requestData.get("driverId").toString());
         String fromDate = requestData.get("fromDate").toString();
         String toDate = requestData.get("toDate").toString();
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
         LocalDateTime ldtFromDate = LocalDateTime.parse(fromDate, formatter);
         long from = ldtFromDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
         LocalDateTime ldtToDate = LocalDateTime.parse(toDate, formatter);
         long to = ldtToDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
         EldReportDto.EldHeader header = new EldReportDto.EldHeader();
         EldReportDto.Carrier carrier = new EldReportDto.Carrier();
         EldReportDto.Driver driver = new EldReportDto.Driver();
         EldReportDto.Vehicle vehicle = new EldReportDto.Vehicle();
         EldReportDto.Annotation ann = new EldReportDto.Annotation();
         new EldReportDto.EventRecord();
         List<EldReportDto.EventRecord> evList = new ArrayList<>();
         double startOdometer = 0.0;
         double endOdometer = 0.0;
         String startEngineHour = "";
         String endEngineHour = "";
         String driverName = "";
         List<DriveringStatusViewDto> driveringStatusViewDtoData = this.lookupDriverStatusDataForGraphOperation(from, to, driverId);
         String formatted = Instant.now().atOffset(ZoneOffset.UTC).format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'"));

         for(int i = 0; i < driveringStatusViewDtoData.size(); ++i) {
            if (i == 0) {
               try {
                  Pageable pageableRequest = PageRequest.of(0, 1, Sort.by(new String[]{"_id"}).ascending());
                  Query query = new Query();
                  query.addCriteria(Criteria.where("utcDateTime").gte(from).lte(to).and("driverId").is(driverId).and("odometer").gt(0));
                  query.with(pageableRequest);
                  List<DriveringStatusViewDto> dsLogData = this.mongoTemplate.find(query, DriveringStatusViewDto.class, "drivering_status");
                  startOdometer = dsLogData.get(0).getOdometer();
                  startEngineHour = dsLogData.get(0).getEngineHour();
                  Pageable var52 = PageRequest.of(0, 1, Sort.by(new String[]{"_id"}).descending());
                  query = new Query();
                  query.addCriteria(Criteria.where("utcDateTime").gte(from).lte(to).and("driverId").is(driverId).and("odometer").gt(0));
                  query.with(var52);
                  dsLogData = this.mongoTemplate.find(query, DriveringStatusViewDto.class, "drivering_status");
                  endOdometer = dsLogData.get(0).getOdometer();
                  endEngineHour = dsLogData.get(0).getEngineHour();
               } catch (Exception var47) {
                  var47.printStackTrace();
               }

               EmployeeMaster empInfo = this.employeeMasterRepo.findByEmployeeId((int)driveringStatusViewDtoData.get(i).getDriverId());
               MainTerminalMaster mainTerminal = this.mainTerminalMasterRepo.findByMainTerminalId((int)empInfo.getMainTerminalId());
               ClientMaster clientInfo = this.clientMasterRepo.findByClientId((int)driveringStatusViewDtoData.get(i).getClientId());
               StateMaster stateInfo = this.stateMasterRepo.findByStateId((int)empInfo.getCdlStateId());
               VehicleMaster vehcileInfo = this.vehicleMasterRepo.findByVehicleId((int)empInfo.getTruckNo());
               carrier.setCarrierName(clientInfo.getClientName());
               carrier.setUsdotNumber(clientInfo.getDotNo());
               carrier.setHomeTerminal(mainTerminal.getMainTerminalName());
               driver.setDriverId(empInfo.getDriverId());
               driverName = empInfo.getFirstName() + " " + empInfo.getLastName();
               driver.setDriverName(driverName);
               driver.setLicenseNumber(empInfo.getCdlNo());
               driver.setLicenseState(stateInfo.getStateName());
               vehicle.setUnitNumber(vehcileInfo.getVehicleNo());
               vehicle.setVin(vehcileInfo.getVin());
               vehicle.setOdometerStart(String.format("%.2f", startOdometer));
               vehicle.setOdometerEnd(String.format("%.2f", endOdometer));
               ann.setEventRef(formatted);
               ann.setNote("");
            }

            String eventTime = Instant.ofEpochMilli(driveringStatusViewDtoData.get(i).getUtcDateTime())
               .atOffset(ZoneOffset.UTC)
               .format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'"));
            EldReportDto.EventRecord ev = new EldReportDto.EventRecord();
            ev.setEventCode(getStatusCode(driveringStatusViewDtoData.get(i).getStatus()));
            ev.setEventDescription(driveringStatusViewDtoData.get(i).getStatus());
            ev.setEventTime(eventTime);
            ev.setLocation(driveringStatusViewDtoData.get(i).getCustomLocation());
            ev.setOdometer(String.valueOf(driveringStatusViewDtoData.get(i).getOdometer()));
            ev.setEngineHours(driveringStatusViewDtoData.get(i).getEngineHour());
            evList.add(ev);
         }

         Map<String, Object> requestJsonData = new HashMap<>();
         requestJsonData.put("eventRecords", evList);
         byte[] jsonBytes = this.mapper.writeValueAsBytes(requestJsonData);
         String signatureEncrypted = signData(jsonBytes, this.privateKey);
         List<ELDSettings> settings = this.eldSettingsRepo.findAndViewBySettingId(1);
         if (settings.size() > 0) {
            header.setEldIdentifier(settings.get(0).getEldIdentifier());
            header.setEldProvider(settings.get(0).getEldProvider());
            header.setEldSoftwareVersion(settings.get(0).getEldSoftwareVersion());
         }

         header.setOutputFileFormat("JSON");
         header.setFileGeneratedTime(formatted);
         header.setFileSignature(signatureEncrypted);
         EldReportDto report = new EldReportDto();
         report.setEldHeader(header);
         report.setCarrier(carrier);
         report.setDriver(driver);
         report.setVehicle(vehicle);
         report.setEventRecords(evList);
         report.setAnnotations(Collections.singletonList(ann));
         report.setMalfunctions(Collections.emptyList());
         report.setDiagnostics(Collections.emptyList());
         report.setSignature(signatureEncrypted);
         String json = this.mapper.writeValueAsString(report);
         Map<String, Object> response = new HashMap<>();
         response.put("eventRecords", evList);
         response.put("signature", signatureEncrypted);
         String email = requestData.get("email").toString();
         if (email != null && !email.isEmpty()) {
            String subject = "Encrypted Log Report";
            String htmlBody = "<div style='font-family:Arial,sans-serif; margin:20px; text-align:center;'>  <h2 style='color:#333;'>"
               + driverName
               + " - Driver Logs</h2>  <p style='font-size:14px; color:#555;'>Report Period: "
               + formatDateRange(fromDate, toDate)
               + "</p>  <p style='color:#999; font-size:12px; margin-top:20px;'>     The encrypted driver log report is attached as a JSON file.</p>  <p style='color:#aaa; font-size:11px;'>This is an automated message. Please do not reply.</p></div>";
            String prettyJson = this.mapper.writerWithDefaultPrettyPrinter().writeValueAsString(report);
            String fileName = "driver_logs_" + driverId + "_" + System.currentTimeMillis() + ".json";
            File tempFile = new File(System.getProperty("java.io.tmpdir"), fileName);

            try (FileWriter writer = new FileWriter(tempFile)) {
               writer.write(prettyJson);
            }

            this.sendEmailWithAttachment(email, subject, htmlBody, tempFile);
         }

         return ResponseEntity.ok(response);
      } catch (Exception var48) {
         return ResponseEntity.internalServerError().body(var48.getMessage());
      }
   }

   public void sendEmailWithAttachment(String to, String subject, String htmlBody, File attachment) throws MessagingException {
      MimeMessage message = this.javaMailSender.createMimeMessage();
      MimeMessageHelper helper = new MimeMessageHelper(message, true, "UTF-8");
      helper.setTo(to);
      helper.setSubject(subject);
      helper.setText(htmlBody, true);
      if (attachment != null && attachment.exists()) {
         helper.addAttachment(attachment.getName(), attachment);
      }

      this.javaMailSender.send(message);
      if (attachment.exists()) {
         attachment.delete();
      }
   }

   public static String signData_old(String data, PrivateKey privateKey) throws Exception {
      Signature signature = Signature.getInstance("SHA256withRSA");
      signature.initSign(privateKey);
      signature.update(data.getBytes("UTF-8"));
      byte[] signedBytes = signature.sign();
      return Base64.getEncoder().encodeToString(signedBytes);
   }

   public static String signData(byte[] data, PrivateKey privateKey) throws Exception {
      Signature signature = Signature.getInstance("SHA256withRSA");
      signature.initSign(privateKey);
      signature.update(data);
      byte[] signedBytes = signature.sign();
      return Base64.getEncoder().encodeToString(signedBytes);
   }

   public static String formatDateRange(String fromDateStr, String toDateStr) {
      DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
      LocalDateTime fromDate = LocalDateTime.parse(fromDateStr, inputFormat);
      LocalDateTime toDate = LocalDateTime.parse(toDateStr, inputFormat);
      DateTimeFormatter monthDayYear = DateTimeFormatter.ofPattern("MMM d, yyyy", Locale.ENGLISH);
      String formattedFrom = fromDate.format(monthDayYear);
      String formattedTo = toDate.format(monthDayYear);
      return formattedFrom.equals(formattedTo) ? formattedFrom : formattedFrom + " - " + formattedTo;
   }

   public List<DriveringStatusViewDto> lookupDriverStatusDataForGraphOperation(long from, long to, long driverId) {
      MatchOperation filter = null;
      if (driverId > 0L) {
         filter = Aggregation.match(
            Criteria.where("utcDateTime")
               .gte(from)
               .lte(to)
               .and("driverId")
               .is(driverId)
               .and("isVisible")
               .is(1)
               .and("status")
               .in(new Object[]{"OnDrive", "OnDuty", "OnSleep", "OffDuty", "PersonalUse", "YardMove", "Voilation"})
         );
      } else {
         filter = Aggregation.match(
            Criteria.where("utcDateTime")
               .gte(from)
               .lte(to)
               .and("isVisible")
               .is(1)
               .and("status")
               .in(new Object[]{"OnDrive", "OnDuty", "OnSleep", "OffDuty", "PersonalUse", "YardMove", "Voilation"})
         );
      }

      ProjectionOperation projectStage = Aggregation.project(
            new String[]{
               "driverId",
               "status",
               "lattitude",
               "longitude",
               "dateTime",
               "lDateTime",
               "receivedTimestamp",
               "logType",
               "utcDateTime",
               "appVersion",
               "isVoilation",
               "note",
               "customLocation",
               "engineHour",
               "odometer",
               "vehicleId",
               "osVersion",
               "simCardNo",
               "origin",
               "timezone",
               "remainingWeeklyTime",
               "remainingDutyTime",
               "remainingDriveTime",
               "clientId"
            }
         )
         .andExclude(new String[]{"_id"});
      Aggregation aggregation = Aggregation.newAggregation(
         new AggregationOperation[]{filter, projectStage, Aggregation.sort(Direction.ASC, new String[]{"utcDateTime"})}
      );
      return this.mongoTemplate.aggregate(aggregation, "drivering_status", DriveringStatusViewDto.class).getMappedResults();
   }

   public void sendEmail(String to, String subject, String htmlBody) throws MessagingException {
      MimeMessage message = this.javaMailSender.createMimeMessage();
      MimeMessageHelper helper = new MimeMessageHelper(message, true);
      helper.setTo(to);
      helper.setSubject(subject);
      helper.setText(htmlBody, true);
      this.javaMailSender.send(message);
   }

   private boolean verifySignature(byte[] data, String signatureBase64, PublicKey publicKey) throws Exception {
      Signature signature = Signature.getInstance("SHA256withRSA");
      signature.initVerify(publicKey);
      signature.update(data);
      return signature.verify(Base64.getDecoder().decode(signatureBase64));
   }

   @PostMapping({"/verify"})
   public Map<String, Object> verifyJson(@RequestBody Map<String, Object> signedPayload) {
      Map<String, Object> response = new HashMap<>();

      try {
         String signature = (String)signedPayload.remove("signature");
         if (signature == null) {
            response.put("valid", false);
            response.put("error", "Missing signature field");
            return response;
         }

         byte[] jsonBytes = this.mapper.writeValueAsBytes(signedPayload);
         boolean valid = this.verifySignature(jsonBytes, signature, this.publicKey);
         response.put("valid", valid);
         response.put("data", signedPayload);
      } catch (Exception var6) {
         response.put("valid", false);
         response.put("error", var6.getMessage());
         var6.printStackTrace();
      }

      return response;
   }

   private static PrivateKey loadPrivateKey(String filename) throws Exception {
      ClassPathResource resource = new ClassPathResource("pem_file/" + filename);
      String keyPem = new String(StreamUtils.copyToByteArray(resource.getInputStream()), StandardCharsets.UTF_8)
         .replaceAll("-----BEGIN PRIVATE KEY-----", "")
         .replaceAll("-----END PRIVATE KEY-----", "")
         .replaceAll("\\s", "");
      byte[] keyBytes = Base64.getDecoder().decode(keyPem);
      return KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(keyBytes));
   }

   private static PublicKey loadPublicKey(String filename) throws Exception {
      ClassPathResource resource = new ClassPathResource("pem_file/" + filename);
      String key = new String(StreamUtils.copyToByteArray(resource.getInputStream()), StandardCharsets.UTF_8);
      key = key.replaceAll("-----BEGIN (.*)-----", "").replaceAll("-----END (.*)-----", "").replaceAll("\\s", "");
      byte[] keyBytes = Base64.getDecoder().decode(key);
      X509EncodedKeySpec spec = new X509EncodedKeySpec(keyBytes);
      return KeyFactory.getInstance("RSA").generatePublic(spec);
   }

   static {
      STATUS_MAP.put("OnDuty", "OD");
      STATUS_MAP.put("OnDrive", "ODR");
      STATUS_MAP.put("OffDuty", "OFF");
      STATUS_MAP.put("OnSleep", "OS");
      STATUS_MAP.put("PersonalUse", "PU");
      STATUS_MAP.put("YardMove", "YM");
      STATUS_MAP.put("Engine On", "EngOn");
      STATUS_MAP.put("Engine Off", "EngOff");
      STATUS_MAP.put("Violation", "VT");
   }
}
