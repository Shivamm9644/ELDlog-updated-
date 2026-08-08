package com.mes.eld_log.util;

import com.mes.eld_log.models.Login;
import com.mes.eld_log.repo.LoginRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class eldLogUtils {
   private static final String RSA_ALGORITHM = "RSA";
   @Autowired
   private ModelMapper modelMapper;
   @Autowired
   LoginRepo loginRepo;

   public String CheckTokenNo(Integer employeeId, String tokenNo) {
      String responseToken = "";
      Login login = this.loginRepo.ValidateLoginToken(employeeId, tokenNo);
      if (login.getTokenNo().equals(tokenNo)) {
         responseToken = "true";
      } else {
         responseToken = "false";
      }

      return responseToken;
   }
}
