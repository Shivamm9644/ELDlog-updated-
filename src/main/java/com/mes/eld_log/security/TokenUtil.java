package com.mes.eld_log.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.JwtParser;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

@Component
public class TokenUtil implements Serializable {
   private static final long serialVersionUID = -7540491581209372458L;

   public String getUsernameFromToken(String token) {
      return this.getClaimFromToken(token, Claims::getSubject);
   }

   private <T> T getClaimFromToken(String token, Function<Claims, T> claimsResolver) {
      Claims claims = this.getAllClaimsFromToken(token);
      return claimsResolver.apply(claims);
   }

   private Claims getAllClaimsFromToken(String token) {
      return (Claims)Jwts.parser().setSigningKey("devglan123r").parseClaimsJws(token).getBody();
   }

   public String generateToken(Authentication authentication) {
      String authorities = authentication.getAuthorities().stream().<CharSequence>map(GrantedAuthority::getAuthority).collect(Collectors.joining(","));
      System.out
         .println(
            ">>TokenUtil: "
               + Jwts.builder().setSubject(authentication.getName()).claim("scopes", authorities).signWith(SignatureAlgorithm.HS512, "devglan123r")
         );
      return Jwts.builder()
         .setSubject(authentication.getName())
         .claim("scopes", authorities)
         .signWith(SignatureAlgorithm.HS512, "devglan123r")
         .setIssuedAt(new Date(System.currentTimeMillis()))
         .setExpiration(new Date(System.currentTimeMillis() + 18000000L))
         .compact();
   }

   public boolean validateToken(String token, UserDetails userDetails) {
      String username = this.getUsernameFromToken(token);
      return username.equals(userDetails.getUsername()) && !this.isTokenExpired(token);
   }

   private boolean isTokenExpired(String token) {
      Date expiration = this.getExpirationDateFromToken(token);
      return expiration.before(new Date());
   }

   private Date getExpirationDateFromToken(String token) {
      return this.getClaimFromToken(token, Claims::getExpiration);
   }

   public UsernamePasswordAuthenticationToken getAuthentication(final String token, final Authentication authentication, final UserDetails userDetails) {
      JwtParser jwtParser = Jwts.parser().setSigningKey("devglan123r");
      Jws<Claims> claimsJws = jwtParser.parseClaimsJws(token);
      Claims claims = (Claims)claimsJws.getBody();
      Collection<? extends GrantedAuthority> authorities = Arrays.stream(claims.get("scopes").toString().split(","))
         .map(SimpleGrantedAuthority::new)
         .collect(Collectors.toList());
      return new UsernamePasswordAuthenticationToken(userDetails, "", authorities);
   }
}
