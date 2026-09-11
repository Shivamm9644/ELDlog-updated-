package com.mes.eld_log.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mes.eld_log.dtos.CargoTypeMasterCRUDDto;
import com.mes.eld_log.dtos.CarrierMasterCRUDDto;
import com.mes.eld_log.dtos.ClientMasterCRUDDto;
import com.mes.eld_log.dtos.ClientMasterViewDto;
import com.mes.eld_log.dtos.CompanyMasterCRUDDto;
import com.mes.eld_log.dtos.CountryStateCityMasterCRUDDto;
import com.mes.eld_log.dtos.CustomerMasterCRUDDto;
import com.mes.eld_log.dtos.CycleCanadaCRUDDto;
import com.mes.eld_log.dtos.CycleUsaCRUDDto;
import com.mes.eld_log.dtos.DefectMasterCRUDDto;
import com.mes.eld_log.dtos.DeviceMasterCRUDDto;
import com.mes.eld_log.dtos.DeviceMasterViewDto;
import com.mes.eld_log.dtos.DeviceModalMasterCRUDDto;
import com.mes.eld_log.dtos.DriverInfoViewDto;
import com.mes.eld_log.dtos.EldConnectionInterfaceCRUDDto;
import com.mes.eld_log.dtos.EmployeeMasterCRUDDto;
import com.mes.eld_log.dtos.EmployeeMasterListViewDto;
import com.mes.eld_log.dtos.EmployeeMasterViewDto;
import com.mes.eld_log.dtos.ExceptionMasterCRUDDto;
import com.mes.eld_log.dtos.FuelTypeMasterCRUDDto;
import com.mes.eld_log.dtos.GeofanceMasterCRUDDto;
import com.mes.eld_log.dtos.LanguageMasterCRUDDto;
import com.mes.eld_log.dtos.MainTerminalMasterCRUDDto;
import com.mes.eld_log.dtos.PaymentStatusMasterCRUDDto;
import com.mes.eld_log.dtos.ProductMasterCRUDDto;
import com.mes.eld_log.dtos.ProjectDetailAnalyticsViewDto;
import com.mes.eld_log.dtos.ReceiverMasterCRUDDto;
import com.mes.eld_log.dtos.ReferModeCRUDDto;
import com.mes.eld_log.dtos.RestBreakMasterCRUDDto;
import com.mes.eld_log.dtos.RestartMasterCRUDDto;
import com.mes.eld_log.dtos.RouteMasterCRUDDto;
import com.mes.eld_log.dtos.ShipperMasterCRUDDto;
import com.mes.eld_log.dtos.SimulatorCRUDDto;
import com.mes.eld_log.dtos.TimezoneMasterCRUDDto;
import com.mes.eld_log.dtos.TrailerMasterCRUDDto;
import com.mes.eld_log.dtos.UserMasterCRUDDto;
import com.mes.eld_log.dtos.UserMasterViewDto;
import com.mes.eld_log.dtos.UserTypeMasterCRUDDto;
import com.mes.eld_log.dtos.VehicleConditionCRUDDto;
import com.mes.eld_log.dtos.VehicleMasterCRUDDto;
import com.mes.eld_log.dtos.VehicleMasterViewDto;
import com.mes.eld_log.dtos.VehicleTypeMasterCRUDDto;
import com.mes.eld_log.models.CargoTypeMaster;
import com.mes.eld_log.models.CarrierMaster;
import com.mes.eld_log.models.CityMaster;
import com.mes.eld_log.models.ClientMaster;
import com.mes.eld_log.models.CompanyMaster;
import com.mes.eld_log.models.CountryMaster;
import com.mes.eld_log.models.CustomerMaster;
import com.mes.eld_log.models.CycleCanada;
import com.mes.eld_log.models.CycleUsa;
import com.mes.eld_log.models.DefectMaster;
import com.mes.eld_log.models.DeviceMaster;
import com.mes.eld_log.models.DeviceModalMaster;
import com.mes.eld_log.models.DeviceStatus;
import com.mes.eld_log.models.Disclaimer;
import com.mes.eld_log.models.ELDSettings;
import com.mes.eld_log.models.EldConnectionInterface;
import com.mes.eld_log.models.EmployeeMaster;
import com.mes.eld_log.models.ExceptionMaster;
import com.mes.eld_log.models.FuelTypeMaster;
import com.mes.eld_log.models.GeofanceMaster;
import com.mes.eld_log.models.LanguageMaster;
import com.mes.eld_log.models.MACAddressMaster;
import com.mes.eld_log.models.MainTerminalMaster;
import com.mes.eld_log.models.PaymentStatusMaster;
import com.mes.eld_log.models.ProductMaster;
import com.mes.eld_log.models.ReceiverMaster;
import com.mes.eld_log.models.ReferModeMaster;
import com.mes.eld_log.models.RestBreakMaster;
import com.mes.eld_log.models.RestartMaster;
import com.mes.eld_log.models.RouteMaster;
import com.mes.eld_log.models.ShipperMaster;
import com.mes.eld_log.models.Simulator;
import com.mes.eld_log.models.StateMaster;
import com.mes.eld_log.models.TimezoneMaster;
import com.mes.eld_log.models.TrailerMaster;
import com.mes.eld_log.models.UserMaster;
import com.mes.eld_log.models.UserTypeMaster;
import com.mes.eld_log.models.VehicleCondition;
import com.mes.eld_log.models.VehicleMaster;
import com.mes.eld_log.models.VehicleTypeMaster;
import com.mes.eld_log.results.ResultWrapper;
import com.mes.eld_log.service.MasterService;
import com.mes.eld_log.util.eldLogUtils;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/master"})
public class MasterController {
   private static final Logger LOGGER = LoggerFactory.getLogger(MasterController.class);
   @Autowired
   private MasterService masterService;
   @Autowired
   private eldLogUtils imobilityUtils;

   @ResponseStatus(HttpStatus.BAD_REQUEST)
   @ExceptionHandler({MethodArgumentNotValidException.class})
   public Map<String, String> handleMethodArgumentNotValid(MethodArgumentNotValidException ex) {
      Map<String, String> errors = new HashMap<>();
      errors.put("status", "FAIL");
      ex.getBindingResult().getFieldErrors().forEach(error -> errors.put(error.getField(), error.getDefaultMessage()));
      return errors;
   }

