package com.mes.eld_log.models;

import java.io.Serializable;
import java.util.ArrayList;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.core.mapping.Document;

@EntityScan
@Document(
   collection = "client_master"
)
public class ClientMaster implements Serializable {
   private static final long serialVersionUID = 1L;
   private Integer clientId;
   private String companyId;
   private String clientName;
   private String dotNo;
   private long timezoneId;
   private String street;
   private String city;
   private long countryId;
   private long stateId;
   private long zipcode;
   private ArrayList terminalData;
   private String complianceMode;
   private String vehicleMotionThresold;
   private String exemptDriver;
   private long cycleUsaId;
   private long cargoTypeId;
   private long restartId;
   private long restBreakId;
   private String shortHaulException;
   private String personalUse;
   private String yardMoves;
   private String allowTracking;
   private String allowGpsTracking;
   private String allowIfta;
   private String project44;
   private String microPoint;
   private String status;
   private long addedTimestamp;
   private long updatedTimestamp;
   private long subscriptionEndTime;
   private long graceTime;

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ClientMaster)) {
         return false;
      } else {
         ClientMaster other = (ClientMaster)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getTimezoneId() != other.getTimezoneId()) {
            return false;
         } else if (this.getCountryId() != other.getCountryId()) {
            return false;
         } else if (this.getStateId() != other.getStateId()) {
            return false;
         } else if (this.getZipcode() != other.getZipcode()) {
            return false;
         } else if (this.getCycleUsaId() != other.getCycleUsaId()) {
            return false;
         } else if (this.getCargoTypeId() != other.getCargoTypeId()) {
            return false;
         } else if (this.getRestartId() != other.getRestartId()) {
            return false;
         } else if (this.getRestBreakId() != other.getRestBreakId()) {
            return false;
         } else if (this.getAddedTimestamp() != other.getAddedTimestamp()) {
            return false;
         } else if (this.getUpdatedTimestamp() != other.getUpdatedTimestamp()) {
            return false;
         } else if (this.getSubscriptionEndTime() != other.getSubscriptionEndTime()) {
            return false;
         } else if (this.getGraceTime() != other.getGraceTime()) {
            return false;
         } else {
            Object this$clientId = this.getClientId();
            Object other$clientId = other.getClientId();
            if (this$clientId == null ? other$clientId == null : this$clientId.equals(other$clientId)) {
               Object this$companyId = this.getCompanyId();
               Object other$companyId = other.getCompanyId();
               if (this$companyId == null ? other$companyId == null : this$companyId.equals(other$companyId)) {
                  Object this$clientName = this.getClientName();
                  Object other$clientName = other.getClientName();
                  if (this$clientName == null ? other$clientName == null : this$clientName.equals(other$clientName)) {
                     Object this$dotNo = this.getDotNo();
                     Object other$dotNo = other.getDotNo();
                     if (this$dotNo == null ? other$dotNo == null : this$dotNo.equals(other$dotNo)) {
                        Object this$street = this.getStreet();
                        Object other$street = other.getStreet();
                        if (this$street == null ? other$street == null : this$street.equals(other$street)) {
                           Object this$city = this.getCity();
                           Object other$city = other.getCity();
                           if (this$city == null ? other$city == null : this$city.equals(other$city)) {
                              Object this$terminalData = this.getTerminalData();
                              Object other$terminalData = other.getTerminalData();
                              if (this$terminalData == null ? other$terminalData == null : this$terminalData.equals(other$terminalData)) {
                                 Object this$complianceMode = this.getComplianceMode();
                                 Object other$complianceMode = other.getComplianceMode();
                                 if (this$complianceMode == null ? other$complianceMode == null : this$complianceMode.equals(other$complianceMode)) {
                                    Object this$vehicleMotionThresold = this.getVehicleMotionThresold();
                                    Object other$vehicleMotionThresold = other.getVehicleMotionThresold();
                                    if (this$vehicleMotionThresold == null
                                       ? other$vehicleMotionThresold == null
                                       : this$vehicleMotionThresold.equals(other$vehicleMotionThresold)) {
                                       Object this$exemptDriver = this.getExemptDriver();
                                       Object other$exemptDriver = other.getExemptDriver();
                                       if (this$exemptDriver == null ? other$exemptDriver == null : this$exemptDriver.equals(other$exemptDriver)) {
                                          Object this$shortHaulException = this.getShortHaulException();
                                          Object other$shortHaulException = other.getShortHaulException();
                                          if (this$shortHaulException == null
                                             ? other$shortHaulException == null
                                             : this$shortHaulException.equals(other$shortHaulException)) {
                                             Object this$personalUse = this.getPersonalUse();
                                             Object other$personalUse = other.getPersonalUse();
                                             if (this$personalUse == null ? other$personalUse == null : this$personalUse.equals(other$personalUse)) {
                                                Object this$yardMoves = this.getYardMoves();
                                                Object other$yardMoves = other.getYardMoves();
                                                if (this$yardMoves == null ? other$yardMoves == null : this$yardMoves.equals(other$yardMoves)) {
                                                   Object this$allowTracking = this.getAllowTracking();
                                                   Object other$allowTracking = other.getAllowTracking();
                                                   if (this$allowTracking == null
                                                      ? other$allowTracking == null
                                                      : this$allowTracking.equals(other$allowTracking)) {
                                                      Object this$allowGpsTracking = this.getAllowGpsTracking();
                                                      Object other$allowGpsTracking = other.getAllowGpsTracking();
                                                      if (this$allowGpsTracking == null
                                                         ? other$allowGpsTracking == null
                                                         : this$allowGpsTracking.equals(other$allowGpsTracking)) {
                                                         Object this$allowIfta = this.getAllowIfta();
                                                         Object other$allowIfta = other.getAllowIfta();
                                                         if (this$allowIfta == null ? other$allowIfta == null : this$allowIfta.equals(other$allowIfta)) {
                                                            Object this$project44 = this.getProject44();
                                                            Object other$project44 = other.getProject44();
                                                            if (this$project44 == null ? other$project44 == null : this$project44.equals(other$project44)) {
                                                               Object this$microPoint = this.getMicroPoint();
                                                               Object other$microPoint = other.getMicroPoint();
                                                               if (this$microPoint == null
                                                                  ? other$microPoint == null
                                                                  : this$microPoint.equals(other$microPoint)) {
                                                                  Object this$status = this.getStatus();
                                                                  Object other$status = other.getStatus();
                                                                  return this$status == null ? other$status == null : this$status.equals(other$status);
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
      return other instanceof ClientMaster;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $timezoneId = this.getTimezoneId();
      result = result * 59 + (int)($timezoneId >>> 32 ^ $timezoneId);
      long $countryId = this.getCountryId();
      result = result * 59 + (int)($countryId >>> 32 ^ $countryId);
      long $stateId = this.getStateId();
      result = result * 59 + (int)($stateId >>> 32 ^ $stateId);
      long $zipcode = this.getZipcode();
      result = result * 59 + (int)($zipcode >>> 32 ^ $zipcode);
      long $cycleUsaId = this.getCycleUsaId();
      result = result * 59 + (int)($cycleUsaId >>> 32 ^ $cycleUsaId);
      long $cargoTypeId = this.getCargoTypeId();
      result = result * 59 + (int)($cargoTypeId >>> 32 ^ $cargoTypeId);
      long $restartId = this.getRestartId();
      result = result * 59 + (int)($restartId >>> 32 ^ $restartId);
      long $restBreakId = this.getRestBreakId();
      result = result * 59 + (int)($restBreakId >>> 32 ^ $restBreakId);
      long $addedTimestamp = this.getAddedTimestamp();
      result = result * 59 + (int)($addedTimestamp >>> 32 ^ $addedTimestamp);
      long $updatedTimestamp = this.getUpdatedTimestamp();
      result = result * 59 + (int)($updatedTimestamp >>> 32 ^ $updatedTimestamp);
      long $subscriptionEndTime = this.getSubscriptionEndTime();
      result = result * 59 + (int)($subscriptionEndTime >>> 32 ^ $subscriptionEndTime);
      long $graceTime = this.getGraceTime();
      result = result * 59 + (int)($graceTime >>> 32 ^ $graceTime);
      Object $clientId = this.getClientId();
      result = result * 59 + ($clientId == null ? 43 : $clientId.hashCode());
      Object $companyId = this.getCompanyId();
      result = result * 59 + ($companyId == null ? 43 : $companyId.hashCode());
      Object $clientName = this.getClientName();
      result = result * 59 + ($clientName == null ? 43 : $clientName.hashCode());
      Object $dotNo = this.getDotNo();
      result = result * 59 + ($dotNo == null ? 43 : $dotNo.hashCode());
      Object $street = this.getStreet();
      result = result * 59 + ($street == null ? 43 : $street.hashCode());
      Object $city = this.getCity();
      result = result * 59 + ($city == null ? 43 : $city.hashCode());
      Object $terminalData = this.getTerminalData();
      result = result * 59 + ($terminalData == null ? 43 : $terminalData.hashCode());
      Object $complianceMode = this.getComplianceMode();
      result = result * 59 + ($complianceMode == null ? 43 : $complianceMode.hashCode());
      Object $vehicleMotionThresold = this.getVehicleMotionThresold();
      result = result * 59 + ($vehicleMotionThresold == null ? 43 : $vehicleMotionThresold.hashCode());
      Object $exemptDriver = this.getExemptDriver();
      result = result * 59 + ($exemptDriver == null ? 43 : $exemptDriver.hashCode());
      Object $shortHaulException = this.getShortHaulException();
      result = result * 59 + ($shortHaulException == null ? 43 : $shortHaulException.hashCode());
      Object $personalUse = this.getPersonalUse();
      result = result * 59 + ($personalUse == null ? 43 : $personalUse.hashCode());
      Object $yardMoves = this.getYardMoves();
      result = result * 59 + ($yardMoves == null ? 43 : $yardMoves.hashCode());
      Object $allowTracking = this.getAllowTracking();
      result = result * 59 + ($allowTracking == null ? 43 : $allowTracking.hashCode());
      Object $allowGpsTracking = this.getAllowGpsTracking();
      result = result * 59 + ($allowGpsTracking == null ? 43 : $allowGpsTracking.hashCode());
      Object $allowIfta = this.getAllowIfta();
      result = result * 59 + ($allowIfta == null ? 43 : $allowIfta.hashCode());
      Object $project44 = this.getProject44();
      result = result * 59 + ($project44 == null ? 43 : $project44.hashCode());
      Object $microPoint = this.getMicroPoint();
      result = result * 59 + ($microPoint == null ? 43 : $microPoint.hashCode());
      Object $status = this.getStatus();
      return result * 59 + ($status == null ? 43 : $status.hashCode());
   }

   @Override
   public String toString() {
      return "ClientMaster(clientId="
         + this.getClientId()
         + ", companyId="
         + this.getCompanyId()
         + ", clientName="
         + this.getClientName()
         + ", dotNo="
         + this.getDotNo()
         + ", timezoneId="
         + this.getTimezoneId()
         + ", street="
         + this.getStreet()
         + ", city="
         + this.getCity()
         + ", countryId="
         + this.getCountryId()
         + ", stateId="
         + this.getStateId()
         + ", zipcode="
         + this.getZipcode()
         + ", terminalData="
         + this.getTerminalData()
         + ", complianceMode="
         + this.getComplianceMode()
         + ", vehicleMotionThresold="
         + this.getVehicleMotionThresold()
         + ", exemptDriver="
         + this.getExemptDriver()
         + ", cycleUsaId="
         + this.getCycleUsaId()
         + ", cargoTypeId="
         + this.getCargoTypeId()
         + ", restartId="
         + this.getRestartId()
         + ", restBreakId="
         + this.getRestBreakId()
         + ", shortHaulException="
         + this.getShortHaulException()
         + ", personalUse="
         + this.getPersonalUse()
         + ", yardMoves="
         + this.getYardMoves()
         + ", allowTracking="
         + this.getAllowTracking()
         + ", allowGpsTracking="
         + this.getAllowGpsTracking()
         + ", allowIfta="
         + this.getAllowIfta()
         + ", project44="
         + this.getProject44()
         + ", microPoint="
         + this.getMicroPoint()
         + ", status="
         + this.getStatus()
         + ", addedTimestamp="
         + this.getAddedTimestamp()
         + ", updatedTimestamp="
         + this.getUpdatedTimestamp()
         + ", subscriptionEndTime="
         + this.getSubscriptionEndTime()
         + ", graceTime="
         + this.getGraceTime()
         + ")";
   }

   public Integer getClientId() {
      return this.clientId;
   }

   public String getCompanyId() {
      return this.companyId;
   }

   public String getClientName() {
      return this.clientName;
   }

   public String getDotNo() {
      return this.dotNo;
   }

   public long getTimezoneId() {
      return this.timezoneId;
   }

   public String getStreet() {
      return this.street;
   }

   public String getCity() {
      return this.city;
   }

   public long getCountryId() {
      return this.countryId;
   }

   public long getStateId() {
      return this.stateId;
   }

   public long getZipcode() {
      return this.zipcode;
   }

   public ArrayList getTerminalData() {
      return this.terminalData;
   }

   public String getComplianceMode() {
      return this.complianceMode;
   }

   public String getVehicleMotionThresold() {
      return this.vehicleMotionThresold;
   }

   public String getExemptDriver() {
      return this.exemptDriver;
   }

   public long getCycleUsaId() {
      return this.cycleUsaId;
   }

   public long getCargoTypeId() {
      return this.cargoTypeId;
   }

   public long getRestartId() {
      return this.restartId;
   }

   public long getRestBreakId() {
      return this.restBreakId;
   }

   public String getShortHaulException() {
      return this.shortHaulException;
   }

   public String getPersonalUse() {
      return this.personalUse;
   }

   public String getYardMoves() {
      return this.yardMoves;
   }

   public String getAllowTracking() {
      return this.allowTracking;
   }

   public String getAllowGpsTracking() {
      return this.allowGpsTracking;
   }

   public String getAllowIfta() {
      return this.allowIfta;
   }

   public String getProject44() {
      return this.project44;
   }

   public String getMicroPoint() {
      return this.microPoint;
   }

   public String getStatus() {
      return this.status;
   }

   public long getAddedTimestamp() {
      return this.addedTimestamp;
   }

   public long getUpdatedTimestamp() {
      return this.updatedTimestamp;
   }

   public long getSubscriptionEndTime() {
      return this.subscriptionEndTime;
   }

   public long getGraceTime() {
      return this.graceTime;
   }

   public void setClientId(final Integer clientId) {
      this.clientId = clientId;
   }

   public void setCompanyId(final String companyId) {
      this.companyId = companyId;
   }

   public void setClientName(final String clientName) {
      this.clientName = clientName;
   }

   public void setDotNo(final String dotNo) {
      this.dotNo = dotNo;
   }

   public void setTimezoneId(final long timezoneId) {
      this.timezoneId = timezoneId;
   }

   public void setStreet(final String street) {
      this.street = street;
   }

   public void setCity(final String city) {
      this.city = city;
   }

   public void setCountryId(final long countryId) {
      this.countryId = countryId;
   }

   public void setStateId(final long stateId) {
      this.stateId = stateId;
   }

   public void setZipcode(final long zipcode) {
      this.zipcode = zipcode;
   }

   public void setTerminalData(final ArrayList terminalData) {
      this.terminalData = terminalData;
   }

   public void setComplianceMode(final String complianceMode) {
      this.complianceMode = complianceMode;
   }

   public void setVehicleMotionThresold(final String vehicleMotionThresold) {
      this.vehicleMotionThresold = vehicleMotionThresold;
   }

   public void setExemptDriver(final String exemptDriver) {
      this.exemptDriver = exemptDriver;
   }

   public void setCycleUsaId(final long cycleUsaId) {
      this.cycleUsaId = cycleUsaId;
   }

   public void setCargoTypeId(final long cargoTypeId) {
      this.cargoTypeId = cargoTypeId;
   }

   public void setRestartId(final long restartId) {
      this.restartId = restartId;
   }

   public void setRestBreakId(final long restBreakId) {
      this.restBreakId = restBreakId;
   }

   public void setShortHaulException(final String shortHaulException) {
      this.shortHaulException = shortHaulException;
   }

   public void setPersonalUse(final String personalUse) {
      this.personalUse = personalUse;
   }

   public void setYardMoves(final String yardMoves) {
      this.yardMoves = yardMoves;
   }

   public void setAllowTracking(final String allowTracking) {
      this.allowTracking = allowTracking;
   }

   public void setAllowGpsTracking(final String allowGpsTracking) {
      this.allowGpsTracking = allowGpsTracking;
   }

   public void setAllowIfta(final String allowIfta) {
      this.allowIfta = allowIfta;
   }

   public void setProject44(final String project44) {
      this.project44 = project44;
   }

   public void setMicroPoint(final String microPoint) {
      this.microPoint = microPoint;
   }

   public void setStatus(final String status) {
      this.status = status;
   }

   public void setAddedTimestamp(final long addedTimestamp) {
      this.addedTimestamp = addedTimestamp;
   }

   public void setUpdatedTimestamp(final long updatedTimestamp) {
      this.updatedTimestamp = updatedTimestamp;
   }

   public void setSubscriptionEndTime(final long subscriptionEndTime) {
      this.subscriptionEndTime = subscriptionEndTime;
   }

   public void setGraceTime(final long graceTime) {
      this.graceTime = graceTime;
   }
}
