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

   @Autowired
   private com.mes.eld_log.repo.UserMasterRepo userMasterRepo;
   
   @Autowired
   private com.mes.eld_log.security.TokenUtil tokenUtil;

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

   public com.mes.eld_log.models.UserMaster getLoggedInUser(javax.servlet.http.HttpServletRequest request) {
       String header = request.getHeader("Authorization");
       if (header != null && header.startsWith("Bearer ")) {
           String token = header.substring(7);
           try {
               String email = tokenUtil.getUsernameFromToken(token);
               if (email != null) {
                   return userMasterRepo.findByEmail(email);
               }
           } catch(Exception e) {
               // Token invalid or expired
               return null;
           }
       }
       return null;
   }
}
