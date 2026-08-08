package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

public class ClientMasterViewDto {
   @JsonProperty("companyId")
   private String companyId;
   @JsonProperty("clientId")
   private Integer clientId;
   @JsonProperty("clientName")
   private String clientName;
   @JsonProperty("dotNo")
   private String dotNo;
   @JsonProperty("timezoneId")
   private long timezoneId;
   @JsonProperty("timezone")
   private String timezone;
   @JsonProperty("street")
   private String street;
   @JsonProperty("city")
   private String city;
   @JsonProperty("countryId")
   private long countryId;
   @JsonProperty("countryName")
   private ArrayList countryName;
   @JsonProperty("stateId")
   private long stateId;
   @JsonProperty("stateName")
   private ArrayList stateName;
   @JsonProperty("zipcode")
   private long zipcode;
   @JsonProperty("terminalData")
   private ArrayList terminalData;
   @JsonProperty("complianceMode")
   private String complianceMode;
   @JsonProperty("vehicleMotionThresold")
   private String vehicleMotionThresold;
   @JsonProperty("exemptDriver")
   private String exemptDriver;
   @JsonProperty("cycleUsaId")
   private long cycleUsaId;
   @JsonProperty("cycleUsaName")
   private ArrayList cycleUsaName;
   @JsonProperty("cargoTypeId")
   private long cargoTypeId;
   @JsonProperty("cargoTypeName")
   private ArrayList cargoTypeName;
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
   @JsonProperty("personalUse")
   private String personalUse;
   @JsonProperty("yardMoves")
   private String yardMoves;
   @JsonProperty("allowTracking")
   private String allowTracking;
   @JsonProperty("allowGpsTracking")
   private String allowGpsTracking;
   @JsonProperty("allowIfta")
   private String allowIfta;
   @JsonProperty("project44")
   private String project44;
   @JsonProperty("microPoint")
   private String microPoint;
   @JsonProperty("status")
   private String status;
   @JsonProperty("addedTimestamp")
   private long addedTimestamp;
   @JsonProperty("updatedTimestamp")
   private long updatedTimestamp;
   @JsonProperty("lattitude")
   private double lattitude;
   @JsonProperty("longitude")
   private double longitude;
   @JsonProperty("subscriptionEndTime")
   private long subscriptionEndTime;
   @JsonProperty("graceTime")
   private long graceTime;

   public String getCompanyId() {
      return this.companyId;
   }

