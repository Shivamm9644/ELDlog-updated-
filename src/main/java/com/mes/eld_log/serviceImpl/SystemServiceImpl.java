package com.mes.eld_log.serviceImpl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mes.eld_log.dtos.DriveringStatusViewDto;
import com.mes.eld_log.dtos.LiveDataLogViewDto;
import com.mes.eld_log.dtos.MaxIdViewDto;
import com.mes.eld_log.models.DriveringStatus;
import com.mes.eld_log.models.ELDLogData;
import com.mes.eld_log.models.EmployeeMaster;
import com.mes.eld_log.models.GeofanceMaster;
import com.mes.eld_log.models.IdlingReport;
import com.mes.eld_log.models.IgnitionReport;
import com.mes.eld_log.models.ServerHealth;
import com.mes.eld_log.repo.ClientMasterRepo;
import com.mes.eld_log.repo.DriveringStatusRepo;
import com.mes.eld_log.repo.EmployeeMasterRepo;
import com.mes.eld_log.repo.GeofanceMasterRepo;
import com.mes.eld_log.repo.IdlingReportRepo;
import com.mes.eld_log.repo.IgnitionReportRepo;
import com.mes.eld_log.repo.LoginLogRepo;
import com.mes.eld_log.repo.LoginRepo;
import com.mes.eld_log.repo.MACAddressMasterRepo;
import com.mes.eld_log.repo.ServerHealthRepo;
import com.mes.eld_log.repo.UserMasterRepo;
import com.mes.eld_log.repo.VehicleMasterRepo;
import com.mes.eld_log.results.Result;
import com.mes.eld_log.results.ResultWrapper;
import com.mes.eld_log.service.SystemService;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.PosixFilePermissions;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationOperation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.core.aggregation.MatchOperation;
import org.springframework.data.mongodb.core.aggregation.ProjectionOperation;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

@EnableScheduling
@PropertySource({"classpath:application.properties"})
@Transactional
@Service("systemService")
public class SystemServiceImpl implements SystemService {
   private MongoTemplate mongoTemplate;
   @Autowired
   private EmployeeMasterRepo employeeMasterRepo;
   @Autowired
   private ServerHealthRepo serverHealthRepo;
   @Autowired
   private IgnitionReportRepo ignitionReportRepo;
   @Autowired
   private IdlingReportRepo idlingReportRepo;
   @Autowired
   VehicleMasterRepo vehicleMasterRepo;
   @Autowired
   GeofanceMasterRepo geofanceMasterRepo;
   @Autowired
   private UserMasterRepo userMasterRepo;
   @Autowired
   MACAddressMasterRepo macAddressMasterRepo;
   @Autowired
   private ClientMasterRepo clientMasterRepo;
   @Autowired
   DriveringStatusRepo driveringStatusRepo;
   @Autowired
   LoginRepo loginRepo;
   @Autowired
   LoginLogRepo loginLogRepo;
   @Autowired
   private JavaMailSender javaMailSender;
   private Path fileStorageLocation;

   @Autowired
   public SystemServiceImpl(MongoTemplate mongoTemplate) {
      this.mongoTemplate = mongoTemplate;
   }

