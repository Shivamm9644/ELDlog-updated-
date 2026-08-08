package com.mes.eld_log.serviceImpl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.mes.eld_log.dtos.CargoTypeMasterCRUDDto;
import com.mes.eld_log.dtos.CarrierMasterCRUDDto;
import com.mes.eld_log.dtos.ClientMasterCRUDDto;
import com.mes.eld_log.dtos.ClientMasterViewDto;
import com.mes.eld_log.dtos.CompanyMasterCRUDDto;
import com.mes.eld_log.dtos.CountryStateCityMasterCRUDDto;
import com.mes.eld_log.dtos.CustomerMasterCRUDDto;
import com.mes.eld_log.dtos.CycleCanadaCRUDDto;
import com.mes.eld_log.dtos.CycleUsaCRUDDto;
import com.mes.eld_log.dtos.DefectMasterCRUDDto;
import com.mes.eld_log.dtos.DeviceMasterCRUDDto;
import com.mes.eld_log.dtos.DeviceMasterViewDto;
import com.mes.eld_log.dtos.DeviceModalMasterCRUDDto;
import com.mes.eld_log.dtos.DriverInfoViewDto;
import com.mes.eld_log.dtos.DriveringStatusViewDto;
import com.mes.eld_log.dtos.EldConnectionInterfaceCRUDDto;
import com.mes.eld_log.dtos.EmployeeMasterCRUDDto;
import com.mes.eld_log.dtos.EmployeeMasterListViewDto;
import com.mes.eld_log.dtos.EmployeeMasterViewDto;
import com.mes.eld_log.dtos.ExceptionMasterCRUDDto;
import com.mes.eld_log.dtos.FuelTypeMasterCRUDDto;
import com.mes.eld_log.dtos.GeofanceMasterCRUDDto;
import com.mes.eld_log.dtos.LanguageMasterCRUDDto;
import com.mes.eld_log.dtos.MainTerminalMasterCRUDDto;
import com.mes.eld_log.dtos.MaxIdViewDto;
import com.mes.eld_log.dtos.PaymentStatusMasterCRUDDto;
import com.mes.eld_log.dtos.ProductMasterCRUDDto;
import com.mes.eld_log.dtos.ProjectDetailAnalyticsViewDto;
import com.mes.eld_log.dtos.ReceiverMasterCRUDDto;
import com.mes.eld_log.dtos.ReferModeCRUDDto;
import com.mes.eld_log.dtos.RestBreakMasterCRUDDto;
import com.mes.eld_log.dtos.RestartMasterCRUDDto;
import com.mes.eld_log.dtos.RouteMasterCRUDDto;
import com.mes.eld_log.dtos.ShipperMasterCRUDDto;
import com.mes.eld_log.dtos.SimulatorCRUDDto;
import com.mes.eld_log.dtos.TimezoneMasterCRUDDto;
import com.mes.eld_log.dtos.TrailerMasterCRUDDto;
import com.mes.eld_log.dtos.UserMasterCRUDDto;
import com.mes.eld_log.dtos.UserMasterViewDto;
import com.mes.eld_log.dtos.UserTypeMasterCRUDDto;
import com.mes.eld_log.dtos.VehicleConditionCRUDDto;
import com.mes.eld_log.dtos.VehicleMasterCRUDDto;
import com.mes.eld_log.dtos.VehicleMasterViewDto;
import com.mes.eld_log.dtos.VehicleTypeMasterCRUDDto;
import com.mes.eld_log.models.CargoTypeMaster;
import com.mes.eld_log.models.CarrierMaster;
import com.mes.eld_log.models.CityMaster;
import com.mes.eld_log.models.ClientMaster;
import com.mes.eld_log.models.CompanyMaster;
import com.mes.eld_log.models.CountryMaster;
import com.mes.eld_log.models.CustomerMaster;
import com.mes.eld_log.models.CycleCanada;
import com.mes.eld_log.models.CycleUsa;
import com.mes.eld_log.models.DefectMaster;
import com.mes.eld_log.models.DeviceMaster;
import com.mes.eld_log.models.DeviceModalMaster;
import com.mes.eld_log.models.DeviceStatus;
import com.mes.eld_log.models.Disclaimer;
import com.mes.eld_log.models.DriverStatusLog;
import com.mes.eld_log.models.DriveringStatus;
import com.mes.eld_log.models.ELDSettings;
import com.mes.eld_log.models.EldConnectionInterface;
import com.mes.eld_log.models.EmployeeMaster;
import com.mes.eld_log.models.ExceptionMaster;
import com.mes.eld_log.models.FuelTypeMaster;
import com.mes.eld_log.models.GeofanceMaster;
import com.mes.eld_log.models.LanguageMaster;
import com.mes.eld_log.models.Login;
import com.mes.eld_log.models.MACAddressMaster;
import com.mes.eld_log.models.MainTerminalMaster;
import com.mes.eld_log.models.PaymentStatusMaster;
import com.mes.eld_log.models.ProductMaster;
import com.mes.eld_log.models.ReceiverMaster;
import com.mes.eld_log.models.ReferModeMaster;
import com.mes.eld_log.models.RestBreakMaster;
import com.mes.eld_log.models.RestartMaster;
import com.mes.eld_log.models.RouteMaster;
import com.mes.eld_log.models.ShipperMaster;
import com.mes.eld_log.models.Simulator;
import com.mes.eld_log.models.StateMaster;
import com.mes.eld_log.models.TimezoneMaster;
import com.mes.eld_log.models.TrailerMaster;
import com.mes.eld_log.models.UserMaster;
import com.mes.eld_log.models.UserTypeMaster;
import com.mes.eld_log.models.VehicleCondition;
import com.mes.eld_log.models.VehicleMaster;
import com.mes.eld_log.models.VehicleTypeMaster;
import com.mes.eld_log.repo.CargoTypeMasterRepo;
import com.mes.eld_log.repo.CarrierMasterRepo;
import com.mes.eld_log.repo.CertifiedLogRepo;
import com.mes.eld_log.repo.CityMasterRepo;
import com.mes.eld_log.repo.ClientMasterRepo;
import com.mes.eld_log.repo.CompanyMasterRepo;
import com.mes.eld_log.repo.CountryMasterRepo;
import com.mes.eld_log.repo.CustomerMasterRepo;
import com.mes.eld_log.repo.CycleCanadaRepo;
import com.mes.eld_log.repo.CycleUsaRepo;
import com.mes.eld_log.repo.DVIRDataRepo;
import com.mes.eld_log.repo.DefectMasterRepo;
import com.mes.eld_log.repo.DeviceMasterRepo;
import com.mes.eld_log.repo.DeviceModalMasterRepo;
import com.mes.eld_log.repo.DeviceStatusRepo;
import com.mes.eld_log.repo.DisclaimerRepo;
import com.mes.eld_log.repo.DriverStatusLogRepo;
import com.mes.eld_log.repo.DriveringStatusRepo;
import com.mes.eld_log.repo.ELDSettingsRepo;
import com.mes.eld_log.repo.EldConnectionInterfaceRepo;
import com.mes.eld_log.repo.EmployeeMasterRepo;
import com.mes.eld_log.repo.ExceptionMasterRepo;
import com.mes.eld_log.repo.FuelTypeMasterRepo;
import com.mes.eld_log.repo.GeofanceMasterRepo;
import com.mes.eld_log.repo.LanguageMasterRepo;
import com.mes.eld_log.repo.LoginLogRepo;
import com.mes.eld_log.repo.LoginRepo;
import com.mes.eld_log.repo.MACAddressMasterRepo;
import com.mes.eld_log.repo.MainTerminalMasterRepo;
import com.mes.eld_log.repo.PaymentStatusMasterRepo;
import com.mes.eld_log.repo.ProductMasterRepo;
import com.mes.eld_log.repo.ReceiverMasterRepo;
import com.mes.eld_log.repo.ReferModeMasterRepo;
import com.mes.eld_log.repo.RestBreakMasterRepo;
import com.mes.eld_log.repo.RestartMasterRepo;
import com.mes.eld_log.repo.RouteMasterRepo;
import com.mes.eld_log.repo.ShipperMasterRepo;
import com.mes.eld_log.repo.SimulatorRepo;
import com.mes.eld_log.repo.SplitLogRepo;
import com.mes.eld_log.repo.StateMasterRepo;
import com.mes.eld_log.repo.TimezoneMasterRepo;
import com.mes.eld_log.repo.TrailerMasterRepo;
import com.mes.eld_log.repo.UserMasterRepo;
import com.mes.eld_log.repo.UserTypeMasterRepo;
import com.mes.eld_log.repo.VehicleConditionRepo;
import com.mes.eld_log.repo.VehicleMasterRepo;
import com.mes.eld_log.repo.VehicleTypeMasterRepo;
import com.mes.eld_log.results.Result;
import com.mes.eld_log.results.ResultWrapper;
import com.mes.eld_log.service.MasterService;
import java.nio.file.Path;
import java.security.SecureRandom;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.bson.types.ObjectId;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationOperation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.core.aggregation.LookupOperation;
import org.springframework.data.mongodb.core.aggregation.MatchOperation;
import org.springframework.data.mongodb.core.aggregation.ProjectionOperation;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service("masterService")
public class MasterServiceImpl implements MasterService {
   @Autowired
   private BCryptPasswordEncoder bcryptEncoder;
   @Autowired
   private EmployeeMasterRepo employeeMasterRepo;
   @Autowired
   private ELDSettingsRepo eldSettingsRepo;
   @Autowired
   private DriverStatusLogRepo driverStatusLogRepo;
   @Autowired
   LoginRepo loginRepo;
   @Autowired
   DriveringStatusRepo driveringStatusRepo;
   @Autowired
   SplitLogRepo splitLogRepo;
   @Autowired
   LoginLogRepo loginLogRepo;
   @Autowired
   private DVIRDataRepo dvirDataRepo;
   @Autowired
   private CertifiedLogRepo certifiedLogRepo;
   @Autowired
   DeviceStatusRepo deviceStatusRepo;
   @Autowired
   SimulatorRepo simulatorRepo;
   @Autowired
   VehicleConditionRepo vehicleConditionRepo;
   @Autowired
   MACAddressMasterRepo macAddressMasterRepo;
   @Autowired
   EldConnectionInterfaceRepo eldConnectionInterfaceRepo;
   @Autowired
   TimezoneMasterRepo timezoneMasterRepo;
   @Autowired
   RestartMasterRepo restartMasterRepo;
   @Autowired
   RestBreakMasterRepo restBreakMasterRepo;
   @Autowired
   DefectMasterRepo defectMasterRepo;
   @Autowired
   DeviceMasterRepo deviceMasterRepo;
   @Autowired
   VehicleMasterRepo vehicleMasterRepo;
   @Autowired
   CountryMasterRepo countryMasterRepo;
   @Autowired
   StateMasterRepo stateMasterRepo;
   @Autowired
   CityMasterRepo cityMasterRepo;
   @Autowired
   ProductMasterRepo productMasterRepo;
   @Autowired
   CustomerMasterRepo customerMasterRepo;
   @Autowired
   DisclaimerRepo disclaimerRepo;
   @Autowired
   ShipperMasterRepo shipperMasterRepo;
   @Autowired
   ReceiverMasterRepo receiverMasterRepo;
   @Autowired
   CompanyMasterRepo companyMasterRepo;
   @Autowired
   RouteMasterRepo routeMasterRepo;
   @Autowired
   CarrierMasterRepo carrierMasterRepo;
   @Autowired
   ClientMasterRepo clientMasterRepo;
   @Autowired
   UserTypeMasterRepo userTypeMasterRepo;
   @Autowired
   LanguageMasterRepo languageMasterRepo;
   @Autowired
   CycleUsaRepo cycleUsaRepo;
   @Autowired
   CycleCanadaRepo cycleCanadaRepo;
   @Autowired
   DeviceModalMasterRepo deviceModalMasterRepo;
   @Autowired
   VehicleTypeMasterRepo vehicleTypeMasterRepo;
   @Autowired
   PaymentStatusMasterRepo paymentStatusMasterRepo;
   @Autowired
   ExceptionMasterRepo exceptionMasterRepo;
   @Autowired
   MainTerminalMasterRepo mainTerminalMasterRepo;
   @Autowired
   CargoTypeMasterRepo cargoTypeMasterRepo;
   @Autowired
   FuelTypeMasterRepo fuelTypeMasterRepo;
   @Autowired
   UserMasterRepo userMasterRepo;
   @Autowired
   ReferModeMasterRepo referModeMasterRepo;
   @Autowired
   GeofanceMasterRepo geofanceMasterRepo;
   @Autowired
   TrailerMasterRepo trailerMasterRepo;
   private Path fileStorageLocation;
   private MongoTemplate mongoTemplate;

   @Autowired
   public MasterServiceImpl(MongoTemplate mongoTemplate) {
      this.mongoTemplate = mongoTemplate;
   }