   public Integer getClientId() {
      return this.clientId;
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

   public String getTimezone() {
      return this.timezone;
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

   public ArrayList getCountryName() {
      return this.countryName;
   }

   public long getStateId() {
      return this.stateId;
   }

   public ArrayList getStateName() {
      return this.stateName;
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

   public ArrayList getCycleUsaName() {
      return this.cycleUsaName;
   }

   public long getCargoTypeId() {
      return this.cargoTypeId;
   }

   public ArrayList getCargoTypeName() {
      return this.cargoTypeName;
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

   public double getLattitude() {
      return this.lattitude;
   }

   public double getLongitude() {
      return this.longitude;
   }

   public long getSubscriptionEndTime() {
      return this.subscriptionEndTime;
   }

   public long getGraceTime() {
      return this.graceTime;
   }

   @JsonProperty("companyId")
   public void setCompanyId(final String companyId) {
      this.companyId = companyId;
   }

   @JsonProperty("clientId")
   public void setClientId(final Integer clientId) {
      this.clientId = clientId;
   }

   @JsonProperty("clientName")
   public void setClientName(final String clientName) {
      this.clientName = clientName;
   }

   @JsonProperty("dotNo")
   public void setDotNo(final String dotNo) {
      this.dotNo = dotNo;
   }

   @JsonProperty("timezoneId")
   public void setTimezoneId(final long timezoneId) {
      this.timezoneId = timezoneId;
   }

   @JsonProperty("timezone")
   public void setTimezone(final String timezone) {
      this.timezone = timezone;
   }

   @JsonProperty("street")
   public void setStreet(final String street) {
      this.street = street;
   }

   @JsonProperty("city")
   public void setCity(final String city) {
      this.city = city;
   }

   @JsonProperty("countryId")
   public void setCountryId(final long countryId) {
      this.countryId = countryId;
   }

   @JsonProperty("countryName")
   public void setCountryName(final ArrayList countryName) {
      this.countryName = countryName;
   }

   @JsonProperty("stateId")
   public void setStateId(final long stateId) {
      this.stateId = stateId;
   }

   @JsonProperty("stateName")
   public void setStateName(final ArrayList stateName) {
      this.stateName = stateName;
   }

   @JsonProperty("zipcode")
   public void setZipcode(final long zipcode) {
      this.zipcode = zipcode;
   }

   @JsonProperty("terminalData")
   public void setTerminalData(final ArrayList terminalData) {
      this.terminalData = terminalData;
   }

   @JsonProperty("complianceMode")
   public void setComplianceMode(final String complianceMode) {
      this.complianceMode = complianceMode;
   }

   @JsonProperty("vehicleMotionThresold")
   public void setVehicleMotionThresold(final String vehicleMotionThresold) {
      this.vehicleMotionThresold = vehicleMotionThresold;
   }

   @JsonProperty("exemptDriver")
   public void setExemptDriver(final String exemptDriver) {
      this.exemptDriver = exemptDriver;
   }

   @JsonProperty("cycleUsaId")
   public void setCycleUsaId(final long cycleUsaId) {
      this.cycleUsaId = cycleUsaId;
   }

   @JsonProperty("cycleUsaName")
   public void setCycleUsaName(final ArrayList cycleUsaName) {
      this.cycleUsaName = cycleUsaName;
   }

   @JsonProperty("cargoTypeId")
   public void setCargoTypeId(final long cargoTypeId) {
      this.cargoTypeId = cargoTypeId;
   }

   @JsonProperty("cargoTypeName")
   public void setCargoTypeName(final ArrayList cargoTypeName) {
      this.cargoTypeName = cargoTypeName;
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

   @JsonProperty("personalUse")
   public void setPersonalUse(final String personalUse) {
      this.personalUse = personalUse;
   }

   @JsonProperty("yardMoves")
   public void setYardMoves(final String yardMoves) {
      this.yardMoves = yardMoves;
   }

   @JsonProperty("allowTracking")
   public void setAllowTracking(final String allowTracking) {
      this.allowTracking = allowTracking;
   }

   @JsonProperty("allowGpsTracking")
   public void setAllowGpsTracking(final String allowGpsTracking) {
      this.allowGpsTracking = allowGpsTracking;
   }

   @JsonProperty("allowIfta")
   public void setAllowIfta(final String allowIfta) {
      this.allowIfta = allowIfta;
   }

   @JsonProperty("project44")
   public void setProject44(final String project44) {
      this.project44 = project44;
   }

   @JsonProperty("microPoint")
   public void setMicroPoint(final String microPoint) {
      this.microPoint = microPoint;
   }

   @JsonProperty("status")
   public void setStatus(final String status) {
      this.status = status;
   }

   @JsonProperty("addedTimestamp")
   public void setAddedTimestamp(final long addedTimestamp) {
      this.addedTimestamp = addedTimestamp;
   }

   @JsonProperty("updatedTimestamp")
   public void setUpdatedTimestamp(final long updatedTimestamp) {
      this.updatedTimestamp = updatedTimestamp;
   }

   @JsonProperty("lattitude")
   public void setLattitude(final double lattitude) {
      this.lattitude = lattitude;
   }

   @JsonProperty("longitude")
   public void setLongitude(final double longitude) {
      this.longitude = longitude;
   }

   @JsonProperty("subscriptionEndTime")
   public void setSubscriptionEndTime(final long subscriptionEndTime) {
      this.subscriptionEndTime = subscriptionEndTime;
   }

   @JsonProperty("graceTime")
   public void setGraceTime(final long graceTime) {
      this.graceTime = graceTime;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ClientMasterViewDto)) {
         return false;
      } else {
         ClientMasterViewDto other = (ClientMasterViewDto)o;
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
         } else if (Double.compare(this.getLattitude(), other.getLattitude()) != 0) {
            return false;
         } else if (Double.compare(this.getLongitude(), other.getLongitude()) != 0) {
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
                        Object this$timezone = this.getTimezone();
                        Object other$timezone = other.getTimezone();
                        if (this$timezone == null ? other$timezone == null : this$timezone.equals(other$timezone)) {
                           Object this$street = this.getStreet();
                           Object other$street = other.getStreet();
                           if (this$street == null ? other$street == null : this$street.equals(other$street)) {
                              Object this$city = this.getCity();
                              Object other$city = other.getCity();
                              if (this$city == null ? other$city == null : this$city.equals(other$city)) {
                                 Object this$countryName = this.getCountryName();
                                 Object other$countryName = other.getCountryName();
                                 if (this$countryName == null ? other$countryName == null : this$countryName.equals(other$countryName)) {
                                    Object this$stateName = this.getStateName();
                                    Object other$stateName = other.getStateName();
                                    if (this$stateName == null ? other$stateName == null : this$stateName.equals(other$stateName)) {
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
                                                   Object this$cycleUsaName = this.getCycleUsaName();
                                                   Object other$cycleUsaName = other.getCycleUsaName();
                                                   if (this$cycleUsaName == null ? other$cycleUsaName == null : this$cycleUsaName.equals(other$cycleUsaName)) {
                                                      Object this$cargoTypeName = this.getCargoTypeName();
                                                      Object other$cargoTypeName = other.getCargoTypeName();
                                                      if (this$cargoTypeName == null
                                                         ? other$cargoTypeName == null
                                                         : this$cargoTypeName.equals(other$cargoTypeName)) {
                                                         Object this$restartName = this.getRestartName();
                                                         Object other$restartName = other.getRestartName();
                                                         if (this$restartName == null ? other$restartName == null : this$restartName.equals(other$restartName)
                                                            )
                                                          {
                                                            Object this$restBreakName = this.getRestBreakName();
                                                            Object other$restBreakName = other.getRestBreakName();
                                                            if (this$restBreakName == null
                                                               ? other$restBreakName == null
                                                               : this$restBreakName.equals(other$restBreakName)) {
                                                               Object this$shortHaulException = this.getShortHaulException();
                                                               Object other$shortHaulException = other.getShortHaulException();
                                                               if (this$shortHaulException == null
                                                                  ? other$shortHaulException == null
                                                                  : this$shortHaulException.equals(other$shortHaulException)) {
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
                                                                              if (this$allowIfta == null
                                                                                 ? other$allowIfta == null
                                                                                 : this$allowIfta.equals(other$allowIfta)) {
                                                                                 Object this$project44 = this.getProject44();
                                                                                 Object other$project44 = other.getProject44();
                                                                                 if (this$project44 == null
                                                                                    ? other$project44 == null
                                                                                    : this$project44.equals(other$project44)) {
                                                                                    Object this$microPoint = this.getMicroPoint();
                                                                                    Object other$microPoint = other.getMicroPoint();
                                                                                    if (this$microPoint == null
                                                                                       ? other$microPoint == null
                                                                                       : this$microPoint.equals(other$microPoint)) {
                                                                                       Object this$status = this.getStatus();
                                                                                       Object other$status = other.getStatus();
                                                                                       return this$status == null
                                                                                          ? other$status == null
                                                                                          : this$status.equals(other$status);
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
      return other instanceof ClientMasterViewDto;
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
      long $lattitude = Double.doubleToLongBits(this.getLattitude());
      result = result * 59 + (int)($lattitude >>> 32 ^ $lattitude);
      long $longitude = Double.doubleToLongBits(this.getLongitude());
      result = result * 59 + (int)($longitude >>> 32 ^ $longitude);
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
      Object $timezone = this.getTimezone();
      result = result * 59 + ($timezone == null ? 43 : $timezone.hashCode());
      Object $street = this.getStreet();
      result = result * 59 + ($street == null ? 43 : $street.hashCode());
      Object $city = this.getCity();
      result = result * 59 + ($city == null ? 43 : $city.hashCode());
      Object $countryName = this.getCountryName();
      result = result * 59 + ($countryName == null ? 43 : $countryName.hashCode());
      Object $stateName = this.getStateName();
      result = result * 59 + ($stateName == null ? 43 : $stateName.hashCode());
      Object $terminalData = this.getTerminalData();
      result = result * 59 + ($terminalData == null ? 43 : $terminalData.hashCode());
      Object $complianceMode = this.getComplianceMode();
      result = result * 59 + ($complianceMode == null ? 43 : $complianceMode.hashCode());
      Object $vehicleMotionThresold = this.getVehicleMotionThresold();
      result = result * 59 + ($vehicleMotionThresold == null ? 43 : $vehicleMotionThresold.hashCode());
      Object $exemptDriver = this.getExemptDriver();
      result = result * 59 + ($exemptDriver == null ? 43 : $exemptDriver.hashCode());
      Object $cycleUsaName = this.getCycleUsaName();
      result = result * 59 + ($cycleUsaName == null ? 43 : $cycleUsaName.hashCode());
      Object $cargoTypeName = this.getCargoTypeName();
      result = result * 59 + ($cargoTypeName == null ? 43 : $cargoTypeName.hashCode());
      Object $restartName = this.getRestartName();
      result = result * 59 + ($restartName == null ? 43 : $restartName.hashCode());
      Object $restBreakName = this.getRestBreakName();
      result = result * 59 + ($restBreakName == null ? 43 : $restBreakName.hashCode());
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
      return "ClientMasterViewDto(companyId="
         + this.getCompanyId()
         + ", clientId="
         + this.getClientId()
         + ", clientName="
         + this.getClientName()
         + ", dotNo="
         + this.getDotNo()
         + ", timezoneId="
         + this.getTimezoneId()
         + ", timezone="
         + this.getTimezone()
         + ", street="
         + this.getStreet()
         + ", city="
         + this.getCity()
         + ", countryId="
         + this.getCountryId()
         + ", countryName="
         + this.getCountryName()
         + ", stateId="
         + this.getStateId()
         + ", stateName="
         + this.getStateName()
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
         + ", cycleUsaName="
         + this.getCycleUsaName()
         + ", cargoTypeId="
         + this.getCargoTypeId()
         + ", cargoTypeName="
         + this.getCargoTypeName()
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
         + ", lattitude="
         + this.getLattitude()
         + ", longitude="
         + this.getLongitude()
         + ", subscriptionEndTime="
         + this.getSubscriptionEndTime()
         + ", graceTime="
         + this.getGraceTime()
         + ")";
   }
}