   @Override
   public ResultWrapper<String> DriverLogService() {
      String sDebug = "";
      ResultWrapper<String> result = new ResultWrapper<>();

      try {
         Instant instant = Instant.now();
         LocalDate currentDate = LocalDate.now();
         currentDate = currentDate.minusDays(1L);
         LocalDateTime startOfDay = LocalDateTime.of(currentDate, LocalTime.MIDNIGHT);
         LocalDateTime endOfDay = LocalDateTime.of(currentDate, LocalTime.MAX);
         long from = startOfDay.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
         long to = endOfDay.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
         List<EmployeeMaster> employeeInfo = this.employeeMasterRepo.findAll();

         for(int i = 0; i < employeeInfo.size(); ++i) {
            Pageable pageableRequest = PageRequest.of(0, 1, Sort.by(new String[]{"utcDateTime"}).descending());
            Query query = new Query(Criteria.where("driverId").is(employeeInfo.get(i).getEmployeeId()).and("utcDateTime").gte(from).lte(to));
            query.limit(1);
            query.with(pageableRequest);
            List<DriveringStatusViewDto> driveringStatusViewDtoData = this.mongoTemplate.find(query, DriveringStatusViewDto.class, "drivering_status");
            sDebug = sDebug + " D : " + employeeInfo.get(i).getEmployeeId() + " == " + driveringStatusViewDtoData.size() + ",";
            if (driveringStatusViewDtoData.size() > 0) {
               try {
                  sDebug = sDebug + " Status : " + employeeInfo.get(i).getEmployeeId() + " <> " + driveringStatusViewDtoData.get(0).getStatus() + ",";
                  if (driveringStatusViewDtoData.get(0).getStatus().equals("OffDuty")) {
                     DriveringStatus driveringStatus = new DriveringStatus();
                     long maxId = this.lookupMaxIdOfDriverOperation((long)employeeInfo.get(i).getEmployeeId().intValue());
                     if (maxId <= 0L) {
                        maxId = 1L;
                        driveringStatus.setStatusId(maxId);
                     } else {
                        driveringStatus.setStatusId(++maxId);
                     }

                     driveringStatus.setDriverId((long)employeeInfo.get(i).getEmployeeId().intValue());
                     driveringStatus.setVehicleId(0L);
                     driveringStatus.setStatus("OffDuty");
                     driveringStatus.setLattitude(0.0);
                     driveringStatus.setLongitude(0.0);
                     driveringStatus.setDateTime(LocalDate.now() + " 00:00:00");
                     LocalDateTime ldtDate = LocalDateTime.of(LocalDate.now(), LocalTime.MIDNIGHT);
                     long lDateTime = ldtDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
                     driveringStatus.setLDateTime(lDateTime);
                     driveringStatus.setUtcDateTime(lDateTime);
                     driveringStatus.setLogType("System Generated");
                     driveringStatus.setOrigin("System Generated");
                     driveringStatus.setAppVersion("0.0");
                     driveringStatus.setOsVersion("0.0");
                     driveringStatus.setIsVoilation(0);
                     driveringStatus.setSimCardNo("0");
                     driveringStatus.setNote("");
                     driveringStatus.setCustomLocation("");
                     driveringStatus.setCurrentLocation("");
                     driveringStatus.setEngineHour("0");
                     driveringStatus.setOdometer(0.0);
                     driveringStatus.setTimezone("");
                     driveringStatus.setReceivedTimestamp(instant.toEpochMilli());
                     driveringStatus = (DriveringStatus)this.driveringStatusRepo.save(driveringStatus);
                  }
               } catch (Exception var23) {
                  var23.printStackTrace();
               }
            } else {
               try {
                  DriveringStatus driveringStatus = new DriveringStatus();
                  long maxId = this.lookupMaxIdOfDriverOperation((long)employeeInfo.get(i).getEmployeeId().intValue());
                  if (maxId <= 0L) {
                     maxId = 1L;
                     driveringStatus.setStatusId(maxId);
                  } else {
                     driveringStatus.setStatusId(++maxId);
                  }

                  driveringStatus.setDriverId((long)employeeInfo.get(i).getEmployeeId().intValue());
                  driveringStatus.setVehicleId(0L);
                  driveringStatus.setStatus("OffDuty");
                  driveringStatus.setLattitude(0.0);
                  driveringStatus.setLongitude(0.0);
                  driveringStatus.setDateTime(LocalDate.now() + " 00:00:00");
                  LocalDateTime ldtDate = LocalDateTime.of(LocalDate.now(), LocalTime.MIDNIGHT);
                  long lDateTime = ldtDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
                  driveringStatus.setLDateTime(lDateTime);
                  driveringStatus.setUtcDateTime(lDateTime);
                  driveringStatus.setLogType("System Generated");
                  driveringStatus.setOrigin("System Generated");
                  driveringStatus.setAppVersion("0.0");
                  driveringStatus.setOsVersion("0.0");
                  driveringStatus.setIsVoilation(0);
                  driveringStatus.setSimCardNo("0");
                  driveringStatus.setNote("");
                  driveringStatus.setCustomLocation("");
                  driveringStatus.setCurrentLocation("");
                  driveringStatus.setEngineHour("0");
                  driveringStatus.setOdometer(0.0);
                  driveringStatus.setTimezone("");
                  driveringStatus.setReceivedTimestamp(instant.toEpochMilli());
                  driveringStatus = (DriveringStatus)this.driveringStatusRepo.save(driveringStatus);
               } catch (Exception var22) {
                  var22.printStackTrace();
               }
            }
         }

         result.setResult("Saved");
         result.setStatus(Result.SUCCESS);
         result.setMessage("Driver Log Created Successfully." + sDebug);
      } catch (Exception var24) {
         result.setStatus(Result.FAIL);
         result.setMessage(var24.getLocalizedMessage() + sDebug);
      }

      return result;
   }

