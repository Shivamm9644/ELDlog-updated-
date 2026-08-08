package com.mes.eld_log;

import java.util.TimeZone;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class eldLogApplication implements WebMvcConfigurer {
   public static void main(String[] args) {
      TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
      SpringApplication.run(eldLogApplication.class, args);
   }

   @Bean
   public ModelMapper modelMapper() {
      return new ModelMapper();
   }

   @Bean
   public WebMvcConfigurer corsConfigurer() {
      return new WebMvcConfigurerAdapter() {
         public void addCorsMappings(CorsRegistry registry) {
            registry.addMapping("/**").allowedOrigins(new String[]{"*"});
         }
      };
   }
}
