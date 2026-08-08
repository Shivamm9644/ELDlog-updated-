package com.mes.eld_log.controller;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GraphController {
   @ResponseStatus(HttpStatus.BAD_REQUEST)
   @ExceptionHandler({MethodArgumentNotValidException.class})
   public Map<String, String> handleMethodArgumentNotValid(MethodArgumentNotValidException ex) {
      Map<String, String> errors = new HashMap<>();
      errors.put("status", "FAIL");
      ex.getBindingResult().getFieldErrors().forEach(error -> errors.put(error.getField(), error.getDefaultMessage()));
      return errors;
   }

   @GetMapping({"/barChart"})
   public String barChart(Model model) {
      Map<String, Integer> data = new LinkedHashMap<>();
      data.put("Ashish", 30);
      data.put("Ankit", 50);
      data.put("Gurpreet", 70);
      data.put("Mohit", 90);
      data.put("Manish", 25);
      model.addAttribute("keySet", data.keySet());
      model.addAttribute("values", data.values());
      System.out.println("Call Graph...");
      return "barChart";
   }

   @GetMapping({"/home"})
   public String home(Model model) {
      model.addAttribute("name", "John");
      return "home";
   }

   @PostMapping({"/view_device"})
   public String ViewDevice() {
      return "My Device";
   }
}
