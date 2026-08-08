package com.mes.eld_log.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mes.eld_log.dtos.EmployeeMasterCRUDDto;
import com.mes.eld_log.dtos.LoginUpdateDto;
import com.mes.eld_log.dtos.UserLoginDto;
import com.mes.eld_log.dtos.UserMasterViewDto;
import com.mes.eld_log.results.ResultWrapper;
import com.mes.eld_log.security.TokenUtil;
import com.mes.eld_log.service.UserInfoService;
import com.mes.eld_log.util.eldLogUtils;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(
   value = {"/auth"},
   method = {RequestMethod.POST}
)
public class AuthenticationController {
   @Autowired
   private AuthenticationManager authenticationManager;
   @Autowired
   private TokenUtil tokenUtil;
   @Autowired
   private eldLogUtils imobilityUtils;
   @Autowired
   private UserInfoService userInfoService;

   @PostMapping({"/login"})
   public ResponseEntity<ResultWrapper<EmployeeMasterCRUDDto>> Login(@Valid @RequestBody UserLoginDto userLoginDto) throws UnsupportedEncodingException, JsonProcessingException {
      String token = UUID.randomUUID().toString();
      ResultWrapper<EmployeeMasterCRUDDto> result = null;
      result = this.userInfoService.Login(userLoginDto, token);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/login_data_by_employee_id"})
   public ResponseEntity<ResultWrapper<EmployeeMasterCRUDDto>> LoginDataByEmployeeId(@Valid @RequestBody UserLoginDto userLoginDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<EmployeeMasterCRUDDto> result = null;
      result = this.userInfoService.LoginDataByEmployeeId(userLoginDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/update_login_with_login_log"})
   public ResponseEntity<ResultWrapper<String>> UpdateLoginWithLoginLog(@Valid @RequestBody LoginUpdateDto loginUpdateDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<String> result = null;
      result = this.userInfoService.UpdateLoginWithLoginLog(loginUpdateDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/login_by_date"})
   public ResponseEntity<ResultWrapper<EmployeeMasterCRUDDto>> LoginByDate(@Valid @RequestBody UserLoginDto userLoginDto) throws UnsupportedEncodingException, JsonProcessingException {
      String token = UUID.randomUUID().toString();
      ResultWrapper<EmployeeMasterCRUDDto> result = null;
      result = this.userInfoService.LoginByDate(userLoginDto, token);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/login_web"})
   public ResponseEntity<ResultWrapper<List<UserMasterViewDto>>> LoginWeb(@Valid @RequestBody UserLoginDto userLoginDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<List<UserMasterViewDto>> result = null;
      String token = UUID.randomUUID().toString();
      result = this.userInfoService.LoginWeb(userLoginDto, token);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/forgot_password"})
   public ResponseEntity<ResultWrapper<UserLoginDto>> ForgotPassword(@Valid @RequestBody UserLoginDto userLoginDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<UserLoginDto> result = null;
      result = this.userInfoService.ForgotPassword(userLoginDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/forgot_username"})
   public ResponseEntity<ResultWrapper<UserLoginDto>> ForgotUsername(@Valid @RequestBody UserLoginDto userLoginDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<UserLoginDto> result = null;
      result = this.userInfoService.ForgotUsername(userLoginDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/logout_api"})
   public ResponseEntity<ResultWrapper<UserLoginDto>> LogoutApi(@Valid @RequestBody UserLoginDto userLoginDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<UserLoginDto> result = null;
      String tokenValid = "";

      try {
         tokenValid = this.imobilityUtils.CheckTokenNo(userLoginDto.getEmployeeId(), userLoginDto.getTokenNo());
      } catch (Exception var5) {
         var5.printStackTrace();
      }

      result = this.userInfoService.LogoutApi(userLoginDto, tokenValid);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/logout_web_api"})
   public ResponseEntity<ResultWrapper<String>> LogoutWebApi(@Valid @RequestBody UserLoginDto userLoginDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<String> result = null;
      result = this.userInfoService.LogoutWebApi(userLoginDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/validate_token_no"})
   public ResponseEntity<ResultWrapper<String>> ValidateTokenNo(@Valid @RequestBody UserLoginDto userLoginDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<String> result = null;
      String tokenValid = "";

      try {
         tokenValid = this.imobilityUtils.CheckTokenNo(userLoginDto.getEmployeeId(), userLoginDto.getTokenNo());
      } catch (Exception var5) {
         var5.printStackTrace();
      }

      result = this.userInfoService.ValidateTokenNo(tokenValid);
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