   public long lookupMaxIdOfDriverOperation(long driverId) {
      Aggregation aggregation = Aggregation.newAggregation(
         new AggregationOperation[]{
            Aggregation.match(Criteria.where("driverId").is(driverId)), Aggregation.group(new String[0]).max("statusId").as("statusId")
         }
      );
      AggregationResults<MaxIdViewDto> result = this.mongoTemplate.aggregate(aggregation, "drivering_status", MaxIdViewDto.class);
      List<MaxIdViewDto> results = result.getMappedResults();
      return results.isEmpty() ? -1L : results.get(0).getStatusId();
   }

   @Override
   public ResultWrapper<String> IftaReportService() {
      String sDebug = "";
      ResultWrapper<String> result = new ResultWrapper<>();

      try {
         Instant instant = Instant.now();
         LocalDate currentDate = LocalDate.now();
         currentDate = currentDate.minusDays(1L);
         LocalDateTime startOfDay = LocalDateTime.of(currentDate, LocalTime.MIDNIGHT);
         LocalDateTime endOfDay = LocalDateTime.of(currentDate, LocalTime.MAX);
         long from = startOfDay.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
         long to = endOfDay.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
         long lastVehicleId = 0L;
         long lastDriverId = 0L;
         long lastTotalKm = 0L;
         long lastUtcDateTime = 0L;
         double lastLat = 0.0;
         double lastLng = 0.0;
         double lastOdometer = 0.0;
         int iCount = 0;
         String lastPlaceAddress = "";
         new HashMap();
         new HashMap();
         new HashMap();
         List<LiveDataLogViewDto> eldLog = this.lookupELDLogHistoryOperation(from, to);
         ++iCount;
         sDebug = sDebug + "1,";
         List<GeofanceMaster> geofances = this.geofanceMasterRepo.findAll();

         for(int g = 0; g < geofances.size(); ++g) {
            HashMap latlng = geofances.get(g).getLatLng();
            Object cords = latlng.get("coordinates");
            String sLatLng = cords.toString();
            sLatLng = sLatLng.replace("[[[[", "");
            sLatLng = sLatLng.replace("]]]]", "");
            sLatLng = sLatLng.replace("[[[", "");
            sLatLng = sLatLng.replace("]]]", "");
            sLatLng = sLatLng.replace(",", "");
            sLatLng = sLatLng.replace("] [", ",");
            sLatLng = sLatLng.replace("][", ",");
            sDebug = sDebug + " >> " + sLatLng;
         }

         result.setResult("Saved");
         result.setStatus(Result.SUCCESS);
         result.setMessage("IFTA Report Generated Successfully." + sDebug);
      } catch (Exception var36) {
         result.setStatus(Result.FAIL);
         result.setMessage(var36.getLocalizedMessage() + sDebug);
      }

      return result;
   }

