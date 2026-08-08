package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DriveringStatusLogViewDto {
   @JsonProperty("_id")
   private String _id;
   @JsonProperty("vehicleId")
   private long vehicleId;
   @JsonProperty("driverId")
   private long driverId;
   @JsonProperty("clientId")
   private long clientId;
   @JsonProperty("driverStatusId")
   private String driverStatusId;
   @JsonProperty("driverName")
   private String driverName;
   @JsonProperty("dateTime")
   private String dateTime;
   @JsonProperty("utcDateTime")
   private long utcDateTime;
   @JsonProperty("lastUtcDateTime")
   private long lastUtcDateTime;
   @JsonProperty("status")
   private String status;
   @JsonProperty("engineStatus")
   private String engineStatus;
   @JsonProperty("employeeStatus")
   private String employeeStatus;
   @JsonProperty("lattitude")
   private double lattitude;
   @JsonProperty("longitude")
   private double longitude;
   @JsonProperty("customLocation")
   private String customLocation;
   @JsonProperty("origin")
   private String origin;
   @JsonProperty("odometer")
   private double odometer;
   @JsonProperty("engineHour")
   private String engineHour;
   @JsonProperty("note")
   private String note;
   @JsonProperty("isVoilation")
   private long isVoilation;
   @JsonProperty("logType")
   private String logType;
   @JsonProperty("statusId")
   private long statusId;
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
   @JsonProperty("isReportGenerated")
   private long isReportGenerated;
   @JsonProperty("isPreviousLog")
   private int isPreviousLog;
   @JsonProperty("isLogDelete")
   private int isLogDelete;
   @JsonProperty("totalSeconds")
   private long totalSeconds;
   @JsonProperty("isDvirShift")
   private String isDvirShift;

   public String get_id() {
      return this._id;
   }

   public long getVehicleId() {
      return this.vehicleId;
   }

   public long getDriverId() {
      return this.driverId;
   }

   public long getClientId() {
      return this.clientId;
   }

   public String getDriverStatusId() {
      return this.driverStatusId;
   }

   public String getDriverName() {
      return this.driverName;
   }

   public String getDateTime() {
      return this.dateTime;
   }

   public long getUtcDateTime() {
      return this.utcDateTime;
   }

   public long getLastUtcDateTime() {
      return this.lastUtcDateTime;
   }

   public String getStatus() {
      return this.status;
   }

   public String getEngineStatus() {
      return this.engineStatus;
   }

   public String getEmployeeStatus() {
      return this.employeeStatus;
   }

   public double getLattitude() {
      return this.lattitude;
   }

   public double getLongitude() {
      return this.longitude;
   }

   public String getCustomLocation() {
      return this.customLocation;
   }

   public String getOrigin() {
      return this.origin;
   }

   public double getOdometer() {
      return this.odometer;
   }

   public String getEngineHour() {
      return this.engineHour;
   }

   public String getNote() {
      return this.note;
   }

   public long getIsVoilation() {
      return this.isVoilation;
   }

   public String getLogType() {
      return this.logType;
   }

   public long getStatusId() {
      return this.statusId;
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

   public long getIsReportGenerated() {
      return this.isReportGenerated;
   }

   public int getIsPreviousLog() {
      return this.isPreviousLog;
   }

   public int getIsLogDelete() {
      return this.isLogDelete;
   }

   public long getTotalSeconds() {
      return this.totalSeconds;
   }

   public String getIsDvirShift() {
      return this.isDvirShift;
   }

   @JsonProperty("_id")
   public void set_id(final String _id) {
      this._id = _id;
   }

   @JsonProperty("vehicleId")
   public void setVehicleId(final long vehicleId) {
      this.vehicleId = vehicleId;
   }

   @JsonProperty("driverId")
   public void setDriverId(final long driverId) {
      this.driverId = driverId;
   }

   @JsonProperty("clientId")
   public void setClientId(final long clientId) {
      this.clientId = clientId;
   }

   @JsonProperty("driverStatusId")
   public void setDriverStatusId(final String driverStatusId) {
      this.driverStatusId = driverStatusId;
   }

   @JsonProperty("driverName")
   public void setDriverName(final String driverName) {
      this.driverName = driverName;
   }

   @JsonProperty("dateTime")
   public void setDateTime(final String dateTime) {
      this.dateTime = dateTime;
   }

   @JsonProperty("utcDateTime")
   public void setUtcDateTime(final long utcDateTime) {
      this.utcDateTime = utcDateTime;
   }

   @JsonProperty("lastUtcDateTime")
   public void setLastUtcDateTime(final long lastUtcDateTime) {
      this.lastUtcDateTime = lastUtcDateTime;
   }

   @JsonProperty("status")
   public void setStatus(final String status) {
      this.status = status;
   }

   @JsonProperty("engineStatus")
   public void setEngineStatus(final String engineStatus) {
      this.engineStatus = engineStatus;
   }

   @JsonProperty("employeeStatus")
   public void setEmployeeStatus(final String employeeStatus) {
      this.employeeStatus = employeeStatus;
   }

   @JsonProperty("lattitude")
   public void setLattitude(final double lattitude) {
      this.lattitude = lattitude;
   }

   @JsonProperty("longitude")
   public void setLongitude(final double longitude) {
      this.longitude = longitude;
   }

   @JsonProperty("customLocation")
   public void setCustomLocation(final String customLocation) {
      this.customLocation = customLocation;
   }

   @JsonProperty("origin")
   public void setOrigin(final String origin) {
      this.origin = origin;
   }

   @JsonProperty("odometer")
   public void setOdometer(final double odometer) {
      this.odometer = odometer;
   }

   @JsonProperty("engineHour")
   public void setEngineHour(final String engineHour) {
      this.engineHour = engineHour;
   }

   @JsonProperty("note")
   public void setNote(final String note) {
      this.note = note;
   }

   @JsonProperty("isVoilation")
   public void setIsVoilation(final long isVoilation) {
      this.isVoilation = isVoilation;
   }

   @JsonProperty("logType")
   public void setLogType(final String logType) {
      this.logType = logType;
   }

   @JsonProperty("statusId")
   public void setStatusId(final long statusId) {
      this.statusId = statusId;
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

   @JsonProperty("isReportGenerated")
   public void setIsReportGenerated(final long isReportGenerated) {
      this.isReportGenerated = isReportGenerated;
   }

   @JsonProperty("isPreviousLog")
   public void setIsPreviousLog(final int isPreviousLog) {
      this.isPreviousLog = isPreviousLog;
   }

   @JsonProperty("isLogDelete")
   public void setIsLogDelete(final int isLogDelete) {
      this.isLogDelete = isLogDelete;
   }

   @JsonProperty("totalSeconds")
   public void setTotalSeconds(final long totalSeconds) {
      this.totalSeconds = totalSeconds;
   }

   @JsonProperty("isDvirShift")
   public void setIsDvirShift(final String isDvirShift) {
      this.isDvirShift = isDvirShift;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof DriveringStatusLogViewDto)) {
         return false;
      } else {
         DriveringStatusLogViewDto other = (DriveringStatusLogViewDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getVehicleId() != other.getVehicleId()) {
            return false;
         } else if (this.getDriverId() != other.getDriverId()) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else if (this.getUtcDateTime() != other.getUtcDateTime()) {
            return false;
         } else if (this.getLastUtcDateTime() != other.getLastUtcDateTime()) {
            return false;
         } else if (Double.compare(this.getLattitude(), other.getLattitude()) != 0) {
            return false;
         } else if (Double.compare(this.getLongitude(), other.getLongitude()) != 0) {
            return false;
         } else if (Double.compare(this.getOdometer(), other.getOdometer()) != 0) {
            return false;
         } else if (this.getIsVoilation() != other.getIsVoilation()) {
            return false;
         } else if (this.getStatusId() != other.getStatusId()) {
            return false;
         } else if (this.getShift() != other.getShift()) {
            return false;
         } else if (this.getDays() != other.getDays()) {
            return false;
         } else if (this.getIsReportGenerated() != other.getIsReportGenerated()) {
            return false;
         } else if (this.getIsPreviousLog() != other.getIsPreviousLog()) {
            return false;
         } else if (this.getIsLogDelete() != other.getIsLogDelete()) {
            return false;
         } else if (this.getTotalSeconds() != other.getTotalSeconds()) {
            return false;
         } else {
            Object this$_id = this.get_id();
            Object other$_id = other.get_id();
            if (this$_id == null ? other$_id == null : this$_id.equals(other$_id)) {
               Object this$driverStatusId = this.getDriverStatusId();
               Object other$driverStatusId = other.getDriverStatusId();
               if (this$driverStatusId == null ? other$driverStatusId == null : this$driverStatusId.equals(other$driverStatusId)) {
                  Object this$driverName = this.getDriverName();
                  Object other$driverName = other.getDriverName();
                  if (this$driverName == null ? other$driverName == null : this$driverName.equals(other$driverName)) {
                     Object this$dateTime = this.getDateTime();
                     Object other$dateTime = other.getDateTime();
                     if (this$dateTime == null ? other$dateTime == null : this$dateTime.equals(other$dateTime)) {
                        Object this$status = this.getStatus();
                        Object other$status = other.getStatus();
                        if (this$status == null ? other$status == null : this$status.equals(other$status)) {
                           Object this$engineStatus = this.getEngineStatus();
                           Object other$engineStatus = other.getEngineStatus();
                           if (this$engineStatus == null ? other$engineStatus == null : this$engineStatus.equals(other$engineStatus)) {
                              Object this$employeeStatus = this.getEmployeeStatus();
                              Object other$employeeStatus = other.getEmployeeStatus();
                              if (this$employeeStatus == null ? other$employeeStatus == null : this$employeeStatus.equals(other$employeeStatus)) {
                                 Object this$customLocation = this.getCustomLocation();
                                 Object other$customLocation = other.getCustomLocation();
                                 if (this$customLocation == null ? other$customLocation == null : this$customLocation.equals(other$customLocation)) {
                                    Object this$origin = this.getOrigin();
                                    Object other$origin = other.getOrigin();
                                    if (this$origin == null ? other$origin == null : this$origin.equals(other$origin)) {
                                       Object this$engineHour = this.getEngineHour();
                                       Object other$engineHour = other.getEngineHour();
                                       if (this$engineHour == null ? other$engineHour == null : this$engineHour.equals(other$engineHour)) {
                                          Object this$note = this.getNote();
                                          Object other$note = other.getNote();
                                          if (this$note == null ? other$note == null : this$note.equals(other$note)) {
                                             Object this$logType = this.getLogType();
                                             Object other$logType = other.getLogType();
                                             if (this$logType == null ? other$logType == null : this$logType.equals(other$logType)) {
                                                Object this$remainingWeeklyTime = this.getRemainingWeeklyTime();
                                                Object other$remainingWeeklyTime = other.getRemainingWeeklyTime();
                                                if (this$remainingWeeklyTime == null
                                                   ? other$remainingWeeklyTime == null
                                                   : this$remainingWeeklyTime.equals(other$remainingWeeklyTime)) {
                                                   Object this$remainingDutyTime = this.getRemainingDutyTime();
                                                   Object other$remainingDutyTime = other.getRemainingDutyTime();
                                                   if (this$remainingDutyTime == null
                                                      ? other$remainingDutyTime == null
                                                      : this$remainingDutyTime.equals(other$remainingDutyTime)) {
                                                      Object this$remainingDriveTime = this.getRemainingDriveTime();
                                                      Object other$remainingDriveTime = other.getRemainingDriveTime();
                                                      if (this$remainingDriveTime == null
                                                         ? other$remainingDriveTime == null
                                                         : this$remainingDriveTime.equals(other$remainingDriveTime)) {
                                                         Object this$remainingSleepTime = this.getRemainingSleepTime();
                                                         Object other$remainingSleepTime = other.getRemainingSleepTime();
                                                         if (this$remainingSleepTime == null
                                                            ? other$remainingSleepTime == null
                                                            : this$remainingSleepTime.equals(other$remainingSleepTime)) {
                                                            Object this$isDvirShift = this.getIsDvirShift();
                                                            Object other$isDvirShift = other.getIsDvirShift();
                                                            return this$isDvirShift == null
                                                               ? other$isDvirShift == null
                                                               : this$isDvirShift.equals(other$isDvirShift);
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
      return other instanceof DriveringStatusLogViewDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $vehicleId = this.getVehicleId();
      result = result * 59 + (int)($vehicleId >>> 32 ^ $vehicleId);
      long $driverId = this.getDriverId();
      result = result * 59 + (int)($driverId >>> 32 ^ $driverId);
      long $clientId = this.getClientId();
      result = result * 59 + (int)($clientId >>> 32 ^ $clientId);
      long $utcDateTime = this.getUtcDateTime();
      result = result * 59 + (int)($utcDateTime >>> 32 ^ $utcDateTime);
      long $lastUtcDateTime = this.getLastUtcDateTime();
      result = result * 59 + (int)($lastUtcDateTime >>> 32 ^ $lastUtcDateTime);
      long $lattitude = Double.doubleToLongBits(this.getLattitude());
      result = result * 59 + (int)($lattitude >>> 32 ^ $lattitude);
      long $longitude = Double.doubleToLongBits(this.getLongitude());
      result = result * 59 + (int)($longitude >>> 32 ^ $longitude);
      long $odometer = Double.doubleToLongBits(this.getOdometer());
      result = result * 59 + (int)($odometer >>> 32 ^ $odometer);
      long $isVoilation = this.getIsVoilation();
      result = result * 59 + (int)($isVoilation >>> 32 ^ $isVoilation);
      long $statusId = this.getStatusId();
      result = result * 59 + (int)($statusId >>> 32 ^ $statusId);
      result = result * 59 + this.getShift();
      result = result * 59 + this.getDays();
      long $isReportGenerated = this.getIsReportGenerated();
      result = result * 59 + (int)($isReportGenerated >>> 32 ^ $isReportGenerated);
      result = result * 59 + this.getIsPreviousLog();
      result = result * 59 + this.getIsLogDelete();
      long $totalSeconds = this.getTotalSeconds();
      result = result * 59 + (int)($totalSeconds >>> 32 ^ $totalSeconds);
      Object $_id = this.get_id();
      result = result * 59 + ($_id == null ? 43 : $_id.hashCode());
      Object $driverStatusId = this.getDriverStatusId();
      result = result * 59 + ($driverStatusId == null ? 43 : $driverStatusId.hashCode());
      Object $driverName = this.getDriverName();
      result = result * 59 + ($driverName == null ? 43 : $driverName.hashCode());
      Object $dateTime = this.getDateTime();
      result = result * 59 + ($dateTime == null ? 43 : $dateTime.hashCode());
      Object $status = this.getStatus();
      result = result * 59 + ($status == null ? 43 : $status.hashCode());
      Object $engineStatus = this.getEngineStatus();
      result = result * 59 + ($engineStatus == null ? 43 : $engineStatus.hashCode());
      Object $employeeStatus = this.getEmployeeStatus();
      result = result * 59 + ($employeeStatus == null ? 43 : $employeeStatus.hashCode());
      Object $customLocation = this.getCustomLocation();
      result = result * 59 + ($customLocation == null ? 43 : $customLocation.hashCode());
      Object $origin = this.getOrigin();
      result = result * 59 + ($origin == null ? 43 : $origin.hashCode());
      Object $engineHour = this.getEngineHour();
      result = result * 59 + ($engineHour == null ? 43 : $engineHour.hashCode());
      Object $note = this.getNote();
      result = result * 59 + ($note == null ? 43 : $note.hashCode());
      Object $logType = this.getLogType();
      result = result * 59 + ($logType == null ? 43 : $logType.hashCode());
      Object $remainingWeeklyTime = this.getRemainingWeeklyTime();
      result = result * 59 + ($remainingWeeklyTime == null ? 43 : $remainingWeeklyTime.hashCode());
      Object $remainingDutyTime = this.getRemainingDutyTime();
      result = result * 59 + ($remainingDutyTime == null ? 43 : $remainingDutyTime.hashCode());
      Object $remainingDriveTime = this.getRemainingDriveTime();
      result = result * 59 + ($remainingDriveTime == null ? 43 : $remainingDriveTime.hashCode());
      Object $remainingSleepTime = this.getRemainingSleepTime();
      result = result * 59 + ($remainingSleepTime == null ? 43 : $remainingSleepTime.hashCode());
      Object $isDvirShift = this.getIsDvirShift();
      return result * 59 + ($isDvirShift == null ? 43 : $isDvirShift.hashCode());
   }

   @Override
   public String toString() {
      return "DriveringStatusLogViewDto(_id="
         + this.get_id()
         + ", vehicleId="
         + this.getVehicleId()
         + ", driverId="
         + this.getDriverId()
         + ", clientId="
         + this.getClientId()
         + ", driverStatusId="
         + this.getDriverStatusId()
         + ", driverName="
         + this.getDriverName()
         + ", dateTime="
         + this.getDateTime()
         + ", utcDateTime="
         + this.getUtcDateTime()
         + ", lastUtcDateTime="
         + this.getLastUtcDateTime()
         + ", status="
         + this.getStatus()
         + ", engineStatus="
         + this.getEngineStatus()
         + ", employeeStatus="
         + this.getEmployeeStatus()
         + ", lattitude="
         + this.getLattitude()
         + ", longitude="
         + this.getLongitude()
         + ", customLocation="
         + this.getCustomLocation()
         + ", origin="
         + this.getOrigin()
         + ", odometer="
         + this.getOdometer()
         + ", engineHour="
         + this.getEngineHour()
         + ", note="
         + this.getNote()
         + ", isVoilation="
         + this.getIsVoilation()
         + ", logType="
         + this.getLogType()
         + ", statusId="
         + this.getStatusId()
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
         + ", isReportGenerated="
         + this.getIsReportGenerated()
         + ", isPreviousLog="
         + this.getIsPreviousLog()
         + ", isLogDelete="
         + this.getIsLogDelete()
         + ", totalSeconds="
         + this.getTotalSeconds()
         + ", isDvirShift="
         + this.getIsDvirShift()
         + ")";
   }
}
