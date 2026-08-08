package com.mes.eld_log.security;

import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.SignatureException;
import java.io.IOException;
import java.util.Enumeration;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.filter.OncePerRequestFilter;

public class AuthenticationFilter extends OncePerRequestFilter {
   @Autowired
   private UserDetailsService userDetailsService;
   @Autowired
   private TokenUtil jwtTokenUtil;

   protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
      Enumeration<String> s = request.getHeaderNames();

      while(s.hasMoreElements()) {
         String s1 = s.nextElement();
         System.out.println("Elements: " + s1 + "header");
      }

      String header = request.getHeader("Authorization");
      System.out.println("GetName: " + Thread.currentThread().getName());
      String username = null;
      String authToken = null;
      if (header != null && header.startsWith("Bearer ")) {
         authToken = header.replace("Bearer ", "");

         try {
            System.out.println("authToken: " + authToken);
            username = this.jwtTokenUtil.getUsernameFromToken(authToken);
         } catch (IllegalArgumentException var10) {
            this.logger.error("an error occured during getting username from token", var10);
         } catch (ExpiredJwtException var11) {
            this.logger.warn("the token is expired and not valid anymore", var11);
         } catch (SignatureException var12) {
            this.logger.error("Authentication Failed. Username or Password not valid.");
         }
      } else {
         this.logger.warn("couldn't find bearer string, will ignore the header");
      }

      if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
         UserDetails userDetails = this.userDetailsService.loadUserByUsername(username);
         if (this.jwtTokenUtil.validateToken(authToken, userDetails)) {
            UsernamePasswordAuthenticationToken authentication = this.jwtTokenUtil
               .getAuthentication(authToken, SecurityContextHolder.getContext().getAuthentication(), userDetails);
            this.logger.info("authenticated user " + username + ", setting security context");
            SecurityContextHolder.getContext().setAuthentication(authentication);
         }
      }

      filterChain.doFilter(request, response);
   }
}