   @Scheduled(
      cron = "${cron.expression5}"
   )
   @Override
   public ResultWrapper<String> ReportGeneratedService() {
      String sDebug = "";
      ResultWrapper<String> result = new ResultWrapper<>();

      try {
         LocalDate currentDate = LocalDate.now();
         currentDate = currentDate.minusDays(1L);
         LocalDateTime startOfDay = LocalDateTime.of(currentDate, LocalTime.MIDNIGHT);
         LocalDateTime endOfDay = LocalDateTime.of(currentDate, LocalTime.MAX);
         long from = startOfDay.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
         long to = endOfDay.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
         List<ELDLogData> eldLog = this.lookupELDLogDataHistoryOperation(from, to);
         this.GenerateIdlingReport(eldLog);
         this.GenerateIgnitionReport(eldLog);
         result.setResult("Saved");
         result.setStatus(Result.SUCCESS);
         result.setMessage("Report Generated Successfully." + sDebug);
      } catch (Exception var11) {
         result.setStatus(Result.FAIL);
         result.setMessage(var11.getLocalizedMessage() + sDebug);
      }

      return result;
   }

   public void GenerateIdlingReport(List<ELDLogData> logs) {
      String sDebug = "";
      if (logs != null && logs.size() >= 2) {
         long MIN_IDLE_DURATION = 60000L;
         double LOCATION_THRESHOLD = 1.0E-4;
         double SPEED_THRESHOLD = 1.0;
         int RPM_THRESHOLD = 500;
         ELDLogData idleStart = null;

         try {
            for(int i = 0; i < logs.size(); ++i) {
               ELDLogData log = logs.get(i);
               boolean isIdle = (double)log.getSpeed() <= 1.0;
               sDebug = sDebug + "RPM :=> " + isIdle + " : " + log.getRPM() + " : " + log.getSpeed() + "\n";
               if (isIdle) {
                  if (idleStart == null) {
                     sDebug = sDebug + "Idle Log1, ";
                     idleStart = log;
                  } else {
                     double latDiff = Math.abs(idleStart.getLattitude() - log.getLattitude());
                     double lonDiff = Math.abs(idleStart.getLongitude() - log.getLongitude());
                     if (latDiff > 1.0E-4 || lonDiff > 1.0E-4) {
                        sDebug = sDebug + "Idle Log2, ";
                        idleStart = log;
                     }
                  }
               } else if (idleStart != null) {
                  long duration = log.getUtcDateTime() - idleStart.getUtcDateTime();
                  if (duration >= 60000L) {
                     IdlingReport idlingReport = new IdlingReport();
                     sDebug = sDebug + " Save Idle, ";
                     idlingReport.setDriverId(idleStart.getDriverId());
                     idlingReport.setVehicleId(idleStart.getVehicleId());
                     idlingReport.setClientId(idleStart.getClientId());
                     idlingReport.setVIN(idleStart.getVIN());
                     idlingReport.setVersion(idleStart.getVersion());
                     idlingReport.setMAC(idleStart.getMAC());
                     idlingReport.setModel(idleStart.getModel());
                     idlingReport.setSerialNo(idleStart.getSerialNo());
                     idlingReport.setStartDateTime(idleStart.getDateTime());
                     idlingReport.setEndDateTime(log.getDateTime());
                     idlingReport.setStartUtcDateTime(idleStart.getUtcDateTime());
                     idlingReport.setEndUtcDateTime(log.getUtcDateTime());
                     idlingReport.setDurationMillis(duration);
                     idlingReport.setStartAddress(idleStart.getPlaceAddress());
                     idlingReport.setEndAddress(log.getPlaceAddress());
                     idlingReport.setStartLattitude(idleStart.getLattitude());
                     idlingReport.setEndLattitude(log.getLattitude());
                     idlingReport.setStartLongitude(idleStart.getLongitude());
                     idlingReport.setEndLongitude(log.getLongitude());
                     idlingReport.setStartRPM(idleStart.getRPM());
                     idlingReport.setEndRPM(log.getRPM());
                     idlingReport.setStartCoolantTemp(idleStart.getCoolantTemp());
                     idlingReport.setEndCoolantTemp(log.getCoolantTemp());
                     idlingReport.setStartFuelTankTemp(idleStart.getFuelTankTemp());
                     idlingReport.setEndFuelTankTemp(log.getFuelTankTemp());
                     idlingReport.setStartOilTemp(idleStart.getOilTemp());
                     idlingReport.setEndOilTemp(log.getOilTemp());
                     idlingReport.setStartEngineHours(idleStart.getEngineHours());
                     idlingReport.setEndEngineHours(log.getEngineHours());
                     idlingReport.setStartOdometer(idleStart.getOdometer());
                     idlingReport.setEndOdometer(log.getOdometer());
                     idlingReport.setStartStateId(idleStart.getStateId());
                     idlingReport.setEndStateId(log.getStateId());
                     this.idlingReportRepo.save(idlingReport);
                  }

                  idleStart = null;
               }
            }

            if (idleStart != null) {
               ELDLogData last = logs.get(logs.size() - 1);
               long duration = last.getUtcDateTime() - idleStart.getUtcDateTime();
               if (duration >= 60000L) {
                  IdlingReport idlingReport = new IdlingReport();
                  sDebug = sDebug + " Save Idle, ";
                  idlingReport.setDriverId(idleStart.getDriverId());
                  idlingReport.setVehicleId(idleStart.getVehicleId());
                  idlingReport.setClientId(idleStart.getClientId());
                  idlingReport.setVIN(idleStart.getVIN());
                  idlingReport.setVersion(idleStart.getVersion());
                  idlingReport.setMAC(idleStart.getMAC());
                  idlingReport.setModel(idleStart.getModel());
                  idlingReport.setSerialNo(idleStart.getSerialNo());
                  idlingReport.setStartDateTime(idleStart.getDateTime());
                  idlingReport.setEndDateTime(last.getDateTime());
                  idlingReport.setStartUtcDateTime(idleStart.getUtcDateTime());
                  idlingReport.setEndUtcDateTime(last.getUtcDateTime());
                  idlingReport.setDurationMillis(duration);
                  idlingReport.setStartAddress(idleStart.getPlaceAddress());
                  idlingReport.setEndAddress(last.getPlaceAddress());
                  idlingReport.setStartLattitude(idleStart.getLattitude());
                  idlingReport.setEndLattitude(last.getLattitude());
                  idlingReport.setStartLongitude(idleStart.getLongitude());
                  idlingReport.setEndLongitude(last.getLongitude());
                  idlingReport.setStartRPM(idleStart.getRPM());
                  idlingReport.setEndRPM(last.getRPM());
                  idlingReport.setStartCoolantTemp(idleStart.getCoolantTemp());
                  idlingReport.setEndCoolantTemp(last.getCoolantTemp());
                  idlingReport.setStartFuelTankTemp(idleStart.getFuelTankTemp());
                  idlingReport.setEndFuelTankTemp(last.getFuelTankTemp());
                  idlingReport.setStartOilTemp(idleStart.getOilTemp());
                  idlingReport.setEndOilTemp(last.getOilTemp());
                  idlingReport.setStartEngineHours(idleStart.getEngineHours());
                  idlingReport.setEndEngineHours(last.getEngineHours());
                  idlingReport.setStartOdometer(idleStart.getOdometer());
                  idlingReport.setEndOdometer(last.getOdometer());
                  idlingReport.setStartStateId(idleStart.getStateId());
                  idlingReport.setEndStateId(last.getStateId());
                  this.idlingReportRepo.save(idlingReport);
               }
            }

            this.SaveLog(sDebug);
         } catch (Exception var18) {
            var18.printStackTrace();
         }
      }
   }

