package com.mes.eld_log.serviceImpl;

import com.mes.eld_log.dtos.CertifiedLogViewDto;
import com.mes.eld_log.dtos.CycleTimeRulesViewDto;
import com.mes.eld_log.dtos.DVIRDataCRUDDto;
import com.mes.eld_log.dtos.DriveringStatusLogViewDto;
import com.mes.eld_log.dtos.DriveringStatusViewDto;
import com.mes.eld_log.dtos.EmployeeMasterCRUDDto;
import com.mes.eld_log.dtos.LoginLogViewDto;
import com.mes.eld_log.dtos.LoginUpdateDto;
import com.mes.eld_log.dtos.MaxIdViewDto;
import com.mes.eld_log.dtos.UserLoginDto;
import com.mes.eld_log.dtos.UserMasterViewDto;
import com.mes.eld_log.models.ClientMaster;
import com.mes.eld_log.models.CountryMaster;
import com.mes.eld_log.models.CycleUsa;
import com.mes.eld_log.models.DriverStatusLog;
import com.mes.eld_log.models.ELDSettings;
import com.mes.eld_log.models.EmployeeMaster;
import com.mes.eld_log.models.Login;
import com.mes.eld_log.models.LoginLog;
import com.mes.eld_log.models.MACAddressMaster;
import com.mes.eld_log.models.MainTerminalMaster;
import com.mes.eld_log.models.SplitLog;
import com.mes.eld_log.models.StateMaster;
import com.mes.eld_log.models.UserMaster;
import com.mes.eld_log.models.VehicleMaster;
import com.mes.eld_log.repo.CityMasterRepo;
import com.mes.eld_log.repo.ClientMasterRepo;
import com.mes.eld_log.repo.CountryMasterRepo;
import com.mes.eld_log.repo.CycleUsaRepo;
import com.mes.eld_log.repo.DriverStatusLogRepo;
import com.mes.eld_log.repo.ELDSettingsRepo;
import com.mes.eld_log.repo.EmployeeMasterRepo;
import com.mes.eld_log.repo.LoginLogRepo;
import com.mes.eld_log.repo.LoginRepo;
import com.mes.eld_log.repo.MACAddressMasterRepo;
import com.mes.eld_log.repo.MainTerminalMasterRepo;
import com.mes.eld_log.repo.SplitLogRepo;
import com.mes.eld_log.repo.StateMasterRepo;
import com.mes.eld_log.repo.UserMasterRepo;
import com.mes.eld_log.repo.VehicleMasterRepo;
import com.mes.eld_log.results.Result;
import com.mes.eld_log.results.ResultWrapper;
import com.mes.eld_log.service.UserInfoService;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
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
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service("userInfoService")
public class UserInfoServiceImpl implements UserDetailsService, UserInfoService {
   private MongoTemplate mongoTemplate;
   @Autowired
   private EmployeeMasterRepo employeeMasterRepo;
   @Autowired
   SplitLogRepo splitLogRepo;
   @Autowired
   ELDSettingsRepo eldSettingsRepo;
   @Autowired
   private DriverStatusLogRepo driverStatusLogRepo;
   @Autowired
   CycleUsaRepo cycleUsaRepo;
   @Autowired
   private CountryMasterRepo countryMasterRepo;
   @Autowired
   private StateMasterRepo stateMasterRepo;
   @Autowired
   private CityMasterRepo cityMasterRepo;
   @Autowired
   MainTerminalMasterRepo mainTerminalMasterRepo;
   @Autowired
   VehicleMasterRepo vehicleMasterRepo;
   @Autowired
   private UserMasterRepo userMasterRepo;
   @Autowired
   MACAddressMasterRepo macAddressMasterRepo;
   @Autowired
   private ClientMasterRepo clientMasterRepo;
   @Autowired
   LoginRepo loginRepo;
   @Autowired
   LoginLogRepo loginLogRepo;
   @Autowired
   private JavaMailSender javaMailSender;

   @Autowired
   public UserInfoServiceImpl(MongoTemplate mongoTemplate) {
      this.mongoTemplate = mongoTemplate;
   }

