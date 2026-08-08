package com.mes.eld_log.models;

import java.io.Serializable;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.core.mapping.Document;

@EntityScan
@Document(
   collection = "drivering_status"
)
public class DriveringStatus implements Serializable {
   private static final long serialVersionUID = 1L;
   private long statusId;
   private String tokenNo;
   private long driverId;
   private long vehicleId;
   private long clientId;
   private String status;
   private double lattitude;
   private double longitude;
   private String dateTime;
   private long lDateTime;
   private long utcDateTime;
   private String logType;
   private String appVersion;
   private String osVersion;
   private Integer isVoilation;
   private Integer voilationHour;
   private String simCardNo;
   private String note;
   private String customLocation;
   private String currentLocation;
   private String engineHour;
   private String engineStatus;
   private String origin;
   private double odometer;
   private Integer identifier;
   private String timezone;
   private long remainingWeeklyTime;
   private long remainingDutyTime;
   private long remainingDriveTime;
   private long remainingSleepTime;
   private String localId;
   private Integer shift;
   private Integer days;
   private Integer isReportGenerated;
   private Integer isSplit;
   private Integer isVisible;
   private String email;
   private Integer isActive = 1;
   private long receivedTimestamp;
   private long updatedTimestamp;

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof DriveringStatus)) {
         return false;
      } else {
         DriveringStatus other = (DriveringStatus)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getStatusId() != other.getStatusId()) {
            return false;
         } else if (this.getDriverId() != other.getDriverId()) {
            return false;
         } else if (this.getVehicleId() != other.getVehicleId()) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else if (Double.compare(this.getLattitude(), other.getLattitude()) != 0) {
            return false;
         } else if (Double.compare(this.getLongitude(), other.getLongitude()) != 0) {
            return false;
         } else if (this.getLDateTime() != other.getLDateTime()) {
            return false;
         } else if (this.getUtcDateTime() != other.getUtcDateTime()) {
            return false;
         } else if (Double.compare(this.getOdometer(), other.getOdometer()) != 0) {
            return false;
         } else if (this.getRemainingWeeklyTime() != other.getRemainingWeeklyTime()) {
            return false;
         } else if (this.getRemainingDutyTime() != other.getRemainingDutyTime()) {
            return false;
         } else if (this.getRemainingDriveTime() != other.getRemainingDriveTime()) {
            return false;
         } else if (this.getRemainingSleepTime() != other.getRemainingSleepTime()) {
            return false;
         } else if (this.getReceivedTimestamp() != other.getReceivedTimestamp()) {
            return false;
         } else if (this.getUpdatedTimestamp() != other.getUpdatedTimestamp()) {
            return false;
         } else {
            Object this$isVoilation = this.getIsVoilation();
            Object other$isVoilation = other.getIsVoilation();
            if (this$isVoilation == null ? other$isVoilation == null : this$isVoilation.equals(other$isVoilation)) {
               Object this$voilationHour = this.getVoilationHour();
               Object other$voilationHour = other.getVoilationHour();
               if (this$voilationHour == null ? other$voilationHour == null : this$voilationHour.equals(other$voilationHour)) {
                  Object this$identifier = this.getIdentifier();
                  Object other$identifier = other.getIdentifier();
                  if (this$identifier == null ? other$identifier == null : this$identifier.equals(other$identifier)) {
                     Object this$shift = this.getShift();
                     Object other$shift = other.getShift();
                     if (this$shift == null ? other$shift == null : this$shift.equals(other$shift)) {
                        Object this$days = this.getDays();
                        Object other$days = other.getDays();
                        if (this$days == null ? other$days == null : this$days.equals(other$days)) {
                           Object this$isReportGenerated = this.getIsReportGenerated();
                           Object other$isReportGenerated = other.getIsReportGenerated();
                           if (this$isReportGenerated == null ? other$isReportGenerated == null : this$isReportGenerated.equals(other$isReportGenerated)) {
                              Object this$isSplit = this.getIsSplit();
                              Object other$isSplit = other.getIsSplit();
                              if (this$isSplit == null ? other$isSplit == null : this$isSplit.equals(other$isSplit)) {
                                 Object this$isVisible = this.getIsVisible();
                                 Object other$isVisible = other.getIsVisible();
                                 if (this$isVisible == null ? other$isVisible == null : this$isVisible.equals(other$isVisible)) {
                                    Object this$isActive = this.getIsActive();
                                    Object other$isActive = other.getIsActive();
                                    if (this$isActive == null ? other$isActive == null : this$isActive.equals(other$isActive)) {
                                       Object this$tokenNo = this.getTokenNo();
                                       Object other$tokenNo = other.getTokenNo();
                                       if (this$tokenNo == null ? other$tokenNo == null : this$tokenNo.equals(other$tokenNo)) {
                                          Object this$status = this.getStatus();
                                          Object other$status = other.getStatus();
                                          if (this$status == null ? other$status == null : this$status.equals(other$status)) {
                                             Object this$dateTime = this.getDateTime();
                                             Object other$dateTime = other.getDateTime();
                                             if (this$dateTime == null ? other$dateTime == null : this$dateTime.equals(other$dateTime)) {
                                                Object this$logType = this.getLogType();
                                                Object other$logType = other.getLogType();
                                                if (this$logType == null ? other$logType == null : this$logType.equals(other$logType)) {
                                                   Object this$appVersion = this.getAppVersion();
                                                   Object other$appVersion = other.getAppVersion();
                                                   if (this$appVersion == null ? other$appVersion == null : this$appVersion.equals(other$appVersion)) {
                                                      Object this$osVersion = this.getOsVersion();
                                                      Object other$osVersion = other.getOsVersion();
                                                      if (this$osVersion == null ? other$osVersion == null : this$osVersion.equals(other$osVersion)) {
                                                         Object this$simCardNo = this.getSimCardNo();
                                                         Object other$simCardNo = other.getSimCardNo();
                                                         if (this$simCardNo == null ? other$simCardNo == null : this$simCardNo.equals(other$simCardNo)) {
                                                            Object this$note = this.getNote();
                                                            Object other$note = other.getNote();
                                                            if (this$note == null ? other$note == null : this$note.equals(other$note)) {
                                                               Object this$customLocation = this.getCustomLocation();
                                                               Object other$customLocation = other.getCustomLocation();
                                                               if (this$customLocation == null
                                                                  ? other$customLocation == null
                                                                  : this$customLocation.equals(other$customLocation)) {
                                                                  Object this$currentLocation = this.getCurrentLocation();
                                                                  Object other$currentLocation = other.getCurrentLocation();
                                                                  if (this$currentLocation == null
                                                                     ? other$currentLocation == null
                                                                     : this$currentLocation.equals(other$currentLocation)) {
                                                                     Object this$engineHour = this.getEngineHour();
                                                                     Object other$engineHour = other.getEngineHour();
                                                                     if (this$engineHour == null
                                                                        ? other$engineHour == null
                                                                        : this$engineHour.equals(other$engineHour)) {
                                                                        Object this$engineStatus = this.getEngineStatus();
                                                                        Object other$engineStatus = other.getEngineStatus();
                                                                        if (this$engineStatus == null
                                                                           ? other$engineStatus == null
                                                                           : this$engineStatus.equals(other$engineStatus)) {
                                                                           Object this$origin = this.getOrigin();
                                                                           Object other$origin = other.getOrigin();
                                                                           if (this$origin == null ? other$origin == null : this$origin.equals(other$origin)) {
                                                                              Object this$timezone = this.getTimezone();
                                                                              Object other$timezone = other.getTimezone();
                                                                              if (this$timezone == null
                                                                                 ? other$timezone == null
                                                                                 : this$timezone.equals(other$timezone)) {
                                                                                 Object this$localId = this.getLocalId();
                                                                                 Object other$localId = other.getLocalId();
                                                                                 if (this$localId == null
                                                                                    ? other$localId == null
                                                                                    : this$localId.equals(other$localId)) {
                                                                                    Object this$email = this.getEmail();
                                                                                    Object other$email = other.getEmail();
                                                                                    return this$email == null
                                                                                       ? other$email == null
                                                                                       : this$email.equals(other$email);
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
      return other instanceof DriveringStatus;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $statusId = this.getStatusId();
      result = result * 59 + (int)($statusId >>> 32 ^ $statusId);
      long $driverId = this.getDriverId();
      result = result * 59 + (int)($driverId >>> 32 ^ $driverId);
      long $vehicleId = this.getVehicleId();
      result = result * 59 + (int)($vehicleId >>> 32 ^ $vehicleId);
      long $clientId = this.getClientId();
      result = result * 59 + (int)($clientId >>> 32 ^ $clientId);
      long $lattitude = Double.doubleToLongBits(this.getLattitude());
      result = result * 59 + (int)($lattitude >>> 32 ^ $lattitude);
      long $longitude = Double.doubleToLongBits(this.getLongitude());
      result = result * 59 + (int)($longitude >>> 32 ^ $longitude);
      long $lDateTime = this.getLDateTime();
      result = result * 59 + (int)($lDateTime >>> 32 ^ $lDateTime);
      long $utcDateTime = this.getUtcDateTime();
      result = result * 59 + (int)($utcDateTime >>> 32 ^ $utcDateTime);
      long $odometer = Double.doubleToLongBits(this.getOdometer());
      result = result * 59 + (int)($odometer >>> 32 ^ $odometer);
      long $remainingWeeklyTime = this.getRemainingWeeklyTime();
      result = result * 59 + (int)($remainingWeeklyTime >>> 32 ^ $remainingWeeklyTime);
      long $remainingDutyTime = this.getRemainingDutyTime();
      result = result * 59 + (int)($remainingDutyTime >>> 32 ^ $remainingDutyTime);
      long $remainingDriveTime = this.getRemainingDriveTime();
      result = result * 59 + (int)($remainingDriveTime >>> 32 ^ $remainingDriveTime);
      long $remainingSleepTime = this.getRemainingSleepTime();
      result = result * 59 + (int)($remainingSleepTime >>> 32 ^ $remainingSleepTime);
      long $receivedTimestamp = this.getReceivedTimestamp();
      result = result * 59 + (int)($receivedTimestamp >>> 32 ^ $receivedTimestamp);
      long $updatedTimestamp = this.getUpdatedTimestamp();
      result = result * 59 + (int)($updatedTimestamp >>> 32 ^ $updatedTimestamp);
      Object $isVoilation = this.getIsVoilation();
      result = result * 59 + ($isVoilation == null ? 43 : $isVoilation.hashCode());
      Object $voilationHour = this.getVoilationHour();
      result = result * 59 + ($voilationHour == null ? 43 : $voilationHour.hashCode());
      Object $identifier = this.getIdentifier();
      result = result * 59 + ($identifier == null ? 43 : $identifier.hashCode());
      Object $shift = this.getShift();
      result = result * 59 + ($shift == null ? 43 : $shift.hashCode());
      Object $days = this.getDays();
      result = result * 59 + ($days == null ? 43 : $days.hashCode());
      Object $isReportGenerated = this.getIsReportGenerated();
      result = result * 59 + ($isReportGenerated == null ? 43 : $isReportGenerated.hashCode());
      Object $isSplit = this.getIsSplit();
      result = result * 59 + ($isSplit == null ? 43 : $isSplit.hashCode());
      Object $isVisible = this.getIsVisible();
      result = result * 59 + ($isVisible == null ? 43 : $isVisible.hashCode());
      Object $isActive = this.getIsActive();
      result = result * 59 + ($isActive == null ? 43 : $isActive.hashCode());
      Object $tokenNo = this.getTokenNo();
      result = result * 59 + ($tokenNo == null ? 43 : $tokenNo.hashCode());
      Object $status = this.getStatus();
      result = result * 59 + ($status == null ? 43 : $status.hashCode());
      Object $dateTime = this.getDateTime();
      result = result * 59 + ($dateTime == null ? 43 : $dateTime.hashCode());
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
      Object $engineStatus = this.getEngineStatus();
      result = result * 59 + ($engineStatus == null ? 43 : $engineStatus.hashCode());
      Object $origin = this.getOrigin();
      result = result * 59 + ($origin == null ? 43 : $origin.hashCode());
      Object $timezone = this.getTimezone();
      result = result * 59 + ($timezone == null ? 43 : $timezone.hashCode());
      Object $localId = this.getLocalId();
      result = result * 59 + ($localId == null ? 43 : $localId.hashCode());
      Object $email = this.getEmail();
      return result * 59 + ($email == null ? 43 : $email.hashCode());
   }

   @Override
   public String toString() {
      return "DriveringStatus(statusId="
         + this.getStatusId()
         + ", tokenNo="
         + this.getTokenNo()
         + ", driverId="
         + this.getDriverId()
         + ", vehicleId="
         + this.getVehicleId()
         + ", clientId="
         + this.getClientId()
         + ", status="
         + this.getStatus()
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
         + ", logType="
         + this.getLogType()
         + ", appVersion="
         + this.getAppVersion()
         + ", osVersion="
         + this.getOsVersion()
         + ", isVoilation="
         + this.getIsVoilation()
         + ", voilationHour="
         + this.getVoilationHour()
         + ", simCardNo="
         + this.getSimCardNo()
         + ", note="
         + this.getNote()
         + ", customLocation="
         + this.getCustomLocation()
         + ", currentLocation="
         + this.getCurrentLocation()
         + ", engineHour="
         + this.getEngineHour()
         + ", engineStatus="
         + this.getEngineStatus()
         + ", origin="
         + this.getOrigin()
         + ", odometer="
         + this.getOdometer()
         + ", identifier="
         + this.getIdentifier()
         + ", timezone="
         + this.getTimezone()
         + ", remainingWeeklyTime="
         + this.getRemainingWeeklyTime()
         + ", remainingDutyTime="
         + this.getRemainingDutyTime()
         + ", remainingDriveTime="
         + this.getRemainingDriveTime()
         + ", remainingSleepTime="
         + this.getRemainingSleepTime()
         + ", localId="
         + this.getLocalId()
         + ", shift="
         + this.getShift()
         + ", days="
         + this.getDays()
         + ", isReportGenerated="
         + this.getIsReportGenerated()
         + ", isSplit="
         + this.getIsSplit()
         + ", isVisible="
         + this.getIsVisible()
         + ", email="
         + this.getEmail()
         + ", isActive="
         + this.getIsActive()
         + ", receivedTimestamp="
         + this.getReceivedTimestamp()
         + ", updatedTimestamp="
         + this.getUpdatedTimestamp()
         + ")";
   }

   public long getStatusId() {
      return this.statusId;
   }

   public String getTokenNo() {
      return this.tokenNo;
   }

   public long getDriverId() {
      return this.driverId;
   }

   public long getVehicleId() {
      return this.vehicleId;
   }

   public long getClientId() {
      return this.clientId;
   }

   public String getStatus() {
      return this.status;
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

   public String getLogType() {
      return this.logType;
   }

   public String getAppVersion() {
      return this.appVersion;
   }

   public String getOsVersion() {
      return this.osVersion;
   }

   public Integer getIsVoilation() {
      return this.isVoilation;
   }

   public Integer getVoilationHour() {
      return this.voilationHour;
   }

   public String getSimCardNo() {
      return this.simCardNo;
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

   public String getEngineStatus() {
      return this.engineStatus;
   }

   public String getOrigin() {
      return this.origin;
   }

   public double getOdometer() {
      return this.odometer;
   }

   public Integer getIdentifier() {
      return this.identifier;
   }

   public String getTimezone() {
      return this.timezone;
   }

   public long getRemainingWeeklyTime() {
      return this.remainingWeeklyTime;
   }

   public long getRemainingDutyTime() {
      return this.remainingDutyTime;
   }

   public long getRemainingDriveTime() {
      return this.remainingDriveTime;
   }

   public long getRemainingSleepTime() {
      return this.remainingSleepTime;
   }

   public String getLocalId() {
      return this.localId;
   }

   public Integer getShift() {
      return this.shift;
   }

   public Integer getDays() {
      return this.days;
   }

   public Integer getIsReportGenerated() {
      return this.isReportGenerated;
   }

   public Integer getIsSplit() {
      return this.isSplit;
   }

   public Integer getIsVisible() {
      return this.isVisible;
   }

   public String getEmail() {
      return this.email;
   }

   public Integer getIsActive() {
      return this.isActive;
   }

   public long getReceivedTimestamp() {
      return this.receivedTimestamp;
   }

   public long getUpdatedTimestamp() {
      return this.updatedTimestamp;
   }

   public void setStatusId(final long statusId) {
      this.statusId = statusId;
   }

   public void setTokenNo(final String tokenNo) {
      this.tokenNo = tokenNo;
   }

   public void setDriverId(final long driverId) {
      this.driverId = driverId;
   }

   public void setVehicleId(final long vehicleId) {
      this.vehicleId = vehicleId;
   }

   public void setClientId(final long clientId) {
      this.clientId = clientId;
   }

   public void setStatus(final String status) {
      this.status = status;
   }

   public void setLattitude(final double lattitude) {
      this.lattitude = lattitude;
   }

   public void setLongitude(final double longitude) {
      this.longitude = longitude;
   }

   public void setDateTime(final String dateTime) {
      this.dateTime = dateTime;
   }

   public void setLDateTime(final long lDateTime) {
      this.lDateTime = lDateTime;
   }

   public void setUtcDateTime(final long utcDateTime) {
      this.utcDateTime = utcDateTime;
   }

   public void setLogType(final String logType) {
      this.logType = logType;
   }

   public void setAppVersion(final String appVersion) {
      this.appVersion = appVersion;
   }

   public void setOsVersion(final String osVersion) {
      this.osVersion = osVersion;
   }

   public void setIsVoilation(final Integer isVoilation) {
      this.isVoilation = isVoilation;
   }

   public void setVoilationHour(final Integer voilationHour) {
      this.voilationHour = voilationHour;
   }

   public void setSimCardNo(final String simCardNo) {
      this.simCardNo = simCardNo;
   }

   public void setNote(final String note) {
      this.note = note;
   }

   public void setCustomLocation(final String customLocation) {
      this.customLocation = customLocation;
   }

   public void setCurrentLocation(final String currentLocation) {
      this.currentLocation = currentLocation;
   }

   public void setEngineHour(final String engineHour) {
      this.engineHour = engineHour;
   }

   public void setEngineStatus(final String engineStatus) {
      this.engineStatus = engineStatus;
   }

   public void setOrigin(final String origin) {
      this.origin = origin;
   }

   public void setOdometer(final double odometer) {
      this.odometer = odometer;
   }

   public void setIdentifier(final Integer identifier) {
      this.identifier = identifier;
   }

   public void setTimezone(final String timezone) {
      this.timezone = timezone;
   }

   public void setRemainingWeeklyTime(final long remainingWeeklyTime) {
      this.remainingWeeklyTime = remainingWeeklyTime;
   }

   public void setRemainingDutyTime(final long remainingDutyTime) {
      this.remainingDutyTime = remainingDutyTime;
   }

   public void setRemainingDriveTime(final long remainingDriveTime) {
      this.remainingDriveTime = remainingDriveTime;
   }

   public void setRemainingSleepTime(final long remainingSleepTime) {
      this.remainingSleepTime = remainingSleepTime;
   }

   public void setLocalId(final String localId) {
      this.localId = localId;
   }

   public void setShift(final Integer shift) {
      this.shift = shift;
   }

   public void setDays(final Integer days) {
      this.days = days;
   }

   public void setIsReportGenerated(final Integer isReportGenerated) {
      this.isReportGenerated = isReportGenerated;
   }

   public void setIsSplit(final Integer isSplit) {
      this.isSplit = isSplit;
   }

   public void setIsVisible(final Integer isVisible) {
      this.isVisible = isVisible;
   }

   public void setEmail(final String email) {
      this.email = email;
   }

   public void setIsActive(final Integer isActive) {
      this.isActive = isActive;
   }

   public void setReceivedTimestamp(final long receivedTimestamp) {
      this.receivedTimestamp = receivedTimestamp;
   }

   public void setUpdatedTimestamp(final long updatedTimestamp) {
      this.updatedTimestamp = updatedTimestamp;
   }
}
