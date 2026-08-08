package com.mes.eld_log.service;

import com.mes.eld_log.results.ResultWrapper;
import java.util.List;
import org.springframework.web.multipart.MultipartFile;

public interface SystemService {
   ResultWrapper<String> DriverLogService();

   ResultWrapper<String> IftaReportService();

   ResultWrapper<String> ReportGeneratedService();

   ResultWrapper<String> GetServerHealth();

   ResultWrapper<String> ImportAndReadJsonFile(List<MultipartFile> file);
}