   @PostMapping({"/add_employee"})
   public ResponseEntity<ResultWrapper<EmployeeMaster>> AddEmployee(@Valid @RequestBody EmployeeMaster employeeMaster, javax.servlet.http.HttpServletRequest request) throws UnsupportedEncodingException, JsonProcessingException {
      UserMaster user = imobilityUtils.getLoggedInUser(request);
      if (user != null && (user.getUserTypeId() == 2 || user.getUserTypeId() == 3)) {
         employeeMaster.setClientId((int)user.getClientId());
      }
      ResultWrapper<EmployeeMaster> result = null;
      result = this.masterService.AddEmployee(employeeMaster);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_employee"})
   public ResponseEntity<ResultWrapper<List<EmployeeMasterViewDto>>> ViewEmployee(@Valid @RequestBody EmployeeMasterCRUDDto employeeMasterCRUDDto, javax.servlet.http.HttpServletRequest request) throws UnsupportedEncodingException, JsonProcessingException {
      UserMaster user = imobilityUtils.getLoggedInUser(request);
      if (user != null && (user.getUserTypeId() == 2 || user.getUserTypeId() == 3)) {
         employeeMasterCRUDDto.setClientId((long)user.getClientId());
      }
      ResultWrapper<List<EmployeeMasterViewDto>> result = null;
      String tokenValid = "";

      try {
         tokenValid = this.imobilityUtils.CheckTokenNo(employeeMasterCRUDDto.getEmployeeId(), employeeMasterCRUDDto.getTokenNo());
      } catch (Exception var5) {
         var5.printStackTrace();
      }

      result = this.masterService.ViewEmployee(employeeMasterCRUDDto, tokenValid);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_employee_first_login"})
   public ResponseEntity<ResultWrapper<List<EmployeeMasterViewDto>>> ViewEmployeeFirstLogin(@Valid @RequestBody EmployeeMasterCRUDDto employeeMasterCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<List<EmployeeMasterViewDto>> result = null;
      String tokenValid = "false";
      result = this.masterService.ViewEmployeeFirstLogin(employeeMasterCRUDDto, tokenValid);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_employee_by_client"})
   public ResponseEntity<ResultWrapper<List<EmployeeMasterListViewDto>>> ViewEmployeeByClient(@Valid @RequestBody EmployeeMasterCRUDDto employeeMasterCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<List<EmployeeMasterListViewDto>> result = null;
      String tokenValid = "";

      try {
         tokenValid = this.imobilityUtils.CheckTokenNo(employeeMasterCRUDDto.getEmployeeId(), employeeMasterCRUDDto.getTokenNo());
      } catch (Exception var5) {
         var5.printStackTrace();
      }

      result = this.masterService.ViewEmployeeByClient(employeeMasterCRUDDto, tokenValid);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/delete_employee"})
   public ResponseEntity<ResultWrapper<EmployeeMaster>> DeleteEmployee(@Valid @RequestBody EmployeeMasterCRUDDto employeeMasterCRUDDto, javax.servlet.http.HttpServletRequest request) throws UnsupportedEncodingException, JsonProcessingException {
      UserMaster user = imobilityUtils.getLoggedInUser(request);

      ResultWrapper<EmployeeMaster> result = null;
      result = this.masterService.DeleteEmployee(employeeMasterCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/update_employee"})
   public ResponseEntity<ResultWrapper<EmployeeMaster>> UpdateEmployee(@Valid @RequestBody EmployeeMaster employeeMaster, javax.servlet.http.HttpServletRequest request) throws UnsupportedEncodingException, JsonProcessingException {
      UserMaster user = imobilityUtils.getLoggedInUser(request);
      if (user != null && (user.getUserTypeId() == 2 || user.getUserTypeId() == 3)) {
         employeeMaster.setClientId((int)user.getClientId());
      }
      ResultWrapper<EmployeeMaster> result = null;
      result = this.masterService.UpdateEmployee(employeeMaster);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/update_employee_active_inactive"})
   public ResponseEntity<ResultWrapper<String>> UpdateEmployeeActiveInactive(@Valid @RequestBody EmployeeMasterCRUDDto employeeMasterCRUDDto, javax.servlet.http.HttpServletRequest request) throws UnsupportedEncodingException, JsonProcessingException {
      UserMaster user = imobilityUtils.getLoggedInUser(request);
      if (user != null && (user.getUserTypeId() == 2 || user.getUserTypeId() == 3)) {
         employeeMasterCRUDDto.setClientId((long)user.getClientId());
      }
      ResultWrapper<String> result = null;
      result = this.masterService.UpdateEmployeeActiveInactive(employeeMasterCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_driver_information"})
   public ResponseEntity<ResultWrapper<List<DriverInfoViewDto>>> ViewDriverInformation(@Valid @RequestBody EmployeeMasterCRUDDto employeeMasterCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<List<DriverInfoViewDto>> result = null;
      String tokenValid = "";

      try {
         tokenValid = this.imobilityUtils.CheckTokenNo(employeeMasterCRUDDto.getEmployeeId(), employeeMasterCRUDDto.getTokenNo());
      } catch (Exception var5) {
         var5.printStackTrace();
      }

      result = this.masterService.ViewDriverInformation(employeeMasterCRUDDto, tokenValid);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/token_checking_api"})
   public ResponseEntity<ResultWrapper<String>> TokenCheckingAPI(@Valid @RequestBody EmployeeMasterCRUDDto employeeMasterCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<String> result = null;
      String tokenValid = this.imobilityUtils.CheckTokenNo(employeeMasterCRUDDto.getEmployeeId(), employeeMasterCRUDDto.getTokenNo());
      result = this.masterService.TokenCheckingAPI(employeeMasterCRUDDto, tokenValid);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/add_device"})
   public ResponseEntity<ResultWrapper<DeviceMaster>> AddDevice(@Valid @RequestBody DeviceMaster deviceMaster) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<DeviceMaster> result = null;
      result = this.masterService.AddDevice(deviceMaster);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_device"})
   public ResponseEntity<ResultWrapper<List<DeviceMasterViewDto>>> ViewDevice(@Valid @RequestBody DeviceMasterCRUDDto deviceMasterCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<List<DeviceMasterViewDto>> result = null;
      result = this.masterService.ViewDevice(deviceMasterCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/delete_device"})
   public ResponseEntity<ResultWrapper<DeviceMaster>> DeleteDevice(@Valid @RequestBody DeviceMasterCRUDDto deviceMasterCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<DeviceMaster> result = null;
      result = this.masterService.DeleteDevice(deviceMasterCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/update_device"})
   public ResponseEntity<ResultWrapper<DeviceMaster>> UpdateDevice(@Valid @RequestBody DeviceMaster deviceMaster) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<DeviceMaster> result = null;
      result = this.masterService.UpdateDevice(deviceMaster);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/add_vehicle"})
   public ResponseEntity<ResultWrapper<VehicleMaster>> AddVehicle(@Valid @RequestBody VehicleMaster vehicleMaster, javax.servlet.http.HttpServletRequest request) throws UnsupportedEncodingException, JsonProcessingException {
      UserMaster user = imobilityUtils.getLoggedInUser(request);
      if (user != null && user.getUserTypeId() == 3) {
         ResultWrapper<VehicleMaster> result = new ResultWrapper<>();
         result.setStatus(com.mes.eld_log.results.Result.FAIL);
         result.setMessage("Unauthorized: Support Personnel cannot perform this action.");
         return new ResponseEntity(result, HttpStatus.FORBIDDEN);
      }
      ResultWrapper<VehicleMaster> result = null;
      result = this.masterService.AddVehicle(vehicleMaster);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_vehicle"})
   public ResponseEntity<ResultWrapper<List<VehicleMasterViewDto>>> ViewVehicle(@Valid @RequestBody VehicleMasterCRUDDto vehicleMasterCRUDDto, javax.servlet.http.HttpServletRequest request) throws UnsupportedEncodingException, JsonProcessingException {
      UserMaster user = imobilityUtils.getLoggedInUser(request);
      if (user != null && (user.getUserTypeId() == 2 || user.getUserTypeId() == 3)) {
         vehicleMasterCRUDDto.setClientId((long)user.getClientId());
      }
      ResultWrapper<List<VehicleMasterViewDto>> result = null;
      String tokenValid = "";

      try {
         tokenValid = this.imobilityUtils.CheckTokenNo((int)vehicleMasterCRUDDto.getDriverId(), vehicleMasterCRUDDto.getTokenNo());
      } catch (Exception var5) {
         var5.printStackTrace();
      }

      result = this.masterService.ViewVehicle(vehicleMasterCRUDDto, tokenValid);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_active_vehicle"})
   public ResponseEntity<ResultWrapper<List<VehicleMasterViewDto>>> ViewActiveVehicle(@Valid @RequestBody VehicleMasterCRUDDto vehicleMasterCRUDDto, javax.servlet.http.HttpServletRequest request) throws UnsupportedEncodingException, JsonProcessingException {
      UserMaster user = imobilityUtils.getLoggedInUser(request);
      if (user != null && (user.getUserTypeId() == 2 || user.getUserTypeId() == 3)) {
         vehicleMasterCRUDDto.setClientId((long)user.getClientId());
      }
      ResultWrapper<List<VehicleMasterViewDto>> result = null;
      String tokenValid = "";

      try {
         tokenValid = this.imobilityUtils.CheckTokenNo((int)vehicleMasterCRUDDto.getDriverId(), vehicleMasterCRUDDto.getTokenNo());
      } catch (Exception var5) {
         var5.printStackTrace();
      }

      result = this.masterService.ViewActiveVehicle(vehicleMasterCRUDDto, tokenValid);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/delete_vehicle"})
   public ResponseEntity<ResultWrapper<VehicleMaster>> DeleteVehicle(@Valid @RequestBody VehicleMasterCRUDDto vehicleMasterCRUDDto, javax.servlet.http.HttpServletRequest request) throws UnsupportedEncodingException, JsonProcessingException {
      UserMaster user = imobilityUtils.getLoggedInUser(request);
      if (user != null && user.getUserTypeId() == 3) {
         ResultWrapper<VehicleMaster> result = new ResultWrapper<>();
         result.setStatus(com.mes.eld_log.results.Result.FAIL);
         result.setMessage("Unauthorized: Support Personnel cannot perform this action.");
         return new ResponseEntity(result, HttpStatus.FORBIDDEN);
      }
      ResultWrapper<VehicleMaster> result = null;
      result = this.masterService.DeleteVehicle(vehicleMasterCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/update_vehicle"})
   public ResponseEntity<ResultWrapper<VehicleMaster>> UpdateVehicle(@Valid @RequestBody VehicleMaster vehicleMaster, javax.servlet.http.HttpServletRequest request) throws UnsupportedEncodingException, JsonProcessingException {
      UserMaster user = imobilityUtils.getLoggedInUser(request);
      if (user != null && user.getUserTypeId() == 3) {
         ResultWrapper<VehicleMaster> result = new ResultWrapper<>();
         result.setStatus(com.mes.eld_log.results.Result.FAIL);
         result.setMessage("Unauthorized: Support Personnel cannot perform this action.");
         return new ResponseEntity(result, HttpStatus.FORBIDDEN);
      }
      ResultWrapper<VehicleMaster> result = null;
      result = this.masterService.UpdateVehicle(vehicleMaster);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/add_country"})
   public ResponseEntity<ResultWrapper<CountryMaster>> AddCountry(@Valid @RequestBody CountryMaster countryMaster) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<CountryMaster> result = null;
      result = this.masterService.AddCountry(countryMaster);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_country"})
   public ResponseEntity<ResultWrapper<List<CountryMaster>>> ViewCountry(@Valid @RequestBody CountryStateCityMasterCRUDDto countryStateCityMasterCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<List<CountryMaster>> result = null;
      result = this.masterService.ViewCountry(countryStateCityMasterCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/delete_country"})
   public ResponseEntity<ResultWrapper<CountryMaster>> DeleteCountry(@Valid @RequestBody CountryStateCityMasterCRUDDto countryStateCityMasterCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<CountryMaster> result = null;
      result = this.masterService.DeleteCountry(countryStateCityMasterCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/update_country"})
   public ResponseEntity<ResultWrapper<CountryMaster>> UpdateCountry(@Valid @RequestBody CountryMaster countryMaster) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<CountryMaster> result = null;
      result = this.masterService.UpdateCountry(countryMaster);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/add_state"})
   public ResponseEntity<ResultWrapper<StateMaster>> AddState(@Valid @RequestBody StateMaster stateMaster) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<StateMaster> result = null;
      result = this.masterService.AddState(stateMaster);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_state"})
   public ResponseEntity<ResultWrapper<List<StateMaster>>> ViewState(@Valid @RequestBody CountryStateCityMasterCRUDDto countryStateCityMasterCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<List<StateMaster>> result = null;
      result = this.masterService.ViewState(countryStateCityMasterCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_state_by_country"})
   public ResponseEntity<ResultWrapper<List<StateMaster>>> ViewStateByCountry(@Valid @RequestBody CountryStateCityMasterCRUDDto countryStateCityMasterCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<List<StateMaster>> result = null;
      result = this.masterService.ViewStateByCountry(countryStateCityMasterCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/delete_state"})
   public ResponseEntity<ResultWrapper<StateMaster>> DeleteState(@Valid @RequestBody CountryStateCityMasterCRUDDto countryStateCityMasterCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<StateMaster> result = null;
      result = this.masterService.DeleteState(countryStateCityMasterCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/update_state"})
   public ResponseEntity<ResultWrapper<StateMaster>> UpdateState(@Valid @RequestBody StateMaster stateMaster) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<StateMaster> result = null;
      result = this.masterService.UpdateState(stateMaster);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/add_city"})
   public ResponseEntity<ResultWrapper<CityMaster>> AddCity(@Valid @RequestBody CityMaster cityMaster) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<CityMaster> result = null;
      result = this.masterService.AddCity(cityMaster);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_city"})
   public ResponseEntity<ResultWrapper<List<CityMaster>>> ViewCity(@Valid @RequestBody CountryStateCityMasterCRUDDto countryStateCityMasterCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<List<CityMaster>> result = null;
      result = this.masterService.ViewCity(countryStateCityMasterCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/delete_city"})
   public ResponseEntity<ResultWrapper<CityMaster>> DeleteCity(@Valid @RequestBody CountryStateCityMasterCRUDDto countryStateCityMasterCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<CityMaster> result = null;
      result = this.masterService.DeleteCity(countryStateCityMasterCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/update_city"})
   public ResponseEntity<ResultWrapper<CityMaster>> UpdateCity(@Valid @RequestBody CityMaster cityMaster) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<CityMaster> result = null;
      result = this.masterService.UpdateCity(cityMaster);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/add_product"})
   public ResponseEntity<ResultWrapper<ProductMaster>> AddProduct(@Valid @RequestBody ProductMaster productMaster) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<ProductMaster> result = null;
      result = this.masterService.AddProduct(productMaster);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_product"})
   public ResponseEntity<ResultWrapper<List<ProductMaster>>> ViewProduct(@Valid @RequestBody ProductMasterCRUDDto productMasterCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<List<ProductMaster>> result = null;
      result = this.masterService.ViewProduct(productMasterCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/delete_product"})
   public ResponseEntity<ResultWrapper<ProductMaster>> DeleteProduct(@Valid @RequestBody ProductMasterCRUDDto productMasterCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<ProductMaster> result = null;
      result = this.masterService.DeleteProduct(productMasterCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/update_product"})
   public ResponseEntity<ResultWrapper<ProductMaster>> UpdateProduct(@Valid @RequestBody ProductMaster productMaster) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<ProductMaster> result = null;
      result = this.masterService.UpdateProduct(productMaster);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/add_customer"})
   public ResponseEntity<ResultWrapper<CustomerMaster>> AddCustomer(@Valid @RequestBody CustomerMaster customerMaster) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<CustomerMaster> result = null;
      result = this.masterService.AddCustomer(customerMaster);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_customer"})
   public ResponseEntity<ResultWrapper<List<CustomerMaster>>> ViewCustomer(@Valid @RequestBody CustomerMasterCRUDDto customerMasterCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<List<CustomerMaster>> result = null;
      result = this.masterService.ViewCustomer(customerMasterCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/delete_customer"})
   public ResponseEntity<ResultWrapper<CustomerMaster>> DeleteCustomer(@Valid @RequestBody CustomerMasterCRUDDto customerMasterCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<CustomerMaster> result = null;
      result = this.masterService.DeleteCustomer(customerMasterCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/update_customer"})
   public ResponseEntity<ResultWrapper<CustomerMaster>> UpdateCustomer(@Valid @RequestBody CustomerMaster customerMaster) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<CustomerMaster> result = null;
      result = this.masterService.UpdateCustomer(customerMaster);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/add_shipper"})
   public ResponseEntity<ResultWrapper<ShipperMaster>> AddShipper(@Valid @RequestBody ShipperMaster shipperMaster) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<ShipperMaster> result = null;
      result = this.masterService.AddShipper(shipperMaster);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_shipper"})
   public ResponseEntity<ResultWrapper<List<ShipperMaster>>> ViewShipper(@Valid @RequestBody ShipperMasterCRUDDto shipperMasterCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<List<ShipperMaster>> result = null;
      result = this.masterService.ViewShipper(shipperMasterCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/delete_shipper"})
   public ResponseEntity<ResultWrapper<ShipperMaster>> DeleteShipper(@Valid @RequestBody ShipperMasterCRUDDto shipperMasterCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<ShipperMaster> result = null;
      result = this.masterService.DeleteShipper(shipperMasterCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/update_shipper"})
   public ResponseEntity<ResultWrapper<ShipperMaster>> UpdateShipper(@Valid @RequestBody ShipperMaster shipperMaster) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<ShipperMaster> result = null;
      result = this.masterService.UpdateShipper(shipperMaster);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/add_receiver"})
   public ResponseEntity<ResultWrapper<ReceiverMaster>> AddReceiver(@Valid @RequestBody ReceiverMaster receiverMaster) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<ReceiverMaster> result = null;
      result = this.masterService.AddReceiver(receiverMaster);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_receiver"})
   public ResponseEntity<ResultWrapper<List<ReceiverMaster>>> ViewReceiver(@Valid @RequestBody ReceiverMasterCRUDDto receiverMasterCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<List<ReceiverMaster>> result = null;
      result = this.masterService.ViewReceiver(receiverMasterCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/delete_receiver"})
   public ResponseEntity<ResultWrapper<ReceiverMaster>> DeleteReceiver(@Valid @RequestBody ReceiverMasterCRUDDto receiverMasterCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<ReceiverMaster> result = null;
      result = this.masterService.DeleteReceiver(receiverMasterCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/update_receiver"})
   public ResponseEntity<ResultWrapper<ReceiverMaster>> UpdateReceiver(@Valid @RequestBody ReceiverMaster receiverMaster) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<ReceiverMaster> result = null;
      result = this.masterService.UpdateReceiver(receiverMaster);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/add_route"})
   public ResponseEntity<ResultWrapper<RouteMaster>> AddRoute(@Valid @RequestBody RouteMaster routeMaster) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<RouteMaster> result = null;
      result = this.masterService.AddRoute(routeMaster);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_route"})
   public ResponseEntity<ResultWrapper<List<RouteMaster>>> ViewRoute(@Valid @RequestBody RouteMasterCRUDDto routeMasterCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<List<RouteMaster>> result = null;
      result = this.masterService.ViewRoute(routeMasterCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/delete_route"})
   public ResponseEntity<ResultWrapper<RouteMaster>> DeleteRoute(@Valid @RequestBody RouteMasterCRUDDto routeMasterCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<RouteMaster> result = null;
      result = this.masterService.DeleteRoute(routeMasterCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/update_route"})
   public ResponseEntity<ResultWrapper<RouteMaster>> UpdateRoute(@Valid @RequestBody RouteMaster routeMaster) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<RouteMaster> result = null;
      result = this.masterService.UpdateRoute(routeMaster);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/add_carrier"})
   public ResponseEntity<ResultWrapper<CarrierMaster>> AddCarrier(@Valid @RequestBody CarrierMaster carrierMaster) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<CarrierMaster> result = null;
      result = this.masterService.AddCarrier(carrierMaster);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_carrier"})
   public ResponseEntity<ResultWrapper<List<CarrierMaster>>> ViewCarrier(@Valid @RequestBody CarrierMasterCRUDDto carrierMasterCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<List<CarrierMaster>> result = null;
      result = this.masterService.ViewCarrier(carrierMasterCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/delete_carrier"})
   public ResponseEntity<ResultWrapper<CarrierMaster>> DeleteCarrier(@Valid @RequestBody CarrierMasterCRUDDto carrierMasterCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<CarrierMaster> result = null;
      result = this.masterService.DeleteCarrier(carrierMasterCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/update_carrier"})
   public ResponseEntity<ResultWrapper<CarrierMaster>> UpdateCarrier(@Valid @RequestBody CarrierMaster carrierMaster) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<CarrierMaster> result = null;
      result = this.masterService.UpdateCarrier(carrierMaster);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/get_next_company_no"})
   public ResponseEntity<ResultWrapper<String>> GenerateCompanyNo() throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<String> result = null;
      result = this.masterService.GenerateCompanyNo();
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/add_client"})
   public ResponseEntity<ResultWrapper<ClientMaster>> AddClient(@Valid @RequestBody ClientMaster clientMaster) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<ClientMaster> result = null;
      result = this.masterService.AddClient(clientMaster);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_client"})
   public ResponseEntity<ResultWrapper<List<ClientMasterViewDto>>> ViewClient(@Valid @RequestBody ClientMasterCRUDDto clientMasterCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<List<ClientMasterViewDto>> result = null;
      result = this.masterService.ViewClient(clientMasterCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/delete_client"})
   public ResponseEntity<ResultWrapper<ClientMaster>> DeleteClient(@Valid @RequestBody ClientMasterCRUDDto clientMasterCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<ClientMaster> result = null;
      result = this.masterService.DeleteClient(clientMasterCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/update_client"})
   public ResponseEntity<ResultWrapper<ClientMaster>> UpdateClient(@Valid @RequestBody ClientMaster clientMaster) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<ClientMaster> result = null;
      result = this.masterService.UpdateClient(clientMaster);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/update_client_grace_time"})
   public ResponseEntity<ResultWrapper<String>> UpdateClientGraceTime(@Valid @RequestBody UserMasterCRUDDto userMasterCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<String> result = null;
      result = this.masterService.UpdateClientGraceTime(userMasterCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/update_client_active_inactive"})
   public ResponseEntity<ResultWrapper<String>> UpdateClientActiveInactive(@Valid @RequestBody UserMasterCRUDDto userMasterCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<String> result = null;
      result = this.masterService.UpdateClientActiveInactive(userMasterCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/add_user_type"})
   public ResponseEntity<ResultWrapper<UserTypeMaster>> AddUserType(@Valid @RequestBody UserTypeMaster userTypeMaster) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<UserTypeMaster> result = null;
      result = this.masterService.AddUserType(userTypeMaster);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_user_type"})
   public ResponseEntity<ResultWrapper<List<UserTypeMaster>>> ViewUserType(@Valid @RequestBody UserTypeMasterCRUDDto userTypeMasterCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<List<UserTypeMaster>> result = null;
      result = this.masterService.ViewUserType(userTypeMasterCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/delete_user_type"})
   public ResponseEntity<ResultWrapper<UserTypeMaster>> DeleteUserType(@Valid @RequestBody UserTypeMasterCRUDDto userTypeMasterCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<UserTypeMaster> result = null;
      result = this.masterService.DeleteUserType(userTypeMasterCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/update_user_type"})
   public ResponseEntity<ResultWrapper<UserTypeMaster>> UpdateUserType(@Valid @RequestBody UserTypeMaster userTypeMaster) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<UserTypeMaster> result = null;
      result = this.masterService.UpdateUserType(userTypeMaster);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/add_user"})
   public ResponseEntity<ResultWrapper<UserMaster>> AddUser(@Valid @RequestBody UserMaster userMaster, javax.servlet.http.HttpServletRequest request) throws UnsupportedEncodingException, JsonProcessingException {
      UserMaster user = imobilityUtils.getLoggedInUser(request);
      if (user != null && user.getUserTypeId() == 3) {
         ResultWrapper<UserMaster> result = new ResultWrapper<>();
         result.setStatus(com.mes.eld_log.results.Result.FAIL);
         result.setMessage("Unauthorized: Support Personnel cannot perform this action.");
         return new ResponseEntity(result, HttpStatus.FORBIDDEN);
      }
      
      if (user != null && user.getUserTypeId() == 2 && userMaster.getUserTypeId() == 3) {
         userMaster.setClientId(user.getClientId());
      }
      
      ResultWrapper<UserMaster> result = null;
      result = this.masterService.AddUser(userMaster);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_user"})
   public ResponseEntity<ResultWrapper<List<UserMasterViewDto>>> ViewUser(@Valid @RequestBody UserMasterCRUDDto userMasterCRUDDto, javax.servlet.http.HttpServletRequest request) throws UnsupportedEncodingException, JsonProcessingException {
      UserMaster user = imobilityUtils.getLoggedInUser(request);
      if (user != null && user.getUserTypeId() == 3) {
         ResultWrapper<List<UserMasterViewDto>> result = new ResultWrapper<>();
         result.setStatus(com.mes.eld_log.results.Result.FAIL);
         result.setMessage("Unauthorized: Support Personnel cannot perform this action.");
         return new ResponseEntity(result, HttpStatus.FORBIDDEN);
      }
      ResultWrapper<List<UserMasterViewDto>> result = null;
      result = this.masterService.ViewUser(userMasterCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/delete_user"})
   public ResponseEntity<ResultWrapper<UserMaster>> DeleteUser(@Valid @RequestBody UserMasterCRUDDto userMasterCRUDDto, javax.servlet.http.HttpServletRequest request) throws UnsupportedEncodingException, JsonProcessingException {
      UserMaster user = imobilityUtils.getLoggedInUser(request);
      if (user != null && user.getUserTypeId() == 3) {
         ResultWrapper<UserMaster> result = new ResultWrapper<>();
         result.setStatus(com.mes.eld_log.results.Result.FAIL);
         result.setMessage("Unauthorized: Support Personnel cannot perform this action.");
         return new ResponseEntity(result, HttpStatus.FORBIDDEN);
      }
      ResultWrapper<UserMaster> result = null;
      result = this.masterService.DeleteUser(userMasterCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/update_user"})
   public ResponseEntity<ResultWrapper<UserMaster>> UpdateUser(@Valid @RequestBody UserMaster userMaster, javax.servlet.http.HttpServletRequest request) throws UnsupportedEncodingException, JsonProcessingException {
      UserMaster user = imobilityUtils.getLoggedInUser(request);
      if (user != null && user.getUserTypeId() == 3) {
         ResultWrapper<UserMaster> result = new ResultWrapper<>();
         result.setStatus(com.mes.eld_log.results.Result.FAIL);
         result.setMessage("Unauthorized: Support Personnel cannot perform this action.");
         return new ResponseEntity(result, HttpStatus.FORBIDDEN);
      }
      ResultWrapper<UserMaster> result = null;
      result = this.masterService.UpdateUser(userMaster);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/update_user_feature"})
   public ResponseEntity<ResultWrapper<String>> UpdateUserFeature(@Valid @RequestBody UserMasterCRUDDto userMasterCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<String> result = null;
      result = this.masterService.UpdateUserFeature(userMasterCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/reset_user_token"})
   public ResponseEntity<ResultWrapper<String>> ResetUserToken(@Valid @RequestBody UserMasterCRUDDto userMasterCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<String> result = null;
      result = this.masterService.ResetUserToken(userMasterCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/add_company"})
   public ResponseEntity<ResultWrapper<CompanyMaster>> AddCompany(@Valid @RequestBody CompanyMaster companyMaster, javax.servlet.http.HttpServletRequest request) throws UnsupportedEncodingException, JsonProcessingException {
      UserMaster user = imobilityUtils.getLoggedInUser(request);
      if (user != null && user.getUserTypeId() == 3) {
         ResultWrapper<CompanyMaster> result = new ResultWrapper<>();
         result.setStatus(com.mes.eld_log.results.Result.FAIL);
         result.setMessage("Unauthorized: Support Personnel cannot perform this action.");
         return new ResponseEntity(result, HttpStatus.FORBIDDEN);
      }
      ResultWrapper<CompanyMaster> result = null;
      result = this.masterService.AddCompany(companyMaster);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_company"})
   public ResponseEntity<ResultWrapper<List<CompanyMaster>>> ViewCompany(@Valid @RequestBody CompanyMasterCRUDDto companyMasterCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<List<CompanyMaster>> result = null;
      result = this.masterService.ViewCompany(companyMasterCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/delete_company"})
   public ResponseEntity<ResultWrapper<CompanyMaster>> DeleteCompany(@Valid @RequestBody CompanyMasterCRUDDto companyMasterCRUDDto, javax.servlet.http.HttpServletRequest request) throws UnsupportedEncodingException, JsonProcessingException {
      UserMaster user = imobilityUtils.getLoggedInUser(request);
      if (user != null && user.getUserTypeId() == 3) {
         ResultWrapper<CompanyMaster> result = new ResultWrapper<>();
         result.setStatus(com.mes.eld_log.results.Result.FAIL);
         result.setMessage("Unauthorized: Support Personnel cannot perform this action.");
         return new ResponseEntity(result, HttpStatus.FORBIDDEN);
      }
      ResultWrapper<CompanyMaster> result = null;
      result = this.masterService.DeleteCompany(companyMasterCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/update_company"})
   public ResponseEntity<ResultWrapper<CompanyMaster>> UpdateCompany(@Valid @RequestBody CompanyMaster companyMaster, javax.servlet.http.HttpServletRequest request) throws UnsupportedEncodingException, JsonProcessingException {
      UserMaster user = imobilityUtils.getLoggedInUser(request);
      if (user != null && user.getUserTypeId() == 3) {
         ResultWrapper<CompanyMaster> result = new ResultWrapper<>();
         result.setStatus(com.mes.eld_log.results.Result.FAIL);
         result.setMessage("Unauthorized: Support Personnel cannot perform this action.");
         return new ResponseEntity(result, HttpStatus.FORBIDDEN);
      }
      ResultWrapper<CompanyMaster> result = null;
      result = this.masterService.UpdateCompany(companyMaster);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/add_language"})
   public ResponseEntity<ResultWrapper<LanguageMaster>> AddLanguage(@Valid @RequestBody LanguageMaster languageMaster) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<LanguageMaster> result = null;
      result = this.masterService.AddLanguage(languageMaster);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_language"})
   public ResponseEntity<ResultWrapper<List<LanguageMaster>>> ViewLanguage(@Valid @RequestBody LanguageMasterCRUDDto languageMasterCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<List<LanguageMaster>> result = null;
      result = this.masterService.ViewLanguage(languageMasterCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/delete_language"})
   public ResponseEntity<ResultWrapper<LanguageMaster>> DeleteLanguage(@Valid @RequestBody LanguageMasterCRUDDto languageMasterCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<LanguageMaster> result = null;
      result = this.masterService.DeleteLanguage(languageMasterCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/update_language"})
   public ResponseEntity<ResultWrapper<LanguageMaster>> UpdateLanguage(@Valid @RequestBody LanguageMaster languageMaster) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<LanguageMaster> result = null;
      result = this.masterService.UpdateLanguage(languageMaster);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/add_cycle_usa"})
   public ResponseEntity<ResultWrapper<CycleUsa>> AddCycleUsa(@Valid @RequestBody CycleUsa cycleUsa) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<CycleUsa> result = null;
      result = this.masterService.AddCycleUsa(cycleUsa);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_cycle_usa"})
   public ResponseEntity<ResultWrapper<List<CycleUsa>>> ViewCycleUsa(@Valid @RequestBody CycleUsaCRUDDto cycleUsaCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<List<CycleUsa>> result = null;
      result = this.masterService.ViewCycleUsa(cycleUsaCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/delete_cycle_usa"})
   public ResponseEntity<ResultWrapper<CycleUsa>> DeleteCycleUsa(@Valid @RequestBody CycleUsaCRUDDto cycleUsaCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<CycleUsa> result = null;
      result = this.masterService.DeleteCycleUsa(cycleUsaCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/update_cycle_usa"})
   public ResponseEntity<ResultWrapper<CycleUsa>> UpdateCycleUsa(@Valid @RequestBody CycleUsa cycleUsa) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<CycleUsa> result = null;
      result = this.masterService.UpdateCycleUsa(cycleUsa);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/add_cycle_canada"})
   public ResponseEntity<ResultWrapper<CycleCanada>> AddCycleCanada(@Valid @RequestBody CycleCanada cycleCanada) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<CycleCanada> result = null;
      result = this.masterService.AddCycleCanada(cycleCanada);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_cycle_canada"})
   public ResponseEntity<ResultWrapper<List<CycleCanada>>> ViewCycleCanada(@Valid @RequestBody CycleCanadaCRUDDto cycleCanadaCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<List<CycleCanada>> result = null;
      result = this.masterService.ViewCycleCanada(cycleCanadaCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/delete_cycle_canada"})
   public ResponseEntity<ResultWrapper<CycleCanada>> DeleteCycleCanada(@Valid @RequestBody CycleCanadaCRUDDto cycleCanadaCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<CycleCanada> result = null;
      result = this.masterService.DeleteCycleCanada(cycleCanadaCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/update_cycle_canada"})
   public ResponseEntity<ResultWrapper<CycleCanada>> UpdateCycleCanada(@Valid @RequestBody CycleCanada cycleCanada) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<CycleCanada> result = null;
      result = this.masterService.UpdateCycleCanada(cycleCanada);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/add_device_modal"})
   public ResponseEntity<ResultWrapper<DeviceModalMaster>> AddDeviceModal(@Valid @RequestBody DeviceModalMaster deviceModalMaster) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<DeviceModalMaster> result = null;
      result = this.masterService.AddDeviceModal(deviceModalMaster);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_device_modal"})
   public ResponseEntity<ResultWrapper<List<DeviceModalMaster>>> ViewDeviceModal(@Valid @RequestBody DeviceModalMasterCRUDDto deviceModalMasterCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<List<DeviceModalMaster>> result = null;
      result = this.masterService.ViewDeviceModal(deviceModalMasterCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/delete_device_modal"})
   public ResponseEntity<ResultWrapper<DeviceModalMaster>> DeleteDeviceModal(@Valid @RequestBody DeviceModalMasterCRUDDto deviceModalMasterCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<DeviceModalMaster> result = null;
      result = this.masterService.DeleteDeviceModal(deviceModalMasterCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/update_device_modal"})
   public ResponseEntity<ResultWrapper<DeviceModalMaster>> UpdateDeviceModal(@Valid @RequestBody DeviceModalMaster deviceModalMaster) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<DeviceModalMaster> result = null;
      result = this.masterService.UpdateDeviceModal(deviceModalMaster);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/add_vehicle_type"})
   public ResponseEntity<ResultWrapper<VehicleTypeMaster>> AddVehicleType(@Valid @RequestBody VehicleTypeMaster vehicleTypeMaster) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<VehicleTypeMaster> result = null;
      result = this.masterService.AddVehicleType(vehicleTypeMaster);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_vehicle_type"})
   public ResponseEntity<ResultWrapper<List<VehicleTypeMaster>>> ViewVehicleType(@Valid @RequestBody VehicleTypeMasterCRUDDto vehicleTypeMasterCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<List<VehicleTypeMaster>> result = null;
      result = this.masterService.ViewVehicleType(vehicleTypeMasterCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/delete_vehicle_type"})
   public ResponseEntity<ResultWrapper<VehicleTypeMaster>> DeleteVehicleType(@Valid @RequestBody VehicleTypeMasterCRUDDto vehicleTypeMasterCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<VehicleTypeMaster> result = null;
      result = this.masterService.DeleteVehicleType(vehicleTypeMasterCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/update_vehicle_type"})
   public ResponseEntity<ResultWrapper<VehicleTypeMaster>> UpdateVehicleType(@Valid @RequestBody VehicleTypeMaster vehicleTypeMaster) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<VehicleTypeMaster> result = null;
      result = this.masterService.UpdateVehicleType(vehicleTypeMaster);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/add_payment_status"})
   public ResponseEntity<ResultWrapper<PaymentStatusMaster>> AddPaymentStatus(@Valid @RequestBody PaymentStatusMaster paymentStatusMaster) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<PaymentStatusMaster> result = null;
      result = this.masterService.AddPaymentStatus(paymentStatusMaster);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_payment_status"})
   public ResponseEntity<ResultWrapper<List<PaymentStatusMaster>>> ViewPaymentStatus(@Valid @RequestBody PaymentStatusMasterCRUDDto paymentStatusMasterCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<List<PaymentStatusMaster>> result = null;
      result = this.masterService.ViewPaymentStatus(paymentStatusMasterCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/delete_payment_status"})
   public ResponseEntity<ResultWrapper<PaymentStatusMaster>> DeletePaymentStatus(@Valid @RequestBody PaymentStatusMasterCRUDDto paymentStatusMasterCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<PaymentStatusMaster> result = null;
      result = this.masterService.DeletePaymentStatus(paymentStatusMasterCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/update_payment_status"})
   public ResponseEntity<ResultWrapper<PaymentStatusMaster>> UpdatePaymentStatus(@Valid @RequestBody PaymentStatusMaster paymentStatusMaster) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<PaymentStatusMaster> result = null;
      result = this.masterService.UpdatePaymentStatus(paymentStatusMaster);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/add_exception"})
   public ResponseEntity<ResultWrapper<ExceptionMaster>> AddExceptionMaster(@Valid @RequestBody ExceptionMaster exceptionMaster) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<ExceptionMaster> result = null;
      result = this.masterService.AddExceptionMaster(exceptionMaster);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_exception"})
   public ResponseEntity<ResultWrapper<List<ExceptionMaster>>> ViewExceptionMaster(@Valid @RequestBody ExceptionMasterCRUDDto exceptionMasterCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<List<ExceptionMaster>> result = null;
      String tokenValid = "";

      try {
         tokenValid = this.imobilityUtils.CheckTokenNo((int)exceptionMasterCRUDDto.getDriverId(), exceptionMasterCRUDDto.getTokenNo());
      } catch (Exception var5) {
         var5.printStackTrace();
      }

      result = this.masterService.ViewExceptionMaster(exceptionMasterCRUDDto, tokenValid);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/delete_exception"})
   public ResponseEntity<ResultWrapper<ExceptionMaster>> DeleteExceptionMaster(@Valid @RequestBody ExceptionMasterCRUDDto exceptionMasterCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<ExceptionMaster> result = null;
      result = this.masterService.DeleteExceptionMaster(exceptionMasterCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/update_exception"})
   public ResponseEntity<ResultWrapper<ExceptionMaster>> UpdateExceptionMaster(@Valid @RequestBody ExceptionMaster exceptionMaster) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<ExceptionMaster> result = null;
      result = this.masterService.UpdateExceptionMaster(exceptionMaster);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/add_main_terminal"})
   public ResponseEntity<ResultWrapper<MainTerminalMaster>> AddMainTerminalMaster(@Valid @RequestBody MainTerminalMaster mainTerminalMaster) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<MainTerminalMaster> result = null;
      result = this.masterService.AddMainTerminalMaster(mainTerminalMaster);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_main_terminal"})
   public ResponseEntity<ResultWrapper<List<MainTerminalMaster>>> ViewMainTerminalMaster(
      @Valid @RequestBody MainTerminalMasterCRUDDto mainTerminalMasterCRUDDto
   ) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<List<MainTerminalMaster>> result = null;
      result = this.masterService.ViewMainTerminalMaster(mainTerminalMasterCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_all_main_terminal"})
   public ResponseEntity<ResultWrapper<List<MainTerminalMaster>>> ViewAllMainTerminalMaster(
      @Valid @RequestBody MainTerminalMasterCRUDDto mainTerminalMasterCRUDDto
   ) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<List<MainTerminalMaster>> result = null;
      result = this.masterService.ViewAllMainTerminalMaster(mainTerminalMasterCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/delete_main_terminal"})
   public ResponseEntity<ResultWrapper<MainTerminalMaster>> DeleteMainTerminalMaster(@Valid @RequestBody MainTerminalMasterCRUDDto mainTerminalMasterCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<MainTerminalMaster> result = null;
      result = this.masterService.DeleteMainTerminalMaster(mainTerminalMasterCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/update_main_terminal"})
   public ResponseEntity<ResultWrapper<MainTerminalMaster>> UpdateMainTerminalMaster(@Valid @RequestBody MainTerminalMaster mainTerminalMaster) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<MainTerminalMaster> result = null;
      result = this.masterService.UpdateMainTerminalMaster(mainTerminalMaster);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/add_cargo_type"})
   public ResponseEntity<ResultWrapper<CargoTypeMaster>> AddCargoTypeMaster(@Valid @RequestBody CargoTypeMaster cargoTypeMaster) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<CargoTypeMaster> result = null;
      result = this.masterService.AddCargoTypeMaster(cargoTypeMaster);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_cargo_type"})
   public ResponseEntity<ResultWrapper<List<CargoTypeMaster>>> ViewCargoTypeMaster(@Valid @RequestBody CargoTypeMasterCRUDDto cargoTypeMasterCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<List<CargoTypeMaster>> result = null;
      result = this.masterService.ViewCargoTypeMaster(cargoTypeMasterCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/delete_cargo_type"})
   public ResponseEntity<ResultWrapper<CargoTypeMaster>> DeleteCargoTypeMaster(@Valid @RequestBody CargoTypeMasterCRUDDto cargoTypeMasterCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<CargoTypeMaster> result = null;
      result = this.masterService.DeleteCargoTypeMaster(cargoTypeMasterCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/update_cargo_type"})
   public ResponseEntity<ResultWrapper<CargoTypeMaster>> UpdateCargoTypeMaster(@Valid @RequestBody CargoTypeMaster cargoTypeMaster) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<CargoTypeMaster> result = null;
      result = this.masterService.UpdateCargoTypeMaster(cargoTypeMaster);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/add_fuel_type"})
   public ResponseEntity<ResultWrapper<FuelTypeMaster>> AddFuelTypeMaster(@Valid @RequestBody FuelTypeMaster fuelTypeMaster) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<FuelTypeMaster> result = null;
      result = this.masterService.AddFuelTypeMaster(fuelTypeMaster);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_fuel_type"})
   public ResponseEntity<ResultWrapper<List<FuelTypeMaster>>> ViewFuelTypeMaster(@Valid @RequestBody FuelTypeMasterCRUDDto fuelTypeMasterCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<List<FuelTypeMaster>> result = null;
      result = this.masterService.ViewFuelTypeMaster(fuelTypeMasterCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/delete_fuel_type"})
   public ResponseEntity<ResultWrapper<FuelTypeMaster>> DeleteFuelTypeMaster(@Valid @RequestBody FuelTypeMasterCRUDDto fuelTypeMasterCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<FuelTypeMaster> result = null;
      result = this.masterService.DeleteFuelTypeMaster(fuelTypeMasterCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/update_fuel_type"})
   public ResponseEntity<ResultWrapper<FuelTypeMaster>> UpdateFuelTypeMaster(@Valid @RequestBody FuelTypeMaster fuelTypeMaster) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<FuelTypeMaster> result = null;
      result = this.masterService.UpdateFuelTypeMaster(fuelTypeMaster);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/add_refer_mode"})
   public ResponseEntity<ResultWrapper<ReferModeMaster>> AddReferModeMaster(@Valid @RequestBody ReferModeMaster referModeMaster) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<ReferModeMaster> result = null;
      result = this.masterService.AddReferModeMaster(referModeMaster);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_refer_mode"})
   public ResponseEntity<ResultWrapper<List<ReferModeMaster>>> ViewReferModeMaster(@Valid @RequestBody ReferModeCRUDDto referModeCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<List<ReferModeMaster>> result = null;
      result = this.masterService.ViewReferModeMaster(referModeCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/delete_refer_mode"})
   public ResponseEntity<ResultWrapper<ReferModeMaster>> DeleteReferModeMaster(@Valid @RequestBody ReferModeCRUDDto referModeCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<ReferModeMaster> result = null;
      result = this.masterService.DeleteReferModeMaster(referModeCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/update_refer_mode"})
   public ResponseEntity<ResultWrapper<ReferModeMaster>> UpdateReferModeMaster(@Valid @RequestBody ReferModeMaster referModeMaster) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<ReferModeMaster> result = null;
      result = this.masterService.UpdateReferModeMaster(referModeMaster);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/add_trailer"})
   public ResponseEntity<ResultWrapper<TrailerMaster>> AddTrailerMaster(@Valid @RequestBody TrailerMaster trailerMaster) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<TrailerMaster> result = null;
      result = this.masterService.AddTrailerMaster(trailerMaster);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_trailer"})
   public ResponseEntity<ResultWrapper<List<TrailerMaster>>> ViewTrailerMaster(@Valid @RequestBody TrailerMasterCRUDDto trailerMasterCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<List<TrailerMaster>> result = null;
      result = this.masterService.ViewTrailerMaster(trailerMasterCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/delete_trailer"})
   public ResponseEntity<ResultWrapper<TrailerMaster>> DeleteTrailerMaster(@Valid @RequestBody TrailerMasterCRUDDto trailerMasterCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<TrailerMaster> result = null;
      result = this.masterService.DeleteTrailerMaster(trailerMasterCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/update_trailer"})
   public ResponseEntity<ResultWrapper<TrailerMaster>> UpdateTrailerMaster(@Valid @RequestBody TrailerMaster trailerMaster) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<TrailerMaster> result = null;
      result = this.masterService.UpdateTrailerMaster(trailerMaster);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/add_simulator"})
   public ResponseEntity<ResultWrapper<Simulator>> AddSimulator(@Valid @RequestBody Simulator simulator) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<Simulator> result = null;
      result = this.masterService.AddSimulator(simulator);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_simulator"})
   public ResponseEntity<ResultWrapper<List<SimulatorCRUDDto>>> ViewSimulator(@Valid @RequestBody SimulatorCRUDDto simulatorCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<List<SimulatorCRUDDto>> result = null;
      result = this.masterService.ViewSimulator(simulatorCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/delete_simulator"})
   public ResponseEntity<ResultWrapper<Simulator>> DeleteSimulator(@Valid @RequestBody SimulatorCRUDDto simulatorCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<Simulator> result = null;
      result = this.masterService.DeleteSimulator(simulatorCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/add_defect"})
   public ResponseEntity<ResultWrapper<DefectMaster>> AddDefect(@Valid @RequestBody DefectMaster defectMaster) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<DefectMaster> result = null;
      result = this.masterService.AddDefect(defectMaster);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_defect"})
   public ResponseEntity<ResultWrapper<List<DefectMaster>>> ViewDefect(@Valid @RequestBody DefectMasterCRUDDto defectMasterCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<List<DefectMaster>> result = null;
      String tokenValid = "";

      try {
         tokenValid = this.imobilityUtils.CheckTokenNo((int)defectMasterCRUDDto.getDriverId(), defectMasterCRUDDto.getTokenNo());
      } catch (Exception var5) {
         var5.printStackTrace();
      }

      result = this.masterService.ViewDefect(defectMasterCRUDDto, tokenValid);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/delete_defect"})
   public ResponseEntity<ResultWrapper<DefectMaster>> DeleteDefect(@Valid @RequestBody DefectMasterCRUDDto defectMasterCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<DefectMaster> result = null;
      result = this.masterService.DeleteDefect(defectMasterCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/update_defect"})
   public ResponseEntity<ResultWrapper<DefectMaster>> UpdateDefect(@Valid @RequestBody DefectMaster defectMaster) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<DefectMaster> result = null;
      result = this.masterService.UpdateDefect(defectMaster);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/add_restart"})
   public ResponseEntity<ResultWrapper<RestartMaster>> AddRestart(@Valid @RequestBody RestartMaster restartMaster) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<RestartMaster> result = null;
      result = this.masterService.AddRestart(restartMaster);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_restart"})
   public ResponseEntity<ResultWrapper<List<RestartMaster>>> ViewRestart(@Valid @RequestBody RestartMasterCRUDDto restartMasterCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<List<RestartMaster>> result = null;
      result = this.masterService.ViewRestart(restartMasterCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/delete_restart"})
   public ResponseEntity<ResultWrapper<RestartMaster>> DeleteRestart(@Valid @RequestBody RestartMasterCRUDDto restartMasterCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<RestartMaster> result = null;
      result = this.masterService.DeleteRestart(restartMasterCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/update_restart"})
   public ResponseEntity<ResultWrapper<RestartMaster>> UpdateRestart(@Valid @RequestBody RestartMaster restartMaster) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<RestartMaster> result = null;
      result = this.masterService.UpdateRestart(restartMaster);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/add_rest_break"})
   public ResponseEntity<ResultWrapper<RestBreakMaster>> AddRestBreak(@Valid @RequestBody RestBreakMaster restBreakMaster) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<RestBreakMaster> result = null;
      result = this.masterService.AddRestBreak(restBreakMaster);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_rest_break"})
   public ResponseEntity<ResultWrapper<List<RestBreakMaster>>> ViewRestBreak(@Valid @RequestBody RestBreakMasterCRUDDto restBreakMasterCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<List<RestBreakMaster>> result = null;
      result = this.masterService.ViewRestBreak(restBreakMasterCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/delete_rest_break"})
   public ResponseEntity<ResultWrapper<RestBreakMaster>> DeleteRestBreak(@Valid @RequestBody RestBreakMasterCRUDDto restBreakMasterCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<RestBreakMaster> result = null;
      result = this.masterService.DeleteRestBreak(restBreakMasterCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/update_rest_break"})
   public ResponseEntity<ResultWrapper<RestBreakMaster>> UpdateRestBreak(@Valid @RequestBody RestBreakMaster restBreakMaster) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<RestBreakMaster> result = null;
      result = this.masterService.UpdateRestBreak(restBreakMaster);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/add_timezone"})
   public ResponseEntity<ResultWrapper<TimezoneMaster>> AddTimezone(@Valid @RequestBody TimezoneMaster timezoneMaster) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<TimezoneMaster> result = null;
      result = this.masterService.AddTimezone(timezoneMaster);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_timezone"})
   public ResponseEntity<ResultWrapper<List<TimezoneMaster>>> ViewTimezone(@Valid @RequestBody TimezoneMasterCRUDDto timezoneMasterCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<List<TimezoneMaster>> result = null;
      result = this.masterService.ViewTimezone(timezoneMasterCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/delete_timezone"})
   public ResponseEntity<ResultWrapper<TimezoneMaster>> DeleteTimezone(@Valid @RequestBody TimezoneMasterCRUDDto timezoneMasterCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<TimezoneMaster> result = null;
      result = this.masterService.DeleteTimezone(timezoneMasterCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/update_timezone"})
   public ResponseEntity<ResultWrapper<TimezoneMaster>> UpdateTimezone(@Valid @RequestBody TimezoneMaster timezoneMaster) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<TimezoneMaster> result = null;
      result = this.masterService.UpdateTimezone(timezoneMaster);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/add_eld_connection_interface"})
   public ResponseEntity<ResultWrapper<EldConnectionInterface>> AddEldConnectionInterface(@Valid @RequestBody EldConnectionInterface eldConnectionInterface) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<EldConnectionInterface> result = null;
      result = this.masterService.AddEldConnectionInterface(eldConnectionInterface);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_eld_connection_interface"})
   public ResponseEntity<ResultWrapper<List<EldConnectionInterface>>> ViewEldConnectionInterface(
      @Valid @RequestBody EldConnectionInterfaceCRUDDto eldConnectionInterfaceCRUDDto
   ) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<List<EldConnectionInterface>> result = null;
      result = this.masterService.ViewEldConnectionInterface(eldConnectionInterfaceCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/add_mac_address"})
   public ResponseEntity<ResultWrapper<String>> AddMacAddress(@Valid @RequestBody MACAddressMaster macAddressMaster) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<String> result = null;
      String tokenValid = "";

      try {
         tokenValid = this.imobilityUtils.CheckTokenNo((int)macAddressMaster.getDriverId(), macAddressMaster.getTokenNo());
      } catch (Exception var5) {
         var5.printStackTrace();
      }

      result = this.masterService.AddMacAddress(macAddressMaster, tokenValid);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/add_device_status"})
   public ResponseEntity<ResultWrapper<String>> AddDeviceStatus(@Valid @RequestBody DeviceStatus deviceStatus) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<String> result = null;
      String tokenValid = "";

      try {
         tokenValid = this.imobilityUtils.CheckTokenNo((int)deviceStatus.getDriverId(), deviceStatus.getTokenNo());
      } catch (Exception var5) {
         var5.printStackTrace();
      }

      result = this.masterService.AddDeviceStatus(deviceStatus, tokenValid);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/add_vehicle_condition"})
   public ResponseEntity<ResultWrapper<VehicleCondition>> AddVehicleCondition(@Valid @RequestBody VehicleCondition vehicleCondition) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<VehicleCondition> result = null;
      result = this.masterService.AddVehicleCondition(vehicleCondition);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_vehicle_condition"})
   public ResponseEntity<ResultWrapper<List<VehicleCondition>>> ViewVehicleCondition(@Valid @RequestBody VehicleConditionCRUDDto vehicleConditionCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<List<VehicleCondition>> result = null;
      result = this.masterService.ViewVehicleCondition(vehicleConditionCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/delete_vehicle_condition"})
   public ResponseEntity<ResultWrapper<VehicleCondition>> DeleteVehicleCondition(@Valid @RequestBody VehicleConditionCRUDDto vehicleConditionCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<VehicleCondition> result = null;
      result = this.masterService.DeleteVehicleCondition(vehicleConditionCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/update_vehicle_condition"})
   public ResponseEntity<ResultWrapper<VehicleCondition>> UpdateTimezone(@Valid @RequestBody VehicleCondition vehicleCondition) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<VehicleCondition> result = null;
      result = this.masterService.UpdateVehicleCondition(vehicleCondition);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_geofance_master"})
   public ResponseEntity<ResultWrapper<List<GeofanceMaster>>> ViewGeofanceMaster(@Valid @RequestBody GeofanceMasterCRUDDto geofanceMasterCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<List<GeofanceMaster>> result = null;
      result = this.masterService.ViewGeofanceMaster(geofanceMasterCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/add_eld_settings"})
   public ResponseEntity<ResultWrapper<ELDSettings>> AddEldSettings(@Valid @RequestBody ELDSettings eldSettings) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<ELDSettings> result = null;
      result = this.masterService.AddEldSettings(eldSettings);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_eld_settings"})
   public ResponseEntity<ResultWrapper<List<ELDSettings>>> ViewEldSettings(@Valid @RequestBody ELDSettings eldSettings) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<List<ELDSettings>> result = null;
      result = this.masterService.ViewEldSettings(eldSettings);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/delete_eld_settings"})
   public ResponseEntity<ResultWrapper<ELDSettings>> DeleteEldSettings(@Valid @RequestBody ELDSettings eldSettings) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<ELDSettings> result = null;
      result = this.masterService.DeleteEldSettings(eldSettings);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/update_eld_settings"})
   public ResponseEntity<ResultWrapper<ELDSettings>> UpdateEldSettings(@Valid @RequestBody ELDSettings eldSettings) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<ELDSettings> result = null;
      result = this.masterService.UpdateEldSettings(eldSettings);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/add_disclaimer"})
   public ResponseEntity<ResultWrapper<Disclaimer>> AddDisclaimer(@Valid @RequestBody Disclaimer disclaimer) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<Disclaimer> result = null;
      result = this.masterService.AddDisclaimer(disclaimer);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_disclaimer"})
   public ResponseEntity<ResultWrapper<List<Disclaimer>>> ViewDisclaimer() throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<List<Disclaimer>> result = null;
      result = this.masterService.ViewDisclaimer();
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/update_disclaimer_in_user"})
   public ResponseEntity<ResultWrapper<String>> UpdateDisclaimerInUser(@Valid @RequestBody UserMasterCRUDDto userMasterCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<String> result = null;
      result = this.masterService.UpdateDisclaimerInUser(userMasterCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/update_disclaimer_in_driver"})
   public ResponseEntity<ResultWrapper<String>> UpdateDisclaimerInDriver(@Valid @RequestBody UserMasterCRUDDto userMasterCRUDDto) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<String> result = null;
      result = this.masterService.UpdateDisclaimerInDriver(userMasterCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_project_detail_analytics"})
   public ResponseEntity<ResultWrapper<ProjectDetailAnalyticsViewDto>> ViewProjectDetailAnalytics() throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<ProjectDetailAnalyticsViewDto> result = null;
      result = this.masterService.ViewProjectDetailAnalytics();
      return new ResponseEntity(result, HttpStatus.OK);
   }

   @PostMapping({"/view_project_detail_analytics_by_client"})
   public ResponseEntity<ResultWrapper<ProjectDetailAnalyticsViewDto>> ViewProjectDetailAnalyticsByClient(
      @Valid @RequestBody ClientMasterCRUDDto clientMasterCRUDDto
   ) throws UnsupportedEncodingException, JsonProcessingException {
      ResultWrapper<ProjectDetailAnalyticsViewDto> result = null;
      result = this.masterService.ViewProjectDetailAnalyticsByClient(clientMasterCRUDDto);
      return new ResponseEntity(result, HttpStatus.OK);
   }
}
