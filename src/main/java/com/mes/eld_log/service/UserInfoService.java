package com.mes.eld_log.service;

import com.mes.eld_log.dtos.EmployeeMasterCRUDDto;
import com.mes.eld_log.dtos.LoginUpdateDto;
import com.mes.eld_log.dtos.UserLoginDto;
import com.mes.eld_log.dtos.UserMasterViewDto;
import com.mes.eld_log.results.ResultWrapper;
import java.util.List;

public interface UserInfoService {
   ResultWrapper<EmployeeMasterCRUDDto> Login(UserLoginDto userLoginDto);

   ResultWrapper<EmployeeMasterCRUDDto> LoginDataByEmployeeId(UserLoginDto userLoginDto);

   ResultWrapper<String> UpdateLoginWithLoginLog(LoginUpdateDto loginUpdateDto);

   ResultWrapper<EmployeeMasterCRUDDto> LoginByDate(UserLoginDto userLoginDto);

   ResultWrapper<List<UserMasterViewDto>> LoginWeb(UserLoginDto userLoginDto);

   ResultWrapper<UserLoginDto> ForgotPassword(UserLoginDto userLoginDto);

   ResultWrapper<UserLoginDto> ForgotUsername(UserLoginDto userLoginDto);

   ResultWrapper<UserLoginDto> LogoutApi(UserLoginDto userLoginDto, String tokenValid);

   ResultWrapper<String> LogoutWebApi(UserLoginDto userLoginDto);

   ResultWrapper<String> ValidateTokenNo(String tokenValid);
}
