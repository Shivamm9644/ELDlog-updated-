package com.mes.eld_log.security;

import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.SignatureException;
import java.io.IOException;
import java.util.Enumeration;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
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
   @Autowired
   private MongoTemplate mongoTemplate;

   protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
      String username = null;
      String authToken = null;

      // 1. Check Authorization header
      String header = request.getHeader("Authorization");
      if (header != null && !header.trim().isEmpty()) {
         if (header.startsWith("Bearer ")) {
            authToken = header.substring(7).trim();
         } else {
            authToken = header.trim();
         }
      }

      // 2. Check Cookie (e.g. accessToken, tokenNo, token)
      if (authToken == null || authToken.isEmpty()) {
         Cookie[] cookies = request.getCookies();
         if (cookies != null) {
            for (Cookie cookie : cookies) {
               if ("accessToken".equalsIgnoreCase(cookie.getName()) || "tokenNo".equalsIgnoreCase(cookie.getName()) || "token".equalsIgnoreCase(cookie.getName()) || "jwt".equalsIgnoreCase(cookie.getName())) {
                  if (cookie.getValue() != null && !cookie.getValue().trim().isEmpty()) {
                     authToken = cookie.getValue().trim();
                     break;
                  }
               }
            }
         }
      }

      // 3. Check request headers
      if (authToken == null || authToken.isEmpty()) {
         String hToken = request.getHeader("tokenNo");
         if (hToken == null || hToken.isEmpty()) {
            hToken = request.getHeader("accessToken");
         }
         if (hToken == null || hToken.isEmpty()) {
            hToken = request.getHeader("token");
         }
         if (hToken != null && !hToken.trim().isEmpty()) {
            authToken = hToken.trim();
         }
      }

      // 4. Check request query/form parameter
      if (authToken == null || authToken.isEmpty()) {
         String pToken = request.getParameter("tokenNo");
         if (pToken == null || pToken.isEmpty()) {
            pToken = request.getParameter("accessToken");
         }
         if (pToken == null || pToken.isEmpty()) {
            pToken = request.getParameter("token");
         }
         if (pToken != null && !pToken.trim().isEmpty()) {
            authToken = pToken.trim();
         }
      }

      // Strip quotes if present
      if (authToken != null && !authToken.isEmpty()) {
         if ((authToken.startsWith("\"") && authToken.endsWith("\"")) || (authToken.startsWith("'") && authToken.endsWith("'"))) {
            if (authToken.length() > 1) {
               authToken = authToken.substring(1, authToken.length() - 1).trim();
            }
         }
      }

      // Resolve token to username
      if (authToken != null && !authToken.isEmpty()) {
         boolean isJwt = authToken.contains(".") && authToken.split("\\.").length == 3;
         if (isJwt) {
            try {
               username = this.jwtTokenUtil.getUsernameFromToken(authToken);
            } catch (IllegalArgumentException var10) {
               this.logger.error("An error occurred during getting username from token", var10);
            } catch (ExpiredJwtException var11) {
               this.logger.warn("The token is expired and not valid anymore", var11);
            } catch (SignatureException var12) {
               this.logger.error("Authentication Failed. Username or Password not valid.", var12);
            } catch (Exception var13) {
               this.logger.error("Invalid or malformed JWT token", var13);
            }
         } else {
            // Legacy / stored token string lookup in MongoDB
            try {
               Query umQuery = new Query(Criteria.where("tokenNo").is(authToken));
               com.mes.eld_log.models.UserMaster um = this.mongoTemplate.findOne(umQuery, com.mes.eld_log.models.UserMaster.class, "user_master");
               if (um != null) {
                  username = (um.getEmail() != null && !um.getEmail().isEmpty()) ? um.getEmail() : um.getUsername();
               } else {
                  Query loginQuery = new Query(Criteria.where("tokenNo").is(authToken));
                  com.mes.eld_log.models.Login loginRec = this.mongoTemplate.findOne(loginQuery, com.mes.eld_log.models.Login.class, "login");
                  if (loginRec != null) {
                     username = (loginRec.getEmail() != null && !loginRec.getEmail().isEmpty()) ? loginRec.getEmail() : loginRec.getUsername();
                  }
               }
            } catch (Exception e) {
               this.logger.error("Error looking up tokenNo in MongoDB", e);
            }
         }
      } else {
         this.logger.warn("Couldn't find token in request, will ignore header");
      }

      if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
         try {
            UserDetails userDetails = this.userDetailsService.loadUserByUsername(username);
            if (userDetails != null) {
               boolean isJwt = authToken != null && authToken.contains(".") && authToken.split("\\.").length == 3;
               boolean isValid = true;
               if (isJwt) {
                  isValid = this.jwtTokenUtil.validateToken(authToken, userDetails);
               }
               if (isValid) {
                  UsernamePasswordAuthenticationToken authentication;
                  if (isJwt) {
                     authentication = this.jwtTokenUtil.getAuthentication(authToken, SecurityContextHolder.getContext().getAuthentication(), userDetails);
                  } else {
                     authentication = new UsernamePasswordAuthenticationToken(userDetails, "", userDetails.getAuthorities());
                  }
                  this.logger.info("authenticated user " + username + ", setting security context");
                  SecurityContextHolder.getContext().setAuthentication(authentication);
               }
            }
         } catch (Exception var14) {
            this.logger.error("Could not set user authentication in security context", var14);
         }
      }

      filterChain.doFilter(request, response);
   }
}