   @Scheduled(
      cron = "${cron.expression8}"
   )
   @Override
   public ResultWrapper<String> GetServerHealth() {
      String sDebug = "";
      ResultWrapper<String> result = new ResultWrapper<>();

      try {
         Instant instant = Instant.now();
         ProcessBuilder pb = new ProcessBuilder("/bin/bash", "/var/lib/tomcat9/server_health.sh");
         pb.redirectErrorStream(true);
         pb.environment().put("PATH", "/usr/bin:/bin");
         Process process = pb.start();
         BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
         StringBuilder output = new StringBuilder();

         String line;
         while((line = reader.readLine()) != null) {
            output.append(line);
         }

         process.waitFor();
         ObjectMapper mapper = new ObjectMapper();
         Map<String, Object> map = (Map)mapper.readValue(output.toString(), Map.class);
         ServerHealth health = new ServerHealth();
         health.setHost((String)map.get("host"));
         health.setDate((String)map.get("date"));
         health.setCpu(Double.parseDouble(map.get("cpu").toString()));
         health.setMemory(Double.parseDouble(map.get("memory").toString()));
         health.setTomcat(Double.parseDouble(map.get("tomcat").toString()));
         health.setLoad((String)map.get("load"));
         health.setReceivedTimestamp(instant.toEpochMilli());
         this.serverHealthRepo.save(health);
         result.setResult("Saved");
         result.setStatus(Result.SUCCESS);
         result.setMessage("Server Health saved successfully");
      } catch (Exception var12) {
         result.setStatus(Result.FAIL);
         result.setMessage(var12.getMessage());
      }

      return result;
   }

