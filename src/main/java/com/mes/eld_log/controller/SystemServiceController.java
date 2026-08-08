package com.mes.eld_log.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mes.eld_log.results.ResultWrapper;
import com.mes.eld_log.security.TokenUtil;
import com.mes.eld_log.service.SystemService;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping(
   value = {"/service"},
   method = {RequestMethod.POST}
)
public class SystemServiceController {
   @Autowired
   private TokenUtil tokenUtil;
   @Autowired
   private SystemService systemService;

   @PostMapping({"/driver_log_service"})
   public ResponseEntity<ResultWrapper<String>> DriverLogService() throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<String> result = null;
      result = this.systemService.DriverLogService();
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/ifta_report_service"})
   public ResponseEntity<ResultWrapper<String>> IftaReportService() throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<String> result = null;
      result = this.systemService.IftaReportService();
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/report_generated_service"})
   public ResponseEntity<ResultWrapper<String>> ReportGeneratedService() throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<String> result = null;
      result = this.systemService.ReportGeneratedService();
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/get_server_health"})
   public ResponseEntity<ResultWrapper<String>> GetServerHealth() throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<String> result = null;
      result = this.systemService.GetServerHealth();
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/import_and_read_json_file"})
   public ResponseEntity<ResultWrapper<String>> ImportAndReadJsonFile(@RequestParam("file") List<MultipartFile> file) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<String> result = null;
      result = this.systemService.ImportAndReadJsonFile(file);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @ResponseStatus(HttpStatus.BAD_REQUEST)
   @ExceptionHandler({MethodArgumentNotValidException.class})
   public Map<String, String> handleMethodArgumentNotValid(MethodArgumentNotValidException ex) {
      Map<String, String> errors = new HashMap<>();
      ex.getBindingResult().getFieldErrors().forEach(error -> errors.put(error.getField(), error.getDefaultMessage()));
      return errors;
   }
}
