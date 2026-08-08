package com.mes.eld_log.security;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;
import org.springframework.stereotype.Component;

@Component
public class AuthenticationEntryPoint extends BasicAuthenticationEntryPoint {
   public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authEx) throws IOException {
      response.addHeader("WWW-Authenticate", "Basic realm=" + this.getRealmName());
      response.setStatus(401);
      PrintWriter writer = response.getWriter();
      writer.println("HTTP Status 401- " + authEx.getMessage());
   }

   public void afterPropertiesSet() {
      this.setRealmName("root");
      super.afterPropertiesSet();
   }
}