   public void SaveLog(String sLine) throws Exception {
      this.fileStorageLocation = Paths.get("/opt/tomcat/webapps/log").toAbsolutePath().normalize();

      try {
         if (Files.notExists(this.fileStorageLocation)) {
            Files.createDirectories(this.fileStorageLocation);
         }
      } catch (Exception var3) {
         throw new Exception("Could not create the directory where the uploaded files will be stored.", var3);
      }

      Path filePath = this.fileStorageLocation.resolve("eld_log.txt");
      Files.write(filePath, sLine.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
   }

   public void GenerateIgnitionReport(List<ELDLogData> logs) {
      String sDebug = "";
      if (logs != null && logs.size() >= 2) {
         ELDLogData prev = logs.get(0);
         boolean prevIsOn = prev.getRPM() >= 500L;

         try {
            for(int i = 1; i < logs.size(); ++i) {
               ELDLogData curr = logs.get(i);
               boolean currIsOn = curr.getRPM() >= 500L;
               if (currIsOn != prevIsOn) {
                  IgnitionReport ignitionReport = new IgnitionReport();
                  sDebug = sDebug + "Save Ignition, ";
                  ignitionReport.setDriverId(prev.getDriverId());
                  ignitionReport.setVehicleId(prev.getVehicleId());
                  ignitionReport.setClientId(prev.getClientId());
                  ignitionReport.setVIN(prev.getVIN());
                  ignitionReport.setVersion(prev.getVersion());
                  ignitionReport.setMAC(prev.getMAC());
                  ignitionReport.setModel(prev.getModel());
                  ignitionReport.setSerialNo(prev.getSerialNo());
                  ignitionReport.setEngineState(currIsOn ? "ON" : "OFF");
                  ignitionReport.setStartDateTime(prev.getDateTime());
                  ignitionReport.setEndDateTime(curr.getDateTime());
                  ignitionReport.setStartUtcDateTime(prev.getUtcDateTime());
                  ignitionReport.setEndUtcDateTime(curr.getUtcDateTime());
                  ignitionReport.setDurationMillis(curr.getUtcDateTime() - prev.getUtcDateTime());
                  ignitionReport.setStartAddress(prev.getPlaceAddress());
                  ignitionReport.setEndAddress(curr.getPlaceAddress());
                  ignitionReport.setStartRPM(prev.getRPM());
                  ignitionReport.setEndRPM(curr.getRPM());
                  ignitionReport.setStartLattitude(prev.getLattitude());
                  ignitionReport.setEndLattitude(curr.getLattitude());
                  ignitionReport.setStartLongitude(prev.getLongitude());
                  ignitionReport.setEndLongitude(curr.getLongitude());
                  ignitionReport.setStartSpeed(prev.getSpeed());
                  ignitionReport.setEndSpeed(curr.getSpeed());
                  ignitionReport.setStartCoolantTemp(prev.getCoolantTemp());
                  ignitionReport.setEndCoolantTemp(curr.getCoolantTemp());
                  ignitionReport.setStartFuelTankTemp(prev.getFuelTankTemp());
                  ignitionReport.setEndFuelTankTemp(curr.getFuelTankTemp());
                  ignitionReport.setStartOilTemp(prev.getOilTemp());
                  ignitionReport.setEndOilTemp(curr.getOilTemp());
                  ignitionReport.setStartEngineHours(prev.getEngineHours());
                  ignitionReport.setEndEngineHours(curr.getEngineHours());
                  ignitionReport.setStartOdometer(prev.getOdometer());
                  ignitionReport.setEndOdometer(curr.getOdometer());
                  ignitionReport.setStartStateId(prev.getStateId());
                  ignitionReport.setEndStateId(curr.getStateId());
                  ignitionReport.setStartGeoStateId(prev.getGeoStateId());
                  ignitionReport.setEndGeoStateId(curr.getGeoStateId());
                  this.ignitionReportRepo.save(ignitionReport);
                  prevIsOn = currIsOn;
                  prev = curr;
               }
            }

            this.SaveLog(sDebug);
         } catch (Exception var9) {
            var9.printStackTrace();
         }
      }
   }

   public List<ELDLogData> lookupELDLogDataHistoryOperation(long from, long to) {
      MatchOperation filter = Aggregation.match(Criteria.where("utcDateTime").gte(from).lte(to));
      ProjectionOperation projectStage = Aggregation.project(
            new String[]{
               "CoolantTemp",
               "MAC",
               "AmbTemp",
               "DateTime",
               "lDateTime",
               "FuelEconomy",
               "FuelRate",
               "FuelTankTemp",
               "IdleHours",
               "Lattitude",
               "Longitude",
               "Model",
               "Odometer",
               "SatStatus",
               "SerialNo",
               "Speed",
               "TotalFuelIdle",
               "TotalFuelUsed",
               "VIN",
               "Version",
               "receive_time",
               "PlaceAddress",
               "EngineHours",
               "DriverId",
               "VehicleId",
               "clientId",
               "utcDateTime",
               "OilTemp",
               "RPM",
               "stateId",
               "geoStateId"
            }
         )
         .andExclude(new String[]{"_id"});
      Aggregation aggregation = Aggregation.newAggregation(
         new AggregationOperation[]{
            filter, projectStage, Aggregation.sort(Direction.ASC, new String[]{"VehicleId"}).and(Direction.ASC, new String[]{"utcDateTime"})
         }
      );
      return this.mongoTemplate.aggregate(aggregation, "eld_log_data", ELDLogData.class).getMappedResults();
   }

   private static double CalculateDistance(double lat1, double lon1, double lat2, double lon2) {
      boolean calculate = true;
      if (lat1 == lat2 && lon1 == lon2) {
         calculate = false;
      }

      if (lat1 <= 0.0 || lat2 <= 0.0 || lon1 <= 0.0 || lon2 <= 0.0) {
         calculate = false;
      }

      double dist;
      if (lat1 > 0.0 && calculate) {
         double theta = lon1 - lon2;
         dist = Math.sin(deg2rad(lat1)) * Math.sin(deg2rad(lat2)) + Math.cos(deg2rad(lat1)) * Math.cos(deg2rad(lat2)) * Math.cos(deg2rad(theta));
         dist = Math.acos(dist);
         dist = rad2deg(dist);
         dist *= 111.13384;
         dist = (double)Math.round(dist * 10000.0) / 10000.0;
      } else {
         dist = 0.0;
      }

      if (dist > 1.0) {
         dist = 0.0;
      }

      return dist;
   }

   private static double deg2rad(double deg) {
      return deg * Math.PI / 180.0;
   }

   private static double rad2deg(double rad) {
      return rad * 180.0 / Math.PI;
   }

   public List<LiveDataLogViewDto> lookupELDLogHistoryOperation(long from, long to) {
      MatchOperation filter = Aggregation.match(Criteria.where("utcDateTime").gte(from).lte(to));
      ProjectionOperation projectStage = Aggregation.project(
            new String[]{
               "MAC",
               "AmbTemp",
               "DateTime",
               "FuelEconomy",
               "FuelRate",
               "IdleHours",
               "Lattitude",
               "Longitude",
               "Model",
               "Odometer",
               "SatStatus",
               "SerialNo",
               "Speed",
               "TotalFuelIdle",
               "TotalFuelUsed",
               "VIN",
               "Version",
               "receive_time",
               "PlaceAddress",
               "DriverId",
               "VehicleId",
               "utcDateTime"
            }
         )
         .andExclude(new String[]{"_id"});
      Aggregation aggregation = Aggregation.newAggregation(
         new AggregationOperation[]{filter, projectStage, Aggregation.sort(Direction.DESC, new String[]{"VehicleId"})}
      );
      return this.mongoTemplate.aggregate(aggregation, "eld_log_data", LiveDataLogViewDto.class).getMappedResults();
   }

   @Override
   public ResultWrapper<String> ImportAndReadJsonFile(List<MultipartFile> file) {
      ResultWrapper<String> result = new ResultWrapper<>();

      try {
         Instant instant = Instant.now();
         this.fileStorageLocation = Paths.get("/opt/tomcat/webapps/uploads/json_file").toAbsolutePath().normalize();

         try {
            if (Files.notExists(this.fileStorageLocation)) {
               Files.createDirectories(this.fileStorageLocation);
            }
         } catch (Exception var27) {
            throw new Exception("Could not create the directory where the uploaded files will be stored.", var27);
         }

         int iCount = 0;
         String originalFileName = "";

         for(MultipartFile mf : file) {
            originalFileName = StringUtils.cleanPath(mf.getOriginalFilename());
            ++iCount;

            try {
               if (originalFileName.contains("..")) {
                  throw new Exception("Sorry! Filename contains invalid path sequence " + originalFileName);
               }

               if (iCount == 1 && !mf.getOriginalFilename().isEmpty() && !mf.getOriginalFilename().equals("")) {
                  Path targetLocation = this.fileStorageLocation.resolve(originalFileName);
                  Files.copy(mf.getInputStream(), targetLocation, StandardCopyOption.REPLACE_EXISTING);
                  Files.setPosixFilePermissions(targetLocation, PosixFilePermissions.fromString("rwxrwxrwx"));
               }
            } catch (IOException var25) {
               throw new Exception("Could not store file " + originalFileName + ". Please try again!", var25);
            }
         }

         String url = "/opt/tomcat/webapps/uploads/json_file/" + originalFileName;
         System.out.println(url);
         String geofanceId = "";
         String stateName = "";
         String type = "";
         long stateId = 0L;
         new HashMap();
         new GeofanceMaster();

         try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader(url));
            JSONObject jo = (JSONObject)obj;

            for(Object o : (JSONArray)jo.get("features")) {
               GeofanceMaster geofances = new GeofanceMaster();
               jo = (JSONObject)o;
               JSONObject jo1 = (JSONObject)jo.get("properties");
               geofanceId = jo1.get("GEO_ID").toString();
               stateId = Long.parseLong(jo1.get("STATE").toString());
               stateName = jo1.get("NAME").toString();
               JSONObject jo2 = (JSONObject)jo.get("geometry");
               type = jo2.get("type").toString();
               HashMap<String, Object> lalLngMap = new HashMap();
               lalLngMap.put("type", type);
               lalLngMap.put("coordinates", jo2.get("coordinates"));
               Object maxID = this.geofanceMasterRepo.findMaxIdInGeofances();
               Integer ID = 0;
               if (maxID == null) {
                  ID = 1;
                  geofances.setGeoId(ID);
               } else {
                  ID = (Integer)maxID;
                  ID = ID + 1;
                  geofances.setGeoId(ID);
               }

               geofances.setAddedTimestamp(instant.toEpochMilli());
               geofances.setUpdatedTimestamp(instant.toEpochMilli());
               geofances.setGeofanceId(geofanceId);
               geofances.setStateId(stateId);
               geofances.setStateName(stateName);
               geofances.setType(type);
               geofances.setLatLng(lalLngMap);
               this.geofanceMasterRepo.save(geofances);
            }
         } catch (Exception var26) {
            var26.printStackTrace();
         }

         result.setResult("Import");
         result.setStatus(Result.SUCCESS);
         result.setMessage("File Imported Successfully");
      } catch (Exception var28) {
         result.setStatus(Result.FAIL);
         result.setMessage(var28.getLocalizedMessage());
      }

      return result;
   }
}
