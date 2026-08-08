package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

public class DriveringStatusViewDto {
   @JsonProperty("_id")
   private String _id;
   @JsonProperty("certifiedLogId")
   private String certifiedLogId;
   @JsonProperty("statusId")
   private long statusId;
   @JsonProperty("driverId")
   private long driverId;
   @JsonProperty("clientId")
   private long clientId;
   @JsonProperty("companyDriverId")
   private String companyDriverId;
   @JsonProperty("driverName")
   private String driverName;
   @JsonProperty("cdlNo")
   private String cdlNo;
   @JsonProperty("countryName")
   private String countryName;
   @JsonProperty("stateName")
   private String stateName;
   @JsonProperty("exempt")
   private String exempt;
   @JsonProperty("shortHaulException")
   private String shortHaulException;
   @JsonProperty("companyCoDriverId")
   private String companyCoDriverId;
   @JsonProperty("coDriverId")
   private long coDriverId;
   @JsonProperty("coDriverName")
   private String coDriverName;
   @JsonProperty("trailers")
   private ArrayList trailers;
   @JsonProperty("shippingDocs")
   private ArrayList shippingDocs;
   @JsonProperty("certifiedSignature")
   private String certifiedSignature;
   @JsonProperty("certifiedSignatureName")
   private String certifiedSignatureName;
   @JsonProperty("exception")
   private String exception;
   @JsonProperty("email")
   private String email;
   @JsonProperty("mobileNo")
   private long mobileNo;
   @JsonProperty("status")
   private String status;
   @JsonProperty("isSystemGenerated")
   private int isSystemGenerated;
   @JsonProperty("vehicleId")
   private long vehicleId;
   @JsonProperty("truckNo")
   private String truckNo;
   @JsonProperty("vin")
   private String vin;
   @JsonProperty("macAddress")
   private String macAddress;
   @JsonProperty("serialNo")
   private String serialNo;
   @JsonProperty("version")
   private String version;
   @JsonProperty("modelNo")
   private String modelNo;
   @JsonProperty("lattitude")
   private double lattitude;
   @JsonProperty("longitude")
   private double longitude;
   @JsonProperty("dateTime")
   private String dateTime;
   @JsonProperty("lDateTime")
   private long lDateTime;
   @JsonProperty("utcDateTime")
   private long utcDateTime;
   @JsonProperty("fromDate")
   private long fromDate;
   @JsonProperty("toDate")
   private long toDate;
   @JsonProperty("receivedTimestamp")
   private long receivedTimestamp;
   @JsonProperty("updatedTimestamp")
   private long updatedTimestamp;
   @JsonProperty("_class")
   private String _class;
   @JsonProperty("logType")
   private String logType;
   @JsonProperty("appVersion")
   private String appVersion;
   @JsonProperty("osVersion")
   private String osVersion;
   @JsonProperty("simCardNo")
   private String simCardNo;
   @JsonProperty("isVoilation")
   private Integer isVoilation;
   @JsonProperty("voilationHour")
   private Integer voilationHour;
   @JsonProperty("note")
   private String note;
   @JsonProperty("customLocation")
   private String customLocation;
   @JsonProperty("currentLocation")
   private String currentLocation;
   @JsonProperty("engineHour")
   private String engineHour;
   @JsonProperty("startEngineHour")
   private String startEngineHour;
   @JsonProperty("endEngineHour")
   private String endEngineHour;
   @JsonProperty("engineStatus")
   private String engineStatus;
   @JsonProperty("origin")
   private String origin;
   @JsonProperty("odometer")
   private double odometer;
   @JsonProperty("startOdometer")
   private double startOdometer;
   @JsonProperty("endOdometer")
   private double endOdometer;
   @JsonProperty("carrier")
   private String carrier;
   @JsonProperty("mainOffice")
   private String mainOffice;
   @JsonProperty("mainTerminalName")
   private String mainTerminalName;
   @JsonProperty("dotNo")
   private String dotNo;
   @JsonProperty("companyName")
   private String companyName;
   @JsonProperty("cycleUsaName")
   private String cycleUsaName;
   @JsonProperty("eldProvider")
   private String eldProvider;
   @JsonProperty("diagnosticIndicator")
   private String diagnosticIndicator;
   @JsonProperty("malfunctionIndicator")
   private String malfunctionIndicator;
   @JsonProperty("eldRegistrationId")
   private String eldRegistrationId;
   @JsonProperty("eldIdentifier")
   private String eldIdentifier;
   @JsonProperty("periodStartingTime")
   private String periodStartingTime;
   @JsonProperty("timezone")
   private String timezone;
   @JsonProperty("signatureUrl")
   private String signatureUrl;
   @JsonProperty("timezoneName")
   private String timezoneName;
   @JsonProperty("timezoneOffSet")
   private String timezoneOffSet;
   @JsonProperty("remainingWeeklyTime")
   private String remainingWeeklyTime;
   @JsonProperty("remainingDutyTime")
   private String remainingDutyTime;
   @JsonProperty("remainingDriveTime")
   private String remainingDriveTime;
   @JsonProperty("remainingSleepTime")
   private String remainingSleepTime;
   @JsonProperty("shift")
   private int shift;
   @JsonProperty("days")
   private int days;
   @JsonProperty("isSplit")
   private int isSplit;
   @JsonProperty("identifier")
   private int identifier;
   @JsonProperty("isActive")
   private Integer isActive;
   @JsonProperty("localId")
   private String localId;
   @JsonProperty("isVisible")
   private Integer isVisible;
   @JsonProperty("onDutyTime")
   private String onDutyTime;
   @JsonProperty("onDriveTime")
   private String onDriveTime;
   @JsonProperty("onSleepTime")
   private String onSleepTime;
   @JsonProperty("lastOnSleepTime")
   private String lastOnSleepTime;
   @JsonProperty("weeklyTime")
   private String weeklyTime;
   @JsonProperty("onBreak")
   private String onBreak;
   @JsonProperty("unidentifiedLog")
   private String unidentifiedLog;
   @JsonProperty("distance")
   private double distance;
   @JsonProperty("isReportGenerated")
   private int isReportGenerated;
   @JsonProperty("isPreviousLog")
   private int isPreviousLog;

   public String get_id() {
      return this._id;
   }

   public String getCertifiedLogId() {
      return this.certifiedLogId;
   }

   public long getStatusId() {
      return this.statusId;
   }

   public long getDriverId() {
      return this.driverId;
   }

   public long getClientId() {
      return this.clientId;
   }

   public String getCompanyDriverId() {
      return this.companyDriverId;
   }

   public String getDriverName() {
      return this.driverName;
   }

   public String getCdlNo() {
      return this.cdlNo;
   }

   public String getCountryName() {
      return this.countryName;
   }

   public String getStateName() {
      return this.stateName;
   }

   public String getExempt() {
      return this.exempt;
   }

   public String getShortHaulException() {
      return this.shortHaulException;
   }

   public String getCompanyCoDriverId() {
      return this.companyCoDriverId;
   }

   public long getCoDriverId() {
      return this.coDriverId;
   }

   public String getCoDriverName() {
      return this.coDriverName;
   }

   public ArrayList getTrailers() {
      return this.trailers;
   }

   public ArrayList getShippingDocs() {
      return this.shippingDocs;
   }

   public String getCertifiedSignature() {
      return this.certifiedSignature;
   }

   public String getCertifiedSignatureName() {
      return this.certifiedSignatureName;
   }

   public String getException() {
      return this.exception;
   }

   public String getEmail() {
      return this.email;
   }

   public long getMobileNo() {
      return this.mobileNo;
   }

   public String getStatus() {
      return this.status;
   }

   public int getIsSystemGenerated() {
      return this.isSystemGenerated;
   }

   public long getVehicleId() {
      return this.vehicleId;
   }

   public String getTruckNo() {
      return this.truckNo;
   }

   public String getVin() {
      return this.vin;
   }

   public String getMacAddress() {
      return this.macAddress;
   }

   public String getSerialNo() {
      return this.serialNo;
   }

   public String getVersion() {
      return this.version;
   }

   public String getModelNo() {
      return this.modelNo;
   }

   public double getLattitude() {
      return this.lattitude;
   }

   public double getLongitude() {
      return this.longitude;
   }

   public String getDateTime() {
      return this.dateTime;
   }

   public long getLDateTime() {
      return this.lDateTime;
   }

   public long getUtcDateTime() {
      return this.utcDateTime;
   }

   public long getFromDate() {
      return this.fromDate;
   }

   public long getToDate() {
      return this.toDate;
   }

   public long getReceivedTimestamp() {
      return this.receivedTimestamp;
   }

   public long getUpdatedTimestamp() {
      return this.updatedTimestamp;
   }

   public String get_class() {
      return this._class;
   }

