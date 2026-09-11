package com.mes.eld_log.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mes.eld_log.dtos.AddCertifiedLogDto;
import com.mes.eld_log.dtos.AddDriveringStatusDto;
import com.mes.eld_log.dtos.AddDriveringStatusResponseDto;
import com.mes.eld_log.dtos.AddDvirDataDto;
import com.mes.eld_log.dtos.AlertsLogViewDto;
import com.mes.eld_log.dtos.AllDispatchDataViewDto;
import com.mes.eld_log.dtos.AssignLogToDriverDto;
import com.mes.eld_log.dtos.CertifiedLogCRUDDto;
import com.mes.eld_log.dtos.CertifiedLogViewDto;
import com.mes.eld_log.dtos.ClientMasterCRUDDto;
import com.mes.eld_log.dtos.DVIRDataCRUDDto;
import com.mes.eld_log.dtos.DispatchDetailCRUDDto;
import com.mes.eld_log.dtos.DispatchDetailViewDto;
import com.mes.eld_log.dtos.DriverLogWithLoginLogViewDto;
import com.mes.eld_log.dtos.DriveringStatusCRUDDto;
import com.mes.eld_log.dtos.DriveringStatusLogViewDto;
import com.mes.eld_log.dtos.DriveringStatusViewDto;
import com.mes.eld_log.dtos.ELDOtaCRUDDto;
import com.mes.eld_log.dtos.ELDSupportViewDto;
import com.mes.eld_log.dtos.EldLogDataViewDto;
import com.mes.eld_log.dtos.EldReportDto;
import com.mes.eld_log.dtos.EmployeeMasterCRUDDto;
import com.mes.eld_log.dtos.EmployeeMasterViewDto;
import com.mes.eld_log.dtos.IftaReportViewDto;
import com.mes.eld_log.dtos.IftaSummaryReport;
import com.mes.eld_log.dtos.LiveDataLogViewDto;
import com.mes.eld_log.dtos.LoginLogViewDto;
import com.mes.eld_log.dtos.ViewDriverLogWithDetailDto;
import com.mes.eld_log.dtos.ViewDriverWorkingDayStatus;
import com.mes.eld_log.models.CertifiedLog;
import com.mes.eld_log.models.DVIRData;
import com.mes.eld_log.models.DefectDetails;
import com.mes.eld_log.models.DriverWorkingStatus;
import com.mes.eld_log.models.DriveringStatus;
import com.mes.eld_log.models.ELDOta;
import com.mes.eld_log.models.ELDOtaStatus;
import com.mes.eld_log.models.ELDSupport;
import com.mes.eld_log.models.ExceptionLog;
import com.mes.eld_log.models.ServerHealth;
import com.mes.eld_log.results.ResultWrapper;
import com.mes.eld_log.service.DispatchService;
import com.mes.eld_log.util.eldLogUtils;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping({"/dispatch"})
public class DispatchController {
   private static final Logger LOGGER = LoggerFactory.getLogger(DispatchController.class);
   @Autowired
   private DispatchService dispatchService;
   @Autowired
   private eldLogUtils imobilityUtils;

   @ResponseStatus(HttpStatus.BAD_REQUEST)
   @ExceptionHandler({MethodArgumentNotValidException.class})
   public Map<String, String> handleMethodArgumentNotValid(MethodArgumentNotValidException ex) {
      Map<String, String> errors = new HashMap<>();
      errors.put("status", "FAIL");
      ex.getBindingResult().getFieldErrors().forEach(error -> errors.put(error.getField(), error.getDefaultMessage()));
      return errors;
   }