   @Override
   public ResultWrapper<EmployeeMaster> AddEmployee(EmployeeMaster employeeInfo) {
      ResultWrapper<EmployeeMaster> result = new ResultWrapper<>();

      try {
         if (this.employeeMasterRepo.existsByEmail(employeeInfo.getEmail())) {
            result.setStatus(Result.FAIL);
            result.setMessage("Email already exists");
            return result;
         }

         if (employeeInfo.getCdlNo() != null && !employeeInfo.getCdlNo().trim().isEmpty()) {
            List<EmployeeMaster> existingCdlDrivers = this.employeeMasterRepo
               .findByCdlNoAndClientId(employeeInfo.getCdlNo().trim(), employeeInfo.getClientId());
            if (existingCdlDrivers != null && !existingCdlDrivers.isEmpty()) {
               result.setStatus(Result.FAIL);
               result.setMessage("Driver account with this Driver License (CDL) number already exists for this motor carrier.");
               return result;
            }
         }

         Integer ID = 0;
         Object maxID = this.employeeMasterRepo.findMaxIdInEmployeeMaster();
         if (maxID == null) {
            ID = 1;
            employeeInfo.setEmployeeId(ID);
         } else {
            ID = (Integer)maxID;
            ID = ID + 1;
            employeeInfo.setEmployeeId(ID);
         }

         Instant instant = Instant.now();
         employeeInfo.setAddedTimestamp(instant.toEpochMilli());
         employeeInfo.setUpdatedTimestamp(instant.toEpochMilli());
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
         LocalDate cdlExpiryDate = LocalDate.parse(employeeInfo.getCdlExpiryDate(), formatter);
         Instant iCdlExpiryDate = cdlExpiryDate.atStartOfDay(ZoneId.systemDefault()).toInstant();
         long timeInMillisCdlExpiryDate = iCdlExpiryDate.toEpochMilli();
         employeeInfo.setLCdlExpiryDate(timeInMillisCdlExpiryDate);
         employeeInfo.setIsFirstLogin("true");
         employeeInfo = (EmployeeMaster)this.employeeMasterRepo.save(employeeInfo);
         CycleUsa cycleUsaData = this.cycleUsaRepo.findByCycleUsaId((int)employeeInfo.getCycleUsaId());
         long remainingWeeklyTime = cycleUsaData.getCycleHour() * 60L * 60L;
         long remainingDutyTime = cycleUsaData.getOnDutyTime() * 60L * 60L;
         long remainingDriveTime = cycleUsaData.getOnDriveTime() * 60L * 60L;
         long remainingSleepTime = cycleUsaData.getOnSleepTime() * 60L * 60L;
         int cycleDays = (int)cycleUsaData.getCycleDays();
         Login login = new Login();
         login.setEmployeeId(employeeInfo.getEmployeeId());
         login.setEmail(employeeInfo.getEmail());
         login.setUsername(employeeInfo.getUsername());
         login.setPassword(employeeInfo.getPassword());
         login.setMobileNo(employeeInfo.getMobileNo());
         login.setLoginStatus("false");
         login.setDateTime(instant.toEpochMilli());
         this.loginRepo.save(login);
         int shift = 1;
         int days = 0;
         int create2ShiftDays = cycleDays * 2;
         ++create2ShiftDays;
         LocalDate currentDate = Instant.ofEpochMilli(employeeInfo.getAddedTimestamp()).atZone(ZoneId.systemDefault()).toLocalDate();

         for(int i = create2ShiftDays; i >= 1; --i) {
            LocalDate logDate = currentDate.minusDays((long)i);

            try {
               if (++days > cycleDays) {
                  ++shift;
                  days = 1;
               }

               DriveringStatus driveringStatusLog = new DriveringStatus();
               driveringStatusLog.setDriverId((long)employeeInfo.getEmployeeId().intValue());
               driveringStatusLog.setVehicleId(0L);
               driveringStatusLog.setStatus("OffDuty");
               driveringStatusLog.setLattitude(0.0);
               driveringStatusLog.setLongitude(0.0);
               driveringStatusLog.setDateTime(logDate + " 00:00:00");
               LocalDateTime ldtDate = LocalDateTime.of(logDate, LocalTime.MIDNIGHT);
               long lDateTime = ldtDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
               driveringStatusLog.setLDateTime(lDateTime);
               driveringStatusLog.setUtcDateTime(lDateTime);
               driveringStatusLog.setLogType("System Generated");
               driveringStatusLog.setAppVersion("0.0");
               driveringStatusLog.setOsVersion("0.0");
               driveringStatusLog.setIsVoilation(0);
               driveringStatusLog.setSimCardNo("0");
               driveringStatusLog.setNote("");
               driveringStatusLog.setCustomLocation("");
               driveringStatusLog.setCurrentLocation("");
               driveringStatusLog.setEngineHour("0");
               driveringStatusLog.setOrigin("");
               driveringStatusLog.setTimezone("");
               driveringStatusLog.setOdometer(0.0);
               driveringStatusLog.setShift(shift);
               driveringStatusLog.setDays(days);
               driveringStatusLog.setRemainingWeeklyTime(remainingWeeklyTime);
               driveringStatusLog.setRemainingDutyTime(remainingDutyTime);
               driveringStatusLog.setRemainingDriveTime(remainingDriveTime);
               driveringStatusLog.setRemainingSleepTime(remainingSleepTime);
               driveringStatusLog.setReceivedTimestamp(instant.toEpochMilli());
               driveringStatusLog.setIsVisible(1);
               this.driveringStatusRepo.save(driveringStatusLog);
               DriverStatusLog driverStatusLog = new DriverStatusLog();
               long maxId = this.lookupMaxIdOfDriverOperation((long)employeeInfo.getEmployeeId().intValue());
               if (maxId <= 0L) {
                  maxId = 1L;
                  driverStatusLog.setStatusId(maxId);
               } else {
                  driverStatusLog.setStatusId(++maxId);
               }

               Pageable pageableRequest = PageRequest.of(0, 1, Sort.by(new String[]{"_id"}).descending());
               Query queryLog = new Query(Criteria.where("employeeId").is(employeeInfo.getEmployeeId()));
               queryLog.limit(1);
               queryLog.with(pageableRequest);
               List<EmployeeMasterViewDto> employeeMasterViewDto = this.mongoTemplate.find(queryLog, EmployeeMasterViewDto.class, "employee_master");
               driverStatusLog.setLogDataId(employeeMasterViewDto.get(0).get_id());
               driverStatusLog.setDriverId((long)employeeInfo.getEmployeeId().intValue());
               driverStatusLog.setVehicleId(0L);
               driverStatusLog.setClientId(employeeInfo.getClientId());
               driverStatusLog.setStatus("OffDuty");
               driverStatusLog.setLattitude(0.0);
               driverStatusLog.setLongitude(0.0);
               driverStatusLog.setDateTime(lDateTime);
               driverStatusLog.setLogType("System Generated");
               driverStatusLog.setEngineHour("0");
               driverStatusLog.setOrigin("");
               driverStatusLog.setOdometer(0.0);
               driverStatusLog.setIsVoilation(0);
               driverStatusLog.setNote("");
               driverStatusLog.setCustomLocation("");
               driverStatusLog.setIsReportGenerated(0);
               driverStatusLog.setReceivedTimestamp(instant.toEpochMilli());
               driverStatusLog.setIsVisible(1);
               this.driverStatusLogRepo.save(driverStatusLog);
            } catch (Exception var38) {
               var38.printStackTrace();
            }
         }

         result.setResult(employeeInfo);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Employee Added Successfully");
      } catch (Exception var39) {
         result.setStatus(Result.FAIL);
         result.setMessage(var39.getLocalizedMessage());
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
   public ResultWrapper<List<EmployeeMasterViewDto>> ViewEmployee(EmployeeMasterCRUDDto employeeMasterCRUDDto, String tokenValid) {
      ResultWrapper<List<EmployeeMasterViewDto>> result = new ResultWrapper<>();

      try {
         List<EmployeeMasterViewDto> empInfo = null;
         Integer employeeId = employeeMasterCRUDDto.getEmployeeId();
         long clientId = employeeMasterCRUDDto.getClientId();
         if (employeeId == 0) {
            empInfo = this.lookupEmployeeMasterOperation(employeeId, clientId);

            for(int i = 0; i < empInfo.size(); ++i) {
               try {
                  Pageable pageableRequest = PageRequest.of(0, 1, Sort.by(new String[]{"_id"}).descending());
                  Query query = new Query(Criteria.where("driverId").is(empInfo.get(i).getEmployeeId()));
                  query.limit(1);
                  query.with(pageableRequest);
                  List<DriveringStatusViewDto> driveringStatusViewDtoData = this.mongoTemplate.find(query, DriveringStatusViewDto.class, "drivering_status");
                  if (driveringStatusViewDtoData.size() > 0) {
                     empInfo.get(i).setAppVersion(driveringStatusViewDtoData.get(0).getAppVersion());
                     empInfo.get(i).setOsVersion(driveringStatusViewDtoData.get(0).getOsVersion());
                     empInfo.get(i).setSimCardNo(driveringStatusViewDtoData.get(0).getSimCardNo());
                  }
               } catch (Exception var13) {
                  var13.printStackTrace();
               }
            }
         } else {
            empInfo = this.lookupEmployeeMasterOperation(employeeId, clientId);

            for(int i = 0; i < empInfo.size(); ++i) {
               try {
                  Pageable pageableRequest = PageRequest.of(0, 1, Sort.by(new String[]{"_id"}).descending());
                  Query query = new Query(Criteria.where("driverId").is(empInfo.get(i).getEmployeeId()));
                  query.limit(1);
                  query.with(pageableRequest);
                  List<DriveringStatusViewDto> driveringStatusViewDtoData = this.mongoTemplate.find(query, DriveringStatusViewDto.class, "drivering_status");
                  if (driveringStatusViewDtoData.size() > 0) {
                     empInfo.get(i).setAppVersion(driveringStatusViewDtoData.get(0).getAppVersion());
                     empInfo.get(i).setOsVersion(driveringStatusViewDtoData.get(0).getOsVersion());
                     empInfo.get(i).setSimCardNo(driveringStatusViewDtoData.get(0).getSimCardNo());
                  }
               } catch (Exception var12) {
                  var12.printStackTrace();
               }
            }
         }

         result.setResult(empInfo);
         result.setToken(tokenValid);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Employee Information Send Successfully");
      } catch (Exception var14) {
         result.setStatus(Result.FAIL);
         result.setMessage(var14.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<List<EmployeeMasterViewDto>> ViewEmployeeFirstLogin(EmployeeMasterCRUDDto employeeMasterCRUDDto, String tokenValid) {
      ResultWrapper<List<EmployeeMasterViewDto>> result = new ResultWrapper<>();

      try {
         List<EmployeeMasterViewDto> empInfo = null;
         long clientId = employeeMasterCRUDDto.getClientId();
         empInfo = this.employeeMasterRepo.findAndViewByEmployeeIdAndFirstLogin("false", clientId);
         result.setResult(empInfo);
         result.setToken(tokenValid);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Employee Information Send Successfully");
      } catch (Exception var7) {
         result.setStatus(Result.FAIL);
         result.setMessage(var7.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<List<EmployeeMasterListViewDto>> ViewEmployeeByClient(EmployeeMasterCRUDDto employeeMasterCRUDDto, String tokenValid) {
      ResultWrapper<List<EmployeeMasterListViewDto>> result = new ResultWrapper<>();

      try {
         List<EmployeeMasterListViewDto> empInfo = null;
         long clientId = employeeMasterCRUDDto.getClientId();
         Integer employeeId = employeeMasterCRUDDto.getEmployeeId();
         if (clientId > 0L) {
            empInfo = this.employeeMasterRepo.findAllEmployeeByClient(clientId);
            if (employeeId != null && employeeId > 0 && empInfo != null && employeeId != null && employeeId > 0) {
               empInfo = empInfo.stream().filter(emp -> emp != null && !employeeId.equals(emp.getEmployeeId())).collect(Collectors.toList());
            }

            result.setResult(empInfo);
            result.setToken(tokenValid);
            result.setStatus(Result.SUCCESS);
            result.setMessage("Employee Information Send Successfully");
         } else {
            result.setResult(empInfo);
            result.setToken(null);
            result.setStatus(Result.FAIL);
            result.setMessage("Invalid request.");
         }
      } catch (Exception var8) {
         result.setStatus(Result.FAIL);
         result.setMessage(var8.getLocalizedMessage());
      }

      return result;
   }

   public List<EmployeeMasterViewDto> lookupEmployeeMasterOperation(Integer employeeId, long clientId) {
      MatchOperation filter = null;
      if (employeeId > 0) {
         filter = Aggregation.match(Criteria.where("employeeId").is(employeeId).and("clientId").is(clientId));
      } else {
         filter = Aggregation.match(Criteria.where("clientId").is(clientId));
      }

      ProjectionOperation projectStage = Aggregation.project(
            new String[]{
               "employeeId",
               "title",
               "firstName",
               "lastName",
               "email",
               "username",
               "companyId",
               "languageId",
               "clientId",
               "startTime",
               "cycleUsaId",
               "cycleCanadaId",
               "mainTerminalId",
               "mobileNo",
               "cdlNo",
               "cdlCountryId",
               "cdlStateId",
               "cdlExpiryDate",
               "pdfEmail",
               "flatRate",
               "exempt",
               "personalUse",
               "yardMoves",
               "divR",
               "cargoTypeId",
               "truckNo",
               "manageEquipement",
               "transferLog",
               "remarks",
               "workingStatus",
               "addedTimestamp",
               "updatedTimestamp",
               "client_master.clientName",
               "cycle_usa_master.cycleUsaName",
               "cycle_canada_master.cycleCanadaName",
               "main_terminal_master.mainTerminalName",
               "country_master.countryName",
               "state_master.stateName",
               "cargo_type_master.cargoTypeName",
               "status",
               "vehicle_master.vehicleNo",
               "driverId",
               "password",
               "restartId",
               "restBreakId",
               "shortHaulException",
               "unlimitedTrailers",
               "unlimitedShippingDocs",
               "rest_break_master.restBreakName",
               "restart_master.restartName"
            }
         )
         .andExclude(new String[]{"_id"});
      LookupOperation client_master = LookupOperation.newLookup().from("client_master").localField("clientId").foreignField("clientId").as("client_master");
      LookupOperation cycle_usa_master = LookupOperation.newLookup()
         .from("cycle_usa_master")
         .localField("cycleUsaId")
         .foreignField("cycleUsaId")
         .as("cycle_usa_master");
      LookupOperation cycle_canada_master = LookupOperation.newLookup()
         .from("cycle_canada_master")
         .localField("cycleCanadaId")
         .foreignField("cycleCanadaId")
         .as("cycle_canada_master");
      LookupOperation main_terminal_master = LookupOperation.newLookup()
         .from("main_terminal_master")
         .localField("mainTerminalId")
         .foreignField("mainTerminalId")
         .as("main_terminal_master");
      LookupOperation country_master = LookupOperation.newLookup()
         .from("country_master")
         .localField("cdlCountryId")
         .foreignField("countryId")
         .as("country_master");
      LookupOperation state_master = LookupOperation.newLookup().from("state_master").localField("cdlStateId").foreignField("stateId").as("state_master");
      LookupOperation cargo_type_master = LookupOperation.newLookup()
         .from("cargo_type_master")
         .localField("cargoTypeId")
         .foreignField("cargoTypeId")
         .as("cargo_type_master");
      LookupOperation vehicle_master = LookupOperation.newLookup().from("vehicle_master").localField("truckNo").foreignField("vehicleId").as("vehicle_master");
      LookupOperation rest_break_master = LookupOperation.newLookup()
         .from("rest_break_master")
         .localField("restBreakId")
         .foreignField("restBreakId")
         .as("rest_break_master");
      LookupOperation restart_master = LookupOperation.newLookup()
         .from("restart_master")
         .localField("restartId")
         .foreignField("restartId")
         .as("restart_master");
      Aggregation aggregation = Aggregation.newAggregation(
         new AggregationOperation[]{
            filter,
            client_master,
            cycle_usa_master,
            cycle_canada_master,
            main_terminal_master,
            country_master,
            state_master,
            cargo_type_master,
            vehicle_master,
            rest_break_master,
            restart_master,
            projectStage
         }
      );
      return this.mongoTemplate.aggregate(aggregation, "employee_master", EmployeeMasterViewDto.class).getMappedResults();
   }

   @Override
   public ResultWrapper<EmployeeMaster> DeleteEmployee(EmployeeMasterCRUDDto employeeMasterCRUDDto) {
      ResultWrapper<EmployeeMaster> result = new ResultWrapper<>();

      try {
         EmployeeMaster empInfo = null;
         Integer employeeId = employeeMasterCRUDDto.getEmployeeId();
         if (employeeId > 0) {
            empInfo = this.employeeMasterRepo.DeleteEmployeeById(employeeId);
            Login loginRemove = this.loginRepo.DeleteEmployeeById(employeeId);
            Integer driverStatusCount = this.driveringStatusRepo.CountDriverStatusByDriverId((long)employeeId.intValue());
            Integer dvirCount = this.dvirDataRepo.CountDVIRByDriverId((long)employeeId.intValue());
            Integer certifiedLogCount = this.certifiedLogRepo.CountCertifiedLogByDriverId((long)employeeId.intValue());
            Integer loginLogCount = this.loginLogRepo.CountLoginByDriverId(employeeId);
            Integer dsLogCount = this.driverStatusLogRepo.CountDriverStatusLogByDriverId((long)employeeId.intValue());
            this.splitLogRepo.deleteAllSplitLogByDriverId((long)employeeId.intValue());

            for(int i = 0; i < dsLogCount; ++i) {
               this.driverStatusLogRepo.deleteAllDriveringStatusLogByDriverId((long)employeeId.intValue());
            }

            for(int i = 0; i < driverStatusCount; ++i) {
               this.driveringStatusRepo.deleteAllDriveringStatusByDriverId((long)employeeId.intValue());
            }

            for(int i = 0; i < dvirCount; ++i) {
               this.dvirDataRepo.deleteAllDVIRDataByDriverId((long)employeeId.intValue());
            }

            for(int i = 0; i < certifiedLogCount; ++i) {
               this.certifiedLogRepo.deleteAllCertifiedLogByDriverId((long)employeeId.intValue());
            }

            for(int i = 0; i < loginLogCount; ++i) {
               this.loginLogRepo.deleteAllLoginLogByDriverId(employeeId);
            }

            result.setResult(empInfo);
            result.setStatus(Result.SUCCESS);
            result.setMessage("Employee Information Delete Successfully");
         } else {
            result.setResult(empInfo);
            result.setStatus(Result.FAIL);
            result.setMessage("Invalid Request");
         }
      } catch (Exception var12) {
         result.setStatus(Result.FAIL);
         result.setMessage(var12.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<EmployeeMaster> UpdateEmployee(EmployeeMaster employeeInfo) {
      ResultWrapper<EmployeeMaster> result = new ResultWrapper<>();

      try {
         Instant instant = Instant.now();
         if (employeeInfo.getCdlNo() != null && !employeeInfo.getCdlNo().trim().isEmpty()) {
            List<EmployeeMaster> existingCdlDrivers = this.employeeMasterRepo
               .findByCdlNoAndClientIdAndNotEmployeeId(employeeInfo.getCdlNo().trim(), employeeInfo.getClientId(), employeeInfo.getEmployeeId());
            if (existingCdlDrivers != null && !existingCdlDrivers.isEmpty()) {
               result.setStatus(Result.FAIL);
               result.setMessage("Driver account with this Driver License (CDL) number already exists for this motor carrier.");
               return result;
            }
         }

         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
         LocalDate cdlExpiryDate = LocalDate.parse(employeeInfo.getCdlExpiryDate(), formatter);
         Instant iCdlExpiryDate = cdlExpiryDate.atStartOfDay(ZoneId.systemDefault()).toInstant();
         long timeInMillisCdlExpiryDate = iCdlExpiryDate.toEpochMilli();
         employeeInfo.setLCdlExpiryDate(timeInMillisCdlExpiryDate);
         Query query = new Query();
         query.addCriteria(Criteria.where("employeeId").is(employeeInfo.getEmployeeId()));
         Update update = new Update();
         update.set("title", employeeInfo.getTitle());
         update.set("firstName", employeeInfo.getFirstName());
         update.set("lastName", employeeInfo.getLastName());
         update.set("email", employeeInfo.getEmail());
         update.set("username", employeeInfo.getUsername());
         update.set("status", employeeInfo.getStatus());
         update.set("driverId", employeeInfo.getDriverId());
         update.set("password", employeeInfo.getPassword());
         update.set("restartId", employeeInfo.getRestartId());
         update.set("restBreakId", employeeInfo.getRestBreakId());
         update.set("shortHaulException", employeeInfo.getShortHaulException());
         update.set("unlimitedTrailers", employeeInfo.getUnlimitedTrailers());
         update.set("unlimitedShippingDocs", employeeInfo.getUnlimitedShippingDocs());
         update.set("clientId", employeeInfo.getClientId());
         update.set("companyId", employeeInfo.getCompanyId());
         update.set("languageId", employeeInfo.getLanguageId());
         update.set("startTime", employeeInfo.getStartTime());
         update.set("cycleUsaId", employeeInfo.getCycleUsaId());
         update.set("cycleCanadaId", employeeInfo.getCycleCanadaId());
         update.set("mainTerminalId", employeeInfo.getMainTerminalId());
         update.set("mobileNo", employeeInfo.getMobileNo());
         update.set("cdlNo", employeeInfo.getCdlNo());
         update.set("cdlCountryId", employeeInfo.getCdlCountryId());
         update.set("cdlStateId", employeeInfo.getCdlStateId());
         update.set("cdlExpiryDate", employeeInfo.getCdlExpiryDate());
         update.set("lCdlExpiryDate", employeeInfo.getLCdlExpiryDate());
         update.set("pdfEmail", employeeInfo.getPdfEmail());
         update.set("flatRate", employeeInfo.getFlatRate());
         update.set("exempt", employeeInfo.getExempt());
         update.set("personalUse", employeeInfo.getPersonalUse());
         update.set("yardMoves", employeeInfo.getYardMoves());
         update.set("divR", employeeInfo.getDivR());
         update.set("cargoTypeId", employeeInfo.getCargoTypeId());
         update.set("truckNo", employeeInfo.getTruckNo());
         update.set("manageEquipement", employeeInfo.getManageEquipement());
         update.set("transferLog", employeeInfo.getTransferLog());
         update.set("remarks", employeeInfo.getRemarks());
         update.set("updatedTimestamp", instant.toEpochMilli());
         this.mongoTemplate.findAndModify(query, update, EmployeeMaster.class);
         Query query1 = new Query();
         query1.addCriteria(Criteria.where("employeeId").is(employeeInfo.getEmployeeId()));
         Update update1 = new Update();
         update1.set("email", employeeInfo.getEmail());
         update1.set("username", employeeInfo.getUsername());
         update1.set("password", employeeInfo.getPassword());
         update1.set("mobileNo", employeeInfo.getMobileNo());
         update1.set("loginStatus", "true");
         if (employeeInfo.getStatus().equals("inactive")) {
            update1.set("tokenNo", "0");
         }

         update1.set("dateTime", instant.toEpochMilli());
         this.mongoTemplate.findAndModify(query1, update1, Login.class);
         result.setResult(employeeInfo);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Employee Updated Successfully");
      } catch (Exception var13) {
         result.setStatus(Result.FAIL);
         result.setMessage(var13.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<String> UpdateEmployeeActiveInactive(EmployeeMasterCRUDDto employeeMasterCRUDDto) {
      ResultWrapper<String> result = new ResultWrapper<>();

      try {
         Instant instant = Instant.now();
         Query query = new Query();
         query.addCriteria(Criteria.where("employeeId").is(employeeMasterCRUDDto.getEmployeeId()));
         Update update = new Update();
         update.set("status", employeeMasterCRUDDto.getStatus());
         update.set("updatedTimestamp", instant.toEpochMilli());
         this.mongoTemplate.findAndModify(query, update, EmployeeMaster.class);
         result.setResult("Updated");
         result.setStatus(Result.SUCCESS);
         result.setMessage("Driver Updated Successfully");
      } catch (Exception var6) {
         result.setStatus(Result.FAIL);
         result.setMessage(var6.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<List<DriverInfoViewDto>> ViewDriverInformation(EmployeeMasterCRUDDto employeeMasterCRUDDto, String tokenValid) {
      ResultWrapper<List<DriverInfoViewDto>> result = new ResultWrapper<>();

      try {
         List<DriverInfoViewDto> empInfo = null;
         Integer employeeId = employeeMasterCRUDDto.getEmployeeId();
         if (employeeId > 0) {
            empInfo = this.employeeMasterRepo.findAndViewByDriverId(employeeId);

            for(int i = 0; i < empInfo.size(); ++i) {
               if (empInfo.get(i).getClientId() > 0L) {
                  try {
                     ClientMaster clientInfo = this.clientMasterRepo.findByClientId((int)empInfo.get(i).getClientId());
                     empInfo.get(i).setCompanyName(clientInfo.getClientName());
                  } catch (Exception var15) {
                     var15.printStackTrace();
                  }
               }

               if (empInfo.get(i).getCdlStateId() > 0L) {
                  try {
                     StateMaster stateInfo = this.stateMasterRepo.findByStateId((int)empInfo.get(i).getCdlStateId());
                     empInfo.get(i).setCdlStateName(stateInfo.getStateName());
                     empInfo.get(i).setTimeZone(stateInfo.getTimeZone());
                  } catch (Exception var14) {
                     var14.printStackTrace();
                  }
               }

               if (empInfo.get(i).getLanguageId() > 0L) {
                  try {
                     LanguageMaster languageInfo = this.languageMasterRepo.findByLanguageId((int)empInfo.get(i).getLanguageId());
                     empInfo.get(i).setLanguageName(languageInfo.getLanguageName());
                  } catch (Exception var13) {
                     var13.printStackTrace();
                  }
               }

               if (empInfo.get(i).getMainTerminalId() > 0L) {
                  try {
                     MainTerminalMaster mainTerminal = this.mainTerminalMasterRepo.findByMainTerminalId((int)empInfo.get(i).getMainTerminalId());
                     empInfo.get(i).setMainOfficeAddress(mainTerminal.getMainTerminalName());
                     empInfo.get(i).setHomeTerminalAddress(mainTerminal.getMainTerminalName());
                  } catch (Exception var12) {
                     var12.printStackTrace();
                  }
               }
            }
         } else {
            empInfo = this.employeeMasterRepo.findAndViewByDrivers();

            for(int i = 0; i < empInfo.size(); ++i) {
               if (empInfo.get(i).getClientId() > 0L) {
                  try {
                     ClientMaster clientInfo = this.clientMasterRepo.findByClientId((int)empInfo.get(i).getClientId());
                     empInfo.get(i).setCompanyName(clientInfo.getClientName());
                  } catch (Exception var11) {
                     var11.printStackTrace();
                  }
               }

               if (empInfo.get(i).getCdlStateId() > 0L) {
                  try {
                     StateMaster stateInfo = this.stateMasterRepo.findByStateId((int)empInfo.get(i).getCdlStateId());
                     empInfo.get(i).setCdlStateName(stateInfo.getStateName());
                     empInfo.get(i).setTimeZone(stateInfo.getTimeZone());
                  } catch (Exception var10) {
                     var10.printStackTrace();
                  }
               }

               if (empInfo.get(i).getLanguageId() > 0L) {
                  try {
                     LanguageMaster languageInfo = this.languageMasterRepo.findByLanguageId((int)empInfo.get(i).getLanguageId());
                     empInfo.get(i).setLanguageName(languageInfo.getLanguageName());
                  } catch (Exception var9) {
                     var9.printStackTrace();
                  }
               }

               if (empInfo.get(i).getMainTerminalId() > 0L) {
                  try {
                     MainTerminalMaster mainTerminal = this.mainTerminalMasterRepo.findByMainTerminalId((int)empInfo.get(i).getMainTerminalId());
                     empInfo.get(i).setMainOfficeAddress(mainTerminal.getMainTerminalName());
                     empInfo.get(i).setHomeTerminalAddress(mainTerminal.getMainTerminalName());
                  } catch (Exception var8) {
                     var8.printStackTrace();
                  }
               }
            }
         }

         result.setResult(empInfo);
         result.setToken(tokenValid);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Employee Information Send Successfully");
      } catch (Exception var16) {
         result.setStatus(Result.FAIL);
         result.setMessage(var16.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<String> TokenCheckingAPI(EmployeeMasterCRUDDto employeeMasterCRUDDto, String serverToken) {
      ResultWrapper<String> result = new ResultWrapper<>();

      try {
         String tokenNo = employeeMasterCRUDDto.getTokenNo();
         Integer empId = employeeMasterCRUDDto.getEmployeeId();
         result.setResult(tokenNo + empId);
         result.setToken(serverToken);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Token Information Send Successfully");
      } catch (Exception var6) {
         result.setStatus(Result.FAIL);
         result.setMessage(var6.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<DeviceMaster> AddDevice(DeviceMaster deviceMaster) {
      ResultWrapper<DeviceMaster> result = new ResultWrapper<>();

      try {
         Integer ID = 0;
         Object maxID = this.deviceMasterRepo.findMaxIdInDeviceMaster();
         if (maxID == null) {
            ID = 1;
            deviceMaster.setDeviceId(ID);
         } else {
            ID = (Integer)maxID;
            ID = ID + 1;
            deviceMaster.setDeviceId(ID);
         }

         Instant instant = Instant.now();
         deviceMaster.setAddedTimestamp(instant.toEpochMilli());
         deviceMaster.setUpdatedTimestamp(instant.toEpochMilli());
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
         LocalDate billingDate = LocalDate.parse(deviceMaster.getBillingDate(), formatter);
         Instant iBillingDate = billingDate.atStartOfDay(ZoneId.systemDefault()).toInstant();
         long timeInMillisBillingDate = iBillingDate.toEpochMilli();
         deviceMaster.setLBillingDate(timeInMillisBillingDate);
         LocalDate warrantyFromDate = LocalDate.parse(deviceMaster.getWarrantyFromDate(), formatter);
         Instant iWarrantyFromDate = warrantyFromDate.atStartOfDay(ZoneId.systemDefault()).toInstant();
         long timeInMillisWarrantyFromDate = iWarrantyFromDate.toEpochMilli();
         deviceMaster.setLWarrantyFromDate(timeInMillisWarrantyFromDate);
         LocalDate warrantyToDate = LocalDate.parse(deviceMaster.getWarrantyToDate(), formatter);
         Instant iWarrantyToDate = warrantyToDate.atStartOfDay(ZoneId.systemDefault()).toInstant();
         long timeInMillisWarrantyToDate = iWarrantyToDate.toEpochMilli();
         deviceMaster.setLWarrantyToDate(timeInMillisWarrantyToDate);
         deviceMaster = (DeviceMaster)this.deviceMasterRepo.save(deviceMaster);
         result.setResult(deviceMaster);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Device Added Successfully");
      } catch (Exception var19) {
         result.setStatus(Result.FAIL);
         result.setMessage(var19.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<List<DeviceMasterViewDto>> ViewDevice(DeviceMasterCRUDDto deviceMasterCRUDDto) {
      ResultWrapper<List<DeviceMasterViewDto>> result = new ResultWrapper<>();

      try {
         List<DeviceMasterViewDto> deviceInfo = null;
         Integer deviceId = deviceMasterCRUDDto.getDeviceId();
         long clientId = deviceMasterCRUDDto.getClientId();
         if (deviceId == 0) {
            deviceInfo = this.deviceMasterRepo.findAllDeviceData(clientId);

            for(int i = 0; i < deviceInfo.size(); ++i) {
               ClientMaster clientMaster = this.clientMasterRepo.findByClientId((int)deviceInfo.get(i).getClientId());
               deviceInfo.get(i).setClientName(clientMaster.getClientName());
               DeviceModalMaster deviceModalMaster = this.deviceModalMasterRepo.findByDeviceModalId((int)deviceInfo.get(i).getDeviceModelId());
               deviceInfo.get(i).setDeviceModelName(deviceModalMaster.getDeviceModalName());
               if (deviceInfo.get(i).getVehicleId() > 0L) {
                  VehicleMaster vehicleMaster = this.vehicleMasterRepo.findByVehicleId((int)deviceInfo.get(i).getVehicleId());
                  deviceInfo.get(i).setVehicleNo(vehicleMaster.getVehicleNo());
               }
            }
         } else {
            deviceInfo = this.deviceMasterRepo.findAndViewByDeviceId1(deviceId, clientId);

            for(int i = 0; i < deviceInfo.size(); ++i) {
               ClientMaster clientMaster = this.clientMasterRepo.findByClientId((int)deviceInfo.get(i).getClientId());
               deviceInfo.get(i).setClientName(clientMaster.getClientName());
               DeviceModalMaster deviceModalMaster = this.deviceModalMasterRepo.findByDeviceModalId((int)deviceInfo.get(i).getDeviceModelId());
               deviceInfo.get(i).setDeviceModelName(deviceModalMaster.getDeviceModalName());
               if (deviceInfo.get(i).getVehicleId() > 0L) {
                  VehicleMaster vehicleMaster = this.vehicleMasterRepo.findByVehicleId((int)deviceInfo.get(i).getVehicleId());
                  deviceInfo.get(i).setVehicleNo(vehicleMaster.getVehicleNo());
               }
            }
         }

         result.setResult(deviceInfo);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Device Information Send Successfully");
      } catch (Exception var11) {
         result.setStatus(Result.FAIL);
         result.setMessage(var11.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<DeviceMaster> DeleteDevice(DeviceMasterCRUDDto deviceMasterCRUDDto) {
      ResultWrapper<DeviceMaster> result = new ResultWrapper<>();

      try {
         DeviceMaster deviceInfo = null;
         Integer deviceId = deviceMasterCRUDDto.getDeviceId();
         if (deviceId > 0) {
            deviceInfo = this.deviceMasterRepo.DeleteDeviceById(deviceId);
            result.setResult(deviceInfo);
            result.setStatus(Result.SUCCESS);
            result.setMessage("Device Information Delete Successfully");
         } else {
            result.setResult(deviceInfo);
            result.setStatus(Result.FAIL);
            result.setMessage("Invalid Request");
         }
      } catch (Exception var5) {
         result.setStatus(Result.FAIL);
         result.setMessage(var5.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<DeviceMaster> UpdateDevice(DeviceMaster deviceMaster) {
      ResultWrapper<DeviceMaster> result = new ResultWrapper<>();

      try {
         Instant instant = Instant.now();
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
         LocalDate billingDate = LocalDate.parse(deviceMaster.getBillingDate(), formatter);
         Instant iBillingDate = billingDate.atStartOfDay(ZoneId.systemDefault()).toInstant();
         long timeInMillisBillingDate = iBillingDate.toEpochMilli();
         deviceMaster.setLBillingDate(timeInMillisBillingDate);
         LocalDate warrantyFromDate = LocalDate.parse(deviceMaster.getWarrantyFromDate(), formatter);
         Instant iWarrantyFromDate = warrantyFromDate.atStartOfDay(ZoneId.systemDefault()).toInstant();
         long timeInMillisWarrantyFromDate = iWarrantyFromDate.toEpochMilli();
         deviceMaster.setLWarrantyFromDate(timeInMillisWarrantyFromDate);
         LocalDate warrantyToDate = LocalDate.parse(deviceMaster.getWarrantyToDate(), formatter);
         Instant iWarrantyToDate = warrantyToDate.atStartOfDay(ZoneId.systemDefault()).toInstant();
         long timeInMillisWarrantyToDate = iWarrantyToDate.toEpochMilli();
         deviceMaster.setLWarrantyToDate(timeInMillisWarrantyToDate);
         Query query = new Query();
         query.addCriteria(Criteria.where("deviceId").is(deviceMaster.getDeviceId()));
         Update update = new Update();
         update.set("deviceNo", deviceMaster.getDeviceNo());
         update.set("macId", deviceMaster.getMacId());
         update.set("clientId", deviceMaster.getClientId());
         update.set("vehicleId", deviceMaster.getVehicleId());
         update.set("serialNo", deviceMaster.getSerialNo());
         update.set("deviceModelId", deviceMaster.getDeviceModelId());
         update.set("billingDate", deviceMaster.getBillingDate());
         update.set("lBillingDate", deviceMaster.getLBillingDate());
         update.set("warranty", deviceMaster.getWarranty());
         update.set("warrantyFromDate", deviceMaster.getWarrantyFromDate());
         update.set("lWarrantyFromDate", deviceMaster.getLWarrantyFromDate());
         update.set("warrantyToDate", deviceMaster.getWarrantyToDate());
         update.set("lWarrantyToDate", deviceMaster.getLWarrantyToDate());
         update.set("status", deviceMaster.getStatus());
         update.set("malFunction", deviceMaster.getMalFunction());
         update.set("fwVersion", deviceMaster.getFwVersion());
         update.set("updatedTimestamp", instant.toEpochMilli());
         this.mongoTemplate.findAndModify(query, update, DeviceMaster.class);
         result.setResult(deviceMaster);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Device Updated Successfully");
      } catch (Exception var19) {
         result.setStatus(Result.FAIL);
         result.setMessage(var19.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<VehicleMaster> AddVehicle(VehicleMaster vehicleMaster) {
      ResultWrapper<VehicleMaster> result = new ResultWrapper<>();

      try {
         Integer ID = 0;
         Object maxID = this.vehicleMasterRepo.findMaxIdInVehicleMaster();
         if (maxID == null) {
            ID = 1;
            vehicleMaster.setVehicleId(ID);
         } else {
            ID = (Integer)maxID;
            ID = ID + 1;
            vehicleMaster.setVehicleId(ID);
         }

         Instant instant = Instant.now();
         vehicleMaster.setAddedTimestamp(instant.toEpochMilli());
         vehicleMaster.setUpdatedTimestamp(instant.toEpochMilli());
         vehicleMaster = (VehicleMaster)this.vehicleMasterRepo.save(vehicleMaster);
         result.setResult(vehicleMaster);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Vehicle Added Successfully");
      } catch (Exception var6) {
         result.setStatus(Result.FAIL);
         result.setMessage(var6.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<List<VehicleMasterViewDto>> ViewVehicle(VehicleMasterCRUDDto vehicleMasterCRUDDto, String tokenValid) {
      ResultWrapper<List<VehicleMasterViewDto>> result = new ResultWrapper<>();

      try {
         List<VehicleMasterViewDto> vehicleInfo = null;
         Integer vehicleId = vehicleMasterCRUDDto.getVehicleId();
         long clientId = vehicleMasterCRUDDto.getClientId();
         if (vehicleId == 0) {
            vehicleInfo = this.vehicleMasterRepo.findAllVehicles(clientId);

            for(int i = 0; i < vehicleInfo.size(); ++i) {
               try {
                  if (vehicleInfo.get(i).getDeviceId() > 0L) {
                     DeviceMaster deviceMaster = this.deviceMasterRepo.findByDeviceId((int)vehicleInfo.get(i).getDeviceId());
                     vehicleInfo.get(i).setDeviceName(deviceMaster.getDeviceNo());
                  } else {
                     vehicleInfo.get(i).setDeviceName("");
                  }
               } catch (Exception var13) {
                  var13.printStackTrace();
               }

               try {
                  List<MACAddressMaster> macAddressData = this.macAddressMasterRepo
                     .findByMACAddressMasterByVehicleId((long)vehicleInfo.get(i).getVehicleId().intValue());
                  vehicleInfo.get(i).setMacAddress(macAddressData.get(0).getMacAddress());
                  vehicleInfo.get(i).setSerialNo(macAddressData.get(0).getSerialNo());
                  vehicleInfo.get(i).setVersion(macAddressData.get(0).getVersion());
                  vehicleInfo.get(i).setModelNo(macAddressData.get(0).getModelNo());
                  vehicleInfo.get(i).setDeviceStatus(macAddressData.get(0).getDeviceStatus());
               } catch (Exception var12) {
                  var12.printStackTrace();
               }
            }
         } else {
            vehicleInfo = this.vehicleMasterRepo.findAndViewByVehicleId(vehicleId, clientId);

            for(int i = 0; i < vehicleInfo.size(); ++i) {
               try {
                  if (vehicleInfo.get(i).getDeviceId() > 0L) {
                     DeviceMaster deviceMaster = this.deviceMasterRepo.findByDeviceId((int)vehicleInfo.get(i).getDeviceId());
                     vehicleInfo.get(i).setDeviceName(deviceMaster.getDeviceNo());
                  } else {
                     vehicleInfo.get(i).setDeviceName("");
                  }
               } catch (Exception var11) {
                  var11.printStackTrace();
               }

               try {
                  List<MACAddressMaster> macAddressData = this.macAddressMasterRepo
                     .findByMACAddressMasterByVehicleId((long)vehicleInfo.get(i).getVehicleId().intValue());
                  vehicleInfo.get(i).setMacAddress(macAddressData.get(0).getMacAddress());
                  vehicleInfo.get(i).setSerialNo(macAddressData.get(0).getSerialNo());
                  vehicleInfo.get(i).setVersion(macAddressData.get(0).getVersion());
                  vehicleInfo.get(i).setModelNo(macAddressData.get(0).getModelNo());
                  vehicleInfo.get(i).setDeviceStatus(macAddressData.get(0).getDeviceStatus());
               } catch (Exception var10) {
                  var10.printStackTrace();
               }
            }
         }

         result.setResult(vehicleInfo);
         result.setToken(tokenValid);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Vehicle Information Send Successfully");
      } catch (Exception var14) {
         result.setStatus(Result.FAIL);
         result.setMessage(var14.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<List<VehicleMasterViewDto>> ViewActiveVehicle(VehicleMasterCRUDDto vehicleMasterCRUDDto, String tokenValid) {
      ResultWrapper<List<VehicleMasterViewDto>> result = new ResultWrapper<>();

      try {
         List<VehicleMasterViewDto> vehicleInfo = null;
         Integer vehicleId = vehicleMasterCRUDDto.getVehicleId();
         long clientId = vehicleMasterCRUDDto.getClientId();
         if (vehicleId == 0 && clientId == 0L) {
            vehicleInfo = this.vehicleMasterRepo.findAllVehicleList();
         } else if (vehicleId == 0) {
            vehicleInfo = this.vehicleMasterRepo.findAllActiveVehicles(clientId, "active");
         } else {
            vehicleInfo = this.vehicleMasterRepo.findAndViewByVehicleId(vehicleId, clientId);
         }

         for(int i = 0; i < vehicleInfo.size(); ++i) {
            try {
               if (vehicleInfo.get(i).getDeviceId() > 0L) {
                  DeviceMaster deviceMaster = this.deviceMasterRepo.findByDeviceId((int)vehicleInfo.get(i).getDeviceId());
                  vehicleInfo.get(i).setDeviceName(deviceMaster.getDeviceNo());
               } else {
                  vehicleInfo.get(i).setDeviceName("");
               }
            } catch (Exception var11) {
               var11.printStackTrace();
            }

            try {
               List<MACAddressMaster> macAddressData = this.macAddressMasterRepo
                  .findByMACAddressMasterByVehicleId((long)vehicleInfo.get(i).getVehicleId().intValue());
               vehicleInfo.get(i).setMacAddress(macAddressData.get(0).getMacAddress());
               vehicleInfo.get(i).setSerialNo(macAddressData.get(0).getSerialNo());
               vehicleInfo.get(i).setVersion(macAddressData.get(0).getVersion());
               vehicleInfo.get(i).setModelNo(macAddressData.get(0).getModelNo());
               vehicleInfo.get(i).setDeviceStatus(macAddressData.get(0).getDeviceStatus());
            } catch (Exception var10) {
               var10.printStackTrace();
            }
         }

         result.setResult(vehicleInfo);
         result.setToken(tokenValid);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Vehicle Information Send Successfully");
      } catch (Exception var12) {
         result.setStatus(Result.FAIL);
         result.setMessage(var12.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<VehicleMaster> DeleteVehicle(VehicleMasterCRUDDto vehicleMasterCRUDDto) {
      ResultWrapper<VehicleMaster> result = new ResultWrapper<>();

      try {
         VehicleMaster vehicleInfo = null;
         Integer vehicleId = vehicleMasterCRUDDto.getVehicleId();
         if (vehicleId > 0) {
            vehicleInfo = this.vehicleMasterRepo.DeleteVehicleById(vehicleId);
            result.setResult(vehicleInfo);
            result.setStatus(Result.SUCCESS);
            result.setMessage("Vehicle Information Delete Successfully");
         } else {
            result.setResult(vehicleInfo);
            result.setStatus(Result.FAIL);
            result.setMessage("Invalid Request");
         }
      } catch (Exception var5) {
         result.setStatus(Result.FAIL);
         result.setMessage(var5.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<VehicleMaster> UpdateVehicle(VehicleMaster vehicleMaster) {
      ResultWrapper<VehicleMaster> result = new ResultWrapper<>();

      try {
         Instant instant = Instant.now();
         Query query = new Query();
         query.addCriteria(Criteria.where("vehicleId").is(vehicleMaster.getVehicleId()));
         Update update = new Update();
         update.set("clientId", vehicleMaster.getClientId());
         update.set("vehicleNo", vehicleMaster.getVehicleNo());
         update.set("make", vehicleMaster.getMake());
         update.set("model", vehicleMaster.getModel());
         update.set("manufacturingYear", vehicleMaster.getManufacturingYear());
         update.set("licensePlate", vehicleMaster.getLicensePlate());
         update.set("countryId", vehicleMaster.getCountryId());
         update.set("stateId", vehicleMaster.getStateId());
         update.set("vin", vehicleMaster.getVin());
         update.set("fuelTypeId", vehicleMaster.getFuelTypeId());
         update.set("deviceId", vehicleMaster.getDeviceId());
         update.set("status", vehicleMaster.getStatus());
         update.set("eldConnectionInterfaceId", vehicleMaster.getEldConnectionInterfaceId());
         update.set("updatedTimestamp", instant.toEpochMilli());
         this.mongoTemplate.findAndModify(query, update, VehicleMaster.class);
         result.setResult(vehicleMaster);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Vehicle Updated Successfully");
      } catch (Exception var6) {
         result.setStatus(Result.FAIL);
         result.setMessage(var6.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<CountryMaster> AddCountry(CountryMaster countryMaster) {
      ResultWrapper<CountryMaster> result = new ResultWrapper<>();

      try {
         Integer ID = 0;
         Object maxID = this.countryMasterRepo.findMaxIdInCountryMaster();
         if (maxID == null) {
            ID = 1;
            countryMaster.setCountryId(ID);
         } else {
            ID = (Integer)maxID;
            ID = ID + 1;
            countryMaster.setCountryId(ID);
         }

         Instant instant = Instant.now();
         countryMaster.setAddedTimestamp(instant.toEpochMilli());
         countryMaster.setUpdatedTimestamp(instant.toEpochMilli());
         countryMaster = (CountryMaster)this.countryMasterRepo.save(countryMaster);
         result.setResult(countryMaster);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Country Added Successfully");
      } catch (Exception var6) {
         result.setStatus(Result.FAIL);
         result.setMessage(var6.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<List<CountryMaster>> ViewCountry(CountryStateCityMasterCRUDDto countryStateCityMasterCRUDDto) {
      ResultWrapper<List<CountryMaster>> result = new ResultWrapper<>();

      try {
         List<CountryMaster> countryInfo = null;
         Integer countryId = countryStateCityMasterCRUDDto.getCountryId();
         if (countryId == 0) {
            countryInfo = this.countryMasterRepo.findAll();
         } else {
            countryInfo = this.countryMasterRepo.findAndViewByCountryId(countryId);
         }

         result.setResult(countryInfo);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Country Information Send Successfully");
      } catch (Exception var5) {
         result.setStatus(Result.FAIL);
         result.setMessage(var5.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<CountryMaster> DeleteCountry(CountryStateCityMasterCRUDDto countryStateCityMasterCRUDDto) {
      ResultWrapper<CountryMaster> result = new ResultWrapper<>();

      try {
         CountryMaster countryInfo = null;
         Integer countryId = countryStateCityMasterCRUDDto.getCountryId();
         if (countryId > 0) {
            countryInfo = this.countryMasterRepo.DeleteCountryById(countryId);
            result.setResult(countryInfo);
            result.setStatus(Result.SUCCESS);
            result.setMessage("Country Information Delete Successfully");
         } else {
            result.setResult(countryInfo);
            result.setStatus(Result.FAIL);
            result.setMessage("Invalid Request");
         }
      } catch (Exception var5) {
         result.setStatus(Result.FAIL);
         result.setMessage(var5.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<CountryMaster> UpdateCountry(CountryMaster countryMaster) {
      ResultWrapper<CountryMaster> result = new ResultWrapper<>();

      try {
         Instant instant = Instant.now();
         Query query = new Query();
         query.addCriteria(Criteria.where("countryId").is(countryMaster.getCountryId()));
         Update update = new Update();
         update.set("countryCode", countryMaster.getCountryCode());
         update.set("countryName", countryMaster.getCountryName());
         update.set("lattitude", countryMaster.getLattitude());
         update.set("longitude", countryMaster.getLongitude());
         update.set("clientId", countryMaster.getClientId());
         update.set("updatedTimestamp", instant.toEpochMilli());
         this.mongoTemplate.findAndModify(query, update, CountryMaster.class);
         result.setResult(countryMaster);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Country Updated Successfully");
      } catch (Exception var6) {
         result.setStatus(Result.FAIL);
         result.setMessage(var6.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<StateMaster> AddState(StateMaster stateMaster) {
      ResultWrapper<StateMaster> result = new ResultWrapper<>();

      try {
         Integer ID = 0;
         Object maxID = this.stateMasterRepo.findMaxIdInStateMaster();
         if (maxID == null) {
            ID = 1;
            stateMaster.setStateId(ID);
         } else {
            ID = (Integer)maxID;
            ID = ID + 1;
            stateMaster.setStateId(ID);
         }

         Instant instant = Instant.now();
         stateMaster.setAddedTimestamp(instant.toEpochMilli());
         stateMaster.setUpdatedTimestamp(instant.toEpochMilli());
         stateMaster = (StateMaster)this.stateMasterRepo.save(stateMaster);
         result.setResult(stateMaster);
         result.setStatus(Result.SUCCESS);
         result.setMessage("State Added Successfully");
      } catch (Exception var6) {
         result.setStatus(Result.FAIL);
         result.setMessage(var6.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<List<StateMaster>> ViewState(CountryStateCityMasterCRUDDto countryStateCityMasterCRUDDto) {
      ResultWrapper<List<StateMaster>> result = new ResultWrapper<>();

      try {
         List<StateMaster> stateInfo = null;
         Integer stateId = countryStateCityMasterCRUDDto.getStateId();
         if (stateId == 0) {
            stateInfo = this.stateMasterRepo.findAll();
         } else {
            stateInfo = this.stateMasterRepo.findAndViewByStateId(stateId);
         }

         result.setResult(stateInfo);
         result.setStatus(Result.SUCCESS);
         result.setMessage("State Information Send Successfully");
      } catch (Exception var5) {
         result.setStatus(Result.FAIL);
         result.setMessage(var5.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<List<StateMaster>> ViewStateByCountry(CountryStateCityMasterCRUDDto countryStateCityMasterCRUDDto) {
      ResultWrapper<List<StateMaster>> result = new ResultWrapper<>();

      try {
         List<StateMaster> stateInfo = null;
         Integer countryId = countryStateCityMasterCRUDDto.getCountryId();
         if (countryId == 0) {
            stateInfo = this.stateMasterRepo.findAll();
         } else {
            stateInfo = this.stateMasterRepo.findAndViewByCountryId(countryId);
         }

         result.setResult(stateInfo);
         result.setStatus(Result.SUCCESS);
         result.setMessage("State Information Send Successfully");
      } catch (Exception var5) {
         result.setStatus(Result.FAIL);
         result.setMessage(var5.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<StateMaster> DeleteState(CountryStateCityMasterCRUDDto countryStateCityMasterCRUDDto) {
      ResultWrapper<StateMaster> result = new ResultWrapper<>();

      try {
         StateMaster stateInfo = null;
         Integer stateId = countryStateCityMasterCRUDDto.getStateId();
         if (stateId > 0) {
            stateInfo = this.stateMasterRepo.DeleteStateById(stateId);
            result.setResult(stateInfo);
            result.setStatus(Result.SUCCESS);
            result.setMessage("State Information Delete Successfully");
         } else {
            result.setResult(stateInfo);
            result.setStatus(Result.FAIL);
            result.setMessage("Invalid Request");
         }
      } catch (Exception var5) {
         result.setStatus(Result.FAIL);
         result.setMessage(var5.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<StateMaster> UpdateState(StateMaster stateMaster) {
      ResultWrapper<StateMaster> result = new ResultWrapper<>();

      try {
         Instant instant = Instant.now();
         Query query = new Query();
         query.addCriteria(Criteria.where("stateId").is(stateMaster.getStateId()));
         Update update = new Update();
         update.set("countryId", stateMaster.getCountryId());
         update.set("stateName", stateMaster.getStateName());
         update.set("stateCode", stateMaster.getStateCode());
         update.set("timeZone", stateMaster.getTimeZone());
         update.set("timezoneOffSet", stateMaster.getTimezoneOffSet());
         update.set("clientId", stateMaster.getClientId());
         update.set("geofanceId", stateMaster.getGeofanceId());
         update.set("updatedTimestamp", instant.toEpochMilli());
         this.mongoTemplate.findAndModify(query, update, StateMaster.class);
         result.setResult(stateMaster);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Country Updated Successfully");
      } catch (Exception var6) {
         result.setStatus(Result.FAIL);
         result.setMessage(var6.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<CityMaster> AddCity(CityMaster cityMaster) {
      ResultWrapper<CityMaster> result = new ResultWrapper<>();

      try {
         Integer ID = 0;
         Object maxID = this.cityMasterRepo.findMaxIdInCityMaster();
         if (maxID == null) {
            ID = 1;
            cityMaster.setCityId(ID);
         } else {
            ID = (Integer)maxID;
            ID = ID + 1;
            cityMaster.setCityId(ID);
         }

         Instant instant = Instant.now();
         cityMaster.setAddedTimestamp(instant.toEpochMilli());
         cityMaster.setUpdatedTimestamp(instant.toEpochMilli());
         cityMaster = (CityMaster)this.cityMasterRepo.save(cityMaster);
         result.setResult(cityMaster);
         result.setStatus(Result.SUCCESS);
         result.setMessage("City Added Successfully");
      } catch (Exception var6) {
         result.setStatus(Result.FAIL);
         result.setMessage(var6.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<List<CityMaster>> ViewCity(CountryStateCityMasterCRUDDto countryStateCityMasterCRUDDto) {
      ResultWrapper<List<CityMaster>> result = new ResultWrapper<>();

      try {
         List<CityMaster> cityInfo = null;
         Integer cityId = countryStateCityMasterCRUDDto.getCityId();
         if (cityId == 0) {
            cityInfo = this.cityMasterRepo.findAll();
         } else {
            cityInfo = this.cityMasterRepo.findAndViewByCityId(cityId);
         }

         result.setResult(cityInfo);
         result.setStatus(Result.SUCCESS);
         result.setMessage("City Information Send Successfully");
      } catch (Exception var5) {
         result.setStatus(Result.FAIL);
         result.setMessage(var5.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<CityMaster> DeleteCity(CountryStateCityMasterCRUDDto countryStateCityMasterCRUDDto) {
      ResultWrapper<CityMaster> result = new ResultWrapper<>();

      try {
         CityMaster cityInfo = null;
         Integer cityId = countryStateCityMasterCRUDDto.getCityId();
         if (cityId > 0) {
            cityInfo = this.cityMasterRepo.DeleteCityById(cityId);
            result.setResult(cityInfo);
            result.setStatus(Result.SUCCESS);
            result.setMessage("City Information Delete Successfully");
         } else {
            result.setResult(cityInfo);
            result.setStatus(Result.FAIL);
            result.setMessage("Invalid Request");
         }
      } catch (Exception var5) {
         result.setStatus(Result.FAIL);
         result.setMessage(var5.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<CityMaster> UpdateCity(CityMaster cityMaster) {
      ResultWrapper<CityMaster> result = new ResultWrapper<>();

      try {
         Instant instant = Instant.now();
         Query query = new Query();
         query.addCriteria(Criteria.where("cityId").is(cityMaster.getCityId()));
         Update update = new Update();
         update.set("countryId", cityMaster.getCountryId());
         update.set("stateId", cityMaster.getStateId());
         update.set("cityName", cityMaster.getCityName());
         update.set("clientId", cityMaster.getClientId());
         update.set("updatedTimestamp", instant.toEpochMilli());
         this.mongoTemplate.findAndModify(query, update, CityMaster.class);
         result.setResult(cityMaster);
         result.setStatus(Result.SUCCESS);
         result.setMessage("City Updated Successfully");
      } catch (Exception var6) {
         result.setStatus(Result.FAIL);
         result.setMessage(var6.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<ProductMaster> AddProduct(ProductMaster productMaster) {
      ResultWrapper<ProductMaster> result = new ResultWrapper<>();

      try {
         Integer ID = 0;
         Object maxID = this.productMasterRepo.findMaxIdInProductMaster();
         if (maxID == null) {
            ID = 1;
            productMaster.setProductId(ID);
         } else {
            ID = (Integer)maxID;
            ID = ID + 1;
            productMaster.setProductId(ID);
         }

         Instant instant = Instant.now();
         productMaster.setAddedTimestamp(instant.toEpochMilli());
         productMaster.setUpdatedTimestamp(instant.toEpochMilli());
         productMaster = (ProductMaster)this.productMasterRepo.save(productMaster);
         result.setResult(productMaster);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Product Added Successfully");
      } catch (Exception var6) {
         result.setStatus(Result.FAIL);
         result.setMessage(var6.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<List<ProductMaster>> ViewProduct(ProductMasterCRUDDto productMasterCRUDDto) {
      ResultWrapper<List<ProductMaster>> result = new ResultWrapper<>();

      try {
         List<ProductMaster> productInfo = null;
         Integer productId = productMasterCRUDDto.getProductId();
         long clientId = productMasterCRUDDto.getClientId();
         if (productId == 0) {
            productInfo = this.productMasterRepo.findAllProducts(clientId);
         } else {
            productInfo = this.productMasterRepo.findAndViewByProductId(productId, clientId);
         }

         result.setResult(productInfo);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Product Information Send Successfully");
      } catch (Exception var7) {
         result.setStatus(Result.FAIL);
         result.setMessage(var7.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<ProductMaster> DeleteProduct(ProductMasterCRUDDto productMasterCRUDDto) {
      ResultWrapper<ProductMaster> result = new ResultWrapper<>();

      try {
         ProductMaster productInfo = null;
         Integer productId = productMasterCRUDDto.getProductId();
         if (productId > 0) {
            productInfo = this.productMasterRepo.DeleteProductById(productId);
            result.setResult(productInfo);
            result.setStatus(Result.SUCCESS);
            result.setMessage("Product Information Delete Successfully");
         } else {
            result.setResult(productInfo);
            result.setStatus(Result.FAIL);
            result.setMessage("Invalid Request");
         }
      } catch (Exception var5) {
         result.setStatus(Result.FAIL);
         result.setMessage(var5.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<ProductMaster> UpdateProduct(ProductMaster productMaster) {
      ResultWrapper<ProductMaster> result = new ResultWrapper<>();

      try {
         Instant instant = Instant.now();
         Query query = new Query();
         query.addCriteria(Criteria.where("productId").is(productMaster.getProductId()));
         Update update = new Update();
         update.set("productName", productMaster.getProductName());
         update.set("clientId", productMaster.getClientId());
         update.set("updatedTimestamp", instant.toEpochMilli());
         this.mongoTemplate.findAndModify(query, update, ProductMaster.class);
         result.setResult(productMaster);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Product Updated Successfully");
      } catch (Exception var6) {
         result.setStatus(Result.FAIL);
         result.setMessage(var6.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<CustomerMaster> AddCustomer(CustomerMaster customerMaster) {
      ResultWrapper<CustomerMaster> result = new ResultWrapper<>();

      try {
         Integer ID = 0;
         Object maxID = this.customerMasterRepo.findMaxIdInCustomerMaster();
         if (maxID == null) {
            ID = 1;
            customerMaster.setCustomerId(ID);
         } else {
            ID = (Integer)maxID;
            ID = ID + 1;
            customerMaster.setCustomerId(ID);
         }

         Instant instant = Instant.now();
         customerMaster.setAddedTimestamp(instant.toEpochMilli());
         customerMaster.setUpdatedTimestamp(instant.toEpochMilli());
         customerMaster = (CustomerMaster)this.customerMasterRepo.save(customerMaster);
         result.setResult(customerMaster);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Customer Added Successfully");
      } catch (Exception var6) {
         result.setStatus(Result.FAIL);
         result.setMessage(var6.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<List<CustomerMaster>> ViewCustomer(CustomerMasterCRUDDto customerMasterCRUDDto) {
      ResultWrapper<List<CustomerMaster>> result = new ResultWrapper<>();

      try {
         List<CustomerMaster> customerInfo = null;
         Integer customerId = customerMasterCRUDDto.getCustomerId();
         long clientId = customerMasterCRUDDto.getClientId();
         if (customerId == 0) {
            customerInfo = this.customerMasterRepo.findAllCustomers(clientId);
         } else {
            customerInfo = this.customerMasterRepo.findAndViewByCustomerId(customerId, clientId);
         }

         result.setResult(customerInfo);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Customer Information Send Successfully");
      } catch (Exception var7) {
         result.setStatus(Result.FAIL);
         result.setMessage(var7.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<CustomerMaster> DeleteCustomer(CustomerMasterCRUDDto customerMasterCRUDDto) {
      ResultWrapper<CustomerMaster> result = new ResultWrapper<>();

      try {
         CustomerMaster customerInfo = null;
         Integer customerId = customerMasterCRUDDto.getCustomerId();
         if (customerId > 0) {
            customerInfo = this.customerMasterRepo.DeleteCustomerById(customerId);
            result.setResult(customerInfo);
            result.setStatus(Result.SUCCESS);
            result.setMessage("Customer Information Delete Successfully");
         } else {
            result.setResult(customerInfo);
            result.setStatus(Result.FAIL);
            result.setMessage("Invalid Request");
         }
      } catch (Exception var5) {
         result.setStatus(Result.FAIL);
         result.setMessage(var5.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<CustomerMaster> UpdateCustomer(CustomerMaster customerMaster) {
      ResultWrapper<CustomerMaster> result = new ResultWrapper<>();

      try {
         Instant instant = Instant.now();
         Query query = new Query();
         query.addCriteria(Criteria.where("customerId").is(customerMaster.getCustomerId()));
         Update update = new Update();
         update.set("customerName", customerMaster.getCustomerName());
         update.set("productId", customerMaster.getProductId());
         update.set("clientId", customerMaster.getClientId());
         update.set("billingAddress", customerMaster.getBillingAddress());
         update.set("billingCountryId", customerMaster.getBillingCountryId());
         update.set("billingStateId", customerMaster.getBillingStateId());
         update.set("billingCityId", customerMaster.getBillingCityId());
         update.set("billingZipcode", customerMaster.getBillingZipcode());
         update.set("contactEmail", customerMaster.getContactEmail());
         update.set("contactPhone", customerMaster.getContactPhone());
         update.set("physicalAddress", customerMaster.getPhysicalAddress());
         update.set("physicalCountryId", customerMaster.getPhysicalCountryId());
         update.set("physicalStateId", customerMaster.getPhysicalStateId());
         update.set("physicalCityId", customerMaster.getPhysicalCityId());
         update.set("physicalZipcode", customerMaster.getPhysicalZipcode());
         update.set("dispatchEmail", customerMaster.getDispatchEmail());
         update.set("dispatchPhone", customerMaster.getDispatchPhone());
         update.set("afterHoursPhone", customerMaster.getAfterHoursPhone());
         update.set("accountingEmail", customerMaster.getAccountingEmail());
         update.set("accountingPhone", customerMaster.getAccountingPhone());
         update.set("status", customerMaster.getStatus());
         update.set("remarks", customerMaster.getRemarks());
         update.set("updatedTimestamp", instant.toEpochMilli());
         this.mongoTemplate.findAndModify(query, update, CustomerMaster.class);
         result.setResult(customerMaster);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Customer Updated Successfully");
      } catch (Exception var6) {
         result.setStatus(Result.FAIL);
         result.setMessage(var6.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<ShipperMaster> AddShipper(ShipperMaster shipperMaster) {
      ResultWrapper<ShipperMaster> result = new ResultWrapper<>();

      try {
         Integer ID = 0;
         Object maxID = this.shipperMasterRepo.findMaxIdInShipperMaster();
         if (maxID == null) {
            ID = 1;
            shipperMaster.setShipperId(ID);
         } else {
            ID = (Integer)maxID;
            ID = ID + 1;
            shipperMaster.setShipperId(ID);
         }

         Instant instant = Instant.now();
         shipperMaster.setAddedTimestamp(instant.toEpochMilli());
         shipperMaster.setUpdatedTimestamp(instant.toEpochMilli());
         shipperMaster = (ShipperMaster)this.shipperMasterRepo.save(shipperMaster);
         result.setResult(shipperMaster);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Shipper Added Successfully");
      } catch (Exception var6) {
         result.setStatus(Result.FAIL);
         result.setMessage(var6.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<List<ShipperMaster>> ViewShipper(ShipperMasterCRUDDto shipperMasterCRUDDto) {
      ResultWrapper<List<ShipperMaster>> result = new ResultWrapper<>();

      try {
         List<ShipperMaster> shipperInfo = null;
         Integer shipperId = shipperMasterCRUDDto.getShipperId();
         long clientId = shipperMasterCRUDDto.getClientId();
         if (shipperId == 0) {
            shipperInfo = this.shipperMasterRepo.findAllShippers(clientId);
         } else {
            shipperInfo = this.shipperMasterRepo.findAndViewByShipperId(shipperId, clientId);
         }

         result.setResult(shipperInfo);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Shipper Information Send Successfully");
      } catch (Exception var7) {
         result.setStatus(Result.FAIL);
         result.setMessage(var7.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<ShipperMaster> DeleteShipper(ShipperMasterCRUDDto shipperMasterCRUDDto) {
      ResultWrapper<ShipperMaster> result = new ResultWrapper<>();

      try {
         ShipperMaster shipperInfo = null;
         Integer shipperId = shipperMasterCRUDDto.getShipperId();
         if (shipperId > 0) {
            shipperInfo = this.shipperMasterRepo.DeleteShipperById(shipperId);
            result.setResult(shipperInfo);
            result.setStatus(Result.SUCCESS);
            result.setMessage("Shipper Information Delete Successfully");
         } else {
            result.setResult(shipperInfo);
            result.setStatus(Result.FAIL);
            result.setMessage("Invalid Request");
         }
      } catch (Exception var5) {
         result.setStatus(Result.FAIL);
         result.setMessage(var5.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<ShipperMaster> UpdateShipper(ShipperMaster shipperMaster) {
      ResultWrapper<ShipperMaster> result = new ResultWrapper<>();

      try {
         Instant instant = Instant.now();
         Query query = new Query();
         query.addCriteria(Criteria.where("shipperId").is(shipperMaster.getShipperId()));
         Update update = new Update();
         update.set("shipperName", shipperMaster.getShipperName());
         update.set("shipperStartTime", shipperMaster.getShipperStartTime());
         update.set("shipperEndTime", shipperMaster.getShipperEndTime());
         update.set("appointment", shipperMaster.getAppointment());
         update.set("physicalAddress", shipperMaster.getPhysicalAddress());
         update.set("clientId", shipperMaster.getClientId());
         update.set("countryId", shipperMaster.getCountryId());
         update.set("stateId", shipperMaster.getStateId());
         update.set("cityId", shipperMaster.getCityId());
         update.set("zipcode", shipperMaster.getZipcode());
         update.set("contactNo", shipperMaster.getContactNo());
         update.set("contactPerson", shipperMaster.getContactPerson());
         update.set("status", shipperMaster.getStatus());
         update.set("remarks", shipperMaster.getRemarks());
         update.set("updatedTimestamp", instant.toEpochMilli());
         this.mongoTemplate.findAndModify(query, update, ShipperMaster.class);
         result.setResult(shipperMaster);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Shipper Updated Successfully");
      } catch (Exception var6) {
         result.setStatus(Result.FAIL);
         result.setMessage(var6.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<ReceiverMaster> AddReceiver(ReceiverMaster receiverMaster) {
      ResultWrapper<ReceiverMaster> result = new ResultWrapper<>();

      try {
         Integer ID = 0;
         Object maxID = this.receiverMasterRepo.findMaxIdInReceiverMaster();
         if (maxID == null) {
            ID = 1;
            receiverMaster.setReceiverId(ID);
         } else {
            ID = (Integer)maxID;
            ID = ID + 1;
            receiverMaster.setReceiverId(ID);
         }

         Instant instant = Instant.now();
         receiverMaster.setAddedTimestamp(instant.toEpochMilli());
         receiverMaster.setUpdatedTimestamp(instant.toEpochMilli());
         receiverMaster = (ReceiverMaster)this.receiverMasterRepo.save(receiverMaster);
         result.setResult(receiverMaster);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Receiver Added Successfully");
      } catch (Exception var6) {
         result.setStatus(Result.FAIL);
         result.setMessage(var6.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<List<ReceiverMaster>> ViewReceiver(ReceiverMasterCRUDDto receiverMasterCRUDDto) {
      ResultWrapper<List<ReceiverMaster>> result = new ResultWrapper<>();

      try {
         List<ReceiverMaster> receiverInfo = null;
         Integer receiverId = receiverMasterCRUDDto.getReceiverId();
         long clientId = receiverMasterCRUDDto.getClientId();
         if (receiverId == 0) {
            receiverInfo = this.receiverMasterRepo.findAllReceivers(clientId);
         } else {
            receiverInfo = this.receiverMasterRepo.findAndViewByReceiverId(receiverId, clientId);
         }

         result.setResult(receiverInfo);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Receiver Information Send Successfully");
      } catch (Exception var7) {
         result.setStatus(Result.FAIL);
         result.setMessage(var7.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<ReceiverMaster> DeleteReceiver(ReceiverMasterCRUDDto receiverMasterCRUDDto) {
      ResultWrapper<ReceiverMaster> result = new ResultWrapper<>();

      try {
         ReceiverMaster receiverInfo = null;
         Integer receiverId = receiverMasterCRUDDto.getReceiverId();
         if (receiverId > 0) {
            receiverInfo = this.receiverMasterRepo.DeleteReceiverById(receiverId);
            result.setResult(receiverInfo);
            result.setStatus(Result.SUCCESS);
            result.setMessage("Receiver Information Delete Successfully");
         } else {
            result.setResult(receiverInfo);
            result.setStatus(Result.FAIL);
            result.setMessage("Invalid Request");
         }
      } catch (Exception var5) {
         result.setStatus(Result.FAIL);
         result.setMessage(var5.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<ReceiverMaster> UpdateReceiver(ReceiverMaster receiverMaster) {
      ResultWrapper<ReceiverMaster> result = new ResultWrapper<>();

      try {
         Instant instant = Instant.now();
         Query query = new Query();
         query.addCriteria(Criteria.where("receiverId").is(receiverMaster.getReceiverId()));
         Update update = new Update();
         update.set("receiverName", receiverMaster.getReceiverName());
         update.set("receiverStartTime", receiverMaster.getReceiverStartTime());
         update.set("receiverEndTime", receiverMaster.getReceiverEndTime());
         update.set("appointment", receiverMaster.getAppointment());
         update.set("physicalAddress", receiverMaster.getPhysicalAddress());
         update.set("clientId", receiverMaster.getClientId());
         update.set("countryId", receiverMaster.getCountryId());
         update.set("stateId", receiverMaster.getStateId());
         update.set("cityId", receiverMaster.getCityId());
         update.set("zipcode", receiverMaster.getZipcode());
         update.set("contactNo", receiverMaster.getContactNo());
         update.set("contactPerson", receiverMaster.getContactPerson());
         update.set("status", receiverMaster.getStatus());
         update.set("remarks", receiverMaster.getRemarks());
         update.set("updatedTimestamp", instant.toEpochMilli());
         this.mongoTemplate.findAndModify(query, update, ReceiverMaster.class);
         result.setResult(receiverMaster);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Receiver Updated Successfully");
      } catch (Exception var6) {
         result.setStatus(Result.FAIL);
         result.setMessage(var6.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<RouteMaster> AddRoute(RouteMaster routeMaster) {
      ResultWrapper<RouteMaster> result = new ResultWrapper<>();

      try {
         Integer ID = 0;
         Object maxID = this.routeMasterRepo.findMaxIdInRouteMaster();
         if (maxID == null) {
            ID = 1;
            routeMaster.setRouteId(ID);
         } else {
            ID = (Integer)maxID;
            ID = ID + 1;
            routeMaster.setRouteId(ID);
         }

         Instant instant = Instant.now();
         routeMaster.setAddedTimestamp(instant.toEpochMilli());
         routeMaster.setUpdatedTimestamp(instant.toEpochMilli());
         routeMaster = (RouteMaster)this.routeMasterRepo.save(routeMaster);
         result.setResult(routeMaster);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Route Added Successfully");
      } catch (Exception var6) {
         result.setStatus(Result.FAIL);
         result.setMessage(var6.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<List<RouteMaster>> ViewRoute(RouteMasterCRUDDto routeMasterCRUDDto) {
      ResultWrapper<List<RouteMaster>> result = new ResultWrapper<>();

      try {
         List<RouteMaster> routeInfo = null;
         Integer routeId = routeMasterCRUDDto.getRouteId();
         long clientId = routeMasterCRUDDto.getClientId();
         if (routeId == 0) {
            routeInfo = this.routeMasterRepo.findAllRoutes(clientId);
         } else {
            routeInfo = this.routeMasterRepo.findAndViewByRouteId(routeId, clientId);
         }

         result.setResult(routeInfo);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Route Information Send Successfully");
      } catch (Exception var7) {
         result.setStatus(Result.FAIL);
         result.setMessage(var7.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<RouteMaster> DeleteRoute(RouteMasterCRUDDto routeMasterCRUDDto) {
      ResultWrapper<RouteMaster> result = new ResultWrapper<>();

      try {
         RouteMaster routeInfo = null;
         Integer routeId = routeMasterCRUDDto.getRouteId();
         if (routeId > 0) {
            routeInfo = this.routeMasterRepo.DeleteRouteById(routeId);
            result.setResult(routeInfo);
            result.setStatus(Result.SUCCESS);
            result.setMessage("Route Information Delete Successfully");
         } else {
            result.setResult(routeInfo);
            result.setStatus(Result.FAIL);
            result.setMessage("Invalid Request");
         }
      } catch (Exception var5) {
         result.setStatus(Result.FAIL);
         result.setMessage(var5.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<RouteMaster> UpdateRoute(RouteMaster routeMaster) {
      ResultWrapper<RouteMaster> result = new ResultWrapper<>();

      try {
         Instant instant = Instant.now();
         Query query = new Query();
         query.addCriteria(Criteria.where("routeId").is(routeMaster.getRouteId()));
         Update update = new Update();
         update.set("routeName", routeMaster.getRouteName());
         update.set("clientId", routeMaster.getClientId());
         update.set("updatedTimestamp", instant.toEpochMilli());
         this.mongoTemplate.findAndModify(query, update, RouteMaster.class);
         result.setResult(routeMaster);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Route Updated Successfully");
      } catch (Exception var6) {
         result.setStatus(Result.FAIL);
         result.setMessage(var6.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<CarrierMaster> AddCarrier(CarrierMaster carrierMaster) {
      ResultWrapper<CarrierMaster> result = new ResultWrapper<>();

      try {
         Integer ID = 0;
         Object maxID = this.carrierMasterRepo.findMaxIdInCarrierMaster();
         if (maxID == null) {
            ID = 1;
            carrierMaster.setCarrierId(ID);
         } else {
            ID = (Integer)maxID;
            ID = ID + 1;
            carrierMaster.setCarrierId(ID);
         }

         Instant instant = Instant.now();
         carrierMaster.setAddedTimestamp(instant.toEpochMilli());
         carrierMaster.setUpdatedTimestamp(instant.toEpochMilli());
         carrierMaster = (CarrierMaster)this.carrierMasterRepo.save(carrierMaster);
         result.setResult(carrierMaster);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Carrier Added Successfully");
      } catch (Exception var6) {
         result.setStatus(Result.FAIL);
         result.setMessage(var6.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<List<CarrierMaster>> ViewCarrier(CarrierMasterCRUDDto carrierMasterCRUDDto) {
      ResultWrapper<List<CarrierMaster>> result = new ResultWrapper<>();

      try {
         List<CarrierMaster> carrierInfo = null;
         Integer carrierId = carrierMasterCRUDDto.getCarrierId();
         long clientId = carrierMasterCRUDDto.getClientId();
         if (carrierId == 0) {
            carrierInfo = this.carrierMasterRepo.findAllCarriers(clientId);
         } else {
            carrierInfo = this.carrierMasterRepo.findAndViewByCarrierId(carrierId, clientId);
         }

         result.setResult(carrierInfo);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Carrier Information Send Successfully");
      } catch (Exception var7) {
         result.setStatus(Result.FAIL);
         result.setMessage(var7.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<CarrierMaster> DeleteCarrier(CarrierMasterCRUDDto carrierMasterCRUDDto) {
      ResultWrapper<CarrierMaster> result = new ResultWrapper<>();

      try {
         CarrierMaster carrierInfo = null;
         Integer carrierId = carrierMasterCRUDDto.getCarrierId();
         if (carrierId > 0) {
            carrierInfo = this.carrierMasterRepo.DeleteCarrierById(carrierId);
            result.setResult(carrierInfo);
            result.setStatus(Result.SUCCESS);
            result.setMessage("Carrier Information Delete Successfully");
         } else {
            result.setResult(carrierInfo);
            result.setStatus(Result.FAIL);
            result.setMessage("Invalid Request");
         }
      } catch (Exception var5) {
         result.setStatus(Result.FAIL);
         result.setMessage(var5.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<CarrierMaster> UpdateCarrier(CarrierMaster carrierMaster) {
      ResultWrapper<CarrierMaster> result = new ResultWrapper<>();

      try {
         Instant instant = Instant.now();
         Query query = new Query();
         query.addCriteria(Criteria.where("carrierId").is(carrierMaster.getCarrierId()));
         Update update = new Update();
         update.set("carrierName", carrierMaster.getCarrierName());
         update.set("routeId", carrierMaster.getRouteId());
         update.set("clientId", carrierMaster.getClientId());
         update.set("dot", carrierMaster.getDot());
         update.set("taxId", carrierMaster.getTaxId());
         update.set("billingAddress", carrierMaster.getBillingAddress());
         update.set("billingCountryId", carrierMaster.getBillingCountryId());
         update.set("billingStateId", carrierMaster.getBillingStateId());
         update.set("billingCityId", carrierMaster.getBillingCityId());
         update.set("billingZipcode", carrierMaster.getBillingZipcode());
         update.set("contactEmail", carrierMaster.getContactEmail());
         update.set("contactPhone", carrierMaster.getContactPhone());
         update.set("physicalAddress", carrierMaster.getPhysicalAddress());
         update.set("physicalCountryId", carrierMaster.getPhysicalCountryId());
         update.set("physicalStateId", carrierMaster.getPhysicalStateId());
         update.set("physicalCityId", carrierMaster.getPhysicalCityId());
         update.set("physicalZipcode", carrierMaster.getPhysicalZipcode());
         update.set("mainEmail", carrierMaster.getMainEmail());
         update.set("mainPhone", carrierMaster.getMainPhone());
         update.set("mcNumber", carrierMaster.getMcNumber());
         update.set("afterHoursPhone", carrierMaster.getAfterHoursPhone());
         update.set("accountingEmail", carrierMaster.getAccountingEmail());
         update.set("accountingPhone", carrierMaster.getAccountingPhone());
         update.set("status", carrierMaster.getStatus());
         update.set("remarks", carrierMaster.getRemarks());
         update.set("updatedTimestamp", instant.toEpochMilli());
         this.mongoTemplate.findAndModify(query, update, CarrierMaster.class);
         result.setResult(carrierMaster);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Carrier Updated Successfully");
      } catch (Exception var6) {
         result.setStatus(Result.FAIL);
         result.setMessage(var6.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<String> GenerateCompanyNo() {
      ResultWrapper<String> result = new ResultWrapper<>();

      try {
         String allCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
         SecureRandom RANDOM = new SecureRandom();
         StringBuilder sb = new StringBuilder(10);

         for(int i = 0; i < 10; ++i) {
            int index = RANDOM.nextInt(allCharacters.length());
            sb.append(allCharacters.charAt(index));
         }

         String sCompanyId = sb.toString();
         result.setResult(sCompanyId);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Get Company ID Successfully");
      } catch (Exception var7) {
         result.setStatus(Result.FAIL);
         result.setMessage(var7.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<ClientMaster> AddClient(ClientMaster clientMaster) {
      ResultWrapper<ClientMaster> result = new ResultWrapper<>();

      try {
         if (this.clientMasterRepo.existsByClientName(clientMaster.getClientName())) {
            result.setStatus(Result.FAIL);
            result.setMessage("Company name already exists");
            return result;
         }

         if (this.clientMasterRepo.existsByDotNo(clientMaster.getDotNo())) {
            result.setStatus(Result.FAIL);
            result.setMessage("Dot no. already exists");
            return result;
         }

         List<ClientMaster> companyInfo = this.clientMasterRepo.findAndViewByCompanyId(clientMaster.getCompanyId());
         if (companyInfo.size() <= 0) {
            Integer ID = 0;
            Object maxID = this.clientMasterRepo.findMaxIdInClientMaster();
            if (maxID == null) {
               ID = 1;
               clientMaster.setClientId(ID);
            } else {
               ID = (Integer)maxID;
               ID = ID + 1;
               clientMaster.setClientId(ID);
            }

            clientMaster.setStatus("false");
            Instant instant = Instant.now();
            clientMaster.setAddedTimestamp(instant.toEpochMilli());
            clientMaster.setUpdatedTimestamp(instant.toEpochMilli());
            clientMaster.setSubscriptionEndTime(instant.toEpochMilli());
            Instant graceInstant = instant.plus(7L, ChronoUnit.DAYS);
            clientMaster.setGraceTime(graceInstant.toEpochMilli());
            clientMaster = (ClientMaster)this.clientMasterRepo.save(clientMaster);
            ObjectMapper objectMapper = new ObjectMapper();

            for(int i = 0; i < clientMaster.getTerminalData().size(); ++i) {
               String jsonString = objectMapper.writeValueAsString(clientMaster.getTerminalData().get(0));
               JSONObject obj = new JSONObject(jsonString);
               String terminalName = obj.get("terminalStreet").toString()
                  + " "
                  + obj.get("terminalCity").toString()
                  + " "
                  + obj.get("terminalCountryName").toString();
               MainTerminalMaster mainTerminalMaster = new MainTerminalMaster();
               ID = 0;
               maxID = this.mainTerminalMasterRepo.findMaxIdInMainTerminalMaster();
               if (maxID == null) {
                  ID = 1;
                  mainTerminalMaster.setMainTerminalId(ID);
               } else {
                  ID = (Integer)maxID;
                  ID = ID + 1;
                  mainTerminalMaster.setMainTerminalId(ID);
               }

               mainTerminalMaster.setMainTerminalName(terminalName);
               mainTerminalMaster.setStateId(Long.parseLong(obj.get("terminalTimezoneId").toString()));
               mainTerminalMaster.setClientId((long)clientMaster.getClientId().intValue());
               mainTerminalMaster.setAddedTimestamp(instant.toEpochMilli());
               mainTerminalMaster.setUpdatedTimestamp(instant.toEpochMilli());
               mainTerminalMaster = (MainTerminalMaster)this.mainTerminalMasterRepo.save(mainTerminalMaster);
            }

            result.setResult(clientMaster);
            result.setStatus(Result.SUCCESS);
            result.setMessage("Client Added Successfully");
         } else {
            result.setResult(null);
            result.setStatus(Result.FAIL);
            result.setMessage("Company ID Allready exist.");
         }
      } catch (Exception var15) {
         result.setStatus(Result.FAIL);
         result.setMessage(var15.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<List<ClientMasterViewDto>> ViewClient(ClientMasterCRUDDto clientMasterCRUDDto) {
      ResultWrapper<List<ClientMasterViewDto>> result = new ResultWrapper<>();

      try {
         List<ClientMasterViewDto> clientInfo = null;
         Integer clientId = clientMasterCRUDDto.getClientId();
         clientInfo = this.lookupClientMasterOperation((long)clientId.intValue());
         ArrayList terminalData = null;
         new JSONObject();
         new ArrayList();
         new Gson();

         for(int i = 0; i < clientInfo.size(); ++i) {
            try {
               CountryMaster countryInfo = this.countryMasterRepo.findByCountryId((int)clientInfo.get(i).getCountryId());
               clientInfo.get(i).setLattitude(countryInfo.getLattitude());
               clientInfo.get(i).setLongitude(countryInfo.getLongitude());
               StateMaster states = this.stateMasterRepo.findByStateId((int)clientInfo.get(i).getTimezoneId());
               clientInfo.get(i).setTimezone(states.getTimeZone());
            } catch (Exception var12) {
               var12.printStackTrace();
            }
         }

         result.setResult(clientInfo);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Client Information Send Successfully");
      } catch (Exception var13) {
         result.setStatus(Result.FAIL);
         result.setMessage(var13.getLocalizedMessage());
      }

      return result;
   }

   public List<ClientMasterViewDto> lookupClientMasterOperation(long clientId) {
      MatchOperation filter = null;
      if (clientId > 0L) {
         filter = Aggregation.match(Criteria.where("clientId").is(clientId));
      } else {
         filter = Aggregation.match(new Criteria());
      }

      ProjectionOperation projectStage = Aggregation.project(
            new String[]{
               "companyId",
               "clientId",
               "clientName",
               "dotNo",
               "timezoneId",
               "street",
               "city",
               "countryId",
               "stateId",
               "zipcode",
               "terminalData",
               "complianceMode",
               "vehicleMotionThresold",
               "exemptDriver",
               "cycleUsaId",
               "cargoTypeId",
               "restartId",
               "restBreakId",
               "shortHaulException",
               "personalUse",
               "yardMoves",
               "allowTracking",
               "allowGpsTracking",
               "allowIfta",
               "project44",
               "microPoint",
               "status",
               "addedTimestamp",
               "updatedTimestamp",
               "subscriptionEndTime",
               "graceTime",
               "cycle_usa_master.cycleUsaName",
               "country_master.countryName",
               "state_master.stateName",
               "cargo_type_master.cargoTypeName",
               "rest_break_master.restBreakName",
               "restart_master.restartName"
            }
         )
         .andExclude(new String[]{"_id"});
      LookupOperation country_master = LookupOperation.newLookup()
         .from("country_master")
         .localField("countryId")
         .foreignField("countryId")
         .as("country_master");
      LookupOperation state_master = LookupOperation.newLookup().from("state_master").localField("stateId").foreignField("stateId").as("state_master");
      LookupOperation rest_break_master = LookupOperation.newLookup()
         .from("rest_break_master")
         .localField("restBreakId")
         .foreignField("restBreakId")
         .as("rest_break_master");
      LookupOperation cycle_usa_master = LookupOperation.newLookup()
         .from("cycle_usa_master")
         .localField("cycleUsaId")
         .foreignField("cycleUsaId")
         .as("cycle_usa_master");
      LookupOperation cargo_type_master = LookupOperation.newLookup()
         .from("cargo_type_master")
         .localField("cargoTypeId")
         .foreignField("cargoTypeId")
         .as("cargo_type_master");
      LookupOperation restart_master = LookupOperation.newLookup()
         .from("restart_master")
         .localField("restartId")
         .foreignField("restartId")
         .as("restart_master");
      Aggregation aggregation = Aggregation.newAggregation(
         new AggregationOperation[]{
            filter, country_master, state_master, cycle_usa_master, cargo_type_master, rest_break_master, restart_master, projectStage
         }
      );
      return this.mongoTemplate.aggregate(aggregation, "client_master", ClientMasterViewDto.class).getMappedResults();
   }

   @Override
   public ResultWrapper<ClientMaster> DeleteClient(ClientMasterCRUDDto clientMasterCRUDDto) {
      ResultWrapper<ClientMaster> result = new ResultWrapper<>();

      try {
         ClientMaster clientInfo = null;
         Integer clientId = clientMasterCRUDDto.getClientId();
         if (clientId > 0) {
            clientInfo = this.clientMasterRepo.DeleteClientById(clientId);
            this.mainTerminalMasterRepo.DeleteMainTerminalMasterByClientId((long)clientId.intValue());
            result.setResult(clientInfo);
            result.setStatus(Result.SUCCESS);
            result.setMessage("Client Information Delete Successfully");
         } else {
            result.setResult(clientInfo);
            result.setStatus(Result.FAIL);
            result.setMessage("Invalid Request");
         }
      } catch (Exception var5) {
         result.setStatus(Result.FAIL);
         result.setMessage(var5.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<ClientMaster> UpdateClient(ClientMaster clientMaster) {
      ResultWrapper<ClientMaster> result = new ResultWrapper<>();

      try {
         Instant instant = Instant.now();
         Update update = new Update();
         Query query = new Query();
         query.addCriteria(Criteria.where("clientId").is(clientMaster.getClientId()));
         ClientMaster existingClient = (ClientMaster)this.mongoTemplate.findOne(query, ClientMaster.class);
         Long existingSubscriptionEnd = existingClient.getSubscriptionEndTime();
         Long existingGraceTime = existingClient.getGraceTime();
         if (existingSubscriptionEnd != null && existingSubscriptionEnd != 0L) {
            clientMaster.setSubscriptionEndTime(existingSubscriptionEnd);
            clientMaster.setGraceTime(existingGraceTime);
         } else {
            clientMaster.setSubscriptionEndTime(instant.toEpochMilli());
            update.set("subscriptionEndTime", instant.toEpochMilli());
            Instant graceInstant = instant.plus(7L, ChronoUnit.DAYS);
            clientMaster.setGraceTime(graceInstant.toEpochMilli());
            update.set("graceTime", graceInstant.toEpochMilli());
         }

         query = new Query();
         query.addCriteria(Criteria.where("clientId").is(clientMaster.getClientId()));
         update.set("clientName", clientMaster.getClientName());
         update.set("dotNo", clientMaster.getDotNo());
         update.set("timezoneId", clientMaster.getTimezoneId());
         update.set("street", clientMaster.getStreet());
         update.set("city", clientMaster.getCity());
         update.set("countryId", clientMaster.getCountryId());
         update.set("stateId", clientMaster.getStateId());
         update.set("zipcode", clientMaster.getZipcode());
         update.set("terminalData", clientMaster.getTerminalData());
         update.set("complianceMode", clientMaster.getComplianceMode());
         update.set("exemptDriver", clientMaster.getExemptDriver());
         update.set("cycleUsaId", clientMaster.getCycleUsaId());
         update.set("cargoTypeId", clientMaster.getCargoTypeId());
         update.set("restartId", clientMaster.getRestartId());
         update.set("restBreakId", clientMaster.getRestBreakId());
         update.set("shortHaulException", clientMaster.getShortHaulException());
         update.set("personalUse", clientMaster.getPersonalUse());
         update.set("yardMoves", clientMaster.getYardMoves());
         update.set("allowTracking", clientMaster.getAllowTracking());
         update.set("allowGpsTracking", clientMaster.getAllowGpsTracking());
         update.set("allowIfta", clientMaster.getAllowIfta());
         update.set("project44", clientMaster.getProject44());
         update.set("microPoint", clientMaster.getMicroPoint());
         update.set("vehicleMotionThresold", clientMaster.getVehicleMotionThresold());
         update.set("updatedTimestamp", instant.toEpochMilli());
         this.mongoTemplate.findAndModify(query, update, ClientMaster.class);
         ObjectMapper objectMapper = new ObjectMapper();

         for(int i = 0; i < clientMaster.getTerminalData().size(); ++i) {
            String jsonString = objectMapper.writeValueAsString(clientMaster.getTerminalData().get(0));
            JSONObject obj = new JSONObject(jsonString);
            String terminalName = obj.get("terminalStreet").toString()
               + " "
               + obj.get("terminalCity").toString()
               + " "
               + obj.get("terminalCountryName").toString();
            List<MainTerminalMaster> mainTerminals = this.mainTerminalMasterRepo.findAllMainTerminals((long)clientMaster.getClientId().intValue());
            if (mainTerminals.size() <= 0) {
               MainTerminalMaster mainTerminalMaster = new MainTerminalMaster();
               Integer ID = 0;
               Object maxID = this.mainTerminalMasterRepo.findMaxIdInMainTerminalMaster();
               if (maxID == null) {
                  ID = 1;
                  mainTerminalMaster.setMainTerminalId(ID);
               } else {
                  ID = (Integer)maxID;
                  ID = ID + 1;
                  mainTerminalMaster.setMainTerminalId(ID);
               }

               mainTerminalMaster.setMainTerminalName(terminalName);
               mainTerminalMaster.setStateId(Long.parseLong(obj.get("terminalTimezoneId").toString()));
               mainTerminalMaster.setClientId((long)clientMaster.getClientId().intValue());
               mainTerminalMaster.setAddedTimestamp(instant.toEpochMilli());
               mainTerminalMaster.setUpdatedTimestamp(instant.toEpochMilli());
               mainTerminalMaster = (MainTerminalMaster)this.mainTerminalMasterRepo.save(mainTerminalMaster);
            }
         }

         result.setResult(clientMaster);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Client Updated Successfully");
      } catch (Exception var19) {
         result.setStatus(Result.FAIL);
         result.setMessage(var19.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<String> UpdateClientActiveInactive(UserMasterCRUDDto userMasterCRUDDto) {
      ResultWrapper<String> result = new ResultWrapper<>();

      try {
         Instant instant = Instant.now();
         Query query = new Query();
         query.addCriteria(Criteria.where("clientId").is(userMasterCRUDDto.getClientId()));
         Update update = new Update();
         update.set("status", userMasterCRUDDto.getStatus());
         update.set("updatedTimestamp", instant.toEpochMilli());
         this.mongoTemplate.findAndModify(query, update, ClientMaster.class);
         List<EmployeeMasterViewDto> empInfo = this.lookupEmployeeMasterOperation(0, userMasterCRUDDto.getClientId());

         for(int i = 0; i < empInfo.size(); ++i) {
            query = new Query();
            query.addCriteria(Criteria.where("employeeId").is(empInfo.get(i).getEmployeeId()));
            update = new Update();
            update.set("tokenNo", "0");
            this.mongoTemplate.findAndModify(query, update, Login.class);
         }

         result.setResult("Updated");
         result.setStatus(Result.SUCCESS);
         result.setMessage("Company Updated Successfully");
      } catch (Exception var8) {
         result.setStatus(Result.FAIL);
         result.setMessage(var8.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<String> UpdateClientGraceTime(UserMasterCRUDDto userMasterCRUDDto) {
      ResultWrapper<String> result = new ResultWrapper<>();

      try {
         Instant instant = Instant.now();
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
         LocalDateTime ldtGraceDate = LocalDateTime.parse(userMasterCRUDDto.getGraceTime(), formatter);
         long graceTime = ldtGraceDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
         Query query = new Query();
         query.addCriteria(Criteria.where("clientId").is(userMasterCRUDDto.getClientId()));
         Update update = new Update();
         update.set("graceTime", graceTime);
         this.mongoTemplate.findAndModify(query, update, ClientMaster.class);
         result.setResult("Updated");
         result.setStatus(Result.SUCCESS);
         result.setMessage("Company Updated Successfully");
      } catch (Exception var10) {
         result.setStatus(Result.FAIL);
         result.setMessage(var10.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<UserTypeMaster> AddUserType(UserTypeMaster userTypeMaster) {
      ResultWrapper<UserTypeMaster> result = new ResultWrapper<>();

      try {
         Integer ID = 0;
         Object maxID = this.userTypeMasterRepo.findMaxIdInUserTypeMaster();
         if (maxID == null) {
            ID = 1;
            userTypeMaster.setUserTypeId(ID);
         } else {
            ID = (Integer)maxID;
            ID = ID + 1;
            userTypeMaster.setUserTypeId(ID);
         }

         Instant instant = Instant.now();
         userTypeMaster.setAddedTimestamp(instant.toEpochMilli());
         userTypeMaster.setUpdatedTimestamp(instant.toEpochMilli());
         userTypeMaster = (UserTypeMaster)this.userTypeMasterRepo.save(userTypeMaster);
         result.setResult(userTypeMaster);
         result.setStatus(Result.SUCCESS);
         result.setMessage("User Type Added Successfully");
      } catch (Exception var6) {
         result.setStatus(Result.FAIL);
         result.setMessage(var6.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<List<UserTypeMaster>> ViewUserType(UserTypeMasterCRUDDto userTypeMasterCRUDDto) {
      ResultWrapper<List<UserTypeMaster>> result = new ResultWrapper<>();

      try {
         List<UserTypeMaster> userTypeInfo = null;
         Integer userTypeId = userTypeMasterCRUDDto.getUserTypeId();
         if (userTypeId == 0) {
            userTypeInfo = this.userTypeMasterRepo.findAll();
         } else {
            userTypeInfo = this.userTypeMasterRepo.findAndViewByUserTypeId(userTypeId);
         }

         result.setResult(userTypeInfo);
         result.setStatus(Result.SUCCESS);
         result.setMessage("User Type Information Send Successfully");
      } catch (Exception var5) {
         result.setStatus(Result.FAIL);
         result.setMessage(var5.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<UserTypeMaster> DeleteUserType(UserTypeMasterCRUDDto userTypeMasterCRUDDto) {
      ResultWrapper<UserTypeMaster> result = new ResultWrapper<>();

      try {
         UserTypeMaster userTypeInfo = null;
         Integer userTypeId = userTypeMasterCRUDDto.getUserTypeId();
         if (userTypeId > 0) {
            userTypeInfo = this.userTypeMasterRepo.DeleteUserTypeById(userTypeId);
            result.setResult(userTypeInfo);
            result.setStatus(Result.SUCCESS);
            result.setMessage("User Type Information Delete Successfully");
         } else {
            result.setResult(userTypeInfo);
            result.setStatus(Result.FAIL);
            result.setMessage("Invalid Request");
         }
      } catch (Exception var5) {
         result.setStatus(Result.FAIL);
         result.setMessage(var5.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<UserTypeMaster> UpdateUserType(UserTypeMaster userTypeMaster) {
      ResultWrapper<UserTypeMaster> result = new ResultWrapper<>();

      try {
         Instant instant = Instant.now();
         Query query = new Query();
         query.addCriteria(Criteria.where("userTypeId").is(userTypeMaster.getUserTypeId()));
         Update update = new Update();
         update.set("userTypeName", userTypeMaster.getUserTypeName());
         update.set("clientId", userTypeMaster.getClientId());
         update.set("updatedTimestamp", instant.toEpochMilli());
         this.mongoTemplate.findAndModify(query, update, UserTypeMaster.class);
         result.setResult(userTypeMaster);
         result.setStatus(Result.SUCCESS);
         result.setMessage("User Type Updated Successfully");
      } catch (Exception var6) {
         result.setStatus(Result.FAIL);
         result.setMessage(var6.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<UserMaster> AddUser(UserMaster userMaster) {
      ResultWrapper<UserMaster> result = new ResultWrapper<>();

      try {
         if (this.userMasterRepo.existsByEmail(userMaster.getEmail())) {
            result.setStatus(Result.FAIL);
            result.setMessage("Email already exists");
            return result;
         }

         if (userMaster.getUserTypeId() == 3L) {
            boolean exists = this.userMasterRepo.existsByUserTypeId(3L);
            if (exists) {
               result.setStatus(Result.FAIL);
               result.setMessage("Support account already exists");
               return result;
            }
         }

         Integer ID = 0;
         Object maxID = this.userMasterRepo.findMaxIdInUserMaster();
         if (maxID == null) {
            ID = 1;
            userMaster.setUserId(ID);
         } else {
            ID = (Integer)maxID;
            ID = ID + 1;
            userMaster.setUserId(ID);
         }

         Instant instant = Instant.now();
         userMaster.setAddedTimestamp(instant.toEpochMilli());
         userMaster.setUpdatedTimestamp(instant.toEpochMilli());
         userMaster = (UserMaster)this.userMasterRepo.save(userMaster);
         result.setResult(userMaster);
         result.setStatus(Result.SUCCESS);
         result.setMessage("User Added Successfully");
      } catch (Exception var6) {
         result.setStatus(Result.FAIL);
         result.setMessage(var6.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<List<UserMasterViewDto>> ViewUser(UserMasterCRUDDto userMasterCRUDDto) {
      ResultWrapper<List<UserMasterViewDto>> result = new ResultWrapper<>();
      String sDebug = " >> ";

      try {
         Integer userId = userMasterCRUDDto.getUserId();
         long clientId = userMasterCRUDDto.getClientId();
         List<UserMasterViewDto> userInfo = this.lookupUserMasterOperation(userId, clientId);
         sDebug = sDebug + ", Size : " + userInfo.size();

         for(int i = 0; i < userInfo.size(); ++i) {
            if (userInfo.get(i).getUserTypeId() > 0L) {
               UserTypeMaster userTypeMaster = this.userTypeMasterRepo.findByUserTypeId((int)userInfo.get(i).getUserTypeId());
               userInfo.get(i).setUserTypeName(userTypeMaster.getUserTypeName());
            } else {
               userInfo.get(i).setUserTypeName("");
            }
         }

         result.setResult(userInfo);
         result.setStatus(Result.SUCCESS);
         result.setMessage("User Information Send Successfully");
      } catch (Exception var10) {
         result.setStatus(Result.FAIL);
         result.setMessage(var10.getLocalizedMessage() + sDebug);
      }

      return result;
   }

   public List<UserMasterViewDto> lookupUserMasterOperation(Integer userId, long clientId) {
      MatchOperation filter = null;
      if (userId == 0) {
         if (clientId == 0L) {
            filter = Aggregation.match(new Criteria());
         } else {
            filter = Aggregation.match(Criteria.where("clientId").is(clientId));
         }
      } else {
         filter = Aggregation.match(Criteria.where("userId").is(userId));
      }

      ProjectionOperation projectStage = Aggregation.project(
            new String[]{
               "userId",
               "password",
               "userTypeId",
               "clientId",
               "firstName",
               "lastName",
               "mobileNo",
               "email",
               "status",
               "webAccess",
               "mobileAccess",
               "eldFeature",
               "dispatchFeature",
               "addedTimestamp",
               "updatedTimestamp"
            }
         )
         .andExclude(new String[]{"_id"});
      Aggregation aggregation = Aggregation.newAggregation(new AggregationOperation[]{filter, projectStage});
      return this.mongoTemplate.aggregate(aggregation, "user_master", UserMasterViewDto.class).getMappedResults();
   }

   @Override
   public ResultWrapper<UserMaster> DeleteUser(UserMasterCRUDDto userMasterCRUDDto) {
      ResultWrapper<UserMaster> result = new ResultWrapper<>();

      try {
         UserMaster userInfo = null;
         Integer userId = userMasterCRUDDto.getUserId();
         if (userId > 0) {
            userInfo = this.userMasterRepo.DeleteUserById(userId);
            result.setResult(userInfo);
            result.setStatus(Result.SUCCESS);
            result.setMessage("User Information Delete Successfully");
         } else {
            result.setResult(userInfo);
            result.setStatus(Result.FAIL);
            result.setMessage("Invalid Request");
         }
      } catch (Exception var5) {
         result.setStatus(Result.FAIL);
         result.setMessage(var5.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<UserMaster> UpdateUser(UserMaster userMaster) {
      ResultWrapper<UserMaster> result = new ResultWrapper<>();

      try {
         Instant instant = Instant.now();
         Query query = new Query();
         query.addCriteria(Criteria.where("userId").is(userMaster.getUserId()));
         Update update = new Update();
         update.set("username", userMaster.getUsername());
         update.set("password", userMaster.getPassword());
         update.set("userTypeId", userMaster.getUserTypeId());
         update.set("clientId", userMaster.getClientId());
         update.set("firstName", userMaster.getFirstName());
         update.set("lastName", userMaster.getLastName());
         update.set("mobileNo", userMaster.getMobileNo());
         update.set("email", userMaster.getEmail());
         update.set("countryId", userMaster.getCountryId());
         update.set("stateId", userMaster.getStateId());
         update.set("cityId", userMaster.getCityId());
         update.set("zipcode", userMaster.getZipcode());
         update.set("timezone", userMaster.getTimezone());
         update.set("status", userMaster.getStatus());
         update.set("webAccess", userMaster.getWebAccess());
         update.set("mobileAccess", userMaster.getMobileAccess());
         update.set("eldFeature", userMaster.getEldFeature());
         update.set("dispatchFeature", userMaster.getDispatchFeature());
         update.set("updatedTimestamp", instant.toEpochMilli());
         this.mongoTemplate.findAndModify(query, update, UserMaster.class);
         result.setResult(userMaster);
         result.setStatus(Result.SUCCESS);
         result.setMessage("User Updated Successfully");
      } catch (Exception var6) {
         result.setStatus(Result.FAIL);
         result.setMessage(var6.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<String> UpdateUserFeature(UserMasterCRUDDto userMasterCRUDDto) {
      ResultWrapper<String> result = new ResultWrapper<>();

      try {
         Instant instant = Instant.now();
         Query query = new Query();
         query.addCriteria(Criteria.where("userId").is(userMasterCRUDDto.getUserId()));
         Update update = new Update();
         update.set("status", userMasterCRUDDto.getStatus());
         update.set("webAccess", userMasterCRUDDto.getWebAccess());
         update.set("mobileAccess", userMasterCRUDDto.getMobileAccess());
         update.set("updatedTimestamp", instant.toEpochMilli());
         this.mongoTemplate.findAndModify(query, update, UserMaster.class);
         result.setResult("Updated");
         result.setStatus(Result.SUCCESS);
         result.setMessage("User Updated Successfully");
      } catch (Exception var6) {
         result.setStatus(Result.FAIL);
         result.setMessage(var6.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<String> ResetUserToken(UserMasterCRUDDto userMasterCRUDDto) {
      ResultWrapper<String> result = new ResultWrapper<>();

      try {
         Instant instant = Instant.now();
         Query query = new Query();
         query.addCriteria(Criteria.where("userId").is(userMasterCRUDDto.getUserId()));
         Update update = new Update();
         update.set("tokenNo", "");
         update.set("updatedTimestamp", instant.toEpochMilli());
         this.mongoTemplate.findAndModify(query, update, UserMaster.class);
         result.setResult("Reset");
         result.setStatus(Result.SUCCESS);
         result.setMessage("User Token Reset Successfully");
      } catch (Exception var6) {
         result.setStatus(Result.FAIL);
         result.setMessage(var6.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<CompanyMaster> AddCompany(CompanyMaster companyMaster) {
      ResultWrapper<CompanyMaster> result = new ResultWrapper<>();

      try {
         Integer ID = 0;
         Object maxID = this.companyMasterRepo.findMaxIdInCompanyMaster();
         if (maxID == null) {
            ID = 1;
            companyMaster.setCompanyId(ID);
         } else {
            ID = (Integer)maxID;
            ID = ID + 1;
            companyMaster.setCompanyId(ID);
         }

         Instant instant = Instant.now();
         companyMaster.setAddedTimestamp(instant.toEpochMilli());
         companyMaster.setUpdatedTimestamp(instant.toEpochMilli());
         companyMaster = (CompanyMaster)this.companyMasterRepo.save(companyMaster);
         result.setResult(companyMaster);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Company Added Successfully");
      } catch (Exception var6) {
         result.setStatus(Result.FAIL);
         result.setMessage(var6.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<List<CompanyMaster>> ViewCompany(CompanyMasterCRUDDto companyMasterCRUDDto) {
      ResultWrapper<List<CompanyMaster>> result = new ResultWrapper<>();

      try {
         List<CompanyMaster> companyInfo = null;
         Integer companyId = companyMasterCRUDDto.getCompanyId();
         if (companyId == 0) {
            companyInfo = this.companyMasterRepo.findAll();
         } else {
            companyInfo = this.companyMasterRepo.findAndViewByCompanyId(companyId);
         }

         result.setResult(companyInfo);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Company Information Send Successfully");
      } catch (Exception var5) {
         result.setStatus(Result.FAIL);
         result.setMessage(var5.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<CompanyMaster> DeleteCompany(CompanyMasterCRUDDto companyMasterCRUDDto) {
      ResultWrapper<CompanyMaster> result = new ResultWrapper<>();

      try {
         CompanyMaster companyInfo = null;
         Integer companyId = companyMasterCRUDDto.getCompanyId();
         if (companyId > 0) {
            companyInfo = this.companyMasterRepo.DeleteCompanyById(companyId);
            result.setResult(companyInfo);
            result.setStatus(Result.SUCCESS);
            result.setMessage("Company Information Delete Successfully");
         } else {
            result.setResult(companyInfo);
            result.setStatus(Result.FAIL);
            result.setMessage("Invalid Request");
         }
      } catch (Exception var5) {
         result.setStatus(Result.FAIL);
         result.setMessage(var5.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<CompanyMaster> UpdateCompany(CompanyMaster companyMaster) {
      ResultWrapper<CompanyMaster> result = new ResultWrapper<>();

      try {
         Instant instant = Instant.now();
         Query query = new Query();
         query.addCriteria(Criteria.where("companyId").is(companyMaster.getCompanyId()));
         Update update = new Update();
         update.set("companyName", companyMaster.getCompanyName());
         update.set("officeAddress", companyMaster.getOfficeAddress());
         update.set("homeTerminalAddress", companyMaster.getHomeTerminalAddress());
         update.set("timeZone", companyMaster.getTimeZone());
         update.set("clientId", companyMaster.getClientId());
         update.set("updatedTimestamp", instant.toEpochMilli());
         this.mongoTemplate.findAndModify(query, update, CompanyMaster.class);
         result.setResult(companyMaster);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Company Updated Successfully");
      } catch (Exception var6) {
         result.setStatus(Result.FAIL);
         result.setMessage(var6.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<LanguageMaster> AddLanguage(LanguageMaster languageMaster) {
      ResultWrapper<LanguageMaster> result = new ResultWrapper<>();

      try {
         Integer ID = 0;
         Object maxID = this.languageMasterRepo.findMaxIdInLanguageMaster();
         if (maxID == null) {
            ID = 1;
            languageMaster.setLanguageId(ID);
         } else {
            ID = (Integer)maxID;
            ID = ID + 1;
            languageMaster.setLanguageId(ID);
         }

         Instant instant = Instant.now();
         languageMaster.setAddedTimestamp(instant.toEpochMilli());
         languageMaster.setUpdatedTimestamp(instant.toEpochMilli());
         languageMaster = (LanguageMaster)this.languageMasterRepo.save(languageMaster);
         result.setResult(languageMaster);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Language Added Successfully");
      } catch (Exception var6) {
         result.setStatus(Result.FAIL);
         result.setMessage(var6.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<List<LanguageMaster>> ViewLanguage(LanguageMasterCRUDDto languageMasterCRUDDto) {
      ResultWrapper<List<LanguageMaster>> result = new ResultWrapper<>();

      try {
         List<LanguageMaster> languageInfo = null;
         Integer languageId = languageMasterCRUDDto.getLanguageId();
         if (languageId == 0) {
            languageInfo = this.languageMasterRepo.findAll();
         } else {
            languageInfo = this.languageMasterRepo.findAndViewByLanguageId(languageId);
         }

         result.setResult(languageInfo);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Language Information Send Successfully");
      } catch (Exception var5) {
         result.setStatus(Result.FAIL);
         result.setMessage(var5.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<LanguageMaster> DeleteLanguage(LanguageMasterCRUDDto languageMasterCRUDDto) {
      ResultWrapper<LanguageMaster> result = new ResultWrapper<>();

      try {
         LanguageMaster languageInfo = null;
         Integer languageId = languageMasterCRUDDto.getLanguageId();
         if (languageId > 0) {
            languageInfo = this.languageMasterRepo.DeleteLanguageById(languageId);
            result.setResult(languageInfo);
            result.setStatus(Result.SUCCESS);
            result.setMessage("Language Information Delete Successfully");
         } else {
            result.setResult(languageInfo);
            result.setStatus(Result.FAIL);
            result.setMessage("Invalid Request");
         }
      } catch (Exception var5) {
         result.setStatus(Result.FAIL);
         result.setMessage(var5.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<LanguageMaster> UpdateLanguage(LanguageMaster languageMaster) {
      ResultWrapper<LanguageMaster> result = new ResultWrapper<>();

      try {
         Instant instant = Instant.now();
         Query query = new Query();
         query.addCriteria(Criteria.where("languageId").is(languageMaster.getLanguageId()));
         Update update = new Update();
         update.set("languageName", languageMaster.getLanguageName());
         update.set("clientId", languageMaster.getClientId());
         update.set("updatedTimestamp", instant.toEpochMilli());
         this.mongoTemplate.findAndModify(query, update, LanguageMaster.class);
         result.setResult(languageMaster);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Language Updated Successfully");
      } catch (Exception var6) {
         result.setStatus(Result.FAIL);
         result.setMessage(var6.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<CycleUsa> AddCycleUsa(CycleUsa cycleUsa) {
      ResultWrapper<CycleUsa> result = new ResultWrapper<>();

      try {
         Integer ID = 0;
         Object maxID = this.cycleUsaRepo.findMaxIdInCycleUsa();
         if (maxID == null) {
            ID = 1;
            cycleUsa.setCycleUsaId(ID);
         } else {
            ID = (Integer)maxID;
            ID = ID + 1;
            cycleUsa.setCycleUsaId(ID);
         }

         Instant instant = Instant.now();
         cycleUsa.setAddedTimestamp(instant.toEpochMilli());
         cycleUsa.setUpdatedTimestamp(instant.toEpochMilli());
         cycleUsa = (CycleUsa)this.cycleUsaRepo.save(cycleUsa);
         result.setResult(cycleUsa);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Cycle Usa Added Successfully");
      } catch (Exception var6) {
         result.setStatus(Result.FAIL);
         result.setMessage(var6.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<List<CycleUsa>> ViewCycleUsa(CycleUsaCRUDDto cycleUsaCRUDDto) {
      ResultWrapper<List<CycleUsa>> result = new ResultWrapper<>();

      try {
         List<CycleUsa> cycleUsaInfo = null;
         Integer cycleUsaId = cycleUsaCRUDDto.getCycleUsaId();
         if (cycleUsaId == 0) {
            cycleUsaInfo = this.cycleUsaRepo.findAll();
         } else {
            cycleUsaInfo = this.cycleUsaRepo.findAndViewByCycleUsaId(cycleUsaId);
         }

         result.setResult(cycleUsaInfo);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Cycle Usa Information Send Successfully");
      } catch (Exception var5) {
         result.setStatus(Result.FAIL);
         result.setMessage(var5.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<CycleUsa> DeleteCycleUsa(CycleUsaCRUDDto cycleUsaCRUDDto) {
      ResultWrapper<CycleUsa> result = new ResultWrapper<>();

      try {
         CycleUsa cycleUsaInfo = null;
         Integer cycleUsaId = cycleUsaCRUDDto.getCycleUsaId();
         if (cycleUsaId > 0) {
            cycleUsaInfo = this.cycleUsaRepo.DeleteCycleUsaById(cycleUsaId);
            result.setResult(cycleUsaInfo);
            result.setStatus(Result.SUCCESS);
            result.setMessage("Cycle Usa Information Delete Successfully");
         } else {
            result.setResult(cycleUsaInfo);
            result.setStatus(Result.FAIL);
            result.setMessage("Invalid Request");
         }
      } catch (Exception var5) {
         result.setStatus(Result.FAIL);
         result.setMessage(var5.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<CycleUsa> UpdateCycleUsa(CycleUsa cycleUsa) {
      ResultWrapper<CycleUsa> result = new ResultWrapper<>();

      try {
         Instant instant = Instant.now();
         Query query = new Query();
         query.addCriteria(Criteria.where("cycleUsaId").is(cycleUsa.getCycleUsaId()));
         Update update = new Update();
         update.set("cycleUsaName", cycleUsa.getCycleUsaName());
         update.set("countryId", cycleUsa.getCountryId());
         update.set("stateId", cycleUsa.getStateId());
         update.set("clientId", cycleUsa.getClientId());
         update.set("cycleHour", cycleUsa.getCycleHour());
         update.set("cycleDays", cycleUsa.getCycleDays());
         update.set("onDutyTime", cycleUsa.getOnDutyTime());
         update.set("onDriveTime", cycleUsa.getOnDriveTime());
         update.set("onSleepTime", cycleUsa.getOnSleepTime());
         update.set("continueDriveTime", cycleUsa.getContinueDriveTime());
         update.set("breakTime", cycleUsa.getBreakTime());
         update.set("cycleRestartTime", cycleUsa.getCycleRestartTime());
         update.set("warningTime1", cycleUsa.getWarningTime1());
         update.set("warningTime2", cycleUsa.getWarningTime2());
         update.set("cycleWarningTime1", cycleUsa.getCycleWarningTime1());
         update.set("cycleWarningTime2", cycleUsa.getCycleWarningTime2());
         update.set("updatedTimestamp", instant.toEpochMilli());
         this.mongoTemplate.findAndModify(query, update, CycleUsa.class);
         result.setResult(cycleUsa);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Cycle Usa Updated Successfully");
      } catch (Exception var6) {
         result.setStatus(Result.FAIL);
         result.setMessage(var6.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<CycleCanada> AddCycleCanada(CycleCanada cycleCanada) {
      ResultWrapper<CycleCanada> result = new ResultWrapper<>();

      try {
         Integer ID = 0;
         Object maxID = this.cycleCanadaRepo.findMaxIdInCycleCanada();
         if (maxID == null) {
            ID = 1;
            cycleCanada.setCycleCanadaId(ID);
         } else {
            ID = (Integer)maxID;
            ID = ID + 1;
            cycleCanada.setCycleCanadaId(ID);
         }

         Instant instant = Instant.now();
         cycleCanada.setAddedTimestamp(instant.toEpochMilli());
         cycleCanada.setUpdatedTimestamp(instant.toEpochMilli());
         cycleCanada = (CycleCanada)this.cycleCanadaRepo.save(cycleCanada);
         result.setResult(cycleCanada);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Cycle Canada Added Successfully");
      } catch (Exception var6) {
         result.setStatus(Result.FAIL);
         result.setMessage(var6.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<List<CycleCanada>> ViewCycleCanada(CycleCanadaCRUDDto cycleCanadaCRUDDto) {
      ResultWrapper<List<CycleCanada>> result = new ResultWrapper<>();

      try {
         List<CycleCanada> cycleCanadaInfo = null;
         Integer cycleCanadaId = cycleCanadaCRUDDto.getCycleCanadaId();
         if (cycleCanadaId == 0) {
            cycleCanadaInfo = this.cycleCanadaRepo.findAll();
         } else {
            cycleCanadaInfo = this.cycleCanadaRepo.findAndViewByCycleCanadaId(cycleCanadaId);
         }

         result.setResult(cycleCanadaInfo);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Cycle Canada Information Send Successfully");
      } catch (Exception var5) {
         result.setStatus(Result.FAIL);
         result.setMessage(var5.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<CycleCanada> DeleteCycleCanada(CycleCanadaCRUDDto cycleCanadaCRUDDto) {
      ResultWrapper<CycleCanada> result = new ResultWrapper<>();

      try {
         CycleCanada cycleCanadaInfo = null;
         Integer cycleCanadaId = cycleCanadaCRUDDto.getCycleCanadaId();
         if (cycleCanadaId > 0) {
            cycleCanadaInfo = this.cycleCanadaRepo.DeleteCycleCanadaById(cycleCanadaId);
            result.setResult(cycleCanadaInfo);
            result.setStatus(Result.SUCCESS);
            result.setMessage("Cycle Canada Information Delete Successfully");
         } else {
            result.setResult(cycleCanadaInfo);
            result.setStatus(Result.FAIL);
            result.setMessage("Invalid Request");
         }
      } catch (Exception var5) {
         result.setStatus(Result.FAIL);
         result.setMessage(var5.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<CycleCanada> UpdateCycleCanada(CycleCanada cycleCanada) {
      ResultWrapper<CycleCanada> result = new ResultWrapper<>();

      try {
         Instant instant = Instant.now();
         Query query = new Query();
         query.addCriteria(Criteria.where("cycleCanadaId").is(cycleCanada.getCycleCanadaId()));
         Update update = new Update();
         update.set("cycleCanadaName", cycleCanada.getCycleCanadaName());
         update.set("countryId", cycleCanada.getCountryId());
         update.set("stateId", cycleCanada.getStateId());
         update.set("clientId", cycleCanada.getClientId());
         update.set("updatedTimestamp", instant.toEpochMilli());
         this.mongoTemplate.findAndModify(query, update, CycleCanada.class);
         result.setResult(cycleCanada);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Cycle Canada Updated Successfully");
      } catch (Exception var6) {
         result.setStatus(Result.FAIL);
         result.setMessage(var6.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<DeviceModalMaster> AddDeviceModal(DeviceModalMaster deviceModalMaster) {
      ResultWrapper<DeviceModalMaster> result = new ResultWrapper<>();

      try {
         Integer ID = 0;
         Object maxID = this.deviceModalMasterRepo.findMaxIdInDeviceModal();
         if (maxID == null) {
            ID = 1;
            deviceModalMaster.setDeviceModalId(ID);
         } else {
            ID = (Integer)maxID;
            ID = ID + 1;
            deviceModalMaster.setDeviceModalId(ID);
         }

         Instant instant = Instant.now();
         deviceModalMaster.setAddedTimestamp(instant.toEpochMilli());
         deviceModalMaster.setUpdatedTimestamp(instant.toEpochMilli());
         deviceModalMaster = (DeviceModalMaster)this.deviceModalMasterRepo.save(deviceModalMaster);
         result.setResult(deviceModalMaster);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Device Modal Added Successfully");
      } catch (Exception var6) {
         result.setStatus(Result.FAIL);
         result.setMessage(var6.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<List<DeviceModalMaster>> ViewDeviceModal(DeviceModalMasterCRUDDto deviceModalMasterCRUDDto) {
      ResultWrapper<List<DeviceModalMaster>> result = new ResultWrapper<>();

      try {
         List<DeviceModalMaster> deviceModalMasterInfo = null;
         Integer deviceModalId = deviceModalMasterCRUDDto.getDeviceModalId();
         long clientId = deviceModalMasterCRUDDto.getClientId();
         if (deviceModalId == 0) {
            deviceModalMasterInfo = this.deviceModalMasterRepo.findAll();
         } else {
            deviceModalMasterInfo = this.deviceModalMasterRepo.findAndViewByDeviceModalId(deviceModalId);
         }

         result.setResult(deviceModalMasterInfo);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Device Modal Information Send Successfully");
      } catch (Exception var7) {
         result.setStatus(Result.FAIL);
         result.setMessage(var7.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<DeviceModalMaster> DeleteDeviceModal(DeviceModalMasterCRUDDto deviceModalMasterCRUDDto) {
      ResultWrapper<DeviceModalMaster> result = new ResultWrapper<>();

      try {
         DeviceModalMaster deviceModalInfo = null;
         Integer deviceModalId = deviceModalMasterCRUDDto.getDeviceModalId();
         if (deviceModalId > 0) {
            deviceModalInfo = this.deviceModalMasterRepo.DeleteDeviceModalById(deviceModalId);
            result.setResult(deviceModalInfo);
            result.setStatus(Result.SUCCESS);
            result.setMessage("Device Modal Information Delete Successfully");
         } else {
            result.setResult(deviceModalInfo);
            result.setStatus(Result.FAIL);
            result.setMessage("Invalid Request");
         }
      } catch (Exception var5) {
         result.setStatus(Result.FAIL);
         result.setMessage(var5.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<DeviceModalMaster> UpdateDeviceModal(DeviceModalMaster deviceModalMaster) {
      ResultWrapper<DeviceModalMaster> result = new ResultWrapper<>();

      try {
         Instant instant = Instant.now();
         Query query = new Query();
         query.addCriteria(Criteria.where("deviceModalId").is(deviceModalMaster.getDeviceModalId()));
         Update update = new Update();
         update.set("deviceModalName", deviceModalMaster.getDeviceModalName());
         update.set("clientId", deviceModalMaster.getClientId());
         update.set("updatedTimestamp", instant.toEpochMilli());
         this.mongoTemplate.findAndModify(query, update, DeviceModalMaster.class);
         result.setResult(deviceModalMaster);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Device Modal Updated Successfully");
      } catch (Exception var6) {
         result.setStatus(Result.FAIL);
         result.setMessage(var6.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<VehicleTypeMaster> AddVehicleType(VehicleTypeMaster vehicleTypeMaster) {
      ResultWrapper<VehicleTypeMaster> result = new ResultWrapper<>();

      try {
         Integer ID = 0;
         Object maxID = this.vehicleTypeMasterRepo.findMaxIdInVehicleTypeMaster();
         if (maxID == null) {
            ID = 1;
            vehicleTypeMaster.setVehicleTypeId(ID);
         } else {
            ID = (Integer)maxID;
            ID = ID + 1;
            vehicleTypeMaster.setVehicleTypeId(ID);
         }

         Instant instant = Instant.now();
         vehicleTypeMaster.setAddedTimestamp(instant.toEpochMilli());
         vehicleTypeMaster.setUpdatedTimestamp(instant.toEpochMilli());
         vehicleTypeMaster = (VehicleTypeMaster)this.vehicleTypeMasterRepo.save(vehicleTypeMaster);
         result.setResult(vehicleTypeMaster);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Vehicle Type Added Successfully");
      } catch (Exception var6) {
         result.setStatus(Result.FAIL);
         result.setMessage(var6.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<List<VehicleTypeMaster>> ViewVehicleType(VehicleTypeMasterCRUDDto vehicleTypeMasterCRUDDto) {
      ResultWrapper<List<VehicleTypeMaster>> result = new ResultWrapper<>();

      try {
         List<VehicleTypeMaster> vehicleTypeMasterInfo = null;
         Integer vehicleTypeId = vehicleTypeMasterCRUDDto.getVehicleTypeId();
         long clientId = vehicleTypeMasterCRUDDto.getClientId();
         if (vehicleTypeId == 0) {
            vehicleTypeMasterInfo = this.vehicleTypeMasterRepo.findAllVehicleTypes(clientId);
         } else {
            vehicleTypeMasterInfo = this.vehicleTypeMasterRepo.findAndViewByVehicleTypeId(vehicleTypeId, clientId);
         }

         result.setResult(vehicleTypeMasterInfo);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Vehicle Type Information Send Successfully");
      } catch (Exception var7) {
         result.setStatus(Result.FAIL);
         result.setMessage(var7.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<VehicleTypeMaster> DeleteVehicleType(VehicleTypeMasterCRUDDto vehicleTypeMasterCRUDDto) {
      ResultWrapper<VehicleTypeMaster> result = new ResultWrapper<>();

      try {
         VehicleTypeMaster vehicleTypeInfo = null;
         Integer vehicleTypeId = vehicleTypeMasterCRUDDto.getVehicleTypeId();
         if (vehicleTypeId > 0) {
            vehicleTypeInfo = this.vehicleTypeMasterRepo.DeleteVehicleTypeById(vehicleTypeId);
            result.setResult(vehicleTypeInfo);
            result.setStatus(Result.SUCCESS);
            result.setMessage("Vehicle Type Information Delete Successfully");
         } else {
            result.setResult(vehicleTypeInfo);
            result.setStatus(Result.FAIL);
            result.setMessage("Invalid Request");
         }
      } catch (Exception var5) {
         result.setStatus(Result.FAIL);
         result.setMessage(var5.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<VehicleTypeMaster> UpdateVehicleType(VehicleTypeMaster vehicleTypeMaster) {
      ResultWrapper<VehicleTypeMaster> result = new ResultWrapper<>();

      try {
         Instant instant = Instant.now();
         Query query = new Query();
         query.addCriteria(Criteria.where("vehicleTypeId").is(vehicleTypeMaster.getVehicleTypeId()));
         Update update = new Update();
         update.set("vehicleTypeName", vehicleTypeMaster.getVehicleTypeName());
         update.set("clientId", vehicleTypeMaster.getClientId());
         update.set("updatedTimestamp", instant.toEpochMilli());
         this.mongoTemplate.findAndModify(query, update, VehicleTypeMaster.class);
         result.setResult(vehicleTypeMaster);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Vehicle Type Updated Successfully");
      } catch (Exception var6) {
         result.setStatus(Result.FAIL);
         result.setMessage(var6.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<PaymentStatusMaster> AddPaymentStatus(PaymentStatusMaster paymentStatusMaster) {
      ResultWrapper<PaymentStatusMaster> result = new ResultWrapper<>();

      try {
         Integer ID = 0;
         Object maxID = this.paymentStatusMasterRepo.findMaxIdInPaymentStatusMaster();
         if (maxID == null) {
            ID = 1;
            paymentStatusMaster.setPaymentStatusId(ID);
         } else {
            ID = (Integer)maxID;
            ID = ID + 1;
            paymentStatusMaster.setPaymentStatusId(ID);
         }

         Instant instant = Instant.now();
         paymentStatusMaster.setAddedTimestamp(instant.toEpochMilli());
         paymentStatusMaster.setUpdatedTimestamp(instant.toEpochMilli());
         paymentStatusMaster = (PaymentStatusMaster)this.paymentStatusMasterRepo.save(paymentStatusMaster);
         result.setResult(paymentStatusMaster);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Payment Status Added Successfully");
      } catch (Exception var6) {
         result.setStatus(Result.FAIL);
         result.setMessage(var6.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<List<PaymentStatusMaster>> ViewPaymentStatus(PaymentStatusMasterCRUDDto paymentStatusMasterCRUDDto) {
      ResultWrapper<List<PaymentStatusMaster>> result = new ResultWrapper<>();

      try {
         List<PaymentStatusMaster> paymentStatusMasterInfo = null;
         Integer paymentStatusId = paymentStatusMasterCRUDDto.getPaymentStatusId();
         if (paymentStatusId == 0) {
            paymentStatusMasterInfo = this.paymentStatusMasterRepo.findAll();
         } else {
            paymentStatusMasterInfo = this.paymentStatusMasterRepo.findAndViewByPaymentStatusId(paymentStatusId);
         }

         result.setResult(paymentStatusMasterInfo);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Payment Status Information Send Successfully");
      } catch (Exception var5) {
         result.setStatus(Result.FAIL);
         result.setMessage(var5.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<PaymentStatusMaster> DeletePaymentStatus(PaymentStatusMasterCRUDDto paymentStatusMasterCRUDDto) {
      ResultWrapper<PaymentStatusMaster> result = new ResultWrapper<>();

      try {
         PaymentStatusMaster paymentStatusInfo = null;
         Integer paymentStatusId = paymentStatusMasterCRUDDto.getPaymentStatusId();
         if (paymentStatusId > 0) {
            paymentStatusInfo = this.paymentStatusMasterRepo.DeletePaymentStatusById(paymentStatusId);
            result.setResult(paymentStatusInfo);
            result.setStatus(Result.SUCCESS);
            result.setMessage("Payment Status Information Delete Successfully");
         } else {
            result.setResult(paymentStatusInfo);
            result.setStatus(Result.FAIL);
            result.setMessage("Invalid Request");
         }
      } catch (Exception var5) {
         result.setStatus(Result.FAIL);
         result.setMessage(var5.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<PaymentStatusMaster> UpdatePaymentStatus(PaymentStatusMaster paymentStatusMaster) {
      ResultWrapper<PaymentStatusMaster> result = new ResultWrapper<>();

      try {
         Instant instant = Instant.now();
         Query query = new Query();
         query.addCriteria(Criteria.where("paymentStatusId").is(paymentStatusMaster.getPaymentStatusId()));
         Update update = new Update();
         update.set("paymentStatusName", paymentStatusMaster.getPaymentStatusName());
         update.set("clientId", paymentStatusMaster.getClientId());
         update.set("updatedTimestamp", instant.toEpochMilli());
         this.mongoTemplate.findAndModify(query, update, PaymentStatusMaster.class);
         result.setResult(paymentStatusMaster);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Payment Status Updated Successfully");
      } catch (Exception var6) {
         result.setStatus(Result.FAIL);
         result.setMessage(var6.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<ExceptionMaster> AddExceptionMaster(ExceptionMaster exceptionMaster) {
      ResultWrapper<ExceptionMaster> result = new ResultWrapper<>();

      try {
         Integer ID = 0;
         Object maxID = this.exceptionMasterRepo.findMaxIdInExceptionMaster();
         if (maxID == null) {
            ID = 1;
            exceptionMaster.setExceptionId(ID);
         } else {
            ID = (Integer)maxID;
            ID = ID + 1;
            exceptionMaster.setExceptionId(ID);
         }

         Instant instant = Instant.now();
         exceptionMaster.setAddedTimestamp(instant.toEpochMilli());
         exceptionMaster.setUpdatedTimestamp(instant.toEpochMilli());
         exceptionMaster = (ExceptionMaster)this.exceptionMasterRepo.save(exceptionMaster);
         result.setResult(exceptionMaster);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Exception Added Successfully");
      } catch (Exception var6) {
         result.setStatus(Result.FAIL);
         result.setMessage(var6.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<List<ExceptionMaster>> ViewExceptionMaster(ExceptionMasterCRUDDto exceptionMasterCRUDDto, String tokenValid) {
      ResultWrapper<List<ExceptionMaster>> result = new ResultWrapper<>();

      try {
         List<ExceptionMaster> exceptionMasterInfo = null;
         Integer exceptionId = exceptionMasterCRUDDto.getExceptionId();
         if (exceptionId == 0) {
            exceptionMasterInfo = this.exceptionMasterRepo.findAll();
         } else {
            exceptionMasterInfo = this.exceptionMasterRepo.findAndViewByExceptionId(exceptionId);
         }

         result.setResult(exceptionMasterInfo);
         result.setToken(tokenValid);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Exception Information Send Successfully");
      } catch (Exception var6) {
         result.setStatus(Result.FAIL);
         result.setMessage(var6.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<ExceptionMaster> DeleteExceptionMaster(ExceptionMasterCRUDDto exceptionMasterCRUDDto) {
      ResultWrapper<ExceptionMaster> result = new ResultWrapper<>();

      try {
         ExceptionMaster exceptionInfo = null;
         Integer exceptionId = exceptionMasterCRUDDto.getExceptionId();
         if (exceptionId > 0) {
            exceptionInfo = this.exceptionMasterRepo.DeleteExceptionById(exceptionId);
            result.setResult(exceptionInfo);
            result.setStatus(Result.SUCCESS);
            result.setMessage("Exception Information Delete Successfully");
         } else {
            result.setResult(exceptionInfo);
            result.setStatus(Result.FAIL);
            result.setMessage("Invalid Request");
         }
      } catch (Exception var5) {
         result.setStatus(Result.FAIL);
         result.setMessage(var5.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<ExceptionMaster> UpdateExceptionMaster(ExceptionMaster exceptionMaster) {
      ResultWrapper<ExceptionMaster> result = new ResultWrapper<>();

      try {
         Instant instant = Instant.now();
         Query query = new Query();
         query.addCriteria(Criteria.where("exceptionId").is(exceptionMaster.getExceptionId()));
         Update update = new Update();
         update.set("exceptionName", exceptionMaster.getExceptionName());
         update.set("maxTime", exceptionMaster.getMaxTime());
         update.set("allowedCount", exceptionMaster.getAllowedCount());
         update.set("clientId", exceptionMaster.getClientId());
         update.set("updatedTimestamp", instant.toEpochMilli());
         this.mongoTemplate.findAndModify(query, update, ExceptionMaster.class);
         result.setResult(exceptionMaster);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Exception Updated Successfully");
      } catch (Exception var6) {
         result.setStatus(Result.FAIL);
         result.setMessage(var6.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<MainTerminalMaster> AddMainTerminalMaster(MainTerminalMaster mainTerminalMaster) {
      ResultWrapper<MainTerminalMaster> result = new ResultWrapper<>();

      try {
         Integer ID = 0;
         Object maxID = this.mainTerminalMasterRepo.findMaxIdInMainTerminalMaster();
         if (maxID == null) {
            ID = 1;
            mainTerminalMaster.setMainTerminalId(ID);
         } else {
            ID = (Integer)maxID;
            ID = ID + 1;
            mainTerminalMaster.setMainTerminalId(ID);
         }

         Instant instant = Instant.now();
         mainTerminalMaster.setAddedTimestamp(instant.toEpochMilli());
         mainTerminalMaster.setUpdatedTimestamp(instant.toEpochMilli());
         mainTerminalMaster = (MainTerminalMaster)this.mainTerminalMasterRepo.save(mainTerminalMaster);
         result.setResult(mainTerminalMaster);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Main Terminal Added Successfully");
      } catch (Exception var6) {
         result.setStatus(Result.FAIL);
         result.setMessage(var6.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<List<MainTerminalMaster>> ViewMainTerminalMaster(MainTerminalMasterCRUDDto mainTerminalMasterCRUDDto) {
      ResultWrapper<List<MainTerminalMaster>> result = new ResultWrapper<>();

      try {
         List<MainTerminalMaster> mainTerminalMasterInfo = null;
         Integer mainTerminalId = mainTerminalMasterCRUDDto.getMainTerminalId();
         long clientId = mainTerminalMasterCRUDDto.getClientId();
         if (mainTerminalId == 0) {
            mainTerminalMasterInfo = this.mainTerminalMasterRepo.findAllMainTerminals(clientId);
         } else {
            mainTerminalMasterInfo = this.mainTerminalMasterRepo.findAndViewByMainTerminalId(mainTerminalId);
         }

         result.setResult(mainTerminalMasterInfo);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Main Terminal Information Send Successfully");
      } catch (Exception var7) {
         result.setStatus(Result.FAIL);
         result.setMessage(var7.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<List<MainTerminalMaster>> ViewAllMainTerminalMaster(MainTerminalMasterCRUDDto mainTerminalMasterCRUDDto) {
      ResultWrapper<List<MainTerminalMaster>> result = new ResultWrapper<>();

      try {
         List<MainTerminalMaster> mainTerminalMasterInfo = null;
         Integer mainTerminalId = mainTerminalMasterCRUDDto.getMainTerminalId();
         if (mainTerminalId == 0) {
            mainTerminalMasterInfo = this.mainTerminalMasterRepo.findAll();
         } else {
            mainTerminalMasterInfo = this.mainTerminalMasterRepo.findAndViewByMainTerminalId(mainTerminalId);
         }

         result.setResult(mainTerminalMasterInfo);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Main Terminal Information Send Successfully");
      } catch (Exception var5) {
         result.setStatus(Result.FAIL);
         result.setMessage(var5.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<MainTerminalMaster> DeleteMainTerminalMaster(MainTerminalMasterCRUDDto mainTerminalMasterCRUDDto) {
      ResultWrapper<MainTerminalMaster> result = new ResultWrapper<>();

      try {
         MainTerminalMaster mainTerminalInfo = null;
         Integer mainTerminalId = mainTerminalMasterCRUDDto.getMainTerminalId();
         if (mainTerminalId > 0) {
            mainTerminalInfo = this.mainTerminalMasterRepo.DeleteMainTerminalById(mainTerminalId);
            result.setResult(mainTerminalInfo);
            result.setStatus(Result.SUCCESS);
            result.setMessage("Main Terminal Information Delete Successfully");
         } else {
            result.setResult(mainTerminalInfo);
            result.setStatus(Result.FAIL);
            result.setMessage("Invalid Request");
         }
      } catch (Exception var5) {
         result.setStatus(Result.FAIL);
         result.setMessage(var5.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<MainTerminalMaster> UpdateMainTerminalMaster(MainTerminalMaster mainTerminalMaster) {
      ResultWrapper<MainTerminalMaster> result = new ResultWrapper<>();

      try {
         Instant instant = Instant.now();
         Query query = new Query();
         query.addCriteria(Criteria.where("mainTerminalId").is(mainTerminalMaster.getMainTerminalId()));
         Update update = new Update();
         update.set("mainTerminalName", mainTerminalMaster.getMainTerminalName());
         update.set("clientId", mainTerminalMaster.getClientId());
         update.set("updatedTimestamp", instant.toEpochMilli());
         this.mongoTemplate.findAndModify(query, update, MainTerminalMaster.class);
         result.setResult(mainTerminalMaster);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Main Terminal Updated Successfully");
      } catch (Exception var6) {
         result.setStatus(Result.FAIL);
         result.setMessage(var6.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<CargoTypeMaster> AddCargoTypeMaster(CargoTypeMaster cargoTypeMaster) {
      ResultWrapper<CargoTypeMaster> result = new ResultWrapper<>();

      try {
         Integer ID = 0;
         Object maxID = this.cargoTypeMasterRepo.findMaxIdInCargoTypeMaster();
         if (maxID == null) {
            ID = 1;
            cargoTypeMaster.setCargoTypeId(ID);
         } else {
            ID = (Integer)maxID;
            ID = ID + 1;
            cargoTypeMaster.setCargoTypeId(ID);
         }

         Instant instant = Instant.now();
         cargoTypeMaster.setAddedTimestamp(instant.toEpochMilli());
         cargoTypeMaster.setUpdatedTimestamp(instant.toEpochMilli());
         cargoTypeMaster = (CargoTypeMaster)this.cargoTypeMasterRepo.save(cargoTypeMaster);
         result.setResult(cargoTypeMaster);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Cargo Type Added Successfully");
      } catch (Exception var6) {
         result.setStatus(Result.FAIL);
         result.setMessage(var6.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<List<CargoTypeMaster>> ViewCargoTypeMaster(CargoTypeMasterCRUDDto cargoTypeMasterCRUDDto) {
      ResultWrapper<List<CargoTypeMaster>> result = new ResultWrapper<>();

      try {
         List<CargoTypeMaster> cargoTypeMasterInfo = null;
         Integer cargoTypeId = cargoTypeMasterCRUDDto.getCargoTypeId();
         if (cargoTypeId == 0) {
            cargoTypeMasterInfo = this.cargoTypeMasterRepo.findAll();
         } else {
            cargoTypeMasterInfo = this.cargoTypeMasterRepo.findAndViewByCargoTypeId(cargoTypeId);
         }

         result.setResult(cargoTypeMasterInfo);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Cargo Type Information Send Successfully");
      } catch (Exception var5) {
         result.setStatus(Result.FAIL);
         result.setMessage(var5.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<CargoTypeMaster> DeleteCargoTypeMaster(CargoTypeMasterCRUDDto cargoTypeMasterCRUDDto) {
      ResultWrapper<CargoTypeMaster> result = new ResultWrapper<>();

      try {
         CargoTypeMaster cargoTypeInfo = null;
         Integer cargoTypeId = cargoTypeMasterCRUDDto.getCargoTypeId();
         if (cargoTypeId > 0) {
            cargoTypeInfo = this.cargoTypeMasterRepo.DeleteCargoTypeById(cargoTypeId);
            result.setResult(cargoTypeInfo);
            result.setStatus(Result.SUCCESS);
            result.setMessage("Cargo Type Information Delete Successfully");
         } else {
            result.setResult(cargoTypeInfo);
            result.setStatus(Result.FAIL);
            result.setMessage("Invalid Request");
         }
      } catch (Exception var5) {
         result.setStatus(Result.FAIL);
         result.setMessage(var5.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<CargoTypeMaster> UpdateCargoTypeMaster(CargoTypeMaster cargoTypeMaster) {
      ResultWrapper<CargoTypeMaster> result = new ResultWrapper<>();

      try {
         Instant instant = Instant.now();
         Query query = new Query();
         query.addCriteria(Criteria.where("cargoTypeId").is(cargoTypeMaster.getCargoTypeId()));
         Update update = new Update();
         update.set("cargoTypeName", cargoTypeMaster.getCargoTypeName());
         update.set("clientId", cargoTypeMaster.getClientId());
         update.set("updatedTimestamp", instant.toEpochMilli());
         this.mongoTemplate.findAndModify(query, update, CargoTypeMaster.class);
         result.setResult(cargoTypeMaster);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Cargo Type Updated Successfully");
      } catch (Exception var6) {
         result.setStatus(Result.FAIL);
         result.setMessage(var6.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<FuelTypeMaster> AddFuelTypeMaster(FuelTypeMaster fuelTypeMaster) {
      ResultWrapper<FuelTypeMaster> result = new ResultWrapper<>();

      try {
         Integer ID = 0;
         Object maxID = this.fuelTypeMasterRepo.findMaxIdInFuelTypeMaster();
         if (maxID == null) {
            ID = 1;
            fuelTypeMaster.setFuelTypeId(ID);
         } else {
            ID = (Integer)maxID;
            ID = ID + 1;
            fuelTypeMaster.setFuelTypeId(ID);
         }

         Instant instant = Instant.now();
         fuelTypeMaster.setAddedTimestamp(instant.toEpochMilli());
         fuelTypeMaster.setUpdatedTimestamp(instant.toEpochMilli());
         fuelTypeMaster = (FuelTypeMaster)this.fuelTypeMasterRepo.save(fuelTypeMaster);
         result.setResult(fuelTypeMaster);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Fuel Type Added Successfully");
      } catch (Exception var6) {
         result.setStatus(Result.FAIL);
         result.setMessage(var6.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<List<FuelTypeMaster>> ViewFuelTypeMaster(FuelTypeMasterCRUDDto fuelTypeMasterCRUDDto) {
      ResultWrapper<List<FuelTypeMaster>> result = new ResultWrapper<>();

      try {
         List<FuelTypeMaster> fuelTypeMasterInfo = null;
         Integer fuelTypeId = fuelTypeMasterCRUDDto.getFuelTypeId();
         if (fuelTypeId == 0) {
            fuelTypeMasterInfo = this.fuelTypeMasterRepo.findAll();
         } else {
            fuelTypeMasterInfo = this.fuelTypeMasterRepo.findAndViewByFuelTypeId(fuelTypeId);
         }

         result.setResult(fuelTypeMasterInfo);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Fuel Type Information Send Successfully");
      } catch (Exception var5) {
         result.setStatus(Result.FAIL);
         result.setMessage(var5.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<FuelTypeMaster> DeleteFuelTypeMaster(FuelTypeMasterCRUDDto fuelTypeMasterCRUDDto) {
      ResultWrapper<FuelTypeMaster> result = new ResultWrapper<>();

      try {
         FuelTypeMaster fuelTypeInfo = null;
         Integer fuelTypeId = fuelTypeMasterCRUDDto.getFuelTypeId();
         if (fuelTypeId > 0) {
            fuelTypeInfo = this.fuelTypeMasterRepo.DeleteFuelTypeById(fuelTypeId);
            result.setResult(fuelTypeInfo);
            result.setStatus(Result.SUCCESS);
            result.setMessage("Fuel Type Information Delete Successfully");
         } else {
            result.setResult(fuelTypeInfo);
            result.setStatus(Result.FAIL);
            result.setMessage("Invalid Request");
         }
      } catch (Exception var5) {
         result.setStatus(Result.FAIL);
         result.setMessage(var5.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<FuelTypeMaster> UpdateFuelTypeMaster(FuelTypeMaster fuelTypeMaster) {
      ResultWrapper<FuelTypeMaster> result = new ResultWrapper<>();

      try {
         Instant instant = Instant.now();
         Query query = new Query();
         query.addCriteria(Criteria.where("fuelTypeId").is(fuelTypeMaster.getFuelTypeId()));
         Update update = new Update();
         update.set("fuelTypeName", fuelTypeMaster.getFuelTypeName());
         update.set("clientId", fuelTypeMaster.getClientId());
         update.set("updatedTimestamp", instant.toEpochMilli());
         this.mongoTemplate.findAndModify(query, update, FuelTypeMaster.class);
         result.setResult(fuelTypeMaster);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Fuel Type Updated Successfully");
      } catch (Exception var6) {
         result.setStatus(Result.FAIL);
         result.setMessage(var6.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<ReferModeMaster> AddReferModeMaster(ReferModeMaster referModeMaster) {
      ResultWrapper<ReferModeMaster> result = new ResultWrapper<>();

      try {
         Integer ID = 0;
         Object maxID = this.referModeMasterRepo.findMaxIdInReferModeMaster();
         if (maxID == null) {
            ID = 1;
            referModeMaster.setReferModeId(ID);
         } else {
            ID = (Integer)maxID;
            ID = ID + 1;
            referModeMaster.setReferModeId(ID);
         }

         Instant instant = Instant.now();
         referModeMaster.setAddedTimestamp(instant.toEpochMilli());
         referModeMaster.setUpdatedTimestamp(instant.toEpochMilli());
         referModeMaster = (ReferModeMaster)this.referModeMasterRepo.save(referModeMaster);
         result.setResult(referModeMaster);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Refer Mode Added Successfully");
      } catch (Exception var6) {
         result.setStatus(Result.FAIL);
         result.setMessage(var6.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<List<ReferModeMaster>> ViewReferModeMaster(ReferModeCRUDDto referModeCRUDDto) {
      ResultWrapper<List<ReferModeMaster>> result = new ResultWrapper<>();

      try {
         List<ReferModeMaster> referModeMasterInfo = null;
         Integer referModeId = referModeCRUDDto.getReferModeId();
         if (referModeId == 0) {
            referModeMasterInfo = this.referModeMasterRepo.findAll();
         } else {
            referModeMasterInfo = this.referModeMasterRepo.findAndViewByReferModeId(referModeId);
         }

         result.setResult(referModeMasterInfo);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Refer Mode Information Send Successfully");
      } catch (Exception var5) {
         result.setStatus(Result.FAIL);
         result.setMessage(var5.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<ReferModeMaster> DeleteReferModeMaster(ReferModeCRUDDto referModeCRUDDto) {
      ResultWrapper<ReferModeMaster> result = new ResultWrapper<>();

      try {
         ReferModeMaster referModeInfo = null;
         Integer referModeId = referModeCRUDDto.getReferModeId();
         if (referModeId > 0) {
            referModeInfo = this.referModeMasterRepo.DeleteReferModeById(referModeId);
            result.setResult(referModeInfo);
            result.setStatus(Result.SUCCESS);
            result.setMessage("Refer Mode Information Delete Successfully");
         } else {
            result.setResult(referModeInfo);
            result.setStatus(Result.FAIL);
            result.setMessage("Invalid Request");
         }
      } catch (Exception var5) {
         result.setStatus(Result.FAIL);
         result.setMessage(var5.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<ReferModeMaster> UpdateReferModeMaster(ReferModeMaster referModeMaster) {
      ResultWrapper<ReferModeMaster> result = new ResultWrapper<>();

      try {
         Instant instant = Instant.now();
         Query query = new Query();
         query.addCriteria(Criteria.where("referModeId").is(referModeMaster.getReferModeId()));
         Update update = new Update();
         update.set("referModeName", referModeMaster.getReferModeName());
         update.set("clientId", referModeMaster.getClientId());
         update.set("updatedTimestamp", instant.toEpochMilli());
         this.mongoTemplate.findAndModify(query, update, ReferModeMaster.class);
         result.setResult(referModeMaster);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Refer Mode Updated Successfully");
      } catch (Exception var6) {
         result.setStatus(Result.FAIL);
         result.setMessage(var6.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<TrailerMaster> AddTrailerMaster(TrailerMaster trailerMaster) {
      ResultWrapper<TrailerMaster> result = new ResultWrapper<>();

      try {
         Integer ID = 0;
         Object maxID = this.trailerMasterRepo.findMaxIdInTrailerMaster();
         if (maxID == null) {
            ID = 1;
            trailerMaster.setTrailerId(ID);
         } else {
            ID = (Integer)maxID;
            ID = ID + 1;
            trailerMaster.setTrailerId(ID);
         }

         Instant instant = Instant.now();
         trailerMaster.setAddedTimestamp(instant.toEpochMilli());
         trailerMaster.setUpdatedTimestamp(instant.toEpochMilli());
         trailerMaster = (TrailerMaster)this.trailerMasterRepo.save(trailerMaster);
         result.setResult(trailerMaster);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Trailer Added Successfully");
      } catch (Exception var6) {
         result.setStatus(Result.FAIL);
         result.setMessage(var6.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<List<TrailerMaster>> ViewTrailerMaster(TrailerMasterCRUDDto trailerMasterCRUDDto) {
      ResultWrapper<List<TrailerMaster>> result = new ResultWrapper<>();

      try {
         List<TrailerMaster> trailerMasterInfo = null;
         Integer trailerId = trailerMasterCRUDDto.getTrailerId();
         long clientId = trailerMasterCRUDDto.getClientId();
         if (trailerId == 0) {
            trailerMasterInfo = this.trailerMasterRepo.findAllTrailers(clientId);
         } else {
            trailerMasterInfo = this.trailerMasterRepo.findAndViewByTrailerId(trailerId, clientId);
         }

         result.setResult(trailerMasterInfo);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Trailer Information Send Successfully");
      } catch (Exception var7) {
         result.setStatus(Result.FAIL);
         result.setMessage(var7.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<TrailerMaster> DeleteTrailerMaster(TrailerMasterCRUDDto trailerMasterCRUDDto) {
      ResultWrapper<TrailerMaster> result = new ResultWrapper<>();

      try {
         TrailerMaster trailerInfo = null;
         Integer trailerId = trailerMasterCRUDDto.getTrailerId();
         if (trailerId > 0) {
            trailerInfo = this.trailerMasterRepo.DeleteTrailerById(trailerId);
            result.setResult(trailerInfo);
            result.setStatus(Result.SUCCESS);
            result.setMessage("Trailer Information Delete Successfully");
         } else {
            result.setResult(trailerInfo);
            result.setStatus(Result.FAIL);
            result.setMessage("Invalid Request");
         }
      } catch (Exception var5) {
         result.setStatus(Result.FAIL);
         result.setMessage(var5.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<TrailerMaster> UpdateTrailerMaster(TrailerMaster trailerMaster) {
      ResultWrapper<TrailerMaster> result = new ResultWrapper<>();

      try {
         Instant instant = Instant.now();
         Query query = new Query();
         query.addCriteria(Criteria.where("trailerId").is(trailerMaster.getTrailerId()));
         Update update = new Update();
         update.set("trailerName", trailerMaster.getTrailerName());
         update.set("clientId", trailerMaster.getClientId());
         update.set("updatedTimestamp", instant.toEpochMilli());
         this.mongoTemplate.findAndModify(query, update, TrailerMaster.class);
         result.setResult(trailerMaster);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Trailer Updated Successfully");
      } catch (Exception var6) {
         result.setStatus(Result.FAIL);
         result.setMessage(var6.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<Simulator> AddSimulator(Simulator simulator) {
      ResultWrapper<Simulator> result = new ResultWrapper<>();
      String sDebug = "";

      try {
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE, d MMM yyyy HH:mm:ss z");
         LocalDateTime ldtDateTime = LocalDateTime.parse(simulator.getDateTime(), formatter);
         long lDateTime = ldtDateTime.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
         simulator.setLDateTime(lDateTime);
         simulator.setIsSend("false");
         Instant instant = Instant.now();
         simulator.setReceivedTimestamp(instant.toEpochMilli());
         simulator.setSendDateTime(0L);
         simulator = (Simulator)this.simulatorRepo.save(simulator);
         result.setResult(simulator);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Simulator Added Successfully");
      } catch (Exception var9) {
         result.setStatus(Result.FAIL);
         result.setMessage(var9.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<List<SimulatorCRUDDto>> ViewSimulator(SimulatorCRUDDto simulatorCRUDDto) {
      ResultWrapper<List<SimulatorCRUDDto>> result = new ResultWrapper<>();

      try {
         List<SimulatorCRUDDto> simulatorInfo = null;
         long driverId = (long)simulatorCRUDDto.getDriverId().intValue();
         long clientId = simulatorCRUDDto.getClientId();
         String fromDate = simulatorCRUDDto.getFromDate();
         String toDate = simulatorCRUDDto.getToDate();
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
         LocalDateTime ldtFromDate = LocalDateTime.parse(fromDate, formatter);
         long from = ldtFromDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
         LocalDateTime ldtToDate = LocalDateTime.parse(toDate, formatter);
         long to = ldtToDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
         simulatorInfo = this.lookupSimulatorDataOperation(from, to, driverId, clientId);
         result.setResult(simulatorInfo);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Simulator Information Send Successfully");
      } catch (Exception var17) {
         result.setStatus(Result.FAIL);
         result.setMessage(var17.getLocalizedMessage());
      }

      return result;
   }

   public List<SimulatorCRUDDto> lookupSimulatorDataOperation(long from, long to, long driverId, long clientId) {
      MatchOperation filter = null;
      if (driverId == 0L) {
         filter = Aggregation.match(Criteria.where("lDateTime").gte(from).lte(to).and("clientId").is(clientId));
      } else {
         filter = Aggregation.match(Criteria.where("lDateTime").gte(from).lte(to).and("clientId").is(clientId).and("driverId").is(driverId));
      }

      ProjectionOperation projectStage = Aggregation.project(
         new String[]{
            "_id",
            "driverId",
            "status",
            "dateTime",
            "lDateTime",
            "clientId",
            "isSend",
            "sendDateTime",
            "receivedTimestamp",
            "employee_master.title",
            "employee_master.firstName",
            "employee_master.lastName"
         }
      );
      LookupOperation employeeMaster = LookupOperation.newLookup()
         .from("employee_master")
         .localField("driverId")
         .foreignField("employeeId")
         .as("employee_master");
      Aggregation aggregation = Aggregation.newAggregation(
         new AggregationOperation[]{filter, employeeMaster, projectStage, Aggregation.sort(Direction.DESC, new String[]{"lDateTime"})}
      );
      return this.mongoTemplate.aggregate(aggregation, "simulator", SimulatorCRUDDto.class).getMappedResults();
   }

   @Override
   public ResultWrapper<Simulator> DeleteSimulator(SimulatorCRUDDto simulatorCRUDDto) {
      ResultWrapper<Simulator> result = new ResultWrapper<>();

      try {
         Simulator simulatorData = null;
         String _id = simulatorCRUDDto.get_id();
         if (!_id.equals("")) {
            ObjectId objId = new ObjectId(_id);
            simulatorData = this.simulatorRepo.DeleteSimulatorById(objId);
            result.setResult(simulatorData);
            result.setStatus(Result.SUCCESS);
            result.setMessage("Simulator Information Delete Successfully");
         } else {
            result.setResult(null);
            result.setStatus(Result.FAIL);
            result.setMessage("Invalid Request");
         }
      } catch (Exception var6) {
         result.setStatus(Result.FAIL);
         result.setMessage(var6.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<DefectMaster> AddDefect(DefectMaster defectMaster) {
      ResultWrapper<DefectMaster> result = new ResultWrapper<>();

      try {
         Integer ID = 0;
         Object maxID = this.defectMasterRepo.findMaxIdInDefectMaster();
         if (maxID == null) {
            ID = 1;
            defectMaster.setDefectId(ID);
         } else {
            ID = (Integer)maxID;
            ID = ID + 1;
            defectMaster.setDefectId(ID);
         }

         Instant instant = Instant.now();
         defectMaster.setAddedTimestamp(instant.toEpochMilli());
         defectMaster.setUpdatedTimestamp(instant.toEpochMilli());
         defectMaster = (DefectMaster)this.defectMasterRepo.save(defectMaster);
         result.setResult(defectMaster);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Defect Added Successfully");
      } catch (Exception var6) {
         result.setStatus(Result.FAIL);
         result.setMessage(var6.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<List<DefectMaster>> ViewDefect(DefectMasterCRUDDto defectMasterCRUDDto, String tokenValid) {
      ResultWrapper<List<DefectMaster>> result = new ResultWrapper<>();

      try {
         List<DefectMaster> defectMasterInfo = null;
         Integer defectId = defectMasterCRUDDto.getDefectId();
         if (defectId == 0) {
            defectMasterInfo = this.defectMasterRepo.findAll();
         } else {
            defectMasterInfo = this.defectMasterRepo.findAndViewByDefectMasterId(defectId);
         }

         result.setResult(defectMasterInfo);
         result.setToken(tokenValid);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Defect Information Send Successfully");
      } catch (Exception var6) {
         result.setStatus(Result.FAIL);
         result.setMessage(var6.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<DefectMaster> DeleteDefect(DefectMasterCRUDDto defectMasterCRUDDto) {
      ResultWrapper<DefectMaster> result = new ResultWrapper<>();

      try {
         DefectMaster defectInfo = null;
         Integer defectId = defectMasterCRUDDto.getDefectId();
         if (defectId > 0) {
            defectInfo = this.defectMasterRepo.DeleteDefectMasterById(defectId);
            result.setResult(defectInfo);
            result.setStatus(Result.SUCCESS);
            result.setMessage("Defect Information Delete Successfully");
         } else {
            result.setResult(defectInfo);
            result.setStatus(Result.FAIL);
            result.setMessage("Invalid Request");
         }
      } catch (Exception var5) {
         result.setStatus(Result.FAIL);
         result.setMessage(var5.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<DefectMaster> UpdateDefect(DefectMaster defectMaster) {
      ResultWrapper<DefectMaster> result = new ResultWrapper<>();

      try {
         Instant instant = Instant.now();
         Query query = new Query();
         query.addCriteria(Criteria.where("defectId").is(defectMaster.getDefectId()));
         Update update = new Update();
         update.set("defectName", defectMaster.getDefectName());
         update.set("defectType", defectMaster.getDefectType());
         update.set("clientId", defectMaster.getClientId());
         update.set("updatedTimestamp", instant.toEpochMilli());
         this.mongoTemplate.findAndModify(query, update, DefectMaster.class);
         result.setResult(defectMaster);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Defect Updated Successfully");
      } catch (Exception var6) {
         result.setStatus(Result.FAIL);
         result.setMessage(var6.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<RestartMaster> AddRestart(RestartMaster restartMaster) {
      ResultWrapper<RestartMaster> result = new ResultWrapper<>();

      try {
         Integer ID = 0;
         Object maxID = this.restartMasterRepo.findMaxIdInRestartMaster();
         if (maxID == null) {
            ID = 1;
            restartMaster.setRestartId(ID);
         } else {
            ID = (Integer)maxID;
            ID = ID + 1;
            restartMaster.setRestartId(ID);
         }

         Instant instant = Instant.now();
         restartMaster.setAddedTimestamp(instant.toEpochMilli());
         restartMaster.setUpdatedTimestamp(instant.toEpochMilli());
         restartMaster = (RestartMaster)this.restartMasterRepo.save(restartMaster);
         result.setResult(restartMaster);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Restart Added Successfully");
      } catch (Exception var6) {
         result.setStatus(Result.FAIL);
         result.setMessage(var6.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<List<RestartMaster>> ViewRestart(RestartMasterCRUDDto restartMasterCRUDDto) {
      ResultWrapper<List<RestartMaster>> result = new ResultWrapper<>();

      try {
         List<RestartMaster> restartMasterInfo = null;
         Integer restartId = restartMasterCRUDDto.getRestartId();
         if (restartId == 0) {
            restartMasterInfo = this.restartMasterRepo.findAll();
         } else {
            restartMasterInfo = this.restartMasterRepo.findAndViewByRestartMasterId(restartId);
         }

         result.setResult(restartMasterInfo);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Restart Information Send Successfully");
      } catch (Exception var5) {
         result.setStatus(Result.FAIL);
         result.setMessage(var5.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<RestartMaster> DeleteRestart(RestartMasterCRUDDto restartMasterCRUDDto) {
      ResultWrapper<RestartMaster> result = new ResultWrapper<>();

      try {
         RestartMaster restartInfo = null;
         Integer restartId = restartMasterCRUDDto.getRestartId();
         if (restartId > 0) {
            restartInfo = this.restartMasterRepo.DeleteRestartMasterById(restartId);
            result.setResult(restartInfo);
            result.setStatus(Result.SUCCESS);
            result.setMessage("Restart Information Delete Successfully");
         } else {
            result.setResult(restartInfo);
            result.setStatus(Result.FAIL);
            result.setMessage("Invalid Request");
         }
      } catch (Exception var5) {
         result.setStatus(Result.FAIL);
         result.setMessage(var5.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<RestartMaster> UpdateRestart(RestartMaster restartMaster) {
      ResultWrapper<RestartMaster> result = new ResultWrapper<>();

      try {
         Instant instant = Instant.now();
         Query query = new Query();
         query.addCriteria(Criteria.where("restartId").is(restartMaster.getRestartId()));
         Update update = new Update();
         update.set("restartName", restartMaster.getRestartName());
         update.set("clientId", restartMaster.getClientId());
         update.set("updatedTimestamp", instant.toEpochMilli());
         this.mongoTemplate.findAndModify(query, update, RestartMaster.class);
         result.setResult(restartMaster);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Restart Updated Successfully");
      } catch (Exception var6) {
         result.setStatus(Result.FAIL);
         result.setMessage(var6.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<RestBreakMaster> AddRestBreak(RestBreakMaster restBreakMaster) {
      ResultWrapper<RestBreakMaster> result = new ResultWrapper<>();

      try {
         Integer ID = 0;
         Object maxID = this.restBreakMasterRepo.findMaxIdInRestBreakMaster();
         if (maxID == null) {
            ID = 1;
            restBreakMaster.setRestBreakId(ID);
         } else {
            ID = (Integer)maxID;
            ID = ID + 1;
            restBreakMaster.setRestBreakId(ID);
         }

         Instant instant = Instant.now();
         restBreakMaster.setAddedTimestamp(instant.toEpochMilli());
         restBreakMaster.setUpdatedTimestamp(instant.toEpochMilli());
         restBreakMaster = (RestBreakMaster)this.restBreakMasterRepo.save(restBreakMaster);
         result.setResult(restBreakMaster);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Rest Break Added Successfully");
      } catch (Exception var6) {
         result.setStatus(Result.FAIL);
         result.setMessage(var6.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<List<RestBreakMaster>> ViewRestBreak(RestBreakMasterCRUDDto restBreakMasterCRUDDto) {
      ResultWrapper<List<RestBreakMaster>> result = new ResultWrapper<>();

      try {
         List<RestBreakMaster> restBreakMasterInfo = null;
         Integer restBreakId = restBreakMasterCRUDDto.getRestBreakId();
         if (restBreakId == 0) {
            restBreakMasterInfo = this.restBreakMasterRepo.findAll();
         } else {
            restBreakMasterInfo = this.restBreakMasterRepo.findAndViewByRestBreakMasterId(restBreakId);
         }

         result.setResult(restBreakMasterInfo);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Restart Information Send Successfully");
      } catch (Exception var5) {
         result.setStatus(Result.FAIL);
         result.setMessage(var5.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<RestBreakMaster> DeleteRestBreak(RestBreakMasterCRUDDto restBreakMasterCRUDDto) {
      ResultWrapper<RestBreakMaster> result = new ResultWrapper<>();

      try {
         RestBreakMaster reskBreakInfo = null;
         Integer restBreakId = restBreakMasterCRUDDto.getRestBreakId();
         if (restBreakId > 0) {
            reskBreakInfo = this.restBreakMasterRepo.DeleteRestBreakMasterById(restBreakId);
            result.setResult(reskBreakInfo);
            result.setStatus(Result.SUCCESS);
            result.setMessage("Restart Information Delete Successfully");
         } else {
            result.setResult(reskBreakInfo);
            result.setStatus(Result.FAIL);
            result.setMessage("Invalid Request");
         }
      } catch (Exception var5) {
         result.setStatus(Result.FAIL);
         result.setMessage(var5.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<RestBreakMaster> UpdateRestBreak(RestBreakMaster restBreakMaster) {
      ResultWrapper<RestBreakMaster> result = new ResultWrapper<>();

      try {
         Instant instant = Instant.now();
         Query query = new Query();
         query.addCriteria(Criteria.where("restBreakId").is(restBreakMaster.getRestBreakId()));
         Update update = new Update();
         update.set("restBreakName", restBreakMaster.getRestBreakName());
         update.set("clientId", restBreakMaster.getClientId());
         update.set("updatedTimestamp", instant.toEpochMilli());
         this.mongoTemplate.findAndModify(query, update, RestBreakMaster.class);
         result.setResult(restBreakMaster);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Rest Break Updated Successfully");
      } catch (Exception var6) {
         result.setStatus(Result.FAIL);
         result.setMessage(var6.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<VehicleCondition> AddVehicleCondition(VehicleCondition vehicleCondition) {
      ResultWrapper<VehicleCondition> result = new ResultWrapper<>();

      try {
         Integer ID = 0;
         Object maxID = this.vehicleConditionRepo.findMaxIdInVehicleConditionMaster();
         if (maxID == null) {
            ID = 1;
            vehicleCondition.setVehicleConditionId(ID);
         } else {
            ID = (Integer)maxID;
            ID = ID + 1;
            vehicleCondition.setVehicleConditionId(ID);
         }

         Instant instant = Instant.now();
         vehicleCondition.setAddedTimestamp(instant.toEpochMilli());
         vehicleCondition.setUpdatedTimestamp(instant.toEpochMilli());
         vehicleCondition = (VehicleCondition)this.vehicleConditionRepo.save(vehicleCondition);
         result.setResult(vehicleCondition);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Vehicle Condition Added Successfully");
      } catch (Exception var6) {
         result.setStatus(Result.FAIL);
         result.setMessage(var6.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<List<VehicleCondition>> ViewVehicleCondition(VehicleConditionCRUDDto vehicleConditionCRUDDto) {
      ResultWrapper<List<VehicleCondition>> result = new ResultWrapper<>();

      try {
         List<VehicleCondition> vehicleConditionInfo = null;
         Integer vehicleConditionId = vehicleConditionCRUDDto.getVehicleConditionId();
         long clientId = vehicleConditionCRUDDto.getClientId();
         if (vehicleConditionId == 0) {
            vehicleConditionInfo = this.vehicleConditionRepo.findAllVehicleConditions(clientId);
         } else {
            vehicleConditionInfo = this.vehicleConditionRepo.findAndViewByVehicleConditionId(vehicleConditionId, clientId);
         }

         result.setResult(vehicleConditionInfo);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Vehicle Condition Information Send Successfully");
      } catch (Exception var7) {
         result.setStatus(Result.FAIL);
         result.setMessage(var7.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<VehicleCondition> DeleteVehicleCondition(VehicleConditionCRUDDto vehicleConditionCRUDDto) {
      ResultWrapper<VehicleCondition> result = new ResultWrapper<>();

      try {
         VehicleCondition vehicleConditionInfo = null;
         Integer vehicleConditionId = vehicleConditionCRUDDto.getVehicleConditionId();
         if (vehicleConditionId > 0) {
            vehicleConditionInfo = this.vehicleConditionRepo.DeleteVehicleConditionById(vehicleConditionId);
            result.setResult(vehicleConditionInfo);
            result.setStatus(Result.SUCCESS);
            result.setMessage("Vehicle Condition Information Delete Successfully");
         } else {
            result.setResult(vehicleConditionInfo);
            result.setStatus(Result.FAIL);
            result.setMessage("Invalid Request");
         }
      } catch (Exception var5) {
         result.setStatus(Result.FAIL);
         result.setMessage(var5.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<VehicleCondition> UpdateVehicleCondition(VehicleCondition vehicleCondition) {
      ResultWrapper<VehicleCondition> result = new ResultWrapper<>();

      try {
         Instant instant = Instant.now();
         Query query = new Query();
         query.addCriteria(Criteria.where("vehicleConditionId").is(vehicleCondition.getVehicleConditionId()));
         Update update = new Update();
         update.set("vehicleConditionName", vehicleCondition.getVehicleConditionName());
         update.set("clientId", vehicleCondition.getClientId());
         update.set("updatedTimestamp", instant.toEpochMilli());
         this.mongoTemplate.findAndModify(query, update, VehicleCondition.class);
         result.setResult(vehicleCondition);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Vehicle Condition Updated Successfully");
      } catch (Exception var6) {
         result.setStatus(Result.FAIL);
         result.setMessage(var6.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<EldConnectionInterface> AddEldConnectionInterface(EldConnectionInterface eldConnectionInterface) {
      ResultWrapper<EldConnectionInterface> result = new ResultWrapper<>();

      try {
         Integer ID = 0;
         Object maxID = this.eldConnectionInterfaceRepo.findMaxIdInEldConnectionInterface();
         if (maxID == null) {
            ID = 1;
            eldConnectionInterface.setEldConnectionInterfaceId(ID);
         } else {
            ID = (Integer)maxID;
            ID = ID + 1;
            eldConnectionInterface.setEldConnectionInterfaceId(ID);
         }

         Instant instant = Instant.now();
         eldConnectionInterface.setAddedTimestamp(instant.toEpochMilli());
         eldConnectionInterface.setUpdatedTimestamp(instant.toEpochMilli());
         eldConnectionInterface = (EldConnectionInterface)this.eldConnectionInterfaceRepo.save(eldConnectionInterface);
         result.setResult(eldConnectionInterface);
         result.setStatus(Result.SUCCESS);
         result.setMessage("ELD Connection Interface Added Successfully");
      } catch (Exception var6) {
         result.setStatus(Result.FAIL);
         result.setMessage(var6.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<List<EldConnectionInterface>> ViewEldConnectionInterface(EldConnectionInterfaceCRUDDto eldConnectionInterfaceCRUDDto) {
      ResultWrapper<List<EldConnectionInterface>> result = new ResultWrapper<>();

      try {
         List<EldConnectionInterface> eldConnectionInterfaceInfo = null;
         Integer eldConnectionInterfaceId = eldConnectionInterfaceCRUDDto.getEldConnectionInterfaceId();
         if (eldConnectionInterfaceId == 0) {
            eldConnectionInterfaceInfo = this.eldConnectionInterfaceRepo.findAll();
         } else {
            eldConnectionInterfaceInfo = this.eldConnectionInterfaceRepo.findAndViewByEldConnectionInterfaceId(eldConnectionInterfaceId);
         }

         result.setResult(eldConnectionInterfaceInfo);
         result.setStatus(Result.SUCCESS);
         result.setMessage("ELD Connection Interface Information Send Successfully");
      } catch (Exception var5) {
         result.setStatus(Result.FAIL);
         result.setMessage(var5.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<String> AddMacAddress(MACAddressMaster macAddressMaster, String tokenValid) {
      ResultWrapper<String> result = new ResultWrapper<>();

      try {
         Instant instant = Instant.now();
         if (tokenValid.equals("true")) {
            List<MACAddressMaster> macAddressData = this.macAddressMasterRepo.findAndViewByMACAddressMasterId(macAddressMaster.getDriverId());
            if (macAddressData.size() <= 0) {
               macAddressMaster.setAddedTimestamp(instant.toEpochMilli());
               macAddressMaster.setUpdatedTimestamp(instant.toEpochMilli());
               if (!macAddressMaster.getMacAddress().equals("")) {
                  macAddressMaster.setDeviceStatus("Connected");
               } else {
                  macAddressMaster.setDeviceStatus("Disconnected");
               }

               macAddressMaster = (MACAddressMaster)this.macAddressMasterRepo.save(macAddressMaster);
            } else {
               Query query = new Query();
               query.addCriteria(Criteria.where("driverId").is(macAddressMaster.getDriverId()));
               Update update = new Update();
               update.set("vehicleId", macAddressMaster.getVehicleId());
               if (!macAddressMaster.getMacAddress().equals("")) {
                  update.set("macAddress", macAddressMaster.getMacAddress());
                  update.set("serialNo", macAddressMaster.getSerialNo());
                  update.set("version", macAddressMaster.getVersion());
                  update.set("modelNo", macAddressMaster.getModelNo());
                  update.set("deviceStatus", "Connected");
               } else {
                  update.set("deviceStatus", "Disconnected");
               }

               update.set("updatedTimestamp", instant.toEpochMilli());
               this.mongoTemplate.findAndModify(query, update, MACAddressMaster.class);
            }

            Query query = new Query();
            query.addCriteria(Criteria.where("employeeId").is(macAddressMaster.getDriverId()));
            Update update = new Update();
            update.set("truckNo", macAddressMaster.getVehicleId());
            this.mongoTemplate.findAndModify(query, update, EmployeeMaster.class);
         } else {
            List<MACAddressMaster> macAddressData = this.macAddressMasterRepo.findAndViewByMACAddressMasterId(macAddressMaster.getDriverId());
            if (macAddressData.size() <= 0) {
               macAddressMaster.setAddedTimestamp(instant.toEpochMilli());
               macAddressMaster.setUpdatedTimestamp(instant.toEpochMilli());
               if (!macAddressMaster.getMacAddress().equals("")) {
                  macAddressMaster.setDeviceStatus("Connected");
               } else {
                  macAddressMaster.setDeviceStatus("Disconnected");
               }

               macAddressMaster = (MACAddressMaster)this.macAddressMasterRepo.save(macAddressMaster);
            } else {
               Query query = new Query();
               query.addCriteria(Criteria.where("driverId").is(macAddressMaster.getDriverId()));
               Update update = new Update();
               update.set("vehicleId", macAddressMaster.getVehicleId());
               if (!macAddressMaster.getMacAddress().equals("")) {
                  update.set("macAddress", macAddressMaster.getMacAddress());
                  update.set("serialNo", macAddressMaster.getSerialNo());
                  update.set("version", macAddressMaster.getVersion());
                  update.set("modelNo", macAddressMaster.getModelNo());
                  update.set("deviceStatus", "Connected");
               } else {
                  update.set("deviceStatus", "Disconnected");
               }

               update.set("updatedTimestamp", instant.toEpochMilli());
               this.mongoTemplate.findAndModify(query, update, MACAddressMaster.class);
            }

            Query query = new Query();
            query.addCriteria(Criteria.where("employeeId").is(macAddressMaster.getDriverId()));
            Update update = new Update();
            update.set("truckNo", macAddressMaster.getVehicleId());
            this.mongoTemplate.findAndModify(query, update, EmployeeMaster.class);
         }

         result.setResult("Saved");
         result.setToken(tokenValid);
         result.setStatus(Result.SUCCESS);
         result.setMessage("MAC Address Added Successfully");
      } catch (Exception var8) {
         result.setStatus(Result.FAIL);
         result.setMessage(var8.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<String> AddDeviceStatus(DeviceStatus deviceStatus, String tokenValid) {
      ResultWrapper<String> result = new ResultWrapper<>();

      try {
         Instant instant = Instant.now();
         if (tokenValid.equals("true")) {
            List<DeviceStatus> deviceStatusData = this.deviceStatusRepo.findAndViewByDeviceStatusId(deviceStatus.getDriverId());
            if (deviceStatusData.size() <= 0) {
               deviceStatus.setAddedTimestamp(instant.toEpochMilli());
               deviceStatus.setUpdatedTimestamp(instant.toEpochMilli());
               deviceStatus = (DeviceStatus)this.deviceStatusRepo.save(deviceStatus);
            } else {
               Query query = new Query();
               query.addCriteria(Criteria.where("driverId").is(deviceStatus.getDriverId()));
               Update update = new Update();
               update.set("status", deviceStatus.getStatus());
               update.set("updatedTimestamp", instant.toEpochMilli());
               this.mongoTemplate.findAndModify(query, update, DeviceStatus.class);
            }
         } else {
            List<DeviceStatus> deviceStatusData = this.deviceStatusRepo.findAndViewByDeviceStatusId(deviceStatus.getDriverId());
            if (deviceStatusData.size() <= 0) {
               deviceStatus.setAddedTimestamp(instant.toEpochMilli());
               deviceStatus.setUpdatedTimestamp(instant.toEpochMilli());
               deviceStatus = (DeviceStatus)this.deviceStatusRepo.save(deviceStatus);
            } else {
               Query query = new Query();
               query.addCriteria(Criteria.where("driverId").is(deviceStatus.getDriverId()));
               Update update = new Update();
               update.set("status", deviceStatus.getStatus());
               update.set("updatedTimestamp", instant.toEpochMilli());
               this.mongoTemplate.findAndModify(query, update, DeviceStatus.class);
            }
         }

         List<MACAddressMaster> macAddress = this.macAddressMasterRepo.findAndViewByMACAddressMasterId(deviceStatus.getDriverId());
         if (macAddress.size() > 0) {
            Query query = new Query();
            query.addCriteria(
               Criteria.where("macAddress")
                  .is(macAddress.get(0).getMacAddress())
                  .and("driverId")
                  .is(deviceStatus.getDriverId())
                  .and("vehicleId")
                  .is(macAddress.get(0).getVehicleId())
            );
            Update update = new Update();
            update.set("deviceStatus", deviceStatus.getStatus());
            this.mongoTemplate.findAndModify(query, update, MACAddressMaster.class);
         }

         result.setResult("Saved");
         result.setToken(tokenValid);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Device Status Added Successfully");
      } catch (Exception var8) {
         result.setStatus(Result.FAIL);
         result.setMessage(var8.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<TimezoneMaster> AddTimezone(TimezoneMaster timezoneMaster) {
      ResultWrapper<TimezoneMaster> result = new ResultWrapper<>();

      try {
         Integer ID = 0;
         Object maxID = this.timezoneMasterRepo.findMaxIdInTimezoneMaster();
         if (maxID == null) {
            ID = 1;
            timezoneMaster.setTimezoneId(ID);
         } else {
            ID = (Integer)maxID;
            ID = ID + 1;
            timezoneMaster.setTimezoneId(ID);
         }

         Instant instant = Instant.now();
         timezoneMaster.setAddedTimestamp(instant.toEpochMilli());
         timezoneMaster.setUpdatedTimestamp(instant.toEpochMilli());
         timezoneMaster = (TimezoneMaster)this.timezoneMasterRepo.save(timezoneMaster);
         result.setResult(timezoneMaster);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Timezone Added Successfully");
      } catch (Exception var6) {
         result.setStatus(Result.FAIL);
         result.setMessage(var6.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<List<TimezoneMaster>> ViewTimezone(TimezoneMasterCRUDDto timezoneMasterCRUDDto) {
      ResultWrapper<List<TimezoneMaster>> result = new ResultWrapper<>();

      try {
         List<TimezoneMaster> timezoneMasterInfo = null;
         Integer timezoneId = timezoneMasterCRUDDto.getTimezoneId();
         if (timezoneId == 0) {
            timezoneMasterInfo = this.timezoneMasterRepo.findAll();
         } else {
            timezoneMasterInfo = this.timezoneMasterRepo.findAndViewByTimezoneId(timezoneId);
         }

         result.setResult(timezoneMasterInfo);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Timezone Information Send Successfully");
      } catch (Exception var5) {
         result.setStatus(Result.FAIL);
         result.setMessage(var5.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<TimezoneMaster> DeleteTimezone(TimezoneMasterCRUDDto timezoneMasterCRUDDto) {
      ResultWrapper<TimezoneMaster> result = new ResultWrapper<>();

      try {
         TimezoneMaster timezonenfo = null;
         Integer timezoneId = timezoneMasterCRUDDto.getTimezoneId();
         if (timezoneId > 0) {
            timezonenfo = this.timezoneMasterRepo.DeleteTimezoneById(timezoneId);
            result.setResult(timezonenfo);
            result.setStatus(Result.SUCCESS);
            result.setMessage("Timezone Information Delete Successfully");
         } else {
            result.setResult(timezonenfo);
            result.setStatus(Result.FAIL);
            result.setMessage("Invalid Request");
         }
      } catch (Exception var5) {
         result.setStatus(Result.FAIL);
         result.setMessage(var5.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<TimezoneMaster> UpdateTimezone(TimezoneMaster timezoneMaster) {
      ResultWrapper<TimezoneMaster> result = new ResultWrapper<>();

      try {
         Instant instant = Instant.now();
         Query query = new Query();
         query.addCriteria(Criteria.where("timezoneId").is(timezoneMaster.getTimezoneId()));
         Update update = new Update();
         update.set("timezoneName", timezoneMaster.getTimezoneName());
         update.set("clientId", timezoneMaster.getClientId());
         update.set("address", timezoneMaster.getAddress());
         update.set("remarks", timezoneMaster.getRemarks());
         update.set("updatedTimestamp", instant.toEpochMilli());
         this.mongoTemplate.findAndModify(query, update, TimezoneMaster.class);
         result.setResult(timezoneMaster);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Timezone Updated Successfully");
      } catch (Exception var6) {
         result.setStatus(Result.FAIL);
         result.setMessage(var6.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<List<GeofanceMaster>> ViewGeofanceMaster(GeofanceMasterCRUDDto geofanceMasterCRUDDto) {
      ResultWrapper<List<GeofanceMaster>> result = new ResultWrapper<>();

      try {
         List<GeofanceMaster> geofanceMasterInfo = null;
         Integer geoId = geofanceMasterCRUDDto.getGeoId();
         if (geoId == 0) {
            geofanceMasterInfo = this.geofanceMasterRepo.findAll();
         } else {
            geofanceMasterInfo = this.geofanceMasterRepo.findGeofanceById(geoId);
         }

         result.setResult(geofanceMasterInfo);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Geofances Information Send Successfully");
      } catch (Exception var5) {
         result.setStatus(Result.FAIL);
         result.setMessage(var5.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<ELDSettings> AddEldSettings(ELDSettings eldSettings) {
      ResultWrapper<ELDSettings> result = new ResultWrapper<>();

      try {
         List<ELDSettings> eldData = this.eldSettingsRepo.findAll();
         if (eldData.size() <= 0) {
            Integer ID = 0;
            Object maxID = this.eldSettingsRepo.findMaxIdInELDSettings();
            if (maxID == null) {
               ID = 1;
               eldSettings.setSettingId(ID);
            } else {
               ID = (Integer)maxID;
               ID = ID + 1;
               eldSettings.setSettingId(ID);
            }

            Instant instant = Instant.now();
            eldSettings.setAddedTimestamp(instant.toEpochMilli());
            eldSettings.setUpdatedTimestamp(instant.toEpochMilli());
            eldSettings = (ELDSettings)this.eldSettingsRepo.save(eldSettings);
            result.setResult(eldSettings);
            result.setStatus(Result.SUCCESS);
            result.setMessage("Setting Added Successfully");
         } else {
            result.setResult(null);
            result.setStatus(Result.FAIL);
            result.setMessage("Settings information already saved.");
         }
      } catch (Exception var7) {
         result.setStatus(Result.FAIL);
         result.setMessage(var7.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<List<ELDSettings>> ViewEldSettings(ELDSettings eldSettings) {
      ResultWrapper<List<ELDSettings>> result = new ResultWrapper<>();

      try {
         List<ELDSettings> settingInfo = null;
         Integer settingId = eldSettings.getSettingId();
         if (settingId == 0) {
            settingInfo = this.eldSettingsRepo.findAll();
         } else {
            settingInfo = this.eldSettingsRepo.findAndViewBySettingId(settingId);
         }

         result.setResult(settingInfo);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Setting Information Send Successfully");
      } catch (Exception var5) {
         result.setStatus(Result.FAIL);
         result.setMessage(var5.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<ELDSettings> DeleteEldSettings(ELDSettings eldSettings) {
      ResultWrapper<ELDSettings> result = new ResultWrapper<>();

      try {
         ELDSettings settingInfo = null;
         Integer settingId = eldSettings.getSettingId();
         if (settingId > 0) {
            settingInfo = this.eldSettingsRepo.DeleteSettingById(settingId);
            result.setResult(settingInfo);
            result.setStatus(Result.SUCCESS);
            result.setMessage("Setting Information Delete Successfully");
         } else {
            result.setResult(settingInfo);
            result.setStatus(Result.FAIL);
            result.setMessage("Invalid Request");
         }
      } catch (Exception var5) {
         result.setStatus(Result.FAIL);
         result.setMessage(var5.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<ELDSettings> UpdateEldSettings(ELDSettings eldSettings) {
      ResultWrapper<ELDSettings> result = new ResultWrapper<>();

      try {
         Instant instant = Instant.now();
         Query query = new Query();
         query.addCriteria(Criteria.where("settingId").is(eldSettings.getSettingId()));
         Update update = new Update();
         update.set("eldIdentifier", eldSettings.getEldIdentifier());
         update.set("eldProvider", eldSettings.getEldProvider());
         update.set("eldSoftwareVersion", eldSettings.getEldSoftwareVersion());
         update.set("eldRegistrationId", eldSettings.getEldRegistrationId());
         update.set("googleApiUrl", eldSettings.getGoogleApiUrl());
         update.set("smsApiUrl", eldSettings.getSmsApiUrl());
         update.set("androidVersion", eldSettings.getAndroidVersion());
         update.set("androidCode", eldSettings.getAndroidCode());
         update.set("iosVersion", eldSettings.getIosVersion());
         update.set("iosCode", eldSettings.getIosCode());
         update.set("termsAndCondition", eldSettings.getTermsAndCondition());
         update.set("updatedTimestamp", instant.toEpochMilli());
         this.mongoTemplate.findAndModify(query, update, ELDSettings.class);
         result.setResult(eldSettings);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Settings Updated Successfully");
      } catch (Exception var6) {
         result.setStatus(Result.FAIL);
         result.setMessage(var6.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<String> UpdateDisclaimerInUser(UserMasterCRUDDto userMasterCRUDDto) {
      ResultWrapper<String> result = new ResultWrapper<>();

      try {
         Instant instant = Instant.now();
         Query query = new Query();
         query.addCriteria(Criteria.where("userId").is(userMasterCRUDDto.getUserId()));
         Update update = new Update();
         update.set("disclaimerRead", 1);
         this.mongoTemplate.findAndModify(query, update, UserMaster.class);
         result.setResult("Updated");
         result.setStatus(Result.SUCCESS);
         result.setMessage("Disclaimer Updated Successfully");
      } catch (Exception var6) {
         result.setStatus(Result.FAIL);
         result.setMessage(var6.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<String> UpdateDisclaimerInDriver(UserMasterCRUDDto userMasterCRUDDto) {
      ResultWrapper<String> result = new ResultWrapper<>();

      try {
         Instant instant = Instant.now();
         Query query = new Query();
         query.addCriteria(Criteria.where("employeeId").is((int)userMasterCRUDDto.getDriverId()));
         Update update = new Update();
         update.set("disclaimerRead", 1);
         this.mongoTemplate.findAndModify(query, update, EmployeeMaster.class);
         result.setResult("Updated");
         result.setStatus(Result.SUCCESS);
         result.setMessage("Disclaimer Updated Successfully");
      } catch (Exception var6) {
         result.setStatus(Result.FAIL);
         result.setMessage(var6.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<Disclaimer> AddDisclaimer(Disclaimer disclaimer) {
      ResultWrapper<Disclaimer> result = new ResultWrapper<>();

      try {
         List<Disclaimer> disclaimerData = this.disclaimerRepo.findAll();
         if (disclaimerData.size() <= 0) {
            Instant instant = Instant.now();
            disclaimer.setDisclaimerId(1);
            disclaimer.setIsRead(0);
            disclaimer.setAddedTimestamp(instant.toEpochMilli());
            disclaimer.setUpdatedTimestamp(instant.toEpochMilli());
            disclaimer = (Disclaimer)this.disclaimerRepo.save(disclaimer);
            result.setResult(disclaimer);
            result.setStatus(Result.SUCCESS);
            result.setMessage("Disclaimer Added Successfully");
         } else {
            result.setResult(null);
            result.setStatus(Result.FAIL);
            result.setMessage("Disclaimer information already saved.");
         }
      } catch (Exception var5) {
         result.setStatus(Result.FAIL);
         result.setMessage(var5.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<List<Disclaimer>> ViewDisclaimer() {
      ResultWrapper<List<Disclaimer>> result = new ResultWrapper<>();

      try {
         List<Disclaimer> disclaimer = this.disclaimerRepo.findAll();
         result.setResult(disclaimer);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Disclaimer Information Send Successfully");
      } catch (Exception var3) {
         result.setStatus(Result.FAIL);
         result.setMessage(var3.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<ProjectDetailAnalyticsViewDto> ViewProjectDetailAnalytics() {
      ResultWrapper<ProjectDetailAnalyticsViewDto> result = new ResultWrapper<>();

      try {
         ProjectDetailAnalyticsViewDto projectDetailAnalytics = new ProjectDetailAnalyticsViewDto();
         List<EmployeeMaster> empInfo = this.employeeMasterRepo.findAll();
         List<ClientMaster> clientInfo = this.clientMasterRepo.findAll();
         List<UserMaster> userInfo = this.userMasterRepo.findAll();
         List<VehicleMaster> vehicleInfo = this.vehicleMasterRepo.findAll();
         projectDetailAnalytics.setTotalDrivers((long)empInfo.size());
         projectDetailAnalytics.setTotalCompanies((long)clientInfo.size());
         projectDetailAnalytics.setTotalUsers((long)userInfo.size());
         projectDetailAnalytics.setTotalVehicles((long)vehicleInfo.size());
         result.setResult(projectDetailAnalytics);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Detail Analytics Information Send Successfully");
      } catch (Exception var7) {
         result.setStatus(Result.FAIL);
         result.setMessage(var7.getLocalizedMessage());
      }

      return result;
   }

   @Override
   public ResultWrapper<ProjectDetailAnalyticsViewDto> ViewProjectDetailAnalyticsByClient(ClientMasterCRUDDto clientMasterCRUDDto) {
      ResultWrapper<ProjectDetailAnalyticsViewDto> result = new ResultWrapper<>();

      try {
         ProjectDetailAnalyticsViewDto projectDetailAnalytics = new ProjectDetailAnalyticsViewDto();
         long clientId = (long)clientMasterCRUDDto.getClientId().intValue();
         long totalDrivers = 0L;
         long totalVehicles = 0L;
         long totalUsers = 0L;
         long totalCompanies = 0L;
         long connectedDevice = 0L;
         long disconnectedDevice = 0L;
         if (clientId == 0L) {
            List<EmployeeMaster> empInfo = this.employeeMasterRepo.findAll();
            List<ClientMaster> clientInfo = this.clientMasterRepo.findAll();
            List<UserMaster> userInfo = this.userMasterRepo.findAll();
            List<VehicleMaster> vehicleInfo = this.vehicleMasterRepo.findAll();
            totalDrivers = (long)empInfo.size();
            totalCompanies = (long)clientInfo.size();
            totalUsers = (long)userInfo.size();
            totalVehicles = (long)vehicleInfo.size();

            for(int i = 0; i < empInfo.size(); ++i) {
               List<DeviceStatus> deviceStatus = this.deviceStatusRepo.findAndViewByDeviceStatusId((long)empInfo.get(i).getEmployeeId().intValue());
               if (deviceStatus.size() > 0) {
                  if (deviceStatus.get(0).getStatus().equals("Disconnected")) {
                     ++disconnectedDevice;
                  } else {
                     ++connectedDevice;
                  }
               }
            }
         } else {
            List<EmployeeMasterViewDto> empInfo = this.employeeMasterRepo.findAllEmployees(clientId);
            List<UserMaster> userInfo = this.userMasterRepo.findAllUsers(clientId);
            List<VehicleMasterViewDto> vehicleInfo = this.vehicleMasterRepo.findAllVehicles(clientId);
            totalDrivers = (long)empInfo.size();
            totalCompanies = 1L;
            totalUsers = (long)userInfo.size();
            totalVehicles = (long)vehicleInfo.size();

            for(int i = 0; i < empInfo.size(); ++i) {
               List<DeviceStatus> deviceStatus = this.deviceStatusRepo.findAndViewByDeviceStatusId((long)empInfo.get(i).getEmployeeId().intValue());
               if (deviceStatus.size() > 0) {
                  if (deviceStatus.get(0).getStatus().equals("Disconnected")) {
                     ++disconnectedDevice;
                  } else {
                     ++connectedDevice;
                  }
               }
            }
         }

         projectDetailAnalytics.setTotalDrivers(totalDrivers);
         projectDetailAnalytics.setTotalCompanies(totalCompanies);
         projectDetailAnalytics.setTotalUsers(totalUsers);
         projectDetailAnalytics.setTotalVehicles(totalVehicles);
         projectDetailAnalytics.setTotalDeviceConnected(connectedDevice);
         projectDetailAnalytics.setTotalDeviceDisconnected(disconnectedDevice);
         result.setResult(projectDetailAnalytics);
         result.setStatus(Result.SUCCESS);
         result.setMessage("Detail Analytics Information Send Successfully");
      } catch (Exception var24) {
         result.setStatus(Result.FAIL);
         result.setMessage(var24.getLocalizedMessage());
      }

      return result;
   }
}
