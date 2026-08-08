package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DriveringStatusCRUDDto {
   @JsonProperty("tokenNo")
   private String tokenNo;
   @JsonProperty("driverStatusId")
   private String driverStatusId;
   @JsonProperty("reportType")
   private String reportType;
   @JsonProperty("fromDate")
   private String fromDate;
   @JsonProperty("toDate")
   private String toDate;
   @JsonProperty("dateTime")
   private String dateTime;
   @JsonProperty("status")
   private String status;
   @JsonProperty("lastDriverId")
   private long lastDriverId;
   @JsonProperty("driverId")
   private long driverId;
   @JsonProperty("isVisible")
   private int isVisible;
   @JsonProperty("days")
   private int days;
   @JsonProperty("shift")
   private int shift;
   @JsonProperty("clientId")
   private long clientId;
   @JsonProperty("vehicleId")
   private long vehicleId;
   @JsonProperty("userId")
   private Integer userId;
   @JsonProperty("email")
   private String email;
   @JsonProperty("isGenerated")
   private Integer isGenerated;
   @JsonProperty("truckNo")
   private String truckNo;
   @JsonProperty("macAddress")
   private String macAddress;

   public String getTokenNo() {
      return this.tokenNo;
   }

   public String getDriverStatusId() {
      return this.driverStatusId;
   }

   public String getReportType() {
      return this.reportType;
   }

   public String getFromDate() {
      return this.fromDate;
   }

   public String getToDate() {
      return this.toDate;
   }

   public String getDateTime() {
      return this.dateTime;
   }

   public String getStatus() {
      return this.status;
   }

   public long getLastDriverId() {
      return this.lastDriverId;
   }

   public long getDriverId() {
      return this.driverId;
   }

   public int getIsVisible() {
      return this.isVisible;
   }

   public int getDays() {
      return this.days;
   }

   public int getShift() {
      return this.shift;
   }

   public long getClientId() {
      return this.clientId;
   }

   public long getVehicleId() {
      return this.vehicleId;
   }

   public Integer getUserId() {
      return this.userId;
   }

   public String getEmail() {
      return this.email;
   }

   public Integer getIsGenerated() {
      return this.isGenerated;
   }

   public String getTruckNo() {
      return this.truckNo;
   }

   public String getMacAddress() {
      return this.macAddress;
   }

   @JsonProperty("tokenNo")
   public void setTokenNo(final String tokenNo) {
      this.tokenNo = tokenNo;
   }

   @JsonProperty("driverStatusId")
   public void setDriverStatusId(final String driverStatusId) {
      this.driverStatusId = driverStatusId;
   }

   @JsonProperty("reportType")
   public void setReportType(final String reportType) {
      this.reportType = reportType;
   }

   @JsonProperty("fromDate")
   public void setFromDate(final String fromDate) {
      this.fromDate = fromDate;
   }

   @JsonProperty("toDate")
   public void setToDate(final String toDate) {
      this.toDate = toDate;
   }

   @JsonProperty("dateTime")
   public void setDateTime(final String dateTime) {
      this.dateTime = dateTime;
   }

   @JsonProperty("status")
   public void setStatus(final String status) {
      this.status = status;
   }

   @JsonProperty("lastDriverId")
   public void setLastDriverId(final long lastDriverId) {
      this.lastDriverId = lastDriverId;
   }

   @JsonProperty("driverId")
   public void setDriverId(final long driverId) {
      this.driverId = driverId;
   }

   @JsonProperty("isVisible")
   public void setIsVisible(final int isVisible) {
      this.isVisible = isVisible;
   }

   @JsonProperty("days")
   public void setDays(final int days) {
      this.days = days;
   }

   @JsonProperty("shift")
   public void setShift(final int shift) {
      this.shift = shift;
   }

   @JsonProperty("clientId")
   public void setClientId(final long clientId) {
      this.clientId = clientId;
   }

   @JsonProperty("vehicleId")
   public void setVehicleId(final long vehicleId) {
      this.vehicleId = vehicleId;
   }

   @JsonProperty("userId")
   public void setUserId(final Integer userId) {
      this.userId = userId;
   }

   @JsonProperty("email")
   public void setEmail(final String email) {
      this.email = email;
   }

   @JsonProperty("isGenerated")
   public void setIsGenerated(final Integer isGenerated) {
      this.isGenerated = isGenerated;
   }

   @JsonProperty("truckNo")
   public void setTruckNo(final String truckNo) {
      this.truckNo = truckNo;
   }

   @JsonProperty("macAddress")
   public void setMacAddress(final String macAddress) {
      this.macAddress = macAddress;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof DriveringStatusCRUDDto)) {
         return false;
      } else {
         DriveringStatusCRUDDto other = (DriveringStatusCRUDDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getLastDriverId() != other.getLastDriverId()) {
            return false;
         } else if (this.getDriverId() != other.getDriverId()) {
            return false;
         } else if (this.getIsVisible() != other.getIsVisible()) {
            return false;
         } else if (this.getDays() != other.getDays()) {
            return false;
         } else if (this.getShift() != other.getShift()) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else if (this.getVehicleId() != other.getVehicleId()) {
            return false;
         } else {
            Object this$userId = this.getUserId();
            Object other$userId = other.getUserId();
            if (this$userId == null ? other$userId == null : this$userId.equals(other$userId)) {
               Object this$isGenerated = this.getIsGenerated();
               Object other$isGenerated = other.getIsGenerated();
               if (this$isGenerated == null ? other$isGenerated == null : this$isGenerated.equals(other$isGenerated)) {
                  Object this$tokenNo = this.getTokenNo();
                  Object other$tokenNo = other.getTokenNo();
                  if (this$tokenNo == null ? other$tokenNo == null : this$tokenNo.equals(other$tokenNo)) {
                     Object this$driverStatusId = this.getDriverStatusId();
                     Object other$driverStatusId = other.getDriverStatusId();
                     if (this$driverStatusId == null ? other$driverStatusId == null : this$driverStatusId.equals(other$driverStatusId)) {
                        Object this$reportType = this.getReportType();
                        Object other$reportType = other.getReportType();
                        if (this$reportType == null ? other$reportType == null : this$reportType.equals(other$reportType)) {
                           Object this$fromDate = this.getFromDate();
                           Object other$fromDate = other.getFromDate();
                           if (this$fromDate == null ? other$fromDate == null : this$fromDate.equals(other$fromDate)) {
                              Object this$toDate = this.getToDate();
                              Object other$toDate = other.getToDate();
                              if (this$toDate == null ? other$toDate == null : this$toDate.equals(other$toDate)) {
                                 Object this$dateTime = this.getDateTime();
                                 Object other$dateTime = other.getDateTime();
                                 if (this$dateTime == null ? other$dateTime == null : this$dateTime.equals(other$dateTime)) {
                                    Object this$status = this.getStatus();
                                    Object other$status = other.getStatus();
                                    if (this$status == null ? other$status == null : this$status.equals(other$status)) {
                                       Object this$email = this.getEmail();
                                       Object other$email = other.getEmail();
                                       if (this$email == null ? other$email == null : this$email.equals(other$email)) {
                                          Object this$truckNo = this.getTruckNo();
                                          Object other$truckNo = other.getTruckNo();
                                          if (this$truckNo == null ? other$truckNo == null : this$truckNo.equals(other$truckNo)) {
                                             Object this$macAddress = this.getMacAddress();
                                             Object other$macAddress = other.getMacAddress();
                                             return this$macAddress == null ? other$macAddress == null : this$macAddress.equals(other$macAddress);
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
      return other instanceof DriveringStatusCRUDDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $lastDriverId = this.getLastDriverId();
      result = result * 59 + (int)($lastDriverId >>> 32 ^ $lastDriverId);
      long $driverId = this.getDriverId();
      result = result * 59 + (int)($driverId >>> 32 ^ $driverId);
      result = result * 59 + this.getIsVisible();
      result = result * 59 + this.getDays();
      result = result * 59 + this.getShift();
      long $clientId = this.getClientId();
      result = result * 59 + (int)($clientId >>> 32 ^ $clientId);
      long $vehicleId = this.getVehicleId();
      result = result * 59 + (int)($vehicleId >>> 32 ^ $vehicleId);
      Object $userId = this.getUserId();
      result = result * 59 + ($userId == null ? 43 : $userId.hashCode());
      Object $isGenerated = this.getIsGenerated();
      result = result * 59 + ($isGenerated == null ? 43 : $isGenerated.hashCode());
      Object $tokenNo = this.getTokenNo();
      result = result * 59 + ($tokenNo == null ? 43 : $tokenNo.hashCode());
      Object $driverStatusId = this.getDriverStatusId();
      result = result * 59 + ($driverStatusId == null ? 43 : $driverStatusId.hashCode());
      Object $reportType = this.getReportType();
      result = result * 59 + ($reportType == null ? 43 : $reportType.hashCode());
      Object $fromDate = this.getFromDate();
      result = result * 59 + ($fromDate == null ? 43 : $fromDate.hashCode());
      Object $toDate = this.getToDate();
      result = result * 59 + ($toDate == null ? 43 : $toDate.hashCode());
      Object $dateTime = this.getDateTime();
      result = result * 59 + ($dateTime == null ? 43 : $dateTime.hashCode());
      Object $status = this.getStatus();
      result = result * 59 + ($status == null ? 43 : $status.hashCode());
      Object $email = this.getEmail();
      result = result * 59 + ($email == null ? 43 : $email.hashCode());
      Object $truckNo = this.getTruckNo();
      result = result * 59 + ($truckNo == null ? 43 : $truckNo.hashCode());
      Object $macAddress = this.getMacAddress();
      return result * 59 + ($macAddress == null ? 43 : $macAddress.hashCode());
   }

   @Override
   public String toString() {
      return "DriveringStatusCRUDDto(tokenNo="
         + this.getTokenNo()
         + ", driverStatusId="
         + this.getDriverStatusId()
         + ", reportType="
         + this.getReportType()
         + ", fromDate="
         + this.getFromDate()
         + ", toDate="
         + this.getToDate()
         + ", dateTime="
         + this.getDateTime()
         + ", status="
         + this.getStatus()
         + ", lastDriverId="
         + this.getLastDriverId()
         + ", driverId="
         + this.getDriverId()
         + ", isVisible="
         + this.getIsVisible()
         + ", days="
         + this.getDays()
         + ", shift="
         + this.getShift()
         + ", clientId="
         + this.getClientId()
         + ", vehicleId="
         + this.getVehicleId()
         + ", userId="
         + this.getUserId()
         + ", email="
         + this.getEmail()
         + ", isGenerated="
         + this.getIsGenerated()
         + ", truckNo="
         + this.getTruckNo()
         + ", macAddress="
         + this.getMacAddress()
         + ")";
   }
}