   @Override
   public ResultWrapper<EmployeeMasterCRUDDto> Login(UserLoginDto userLoginDto, String token) {
      String sDebug = "";
      ResultWrapper<EmployeeMasterCRUDDto> result = new ResultWrapper<>();

      try {
         List<DriveringStatusViewDto> driveringStatusViewDto = new ArrayList<>();
         String timezoneName = "";
         String timezoneOffSet = "";
         String subscriptionExpire = "";
         EmployeeMasterCRUDDto empInfo = null;
         MainTerminalMaster mainTerminal = null;
         String username = userLoginDto.getUsername();
         String password = userLoginDto.getPassword();
         sDebug = sDebug + " CRED : " + username + " :: " + password + ",";
         List<Login> login = this.loginRepo.ValidateAndLogin(username, password);
         Instant instant = Instant.now();
         String status = "";
         String email = "";
         if (login.size() > 0) {
            email = login.get(0).getEmail();
            UserLoginDto loginData = this.loginRepo.GetLoginDataByEmail(email);
            empInfo = this.employeeMasterRepo.findEmployeeByEmail1(email);
            if (empInfo.getClientId() > 0L) {
               ClientMaster clientMaster = this.clientMasterRepo.findByClientId((int)empInfo.getClientId());
               status = clientMaster.getStatus();
               long graceTime = clientMaster.getGraceTime();
               StateMaster stateInfo = this.stateMasterRepo.findByStateId((int)clientMaster.getTimezoneId());
               timezoneOffSet = stateInfo.getTimezoneOffSet();
               timezoneOffSet = timezoneOffSet.trim().replace("−", "-").replace("＋", "+");
               String[] splitStr = timezoneOffSet.split(":");
               long hour = Math.abs(Long.parseLong(splitStr[0]));
               long minutes = Math.abs(Long.parseLong(splitStr[1]));
               int totalMinutes = (int)(hour * 60L + minutes);
               Clock cl = Clock.systemUTC();
               Clock adjustedClock;
               if (timezoneOffSet.startsWith("-")) {
                  adjustedClock = Clock.offset(cl, Duration.ofMinutes((long)(-totalMinutes)));
               } else {
                  adjustedClock = Clock.offset(cl, Duration.ofMinutes((long)totalMinutes));
               }

               LocalDate lt = LocalDate.now(adjustedClock);
               LocalDateTime endOfDay = lt.atTime(LocalTime.MAX);
               long endOfDayEpoch = endOfDay.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
               long timestampValue = 0L;
               if (timezoneOffSet.substring(0, 1).equals("-")) {
                  timestampValue = instant.toEpochMilli() - (hour * 60L + minutes) * 60000L;
               } else {
                  timestampValue = instant.toEpochMilli() + (hour * 60L + minutes) * 60000L;
               }

               if (timestampValue > graceTime) {
                  subscriptionExpire = "true";
               } else {
                  subscriptionExpire = "false";
               }
            }

            if (subscriptionExpire.equals("false")) {
               if (empInfo.getStatus().equals("active") && status.equals("true")) {
                  if (userLoginDto.getIsCoDriver() != null && !userLoginDto.getIsCoDriver().equals("")) {
                     Query query = new Query();
                     query.addCriteria(Criteria.where("employeeId").is(login.get(0).getEmployeeId()));
                     Update update = new Update();
                     update.set("isCoDriver", userLoginDto.getIsCoDriver());
                     update.set("tokenNo", token);
                     update.set("loginDateTime", instant.toEpochMilli());
                     this.mongoTemplate.findAndModify(query, update, Login.class);
                  } else {
                     Query query = new Query();
                     query.addCriteria(Criteria.where("employeeId").is(login.get(0).getEmployeeId()));
                     Update update = new Update();
                     update.set("isCoDriver", "false");
                     update.set("tokenNo", token);
                     update.set("loginDateTime", instant.toEpochMilli());
                     this.mongoTemplate.findAndModify(query, update, Login.class);
                  }

                  List<ELDSettings> settings = this.eldSettingsRepo.findAndViewBySettingId(1);
                  if (settings.size() > 0) {
                     empInfo.setAndroidVersion(settings.get(0).getAndroidVersion());
                     empInfo.setAndroidCode(settings.get(0).getAndroidCode());
                     empInfo.setIosVersion(settings.get(0).getIosVersion());
                     empInfo.setIosCode(settings.get(0).getIosCode());
                     empInfo.setTermsAndCondition(settings.get(0).getTermsAndCondition());
                  } else {
                     empInfo.setAndroidVersion("");
                     empInfo.setAndroidCode("");
                     empInfo.setIosVersion("");
                     empInfo.setIosCode("");
                     empInfo.setTermsAndCondition("");
                  }

                  EmployeeMaster empDetailData = this.employeeMasterRepo.findByEmployeeId(login.get(0).getEmployeeId());
                  empInfo.setExempt(empDetailData.getExempt());
                  empInfo.setPersonalUse(empDetailData.getPersonalUse());
                  empInfo.setYardMoves(empDetailData.getYardMoves());
                  empInfo.setShortHaulException(empDetailData.getShortHaulException());
                  empInfo.setUnlimitedTrailers(empDetailData.getUnlimitedTrailers());
                  empInfo.setUnlimitedShippingDocs(empDetailData.getUnlimitedShippingDocs());
                  CycleUsa cycleUsaData = this.cycleUsaRepo.findByCycleUsaId((int)empDetailData.getCycleUsaId());
                  empInfo.setOnDutyTime(cycleUsaData.getOnDutyTime());
                  empInfo.setOnDriveTime(cycleUsaData.getOnDriveTime());
                  empInfo.setOnSleepTime(cycleUsaData.getOnSleepTime());
                  empInfo.setContinueDriveTime(cycleUsaData.getContinueDriveTime());
                  empInfo.setBreakTime(cycleUsaData.getBreakTime());
                  empInfo.setCycleRestartTime(cycleUsaData.getCycleRestartTime());
                  loginData = this.loginRepo.GetLoginDataByEmail(email);
                  sDebug = sDebug + " >> ";

                  try {
                     MACAddressMaster macAddressData = this.macAddressMasterRepo.findByMACAddressMasterId((long)login.get(0).getEmployeeId().intValue());
                     sDebug = sDebug + "1,";
                     empInfo.setMacAddress(macAddressData.getMacAddress());
                     empInfo.setVehicleId(macAddressData.getVehicleId());
                     VehicleMaster vehcileInfo = this.vehicleMasterRepo.findByVehicleId((int)macAddressData.getVehicleId());
                     sDebug = sDebug + "2,";
                     empInfo.setVehicleNo(vehcileInfo.getVehicleNo());
                  } catch (Exception var58) {
                     var58.printStackTrace();
                     empInfo.setMacAddress("");
                     empInfo.setVehicleId(0L);
                     empInfo.setVehicleNo("None");
                  }

                  try {
                     if (empInfo.getClientId() > 0L) {
                        sDebug = sDebug + "3,";
                        ClientMaster client = this.clientMasterRepo.findByClientId((int)empInfo.getClientId());
                        empInfo.setClientName(client.getClientName());
                        sDebug = sDebug + "4,";
                        mainTerminal = this.mainTerminalMasterRepo.findByMainTerminalId((int)empInfo.getMainTerminalId());
                        if (mainTerminal.getStateId() != 0L) {
                           sDebug = sDebug + "5,";
                           StateMaster states = this.stateMasterRepo.findByStateId((int)mainTerminal.getStateId());
                           sDebug = sDebug + "6,";
                           empInfo.setTimezone(states.getTimeZone());
                           empInfo.setTimezoneOffSet(states.getTimezoneOffSet());
                        } else {
                           empInfo.setTimezone("");
                           empInfo.setTimezoneOffSet("");
                        }
                     } else {
                        empInfo.setClientName("");
                        empInfo.setTimezone("");
                        empInfo.setTimezoneOffSet("");
                     }
                  } catch (Exception var57) {
                     var57.printStackTrace();
                  }

                  sDebug = sDebug + "7,";
                  LoginLog loginLog = new LoginLog();
                  loginLog.setEmployeeId(login.get(0).getEmployeeId());
                  loginLog.setLoginDateTime(loginData.getLoginDateTime());
                  loginLog.setLogoutDateTime(0L);
                  loginLog.setIsCoDriver(loginData.getIsCoDriver());
                  loginLog.setReceivedTimestamp(instant.toEpochMilli());
                  loginLog.setLoginType("app");
                  this.loginLogRepo.save(loginLog);
                  DriverStatusLog driverStatusLog = new DriverStatusLog();
                  long maxId = this.lookupMaxIdOfDriverOperation((long)login.get(0).getEmployeeId().intValue());
                  if (maxId <= 0L) {
                     maxId = 1L;
                     driverStatusLog.setStatusId(maxId);
                  } else {
                     driverStatusLog.setStatusId(++maxId);
                  }

                  Pageable pageableRequest = PageRequest.of(0, 1, Sort.by(new String[]{"_id"}).descending());
                  Query query = new Query(Criteria.where("employeeId").is(login.get(0).getEmployeeId()));
                  query.limit(1);
                  query.with(pageableRequest);
                  List<LoginLogViewDto> loginLogViewDto = this.mongoTemplate.find(query, LoginLogViewDto.class, "login_log");
                  driverStatusLog.setLogDataId(loginLogViewDto.get(0).get_id());
                  driverStatusLog.setDriverId((long)login.get(0).getEmployeeId().intValue());
                  driverStatusLog.setVehicleId(0L);
                  driverStatusLog.setClientId(empInfo.getClientId());
                  driverStatusLog.setStatus("Login");
                  driverStatusLog.setLattitude(0.0);
                  driverStatusLog.setLongitude(0.0);
                  driverStatusLog.setDateTime(loginLogViewDto.get(0).getLoginDateTime());
                  driverStatusLog.setLogType("Login");
                  driverStatusLog.setEngineHour("0");
                  driverStatusLog.setOrigin("");
                  driverStatusLog.setOdometer(0.0);
                  driverStatusLog.setIsVoilation(0);
                  driverStatusLog.setNote("");
                  driverStatusLog.setCustomLocation("");
                  driverStatusLog.setIsReportGenerated(1);
                  driverStatusLog.setReceivedTimestamp(instant.toEpochMilli());
                  driverStatusLog.setIsVisible(1);
                  empInfo.setLoginDateTime(loginData.getLoginDateTime());
                  LocalDate periviousDate = LocalDate.now();
                  periviousDate = periviousDate.minusDays(14L);
                  String fromDate = periviousDate.toString() + " 00:00:00";
                  String toDate = LocalDate.now().toString() + " 23:59:59";
                  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                  LocalDateTime ldtFromDate = LocalDateTime.parse(fromDate, formatter);
                  long from = ldtFromDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
                  LocalDateTime ldtToDate = LocalDateTime.parse(toDate, formatter);
                  long to = ldtToDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
                  String driverName = "";
                  String url = "http://admin.gbt-usa.com/uploads/certified_signature/";
                  List<DriveringStatusViewDto> driveringStatusViewDtoData = this.lookupDriverStatusDataOperation(
                     from, to, (long)login.get(0).getEmployeeId().intValue()
                  );

                  for(int i = 0; i < driveringStatusViewDtoData.size(); ++i) {
                     driveringStatusViewDto.add(driveringStatusViewDtoData.get(i));
                  }

                  for(int i = 0; i < driveringStatusViewDto.size(); ++i) {
                     driveringStatusViewDto.get(i).setFromDate(from);
                     driveringStatusViewDto.get(i).setToDate(to);
                     driveringStatusViewDto.get(i).setLastOnSleepTime(String.valueOf(cycleUsaData.getOnSleepTime() * 60L * 60L));

                     try {
                        if (driveringStatusViewDto.get(i).getLogType().equals("System Generated")) {
                           driveringStatusViewDto.get(i).setIsSystemGenerated(1);
                        }

                        EmployeeMaster empDetails = this.employeeMasterRepo.findByEmployeeId((int)driveringStatusViewDto.get(i).getDriverId());
                        driverName = empDetails.getFirstName() + " " + empDetails.getLastName();
                        driveringStatusViewDto.get(i).setDriverName(driverName);
                        driveringStatusViewDto.get(i).setMobileNo(empDetails.getMobileNo());
                        driveringStatusViewDto.get(i).setEmail(empDetails.getEmail());
                        driveringStatusViewDto.get(i).setCompanyDriverId(empDetails.getUsername());
                        driveringStatusViewDto.get(i).setCdlNo(empDetails.getCdlNo());
                        CountryMaster countryInfo = this.countryMasterRepo.findByCountryId((int)empDetails.getCdlCountryId());
                        driveringStatusViewDto.get(i).setCountryName(countryInfo.getCountryName());
                        StateMaster stateInfo = this.stateMasterRepo.findByStateId((int)empDetails.getCdlStateId());
                        driveringStatusViewDto.get(i).setStateName(stateInfo.getStateName());
                        driveringStatusViewDto.get(i).setExempt(empDetails.getExempt());
                        VehicleMaster vehcileInfo = null;
                        if (driveringStatusViewDto.get(i).getVehicleId() > 0L) {
                           vehcileInfo = this.vehicleMasterRepo.findByVehicleId((int)driveringStatusViewDto.get(i).getVehicleId());
                           driveringStatusViewDto.get(i).setTruckNo(vehcileInfo.getVehicleNo());
                           driveringStatusViewDto.get(i).setVin(vehcileInfo.getVin());
                        } else {
                           driveringStatusViewDto.get(i).setTruckNo("");
                           driveringStatusViewDto.get(i).setVin("");
                        }

                        mainTerminal = this.mainTerminalMasterRepo.findByMainTerminalId((int)empDetails.getMainTerminalId());
                        driveringStatusViewDto.get(i).setMainTerminalName(mainTerminal.getMainTerminalName());
                        if (mainTerminal.getStateId() > 0L) {
                           stateInfo = this.stateMasterRepo.findByStateId((int)mainTerminal.getStateId());
                           timezoneName = stateInfo.getTimeZone();
                           timezoneOffSet = stateInfo.getTimezoneOffSet();
                        }

                        CycleUsa cycleUsa = this.cycleUsaRepo.findByCycleUsaId((int)empDetails.getCycleUsaId());
                        driveringStatusViewDto.get(i).setCycleUsaName(cycleUsa.getCycleUsaName());
                        if (empDetails.getClientId() > 0L) {
                           ClientMaster clientInfo = this.clientMasterRepo.findByClientId((int)empDetails.getClientId());
                           driveringStatusViewDto.get(i).setCompanyName(clientInfo.getClientName());
                           driveringStatusViewDto.get(i).setDotNo(clientInfo.getDotNo());
                        }

                        List<CertifiedLogViewDto> certifiedLogViewDto = this.lookupCertifiedLogDataOperation(
                           from, to, driveringStatusViewDto.get(i).getDriverId()
                        );
                        if (certifiedLogViewDto.size() > 0) {
                           for(int c = 0; c < certifiedLogViewDto.size(); ++c) {
                              if (certifiedLogViewDto.get(c).getCoDriverId() > 0L) {
                                 empDetails = this.employeeMasterRepo.findByEmployeeId((int)certifiedLogViewDto.get(c).getCoDriverId());
                                 driveringStatusViewDto.get(i).setCompanyCoDriverId(empDetails.getUsername());
                                 driverName = empDetails.getFirstName() + " " + empDetails.getLastName();
                              }

                              driveringStatusViewDto.get(i).setCoDriverName(driverName);
                              driveringStatusViewDto.get(i).setTrailers(certifiedLogViewDto.get(c).getTrailers());
                              driveringStatusViewDto.get(i).setShippingDocs(certifiedLogViewDto.get(c).getShippingDocs());
                              String setImagePath1 = url.concat(certifiedLogViewDto.get(i).getCertifiedSignature());
                              driveringStatusViewDto.get(i).setCertifiedSignature(setImagePath1);
                              vehcileInfo = this.vehicleMasterRepo.findByVehicleId((int)certifiedLogViewDto.get(c).getVehicleId());
                              driveringStatusViewDto.get(i).setTruckNo(vehcileInfo.getVehicleNo());
                              driveringStatusViewDto.get(i).setVin(vehcileInfo.getVin());
                           }
                        } else {
                           driveringStatusViewDto.get(i).setTrailers(new ArrayList());
                           driveringStatusViewDto.get(i).setShippingDocs(new ArrayList());
                        }
                     } catch (Exception var61) {
                        var61.printStackTrace();
                     }
                  }

                  List<DVIRDataCRUDDto> dvirDataViewDto = this.lookupDVIRDataOperation(from, to, (long)login.get(0).getEmployeeId().intValue());

                  try {
                     for(int i = 0; i < dvirDataViewDto.size(); ++i) {
                        String setImagePath1 = url.concat(dvirDataViewDto.get(i).getDriverSignFile());
                        dvirDataViewDto.get(i).setDriverSignFile(setImagePath1);
                        EmployeeMaster empDetails = this.employeeMasterRepo.findByEmployeeId(login.get(0).getEmployeeId());
                        driverName = empDetails.getFirstName() + " " + empDetails.getLastName();
                        dvirDataViewDto.get(i).setDriverName(driverName);

                        try {
                           if (dvirDataViewDto.get(i).getVehicleId() > 0L) {
                              VehicleMaster vehcileInfo = this.vehicleMasterRepo.findByVehicleId((int)dvirDataViewDto.get(i).getVehicleId());
                              dvirDataViewDto.get(i).setVehicleNo(vehcileInfo.getVehicleNo());
                           }
                        } catch (Exception var56) {
                           var56.printStackTrace();
                        }
                     }
                  } catch (Exception var60) {
                     var60.printStackTrace();
                  }

                  List<CertifiedLogViewDto> certifiedLogViewDto = this.lookupCertifiedLogDataOperation(from, to, (long)login.get(0).getEmployeeId().intValue());

                  try {
                     for(int i = 0; i < certifiedLogViewDto.size(); ++i) {
                        String setImagePath1 = url.concat(certifiedLogViewDto.get(i).getCertifiedSignature());
                        certifiedLogViewDto.get(i).setCertifiedSignature(setImagePath1);
                        EmployeeMaster empDetails = this.employeeMasterRepo.findByEmployeeId(login.get(0).getEmployeeId());
                        driverName = empDetails.getFirstName() + " " + empDetails.getLastName();
                        certifiedLogViewDto.get(i).setDriverName(driverName);
                        if (certifiedLogViewDto.get(i).getCoDriverId() > 0L) {
                           empDetails = this.employeeMasterRepo.findByEmployeeId((int)certifiedLogViewDto.get(i).getCoDriverId());
                           driverName = empDetails.getFirstName() + " " + empDetails.getLastName();
                           certifiedLogViewDto.get(i).setCoDriverName(driverName);
                        }

                        if (certifiedLogViewDto.get(i).getVehicleId() > 0L) {
                           VehicleMaster vehcileInfo = this.vehicleMasterRepo.findByVehicleId((int)certifiedLogViewDto.get(i).getVehicleId());
                           certifiedLogViewDto.get(i).setVehicleName(vehcileInfo.getVehicleNo());
                        }
                     }
                  } catch (Exception var59) {
                     var59.printStackTrace();
                  }

                  List<DriveringStatusLogViewDto> loginLogoutLogViewDto = new ArrayList<>();
                  new DriveringStatusLogViewDto();
                  List<LoginLog> loginLogData = this.lookupLoginLogDataOperation(from, to, (long)login.get(0).getEmployeeId().intValue());
                  String employeeStatus = "";

                  for(int i = 0; i < loginLogData.size(); ++i) {
                     try {
                        EmployeeMaster empDetails = this.employeeMasterRepo.findByEmployeeId(loginLogData.get(i).getEmployeeId());
                        driverName = empDetails.getFirstName() + " " + empDetails.getLastName();
                        employeeStatus = empInfo.getStatus();
                        if (loginLogData.get(i).getLoginDateTime() > 0L) {
                           DriveringStatusLogViewDto var119 = new DriveringStatusLogViewDto();
                           var119.setDriverId((long)loginLogData.get(i).getEmployeeId().intValue());
                           var119.setDriverName(driverName);
                           var119.setLattitude(0.0);
                           var119.setLongitude(0.0);
                           var119.setCustomLocation("");
                           var119.setOrigin("");
                           var119.setOdometer(0.0);
                           var119.setEngineHour("0");
                           var119.setNote("");
                           var119.setIsVoilation(0L);
                           var119.setLogType("Login");
                           var119.setStatusId(0L);
                           var119.setDateTime(String.valueOf(loginLogData.get(i).getLoginDateTime()));
                           var119.setStatus("Login");
                           var119.setEmployeeStatus(employeeStatus);
                           loginLogoutLogViewDto.add(var119);
                        }

                        if (loginLogData.get(i).getLogoutDateTime() > 0L) {
                           DriveringStatusLogViewDto var120 = new DriveringStatusLogViewDto();
                           var120.setDriverId((long)loginLogData.get(i).getEmployeeId().intValue());
                           var120.setDriverName(driverName);
                           var120.setLattitude(0.0);
                           var120.setLongitude(0.0);
                           var120.setCustomLocation("");
                           var120.setOrigin("");
                           var120.setOdometer(0.0);
                           var120.setEngineHour("0");
                           var120.setNote("");
                           var120.setIsVoilation(0L);
                           var120.setLogType("Logout");
                           var120.setStatusId(0L);
                           var120.setDateTime(String.valueOf(loginLogData.get(i).getLogoutDateTime()));
                           var120.setStatus("Logout");
                           var120.setEmployeeStatus(employeeStatus);
                           loginLogoutLogViewDto.add(var120);
                        }
                     } catch (Exception var55) {
                        var55.printStackTrace();
                     }
                  }

                  List<SplitLog> splitLogData = this.splitLogRepo.findSplitLogByDriverId((long)login.get(0).getEmployeeId().intValue());
                  empDetailData = this.employeeMasterRepo.findByEmployeeId(login.get(0).getEmployeeId());
                  cycleUsaData = this.cycleUsaRepo.findByCycleUsaId((int)empDetailData.getCycleUsaId());
                  List<CycleTimeRulesViewDto> cycleTimeRulesViewDto = new ArrayList<>();
                  CycleTimeRulesViewDto cycleTimeRules = new CycleTimeRulesViewDto();
                  long hourToSec = 3600L;
                  long minToSec = 60L;
                  cycleTimeRules.setCycleTime(cycleUsaData.getCycleHour() * hourToSec);
                  cycleTimeRules.setCycleDays(cycleUsaData.getCycleDays());
                  cycleTimeRules.setOnDutyTime(cycleUsaData.getOnDutyTime() * hourToSec);
                  cycleTimeRules.setOnDriveTime(cycleUsaData.getOnDriveTime() * hourToSec);
                  cycleTimeRules.setOnSleepTime(cycleUsaData.getOnSleepTime() * hourToSec);
                  cycleTimeRules.setContinueDriveTime(cycleUsaData.getContinueDriveTime() * hourToSec);
                  cycleTimeRules.setBreakTime(cycleUsaData.getBreakTime() * minToSec);
                  cycleTimeRules.setCycleRestartTime(cycleUsaData.getCycleRestartTime() * hourToSec);
                  cycleTimeRules.setWarningOnDutyTime1(cycleUsaData.getOnDutyTime() * hourToSec - cycleUsaData.getWarningTime1() * minToSec);
                  cycleTimeRules.setWarningOnDutyTime2(cycleUsaData.getOnDutyTime() * hourToSec - cycleUsaData.getWarningTime2() * minToSec);
                  cycleTimeRules.setWarningOnDriveTime1(cycleUsaData.getOnDriveTime() * hourToSec - cycleUsaData.getWarningTime1() * minToSec);
                  cycleTimeRules.setWarningOnDriveTime2(cycleUsaData.getOnDriveTime() * hourToSec - cycleUsaData.getWarningTime2() * minToSec);
                  cycleTimeRules.setWarningBreakTime1(cycleUsaData.getContinueDriveTime() * hourToSec - cycleUsaData.getWarningTime1() * minToSec);
                  cycleTimeRules.setWarningBreakTime2(cycleUsaData.getContinueDriveTime() * hourToSec - cycleUsaData.getWarningTime2() * minToSec);
                  cycleTimeRules.setCycleWarningTime1(cycleUsaData.getCycleHour() * hourToSec - cycleUsaData.getCycleWarningTime1() * minToSec);
                  cycleTimeRules.setCycleWarningTime2(cycleUsaData.getCycleHour() * hourToSec - cycleUsaData.getCycleWarningTime2() * minToSec);
                  cycleTimeRulesViewDto.add(cycleTimeRules);
                  cycleTimeRulesViewDto.add(cycleTimeRules);
                  empInfo.setRules(cycleTimeRulesViewDto);
                  empInfo.setDriverLog(driveringStatusViewDto);
                  empInfo.setDriverDvirLog(dvirDataViewDto);
                  empInfo.setDriverCertifiedLog(certifiedLogViewDto);
                  empInfo.setLoginLogoutLog(loginLogoutLogViewDto);
                  empInfo.setSplitLog(splitLogData);
                  result.setResult(empInfo);
                  result.setToken(token);
                  result.setStatus(Result.SUCCESS);
                  result.setMessage("Logged In Successfully" + sDebug);
               } else {
                  result.setResult(null);
                  result.setToken(null);
                  result.setStatus(Result.FAIL);
                  result.setMessage("Your account has been deactivated, please contact to admin.");
               }
            } else {
               result.setResult(null);
               result.setToken(null);
               result.setStatus(Result.FAIL);
               result.setMessage("You are not authorized for login.");
            }
         } else {
            result.setResult(null);
            result.setToken(null);
            result.setStatus(Result.FAIL);
            result.setMessage("Invalid username or password");
         }
      } catch (Exception var62) {
         result.setStatus(Result.FAIL);
         result.setMessage(var62.getLocalizedMessage());
      }

      return result;
   }

