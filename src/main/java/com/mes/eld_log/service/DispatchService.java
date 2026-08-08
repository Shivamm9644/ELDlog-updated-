package com.mes.eld_log.service;

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
import java.util.List;
import org.springframework.web.multipart.MultipartFile;

public interface DispatchService {
   ResultWrapper<String> AddDispatchDetails(DispatchDetailCRUDDto dispatchDetailCRUDDto);

   ResultWrapper<List<DispatchDetailViewDto>> ViewDispatchDetails(DispatchDetailCRUDDto dispatchDetailCRUDDto);

   ResultWrapper<AllDispatchDataViewDto> ViewDispatchData(DispatchDetailCRUDDto dispatchDetailCRUDDto);

   ResultWrapper<String> AddExceptionLog(ExceptionLog exceptionLog, String tokenValid);

   ResultWrapper<List<EldLogDataViewDto>> ViewEldLogData();

   ResultWrapper<DriveringStatusViewDto> AddDriveringStatus(DriveringStatus driveringStatus, String tokenValid);

   ResultWrapper<String> AddDriveringStatusFromWeb(DriveringStatus driveringStatus);

   ResultWrapper<List<AddDriveringStatusResponseDto>> AddDriveringStatusOffline(AddDriveringStatusDto addDriveringStatusDto, String tokenValid);

   ResultWrapper<List<DriveringStatusViewDto>> ViewDriveringStatus(DriveringStatusCRUDDto driveringStatusCRUDDto, String tokenValid);

   ResultWrapper<String> ShiftDriveringStatusWithoutUpdate(DriveringStatusCRUDDto driveringStatusCRUDDto);

   ResultWrapper<List<DriveringStatusViewDto>> ViewDriveringStatusForLog(DriveringStatusCRUDDto driveringStatusCRUDDto);

   ResultWrapper<EmployeeMasterCRUDDto> ViewDriveringStatusWithLoginDetails(DriveringStatusCRUDDto driveringStatusCRUDDto, String tokenValid);

   ResultWrapper<List<DriveringStatusLogViewDto>> ViewDriveringStatusLog(DriveringStatusCRUDDto driveringStatusCRUDDto);

   ResultWrapper<String> AssignLogToDriver(AssignLogToDriverDto assignLogToDriverDto);

   ResultWrapper<String> ShiftHourInDriveringStatusLog(AssignLogToDriverDto assignLogToDriverDto);

   ResultWrapper<List<DriveringStatusViewDto>> ViewDriveringStatusForGraph(DriveringStatusCRUDDto driveringStatusCRUDDto);

   ResultWrapper<List<DriveringStatusViewDto>> ViewVoilationReport(DriveringStatusCRUDDto driveringStatusCRUDDto);

   ResultWrapper<List<DriveringStatusViewDto>> ViewDriveringStatusForGraphNew(DriveringStatusCRUDDto driveringStatusCRUDDto);

   ResultWrapper<List<DriveringStatusViewDto>> ViewDriveringStatusCalculation(DriveringStatusCRUDDto driveringStatusCRUDDto);

   ResultWrapper<List<DriveringStatusViewDto>> ViewUnidentifiedEvents(DriveringStatusCRUDDto driveringStatusCRUDDto);

   ResultWrapper<List<DriveringStatusViewDto>> ViewDriveringStatusByDate(DriveringStatusCRUDDto driveringStatusCRUDDto, String tokenValid);

   ResultWrapper<ViewDriverLogWithDetailDto> ViewDriverLogWithDetails(DriveringStatusCRUDDto driveringStatusCRUDDto);

   ResultWrapper<List<ViewDriverWorkingDayStatus>> ViewDriverWorkingDay(DriveringStatusCRUDDto driveringStatusCRUDDto);

   ResultWrapper<DriverLogWithLoginLogViewDto> ViewDriverLogWithLoginLog(DriveringStatusCRUDDto driveringStatusCRUDDto, String tokenValid);

   ResultWrapper<List<LoginLogViewDto>> LoginLogForWeb(DriveringStatusCRUDDto driveringStatusCRUDDto);

   ResultWrapper<String> UpdateDriverLog(DriveringStatusCRUDDto driveringStatusCRUDDto);

   ResultWrapper<String> UpdateAndEnableDisableDriverLog(DriveringStatusCRUDDto driveringStatusCRUDDto);

   ResultWrapper<String> UpdateAndShiftDriverLog(DriveringStatusLogViewDto driveringStatusLogViewDto);

   ResultWrapper<String> UpdateAndShiftDriverLogInBulk(AssignLogToDriverDto assignLogToDriverDto);

   ResultWrapper<List<EmployeeMasterViewDto>> ViewAllDriverStatus(DriveringStatusCRUDDto driveringStatusCRUDDto);

   ResultWrapper<List<DriveringStatusViewDto>> ViewDriverWorkingStatus(DriveringStatusCRUDDto driveringStatusCRUDDto);

   ResultWrapper<List<LiveDataLogViewDto>> ViewLiveDataLog(ClientMasterCRUDDto clientMasterCRUDDto);

   ResultWrapper<List<LiveDataLogViewDto>> ViewELDLogHistory(ClientMasterCRUDDto clientMasterCRUDDto);

   ResultWrapper<String> UpdateStateInEldLogData(ClientMasterCRUDDto clientMasterCRUDDto);

   ResultWrapper<String> ViewIdlingReport(DriveringStatusCRUDDto driveringStatusCRUDDto);

