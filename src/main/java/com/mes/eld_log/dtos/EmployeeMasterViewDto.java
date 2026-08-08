package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

public class EmployeeMasterViewDto {
   @JsonProperty("_id")
   private String _id;
   @JsonProperty("employeeId")
   private Integer employeeId;
   @JsonProperty("title")
   private String title;
   @JsonProperty("firstName")
   private String firstName;
   @JsonProperty("lastName")
   private String lastName;
   @JsonProperty("email")
   private String email;
   @JsonProperty("username")
   private String username;
   @JsonProperty("status")
   private String status;
   @JsonProperty("deviceStatus")
   private String deviceStatus;
   @JsonProperty("driverId")
   private String driverId;
   @JsonProperty("password")
   private String password;
   @JsonProperty("restartId")
   private long restartId;
   @JsonProperty("restartName")
   private ArrayList restartName;
   @JsonProperty("restBreakId")
   private long restBreakId;
   @JsonProperty("restBreakName")
   private ArrayList restBreakName;
   @JsonProperty("shortHaulException")
   private String shortHaulException;
   @JsonProperty("unlimitedTrailers")
   private String unlimitedTrailers;
   @JsonProperty("unlimitedShippingDocs")
   private String unlimitedShippingDocs;
   @JsonProperty("companyId")
   private long companyId;
   @JsonProperty("languageId")
   private long languageId;
   @JsonProperty("clientId")
   private long clientId;
   @JsonProperty("clientName")
   private ArrayList clientName;
   @JsonProperty("startTime")
   private String startTime;
   @JsonProperty("appVersion")
   private String appVersion;
   @JsonProperty("osVersion")
   private String osVersion;
   @JsonProperty("simCardNo")
   private String simCardNo;
   @JsonProperty("cycleUsaId")
   private long cycleUsaId;
   @JsonProperty("cycleUsaName")
   private ArrayList cycleUsaName;
   @JsonProperty("cycleCanadaId")
   private long cycleCanadaId;
   @JsonProperty("cycleCanadaName")
   private ArrayList cycleCanadaName;
   @JsonProperty("mainTerminalId")
   private long mainTerminalId;
   @JsonProperty("mainTerminalName")
   private ArrayList mainTerminalName;
   @JsonProperty("mobileNo")
   private long mobileNo;
   @JsonProperty("cdlNo")
   private String cdlNo;
   @JsonProperty("cdlCountryId")
   private long cdlCountryId;
   @JsonProperty("countryName")
   private ArrayList countryName;
   @JsonProperty("cdlStateId")
   private long cdlStateId;
   @JsonProperty("stateName")
   private ArrayList stateName;
   @JsonProperty("cdlExpiryDate")
   private String cdlExpiryDate;
   @JsonProperty("lCdlExpiryDate")
   private long lCdlExpiryDate;
   @JsonProperty("pdfEmail")
   private String pdfEmail;
   @JsonProperty("flatRate")
   private double flatRate;
   @JsonProperty("exempt")
   private String exempt;
   @JsonProperty("personalUse")
   private String personalUse;
   @JsonProperty("yardMoves")
   private String yardMoves;
   @JsonProperty("divR")
   private String divR;
   @JsonProperty("cargoTypeId")
   private long cargoTypeId;
   @JsonProperty("cargoTypeName")
   private ArrayList cargoTypeName;
   @JsonProperty("truckNo")
   private long truckNo;
   @JsonProperty("vehicleNo")
   private ArrayList vehicleNo;
   @JsonProperty("manageEquipement")
   private String manageEquipement;
   @JsonProperty("transferLog")
   private String transferLog;
   @JsonProperty("remarks")
   private String remarks;
   @JsonProperty("workingStatus")
   private String workingStatus;
   @JsonProperty("onDutyTime")
   private String onDutyTime;
   @JsonProperty("onDriveTime")
   private String onDriveTime;
   @JsonProperty("onSleepTime")
   private String onSleepTime;
   @JsonProperty("weeklyTime")
   private String weeklyTime;
   @JsonProperty("onBreak")
   private String onBreak;
   @JsonProperty("addedTimestamp")
   private long addedTimestamp;
   @JsonProperty("updatedTimestamp")
   private long updatedTimestamp;
   @JsonProperty("currentLocation")
   private String currentLocation;
   @JsonProperty("timezoneName")
   private String timezoneName;
   @JsonProperty("timezoneOffSet")
   private String timezoneOffSet;

   public String get_id() {
      return this._id;
   }

   public Integer getEmployeeId() {
      return this.employeeId;
   }

   public String getTitle() {
      return this.title;
   }

   public String getFirstName() {
      return this.firstName;
   }

   public String getLastName() {
      return this.lastName;
   }

   public String getEmail() {
      return this.email;
   }

   public String getUsername() {
      return this.username;
   }

   public String getStatus() {
      return this.status;
   }

   public String getDeviceStatus() {
      return this.deviceStatus;
   }

   public String getDriverId() {
      return this.driverId;
   }

   public String getPassword() {
      return this.password;
   }

   public long getRestartId() {
      return this.restartId;
   }

   public ArrayList getRestartName() {
      return this.restartName;
   }

   public long getRestBreakId() {
      return this.restBreakId;
   }

   public ArrayList getRestBreakName() {
      return this.restBreakName;
   }

   public String getShortHaulException() {
      return this.shortHaulException;
   }

   public String getUnlimitedTrailers() {
      return this.unlimitedTrailers;
   }

   public String getUnlimitedShippingDocs() {
      return this.unlimitedShippingDocs;
   }

   public long getCompanyId() {
      return this.companyId;
   }

   public long getLanguageId() {
      return this.languageId;
   }

   public long getClientId() {
      return this.clientId;
   }

   public ArrayList getClientName() {
      return this.clientName;
   }

   public String getStartTime() {
      return this.startTime;
   }

   public String getAppVersion() {
      return this.appVersion;
   }

   public String getOsVersion() {
      return this.osVersion;
   }

   public String getSimCardNo() {
      return this.simCardNo;
   }

   public long getCycleUsaId() {
      return this.cycleUsaId;
   }

   public ArrayList getCycleUsaName() {
      return this.cycleUsaName;
   }

   public long getCycleCanadaId() {
      return this.cycleCanadaId;
   }

   public ArrayList getCycleCanadaName() {
      return this.cycleCanadaName;
   }