   public void UpdateDriverSequenceId(long driverId, long utcDateTime) {
      String sDebug = "SEQ ID : ";

      try {
         long baseStatusId = 0L;
         Query lastLogQuery = new Query(
               Criteria.where("driverId").is(driverId).and("dateTime").lt(utcDateTime).and("isVoilation").is(0).and("isVisible").is(1)
            )
            .with(Sort.by(Direction.DESC, new String[]{"dateTime"}))
            .limit(1);
         List<DriverStatusLog> lastLogList = this.mongoTemplate.find(lastLogQuery, DriverStatusLog.class, "driver_status_log");
         if (!lastLogList.isEmpty()) {
            baseStatusId = lastLogList.get(0).getStatusId();
         }

         sDebug = sDebug + " >> " + baseStatusId + " :: " + utcDateTime + "\n";
         Query logsToUpdateQuery = new Query(
               Criteria.where("driverId").is(driverId).and("dateTime").gte(utcDateTime).and("isVoilation").is(0).and("isVisible").is(1)
            )
            .with(Sort.by(Direction.ASC, new String[]{"dateTime"}));
         List<DriverStatusLog> logsToUpdate = this.mongoTemplate.find(logsToUpdateQuery, DriverStatusLog.class, "driver_status_log");

         for(int i = 0; i < logsToUpdate.size(); ++i) {
            long newStatusId = baseStatusId + (long)i + 1L;
            DriverStatusLog log = logsToUpdate.get(i);
            sDebug = sDebug + "status ID: " + newStatusId + " :: " + log.getStatus() + " :: " + log.getLogDataId() + "\n";
            Query updateQuery = new Query(Criteria.where("logDataId").is(log.getLogDataId()).and("driverId").is(driverId));
            Update update = new Update().set("statusId", newStatusId);
            this.mongoTemplate.updateFirst(updateQuery, update, DriverStatusLog.class);
         }
      } catch (Exception var18) {
         var18.printStackTrace();
      }
   }