   ResultWrapper<List<IftaReportViewDto>> ViewIftaReport(DriveringStatusCRUDDto driveringStatusCRUDDto);

   ResultWrapper<List<IftaReportViewDto>> ViewIftaReportNew(DriveringStatusCRUDDto driveringStatusCRUDDto);

   ResultWrapper<List<IftaReportViewDto>> ViewIftaGeneratedSummaryReport(DriveringStatusCRUDDto driveringStatusCRUDDto);

   ResultWrapper<List<IftaSummaryReport>> ViewIftaSummaryReport(DriveringStatusCRUDDto driveringStatusCRUDDto);

   ResultWrapper<DVIRDataCRUDDto> AddDVIRData(List<MultipartFile> file, DVIRData dvirData, String tokenValid);

   ResultWrapper<String> AddDVIRDataImage(List<MultipartFile> file);

   ResultWrapper<List<AddDriveringStatusResponseDto>> AddDVIRDataOffline(AddDvirDataDto addDvirDataDto, String tokenValid);

   ResultWrapper<List<AddDriveringStatusResponseDto>> AddDefectDataOffline(List<MultipartFile> file, AddDvirDataDto addDvirDataDto, String tokenValid);

   ResultWrapper<List<AddDriveringStatusResponseDto>> AddDefectData(MultipartFile file, DefectDetails defectDetails, String tokenValid);

   ResultWrapper<List<AlertsLogViewDto>> ViewAlerts(AlertsLogViewDto alertsLogViewDto);

   ResultWrapper<String> UpdateAlerts(AlertsLogViewDto alertsLogViewDto);

   ResultWrapper<String> UpdateAllUnreadAlerts(AlertsLogViewDto alertsLogViewDto);

   ResultWrapper<List<DVIRDataCRUDDto>> ViewDVIRData(DVIRDataCRUDDto dvirDataCRUDDto, String tokenValid);

   ResultWrapper<String> DownloadDVIRData(DVIRDataCRUDDto dvirDataCRUDDto);

   ResultWrapper<String> DownloadDVIRDataEncript(DVIRDataCRUDDto dvirDataCRUDDto);

   ResultWrapper<EldReportDto> ELDReportEncrypt(DVIRDataCRUDDto dvirDataCRUDDto);

   ResultWrapper<List<DVIRDataCRUDDto>> ViewDVIRDataByTimestamp(DVIRDataCRUDDto dvirDataCRUDDto);

   ResultWrapper<String> DeleteDvir(DVIRDataCRUDDto dvirDataCRUDDto);

   ResultWrapper<String> DeleteAllDriverStatusById(DVIRDataCRUDDto dvirDataCRUDDto);

   ResultWrapper<String> DeleteVoilationByDate(DVIRDataCRUDDto dvirDataCRUDDto);

   ResultWrapper<String> DeleteAllDriverStatusByIdAndDate(DVIRDataCRUDDto dvirDataCRUDDto);

   ResultWrapper<String> UpdateDVIRData(List<MultipartFile> file, DVIRDataCRUDDto dvirDataCRUDDto);

   ResultWrapper<String> AddELDOta(List<MultipartFile> file, ELDOta eldOta);

   ResultWrapper<List<ELDOta>> ViewELDOta();

   String ViewLastELDOta();

   ResultWrapper<String> DeleteELDOta(ELDOtaCRUDDto eldOtaCRUDDto);

   String AddELDOtaStatus(ELDOtaStatus eldOtaStatus);

   ResultWrapper<List<ELDOtaStatus>> ViewELDOtaStatus(ELDOtaCRUDDto eldOtaCRUDDto);

   String ViewELDOtaStatusForTesting();

   ResultWrapper<String> AddCertifiedLogImage(List<MultipartFile> file);

   ResultWrapper<List<AddDriveringStatusResponseDto>> AddCertifiedLogOffline(AddCertifiedLogDto addCertifiedLogDto, String tokenValid);

   ResultWrapper<String> AddCertifiedLog(List<MultipartFile> file, CertifiedLog certifiedLog, String tokenValid);

   ResultWrapper<String> AddCertifiedLogFromWeb(List<MultipartFile> file, CertifiedLog certifiedLog, String tokenValid);

   ResultWrapper<List<CertifiedLogViewDto>> ViewCertifiedLog(CertifiedLogCRUDDto certifiedLogCRUDDto);

   ResultWrapper<String> UpdateCertifiedLog(CertifiedLog certifiedLog, String tokenValid);

   ResultWrapper<String> UpdateCertifiedLogWithCoDriver(CertifiedLogCRUDDto certifiedLogCRUDDto);

   ResultWrapper<String> ExportChartGraph(CertifiedLogCRUDDto certifiedLogCRUDDto);

   ResultWrapper<String> AddDriverWorkingStatus(DriverWorkingStatus driverWorkingStatus, String tokenValid);

   ResultWrapper<String> UpdateDriveringStatusForDotReport(CertifiedLogCRUDDto certifiedLogCRUDDto);

   ResultWrapper<String> AddELDSupport(ELDSupport eldSupport, String tokenValid);

   ResultWrapper<List<ELDSupportViewDto>> ViewELDSupport(ELDSupportViewDto eldSupportViewDto, String tokenValid);

   ResultWrapper<List<ELDSupportViewDto>> ViewELDSupportByDate(ELDSupportViewDto eldSupportViewDto, String tokenValid);

   ResultWrapper<ServerHealth> ViewServerHealth();

   ResultWrapper<String> UpdateSequenceNoManually(DriveringStatusCRUDDto driveringStatusCRUDDto);
}