   public String getLogType() {
      return this.logType;
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

   public Integer getIsVoilation() {
      return this.isVoilation;
   }

   public Integer getVoilationHour() {
      return this.voilationHour;
   }

   public String getNote() {
      return this.note;
   }

   public String getCustomLocation() {
      return this.customLocation;
   }

   public String getCurrentLocation() {
      return this.currentLocation;
   }

   public String getEngineHour() {
      return this.engineHour;
   }

   public String getStartEngineHour() {
      return this.startEngineHour;
   }

   public String getEndEngineHour() {
      return this.endEngineHour;
   }

   public String getEngineStatus() {
      return this.engineStatus;
   }

   public String getOrigin() {
      return this.origin;
   }

   public double getOdometer() {
      return this.odometer;
   }

   public double getStartOdometer() {
      return this.startOdometer;
   }

   public double getEndOdometer() {
      return this.endOdometer;
   }

   public String getCarrier() {
      return this.carrier;
   }

   public String getMainOffice() {
      return this.mainOffice;
   }

   public String getMainTerminalName() {
      return this.mainTerminalName;
   }

   public String getDotNo() {
      return this.dotNo;
   }

   public String getCompanyName() {
      return this.companyName;
   }

   public String getCycleUsaName() {
      return this.cycleUsaName;
   }

   public String getEldProvider() {
      return this.eldProvider;
   }

   public String getDiagnosticIndicator() {
      return this.diagnosticIndicator;
   }

   public String getMalfunctionIndicator() {
      return this.malfunctionIndicator;
   }

   public String getEldRegistrationId() {
      return this.eldRegistrationId;
   }

   public String getEldIdentifier() {
      return this.eldIdentifier;
   }

   public String getPeriodStartingTime() {
      return this.periodStartingTime;
   }

   public String getTimezone() {
      return this.timezone;
   }

   public String getSignatureUrl() {
      return this.signatureUrl;
   }

   public String getTimezoneName() {
      return this.timezoneName;
   }

   public String getTimezoneOffSet() {
      return this.timezoneOffSet;
   }

   public String getRemainingWeeklyTime() {
      return this.remainingWeeklyTime;
   }

   public String getRemainingDutyTime() {
      return this.remainingDutyTime;
   }

   public String getRemainingDriveTime() {
      return this.remainingDriveTime;
   }

   public String getRemainingSleepTime() {
      return this.remainingSleepTime;
   }

   public int getShift() {
      return this.shift;
   }

   public int getDays() {
      return this.days;
   }

   public int getIsSplit() {
      return this.isSplit;
   }

   public int getIdentifier() {
      return this.identifier;
   }

   public Integer getIsActive() {
      return this.isActive;
   }

   public String getLocalId() {
      return this.localId;
   }

   public Integer getIsVisible() {
      return this.isVisible;
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

   public String getLastOnSleepTime() {
      return this.lastOnSleepTime;
   }

   public String getWeeklyTime() {
      return this.weeklyTime;
   }

   public String getOnBreak() {
      return this.onBreak;
   }

   public String getUnidentifiedLog() {
      return this.unidentifiedLog;
   }

   public double getDistance() {
      return this.distance;
   }

   public int getIsReportGenerated() {
      return this.isReportGenerated;
   }

   public int getIsPreviousLog() {
      return this.isPreviousLog;
   }

   @JsonProperty("_id")
   public void set_id(final String _id) {
      this._id = _id;
   }

   @JsonProperty("certifiedLogId")
   public void setCertifiedLogId(final String certifiedLogId) {
      this.certifiedLogId = certifiedLogId;
   }

   @JsonProperty("statusId")
   public void setStatusId(final long statusId) {
      this.statusId = statusId;
   }

   @JsonProperty("driverId")
   public void setDriverId(final long driverId) {
      this.driverId = driverId;
   }

   @JsonProperty("clientId")
   public void setClientId(final long clientId) {
      this.clientId = clientId;
   }

   @JsonProperty("companyDriverId")
   public void setCompanyDriverId(final String companyDriverId) {
      this.companyDriverId = companyDriverId;
   }

   @JsonProperty("driverName")
   public void setDriverName(final String driverName) {
      this.driverName = driverName;
   }

   @JsonProperty("cdlNo")
   public void setCdlNo(final String cdlNo) {
      this.cdlNo = cdlNo;
   }

   @JsonProperty("countryName")
   public void setCountryName(final String countryName) {
      this.countryName = countryName;
   }

   @JsonProperty("stateName")
   public void setStateName(final String stateName) {
      this.stateName = stateName;
   }

   @JsonProperty("exempt")
   public void setExempt(final String exempt) {
      this.exempt = exempt;
   }

   @JsonProperty("shortHaulException")
   public void setShortHaulException(final String shortHaulException) {
      this.shortHaulException = shortHaulException;
   }

   @JsonProperty("companyCoDriverId")
   public void setCompanyCoDriverId(final String companyCoDriverId) {
      this.companyCoDriverId = companyCoDriverId;
   }

   @JsonProperty("coDriverId")
   public void setCoDriverId(final long coDriverId) {
      this.coDriverId = coDriverId;
   }

   @JsonProperty("coDriverName")
   public void setCoDriverName(final String coDriverName) {
      this.coDriverName = coDriverName;
   }

   @JsonProperty("trailers")
   public void setTrailers(final ArrayList trailers) {
      this.trailers = trailers;
   }

   @JsonProperty("shippingDocs")
   public void setShippingDocs(final ArrayList shippingDocs) {
      this.shippingDocs = shippingDocs;
   }

   @JsonProperty("certifiedSignature")
   public void setCertifiedSignature(final String certifiedSignature) {
      this.certifiedSignature = certifiedSignature;
   }

   @JsonProperty("certifiedSignatureName")
   public void setCertifiedSignatureName(final String certifiedSignatureName) {
      this.certifiedSignatureName = certifiedSignatureName;
   }

   @JsonProperty("exception")
   public void setException(final String exception) {
      this.exception = exception;
   }

   @JsonProperty("email")
   public void setEmail(final String email) {
      this.email = email;
   }

   @JsonProperty("mobileNo")
   public void setMobileNo(final long mobileNo) {
      this.mobileNo = mobileNo;
   }

   @JsonProperty("status")
   public void setStatus(final String status) {
      this.status = status;
   }

   @JsonProperty("isSystemGenerated")
   public void setIsSystemGenerated(final int isSystemGenerated) {
      this.isSystemGenerated = isSystemGenerated;
   }

   @JsonProperty("vehicleId")
   public void setVehicleId(final long vehicleId) {
      this.vehicleId = vehicleId;
   }

   @JsonProperty("truckNo")
   public void setTruckNo(final String truckNo) {
      this.truckNo = truckNo;
   }

   @JsonProperty("vin")
   public void setVin(final String vin) {
      this.vin = vin;
   }

   @JsonProperty("macAddress")
   public void setMacAddress(final String macAddress) {
      this.macAddress = macAddress;
   }

   @JsonProperty("serialNo")
   public void setSerialNo(final String serialNo) {
      this.serialNo = serialNo;
   }

   @JsonProperty("version")
   public void setVersion(final String version) {
      this.version = version;
   }

   @JsonProperty("modelNo")
   public void setModelNo(final String modelNo) {
      this.modelNo = modelNo;
   }

   @JsonProperty("lattitude")
   public void setLattitude(final double lattitude) {
      this.lattitude = lattitude;
   }

   @JsonProperty("longitude")
   public void setLongitude(final double longitude) {
      this.longitude = longitude;
   }

   @JsonProperty("dateTime")
   public void setDateTime(final String dateTime) {
      this.dateTime = dateTime;
   }

   @JsonProperty("lDateTime")
   public void setLDateTime(final long lDateTime) {
      this.lDateTime = lDateTime;
   }

   @JsonProperty("utcDateTime")
   public void setUtcDateTime(final long utcDateTime) {
      this.utcDateTime = utcDateTime;
   }

   @JsonProperty("fromDate")
   public void setFromDate(final long fromDate) {
      this.fromDate = fromDate;
   }

   @JsonProperty("toDate")
   public void setToDate(final long toDate) {
      this.toDate = toDate;
   }

   @JsonProperty("receivedTimestamp")
   public void setReceivedTimestamp(final long receivedTimestamp) {
      this.receivedTimestamp = receivedTimestamp;
   }

   @JsonProperty("updatedTimestamp")
   public void setUpdatedTimestamp(final long updatedTimestamp) {
      this.updatedTimestamp = updatedTimestamp;
   }

   @JsonProperty("_class")
   public void set_class(final String _class) {
      this._class = _class;
   }

   @JsonProperty("logType")
   public void setLogType(final String logType) {
      this.logType = logType;
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

   @JsonProperty("isVoilation")
   public void setIsVoilation(final Integer isVoilation) {
      this.isVoilation = isVoilation;
   }

   @JsonProperty("voilationHour")
   public void setVoilationHour(final Integer voilationHour) {
      this.voilationHour = voilationHour;
   }

   @JsonProperty("note")
   public void setNote(final String note) {
      this.note = note;
   }

   @JsonProperty("customLocation")
   public void setCustomLocation(final String customLocation) {
      this.customLocation = customLocation;
   }

   @JsonProperty("currentLocation")
   public void setCurrentLocation(final String currentLocation) {
      this.currentLocation = currentLocation;
   }

   @JsonProperty("engineHour")
   public void setEngineHour(final String engineHour) {
      this.engineHour = engineHour;
   }

   @JsonProperty("startEngineHour")
   public void setStartEngineHour(final String startEngineHour) {
      this.startEngineHour = startEngineHour;
   }

   @JsonProperty("endEngineHour")
   public void setEndEngineHour(final String endEngineHour) {
      this.endEngineHour = endEngineHour;
   }

   @JsonProperty("engineStatus")
   public void setEngineStatus(final String engineStatus) {
      this.engineStatus = engineStatus;
   }

   @JsonProperty("origin")
   public void setOrigin(final String origin) {
      this.origin = origin;
   }

   @JsonProperty("odometer")
   public void setOdometer(final double odometer) {
      this.odometer = odometer;
   }

   @JsonProperty("startOdometer")
   public void setStartOdometer(final double startOdometer) {
      this.startOdometer = startOdometer;
   }

   @JsonProperty("endOdometer")
   public void setEndOdometer(final double endOdometer) {
      this.endOdometer = endOdometer;
   }

   @JsonProperty("carrier")
   public void setCarrier(final String carrier) {
      this.carrier = carrier;
   }

   @JsonProperty("mainOffice")
   public void setMainOffice(final String mainOffice) {
      this.mainOffice = mainOffice;
   }

   @JsonProperty("mainTerminalName")
   public void setMainTerminalName(final String mainTerminalName) {
      this.mainTerminalName = mainTerminalName;
   }

   @JsonProperty("dotNo")
   public void setDotNo(final String dotNo) {
      this.dotNo = dotNo;
   }

   @JsonProperty("companyName")
   public void setCompanyName(final String companyName) {
      this.companyName = companyName;
   }

   @JsonProperty("cycleUsaName")
   public void setCycleUsaName(final String cycleUsaName) {
      this.cycleUsaName = cycleUsaName;
   }

   @JsonProperty("eldProvider")
   public void setEldProvider(final String eldProvider) {
      this.eldProvider = eldProvider;
   }

   @JsonProperty("diagnosticIndicator")
   public void setDiagnosticIndicator(final String diagnosticIndicator) {
      this.diagnosticIndicator = diagnosticIndicator;
   }

   @JsonProperty("malfunctionIndicator")
   public void setMalfunctionIndicator(final String malfunctionIndicator) {
      this.malfunctionIndicator = malfunctionIndicator;
   }

   @JsonProperty("eldRegistrationId")
   public void setEldRegistrationId(final String eldRegistrationId) {
      this.eldRegistrationId = eldRegistrationId;
   }

   @JsonProperty("eldIdentifier")
   public void setEldIdentifier(final String eldIdentifier) {
      this.eldIdentifier = eldIdentifier;
   }

   @JsonProperty("periodStartingTime")
   public void setPeriodStartingTime(final String periodStartingTime) {
      this.periodStartingTime = periodStartingTime;
   }

   @JsonProperty("timezone")
   public void setTimezone(final String timezone) {
      this.timezone = timezone;
   }

   @JsonProperty("signatureUrl")
   public void setSignatureUrl(final String signatureUrl) {
      this.signatureUrl = signatureUrl;
   }

   @JsonProperty("timezoneName")
   public void setTimezoneName(final String timezoneName) {
      this.timezoneName = timezoneName;
   }

   @JsonProperty("timezoneOffSet")
   public void setTimezoneOffSet(final String timezoneOffSet) {
      this.timezoneOffSet = timezoneOffSet;
   }

   @JsonProperty("remainingWeeklyTime")
   public void setRemainingWeeklyTime(final String remainingWeeklyTime) {
      this.remainingWeeklyTime = remainingWeeklyTime;
   }

   @JsonProperty("remainingDutyTime")
   public void setRemainingDutyTime(final String remainingDutyTime) {
      this.remainingDutyTime = remainingDutyTime;
   }

   @JsonProperty("remainingDriveTime")
   public void setRemainingDriveTime(final String remainingDriveTime) {
      this.remainingDriveTime = remainingDriveTime;
   }

   @JsonProperty("remainingSleepTime")
   public void setRemainingSleepTime(final String remainingSleepTime) {
      this.remainingSleepTime = remainingSleepTime;
   }

   @JsonProperty("shift")
   public void setShift(final int shift) {
      this.shift = shift;
   }

   @JsonProperty("days")
   public void setDays(final int days) {
      this.days = days;
   }

   @JsonProperty("isSplit")
   public void setIsSplit(final int isSplit) {
      this.isSplit = isSplit;
   }

   @JsonProperty("identifier")
   public void setIdentifier(final int identifier) {
      this.identifier = identifier;
   }

   @JsonProperty("isActive")
   public void setIsActive(final Integer isActive) {
      this.isActive = isActive;
   }

   @JsonProperty("localId")
   public void setLocalId(final String localId) {
      this.localId = localId;
   }

   @JsonProperty("isVisible")
   public void setIsVisible(final Integer isVisible) {
      this.isVisible = isVisible;
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

   @JsonProperty("lastOnSleepTime")
   public void setLastOnSleepTime(final String lastOnSleepTime) {
      this.lastOnSleepTime = lastOnSleepTime;
   }

   @JsonProperty("weeklyTime")
   public void setWeeklyTime(final String weeklyTime) {
      this.weeklyTime = weeklyTime;
   }

   @JsonProperty("onBreak")
   public void setOnBreak(final String onBreak) {
      this.onBreak = onBreak;
   }

   @JsonProperty("unidentifiedLog")
   public void setUnidentifiedLog(final String unidentifiedLog) {
      this.unidentifiedLog = unidentifiedLog;
   }

   @JsonProperty("distance")
   public void setDistance(final double distance) {
      this.distance = distance;
   }

   @JsonProperty("isReportGenerated")
   public void setIsReportGenerated(final int isReportGenerated) {
      this.isReportGenerated = isReportGenerated;
   }

   @JsonProperty("isPreviousLog")
   public void setIsPreviousLog(final int isPreviousLog) {
      this.isPreviousLog = isPreviousLog;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof DriveringStatusViewDto)) {
         return false;
      } else {
         DriveringStatusViewDto other = (DriveringStatusViewDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getStatusId() != other.getStatusId()) {
            return false;
         } else if (this.getDriverId() != other.getDriverId()) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else if (this.getCoDriverId() != other.getCoDriverId()) {
            return false;
         } else if (this.getMobileNo() != other.getMobileNo()) {
            return false;
         } else if (this.getIsSystemGenerated() != other.getIsSystemGenerated()) {
            return false;
         } else if (this.getVehicleId() != other.getVehicleId()) {
            return false;
         } else if (Double.compare(this.getLattitude(), other.getLattitude()) != 0) {
            return false;
         } else if (Double.compare(this.getLongitude(), other.getLongitude()) != 0) {
            return false;
         } else if (this.getLDateTime() != other.getLDateTime()) {
            return false;
         } else if (this.getUtcDateTime() != other.getUtcDateTime()) {
            return false;
         } else if (this.getFromDate() != other.getFromDate()) {
            return false;
         } else if (this.getToDate() != other.getToDate()) {
            return false;
         } else if (this.getReceivedTimestamp() != other.getReceivedTimestamp()) {
            return false;
         } else if (this.getUpdatedTimestamp() != other.getUpdatedTimestamp()) {
            return false;
         } else if (Double.compare(this.getOdometer(), other.getOdometer()) != 0) {
            return false;
         } else if (Double.compare(this.getStartOdometer(), other.getStartOdometer()) != 0) {
            return false;
         } else if (Double.compare(this.getEndOdometer(), other.getEndOdometer()) != 0) {
            return false;
         } else if (this.getShift() != other.getShift()) {
            return false;
         } else if (this.getDays() != other.getDays()) {
            return false;
         } else if (this.getIsSplit() != other.getIsSplit()) {
            return false;
         } else if (this.getIdentifier() != other.getIdentifier()) {
            return false;
         } else if (Double.compare(this.getDistance(), other.getDistance()) != 0) {
            return false;
         } else if (this.getIsReportGenerated() != other.getIsReportGenerated()) {
            return false;
         } else if (this.getIsPreviousLog() != other.getIsPreviousLog()) {
            return false;
         } else {
            Object this$isVoilation = this.getIsVoilation();
            Object other$isVoilation = other.getIsVoilation();
            if (this$isVoilation == null ? other$isVoilation == null : this$isVoilation.equals(other$isVoilation)) {
               Object this$voilationHour = this.getVoilationHour();
               Object other$voilationHour = other.getVoilationHour();
               if (this$voilationHour == null ? other$voilationHour == null : this$voilationHour.equals(other$voilationHour)) {
                  Object this$isActive = this.getIsActive();
                  Object other$isActive = other.getIsActive();
                  if (this$isActive == null ? other$isActive == null : this$isActive.equals(other$isActive)) {
                     Object this$isVisible = this.getIsVisible();
                     Object other$isVisible = other.getIsVisible();
                     if (this$isVisible == null ? other$isVisible == null : this$isVisible.equals(other$isVisible)) {
                        Object this$_id = this.get_id();
                        Object other$_id = other.get_id();
                        if (this$_id == null ? other$_id == null : this$_id.equals(other$_id)) {
                           Object this$certifiedLogId = this.getCertifiedLogId();
                           Object other$certifiedLogId = other.getCertifiedLogId();
                           if (this$certifiedLogId == null ? other$certifiedLogId == null : this$certifiedLogId.equals(other$certifiedLogId)) {
                              Object this$companyDriverId = this.getCompanyDriverId();
                              Object other$companyDriverId = other.getCompanyDriverId();
                              if (this$companyDriverId == null ? other$companyDriverId == null : this$companyDriverId.equals(other$companyDriverId)) {
                                 Object this$driverName = this.getDriverName();
                                 Object other$driverName = other.getDriverName();
                                 if (this$driverName == null ? other$driverName == null : this$driverName.equals(other$driverName)) {
                                    Object this$cdlNo = this.getCdlNo();
                                    Object other$cdlNo = other.getCdlNo();
                                    if (this$cdlNo == null ? other$cdlNo == null : this$cdlNo.equals(other$cdlNo)) {
                                       Object this$countryName = this.getCountryName();
                                       Object other$countryName = other.getCountryName();
                                       if (this$countryName == null ? other$countryName == null : this$countryName.equals(other$countryName)) {
                                          Object this$stateName = this.getStateName();
                                          Object other$stateName = other.getStateName();
                                          if (this$stateName == null ? other$stateName == null : this$stateName.equals(other$stateName)) {
                                             Object this$exempt = this.getExempt();
                                             Object other$exempt = other.getExempt();
                                             if (this$exempt == null ? other$exempt == null : this$exempt.equals(other$exempt)) {
                                                Object this$shortHaulException = this.getShortHaulException();
                                                Object other$shortHaulException = other.getShortHaulException();
                                                if (this$shortHaulException == null
                                                   ? other$shortHaulException == null
                                                   : this$shortHaulException.equals(other$shortHaulException)) {
                                                   Object this$companyCoDriverId = this.getCompanyCoDriverId();
                                                   Object other$companyCoDriverId = other.getCompanyCoDriverId();
                                                   if (this$companyCoDriverId == null
                                                      ? other$companyCoDriverId == null
                                                      : this$companyCoDriverId.equals(other$companyCoDriverId)) {
                                                      Object this$coDriverName = this.getCoDriverName();
                                                      Object other$coDriverName = other.getCoDriverName();
                                                      if (this$coDriverName == null
                                                         ? other$coDriverName == null
                                                         : this$coDriverName.equals(other$coDriverName)) {
                                                         Object this$trailers = this.getTrailers();
                                                         Object other$trailers = other.getTrailers();
                                                         if (this$trailers == null ? other$trailers == null : this$trailers.equals(other$trailers)) {
                                                            Object this$shippingDocs = this.getShippingDocs();
                                                            Object other$shippingDocs = other.getShippingDocs();
                                                            if (this$shippingDocs == null
                                                               ? other$shippingDocs == null
                                                               : this$shippingDocs.equals(other$shippingDocs)) {
                                                               Object this$certifiedSignature = this.getCertifiedSignature();
                                                               Object other$certifiedSignature = other.getCertifiedSignature();
                                                               if (this$certifiedSignature == null
                                                                  ? other$certifiedSignature == null
                                                                  : this$certifiedSignature.equals(other$certifiedSignature)) {
                                                                  Object this$certifiedSignatureName = this.getCertifiedSignatureName();
                                                                  Object other$certifiedSignatureName = other.getCertifiedSignatureName();
                                                                  if (this$certifiedSignatureName == null
                                                                     ? other$certifiedSignatureName == null
                                                                     : this$certifiedSignatureName.equals(other$certifiedSignatureName)) {
                                                                     Object this$exception = this.getException();
                                                                     Object other$exception = other.getException();
                                                                     if (this$exception == null
                                                                        ? other$exception == null
                                                                        : this$exception.equals(other$exception)) {
                                                                        Object this$email = this.getEmail();
                                                                        Object other$email = other.getEmail();
                                                                        if (this$email == null ? other$email == null : this$email.equals(other$email)) {
                                                                           Object this$status = this.getStatus();
                                                                           Object other$status = other.getStatus();
                                                                           if (this$status == null ? other$status == null : this$status.equals(other$status)) {
                                                                              Object this$truckNo = this.getTruckNo();
                                                                              Object other$truckNo = other.getTruckNo();
                                                                              if (this$truckNo == null
                                                                                 ? other$truckNo == null
                                                                                 : this$truckNo.equals(other$truckNo)) {
                                                                                 Object this$vin = this.getVin();
                                                                                 Object other$vin = other.getVin();
                                                                                 if (this$vin == null ? other$vin == null : this$vin.equals(other$vin)) {
                                                                                    Object this$macAddress = this.getMacAddress();
                                                                                    Object other$macAddress = other.getMacAddress();
                                                                                    if (this$macAddress == null
                                                                                       ? other$macAddress == null
                                                                                       : this$macAddress.equals(other$macAddress)) {
                                                                                       Object this$serialNo = this.getSerialNo();
                                                                                       Object other$serialNo = other.getSerialNo();
                                                                                       if (this$serialNo == null
                                                                                          ? other$serialNo == null
                                                                                          : this$serialNo.equals(other$serialNo)) {
                                                                                          Object this$version = this.getVersion();
                                                                                          Object other$version = other.getVersion();
                                                                                          if (this$version == null
                                                                                             ? other$version == null
                                                                                             : this$version.equals(other$version)) {
                                                                                             Object this$modelNo = this.getModelNo();
                                                                                             Object other$modelNo = other.getModelNo();
                                                                                             if (this$modelNo == null
                                                                                                ? other$modelNo == null
                                                                                                : this$modelNo.equals(other$modelNo)) {
                                                                                                Object this$dateTime = this.getDateTime();
                                                                                                Object other$dateTime = other.getDateTime();
                                                                                                if (this$dateTime == null
                                                                                                   ? other$dateTime == null
                                                                                                   : this$dateTime.equals(other$dateTime)) {
                                                                                                   Object this$_class = this.get_class();
                                                                                                   Object other$_class = other.get_class();
                                                                                                   if (this$_class == null
                                                                                                      ? other$_class == null
                                                                                                      : this$_class.equals(other$_class)) {
                                                                                                      Object this$logType = this.getLogType();
                                                                                                      Object other$logType = other.getLogType();
                                                                                                      if (this$logType == null
                                                                                                         ? other$logType == null
                                                                                                         : this$logType.equals(other$logType)) {
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
                                                                                                                  Object this$note = this.getNote();
                                                                                                                  Object other$note = other.getNote();
                                                                                                                  if (this$note == null
                                                                                                                     ? other$note == null
                                                                                                                     : this$note.equals(other$note)) {
                                                                                                                     Object this$customLocation = this.getCustomLocation(
                                                                                                                        
                                                                                                                     );
                                                                                                                     Object other$customLocation = other.getCustomLocation(
                                                                                                                        
                                                                                                                     );
                                                                                                                     if (this$customLocation == null
                                                                                                                        ? other$customLocation == null
                                                                                                                        : this$customLocation.equals(
                                                                                                                           other$customLocation
                                                                                                                        )) {
                                                                                                                        Object this$currentLocation = this.getCurrentLocation(
                                                                                                                           
                                                                                                                        );
                                                                                                                        Object other$currentLocation = other.getCurrentLocation(
                                                                                                                           
                                                                                                                        );
                                                                                                                        if (this$currentLocation == null
                                                                                                                           ? other$currentLocation == null
                                                                                                                           : this$currentLocation.equals(
                                                                                                                              other$currentLocation
                                                                                                                           )) {
                                                                                                                           Object this$engineHour = this.getEngineHour(
                                                                                                                              
                                                                                                                           );
                                                                                                                           Object other$engineHour = other.getEngineHour(
                                                                                                                              
                                                                                                                           );
                                                                                                                           if (this$engineHour == null
                                                                                                                              ? other$engineHour == null
                                                                                                                              : this$engineHour.equals(
                                                                                                                                 other$engineHour
                                                                                                                              )) {
                                                                                                                              Object this$startEngineHour = this.getStartEngineHour(
                                                                                                                                 
                                                                                                                              );
                                                                                                                              Object other$startEngineHour = other.getStartEngineHour(
                                                                                                                                 
                                                                                                                              );
                                                                                                                              if (this$startEngineHour == null
                                                                                                                                 ? other$startEngineHour
                                                                                                                                    == null
                                                                                                                                 : this$startEngineHour.equals(
                                                                                                                                    other$startEngineHour
                                                                                                                                 )) {
                                                                                                                                 Object this$endEngineHour = this.getEndEngineHour(
                                                                                                                                    
                                                                                                                                 );
                                                                                                                                 Object other$endEngineHour = other.getEndEngineHour(
                                                                                                                                    
                                                                                                                                 );
                                                                                                                                 if (this$endEngineHour
                                                                                                                                       == null
                                                                                                                                    ? other$endEngineHour
                                                                                                                                       == null
                                                                                                                                    : this$endEngineHour.equals(
                                                                                                                                       other$endEngineHour
                                                                                                                                    )) {
                                                                                                                                    Object this$engineStatus = this.getEngineStatus(
                                                                                                                                       
                                                                                                                                    );
                                                                                                                                    Object other$engineStatus = other.getEngineStatus(
                                                                                                                                       
                                                                                                                                    );
                                                                                                                                    if (this$engineStatus
                                                                                                                                          == null
                                                                                                                                       ? other$engineStatus
                                                                                                                                          == null
                                                                                                                                       : this$engineStatus.equals(
                                                                                                                                          other$engineStatus
                                                                                                                                       )) {
                                                                                                                                       Object this$origin = this.getOrigin(
                                                                                                                                          
                                                                                                                                       );
                                                                                                                                       Object other$origin = other.getOrigin(
                                                                                                                                          
                                                                                                                                       );
                                                                                                                                       if (this$origin == null
                                                                                                                                          ? other$origin
                                                                                                                                             == null
                                                                                                                                          : this$origin.equals(
                                                                                                                                             other$origin
                                                                                                                                          )) {
                                                                                                                                          Object this$carrier = this.getCarrier(
                                                                                                                                             
                                                                                                                                          );
                                                                                                                                          Object other$carrier = other.getCarrier(
                                                                                                                                             
                                                                                                                                          );
                                                                                                                                          if (this$carrier
                                                                                                                                                == null
                                                                                                                                             ? other$carrier
                                                                                                                                                == null
                                                                                                                                             : this$carrier.equals(
                                                                                                                                                other$carrier
                                                                                                                                             )) {
                                                                                                                                             Object this$mainOffice = this.getMainOffice(
                                                                                                                                                
                                                                                                                                             );
                                                                                                                                             Object other$mainOffice = other.getMainOffice(
                                                                                                                                                
                                                                                                                                             );
                                                                                                                                             if (this$mainOffice
                                                                                                                                                   == null
                                                                                                                                                ? other$mainOffice
                                                                                                                                                   == null
                                                                                                                                                : this$mainOffice.equals(
                                                                                                                                                   other$mainOffice
                                                                                                                                                )) {
                                                                                                                                                Object this$mainTerminalName = this.getMainTerminalName(
                                                                                                                                                   
                                                                                                                                                );
                                                                                                                                                Object other$mainTerminalName = other.getMainTerminalName(
                                                                                                                                                   
                                                                                                                                                );
                                                                                                                                                if (this$mainTerminalName
                                                                                                                                                      == null
                                                                                                                                                   ? other$mainTerminalName
                                                                                                                                                      == null
                                                                                                                                                   : this$mainTerminalName.equals(
                                                                                                                                                      other$mainTerminalName
                                                                                                                                                   )) {
                                                                                                                                                   Object this$dotNo = this.getDotNo(
                                                                                                                                                      
                                                                                                                                                   );
                                                                                                                                                   Object other$dotNo = other.getDotNo(
                                                                                                                                                      
                                                                                                                                                   );
                                                                                                                                                   if (this$dotNo
                                                                                                                                                         == null
                                                                                                                                                      ? other$dotNo
                                                                                                                                                         == null
                                                                                                                                                      : this$dotNo.equals(
                                                                                                                                                         other$dotNo
                                                                                                                                                      )) {
                                                                                                                                                      Object this$companyName = this.getCompanyName(
                                                                                                                                                         
                                                                                                                                                      );
                                                                                                                                                      Object other$companyName = other.getCompanyName(
                                                                                                                                                         
                                                                                                                                                      );
                                                                                                                                                      if (this$companyName
                                                                                                                                                            == null
                                                                                                                                                         ? other$companyName
                                                                                                                                                            == null
                                                                                                                                                         : this$companyName.equals(
                                                                                                                                                            other$companyName
                                                                                                                                                         )) {
                                                                                                                                                         Object this$cycleUsaName = this.getCycleUsaName(
                                                                                                                                                            
                                                                                                                                                         );
                                                                                                                                                         Object other$cycleUsaName = other.getCycleUsaName(
                                                                                                                                                            
                                                                                                                                                         );
                                                                                                                                                         if (this$cycleUsaName
                                                                                                                                                               == null
                                                                                                                                                            ? other$cycleUsaName
                                                                                                                                                               == null
                                                                                                                                                            : this$cycleUsaName.equals(
                                                                                                                                                               other$cycleUsaName
                                                                                                                                                            )) {
                                                                                                                                                            Object this$eldProvider = this.getEldProvider(
                                                                                                                                                               
                                                                                                                                                            );
                                                                                                                                                            Object other$eldProvider = other.getEldProvider(
                                                                                                                                                               
                                                                                                                                                            );
                                                                                                                                                            if (this$eldProvider
                                                                                                                                                                  == null
                                                                                                                                                               ? other$eldProvider
                                                                                                                                                                  == null
                                                                                                                                                               : this$eldProvider.equals(
                                                                                                                                                                  other$eldProvider
                                                                                                                                                               )
                                                                                                                                                               )
                                                                                                                                                             {
                                                                                                                                                               Object this$diagnosticIndicator = this.getDiagnosticIndicator(
                                                                                                                                                                  
                                                                                                                                                               );
                                                                                                                                                               Object other$diagnosticIndicator = other.getDiagnosticIndicator(
                                                                                                                                                                  
                                                                                                                                                               );
                                                                                                                                                               if (this$diagnosticIndicator
                                                                                                                                                                     == null
                                                                                                                                                                  ? other$diagnosticIndicator
                                                                                                                                                                     == null
                                                                                                                                                                  : this$diagnosticIndicator.equals(
                                                                                                                                                                     other$diagnosticIndicator
                                                                                                                                                                  )
                                                                                                                                                                  )
                                                                                                                                                                {
                                                                                                                                                                  Object this$malfunctionIndicator = this.getMalfunctionIndicator(
                                                                                                                                                                     
                                                                                                                                                                  );
                                                                                                                                                                  Object other$malfunctionIndicator = other.getMalfunctionIndicator(
                                                                                                                                                                     
                                                                                                                                                                  );
                                                                                                                                                                  if (this$malfunctionIndicator
                                                                                                                                                                        == null
                                                                                                                                                                     ? other$malfunctionIndicator
                                                                                                                                                                        == null
                                                                                                                                                                     : this$malfunctionIndicator.equals(
                                                                                                                                                                        other$malfunctionIndicator
                                                                                                                                                                     )
                                                                                                                                                                     )
                                                                                                                                                                   {
                                                                                                                                                                     Object this$eldRegistrationId = this.getEldRegistrationId(
                                                                                                                                                                        
                                                                                                                                                                     );
                                                                                                                                                                     Object other$eldRegistrationId = other.getEldRegistrationId(
                                                                                                                                                                        
                                                                                                                                                                     );
                                                                                                                                                                     if (this$eldRegistrationId
                                                                                                                                                                           == null
                                                                                                                                                                        ? other$eldRegistrationId
                                                                                                                                                                           == null
                                                                                                                                                                        : this$eldRegistrationId.equals(
                                                                                                                                                                           other$eldRegistrationId
                                                                                                                                                                        )
                                                                                                                                                                        )
                                                                                                                                                                      {
                                                                                                                                                                        Object this$eldIdentifier = this.getEldIdentifier(
                                                                                                                                                                           
                                                                                                                                                                        );
                                                                                                                                                                        Object other$eldIdentifier = other.getEldIdentifier(
                                                                                                                                                                           
                                                                                                                                                                        );
                                                                                                                                                                        if (this$eldIdentifier
                                                                                                                                                                              == null
                                                                                                                                                                           ? other$eldIdentifier
                                                                                                                                                                              == null
                                                                                                                                                                           : this$eldIdentifier.equals(
                                                                                                                                                                              other$eldIdentifier
                                                                                                                                                                           )
                                                                                                                                                                           )
                                                                                                                                                                         {
                                                                                                                                                                           Object this$periodStartingTime = this.getPeriodStartingTime(
                                                                                                                                                                              
                                                                                                                                                                           );
                                                                                                                                                                           Object other$periodStartingTime = other.getPeriodStartingTime(
                                                                                                                                                                              
                                                                                                                                                                           );
                                                                                                                                                                           if (this$periodStartingTime
                                                                                                                                                                                 == null
                                                                                                                                                                              ? other$periodStartingTime
                                                                                                                                                                                 == null
                                                                                                                                                                              : this$periodStartingTime.equals(
                                                                                                                                                                                 other$periodStartingTime
                                                                                                                                                                              )
                                                                                                                                                                              )
                                                                                                                                                                            {
                                                                                                                                                                              Object this$timezone = this.getTimezone(
                                                                                                                                                                                 
                                                                                                                                                                              );
                                                                                                                                                                              Object other$timezone = other.getTimezone(
                                                                                                                                                                                 
                                                                                                                                                                              );
                                                                                                                                                                              if (this$timezone
                                                                                                                                                                                    == null
                                                                                                                                                                                 ? other$timezone
                                                                                                                                                                                    == null
                                                                                                                                                                                 : this$timezone.equals(
                                                                                                                                                                                    other$timezone
                                                                                                                                                                                 )
                                                                                                                                                                                 )
                                                                                                                                                                               {
                                                                                                                                                                                 Object this$signatureUrl = this.getSignatureUrl(
                                                                                                                                                                                    
                                                                                                                                                                                 );
                                                                                                                                                                                 Object other$signatureUrl = other.getSignatureUrl(
                                                                                                                                                                                    
                                                                                                                                                                                 );
                                                                                                                                                                                 if (this$signatureUrl
                                                                                                                                                                                       == null
                                                                                                                                                                                    ? other$signatureUrl
                                                                                                                                                                                       == null
                                                                                                                                                                                    : this$signatureUrl.equals(
                                                                                                                                                                                       other$signatureUrl
                                                                                                                                                                                    )
                                                                                                                                                                                    )
                                                                                                                                                                                  {
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
                                                                                                                                                                                       )
                                                                                                                                                                                       )
                                                                                                                                                                                     {
                                                                                                                                                                                       Object this$timezoneOffSet = this.getTimezoneOffSet(
                                                                                                                                                                                          
                                                                                                                                                                                       );
                                                                                                                                                                                       Object other$timezoneOffSet = other.getTimezoneOffSet(
                                                                                                                                                                                          
                                                                                                                                                                                       );
                                                                                                                                                                                       if (this$timezoneOffSet
                                                                                                                                                                                             == null
                                                                                                                                                                                          ? other$timezoneOffSet
                                                                                                                                                                                             == null
                                                                                                                                                                                          : this$timezoneOffSet.equals(
                                                                                                                                                                                             other$timezoneOffSet
                                                                                                                                                                                          )
                                                                                                                                                                                          )
                                                                                                                                                                                        {
                                                                                                                                                                                          Object this$remainingWeeklyTime = this.getRemainingWeeklyTime(
                                                                                                                                                                                             
                                                                                                                                                                                          );
                                                                                                                                                                                          Object other$remainingWeeklyTime = other.getRemainingWeeklyTime(
                                                                                                                                                                                             
                                                                                                                                                                                          );
                                                                                                                                                                                          if (this$remainingWeeklyTime
                                                                                                                                                                                                == null
                                                                                                                                                                                             ? other$remainingWeeklyTime
                                                                                                                                                                                                == null
                                                                                                                                                                                             : this$remainingWeeklyTime.equals(
                                                                                                                                                                                                other$remainingWeeklyTime
                                                                                                                                                                                             )
                                                                                                                                                                                             )
                                                                                                                                                                                           {
                                                                                                                                                                                             Object this$remainingDutyTime = this.getRemainingDutyTime(
                                                                                                                                                                                                
                                                                                                                                                                                             );
                                                                                                                                                                                             Object other$remainingDutyTime = other.getRemainingDutyTime(
                                                                                                                                                                                                
                                                                                                                                                                                             );
                                                                                                                                                                                             if (this$remainingDutyTime
                                                                                                                                                                                                   == null
                                                                                                                                                                                                ? other$remainingDutyTime
                                                                                                                                                                                                   == null
                                                                                                                                                                                                : this$remainingDutyTime.equals(
                                                                                                                                                                                                   other$remainingDutyTime
                                                                                                                                                                                                )
                                                                                                                                                                                                )
                                                                                                                                                                                              {
                                                                                                                                                                                                Object this$remainingDriveTime = this.getRemainingDriveTime(
                                                                                                                                                                                                   
                                                                                                                                                                                                );
                                                                                                                                                                                                Object other$remainingDriveTime = other.getRemainingDriveTime(
                                                                                                                                                                                                   
                                                                                                                                                                                                );
                                                                                                                                                                                                if (this$remainingDriveTime
                                                                                                                                                                                                      == null
                                                                                                                                                                                                   ? other$remainingDriveTime
                                                                                                                                                                                                      == null
                                                                                                                                                                                                   : this$remainingDriveTime.equals(
                                                                                                                                                                                                      other$remainingDriveTime
                                                                                                                                                                                                   )
                                                                                                                                                                                                   )
                                                                                                                                                                                                 {
                                                                                                                                                                                                   Object this$remainingSleepTime = this.getRemainingSleepTime(
                                                                                                                                                                                                      
                                                                                                                                                                                                   );
                                                                                                                                                                                                   Object other$remainingSleepTime = other.getRemainingSleepTime(
                                                                                                                                                                                                      
                                                                                                                                                                                                   );
                                                                                                                                                                                                   if (this$remainingSleepTime
                                                                                                                                                                                                         == null
                                                                                                                                                                                                      ? other$remainingSleepTime
                                                                                                                                                                                                         == null
                                                                                                                                                                                                      : this$remainingSleepTime.equals(
                                                                                                                                                                                                         other$remainingSleepTime
                                                                                                                                                                                                      )
                                                                                                                                                                                                      )
                                                                                                                                                                                                    {
                                                                                                                                                                                                      Object this$localId = this.getLocalId(
                                                                                                                                                                                                         
                                                                                                                                                                                                      );
                                                                                                                                                                                                      Object other$localId = other.getLocalId(
                                                                                                                                                                                                         
                                                                                                                                                                                                      );
                                                                                                                                                                                                      if (this$localId
                                                                                                                                                                                                            == null
                                                                                                                                                                                                         ? other$localId
                                                                                                                                                                                                            == null
                                                                                                                                                                                                         : this$localId.equals(
                                                                                                                                                                                                            other$localId
                                                                                                                                                                                                         )
                                                                                                                                                                                                         )
                                                                                                                                                                                                       {
                                                                                                                                                                                                         Object this$onDutyTime = this.getOnDutyTime(
                                                                                                                                                                                                            
                                                                                                                                                                                                         );
                                                                                                                                                                                                         Object other$onDutyTime = other.getOnDutyTime(
                                                                                                                                                                                                            
                                                                                                                                                                                                         );
                                                                                                                                                                                                         if (this$onDutyTime
                                                                                                                                                                                                               == null
                                                                                                                                                                                                            ? other$onDutyTime
                                                                                                                                                                                                               == null
                                                                                                                                                                                                            : this$onDutyTime.equals(
                                                                                                                                                                                                               other$onDutyTime
                                                                                                                                                                                                            )
                                                                                                                                                                                                            )
                                                                                                                                                                                                          {
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
                                                                                                                                                                                                               )
                                                                                                                                                                                                               )
                                                                                                                                                                                                             {
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
                                                                                                                                                                                                                  )
                                                                                                                                                                                                                  )
                                                                                                                                                                                                                {
                                                                                                                                                                                                                  Object this$lastOnSleepTime = this.getLastOnSleepTime(
                                                                                                                                                                                                                     
                                                                                                                                                                                                                  );
                                                                                                                                                                                                                  Object other$lastOnSleepTime = other.getLastOnSleepTime(
                                                                                                                                                                                                                     
                                                                                                                                                                                                                  );
                                                                                                                                                                                                                  if (this$lastOnSleepTime
                                                                                                                                                                                                                        == null
                                                                                                                                                                                                                     ? other$lastOnSleepTime
                                                                                                                                                                                                                        == null
                                                                                                                                                                                                                     : this$lastOnSleepTime.equals(
                                                                                                                                                                                                                        other$lastOnSleepTime
                                                                                                                                                                                                                     )
                                                                                                                                                                                                                     )
                                                                                                                                                                                                                   {
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
                                                                                                                                                                                                                        )
                                                                                                                                                                                                                        )
                                                                                                                                                                                                                      {
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
                                                                                                                                                                                                                           )
                                                                                                                                                                                                                           )
                                                                                                                                                                                                                         {
                                                                                                                                                                                                                           Object this$unidentifiedLog = this.getUnidentifiedLog(
                                                                                                                                                                                                                              
                                                                                                                                                                                                                           );
                                                                                                                                                                                                                           Object other$unidentifiedLog = other.getUnidentifiedLog(
                                                                                                                                                                                                                              
                                                                                                                                                                                                                           );
                                                                                                                                                                                                                           return this$unidentifiedLog
                                                                                                                                                                                                                                 == null
                                                                                                                                                                                                                              ? other$unidentifiedLog
                                                                                                                                                                                                                                 == null
                                                                                                                                                                                                                              : this$unidentifiedLog.equals(
                                                                                                                                                                                                                                 other$unidentifiedLog
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
      return other instanceof DriveringStatusViewDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $statusId = this.getStatusId();
      result = result * 59 + (int)($statusId >>> 32 ^ $statusId);
      long $driverId = this.getDriverId();
      result = result * 59 + (int)($driverId >>> 32 ^ $driverId);
      long $clientId = this.getClientId();
      result = result * 59 + (int)($clientId >>> 32 ^ $clientId);
      long $coDriverId = this.getCoDriverId();
      result = result * 59 + (int)($coDriverId >>> 32 ^ $coDriverId);
      long $mobileNo = this.getMobileNo();
      result = result * 59 + (int)($mobileNo >>> 32 ^ $mobileNo);
      result = result * 59 + this.getIsSystemGenerated();
      long $vehicleId = this.getVehicleId();
      result = result * 59 + (int)($vehicleId >>> 32 ^ $vehicleId);
      long $lattitude = Double.doubleToLongBits(this.getLattitude());
      result = result * 59 + (int)($lattitude >>> 32 ^ $lattitude);
      long $longitude = Double.doubleToLongBits(this.getLongitude());
      result = result * 59 + (int)($longitude >>> 32 ^ $longitude);
      long $lDateTime = this.getLDateTime();
      result = result * 59 + (int)($lDateTime >>> 32 ^ $lDateTime);
      long $utcDateTime = this.getUtcDateTime();
      result = result * 59 + (int)($utcDateTime >>> 32 ^ $utcDateTime);
      long $fromDate = this.getFromDate();
      result = result * 59 + (int)($fromDate >>> 32 ^ $fromDate);
      long $toDate = this.getToDate();
      result = result * 59 + (int)($toDate >>> 32 ^ $toDate);
      long $receivedTimestamp = this.getReceivedTimestamp();
      result = result * 59 + (int)($receivedTimestamp >>> 32 ^ $receivedTimestamp);
      long $updatedTimestamp = this.getUpdatedTimestamp();
      result = result * 59 + (int)($updatedTimestamp >>> 32 ^ $updatedTimestamp);
      long $odometer = Double.doubleToLongBits(this.getOdometer());
      result = result * 59 + (int)($odometer >>> 32 ^ $odometer);
      long $startOdometer = Double.doubleToLongBits(this.getStartOdometer());
      result = result * 59 + (int)($startOdometer >>> 32 ^ $startOdometer);
      long $endOdometer = Double.doubleToLongBits(this.getEndOdometer());
      result = result * 59 + (int)($endOdometer >>> 32 ^ $endOdometer);
      result = result * 59 + this.getShift();
      result = result * 59 + this.getDays();
      result = result * 59 + this.getIsSplit();
      result = result * 59 + this.getIdentifier();
      long $distance = Double.doubleToLongBits(this.getDistance());
      result = result * 59 + (int)($distance >>> 32 ^ $distance);
      result = result * 59 + this.getIsReportGenerated();
      result = result * 59 + this.getIsPreviousLog();
      Object $isVoilation = this.getIsVoilation();
      result = result * 59 + ($isVoilation == null ? 43 : $isVoilation.hashCode());
      Object $voilationHour = this.getVoilationHour();
      result = result * 59 + ($voilationHour == null ? 43 : $voilationHour.hashCode());
      Object $isActive = this.getIsActive();
      result = result * 59 + ($isActive == null ? 43 : $isActive.hashCode());
      Object $isVisible = this.getIsVisible();
      result = result * 59 + ($isVisible == null ? 43 : $isVisible.hashCode());
      Object $_id = this.get_id();
      result = result * 59 + ($_id == null ? 43 : $_id.hashCode());
      Object $certifiedLogId = this.getCertifiedLogId();
      result = result * 59 + ($certifiedLogId == null ? 43 : $certifiedLogId.hashCode());
      Object $companyDriverId = this.getCompanyDriverId();
      result = result * 59 + ($companyDriverId == null ? 43 : $companyDriverId.hashCode());
      Object $driverName = this.getDriverName();
      result = result * 59 + ($driverName == null ? 43 : $driverName.hashCode());
      Object $cdlNo = this.getCdlNo();
      result = result * 59 + ($cdlNo == null ? 43 : $cdlNo.hashCode());
      Object $countryName = this.getCountryName();
      result = result * 59 + ($countryName == null ? 43 : $countryName.hashCode());
      Object $stateName = this.getStateName();
      result = result * 59 + ($stateName == null ? 43 : $stateName.hashCode());
      Object $exempt = this.getExempt();
      result = result * 59 + ($exempt == null ? 43 : $exempt.hashCode());
      Object $shortHaulException = this.getShortHaulException();
      result = result * 59 + ($shortHaulException == null ? 43 : $shortHaulException.hashCode());
      Object $companyCoDriverId = this.getCompanyCoDriverId();
      result = result * 59 + ($companyCoDriverId == null ? 43 : $companyCoDriverId.hashCode());
      Object $coDriverName = this.getCoDriverName();
      result = result * 59 + ($coDriverName == null ? 43 : $coDriverName.hashCode());
      Object $trailers = this.getTrailers();
      result = result * 59 + ($trailers == null ? 43 : $trailers.hashCode());
      Object $shippingDocs = this.getShippingDocs();
      result = result * 59 + ($shippingDocs == null ? 43 : $shippingDocs.hashCode());
      Object $certifiedSignature = this.getCertifiedSignature();
      result = result * 59 + ($certifiedSignature == null ? 43 : $certifiedSignature.hashCode());
      Object $certifiedSignatureName = this.getCertifiedSignatureName();
      result = result * 59 + ($certifiedSignatureName == null ? 43 : $certifiedSignatureName.hashCode());
      Object $exception = this.getException();
      result = result * 59 + ($exception == null ? 43 : $exception.hashCode());
      Object $email = this.getEmail();
      result = result * 59 + ($email == null ? 43 : $email.hashCode());
      Object $status = this.getStatus();
      result = result * 59 + ($status == null ? 43 : $status.hashCode());
      Object $truckNo = this.getTruckNo();
      result = result * 59 + ($truckNo == null ? 43 : $truckNo.hashCode());
      Object $vin = this.getVin();
      result = result * 59 + ($vin == null ? 43 : $vin.hashCode());
      Object $macAddress = this.getMacAddress();
      result = result * 59 + ($macAddress == null ? 43 : $macAddress.hashCode());
      Object $serialNo = this.getSerialNo();
      result = result * 59 + ($serialNo == null ? 43 : $serialNo.hashCode());
      Object $version = this.getVersion();
      result = result * 59 + ($version == null ? 43 : $version.hashCode());
      Object $modelNo = this.getModelNo();
      result = result * 59 + ($modelNo == null ? 43 : $modelNo.hashCode());
      Object $dateTime = this.getDateTime();
      result = result * 59 + ($dateTime == null ? 43 : $dateTime.hashCode());
      Object $_class = this.get_class();
      result = result * 59 + ($_class == null ? 43 : $_class.hashCode());
      Object $logType = this.getLogType();
      result = result * 59 + ($logType == null ? 43 : $logType.hashCode());
      Object $appVersion = this.getAppVersion();
      result = result * 59 + ($appVersion == null ? 43 : $appVersion.hashCode());
      Object $osVersion = this.getOsVersion();
      result = result * 59 + ($osVersion == null ? 43 : $osVersion.hashCode());
      Object $simCardNo = this.getSimCardNo();
      result = result * 59 + ($simCardNo == null ? 43 : $simCardNo.hashCode());
      Object $note = this.getNote();
      result = result * 59 + ($note == null ? 43 : $note.hashCode());
      Object $customLocation = this.getCustomLocation();
      result = result * 59 + ($customLocation == null ? 43 : $customLocation.hashCode());
      Object $currentLocation = this.getCurrentLocation();
      result = result * 59 + ($currentLocation == null ? 43 : $currentLocation.hashCode());
      Object $engineHour = this.getEngineHour();
      result = result * 59 + ($engineHour == null ? 43 : $engineHour.hashCode());
      Object $startEngineHour = this.getStartEngineHour();
      result = result * 59 + ($startEngineHour == null ? 43 : $startEngineHour.hashCode());
      Object $endEngineHour = this.getEndEngineHour();
      result = result * 59 + ($endEngineHour == null ? 43 : $endEngineHour.hashCode());
      Object $engineStatus = this.getEngineStatus();
      result = result * 59 + ($engineStatus == null ? 43 : $engineStatus.hashCode());
      Object $origin = this.getOrigin();
      result = result * 59 + ($origin == null ? 43 : $origin.hashCode());
      Object $carrier = this.getCarrier();
      result = result * 59 + ($carrier == null ? 43 : $carrier.hashCode());
      Object $mainOffice = this.getMainOffice();
      result = result * 59 + ($mainOffice == null ? 43 : $mainOffice.hashCode());
      Object $mainTerminalName = this.getMainTerminalName();
      result = result * 59 + ($mainTerminalName == null ? 43 : $mainTerminalName.hashCode());
      Object $dotNo = this.getDotNo();
      result = result * 59 + ($dotNo == null ? 43 : $dotNo.hashCode());
      Object $companyName = this.getCompanyName();
      result = result * 59 + ($companyName == null ? 43 : $companyName.hashCode());
      Object $cycleUsaName = this.getCycleUsaName();
      result = result * 59 + ($cycleUsaName == null ? 43 : $cycleUsaName.hashCode());
      Object $eldProvider = this.getEldProvider();
      result = result * 59 + ($eldProvider == null ? 43 : $eldProvider.hashCode());
      Object $diagnosticIndicator = this.getDiagnosticIndicator();
      result = result * 59 + ($diagnosticIndicator == null ? 43 : $diagnosticIndicator.hashCode());
      Object $malfunctionIndicator = this.getMalfunctionIndicator();
      result = result * 59 + ($malfunctionIndicator == null ? 43 : $malfunctionIndicator.hashCode());
      Object $eldRegistrationId = this.getEldRegistrationId();
      result = result * 59 + ($eldRegistrationId == null ? 43 : $eldRegistrationId.hashCode());
      Object $eldIdentifier = this.getEldIdentifier();
      result = result * 59 + ($eldIdentifier == null ? 43 : $eldIdentifier.hashCode());
      Object $periodStartingTime = this.getPeriodStartingTime();
      result = result * 59 + ($periodStartingTime == null ? 43 : $periodStartingTime.hashCode());
      Object $timezone = this.getTimezone();
      result = result * 59 + ($timezone == null ? 43 : $timezone.hashCode());
      Object $signatureUrl = this.getSignatureUrl();
      result = result * 59 + ($signatureUrl == null ? 43 : $signatureUrl.hashCode());
      Object $timezoneName = this.getTimezoneName();
      result = result * 59 + ($timezoneName == null ? 43 : $timezoneName.hashCode());
      Object $timezoneOffSet = this.getTimezoneOffSet();
      result = result * 59 + ($timezoneOffSet == null ? 43 : $timezoneOffSet.hashCode());
      Object $remainingWeeklyTime = this.getRemainingWeeklyTime();
      result = result * 59 + ($remainingWeeklyTime == null ? 43 : $remainingWeeklyTime.hashCode());
      Object $remainingDutyTime = this.getRemainingDutyTime();
      result = result * 59 + ($remainingDutyTime == null ? 43 : $remainingDutyTime.hashCode());
      Object $remainingDriveTime = this.getRemainingDriveTime();
      result = result * 59 + ($remainingDriveTime == null ? 43 : $remainingDriveTime.hashCode());
      Object $remainingSleepTime = this.getRemainingSleepTime();
      result = result * 59 + ($remainingSleepTime == null ? 43 : $remainingSleepTime.hashCode());
      Object $localId = this.getLocalId();
      result = result * 59 + ($localId == null ? 43 : $localId.hashCode());
      Object $onDutyTime = this.getOnDutyTime();
      result = result * 59 + ($onDutyTime == null ? 43 : $onDutyTime.hashCode());
      Object $onDriveTime = this.getOnDriveTime();
      result = result * 59 + ($onDriveTime == null ? 43 : $onDriveTime.hashCode());
      Object $onSleepTime = this.getOnSleepTime();
      result = result * 59 + ($onSleepTime == null ? 43 : $onSleepTime.hashCode());
      Object $lastOnSleepTime = this.getLastOnSleepTime();
      result = result * 59 + ($lastOnSleepTime == null ? 43 : $lastOnSleepTime.hashCode());
      Object $weeklyTime = this.getWeeklyTime();
      result = result * 59 + ($weeklyTime == null ? 43 : $weeklyTime.hashCode());
      Object $onBreak = this.getOnBreak();
      result = result * 59 + ($onBreak == null ? 43 : $onBreak.hashCode());
      Object $unidentifiedLog = this.getUnidentifiedLog();
      return result * 59 + ($unidentifiedLog == null ? 43 : $unidentifiedLog.hashCode());
   }

   @Override
   public String toString() {
      return "DriveringStatusViewDto(_id="
         + this.get_id()
         + ", certifiedLogId="
         + this.getCertifiedLogId()
         + ", statusId="
         + this.getStatusId()
         + ", driverId="
         + this.getDriverId()
         + ", clientId="
         + this.getClientId()
         + ", companyDriverId="
         + this.getCompanyDriverId()
         + ", driverName="
         + this.getDriverName()
         + ", cdlNo="
         + this.getCdlNo()
         + ", countryName="
         + this.getCountryName()
         + ", stateName="
         + this.getStateName()
         + ", exempt="
         + this.getExempt()
         + ", shortHaulException="
         + this.getShortHaulException()
         + ", companyCoDriverId="
         + this.getCompanyCoDriverId()
         + ", coDriverId="
         + this.getCoDriverId()
         + ", coDriverName="
         + this.getCoDriverName()
         + ", trailers="
         + this.getTrailers()
         + ", shippingDocs="
         + this.getShippingDocs()
         + ", certifiedSignature="
         + this.getCertifiedSignature()
         + ", certifiedSignatureName="
         + this.getCertifiedSignatureName()
         + ", exception="
         + this.getException()
         + ", email="
         + this.getEmail()
         + ", mobileNo="
         + this.getMobileNo()
         + ", status="
         + this.getStatus()
         + ", isSystemGenerated="
         + this.getIsSystemGenerated()
         + ", vehicleId="
         + this.getVehicleId()
         + ", truckNo="
         + this.getTruckNo()
         + ", vin="
         + this.getVin()
         + ", macAddress="
         + this.getMacAddress()
         + ", serialNo="
         + this.getSerialNo()
         + ", version="
         + this.getVersion()
         + ", modelNo="
         + this.getModelNo()
         + ", lattitude="
         + this.getLattitude()
         + ", longitude="
         + this.getLongitude()
         + ", dateTime="
         + this.getDateTime()
         + ", lDateTime="
         + this.getLDateTime()
         + ", utcDateTime="
         + this.getUtcDateTime()
         + ", fromDate="
         + this.getFromDate()
         + ", toDate="
         + this.getToDate()
         + ", receivedTimestamp="
         + this.getReceivedTimestamp()
         + ", updatedTimestamp="
         + this.getUpdatedTimestamp()
         + ", _class="
         + this.get_class()
         + ", logType="
         + this.getLogType()
         + ", appVersion="
         + this.getAppVersion()
         + ", osVersion="
         + this.getOsVersion()
         + ", simCardNo="
         + this.getSimCardNo()
         + ", isVoilation="
         + this.getIsVoilation()
         + ", voilationHour="
         + this.getVoilationHour()
         + ", note="
         + this.getNote()
         + ", customLocation="
         + this.getCustomLocation()
         + ", currentLocation="
         + this.getCurrentLocation()
         + ", engineHour="
         + this.getEngineHour()
         + ", startEngineHour="
         + this.getStartEngineHour()
         + ", endEngineHour="
         + this.getEndEngineHour()
         + ", engineStatus="
         + this.getEngineStatus()
         + ", origin="
         + this.getOrigin()
         + ", odometer="
         + this.getOdometer()
         + ", startOdometer="
         + this.getStartOdometer()
         + ", endOdometer="
         + this.getEndOdometer()
         + ", carrier="
         + this.getCarrier()
         + ", mainOffice="
         + this.getMainOffice()
         + ", mainTerminalName="
         + this.getMainTerminalName()
         + ", dotNo="
         + this.getDotNo()
         + ", companyName="
         + this.getCompanyName()
         + ", cycleUsaName="
         + this.getCycleUsaName()
         + ", eldProvider="
         + this.getEldProvider()
         + ", diagnosticIndicator="
         + this.getDiagnosticIndicator()
         + ", malfunctionIndicator="
         + this.getMalfunctionIndicator()
         + ", eldRegistrationId="
         + this.getEldRegistrationId()
         + ", eldIdentifier="
         + this.getEldIdentifier()
         + ", periodStartingTime="
         + this.getPeriodStartingTime()
         + ", timezone="
         + this.getTimezone()
         + ", signatureUrl="
         + this.getSignatureUrl()
         + ", timezoneName="
         + this.getTimezoneName()
         + ", timezoneOffSet="
         + this.getTimezoneOffSet()
         + ", remainingWeeklyTime="
         + this.getRemainingWeeklyTime()
         + ", remainingDutyTime="
         + this.getRemainingDutyTime()
         + ", remainingDriveTime="
         + this.getRemainingDriveTime()
         + ", remainingSleepTime="
         + this.getRemainingSleepTime()
         + ", shift="
         + this.getShift()
         + ", days="
         + this.getDays()
         + ", isSplit="
         + this.getIsSplit()
         + ", identifier="
         + this.getIdentifier()
         + ", isActive="
         + this.getIsActive()
         + ", localId="
         + this.getLocalId()
         + ", isVisible="
         + this.getIsVisible()
         + ", onDutyTime="
         + this.getOnDutyTime()
         + ", onDriveTime="
         + this.getOnDriveTime()
         + ", onSleepTime="
         + this.getOnSleepTime()
         + ", lastOnSleepTime="
         + this.getLastOnSleepTime()
         + ", weeklyTime="
         + this.getWeeklyTime()
         + ", onBreak="
         + this.getOnBreak()
         + ", unidentifiedLog="
         + this.getUnidentifiedLog()
         + ", distance="
         + this.getDistance()
         + ", isReportGenerated="
         + this.getIsReportGenerated()
         + ", isPreviousLog="
         + this.getIsPreviousLog()
         + ")";
   }
}