   @Override
   public ResultWrapper<EmployeeMasterCRUDDto> LoginDataByEmployeeId(UserLoginDto userLoginDto) {
      String sDebug = "";
      ResultWrapper<EmployeeMasterCRUDDto> result = new ResultWrapper<>();

      try {
         List<DriveringStatusViewDto> driveringStatusViewDto = new ArrayList<>();
         String timezoneName = "";
         String timezoneOffSet = "";
         EmployeeMasterCRUDDto empInfo = null;
         MainTerminalMaster mainTerminal = null;
         Integer employeeId = userLoginDto.getEmployeeId();
         Instant instant = Instant.now();
         empInfo = this.employeeMasterRepo.findEmployeeByEmployeeId1(employeeId);
         EmployeeMaster empDetailData = this.employeeMasterRepo.findByEmployeeId(employeeId);
         CycleUsa cycleUsaData = this.cycleUsaRepo.findByCycleUsaId((int)empDetailData.getCycleUsaId());
         empInfo.setOnDutyTime(cycleUsaData.getOnDutyTime());
         empInfo.setOnDriveTime(cycleUsaData.getOnDriveTime());
         empInfo.setOnSleepTime(cycleUsaData.getOnSleepTime());
         empInfo.setContinueDriveTime(cycleUsaData.getContinueDriveTime());
         empInfo.setBreakTime(cycleUsaData.getBreakTime());
         empInfo.setCycleRestartTime(cycleUsaData.getCycleRestartTime());
         empInfo.setTokenNo(userLoginDto.getTokenNo());
         UserLoginDto loginData = this.loginRepo.GetLoginDataByEmail(empDetailData.getEmail());
         sDebug = sDebug + " >> ";

         try {
            MACAddressMaster macAddressData = this.macAddressMasterRepo.findByMACAddressMasterId((long)employeeId.intValue());
            sDebug = sDebug + "1,";
            empInfo.setMacAddress(macAddressData.getMacAddress());
            empInfo.setVehicleId(macAddressData.getVehicleId());
            VehicleMaster vehcileInfo = this.vehicleMasterRepo.findByVehicleId((int)macAddressData.getVehicleId());
            sDebug = sDebug + "2,";
            empInfo.setVehicleNo(vehcileInfo.getVehicleNo());
         } catch (Exception var44) {
            var44.printStackTrace();
            empInfo.setMacAddress("");
            empInfo.setVehicleId(0L);
            empInfo.setVehicleNo("None");
         }

         try {
            if (empInfo.getClientId() > 0L) {
               sDebug = sDebug + "3,";
               ClientMaster client = this.clientMasterRepo.findByClientId((int)empInfo.getClientId());
               empInfo.setClientName(client.getClientName());
               sDebug = sDebug + "4,";
               mainTerminal = this.mainTerminalMasterRepo.findByMainTerminalId((int)empInfo.getMainTerminalId());
               if (mainTerminal.getStateId() != 0L) {
                  sDebug = sDebug + "5,";
                  StateMaster states = this.stateMasterRepo.findByStateId((int)mainTerminal.getStateId());
                  sDebug = sDebug + "6,";
                  empInfo.setTimezone(states.getTimeZone());
                  empInfo.setTimezoneOffSet(states.getTimezoneOffSet());
               } else {
                  empInfo.setTimezone("");
                  empInfo.setTimezoneOffSet("");
               }
            } else {
               empInfo.setClientName("");
               empInfo.setTimezone("");
               empInfo.setTimezoneOffSet("");
            }
         } catch (Exception var43) {
            var43.printStackTrace();
         }

         empInfo.setLoginDateTime(loginData.getLoginDateTime());
         LocalDate periviousDate = LocalDate.now();
         periviousDate = periviousDate.minusDays(14L);
         String fromDate = periviousDate.toString() + " 00:00:00";
         String toDate = LocalDate.now().toString() + " 23:59:59";
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
         LocalDateTime ldtFromDate = LocalDateTime.parse(fromDate, formatter);
         long from = ldtFromDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
         LocalDateTime ldtToDate = LocalDateTime.parse(toDate, formatter);
         long to = ldtToDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
         String driverName = "";
         String url = "http://admin.gbt-usa.com/uploads/certified_signature/";
         List<DriveringStatusViewDto> driveringStatusViewDtoData = this.lookupDriverStatusDataOperation(from, to, (long)employeeId.intValue());

         for(int i = 0; i < driveringStatusViewDtoData.size(); ++i) {
            driveringStatusViewDto.add(driveringStatusViewDtoData.get(i));
         }

         for(int i = 0; i < driveringStatusViewDto.size(); ++i) {
            driveringStatusViewDto.get(i).setFromDate(from);
            driveringStatusViewDto.get(i).setToDate(to);
            driveringStatusViewDto.get(i).setLastOnSleepTime(String.valueOf(cycleUsaData.getOnSleepTime() * 60L * 60L));

            try {
               if (driveringStatusViewDto.get(i).getLogType().equals("System Generated")) {
                  driveringStatusViewDto.get(i).setIsSystemGenerated(1);
               }

               EmployeeMaster empDetails = this.employeeMasterRepo.findByEmployeeId((int)driveringStatusViewDto.get(i).getDriverId());
               driverName = empDetails.getFirstName() + " " + empDetails.getLastName();
               driveringStatusViewDto.get(i).setDriverName(driverName);
               driveringStatusViewDto.get(i).setMobileNo(empDetails.getMobileNo());
               driveringStatusViewDto.get(i).setEmail(empDetails.getEmail());
               driveringStatusViewDto.get(i).setCompanyDriverId(empDetails.getUsername());
               driveringStatusViewDto.get(i).setCdlNo(empDetails.getCdlNo());
               CountryMaster countryInfo = this.countryMasterRepo.findByCountryId((int)empDetails.getCdlCountryId());
               driveringStatusViewDto.get(i).setCountryName(countryInfo.getCountryName());
               StateMaster stateInfo = this.stateMasterRepo.findByStateId((int)empDetails.getCdlStateId());
               driveringStatusViewDto.get(i).setStateName(stateInfo.getStateName());
               driveringStatusViewDto.get(i).setExempt(empDetails.getExempt());
               VehicleMaster vehcileInfo = null;
               if (driveringStatusViewDto.get(i).getVehicleId() > 0L) {
                  vehcileInfo = this.vehicleMasterRepo.findByVehicleId((int)driveringStatusViewDto.get(i).getVehicleId());
                  driveringStatusViewDto.get(i).setTruckNo(vehcileInfo.getVehicleNo());
                  driveringStatusViewDto.get(i).setVin(vehcileInfo.getVin());
               } else {
                  driveringStatusViewDto.get(i).setTruckNo("");
                  driveringStatusViewDto.get(i).setVin("");
               }

               mainTerminal = this.mainTerminalMasterRepo.findByMainTerminalId((int)empDetails.getMainTerminalId());
               driveringStatusViewDto.get(i).setMainTerminalName(mainTerminal.getMainTerminalName());
               if (mainTerminal.getStateId() > 0L) {
                  stateInfo = this.stateMasterRepo.findByStateId((int)mainTerminal.getStateId());
                  timezoneName = stateInfo.getTimeZone();
                  timezoneOffSet = stateInfo.getTimezoneOffSet();
               }

               CycleUsa cycleUsa = this.cycleUsaRepo.findByCycleUsaId((int)empDetails.getCycleUsaId());
               driveringStatusViewDto.get(i).setCycleUsaName(cycleUsa.getCycleUsaName());
               if (empDetails.getClientId() > 0L) {
                  ClientMaster clientInfo = this.clientMasterRepo.findByClientId((int)empDetails.getClientId());
                  driveringStatusViewDto.get(i).setCompanyName(clientInfo.getClientName());
                  driveringStatusViewDto.get(i).setDotNo(clientInfo.getDotNo());
               }

               List<CertifiedLogViewDto> certifiedLogViewDto = this.lookupCertifiedLogDataOperation(from, to, driveringStatusViewDto.get(i).getDriverId());
               if (certifiedLogViewDto.size() > 0) {
                  for(int c = 0; c < certifiedLogViewDto.size(); ++c) {
                     if (certifiedLogViewDto.get(c).getCoDriverId() > 0L) {
                        empDetails = this.employeeMasterRepo.findByEmployeeId((int)certifiedLogViewDto.get(c).getCoDriverId());
                        driveringStatusViewDto.get(i).setCompanyCoDriverId(empDetails.getUsername());
                        driverName = empDetails.getFirstName() + " " + empDetails.getLastName();
                     }

                     driveringStatusViewDto.get(i).setCoDriverName(driverName);
                     driveringStatusViewDto.get(i).setTrailers(certifiedLogViewDto.get(c).getTrailers());
                     driveringStatusViewDto.get(i).setShippingDocs(certifiedLogViewDto.get(c).getShippingDocs());
                     String setImagePath1 = url.concat(certifiedLogViewDto.get(i).getCertifiedSignature());
                     driveringStatusViewDto.get(i).setCertifiedSignature(setImagePath1);
                     vehcileInfo = this.vehicleMasterRepo.findByVehicleId((int)certifiedLogViewDto.get(c).getVehicleId());
                     driveringStatusViewDto.get(i).setTruckNo(vehcileInfo.getVehicleNo());
                     driveringStatusViewDto.get(i).setVin(vehcileInfo.getVin());
                  }
               } else {
                  driveringStatusViewDto.get(i).setTrailers(new ArrayList());
                  driveringStatusViewDto.get(i).setShippingDocs(new ArrayList());
               }
            } catch (Exception var47) {
               var47.printStackTrace();
            }
         }

         List<DVIRDataCRUDDto> dvirDataViewDto = this.lookupDVIRDataOperation(from, to, (long)employeeId.intValue());

         try {
            for(int i = 0; i < dvirDataViewDto.size(); ++i) {
               String setImagePath1 = url.concat(dvirDataViewDto.get(i).getDriverSignFile());
               dvirDataViewDto.get(i).setDriverSignFile(setImagePath1);
               EmployeeMaster empDetails = this.employeeMasterRepo.findByEmployeeId(employeeId);
               driverName = empDetails.getFirstName() + " " + empDetails.getLastName();
               dvirDataViewDto.get(i).setDriverName(driverName);

               try {
                  if (dvirDataViewDto.get(i).getVehicleId() > 0L) {
                     VehicleMaster vehcileInfo = this.vehicleMasterRepo.findByVehicleId((int)dvirDataViewDto.get(i).getVehicleId());
                     dvirDataViewDto.get(i).setVehicleNo(vehcileInfo.getVehicleNo());
                  }
               } catch (Exception var42) {
                  var42.printStackTrace();
               }
            }
         } catch (Exception var46) {
            var46.printStackTrace();
         }

         List<CertifiedLogViewDto> certifiedLogViewDto = this.lookupCertifiedLogDataOperation(from, to, (long)employeeId.intValue());

         try {
            for(int i = 0; i < certifiedLogViewDto.size(); ++i) {
               String setImagePath1 = url.concat(certifiedLogViewDto.get(i).getCertifiedSignature());
               certifiedLogViewDto.get(i).setCertifiedSignature(setImagePath1);
               EmployeeMaster empDetails = this.employeeMasterRepo.findByEmployeeId(employeeId);
               driverName = empDetails.getFirstName() + " " + empDetails.getLastName();
               certifiedLogViewDto.get(i).setDriverName(driverName);
               if (certifiedLogViewDto.get(i).getCoDriverId() > 0L) {
                  empDetails = this.employeeMasterRepo.findByEmployeeId((int)certifiedLogViewDto.get(i).getCoDriverId());
                  driverName = empDetails.getFirstName() + " " + empDetails.getLastName();
                  certifiedLogViewDto.get(i).setCoDriverName(driverName);
               }

               if (certifiedLogViewDto.get(i).getVehicleId() > 0L) {
                  VehicleMaster vehcileInfo = this.vehicleMasterRepo.findByVehicleId((int)certifiedLogViewDto.get(i).getVehicleId());
                  certifiedLogViewDto.get(i).setVehicleName(vehcileInfo.getVehicleNo());
               }
            }
         } catch (Exception var45) {
            var45.printStackTrace();
         }

         List<DriveringStatusLogViewDto> loginLogoutLogViewDto = new ArrayList<>();
         new DriveringStatusLogViewDto();
         List<LoginLog> loginLogData = this.lookupLoginLogDataOperation(from, to, (long)employeeId.intValue());
         String employeeStatus = "";

         for(int i = 0; i < loginLogData.size(); ++i) {
            try {
               EmployeeMaster empDetails = this.employeeMasterRepo.findByEmployeeId(loginLogData.get(i).getEmployeeId());
               driverName = empDetails.getFirstName() + " " + empDetails.getLastName();
               employeeStatus = empInfo.getStatus();
               if (loginLogData.get(i).getLoginDateTime() > 0L) {
                  DriveringStatusLogViewDto var81 = new DriveringStatusLogViewDto();
                  var81.setDriverId((long)loginLogData.get(i).getEmployeeId().intValue());
                  var81.setDriverName(driverName);
                  var81.setLattitude(0.0);
                  var81.setLongitude(0.0);
                  var81.setCustomLocation("");
                  var81.setOrigin("");
                  var81.setOdometer(0.0);
                  var81.setEngineHour("0");
                  var81.setNote("");
                  var81.setIsVoilation(0L);
                  var81.setLogType("Login");
                  var81.setStatusId(0L);
                  var81.setDateTime(String.valueOf(loginLogData.get(i).getLoginDateTime()));
                  var81.setStatus("Login");
                  var81.setEmployeeStatus(employeeStatus);
                  loginLogoutLogViewDto.add(var81);
               }

               if (loginLogData.get(i).getLogoutDateTime() > 0L) {
                  DriveringStatusLogViewDto var82 = new DriveringStatusLogViewDto();
                  var82.setDriverId((long)loginLogData.get(i).getEmployeeId().intValue());
                  var82.setDriverName(driverName);
                  var82.setLattitude(0.0);
                  var82.setLongitude(0.0);
                  var82.setCustomLocation("");
                  var82.setOrigin("");
                  var82.setOdometer(0.0);
                  var82.setEngineHour("0");
                  var82.setNote("");
                  var82.setIsVoilation(0L);
                  var82.setLogType("Logout");
                  var82.setStatusId(0L);
                  var82.setDateTime(String.valueOf(loginLogData.get(i).getLogoutDateTime()));
                  var82.setStatus("Logout");
                  var82.setEmployeeStatus(employeeStatus);
                  loginLogoutLogViewDto.add(var82);
               }
            } catch (Exception var41) {
               var41.printStackTrace();
            }
         }

         List<SplitLog> splitLogData = this.splitLogRepo.findSplitLogByDriverId((long)employeeId.intValue());
         empDetailData = this.employeeMasterRepo.findByEmployeeId(employeeId);
         cycleUsaData = this.cycleUsaRepo.findByCycleUsaId((int)empDetailData.getCycleUsaId());
         List<CycleTimeRulesViewDto> cycleTimeRulesViewDto = new ArrayList<>();
         CycleTimeRulesViewDto cycleTimeRules = new CycleTimeRulesViewDto();
         long hourToSec = 3600L;
         long minToSec = 60L;
         cycleTimeRules.setCycleTime(cycleUsaData.getCycleHour() * hourToSec);
         cycleTimeRules.setCycleDays(cycleUsaData.getCycleDays());
         cycleTimeRules.setOnDutyTime(cycleUsaData.getOnDutyTime() * hourToSec);
         cycleTimeRules.setOnDriveTime(cycleUsaData.getOnDriveTime() * hourToSec);
         cycleTimeRules.setOnSleepTime(cycleUsaData.getOnSleepTime() * hourToSec);
         cycleTimeRules.setContinueDriveTime(cycleUsaData.getContinueDriveTime() * hourToSec);
         cycleTimeRules.setBreakTime(cycleUsaData.getBreakTime() * minToSec);
         cycleTimeRules.setCycleRestartTime(cycleUsaData.getCycleRestartTime() * hourToSec);
         cycleTimeRules.setWarningOnDutyTime1(cycleUsaData.getOnDutyTime() * hourToSec - cycleUsaData.getWarningTime1() * minToSec);
         cycleTimeRules.setWarningOnDutyTime2(cycleUsaData.getOnDutyTime() * hourToSec - cycleUsaData.getWarningTime2() * minToSec);
         cycleTimeRules.setWarningOnDriveTime1(cycleUsaData.getOnDriveTime() * hourToSec - cycleUsaData.getWarningTime1() * minToSec);
         cycleTimeRules.setWarningOnDriveTime2(cycleUsaData.getOnDriveTime() * hourToSec - cycleUsaData.getWarningTime2() * minToSec);
         cycleTimeRules.setWarningBreakTime1(cycleUsaData.getContinueDriveTime() * hourToSec - cycleUsaData.getWarningTime1() * minToSec);
         cycleTimeRules.setWarningBreakTime2(cycleUsaData.getContinueDriveTime() * hourToSec - cycleUsaData.getWarningTime2() * minToSec);
         cycleTimeRules.setCycleWarningTime1(cycleUsaData.getCycleHour() * hourToSec - cycleUsaData.getCycleWarningTime1() * minToSec);
         cycleTimeRules.setCycleWarningTime2(cycleUsaData.getCycleHour() * hourToSec - cycleUsaData.getCycleWarningTime2() * minToSec);
         cycleTimeRulesViewDto.add(cycleTimeRules);
         empInfo.setRules(cycleTimeRulesViewDto);
         empInfo.setDriverLog(driveringStatusViewDto);
         empInfo.setDriverDvirLog(dvirDataViewDto);
         empInfo.setDriverCertifiedLog(certifiedLogViewDto);
         empInfo.setLoginLogoutLog(loginLogoutLogViewDto);
         empInfo.setSplitLog(splitLogData);
         result.setResult(empInfo);
         result.setStatus(Result.SUCCESS);
         result.setToken(userLoginDto.getTokenNo());
         result.setMessage("Logged In Data Send Successfully" + sDebug);
      } catch (Exception var48) {
         result.setStatus(Result.FAIL);
         result.setMessage(var48.getLocalizedMessage());
      }

      return result;
   }