   public long getMainTerminalId() {
      return this.mainTerminalId;
   }

   public ArrayList getMainTerminalName() {
      return this.mainTerminalName;
   }

   public long getMobileNo() {
      return this.mobileNo;
   }

   public String getCdlNo() {
      return this.cdlNo;
   }

   public long getCdlCountryId() {
      return this.cdlCountryId;
   }

   public ArrayList getCountryName() {
      return this.countryName;
   }

   public long getCdlStateId() {
      return this.cdlStateId;
   }

   public ArrayList getStateName() {
      return this.stateName;
   }

   public String getCdlExpiryDate() {
      return this.cdlExpiryDate;
   }

   public long getLCdlExpiryDate() {
      return this.lCdlExpiryDate;
   }

   public String getPdfEmail() {
      return this.pdfEmail;
   }

   public double getFlatRate() {
      return this.flatRate;
   }

   public String getExempt() {
      return this.exempt;
   }

   public String getPersonalUse() {
      return this.personalUse;
   }

   public String getYardMoves() {
      return this.yardMoves;
   }

   public String getDivR() {
      return this.divR;
   }

   public long getCargoTypeId() {
      return this.cargoTypeId;
   }

   public ArrayList getCargoTypeName() {
      return this.cargoTypeName;
   }

   public long getTruckNo() {
      return this.truckNo;
   }

   public ArrayList getVehicleNo() {
      return this.vehicleNo;
   }

   public String getManageEquipement() {
      return this.manageEquipement;
   }

   public String getTransferLog() {
      return this.transferLog;
   }

   public String getRemarks() {
      return this.remarks;
   }

   public String getWorkingStatus() {
      return this.workingStatus;
   }

   public String getOnDutyTime() {
      return this.onDutyTime;
   }

   public String getOnDriveTime() {
      return this.onDriveTime;
   }

   public String getOnSleepTime() {
      return this.onSleepTime;
   }

   public String getWeeklyTime() {
      return this.weeklyTime;
   }

   public String getOnBreak() {
      return this.onBreak;
   }

   public long getAddedTimestamp() {
      return this.addedTimestamp;
   }

   public long getUpdatedTimestamp() {
      return this.updatedTimestamp;
   }

   public String getCurrentLocation() {
      return this.currentLocation;
   }

   public String getTimezoneName() {
      return this.timezoneName;
   }

   public String getTimezoneOffSet() {
      return this.timezoneOffSet;
   }

   @JsonProperty("_id")
   public void set_id(final String _id) {
      this._id = _id;
   }

   @JsonProperty("employeeId")
   public void setEmployeeId(final Integer employeeId) {
      this.employeeId = employeeId;
   }

   @JsonProperty("title")
   public void setTitle(final String title) {
      this.title = title;
   }

   @JsonProperty("firstName")
   public void setFirstName(final String firstName) {
      this.firstName = firstName;
   }

   @JsonProperty("lastName")
   public void setLastName(final String lastName) {
      this.lastName = lastName;
   }

   @JsonProperty("email")
   public void setEmail(final String email) {
      this.email = email;
   }

   @JsonProperty("username")
   public void setUsername(final String username) {
      this.username = username;
   }

   @JsonProperty("status")
   public void setStatus(final String status) {
      this.status = status;
   }

   @JsonProperty("deviceStatus")
   public void setDeviceStatus(final String deviceStatus) {
      this.deviceStatus = deviceStatus;
   }

   @JsonProperty("driverId")
   public void setDriverId(final String driverId) {
      this.driverId = driverId;
   }

   @JsonProperty("password")
   public void setPassword(final String password) {
      this.password = password;
   }

   @JsonProperty("restartId")
   public void setRestartId(final long restartId) {
      this.restartId = restartId;
   }

   @JsonProperty("restartName")
   public void setRestartName(final ArrayList restartName) {
      this.restartName = restartName;
   }

   @JsonProperty("restBreakId")
   public void setRestBreakId(final long restBreakId) {
      this.restBreakId = restBreakId;
   }

   @JsonProperty("restBreakName")
   public void setRestBreakName(final ArrayList restBreakName) {
      this.restBreakName = restBreakName;
   }

   @JsonProperty("shortHaulException")
   public void setShortHaulException(final String shortHaulException) {
      this.shortHaulException = shortHaulException;
   }

   @JsonProperty("unlimitedTrailers")
   public void setUnlimitedTrailers(final String unlimitedTrailers) {
      this.unlimitedTrailers = unlimitedTrailers;
   }

   @JsonProperty("unlimitedShippingDocs")
   public void setUnlimitedShippingDocs(final String unlimitedShippingDocs) {
      this.unlimitedShippingDocs = unlimitedShippingDocs;
   }

   @JsonProperty("companyId")
   public void setCompanyId(final long companyId) {
      this.companyId = companyId;
   }

   @JsonProperty("languageId")
   public void setLanguageId(final long languageId) {
      this.languageId = languageId;
   }

   @JsonProperty("clientId")
   public void setClientId(final long clientId) {
      this.clientId = clientId;
   }

   @JsonProperty("clientName")
   public void setClientName(final ArrayList clientName) {
      this.clientName = clientName;
   }

   @JsonProperty("startTime")
   public void setStartTime(final String startTime) {
      this.startTime = startTime;
   }

   @JsonProperty("appVersion")
   public void setAppVersion(final String appVersion) {
      this.appVersion = appVersion;
   }

   @JsonProperty("osVersion")
   public void setOsVersion(final String osVersion) {
      this.osVersion = osVersion;
   }

   @JsonProperty("simCardNo")
   public void setSimCardNo(final String simCardNo) {
      this.simCardNo = simCardNo;
   }

   @JsonProperty("cycleUsaId")
   public void setCycleUsaId(final long cycleUsaId) {
      this.cycleUsaId = cycleUsaId;
   }

   @JsonProperty("cycleUsaName")
   public void setCycleUsaName(final ArrayList cycleUsaName) {
      this.cycleUsaName = cycleUsaName;
   }

   @JsonProperty("cycleCanadaId")
   public void setCycleCanadaId(final long cycleCanadaId) {
      this.cycleCanadaId = cycleCanadaId;
   }

   @JsonProperty("cycleCanadaName")
   public void setCycleCanadaName(final ArrayList cycleCanadaName) {
      this.cycleCanadaName = cycleCanadaName;
   }