   @PostMapping({"/add_dispatch_details"})
   public ResponseEntity<ResultWrapper<String>> AddDispatchDetails(@Valid @RequestBody DispatchDetailCRUDDto dispatchDetailCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<String> result = null;
      result = this.dispatchService.AddDispatchDetails(dispatchDetailCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_dispatch_details"})
   public ResponseEntity<ResultWrapper<List<DispatchDetailViewDto>>> ViewDispatchDetails(@Valid @RequestBody DispatchDetailCRUDDto dispatchDetailCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<List<DispatchDetailViewDto>> result = null;
      result = this.dispatchService.ViewDispatchDetails(dispatchDetailCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/dispatch_data"})
   public ResponseEntity<ResultWrapper<AllDispatchDataViewDto>> ViewDispatchData(@Valid @RequestBody DispatchDetailCRUDDto dispatchDetailCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<AllDispatchDataViewDto> result = null;
      result = this.dispatchService.ViewDispatchData(dispatchDetailCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/add_exception_log"})
   public ResponseEntity<ResultWrapper<String>> AddExceptionLog(@Valid @RequestBody ExceptionLog exceptionLog) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<String> result = null;
      String tokenValid = "";

      try {
         tokenValid = this.imobilityUtils.CheckTokenNo((int)exceptionLog.getDriverId(), exceptionLog.getTokenNo());
      } catch (Exception var5) {
         var5.printStackTrace();
      }

      result = this.dispatchService.AddExceptionLog(exceptionLog, tokenValid);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_eld_log_data"})
   public ResponseEntity<ResultWrapper<List<EldLogDataViewDto>>> ViewEldLogData() throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<List<EldLogDataViewDto>> result = null;
      result = this.dispatchService.ViewEldLogData();
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/add_drivering_status"})
   public ResponseEntity<ResultWrapper<DriveringStatusViewDto>> AddDriveringStatus(@Valid @RequestBody DriveringStatus driveringStatus) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<DriveringStatusViewDto> result = null;
      String tokenValid = "";

      try {
         tokenValid = this.imobilityUtils.CheckTokenNo((int)driveringStatus.getDriverId(), driveringStatus.getTokenNo());
      } catch (Exception var5) {
         var5.printStackTrace();
      }

      result = this.dispatchService.AddDriveringStatus(driveringStatus, tokenValid);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/add_drivering_status_from_web"})
   public ResponseEntity<ResultWrapper<String>> AddDriveringStatusFromWeb(@Valid @RequestBody DriveringStatus driveringStatus, javax.servlet.http.HttpServletRequest request) throws UnsupportedEncodingException, JsonProcessingException {
      com.mes.eld_log.models.UserMaster user = imobilityUtils.getLoggedInUser(request);
      if (user != null && (user.getUserTypeId() == 2 || user.getUserTypeId() == 3)) {
         ResultWrapper<String> result = new ResultWrapper<>();
         result.setStatus(com.mes.eld_log.results.Result.FAIL);
         result.setMessage("Unauthorized: Company Admin or Support Personnel cannot perform this action.");
         return new ResponseEntity(result, HttpStatus.FORBIDDEN);
      }
      ResultWrapper<String> result = null;
      result = this.dispatchService.AddDriveringStatusFromWeb(driveringStatus);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/add_drivering_status_offline"})
   public ResponseEntity<ResultWrapper<List<AddDriveringStatusResponseDto>>> AddDriveringStatusOffline(
      @Valid @RequestBody AddDriveringStatusDto addDriveringStatusDto
   ) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<List<AddDriveringStatusResponseDto>> result = null;
      String tokenValid = "false";
      result = this.dispatchService.AddDriveringStatusOffline(addDriveringStatusDto, tokenValid);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_drivering_status"})
   public ResponseEntity<ResultWrapper<List<DriveringStatusViewDto>>> ViewDriveringStatus(@Valid @RequestBody DriveringStatusCRUDDto driveringStatusCRUDDto, javax.servlet.http.HttpServletRequest request) throws UnsupportedEncodingException, JsonProcessingException {
      com.mes.eld_log.models.UserMaster user = imobilityUtils.getLoggedInUser(request);
      if (user != null && (user.getUserTypeId() == 2 || user.getUserTypeId() == 3)) {
         driveringStatusCRUDDto.setClientId((long) user.getClientId());
      }
      ResultWrapper<List<DriveringStatusViewDto>> result = null;
      String tokenValid = "";

      try {
         tokenValid = this.imobilityUtils.CheckTokenNo((int)driveringStatusCRUDDto.getDriverId(), driveringStatusCRUDDto.getTokenNo());
      } catch (Exception var5) {
         var5.printStackTrace();
      }

      result = this.dispatchService.ViewDriveringStatus(driveringStatusCRUDDto, tokenValid);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/shift_drivering_status_without_update"})
   public ResponseEntity<ResultWrapper<String>> ShiftDriveringStatusWithoutUpdate(@Valid @RequestBody DriveringStatusCRUDDto driveringStatusCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<String> result = null;
      result = this.dispatchService.ShiftDriveringStatusWithoutUpdate(driveringStatusCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_drivering_status_for_log"})
   public ResponseEntity<ResultWrapper<List<DriveringStatusViewDto>>> ViewDriveringStatusForLog(
      @Valid @RequestBody DriveringStatusCRUDDto driveringStatusCRUDDto
   ) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<List<DriveringStatusViewDto>> result = null;
      result = this.dispatchService.ViewDriveringStatusForLog(driveringStatusCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_drivering_status_with_login_details"})
   public ResponseEntity<ResultWrapper<EmployeeMasterCRUDDto>> ViewDriveringStatusWithLoginDetails(
      @Valid @RequestBody DriveringStatusCRUDDto driveringStatusCRUDDto
   ) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<EmployeeMasterCRUDDto> result = null;
      String tokenValid = "";

      try {
         tokenValid = this.imobilityUtils.CheckTokenNo((int)driveringStatusCRUDDto.getDriverId(), driveringStatusCRUDDto.getTokenNo());
      } catch (Exception var5) {
         var5.printStackTrace();
      }

      result = this.dispatchService.ViewDriveringStatusWithLoginDetails(driveringStatusCRUDDto, tokenValid);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_drivering_status_log"})
   public ResponseEntity<ResultWrapper<List<DriveringStatusLogViewDto>>> ViewDriveringStatusLog(
      @Valid @RequestBody DriveringStatusCRUDDto driveringStatusCRUDDto
   ) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<List<DriveringStatusLogViewDto>> result = null;
      result = this.dispatchService.ViewDriveringStatusLog(driveringStatusCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/assign_log_to_driver"})
   public ResponseEntity<ResultWrapper<String>> AssignLogToDriver(@Valid @RequestBody AssignLogToDriverDto assignLogToDriverDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<String> result = null;
      result = this.dispatchService.AssignLogToDriver(assignLogToDriverDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/shift_hour_in_drivering_status_log"})
   public ResponseEntity<ResultWrapper<String>> ShiftHourInDriveringStatusLog(@Valid @RequestBody AssignLogToDriverDto assignLogToDriverDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<String> result = null;
      result = this.dispatchService.ShiftHourInDriveringStatusLog(assignLogToDriverDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_drivering_status_for_graph"})
   public ResponseEntity<ResultWrapper<List<DriveringStatusViewDto>>> ViewDriveringStatusForGraph(
      @Valid @RequestBody DriveringStatusCRUDDto driveringStatusCRUDDto
   ) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<List<DriveringStatusViewDto>> result = null;
      result = this.dispatchService.ViewDriveringStatusForGraph(driveringStatusCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_voilation_report"})
   public ResponseEntity<ResultWrapper<List<DriveringStatusViewDto>>> ViewVoilationReport(@Valid @RequestBody DriveringStatusCRUDDto driveringStatusCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<List<DriveringStatusViewDto>> result = null;
      result = this.dispatchService.ViewVoilationReport(driveringStatusCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_drivering_status_for_graph_new"})
   public ResponseEntity<ResultWrapper<List<DriveringStatusViewDto>>> ViewDriveringStatusForGraphNew(
      @Valid @RequestBody DriveringStatusCRUDDto driveringStatusCRUDDto
   ) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<List<DriveringStatusViewDto>> result = null;
      result = this.dispatchService.ViewDriveringStatusForGraphNew(driveringStatusCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_drivering_status_calculation"})
   public ResponseEntity<ResultWrapper<List<DriveringStatusViewDto>>> ViewDriveringStatusCalculation(
      @Valid @RequestBody DriveringStatusCRUDDto driveringStatusCRUDDto
   ) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<List<DriveringStatusViewDto>> result = null;
      result = this.dispatchService.ViewDriveringStatusCalculation(driveringStatusCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_unidentified_events"})
   public ResponseEntity<ResultWrapper<List<DriveringStatusViewDto>>> ViewUnidentifiedEvents(@Valid @RequestBody DriveringStatusCRUDDto driveringStatusCRUDDto, javax.servlet.http.HttpServletRequest request) throws UnsupportedEncodingException, JsonProcessingException {
      com.mes.eld_log.models.UserMaster user = imobilityUtils.getLoggedInUser(request);
      if (user != null && (user.getUserTypeId() == 2 || user.getUserTypeId() == 3)) {
         driveringStatusCRUDDto.setClientId((long) user.getClientId());
      }
      ResultWrapper<List<DriveringStatusViewDto>> result = null;
      result = this.dispatchService.ViewUnidentifiedEvents(driveringStatusCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_drivering_status_by_date"})
   public ResponseEntity<ResultWrapper<List<DriveringStatusViewDto>>> ViewDriveringStatusByDate(
      @Valid @RequestBody DriveringStatusCRUDDto driveringStatusCRUDDto
   ) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<List<DriveringStatusViewDto>> result = null;
      String tokenValid = "";

      try {
         tokenValid = this.imobilityUtils.CheckTokenNo((int)driveringStatusCRUDDto.getDriverId(), driveringStatusCRUDDto.getTokenNo());
      } catch (Exception var5) {
         var5.printStackTrace();
      }

      result = this.dispatchService.ViewDriveringStatusByDate(driveringStatusCRUDDto, tokenValid);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_driver_log_with_details"})
   public ResponseEntity<ResultWrapper<ViewDriverLogWithDetailDto>> ViewDriverLogWithDetails(@Valid @RequestBody DriveringStatusCRUDDto driveringStatusCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<ViewDriverLogWithDetailDto> result = null;
      result = this.dispatchService.ViewDriverLogWithDetails(driveringStatusCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_driver_working_day"})
   public ResponseEntity<ResultWrapper<List<ViewDriverWorkingDayStatus>>> ViewDriverWorkingDay(
      @Valid @RequestBody DriveringStatusCRUDDto driveringStatusCRUDDto
   ) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<List<ViewDriverWorkingDayStatus>> result = null;
      result = this.dispatchService.ViewDriverWorkingDay(driveringStatusCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_driver_log_with_login_log"})
   public ResponseEntity<ResultWrapper<DriverLogWithLoginLogViewDto>> ViewDriverLogWithLoginLog(
      @Valid @RequestBody DriveringStatusCRUDDto driveringStatusCRUDDto
   ) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<DriverLogWithLoginLogViewDto> result = null;
      String tokenValid = "";

      try {
         tokenValid = this.imobilityUtils.CheckTokenNo((int)driveringStatusCRUDDto.getDriverId(), driveringStatusCRUDDto.getTokenNo());
      } catch (Exception var5) {
         var5.printStackTrace();
      }

      result = this.dispatchService.ViewDriverLogWithLoginLog(driveringStatusCRUDDto, tokenValid);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/login_log_for_web"})
   public ResponseEntity<ResultWrapper<List<LoginLogViewDto>>> LoginLogForWeb(@Valid @RequestBody DriveringStatusCRUDDto driveringStatusCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<List<LoginLogViewDto>> result = null;
      result = this.dispatchService.LoginLogForWeb(driveringStatusCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/update_driver_log"})
   public ResponseEntity<ResultWrapper<String>> UpdateDriverLog(@Valid @RequestBody DriveringStatusCRUDDto driveringStatusCRUDDto, javax.servlet.http.HttpServletRequest request) throws UnsupportedEncodingException, JsonProcessingException {
      com.mes.eld_log.models.UserMaster user = imobilityUtils.getLoggedInUser(request);
      if (user != null && user.getUserTypeId() == 3) {
         ResultWrapper<String> result = new ResultWrapper<>();
         result.setStatus(com.mes.eld_log.results.Result.FAIL);
         result.setMessage("Unauthorized: Support Personnel cannot perform this action.");
         return new ResponseEntity(result, HttpStatus.FORBIDDEN);
      }
      ResultWrapper<String> result = null;
      result = this.dispatchService.UpdateDriverLog(driveringStatusCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/update_and_enable_disable_driver_log"})
   public ResponseEntity<ResultWrapper<String>> UpdateAndEnableDisableDriverLog(@Valid @RequestBody DriveringStatusCRUDDto driveringStatusCRUDDto, javax.servlet.http.HttpServletRequest request) throws UnsupportedEncodingException, JsonProcessingException {
      com.mes.eld_log.models.UserMaster user = imobilityUtils.getLoggedInUser(request);
      if (user != null && user.getUserTypeId() == 3) {
         ResultWrapper<String> result = new ResultWrapper<>();
         result.setStatus(com.mes.eld_log.results.Result.FAIL);
         result.setMessage("Unauthorized: Support Personnel cannot perform this action.");
         return new ResponseEntity(result, HttpStatus.FORBIDDEN);
      }
      ResultWrapper<String> result = null;
      result = this.dispatchService.UpdateAndEnableDisableDriverLog(driveringStatusCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/update_and_shift_driver_log"})
   public ResponseEntity<ResultWrapper<String>> UpdateAndShiftDriverLog(@Valid @RequestBody DriveringStatusLogViewDto driveringStatusLogViewDto, javax.servlet.http.HttpServletRequest request) throws UnsupportedEncodingException, JsonProcessingException {
      com.mes.eld_log.models.UserMaster user = imobilityUtils.getLoggedInUser(request);
      if (user != null && user.getUserTypeId() == 3) {
         ResultWrapper<String> result = new ResultWrapper<>();
         result.setStatus(com.mes.eld_log.results.Result.FAIL);
         result.setMessage("Unauthorized: Support Personnel cannot perform this action.");
         return new ResponseEntity(result, HttpStatus.FORBIDDEN);
      }
      ResultWrapper<String> result = null;
      result = this.dispatchService.UpdateAndShiftDriverLog(driveringStatusLogViewDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/update_and_shift_driver_log_in_bulk"})
   public ResponseEntity<ResultWrapper<String>> UpdateAndShiftDriverLogInBulk(@Valid @RequestBody AssignLogToDriverDto assignLogToDriverDto, javax.servlet.http.HttpServletRequest request) throws UnsupportedEncodingException, JsonProcessingException {
      com.mes.eld_log.models.UserMaster user = imobilityUtils.getLoggedInUser(request);
      if (user != null && user.getUserTypeId() == 3) {
         ResultWrapper<String> result = new ResultWrapper<>();
         result.setStatus(com.mes.eld_log.results.Result.FAIL);
         result.setMessage("Unauthorized: Support Personnel cannot perform this action.");
         return new ResponseEntity(result, HttpStatus.FORBIDDEN);
      }
      ResultWrapper<String> result = null;
      result = this.dispatchService.UpdateAndShiftDriverLogInBulk(assignLogToDriverDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_all_driver_status"})
   public ResponseEntity<ResultWrapper<List<EmployeeMasterViewDto>>> ViewAllDriverStatus(@Valid @RequestBody DriveringStatusCRUDDto driveringStatusCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<List<EmployeeMasterViewDto>> result = null;
      result = this.dispatchService.ViewAllDriverStatus(driveringStatusCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_driver_working_status"})
   public ResponseEntity<ResultWrapper<List<DriveringStatusViewDto>>> ViewDriverWorkingStatus(
      @Valid @RequestBody DriveringStatusCRUDDto driveringStatusCRUDDto
   ) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<List<DriveringStatusViewDto>> result = null;
      result = this.dispatchService.ViewDriverWorkingStatus(driveringStatusCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_live_data_log"})
   public ResponseEntity<ResultWrapper<List<LiveDataLogViewDto>>> ViewLiveDataLog(@Valid @RequestBody ClientMasterCRUDDto clientMasterCRUDDto, javax.servlet.http.HttpServletRequest request) throws UnsupportedEncodingException, JsonProcessingException {
      com.mes.eld_log.models.UserMaster user = imobilityUtils.getLoggedInUser(request);
      if (user != null && (user.getUserTypeId() == 2 || user.getUserTypeId() == 3)) {
         clientMasterCRUDDto.setClientId((int) user.getClientId());
      }
      ResultWrapper<List<LiveDataLogViewDto>> result = null;
      result = this.dispatchService.ViewLiveDataLog(clientMasterCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/update_state_in_eld_log_data"})
   public ResponseEntity<ResultWrapper<String>> UpdateStateInEldLogData(@Valid @RequestBody ClientMasterCRUDDto clientMasterCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<String> result = null;
      result = this.dispatchService.UpdateStateInEldLogData(clientMasterCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_eld_log_history"})
   public ResponseEntity<ResultWrapper<List<LiveDataLogViewDto>>> ViewELDLogHistory(@Valid @RequestBody ClientMasterCRUDDto clientMasterCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<List<LiveDataLogViewDto>> result = null;
      result = this.dispatchService.ViewELDLogHistory(clientMasterCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_idling_report"})
   public ResponseEntity<ResultWrapper<String>> ViewIdlingReport(@Valid @RequestBody DriveringStatusCRUDDto driveringStatusCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<String> result = null;
      result = this.dispatchService.ViewIdlingReport(driveringStatusCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_ifta_report_old"})
   public ResponseEntity<ResultWrapper<List<IftaReportViewDto>>> ViewIftaReport(@Valid @RequestBody DriveringStatusCRUDDto driveringStatusCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<List<IftaReportViewDto>> result = null;
      result = this.dispatchService.ViewIftaReport(driveringStatusCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_ifta_report"})
   public ResponseEntity<ResultWrapper<List<IftaReportViewDto>>> ViewIftaReportNew(@Valid @RequestBody DriveringStatusCRUDDto driveringStatusCRUDDto, javax.servlet.http.HttpServletRequest request) throws UnsupportedEncodingException, JsonProcessingException {
      com.mes.eld_log.models.UserMaster user = imobilityUtils.getLoggedInUser(request);
      if (user != null && (user.getUserTypeId() == 2 || user.getUserTypeId() == 3)) {
         driveringStatusCRUDDto.setClientId((long) user.getClientId());
      }
      ResultWrapper<List<IftaReportViewDto>> result = null;
      result = this.dispatchService.ViewIftaReportNew(driveringStatusCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_ifta_generated_summary_report"})
   public ResponseEntity<ResultWrapper<List<IftaReportViewDto>>> ViewIftaGeneratedSummaryReport(
      @Valid @RequestBody DriveringStatusCRUDDto driveringStatusCRUDDto
   ) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<List<IftaReportViewDto>> result = null;
      result = this.dispatchService.ViewIftaGeneratedSummaryReport(driveringStatusCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_ifta_summary_report"})
   public ResponseEntity<ResultWrapper<List<IftaSummaryReport>>> ViewIftaSummaryReport(@Valid @RequestBody DriveringStatusCRUDDto driveringStatusCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<List<IftaSummaryReport>> result = null;
      result = this.dispatchService.ViewIftaSummaryReport(driveringStatusCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/add_dvir_data"})
   public ResponseEntity<ResultWrapper<DVIRDataCRUDDto>> AddDVIRData(@RequestParam("file") List<MultipartFile> file, DVIRData dvirData) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<DVIRDataCRUDDto> result = null;
      String tokenValid = "";

      try {
         tokenValid = this.imobilityUtils.CheckTokenNo((int)dvirData.getDriverId(), dvirData.getTokenNo());
      } catch (Exception var6) {
         var6.printStackTrace();
      }

      result = this.dispatchService.AddDVIRData(file, dvirData, tokenValid);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/add_dvir_data_image"})
   public ResponseEntity<ResultWrapper<String>> AddDVIRDataImage(@RequestParam("file") List<MultipartFile> file) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<String> result = null;
      result = this.dispatchService.AddDVIRDataImage(file);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/add_dvir_data_offline"})
   public ResponseEntity<ResultWrapper<List<AddDriveringStatusResponseDto>>> AddDVIRDataOffline(@Valid @RequestBody AddDvirDataDto addDvirDataDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<List<AddDriveringStatusResponseDto>> result = null;
      String tokenValid = "false";
      result = this.dispatchService.AddDVIRDataOffline(addDvirDataDto, tokenValid);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/add_defect_data_offline"})
   public ResponseEntity<ResultWrapper<List<AddDriveringStatusResponseDto>>> AddDefectDataOffline(
      @RequestParam("file") List<MultipartFile> file, AddDvirDataDto addDvirDataDto
   ) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<List<AddDriveringStatusResponseDto>> result = null;
      String tokenValid = "false";
      result = this.dispatchService.AddDefectDataOffline(file, addDvirDataDto, tokenValid);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/add_defect_data"})
   public ResponseEntity<ResultWrapper<List<AddDriveringStatusResponseDto>>> AddDefectData(
      @RequestParam("file") MultipartFile file, DefectDetails defectDetails
   ) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<List<AddDriveringStatusResponseDto>> result = null;
      String tokenValid = "false";
      result = this.dispatchService.AddDefectData(file, defectDetails, tokenValid);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_alerts"})
   public ResponseEntity<ResultWrapper<List<AlertsLogViewDto>>> ViewAlerts(@Valid @RequestBody AlertsLogViewDto alertsLogViewDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<List<AlertsLogViewDto>> result = null;
      result = this.dispatchService.ViewAlerts(alertsLogViewDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/update_alerts"})
   public ResponseEntity<ResultWrapper<String>> UpdateAlerts(@Valid @RequestBody AlertsLogViewDto alertsLogViewDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<String> result = null;
      result = this.dispatchService.UpdateAlerts(alertsLogViewDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/update_all_unread_alerts"})
   public ResponseEntity<ResultWrapper<String>> UpdateAllUnreadAlerts(@Valid @RequestBody AlertsLogViewDto alertsLogViewDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<String> result = null;
      result = this.dispatchService.UpdateAllUnreadAlerts(alertsLogViewDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_dvir_data"})
   public ResponseEntity<ResultWrapper<List<DVIRDataCRUDDto>>> ViewDVIRData(@Valid @RequestBody DVIRDataCRUDDto dvirDataCRUDDto, javax.servlet.http.HttpServletRequest request) throws UnsupportedEncodingException, JsonProcessingException {
      com.mes.eld_log.models.UserMaster user = imobilityUtils.getLoggedInUser(request);
      if (user != null && (user.getUserTypeId() == 2 || user.getUserTypeId() == 3)) {
         dvirDataCRUDDto.setClientId((int)user.getClientId());
      }
      ResultWrapper<List<DVIRDataCRUDDto>> result = null;
      String tokenValid = "";

      try {
         tokenValid = this.imobilityUtils.CheckTokenNo((int)dvirDataCRUDDto.getDriverId(), dvirDataCRUDDto.getTokenNo());
      } catch (Exception var5) {
         var5.printStackTrace();
      }

      result = this.dispatchService.ViewDVIRData(dvirDataCRUDDto, tokenValid);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/download_dvir_report"})
   public ResponseEntity<ResultWrapper<String>> DownloadDVIRData(@Valid @RequestBody DVIRDataCRUDDto dvirDataCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<String> result = null;
      result = this.dispatchService.DownloadDVIRData(dvirDataCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/download_dvir_report_encript"})
   public ResponseEntity<ResultWrapper<String>> DownloadDVIRDataEncript(@Valid @RequestBody DVIRDataCRUDDto dvirDataCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<String> result = null;
      result = this.dispatchService.DownloadDVIRDataEncript(dvirDataCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/eld_report_encrypt"})
   public ResponseEntity<ResultWrapper<EldReportDto>> ELDReportEncrypt(@Valid @RequestBody DVIRDataCRUDDto dvirDataCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<EldReportDto> result = null;
      result = this.dispatchService.ELDReportEncrypt(dvirDataCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_dvir_data_by_timestamp"})
   public ResponseEntity<ResultWrapper<List<DVIRDataCRUDDto>>> ViewDVIRDataByTimestamp(@Valid @RequestBody DVIRDataCRUDDto dvirDataCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<List<DVIRDataCRUDDto>> result = null;
      result = this.dispatchService.ViewDVIRDataByTimestamp(dvirDataCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/delete_dvir"})
   public ResponseEntity<ResultWrapper<String>> DeleteDvir(@Valid @RequestBody DVIRDataCRUDDto dvirDataCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<String> result = null;
      result = this.dispatchService.DeleteDvir(dvirDataCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/update_dvir_data"})
   public ResponseEntity<ResultWrapper<String>> UpdateDVIRData(@RequestParam("file") List<MultipartFile> file, DVIRDataCRUDDto dvirDataCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<String> result = null;
      result = this.dispatchService.UpdateDVIRData(file, dvirDataCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/delete_all_driver_status_by_id"})
   public ResponseEntity<ResultWrapper<String>> DeleteAllDriverStatusById(@Valid @RequestBody DVIRDataCRUDDto dvirDataCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<String> result = null;
      result = this.dispatchService.DeleteAllDriverStatusById(dvirDataCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/delete_voilation_by_date"})
   public ResponseEntity<ResultWrapper<String>> DeleteVoilationByDate(@Valid @RequestBody DVIRDataCRUDDto dvirDataCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<String> result = null;
      result = this.dispatchService.DeleteVoilationByDate(dvirDataCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/delete_all_driver_status_by_id_and_date"})
   public ResponseEntity<ResultWrapper<String>> DeleteAllDriverStatusByIdAndDate(@Valid @RequestBody DVIRDataCRUDDto dvirDataCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<String> result = null;
      result = this.dispatchService.DeleteAllDriverStatusByIdAndDate(dvirDataCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/add_eld_ota"})
   public ResponseEntity<ResultWrapper<String>> AddELDOta(@RequestParam("file") List<MultipartFile> file, ELDOta eldOta) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<String> result = null;
      result = this.dispatchService.AddELDOta(file, eldOta);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_eld_ota"})
   public ResponseEntity<ResultWrapper<List<ELDOta>>> ViewELDOta() throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<List<ELDOta>> result = null;
      result = this.dispatchService.ViewELDOta();
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_last_eld_ota"})
   public ResponseEntity<String> ViewLastELDOta() throws UnsupportedEncodingException, JsonProcessingException {
      String result = null;
      result = this.dispatchService.ViewLastELDOta();
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/delete_eld_ota"})
   public ResponseEntity<ResultWrapper<String>> DeleteELDOta(@Valid @RequestBody ELDOtaCRUDDto eldOtaCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<String> result = null;
      result = this.dispatchService.DeleteELDOta(eldOtaCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/add_eld_ota_status"})
   public ResponseEntity<String> AddELDOtaStatus(@Valid @RequestBody ELDOtaStatus eldOtaStatus) throws UnsupportedEncodingException, JsonProcessingException {
      String result = null;
      result = this.dispatchService.AddELDOtaStatus(eldOtaStatus);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_eld_ota_status"})
   public ResponseEntity<ResultWrapper<List<ELDOtaStatus>>> ViewELDOtaStatus(@Valid @RequestBody ELDOtaCRUDDto eldOtaCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<List<ELDOtaStatus>> result = null;
      result = this.dispatchService.ViewELDOtaStatus(eldOtaCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_eld_ota_status_for_testing"})
   public ResponseEntity<String> ViewELDOtaStatusForTesting() throws UnsupportedEncodingException, JsonProcessingException {
      String result = null;
      result = this.dispatchService.ViewELDOtaStatusForTesting();
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/add_certified_log_image"})
   public ResponseEntity<ResultWrapper<String>> AddCertifiedLogImage(@RequestParam("file") List<MultipartFile> file) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<String> result = null;
      result = this.dispatchService.AddCertifiedLogImage(file);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/add_certified_log_offline"})
   public ResponseEntity<ResultWrapper<List<AddDriveringStatusResponseDto>>> AddCertifiedLogOffline(@Valid @RequestBody AddCertifiedLogDto addCertifiedLogDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<List<AddDriveringStatusResponseDto>> result = null;
      String tokenValid = "false";
      result = this.dispatchService.AddCertifiedLogOffline(addCertifiedLogDto, tokenValid);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/add_certified_log"})
   public ResponseEntity<ResultWrapper<String>> AddCertifiedLog(@RequestParam("file") List<MultipartFile> file, CertifiedLog certifiedLog) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<String> result = null;
      String tokenValid = "";

      try {
         tokenValid = this.imobilityUtils.CheckTokenNo((int)certifiedLog.getDriverId(), certifiedLog.getTokenNo());
      } catch (Exception var6) {
         var6.printStackTrace();
      }

      result = this.dispatchService.AddCertifiedLog(file, certifiedLog, tokenValid);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping(
      value = {"/add_certified_log_from_web"},
      consumes = {"multipart/form-data"}
   )
   public ResponseEntity<ResultWrapper<String>> AddCertifiedLogFromWeb(
      @RequestParam(value = "file",required = false) List<MultipartFile> file, @ModelAttribute CertifiedLog certifiedLog
   ) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<String> result = null;
      String tokenValid = "";

      try {
         tokenValid = this.imobilityUtils.CheckTokenNo((int)certifiedLog.getDriverId(), certifiedLog.getTokenNo());
      } catch (Exception var6) {
         var6.printStackTrace();
      }

      result = this.dispatchService.AddCertifiedLogFromWeb(file, certifiedLog, tokenValid);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_certified_log"})
   public ResponseEntity<ResultWrapper<List<CertifiedLogViewDto>>> ViewCertifiedLog(@Valid @RequestBody CertifiedLogCRUDDto certifiedLogCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<List<CertifiedLogViewDto>> result = null;
      result = this.dispatchService.ViewCertifiedLog(certifiedLogCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/update_certified_log"})
   public ResponseEntity<ResultWrapper<String>> UpdateCertifiedLog(@Valid @RequestBody CertifiedLog certifiedLog) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<String> result = null;
      String tokenValid = "";

      try {
         tokenValid = this.imobilityUtils.CheckTokenNo((int)certifiedLog.getDriverId(), certifiedLog.getTokenNo());
      } catch (Exception var5) {
         var5.printStackTrace();
      }

      result = this.dispatchService.UpdateCertifiedLog(certifiedLog, tokenValid);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/update_certified_log_with_co_driver"})
   public ResponseEntity<ResultWrapper<String>> UpdateCertifiedLogWithCoDriver(@Valid @RequestBody CertifiedLogCRUDDto certifiedLogCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<String> result = null;
      result = this.dispatchService.UpdateCertifiedLogWithCoDriver(certifiedLogCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/export_chart_graph"})
   public ResponseEntity<ResultWrapper<String>> ExportChartGraph(@Valid @RequestBody CertifiedLogCRUDDto certifiedLogCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<String> result = null;
      result = this.dispatchService.ExportChartGraph(certifiedLogCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/add_driver_working_status"})
   public ResponseEntity<ResultWrapper<String>> AddDriverWorkingStatus(@Valid @RequestBody DriverWorkingStatus driverWorkingStatus) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<String> result = null;
      String tokenValid = "";

      try {
         tokenValid = this.imobilityUtils.CheckTokenNo((int)driverWorkingStatus.getDriverId(), driverWorkingStatus.getTokenNo());
      } catch (Exception var5) {
         var5.printStackTrace();
      }

      result = this.dispatchService.AddDriverWorkingStatus(driverWorkingStatus, tokenValid);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/update_drivering_status_for_dot_report"})
   public ResponseEntity<ResultWrapper<String>> UpdateDriveringStatusForDotReport(@Valid @RequestBody CertifiedLogCRUDDto certifiedLogCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<String> result = null;
      result = this.dispatchService.UpdateDriveringStatusForDotReport(certifiedLogCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/add_eld_support"})
   public ResponseEntity<ResultWrapper<String>> AddELDSupport(@Valid @RequestBody ELDSupport eldSupport) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<String> result = null;
      String tokenValid = "";

      try {
         tokenValid = this.imobilityUtils.CheckTokenNo((int)eldSupport.getDriverId(), eldSupport.getTokenNo());
      } catch (Exception var5) {
         var5.printStackTrace();
      }

      result = this.dispatchService.AddELDSupport(eldSupport, tokenValid);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_eld_support"})
   public ResponseEntity<ResultWrapper<List<ELDSupportViewDto>>> ViewELDSupport(@Valid @RequestBody ELDSupportViewDto eldSupportViewDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<List<ELDSupportViewDto>> result = null;
      String tokenValid = "";

      try {
         tokenValid = this.imobilityUtils.CheckTokenNo((int)eldSupportViewDto.getDriverId(), eldSupportViewDto.getTokenNo());
      } catch (Exception var5) {
         var5.printStackTrace();
      }

      result = this.dispatchService.ViewELDSupport(eldSupportViewDto, tokenValid);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/update_sequence_no_manually"})
   public ResponseEntity<ResultWrapper<String>> UpdateSequenceNoManually(@Valid @RequestBody DriveringStatusCRUDDto driveringStatusCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<String> result = null;
      result = this.dispatchService.UpdateSequenceNoManually(driveringStatusCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_eld_support_by_date"})
   public ResponseEntity<ResultWrapper<List<ELDSupportViewDto>>> ViewELDSupportByDate(@Valid @RequestBody ELDSupportViewDto eldSupportViewDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<List<ELDSupportViewDto>> result = null;
      String tokenValid = "";

      try {
         tokenValid = this.imobilityUtils.CheckTokenNo((int)eldSupportViewDto.getDriverId(), eldSupportViewDto.getTokenNo());
      } catch (Exception var5) {
         var5.printStackTrace();
      }

      result = this.dispatchService.ViewELDSupportByDate(eldSupportViewDto, tokenValid);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_server_health"})
   public ResponseEntity<ResultWrapper<ServerHealth>> ViewServerHealth() throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<ServerHealth> result = null;
      result = this.dispatchService.ViewServerHealth();
      return new ResponseEntity(result, HttpStatus.OK);
   }
}