   public long lookupMaxIdOfDriverOperation(long driverId) {
      Aggregation aggregation = Aggregation.newAggregation(
         new AggregationOperation[]{
            Aggregation.match(Criteria.where("driverId").is(driverId)), Aggregation.group(new String[0]).max("statusId").as("statusId")
         }
      );
      AggregationResults<MaxIdViewDto> result = this.mongoTemplate.aggregate(aggregation, "driver_status_log", MaxIdViewDto.class);
      List<MaxIdViewDto> results = result.getMappedResults();
      return results.isEmpty() ? -1L : results.get(0).getStatusId();
   }

   public List<LoginLog> lookupLoginLogDataOperation(long from, long to, long driverId) {
      MatchOperation filter = Aggregation.match(Criteria.where("receivedTimestamp").gte(from).lte(to).and("employeeId").is(driverId));
      ProjectionOperation projectStage = Aggregation.project(new String[]{"employeeId", "loginDateTime", "logoutDateTime", "receivedTimestamp", "isCoDriver"})
         .andExclude(new String[]{"_id"});
      Aggregation aggregation = Aggregation.newAggregation(new AggregationOperation[]{filter, projectStage});
      return this.mongoTemplate.aggregate(aggregation, "login_log", LoginLog.class).getMappedResults();
   }