   @JsonProperty("mainTerminalId")
   public void setMainTerminalId(final long mainTerminalId) {
      this.mainTerminalId = mainTerminalId;
   }

   @JsonProperty("mainTerminalName")
   public void setMainTerminalName(final ArrayList mainTerminalName) {
      this.mainTerminalName = mainTerminalName;
   }

   @JsonProperty("mobileNo")
   public void setMobileNo(final long mobileNo) {
      this.mobileNo = mobileNo;
   }

   @JsonProperty("cdlNo")
   public void setCdlNo(final String cdlNo) {
      this.cdlNo = cdlNo;
   }

   @JsonProperty("cdlCountryId")
   public void setCdlCountryId(final long cdlCountryId) {
      this.cdlCountryId = cdlCountryId;
   }

   @JsonProperty("countryName")
   public void setCountryName(final ArrayList countryName) {
      this.countryName = countryName;
   }

   @JsonProperty("cdlStateId")
   public void setCdlStateId(final long cdlStateId) {
      this.cdlStateId = cdlStateId;
   }

   @JsonProperty("stateName")
   public void setStateName(final ArrayList stateName) {
      this.stateName = stateName;
   }

   @JsonProperty("cdlExpiryDate")
   public void setCdlExpiryDate(final String cdlExpiryDate) {
      this.cdlExpiryDate = cdlExpiryDate;
   }

   @JsonProperty("lCdlExpiryDate")
   public void setLCdlExpiryDate(final long lCdlExpiryDate) {
      this.lCdlExpiryDate = lCdlExpiryDate;
   }

   @JsonProperty("pdfEmail")
   public void setPdfEmail(final String pdfEmail) {
      this.pdfEmail = pdfEmail;
   }

   @JsonProperty("flatRate")
   public void setFlatRate(final double flatRate) {
      this.flatRate = flatRate;
   }

   @JsonProperty("exempt")
   public void setExempt(final String exempt) {
      this.exempt = exempt;
   }

   @JsonProperty("personalUse")
   public void setPersonalUse(final String personalUse) {
      this.personalUse = personalUse;
   }

   @JsonProperty("yardMoves")
   public void setYardMoves(final String yardMoves) {
      this.yardMoves = yardMoves;
   }

   @JsonProperty("divR")
   public void setDivR(final String divR) {
      this.divR = divR;
   }

   @JsonProperty("cargoTypeId")
   public void setCargoTypeId(final long cargoTypeId) {
      this.cargoTypeId = cargoTypeId;
   }

   @JsonProperty("cargoTypeName")
   public void setCargoTypeName(final ArrayList cargoTypeName) {
      this.cargoTypeName = cargoTypeName;
   }

   @JsonProperty("truckNo")
   public void setTruckNo(final long truckNo) {
      this.truckNo = truckNo;
   }

   @JsonProperty("vehicleNo")
   public void setVehicleNo(final ArrayList vehicleNo) {
      this.vehicleNo = vehicleNo;
   }

   @JsonProperty("manageEquipement")
   public void setManageEquipement(final String manageEquipement) {
      this.manageEquipement = manageEquipement;
   }

   @JsonProperty("transferLog")
   public void setTransferLog(final String transferLog) {
      this.transferLog = transferLog;
   }

   @JsonProperty("remarks")
   public void setRemarks(final String remarks) {
      this.remarks = remarks;
   }

   @JsonProperty("workingStatus")
   public void setWorkingStatus(final String workingStatus) {
      this.workingStatus = workingStatus;
   }

   @JsonProperty("onDutyTime")
   public void setOnDutyTime(final String onDutyTime) {
      this.onDutyTime = onDutyTime;
   }

   @JsonProperty("onDriveTime")
   public void setOnDriveTime(final String onDriveTime) {
      this.onDriveTime = onDriveTime;
   }

   @JsonProperty("onSleepTime")
   public void setOnSleepTime(final String onSleepTime) {
      this.onSleepTime = onSleepTime;
   }

   @JsonProperty("weeklyTime")
   public void setWeeklyTime(final String weeklyTime) {
      this.weeklyTime = weeklyTime;
   }

   @JsonProperty("onBreak")
   public void setOnBreak(final String onBreak) {
      this.onBreak = onBreak;
   }

   @JsonProperty("addedTimestamp")
   public void setAddedTimestamp(final long addedTimestamp) {
      this.addedTimestamp = addedTimestamp;
   }

   @JsonProperty("updatedTimestamp")
   public void setUpdatedTimestamp(final long updatedTimestamp) {
      this.updatedTimestamp = updatedTimestamp;
   }

   @JsonProperty("currentLocation")
   public void setCurrentLocation(final String currentLocation) {
      this.currentLocation = currentLocation;
   }

   @JsonProperty("timezoneName")
   public void setTimezoneName(final String timezoneName) {
      this.timezoneName = timezoneName;
   }