   @Override
   public ResultWrapper<String> UpdateLoginWithLoginLog(LoginUpdateDto loginUpdateDto) {
      String sDebug = "";
      ResultWrapper<String> result = new ResultWrapper<>();

      try {
         Instant instant = Instant.now();
         Query query = new Query();
         query.addCriteria(Criteria.where("employeeId").is(loginUpdateDto.getDriverId()));
         Update update = new Update();
         update.set("loginDateTime", loginUpdateDto.getTimestamp());
         this.mongoTemplate.findAndModify(query, update, Login.class);
         query = new Query();
         query.addCriteria(Criteria.where("employeeId").is(loginUpdateDto.getDriverId()).and("loginDateTime").is(loginUpdateDto.getLoginDateTime()));
         update = new Update();
         update.set("loginDateTime", loginUpdateDto.getTimestamp());
         this.mongoTemplate.findAndModify(query, update, LoginLog.class);
         DriverStatusLog driverStatusLog = new DriverStatusLog();
         long maxId = this.lookupMaxIdOfDriverOperation(loginUpdateDto.getDriverId());
         if (maxId <= 0L) {
            maxId = 1L;
            driverStatusLog.setStatusId(maxId);
         } else {
            driverStatusLog.setStatusId(++maxId);
         }

         Pageable pageableRequest = PageRequest.of(0, 1, Sort.by(new String[]{"_id"}).descending());
         query = new Query(Criteria.where("employeeId").is(loginUpdateDto.getDriverId()));
         query.limit(1);
         query.with(pageableRequest);
         List<LoginLogViewDto> loginLogViewDto = this.mongoTemplate.find(query, LoginLogViewDto.class, "login_log");
         EmployeeMaster empDetailData = this.employeeMasterRepo.findByEmployeeId((int)loginUpdateDto.getDriverId());
         driverStatusLog.setLogDataId(loginLogViewDto.get(0).get_id());
         driverStatusLog.setDriverId(loginUpdateDto.getDriverId());
         driverStatusLog.setVehicleId(0L);
         driverStatusLog.setClientId(empDetailData.getClientId());
         driverStatusLog.setStatus("Login");
         driverStatusLog.setLattitude(0.0);
         driverStatusLog.setLongitude(0.0);
         driverStatusLog.setDateTime(loginUpdateDto.getTimestamp());
         driverStatusLog.setLogType("Login");
         driverStatusLog.setEngineHour("0");
         driverStatusLog.setOrigin("");
         driverStatusLog.setOdometer(0.0);
         driverStatusLog.setIsVoilation(0);
         driverStatusLog.setNote("");
         driverStatusLog.setCustomLocation("");
         driverStatusLog.setIsReportGenerated(1);
         driverStatusLog.setReceivedTimestamp(instant.toEpochMilli());
         driverStatusLog.setIsVisible(1);
         List<DriverStatusLog> logDataExist = this.driverStatusLogRepo.CheckDriverStatusLogById(loginLogViewDto.get(0).get_id());
         if (logDataExist.size() <= 0) {
            this.driverStatusLogRepo.save(driverStatusLog);
            this.UpdateDriverSequenceId(loginUpdateDto.getDriverId(), loginUpdateDto.getTimestamp());
         }

         query = new Query();
         query.addCriteria(Criteria.where("employeeId").is(loginUpdateDto.getDriverId()));
         update = new Update();
         update.set("isFirstLogin", "false");
         this.mongoTemplate.findAndModify(query, update, EmployeeMaster.class);
         result.setResult("Updated");
         result.setStatus(Result.SUCCESS);
         result.setMessage("Login Log Updated successfully");
      } catch (Exception var14) {
         result.setStatus(Result.FAIL);
         result.setMessage(var14.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<EmployeeMasterCRUDDto> LoginByDate(UserLoginDto userLoginDto, String token) {
      String sDebug = "";
      ResultWrapper<EmployeeMasterCRUDDto> result = new ResultWrapper<>();

      try {
         EmployeeMasterCRUDDto empInfo = null;
         String username = userLoginDto.getUsername();
         String password = userLoginDto.getPassword();
         List<Login> login = this.loginRepo.ValidateAndLogin(username, password);
         Instant instant = Instant.now();
         String email = "";
         if (login.size() > 0) {
            email = login.get(0).getEmail();
            UserLoginDto loginData = this.loginRepo.GetLoginDataByEmail(email);
            if (login.get(0).getLoginStatus().equals("false")) {
               if (userLoginDto.getIsCoDriver() != null && !userLoginDto.getIsCoDriver().equals("")) {
                  Query query = new Query();
                  query.addCriteria(Criteria.where("employeeId").is(login.get(0).getEmployeeId()));
                  Update update = new Update();
                  update.set("isCoDriver", userLoginDto.getIsCoDriver());
                  update.set("tokenNo", token);
                  update.set("loginDateTime", instant.toEpochMilli());
                  this.mongoTemplate.findAndModify(query, update, Login.class);
               } else {
                  Query query = new Query();
                  query.addCriteria(Criteria.where("employeeId").is(login.get(0).getEmployeeId()));
                  Update update = new Update();
                  update.set("isCoDriver", "false");
                  update.set("tokenNo", token);
                  update.set("loginDateTime", instant.toEpochMilli());
                  this.mongoTemplate.findAndModify(query, update, Login.class);
               }

               empInfo = this.employeeMasterRepo.findEmployeeByEmail1(email);
               loginData = this.loginRepo.GetLoginDataByEmail(email);

               try {
                  MACAddressMaster macAddressData = this.macAddressMasterRepo.findByMACAddressMasterId((long)login.get(0).getEmployeeId().intValue());
                  empInfo.setMacAddress(macAddressData.getMacAddress());
                  empInfo.setVehicleId(macAddressData.getVehicleId());
                  VehicleMaster vehcileInfo = this.vehicleMasterRepo.findByVehicleId((int)macAddressData.getVehicleId());
                  empInfo.setVehicleNo(vehcileInfo.getVehicleNo());
                  if (empInfo.getClientId() > 0L) {
                     ClientMaster client = this.clientMasterRepo.findByClientId((int)empInfo.getClientId());
                     empInfo.setClientName(client.getClientName());
                  } else {
                     empInfo.setClientName("");
                  }
               } catch (Exception var38) {
                  var38.printStackTrace();
               }

               LoginLog loginLog = new LoginLog();
               loginLog.setEmployeeId(login.get(0).getEmployeeId());
               loginLog.setLoginDateTime(loginData.getLoginDateTime());
               loginLog.setLogoutDateTime(0L);
               loginLog.setIsCoDriver(loginData.getIsCoDriver());
               loginLog.setReceivedTimestamp(instant.toEpochMilli());
               loginLog.setLoginType("app");
               this.loginLogRepo.save(loginLog);
               empInfo.setLoginDateTime(loginData.getLoginDateTime());
               String dateTime = userLoginDto.getDateTime();
               LocalDate periviousDate = LocalDate.parse(dateTime);
               periviousDate = periviousDate.minusDays(14L);
               String fromDate = periviousDate.toString() + " 00:00:00";
               String toDate = dateTime + " 23:59:59";
               DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
               LocalDateTime ldtFromDate = LocalDateTime.parse(fromDate, formatter);
               long from = ldtFromDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
               LocalDateTime ldtToDate = LocalDateTime.parse(toDate, formatter);
               long to = ldtToDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
               String driverName = "";
               String url = "http://admin.gbt-usa.com/uploads/certified_signature/";
               List<DriveringStatusViewDto> driveringStatusViewDto = this.lookupDriverStatusDataOperation(
                  from, to, (long)login.get(0).getEmployeeId().intValue()
               );

               for(int i = 0; i < driveringStatusViewDto.size(); ++i) {
                  driveringStatusViewDto.get(i).setFromDate(from);
                  driveringStatusViewDto.get(i).setToDate(to);

                  try {
                     EmployeeMaster empDetails = this.employeeMasterRepo.findByEmployeeId((int)driveringStatusViewDto.get(i).getDriverId());
                     driverName = empDetails.getFirstName() + " " + empDetails.getLastName();
                     driveringStatusViewDto.get(i).setDriverName(driverName);
                     driveringStatusViewDto.get(i).setMobileNo(empDetails.getMobileNo());
                     driveringStatusViewDto.get(i).setEmail(empDetails.getEmail());
                     driveringStatusViewDto.get(i).setCompanyDriverId(empDetails.getUsername());
                     driveringStatusViewDto.get(i).setCdlNo(empDetails.getCdlNo());
                     CountryMaster countryInfo = this.countryMasterRepo.findByCountryId((int)empDetails.getCdlCountryId());
                     driveringStatusViewDto.get(i).setCountryName(countryInfo.getCountryName());
                     StateMaster stateInfo = this.stateMasterRepo.findByStateId((int)empDetails.getCdlStateId());
                     driveringStatusViewDto.get(i).setStateName(stateInfo.getStateName());
                     driveringStatusViewDto.get(i).setExempt(empDetails.getExempt());
                     VehicleMaster vehcileInfo = null;
                     if (driveringStatusViewDto.get(i).getVehicleId() > 0L) {
                        vehcileInfo = this.vehicleMasterRepo.findByVehicleId((int)driveringStatusViewDto.get(i).getVehicleId());
                        driveringStatusViewDto.get(i).setTruckNo(vehcileInfo.getVehicleNo());
                        driveringStatusViewDto.get(i).setVin(vehcileInfo.getVin());
                     } else {
                        driveringStatusViewDto.get(i).setTruckNo("");
                        driveringStatusViewDto.get(i).setVin("");
                     }

                     MainTerminalMaster mainTerminal = this.mainTerminalMasterRepo.findByMainTerminalId((int)empDetails.getMainTerminalId());
                     driveringStatusViewDto.get(i).setMainTerminalName(mainTerminal.getMainTerminalName());
                     CycleUsa cycleUsa = this.cycleUsaRepo.findByCycleUsaId((int)empDetails.getCycleUsaId());
                     driveringStatusViewDto.get(i).setCycleUsaName(cycleUsa.getCycleUsaName());
                     if (empDetails.getClientId() > 0L) {
                        ClientMaster clientInfo = this.clientMasterRepo.findByClientId((int)empDetails.getClientId());
                        driveringStatusViewDto.get(i).setCompanyName(clientInfo.getClientName());
                        driveringStatusViewDto.get(i).setDotNo(clientInfo.getDotNo());
                     }

                     List<CertifiedLogViewDto> certifiedLogViewDto = this.lookupCertifiedLogDataOperation(
                        from, to, driveringStatusViewDto.get(i).getDriverId()
                     );
                     if (certifiedLogViewDto.size() > 0) {
                        for(int c = 0; c < certifiedLogViewDto.size(); ++c) {
                           if (certifiedLogViewDto.get(c).getCoDriverId() > 0L) {
                              empDetails = this.employeeMasterRepo.findByEmployeeId((int)certifiedLogViewDto.get(c).getCoDriverId());
                              driveringStatusViewDto.get(i).setCompanyCoDriverId(empDetails.getUsername());
                              driverName = empDetails.getFirstName() + " " + empDetails.getLastName();
                           }

                           driveringStatusViewDto.get(i).setCoDriverName(driverName);
                           driveringStatusViewDto.get(i).setTrailers(certifiedLogViewDto.get(c).getTrailers());
                           driveringStatusViewDto.get(i).setShippingDocs(certifiedLogViewDto.get(c).getShippingDocs());
                           String setImagePath1 = url.concat(certifiedLogViewDto.get(i).getCertifiedSignature());
                           driveringStatusViewDto.get(i).setCertifiedSignature(setImagePath1);
                           vehcileInfo = this.vehicleMasterRepo.findByVehicleId((int)certifiedLogViewDto.get(c).getVehicleId());
                           driveringStatusViewDto.get(i).setTruckNo(vehcileInfo.getVehicleNo());
                           driveringStatusViewDto.get(i).setVin(vehcileInfo.getVin());
                        }
                     } else {
                        driveringStatusViewDto.get(i).setTrailers(new ArrayList());
                        driveringStatusViewDto.get(i).setShippingDocs(new ArrayList());
                     }
                  } catch (Exception var41) {
                     var41.printStackTrace();
                  }
               }

               List<DVIRDataCRUDDto> dvirDataViewDto = this.lookupDVIRDataOperation(from, to, (long)login.get(0).getEmployeeId().intValue());

               try {
                  for(int i = 0; i < dvirDataViewDto.size(); ++i) {
                     String setImagePath1 = url.concat(dvirDataViewDto.get(i).getDriverSignFile());
                     dvirDataViewDto.get(i).setDriverSignFile(setImagePath1);
                     EmployeeMaster empDetails = this.employeeMasterRepo.findByEmployeeId(login.get(0).getEmployeeId());
                     driverName = empDetails.getFirstName() + " " + empDetails.getLastName();
                     dvirDataViewDto.get(i).setDriverName(driverName);

                     try {
                        if (dvirDataViewDto.get(i).getVehicleId() > 0L) {
                           VehicleMaster vehcileInfo = this.vehicleMasterRepo.findByVehicleId((int)dvirDataViewDto.get(i).getVehicleId());
                           dvirDataViewDto.get(i).setVehicleNo(vehcileInfo.getVehicleNo());
                        }
                     } catch (Exception var37) {
                        var37.printStackTrace();
                     }
                  }
               } catch (Exception var40) {
                  var40.printStackTrace();
               }

               List<CertifiedLogViewDto> certifiedLogViewDto = this.lookupCertifiedLogDataOperation(from, to, (long)login.get(0).getEmployeeId().intValue());

               try {
                  for(int i = 0; i < certifiedLogViewDto.size(); ++i) {
                     String setImagePath1 = url.concat(certifiedLogViewDto.get(i).getCertifiedSignature());
                     certifiedLogViewDto.get(i).setCertifiedSignature(setImagePath1);
                     EmployeeMaster empDetails = this.employeeMasterRepo.findByEmployeeId(login.get(0).getEmployeeId());
                     driverName = empDetails.getFirstName() + " " + empDetails.getLastName();
                     certifiedLogViewDto.get(i).setDriverName(driverName);
                     if (certifiedLogViewDto.get(i).getCoDriverId() > 0L) {
                        empDetails = this.employeeMasterRepo.findByEmployeeId((int)certifiedLogViewDto.get(i).getCoDriverId());
                        driverName = empDetails.getFirstName() + " " + empDetails.getLastName();
                        certifiedLogViewDto.get(i).setCoDriverName(driverName);
                     }

                     if (certifiedLogViewDto.get(i).getVehicleId() > 0L) {
                        VehicleMaster vehcileInfo = this.vehicleMasterRepo.findByVehicleId((int)certifiedLogViewDto.get(i).getVehicleId());
                        certifiedLogViewDto.get(i).setVehicleName(vehcileInfo.getVehicleNo());
                     }
                  }
               } catch (Exception var39) {
                  var39.printStackTrace();
               }

               empInfo.setDriverLog(driveringStatusViewDto);
               empInfo.setDriverDvirLog(dvirDataViewDto);
               empInfo.setDriverCertifiedLog(certifiedLogViewDto);
               result.setResult(empInfo);
               result.setToken(token);
               result.setStatus(Result.SUCCESS);
               result.setMessage("Logged In Successfully");
            } else {
               result.setResult(null);
               result.setToken(null);
               result.setStatus(Result.FAIL);
               result.setMessage("You are not authorized for login.");
            }
         } else {
            result.setResult(null);
            result.setToken(null);
            result.setStatus(Result.FAIL);
            result.setMessage("Invalid username or password");
         }
      } catch (Exception var42) {
         result.setStatus(Result.FAIL);
         result.setMessage(var42.getLocalizedMessage());
      }

      return result;
   }

   public List<DVIRDataCRUDDto> lookupDVIRDataOperation(long from, long to, long driverId) {
      MatchOperation filter = null;
      if (driverId > 0L) {
         filter = Aggregation.match(Criteria.where("lDateTime").gte(from).lte(to).and("driverId").is(driverId));
      } else {
         filter = Aggregation.match(Criteria.where("lDateTime").gte(from).lte(to));
      }

      ProjectionOperation projectStage = Aggregation.project(
         new String[]{
            "_id",
            "driverId",
            "location",
            "truckDefect",
            "trailerDefect",
            "dateTime",
            "lDateTime",
            "notes",
            "vehicleCondition",
            "driverSignFile",
            "receivedTimestamp",
            "engineHour",
            "odometer",
            "companyName",
            "vehicleId",
            "timestamp",
            "trailer"
         }
      );
      Aggregation aggregation = Aggregation.newAggregation(
         new AggregationOperation[]{
            filter, projectStage, Aggregation.sort(Direction.ASC, new String[]{"driverId"}).and(Direction.DESC, new String[]{"receivedTimestamp"})
         }
      );
      return this.mongoTemplate.aggregate(aggregation, "dvir_data", DVIRDataCRUDDto.class).getMappedResults();
   }

   public List<CertifiedLogViewDto> lookupCertifiedLogDataOperation(long from, long to, long driverId) {
      MatchOperation filter = Aggregation.match(Criteria.where("lCertifiedDate").gte(from).lte(to).and("driverId").is(driverId));
      ProjectionOperation projectStage = Aggregation.project(
            new String[]{
               "driverId",
               "vehicleId",
               "trailers",
               "shippingDocs",
               "coDriverId",
               "certifiedSignature",
               "certifiedDate",
               "lCertifiedDate",
               "addedTimestamp",
               "certifiedAt"
            }
         )
         .andExclude(new String[]{"_id"});
      Aggregation aggregation = Aggregation.newAggregation(new AggregationOperation[]{filter, projectStage});
      return this.mongoTemplate.aggregate(aggregation, "certified_log", CertifiedLogViewDto.class).getMappedResults();
   }

   public List<DriveringStatusViewDto> lookupDriverStatusDataOperation(long from, long to, long driverId) {
      MatchOperation filter = null;
      if (driverId > 0L) {
         filter = Aggregation.match(Criteria.where("utcDateTime").gte(from).lte(to).and("driverId").is(driverId).and("isVisible").is(1));
      } else {
         filter = Aggregation.match(Criteria.where("utcDateTime").gte(from).lte(to).and("isVisible").is(1));
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
               "engineStatus",
               "odometer",
               "vehicleId",
               "shift",
               "days",
               "origin",
               "timezone",
               "remainingWeeklyTime",
               "remainingDutyTime",
               "remainingDriveTime",
               "remainingSleepTime",
               "remainingLastSleepTime",
               "identifier",
               "isSplit"
            }
         )
         .andExclude(new String[]{"_id"});
      Aggregation aggregation = Aggregation.newAggregation(
         new AggregationOperation[]{filter, projectStage, Aggregation.sort(Direction.DESC, new String[]{"lDateTime"})}
      );
      return this.mongoTemplate.aggregate(aggregation, "drivering_status", DriveringStatusViewDto.class).getMappedResults();
   }

   @Override
   public ResultWrapper<List<UserMasterViewDto>> LoginWeb(UserLoginDto userLoginDto, String token) {
      String sDebug = "==>";
      ResultWrapper<List<UserMasterViewDto>> result = new ResultWrapper<>();

      try {
         Instant instant = Instant.now();
         String email = userLoginDto.getEmail();
         String password = userLoginDto.getPassword();
         String tokenNo = userLoginDto.getTokenNo();
         List<UserMasterViewDto> userMaster = this.userMasterRepo.findAndViewByEmailAndPassword(email, password);
         boolean isTokenValid = false;
         if (userMaster.size() > 0) {
            if (userMaster.get(0).getUserTypeId() >= 1L) {
               isTokenValid = true;
               if (userMaster.get(0).getDisclaimerRead() == 0L) {
                  try {
                     String disclaimerFilePath = "/opt/tomcat/webapps/disclaimer/disclaimer.txt";
                     File disclaimerFile = new File(disclaimerFilePath);
                     if (disclaimerFile.exists()) {
                        String disclaimerText = new String(Files.readAllBytes(disclaimerFile.toPath()), StandardCharsets.UTF_8);
                        userMaster.get(0).setDisclaimer(disclaimerText);
                     } else {
                        userMaster.get(0).setDisclaimer("Disclaimer file not found.");
                     }
                  } catch (IOException var32) {
                     userMaster.get(0).setDisclaimer("Error reading disclaimer file: " + var32.getMessage());
                  }
               }
            } else {
               String dbToken = userMaster.get(0).getTokenNo();
               if (dbToken == null || dbToken.isEmpty()) {
                  isTokenValid = true;
                  Query query = new Query();
                  query.addCriteria(Criteria.where("userId").is(userMaster.get(0).getUserId()));
                  Update update = new Update();
                  update.set("tokenNo", tokenNo);
                  this.mongoTemplate.findAndModify(query, update, UserMaster.class);
               } else if (dbToken.equals(tokenNo)) {
                  isTokenValid = true;
               }
            }

            ClientMaster clientMaster = null;
            String status = "";
            String timezoneOffSet = "";
            String subscriptionExpire = "";
            if (userMaster.size() > 0) {
               if (userMaster.get(0).getClientId() > 0L) {
                  clientMaster = this.clientMasterRepo.findByClientId((int)userMaster.get(0).getClientId());
                  status = clientMaster.getStatus();
                  long graceTime = clientMaster.getGraceTime();
                  StateMaster stateInfo = this.stateMasterRepo.findByStateId((int)clientMaster.getTimezoneId());
                  timezoneOffSet = stateInfo.getTimezoneOffSet();
                  timezoneOffSet = timezoneOffSet.trim().replace("−", "-").replace("＋", "+");
                  String[] splitStr = timezoneOffSet.split(":");
                  long hour = Math.abs(Long.parseLong(splitStr[0]));
                  long minutes = Math.abs(Long.parseLong(splitStr[1]));
                  int totalMinutes = (int)(hour * 60L + minutes);
                  Clock cl = Clock.systemUTC();
                  Clock adjustedClock;
                  if (timezoneOffSet.startsWith("-")) {
                     adjustedClock = Clock.offset(cl, Duration.ofMinutes((long)(-totalMinutes)));
                  } else {
                     adjustedClock = Clock.offset(cl, Duration.ofMinutes((long)totalMinutes));
                  }

                  LocalDate lt = LocalDate.now(adjustedClock);
                  LocalDateTime endOfDay = lt.atTime(LocalTime.MAX);
                  long endOfDayEpoch = endOfDay.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
                  long timestampValue = 0L;
                  if (timezoneOffSet.substring(0, 1).equals("-")) {
                     timestampValue = instant.toEpochMilli() - (hour * 60L + minutes) * 60000L;
                  } else {
                     timestampValue = instant.toEpochMilli() + (hour * 60L + minutes) * 60000L;
                  }

                  if (timestampValue > graceTime) {
                     subscriptionExpire = "true";
                  } else {
                     subscriptionExpire = "false";
                  }
               } else {
                  status = "true";
                  subscriptionExpire = "false";
               }

               if (subscriptionExpire.equals("true")) {
                  result.setResult(null);
                  result.setToken(null);
                  result.setStatus(Result.FAIL);
                  result.setMessage("You are not autorized for login.");
               } else if (status.equals("true")
                  && isTokenValid
                  && userMaster.get(0).getWebAccess().equals("true")
                  && userMaster.get(0).getStatus().equals("true")) {
                  LoginLog loginLog = new LoginLog();
                  loginLog.setUserId(userMaster.get(0).getUserId());
                  loginLog.setLoginDateTime(instant.toEpochMilli());
                  loginLog.setLogoutDateTime(0L);
                  loginLog.setIsCoDriver("false");
                  loginLog.setReceivedTimestamp(instant.toEpochMilli());
                  loginLog.setLoginType("web");
                  this.loginLogRepo.save(loginLog);
                  userMaster.get(0).setLoginDateTime(loginLog.getLoginDateTime());
                  if (userMaster.get(0).getClientId() > 0L) {
                     ClientMaster client = this.clientMasterRepo.findByClientId((int)userMaster.get(0).getClientId());
                     userMaster.get(0).setClientName(client.getClientName());
                     userMaster.get(0).setAllowTracking(client.getAllowTracking());
                     userMaster.get(0).setAllowGpsTracking(client.getAllowGpsTracking());
                     userMaster.get(0).setAllowIfta(client.getAllowIfta());
                     userMaster.get(0).setExemptDriver(client.getExemptDriver());
                     userMaster.get(0).setPersonalUse(client.getPersonalUse());
                     userMaster.get(0).setYardMoves(client.getYardMoves());
                     userMaster.get(0).setShortHaulException(client.getShortHaulException());
                     CountryMaster countryInfo = this.countryMasterRepo.findByCountryId((int)client.getCountryId());
                     userMaster.get(0).setLattitude(countryInfo.getLattitude());
                     userMaster.get(0).setLongitude(countryInfo.getLongitude());
                  } else {
                     userMaster.get(0).setClientName("");
                  }

                  result.setResult(userMaster);
                  result.setToken(token);
                  result.setStatus(Result.SUCCESS);
                  result.setMessage("Logged In Successfully" + sDebug);
               } else {
                  result.setResult(null);
                  result.setToken(null);
                  result.setStatus(Result.FAIL);
                  result.setMessage("You are not autorized for login.");
               }
            } else {
               result.setResult(null);
               result.setToken(null);
               result.setStatus(Result.FAIL);
               result.setMessage("Invalid username or password.");
            }
         } else {
            result.setResult(null);
            result.setToken(null);
            result.setStatus(Result.FAIL);
            result.setMessage("Invalid username or password.");
         }
      } catch (Exception var33) {
         result.setStatus(Result.FAIL);
         result.setMessage(var33.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<UserLoginDto> ForgotPassword(UserLoginDto userLoginDto) {
      ResultWrapper<UserLoginDto> result = new ResultWrapper<>();

      try {
         String email = userLoginDto.getUsername();
         List<Login> login = this.loginRepo.ForgotPassword(email);
         if (login.size() > 0) {
            UserLoginDto userData = this.loginRepo.GetLoginDataByEmail(email);
            EmployeeMaster empInfo = this.employeeMasterRepo.findByEmployeeId(userData.getEmployeeId());
            String driverName = empInfo.getFirstName() + " " + empInfo.getLastName();

            try {
               MimeMessage msg = this.javaMailSender.createMimeMessage();
               MimeMessageHelper helper = new MimeMessageHelper(msg, true);
               helper.setTo(userData.getEmail());
               helper.setSubject("Forgot Password Request");
               String msg_body = "<div style='font-family: Arial, sans-serif; font-size:14px; color:#333;'>Dear <b>"
                  + driverName
                  + "</b>,<br/><br/>We received a request to recover your password. Here are your login details:<br/><br/>Your password is: <b style='color:#6610f2;'>"
                  + userData.getPassword()
                  + "</b><br/><br/><b style='color:#000;'>Security Note:</b> Please do not share your password with anyone. Our team will never ask you for your password via email, phone, or chat.<br/><br/>Best Regards,<br/><b>ELD Support Team</b></div>";
               helper.setText(msg_body, true);
               this.javaMailSender.send(msg);
            } catch (Exception var11) {
               result.setStatus(Result.FAIL);
               result.setMessage("Failed to send password email.");
               return result;
            }

            result.setResult(userData);
            result.setToken(null);
            result.setStatus(Result.SUCCESS);
            result.setMessage("Forgot password email sent successfully.");
         } else {
            result.setResult(null);
            result.setToken(null);
            result.setStatus(Result.FAIL);
            result.setMessage("Invalid Username.");
         }
      } catch (Exception var12) {
         result.setStatus(Result.FAIL);
         result.setMessage(var12.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<UserLoginDto> ForgotUsername(UserLoginDto userLoginDto) {
      String sDebug = "";
      ResultWrapper<UserLoginDto> result = new ResultWrapper<>();

      try {
         long mobileNo = userLoginDto.getMobileNo();
         List<Login> login = this.loginRepo.ForgotUsername(mobileNo);
         if (login.size() > 0) {
            UserLoginDto userData = this.loginRepo.GetLoginDataByEmail(login.get(0).getEmail());
            userData.setPassword(String.valueOf(userData.getMobileNo()));
            EmployeeMaster empInfo = this.employeeMasterRepo.findByEmployeeId(userData.getEmployeeId());
            String driverName = empInfo.getFirstName() + " " + empInfo.getLastName();

            try {
               MimeMessage msg = this.javaMailSender.createMimeMessage();
               MimeMessageHelper helper = new MimeMessageHelper(msg, true);
               helper.setTo(userData.getEmail());
               helper.setSubject("Forgot Username Request");
               String msg_body = "<div style='font-family: Arial, sans-serif; font-size:14px; color:#333;'>Dear <b>"
                  + driverName
                  + "</b>,<br/><br/>We received a request to recover your username. Here are your login details:<br/><br/>Your username is: <b style='color:#6610f2;'>"
                  + userData.getUsername()
                  + "</b><br/><br/><b style='color:#000;'>Security Note:</b> Please do not share your username with anyone. Our team will never ask you for your password via email, phone, or chat.<br/><br/>Best Regards,<br/><b>ELD Support Team</b></div>";
               helper.setText(msg_body, true);
               this.javaMailSender.send(msg);
            } catch (Exception var13) {
               result.setStatus(Result.FAIL);
               result.setMessage("Failed to send username.");
               return result;
            }

            result.setResult(userData);
            result.setToken(null);
            result.setStatus(Result.SUCCESS);
            result.setMessage("Forgot Username Send Successfully.");
         } else {
            result.setResult(null);
            result.setToken(null);
            result.setStatus(Result.FAIL);
            result.setMessage("Invalid Mobile No.");
         }
      } catch (Exception var14) {
         result.setStatus(Result.FAIL);
         result.setMessage(var14.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<UserLoginDto> LogoutApi(UserLoginDto userLoginDto, String tokenValid) {
      String sDebug = "";
      ResultWrapper<UserLoginDto> result = new ResultWrapper<>();

      try {
         Integer employeeId = userLoginDto.getEmployeeId();
         long loginDateTime = userLoginDto.getLoginDateTime();
         Instant instant = Instant.now();
         if (employeeId > 0) {
            if (tokenValid.equals("true")) {
               Query query = new Query();
               query.addCriteria(Criteria.where("employeeId").is(employeeId));
               Update update = new Update();
               update.set("loginStatus", "false");
               update.set("logoutDateTime", userLoginDto.getLogoutDateTime());
               this.mongoTemplate.findAndModify(query, update, Login.class);
               Query query1 = new Query();
               query1.addCriteria(Criteria.where("employeeId").is(employeeId).and("loginDateTime").is(loginDateTime));
               Update update1 = new Update();
               update1.set("logoutDateTime", userLoginDto.getLogoutDateTime());
               this.mongoTemplate.findAndModify(query1, update1, LoginLog.class);
               EmployeeMaster empInfo = this.employeeMasterRepo.findByEmployeeId(employeeId);
               DriverStatusLog driverStatusLog = new DriverStatusLog();
               long maxId = this.lookupMaxIdOfDriverOperation((long)employeeId.intValue());
               if (maxId <= 0L) {
                  maxId = 1L;
                  driverStatusLog.setStatusId(maxId);
               } else {
                  driverStatusLog.setStatusId(++maxId);
               }

               Pageable pageableRequest = PageRequest.of(0, 1, Sort.by(new String[]{"_id"}).descending());
               Query queryLog = new Query(Criteria.where("employeeId").is(employeeId));
               queryLog.limit(1);
               queryLog.with(pageableRequest);
               List<LoginLogViewDto> loginLogViewDto = this.mongoTemplate.find(queryLog, LoginLogViewDto.class, "login_log");
               driverStatusLog.setLogDataId(loginLogViewDto.get(0).get_id());
               driverStatusLog.setDriverId((long)employeeId.intValue());
               driverStatusLog.setVehicleId(0L);
               driverStatusLog.setClientId(empInfo.getClientId());
               driverStatusLog.setStatus("Logout");
               driverStatusLog.setLattitude(0.0);
               driverStatusLog.setLongitude(0.0);
               driverStatusLog.setDateTime(loginLogViewDto.get(0).getLogoutDateTime());
               driverStatusLog.setLogType("Logout");
               driverStatusLog.setEngineHour("0");
               driverStatusLog.setOrigin("");
               driverStatusLog.setOdometer(0.0);
               driverStatusLog.setIsVoilation(0);
               driverStatusLog.setNote("");
               driverStatusLog.setCustomLocation("");
               driverStatusLog.setIsReportGenerated(1);
               driverStatusLog.setReceivedTimestamp(instant.toEpochMilli());
               driverStatusLog.setIsVisible(1);
               List<DriverStatusLog> logDataExist = this.driverStatusLogRepo.CheckDriverStatusLogById(loginLogViewDto.get(0).get_id());
               this.driverStatusLogRepo.save(driverStatusLog);
               this.UpdateDriverSequenceId((long)employeeId.intValue(), loginLogViewDto.get(0).getLogoutDateTime());
               result.setResult(userLoginDto);
               result.setToken(tokenValid);
               result.setStatus(Result.SUCCESS);
               result.setMessage("Logout successfully.");
            } else {
               Query query = new Query();
               query.addCriteria(Criteria.where("employeeId").is(employeeId));
               Update update = new Update();
               update.set("loginStatus", "false");
               update.set("logoutDateTime", userLoginDto.getLogoutDateTime());
               this.mongoTemplate.findAndModify(query, update, Login.class);
               Query query1 = new Query();
               query1.addCriteria(Criteria.where("employeeId").is(employeeId).and("loginDateTime").is(loginDateTime));
               Update update1 = new Update();
               update1.set("logoutDateTime", userLoginDto.getLogoutDateTime());
               this.mongoTemplate.findAndModify(query1, update1, LoginLog.class);
               EmployeeMaster empInfo = this.employeeMasterRepo.findByEmployeeId(employeeId);
               DriverStatusLog driverStatusLog = new DriverStatusLog();
               long maxId = this.lookupMaxIdOfDriverOperation((long)employeeId.intValue());
               if (maxId <= 0L) {
                  maxId = 1L;
                  driverStatusLog.setStatusId(maxId);
               } else {
                  driverStatusLog.setStatusId(++maxId);
               }

               Pageable pageableRequest = PageRequest.of(0, 1, Sort.by(new String[]{"_id"}).descending());
               Query queryLog = new Query(Criteria.where("employeeId").is(employeeId));
               queryLog.limit(1);
               queryLog.with(pageableRequest);
               List<LoginLogViewDto> loginLogViewDto = this.mongoTemplate.find(queryLog, LoginLogViewDto.class, "login_log");
               driverStatusLog.setLogDataId(loginLogViewDto.get(0).get_id());
               driverStatusLog.setDriverId((long)employeeId.intValue());
               driverStatusLog.setVehicleId(0L);
               driverStatusLog.setClientId(empInfo.getClientId());
               driverStatusLog.setStatus("Logout");
               driverStatusLog.setLattitude(0.0);
               driverStatusLog.setLongitude(0.0);
               driverStatusLog.setDateTime(loginLogViewDto.get(0).getLogoutDateTime());
               driverStatusLog.setLogType("Logout");
               driverStatusLog.setEngineHour("0");
               driverStatusLog.setOrigin("");
               driverStatusLog.setOdometer(0.0);
               driverStatusLog.setIsVoilation(0);
               driverStatusLog.setNote("");
               driverStatusLog.setCustomLocation("");
               driverStatusLog.setIsReportGenerated(1);
               driverStatusLog.setReceivedTimestamp(instant.toEpochMilli());
               driverStatusLog.setIsVisible(1);
               List<DriverStatusLog> logDataExist = this.driverStatusLogRepo.CheckDriverStatusLogById(loginLogViewDto.get(0).get_id());
               this.driverStatusLogRepo.save(driverStatusLog);
               this.UpdateDriverSequenceId((long)employeeId.intValue(), loginLogViewDto.get(0).getLogoutDateTime());
               result.setResult(userLoginDto);
               result.setToken(tokenValid);
               result.setStatus(Result.SUCCESS);
               result.setMessage("Logout successfully.");
            }
         } else {
            result.setResult(null);
            result.setToken(null);
            result.setStatus(Result.FAIL);
            result.setMessage("Invalid Request.");
         }
      } catch (Exception var21) {
         result.setStatus(Result.FAIL);
         result.setMessage(var21.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<String> LogoutWebApi(UserLoginDto userLoginDto) {
      String sDebug = "";
      ResultWrapper<String> result = new ResultWrapper<>();

      try {
         Integer employeeId = userLoginDto.getEmployeeId();
         long loginDateTime = userLoginDto.getLoginDateTime();
         Instant instant = Instant.now();
         if (employeeId > 0) {
            Query query1 = new Query();
            query1.addCriteria(Criteria.where("userId").is(employeeId).and("loginDateTime").is(loginDateTime));
            Update update1 = new Update();
            update1.set("logoutDateTime", instant.toEpochMilli());
            this.mongoTemplate.findAndModify(query1, update1, LoginLog.class);
            result.setResult("Logout");
            result.setStatus(Result.SUCCESS);
            result.setMessage("Logout successfully.");
         } else {
            result.setResult(null);
            result.setToken(null);
            result.setStatus(Result.FAIL);
            result.setMessage("Invalid Request.");
         }
      } catch (Exception var10) {
         result.setStatus(Result.FAIL);
         result.setMessage(var10.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<String> ValidateTokenNo(String tokenValid) {
      ResultWrapper<String> result = new ResultWrapper<>();

      try {
         result.setResult("Validate Token");
         result.setToken(tokenValid);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Validate Token No. successfully.");
      } catch (Exception var4) {
         result.setStatus(Result.FAIL);
         result.setMessage(var4.getLocalizedMessage());
      }

      return result;
   }

   public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
      return null;
   }
}