   @JsonProperty("timezoneOffSet")
   public void setTimezoneOffSet(final String timezoneOffSet) {
      this.timezoneOffSet = timezoneOffSet;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof EmployeeMasterViewDto)) {
         return false;
      } else {
         EmployeeMasterViewDto other = (EmployeeMasterViewDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getRestartId() != other.getRestartId()) {
            return false;
         } else if (this.getRestBreakId() != other.getRestBreakId()) {
            return false;
         } else if (this.getCompanyId() != other.getCompanyId()) {
            return false;
         } else if (this.getLanguageId() != other.getLanguageId()) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else if (this.getCycleUsaId() != other.getCycleUsaId()) {
            return false;
         } else if (this.getCycleCanadaId() != other.getCycleCanadaId()) {
            return false;
         } else if (this.getMainTerminalId() != other.getMainTerminalId()) {
            return false;
         } else if (this.getMobileNo() != other.getMobileNo()) {
            return false;
         } else if (this.getCdlCountryId() != other.getCdlCountryId()) {
            return false;
         } else if (this.getCdlStateId() != other.getCdlStateId()) {
            return false;
         } else if (this.getLCdlExpiryDate() != other.getLCdlExpiryDate()) {
            return false;
         } else if (Double.compare(this.getFlatRate(), other.getFlatRate()) != 0) {
            return false;
         } else if (this.getCargoTypeId() != other.getCargoTypeId()) {
            return false;
         } else if (this.getTruckNo() != other.getTruckNo()) {
            return false;
         } else if (this.getAddedTimestamp() != other.getAddedTimestamp()) {
            return false;
         } else if (this.getUpdatedTimestamp() != other.getUpdatedTimestamp()) {
            return false;
         } else {
            Object this$employeeId = this.getEmployeeId();
            Object other$employeeId = other.getEmployeeId();
            if (this$employeeId == null ? other$employeeId == null : this$employeeId.equals(other$employeeId)) {
               Object this$_id = this.get_id();
               Object other$_id = other.get_id();
               if (this$_id == null ? other$_id == null : this$_id.equals(other$_id)) {
                  Object this$title = this.getTitle();
                  Object other$title = other.getTitle();
                  if (this$title == null ? other$title == null : this$title.equals(other$title)) {
                     Object this$firstName = this.getFirstName();
                     Object other$firstName = other.getFirstName();
                     if (this$firstName == null ? other$firstName == null : this$firstName.equals(other$firstName)) {
                        Object this$lastName = this.getLastName();
                        Object other$lastName = other.getLastName();
                        if (this$lastName == null ? other$lastName == null : this$lastName.equals(other$lastName)) {
                           Object this$email = this.getEmail();
                           Object other$email = other.getEmail();
                           if (this$email == null ? other$email == null : this$email.equals(other$email)) {
                              Object this$username = this.getUsername();
                              Object other$username = other.getUsername();
                              if (this$username == null ? other$username == null : this$username.equals(other$username)) {
                                 Object this$status = this.getStatus();
                                 Object other$status = other.getStatus();
                                 if (this$status == null ? other$status == null : this$status.equals(other$status)) {
                                    Object this$deviceStatus = this.getDeviceStatus();
                                    Object other$deviceStatus = other.getDeviceStatus();
                                    if (this$deviceStatus == null ? other$deviceStatus == null : this$deviceStatus.equals(other$deviceStatus)) {
                                       Object this$driverId = this.getDriverId();
                                       Object other$driverId = other.getDriverId();
                                       if (this$driverId == null ? other$driverId == null : this$driverId.equals(other$driverId)) {
                                          Object this$password = this.getPassword();
                                          Object other$password = other.getPassword();
                                          if (this$password == null ? other$password == null : this$password.equals(other$password)) {
                                             Object this$restartName = this.getRestartName();
                                             Object other$restartName = other.getRestartName();
                                             if (this$restartName == null ? other$restartName == null : this$restartName.equals(other$restartName)) {
                                                Object this$restBreakName = this.getRestBreakName();
                                                Object other$restBreakName = other.getRestBreakName();
                                                if (this$restBreakName == null ? other$restBreakName == null : this$restBreakName.equals(other$restBreakName)) {
                                                   Object this$shortHaulException = this.getShortHaulException();
                                                   Object other$shortHaulException = other.getShortHaulException();
                                                   if (this$shortHaulException == null
                                                      ? other$shortHaulException == null
                                                      : this$shortHaulException.equals(other$shortHaulException)) {
                                                      Object this$unlimitedTrailers = this.getUnlimitedTrailers();
                                                      Object other$unlimitedTrailers = other.getUnlimitedTrailers();
                                                      if (this$unlimitedTrailers == null
                                                         ? other$unlimitedTrailers == null
                                                         : this$unlimitedTrailers.equals(other$unlimitedTrailers)) {
                                                         Object this$unlimitedShippingDocs = this.getUnlimitedShippingDocs();
                                                         Object other$unlimitedShippingDocs = other.getUnlimitedShippingDocs();
                                                         if (this$unlimitedShippingDocs == null
                                                            ? other$unlimitedShippingDocs == null
                                                            : this$unlimitedShippingDocs.equals(other$unlimitedShippingDocs)) {
                                                            Object this$clientName = this.getClientName();
                                                            Object other$clientName = other.getClientName();
                                                            if (this$clientName == null ? other$clientName == null : this$clientName.equals(other$clientName)) {
                                                               Object this$startTime = this.getStartTime();
                                                               Object other$startTime = other.getStartTime();
                                                               if (this$startTime == null ? other$startTime == null : this$startTime.equals(other$startTime)) {
                                                                  Object this$appVersion = this.getAppVersion();
                                                                  Object other$appVersion = other.getAppVersion();
                                                                  if (this$appVersion == null
                                                                     ? other$appVersion == null
                                                                     : this$appVersion.equals(other$appVersion)) {
                                                                     Object this$osVersion = this.getOsVersion();
                                                                     Object other$osVersion = other.getOsVersion();
                                                                     if (this$osVersion == null
                                                                        ? other$osVersion == null
                                                                        : this$osVersion.equals(other$osVersion)) {
                                                                        Object this$simCardNo = this.getSimCardNo();
                                                                        Object other$simCardNo = other.getSimCardNo();
                                                                        if (this$simCardNo == null
                                                                           ? other$simCardNo == null
                                                                           : this$simCardNo.equals(other$simCardNo)) {
                                                                           Object this$cycleUsaName = this.getCycleUsaName();
                                                                           Object other$cycleUsaName = other.getCycleUsaName();
                                                                           if (this$cycleUsaName == null
                                                                              ? other$cycleUsaName == null
                                                                              : this$cycleUsaName.equals(other$cycleUsaName)) {
                                                                              Object this$cycleCanadaName = this.getCycleCanadaName();
                                                                              Object other$cycleCanadaName = other.getCycleCanadaName();
                                                                              if (this$cycleCanadaName == null
                                                                                 ? other$cycleCanadaName == null
                                                                                 : this$cycleCanadaName.equals(other$cycleCanadaName)) {
                                                                                 Object this$mainTerminalName = this.getMainTerminalName();
                                                                                 Object other$mainTerminalName = other.getMainTerminalName();
                                                                                 if (this$mainTerminalName == null
                                                                                    ? other$mainTerminalName == null
                                                                                    : this$mainTerminalName.equals(other$mainTerminalName)) {
                                                                                    Object this$cdlNo = this.getCdlNo();
                                                                                    Object other$cdlNo = other.getCdlNo();
                                                                                    if (this$cdlNo == null
                                                                                       ? other$cdlNo == null
                                                                                       : this$cdlNo.equals(other$cdlNo)) {
                                                                                       Object this$countryName = this.getCountryName();
                                                                                       Object other$countryName = other.getCountryName();
                                                                                       if (this$countryName == null
                                                                                          ? other$countryName == null
                                                                                          : this$countryName.equals(other$countryName)) {
                                                                                          Object this$stateName = this.getStateName();
                                                                                          Object other$stateName = other.getStateName();
                                                                                          if (this$stateName == null
                                                                                             ? other$stateName == null
                                                                                             : this$stateName.equals(other$stateName)) {
                                                                                             Object this$cdlExpiryDate = this.getCdlExpiryDate();
                                                                                             Object other$cdlExpiryDate = other.getCdlExpiryDate();
                                                                                             if (this$cdlExpiryDate == null
                                                                                                ? other$cdlExpiryDate == null
                                                                                                : this$cdlExpiryDate.equals(other$cdlExpiryDate)) {
                                                                                                Object this$pdfEmail = this.getPdfEmail();
                                                                                                Object other$pdfEmail = other.getPdfEmail();
                                                                                                if (this$pdfEmail == null
                                                                                                   ? other$pdfEmail == null
                                                                                                   : this$pdfEmail.equals(other$pdfEmail)) {
                                                                                                   Object this$exempt = this.getExempt();
                                                                                                   Object other$exempt = other.getExempt();
                                                                                                   if (this$exempt == null
                                                                                                      ? other$exempt == null
                                                                                                      : this$exempt.equals(other$exempt)) {
                                                                                                      Object this$personalUse = this.getPersonalUse();
                                                                                                      Object other$personalUse = other.getPersonalUse();
                                                                                                      if (this$personalUse == null
                                                                                                         ? other$personalUse == null
                                                                                                         : this$personalUse.equals(other$personalUse)) {
                                                                                                         Object this$yardMoves = this.getYardMoves();
                                                                                                         Object other$yardMoves = other.getYardMoves();
                                                                                                         if (this$yardMoves == null
                                                                                                            ? other$yardMoves == null
                                                                                                            : this$yardMoves.equals(other$yardMoves)) {
                                                                                                            Object this$divR = this.getDivR();
                                                                                                            Object other$divR = other.getDivR();
                                                                                                            if (this$divR == null
                                                                                                               ? other$divR == null
                                                                                                               : this$divR.equals(other$divR)) {
                                                                                                               Object this$cargoTypeName = this.getCargoTypeName(
                                                                                                                  
                                                                                                               );
                                                                                                               Object other$cargoTypeName = other.getCargoTypeName(
                                                                                                                  
                                                                                                               );
                                                                                                               if (this$cargoTypeName == null
                                                                                                                  ? other$cargoTypeName == null
                                                                                                                  : this$cargoTypeName.equals(
                                                                                                                     other$cargoTypeName
                                                                                                                  )) {
                                                                                                                  Object this$vehicleNo = this.getVehicleNo();
                                                                                                                  Object other$vehicleNo = other.getVehicleNo();
                                                                                                                  if (this$vehicleNo == null
                                                                                                                     ? other$vehicleNo == null
                                                                                                                     : this$vehicleNo.equals(other$vehicleNo)) {
                                                                                                                     Object this$manageEquipement = this.getManageEquipement(
                                                                                                                        
                                                                                                                     );
                                                                                                                     Object other$manageEquipement = other.getManageEquipement(
                                                                                                                        
                                                                                                                     );
                                                                                                                     if (this$manageEquipement == null
                                                                                                                        ? other$manageEquipement == null
                                                                                                                        : this$manageEquipement.equals(
                                                                                                                           other$manageEquipement
                                                                                                                        )) {
                                                                                                                        Object this$transferLog = this.getTransferLog(
                                                                                                                           
                                                                                                                        );
                                                                                                                        Object other$transferLog = other.getTransferLog(
                                                                                                                           
                                                                                                                        );
                                                                                                                        if (this$transferLog == null
                                                                                                                           ? other$transferLog == null
                                                                                                                           : this$transferLog.equals(
                                                                                                                              other$transferLog
                                                                                                                           )) {
                                                                                                                           Object this$remarks = this.getRemarks(
                                                                                                                              
                                                                                                                           );
                                                                                                                           Object other$remarks = other.getRemarks(
                                                                                                                              
                                                                                                                           );
                                                                                                                           if (this$remarks == null
                                                                                                                              ? other$remarks == null
                                                                                                                              : this$remarks.equals(
                                                                                                                                 other$remarks
                                                                                                                              )) {
                                                                                                                              Object this$workingStatus = this.getWorkingStatus(
                                                                                                                                 
                                                                                                                              );
                                                                                                                              Object other$workingStatus = other.getWorkingStatus(
                                                                                                                                 
                                                                                                                              );
                                                                                                                              if (this$workingStatus == null
                                                                                                                                 ? other$workingStatus == null
                                                                                                                                 : this$workingStatus.equals(
                                                                                                                                    other$workingStatus
                                                                                                                                 )) {
                                                                                                                                 Object this$onDutyTime = this.getOnDutyTime(
                                                                                                                                    
                                                                                                                                 );
                                                                                                                                 Object other$onDutyTime = other.getOnDutyTime(
                                                                                                                                    
                                                                                                                                 );
                                                                                                                                 if (this$onDutyTime == null
                                                                                                                                    ? other$onDutyTime == null
                                                                                                                                    : this$onDutyTime.equals(
                                                                                                                                       other$onDutyTime
                                                                                                                                    )) {
                                                                                                                                    Object this$onDriveTime = this.getOnDriveTime(
                                                                                                                                       
                                                                                                                                    );
                                                                                                                                    Object other$onDriveTime = other.getOnDriveTime(
                                                                                                                                       
                                                                                                                                    );
                                                                                                                                    if (this$onDriveTime
                                                                                                                                          == null
                                                                                                                                       ? other$onDriveTime
                                                                                                                                          == null
                                                                                                                                       : this$onDriveTime.equals(
                                                                                                                                          other$onDriveTime
                                                                                                                                       )) {
                                                                                                                                       Object this$onSleepTime = this.getOnSleepTime(
                                                                                                                                          
                                                                                                                                       );
                                                                                                                                       Object other$onSleepTime = other.getOnSleepTime(
                                                                                                                                          
                                                                                                                                       );
                                                                                                                                       if (this$onSleepTime
                                                                                                                                             == null
                                                                                                                                          ? other$onSleepTime
                                                                                                                                             == null
                                                                                                                                          : this$onSleepTime.equals(
                                                                                                                                             other$onSleepTime
                                                                                                                                          )) {
                                                                                                                                          Object this$weeklyTime = this.getWeeklyTime(
                                                                                                                                             
                                                                                                                                          );
                                                                                                                                          Object other$weeklyTime = other.getWeeklyTime(
                                                                                                                                             
                                                                                                                                          );
                                                                                                                                          if (this$weeklyTime
                                                                                                                                                == null
                                                                                                                                             ? other$weeklyTime
                                                                                                                                                == null
                                                                                                                                             : this$weeklyTime.equals(
                                                                                                                                                other$weeklyTime
                                                                                                                                             )) {
                                                                                                                                             Object this$onBreak = this.getOnBreak(
                                                                                                                                                
                                                                                                                                             );
                                                                                                                                             Object other$onBreak = other.getOnBreak(
                                                                                                                                                
                                                                                                                                             );
                                                                                                                                             if (this$onBreak
                                                                                                                                                   == null
                                                                                                                                                ? other$onBreak
                                                                                                                                                   == null
                                                                                                                                                : this$onBreak.equals(
                                                                                                                                                   other$onBreak
                                                                                                                                                )) {
                                                                                                                                                Object this$currentLocation = this.getCurrentLocation(
                                                                                                                                                   
                                                                                                                                                );
                                                                                                                                                Object other$currentLocation = other.getCurrentLocation(
                                                                                                                                                   
                                                                                                                                                );
                                                                                                                                                if (this$currentLocation
                                                                                                                                                      == null
                                                                                                                                                   ? other$currentLocation
                                                                                                                                                      == null
                                                                                                                                                   : this$currentLocation.equals(
                                                                                                                                                      other$currentLocation
                                                                                                                                                   )) {
                                                                                                                                                   Object this$timezoneName = this.getTimezoneName(
                                                                                                                                                      
                                                                                                                                                   );
                                                                                                                                                   Object other$timezoneName = other.getTimezoneName(
                                                                                                                                                      
                                                                                                                                                   );
                                                                                                                                                   if (this$timezoneName
                                                                                                                                                         == null
                                                                                                                                                      ? other$timezoneName
                                                                                                                                                         == null
                                                                                                                                                      : this$timezoneName.equals(
                                                                                                                                                         other$timezoneName
                                                                                                                                                      )) {
                                                                                                                                                      Object this$timezoneOffSet = this.getTimezoneOffSet(
                                                                                                                                                         
                                                                                                                                                      );
                                                                                                                                                      Object other$timezoneOffSet = other.getTimezoneOffSet(
                                                                                                                                                         
                                                                                                                                                      );
                                                                                                                                                      return this$timezoneOffSet
                                                                                                                                                            == null
                                                                                                                                                         ? other$timezoneOffSet
                                                                                                                                                            == null
                                                                                                                                                         : this$timezoneOffSet.equals(
                                                                                                                                                            other$timezoneOffSet
                                                                                                                                                         );
                                                                                                                                                   } else {
                                                                                                                                                      return false;
                                                                                                                                                   }
                                                                                                                                                } else {
                                                                                                                                                   return false;
                                                                                                                                                }
                                                                                                                                             } else {
                                                                                                                                                return false;
                                                                                                                                             }
                                                                                                                                          } else {
                                                                                                                                             return false;
                                                                                                                                          }
                                                                                                                                       } else {
                                                                                                                                          return false;
                                                                                                                                       }
                                                                                                                                    } else {
                                                                                                                                       return false;
                                                                                                                                    }
                                                                                                                                 } else {
                                                                                                                                    return false;
                                                                                                                                 }
                                                                                                                              } else {
                                                                                                                                 return false;
                                                                                                                              }
                                                                                                                           } else {
                                                                                                                              return false;
                                                                                                                           }
                                                                                                                        } else {
                                                                                                                           return false;
                                                                                                                        }
                                                                                                                     } else {
                                                                                                                        return false;
                                                                                                                     }
                                                                                                                  } else {
                                                                                                                     return false;
                                                                                                                  }
                                                                                                               } else {
                                                                                                                  return false;
                                                                                                               }
                                                                                                            } else {
                                                                                                               return false;
                                                                                                            }
                                                                                                         } else {
                                                                                                            return false;
                                                                                                         }
                                                                                                      } else {
                                                                                                         return false;
                                                                                                      }
                                                                                                   } else {
                                                                                                      return false;
                                                                                                   }
                                                                                                } else {
                                                                                                   return false;
                                                                                                }
                                                                                             } else {
                                                                                                return false;
                                                                                             }
                                                                                          } else {
                                                                                             return false;
                                                                                          }
                                                                                       } else {
                                                                                          return false;
                                                                                       }
                                                                                    } else {
                                                                                       return false;
                                                                                    }
                                                                                 } else {
                                                                                    return false;
                                                                                 }
                                                                              } else {
                                                                                 return false;
                                                                              }
                                                                           } else {
                                                                              return false;
                                                                           }
                                                                        } else {
                                                                           return false;
                                                                        }
                                                                     } else {
                                                                        return false;
                                                                     }
                                                                  } else {
                                                                     return false;
                                                                  }
                                                               } else {
                                                                  return false;
                                                               }
                                                            } else {
                                                               return false;
                                                            }
                                                         } else {
                                                            return false;
                                                         }
                                                      } else {
                                                         return false;
                                                      }
                                                   } else {
                                                      return false;
                                                   }
                                                } else {
                                                   return false;
                                                }
                                             } else {
                                                return false;
                                             }
                                          } else {
                                             return false;
                                          }
                                       } else {
                                          return false;
                                       }
                                    } else {
                                       return false;
                                    }
                                 } else {
                                    return false;
                                 }
                              } else {
                                 return false;
                              }
                           } else {
                              return false;
                           }
                        } else {
                           return false;
                        }
                     } else {
                        return false;
                     }
                  } else {
                     return false;
                  }
               } else {
                  return false;
               }
            } else {
               return false;
            }
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof EmployeeMasterViewDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $restartId = this.getRestartId();
      result = result * 59 + (int)($restartId >>> 32 ^ $restartId);
      long $restBreakId = this.getRestBreakId();
      result = result * 59 + (int)($restBreakId >>> 32 ^ $restBreakId);
      long $companyId = this.getCompanyId();
      result = result * 59 + (int)($companyId >>> 32 ^ $companyId);
      long $languageId = this.getLanguageId();
      result = result * 59 + (int)($languageId >>> 32 ^ $languageId);
      long $clientId = this.getClientId();
      result = result * 59 + (int)($clientId >>> 32 ^ $clientId);
      long $cycleUsaId = this.getCycleUsaId();
      result = result * 59 + (int)($cycleUsaId >>> 32 ^ $cycleUsaId);
      long $cycleCanadaId = this.getCycleCanadaId();
      result = result * 59 + (int)($cycleCanadaId >>> 32 ^ $cycleCanadaId);
      long $mainTerminalId = this.getMainTerminalId();
      result = result * 59 + (int)($mainTerminalId >>> 32 ^ $mainTerminalId);
      long $mobileNo = this.getMobileNo();
      result = result * 59 + (int)($mobileNo >>> 32 ^ $mobileNo);
      long $cdlCountryId = this.getCdlCountryId();
      result = result * 59 + (int)($cdlCountryId >>> 32 ^ $cdlCountryId);
      long $cdlStateId = this.getCdlStateId();
      result = result * 59 + (int)($cdlStateId >>> 32 ^ $cdlStateId);
      long $lCdlExpiryDate = this.getLCdlExpiryDate();
      result = result * 59 + (int)($lCdlExpiryDate >>> 32 ^ $lCdlExpiryDate);
      long $flatRate = Double.doubleToLongBits(this.getFlatRate());
      result = result * 59 + (int)($flatRate >>> 32 ^ $flatRate);
      long $cargoTypeId = this.getCargoTypeId();
      result = result * 59 + (int)($cargoTypeId >>> 32 ^ $cargoTypeId);
      long $truckNo = this.getTruckNo();
      result = result * 59 + (int)($truckNo >>> 32 ^ $truckNo);
      long $addedTimestamp = this.getAddedTimestamp();
      result = result * 59 + (int)($addedTimestamp >>> 32 ^ $addedTimestamp);
      long $updatedTimestamp = this.getUpdatedTimestamp();
      result = result * 59 + (int)($updatedTimestamp >>> 32 ^ $updatedTimestamp);
      Object $employeeId = this.getEmployeeId();
      result = result * 59 + ($employeeId == null ? 43 : $employeeId.hashCode());
      Object $_id = this.get_id();
      result = result * 59 + ($_id == null ? 43 : $_id.hashCode());
      Object $title = this.getTitle();
      result = result * 59 + ($title == null ? 43 : $title.hashCode());
      Object $firstName = this.getFirstName();
      result = result * 59 + ($firstName == null ? 43 : $firstName.hashCode());
      Object $lastName = this.getLastName();
      result = result * 59 + ($lastName == null ? 43 : $lastName.hashCode());
      Object $email = this.getEmail();
      result = result * 59 + ($email == null ? 43 : $email.hashCode());
      Object $username = this.getUsername();
      result = result * 59 + ($username == null ? 43 : $username.hashCode());
      Object $status = this.getStatus();
      result = result * 59 + ($status == null ? 43 : $status.hashCode());
      Object $deviceStatus = this.getDeviceStatus();
      result = result * 59 + ($deviceStatus == null ? 43 : $deviceStatus.hashCode());
      Object $driverId = this.getDriverId();
      result = result * 59 + ($driverId == null ? 43 : $driverId.hashCode());
      Object $password = this.getPassword();
      result = result * 59 + ($password == null ? 43 : $password.hashCode());
      Object $restartName = this.getRestartName();
      result = result * 59 + ($restartName == null ? 43 : $restartName.hashCode());
      Object $restBreakName = this.getRestBreakName();
      result = result * 59 + ($restBreakName == null ? 43 : $restBreakName.hashCode());
      Object $shortHaulException = this.getShortHaulException();
      result = result * 59 + ($shortHaulException == null ? 43 : $shortHaulException.hashCode());
      Object $unlimitedTrailers = this.getUnlimitedTrailers();
      result = result * 59 + ($unlimitedTrailers == null ? 43 : $unlimitedTrailers.hashCode());
      Object $unlimitedShippingDocs = this.getUnlimitedShippingDocs();
      result = result * 59 + ($unlimitedShippingDocs == null ? 43 : $unlimitedShippingDocs.hashCode());
      Object $clientName = this.getClientName();
      result = result * 59 + ($clientName == null ? 43 : $clientName.hashCode());
      Object $startTime = this.getStartTime();
      result = result * 59 + ($startTime == null ? 43 : $startTime.hashCode());
      Object $appVersion = this.getAppVersion();
      result = result * 59 + ($appVersion == null ? 43 : $appVersion.hashCode());
      Object $osVersion = this.getOsVersion();
      result = result * 59 + ($osVersion == null ? 43 : $osVersion.hashCode());
      Object $simCardNo = this.getSimCardNo();
      result = result * 59 + ($simCardNo == null ? 43 : $simCardNo.hashCode());
      Object $cycleUsaName = this.getCycleUsaName();
      result = result * 59 + ($cycleUsaName == null ? 43 : $cycleUsaName.hashCode());
      Object $cycleCanadaName = this.getCycleCanadaName();
      result = result * 59 + ($cycleCanadaName == null ? 43 : $cycleCanadaName.hashCode());
      Object $mainTerminalName = this.getMainTerminalName();
      result = result * 59 + ($mainTerminalName == null ? 43 : $mainTerminalName.hashCode());
      Object $cdlNo = this.getCdlNo();
      result = result * 59 + ($cdlNo == null ? 43 : $cdlNo.hashCode());
      Object $countryName = this.getCountryName();
      result = result * 59 + ($countryName == null ? 43 : $countryName.hashCode());
      Object $stateName = this.getStateName();
      result = result * 59 + ($stateName == null ? 43 : $stateName.hashCode());
      Object $cdlExpiryDate = this.getCdlExpiryDate();
      result = result * 59 + ($cdlExpiryDate == null ? 43 : $cdlExpiryDate.hashCode());
      Object $pdfEmail = this.getPdfEmail();
      result = result * 59 + ($pdfEmail == null ? 43 : $pdfEmail.hashCode());
      Object $exempt = this.getExempt();
      result = result * 59 + ($exempt == null ? 43 : $exempt.hashCode());
      Object $personalUse = this.getPersonalUse();
      result = result * 59 + ($personalUse == null ? 43 : $personalUse.hashCode());
      Object $yardMoves = this.getYardMoves();
      result = result * 59 + ($yardMoves == null ? 43 : $yardMoves.hashCode());
      Object $divR = this.getDivR();
      result = result * 59 + ($divR == null ? 43 : $divR.hashCode());
      Object $cargoTypeName = this.getCargoTypeName();
      result = result * 59 + ($cargoTypeName == null ? 43 : $cargoTypeName.hashCode());
      Object $vehicleNo = this.getVehicleNo();
      result = result * 59 + ($vehicleNo == null ? 43 : $vehicleNo.hashCode());
      Object $manageEquipement = this.getManageEquipement();
      result = result * 59 + ($manageEquipement == null ? 43 : $manageEquipement.hashCode());
      Object $transferLog = this.getTransferLog();
      result = result * 59 + ($transferLog == null ? 43 : $transferLog.hashCode());
      Object $remarks = this.getRemarks();
      result = result * 59 + ($remarks == null ? 43 : $remarks.hashCode());
      Object $workingStatus = this.getWorkingStatus();
      result = result * 59 + ($workingStatus == null ? 43 : $workingStatus.hashCode());
      Object $onDutyTime = this.getOnDutyTime();
      result = result * 59 + ($onDutyTime == null ? 43 : $onDutyTime.hashCode());
      Object $onDriveTime = this.getOnDriveTime();
      result = result * 59 + ($onDriveTime == null ? 43 : $onDriveTime.hashCode());
      Object $onSleepTime = this.getOnSleepTime();
      result = result * 59 + ($onSleepTime == null ? 43 : $onSleepTime.hashCode());
      Object $weeklyTime = this.getWeeklyTime();
      result = result * 59 + ($weeklyTime == null ? 43 : $weeklyTime.hashCode());
      Object $onBreak = this.getOnBreak();
      result = result * 59 + ($onBreak == null ? 43 : $onBreak.hashCode());
      Object $currentLocation = this.getCurrentLocation();
      result = result * 59 + ($currentLocation == null ? 43 : $currentLocation.hashCode());
      Object $timezoneName = this.getTimezoneName();
      result = result * 59 + ($timezoneName == null ? 43 : $timezoneName.hashCode());
      Object $timezoneOffSet = this.getTimezoneOffSet();
      return result * 59 + ($timezoneOffSet == null ? 43 : $timezoneOffSet.hashCode());
   }

   @Override
   public String toString() {
      return "EmployeeMasterViewDto(_id="
         + this.get_id()
         + ", employeeId="
         + this.getEmployeeId()
         + ", title="
         + this.getTitle()
         + ", firstName="
         + this.getFirstName()
         + ", lastName="
         + this.getLastName()
         + ", email="
         + this.getEmail()
         + ", username="
         + this.getUsername()
         + ", status="
         + this.getStatus()
         + ", deviceStatus="
         + this.getDeviceStatus()
         + ", driverId="
         + this.getDriverId()
         + ", password="
         + this.getPassword()
         + ", restartId="
         + this.getRestartId()
         + ", restartName="
         + this.getRestartName()
         + ", restBreakId="
         + this.getRestBreakId()
         + ", restBreakName="
         + this.getRestBreakName()
         + ", shortHaulException="
         + this.getShortHaulException()
         + ", unlimitedTrailers="
         + this.getUnlimitedTrailers()
         + ", unlimitedShippingDocs="
         + this.getUnlimitedShippingDocs()
         + ", companyId="
         + this.getCompanyId()
         + ", languageId="
         + this.getLanguageId()
         + ", clientId="
         + this.getClientId()
         + ", clientName="
         + this.getClientName()
         + ", startTime="
         + this.getStartTime()
         + ", appVersion="
         + this.getAppVersion()
         + ", osVersion="
         + this.getOsVersion()
         + ", simCardNo="
         + this.getSimCardNo()
         + ", cycleUsaId="
         + this.getCycleUsaId()
         + ", cycleUsaName="
         + this.getCycleUsaName()
         + ", cycleCanadaId="
         + this.getCycleCanadaId()
         + ", cycleCanadaName="
         + this.getCycleCanadaName()
         + ", mainTerminalId="
         + this.getMainTerminalId()
         + ", mainTerminalName="
         + this.getMainTerminalName()
         + ", mobileNo="
         + this.getMobileNo()
         + ", cdlNo="
         + this.getCdlNo()
         + ", cdlCountryId="
         + this.getCdlCountryId()
         + ", countryName="
         + this.getCountryName()
         + ", cdlStateId="
         + this.getCdlStateId()
         + ", stateName="
         + this.getStateName()
         + ", cdlExpiryDate="
         + this.getCdlExpiryDate()
         + ", lCdlExpiryDate="
         + this.getLCdlExpiryDate()
         + ", pdfEmail="
         + this.getPdfEmail()
         + ", flatRate="
         + this.getFlatRate()
         + ", exempt="
         + this.getExempt()
         + ", personalUse="
         + this.getPersonalUse()
         + ", yardMoves="
         + this.getYardMoves()
         + ", divR="
         + this.getDivR()
         + ", cargoTypeId="
         + this.getCargoTypeId()
         + ", cargoTypeName="
         + this.getCargoTypeName()
         + ", truckNo="
         + this.getTruckNo()
         + ", vehicleNo="
         + this.getVehicleNo()
         + ", manageEquipement="
         + this.getManageEquipement()
         + ", transferLog="
         + this.getTransferLog()
         + ", remarks="
         + this.getRemarks()
         + ", workingStatus="
         + this.getWorkingStatus()
         + ", onDutyTime="
         + this.getOnDutyTime()
         + ", onDriveTime="
         + this.getOnDriveTime()
         + ", onSleepTime="
         + this.getOnSleepTime()
         + ", weeklyTime="
         + this.getWeeklyTime()
         + ", onBreak="
         + this.getOnBreak()
         + ", addedTimestamp="
         + this.getAddedTimestamp()
         + ", updatedTimestamp="
         + this.getUpdatedTimestamp()
         + ", currentLocation="
         + this.getCurrentLocation()
         + ", timezoneName="
         + this.getTimezoneName()
         + ", timezoneOffSet="
         + this.getTimezoneOffSet()
         + ")";
   }
}
