package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ELDSupportViewDto {
   @JsonProperty("tokenNo")
   private String tokenNo;
   @JsonProperty("_id")
   private String _id;
   @JsonProperty("driverId")
   private long driverId;
   @JsonProperty("fromDate")
   private String fromDate;
   @JsonProperty("toDate")
   private String toDate;
   @JsonProperty("driverName")
   private String driverName;
   @JsonProperty("vehicleId")
   private long vehicleId;
   @JsonProperty("vehicleNo")
   private String vehicleNo;
   @JsonProperty("companyId")
   private long companyId;
   @JsonProperty("companyName")
   private String companyName;
   @JsonProperty("message")
   private String message;
   @JsonProperty("status")
   private String status;
   @JsonProperty("utcDateTime")
   private long utcDateTime;

   public String getTokenNo() {
      return this.tokenNo;
   }

   public String get_id() {
      return this._id;
   }

   public long getDriverId() {
      return this.driverId;
   }

   public String getFromDate() {
      return this.fromDate;
   }

   public String getToDate() {
      return this.toDate;
   }

   public String getDriverName() {
      return this.driverName;
   }

   public long getVehicleId() {
      return this.vehicleId;
   }

   public String getVehicleNo() {
      return this.vehicleNo;
   }

   public long getCompanyId() {
      return this.companyId;
   }

   public String getCompanyName() {
      return this.companyName;
   }

   public String getMessage() {
      return this.message;
   }

   public String getStatus() {
      return this.status;
   }

   public long getUtcDateTime() {
      return this.utcDateTime;
   }

   @JsonProperty("tokenNo")
   public void setTokenNo(final String tokenNo) {
      this.tokenNo = tokenNo;
   }

   @JsonProperty("_id")
   public void set_id(final String _id) {
      this._id = _id;
   }

   @JsonProperty("driverId")
   public void setDriverId(final long driverId) {
      this.driverId = driverId;
   }

   @JsonProperty("fromDate")
   public void setFromDate(final String fromDate) {
      this.fromDate = fromDate;
   }

   @JsonProperty("toDate")
   public void setToDate(final String toDate) {
      this.toDate = toDate;
   }

   @JsonProperty("driverName")
   public void setDriverName(final String driverName) {
      this.driverName = driverName;
   }

   @JsonProperty("vehicleId")
   public void setVehicleId(final long vehicleId) {
      this.vehicleId = vehicleId;
   }

   @JsonProperty("vehicleNo")
   public void setVehicleNo(final String vehicleNo) {
      this.vehicleNo = vehicleNo;
   }

   @JsonProperty("companyId")
   public void setCompanyId(final long companyId) {
      this.companyId = companyId;
   }

   @JsonProperty("companyName")
   public void setCompanyName(final String companyName) {
      this.companyName = companyName;
   }

   @JsonProperty("message")
   public void setMessage(final String message) {
      this.message = message;
   }

   @JsonProperty("status")
   public void setStatus(final String status) {
      this.status = status;
   }

   @JsonProperty("utcDateTime")
   public void setUtcDateTime(final long utcDateTime) {
      this.utcDateTime = utcDateTime;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ELDSupportViewDto)) {
         return false;
      } else {
         ELDSupportViewDto other = (ELDSupportViewDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getDriverId() != other.getDriverId()) {
            return false;
         } else if (this.getVehicleId() != other.getVehicleId()) {
            return false;
         } else if (this.getCompanyId() != other.getCompanyId()) {
            return false;
         } else if (this.getUtcDateTime() != other.getUtcDateTime()) {
            return false;
         } else {
            Object this$tokenNo = this.getTokenNo();
            Object other$tokenNo = other.getTokenNo();
            if (this$tokenNo == null ? other$tokenNo == null : this$tokenNo.equals(other$tokenNo)) {
               Object this$_id = this.get_id();
               Object other$_id = other.get_id();
               if (this$_id == null ? other$_id == null : this$_id.equals(other$_id)) {
                  Object this$fromDate = this.getFromDate();
                  Object other$fromDate = other.getFromDate();
                  if (this$fromDate == null ? other$fromDate == null : this$fromDate.equals(other$fromDate)) {
                     Object this$toDate = this.getToDate();
                     Object other$toDate = other.getToDate();
                     if (this$toDate == null ? other$toDate == null : this$toDate.equals(other$toDate)) {
                        Object this$driverName = this.getDriverName();
                        Object other$driverName = other.getDriverName();
                        if (this$driverName == null ? other$driverName == null : this$driverName.equals(other$driverName)) {
                           Object this$vehicleNo = this.getVehicleNo();
                           Object other$vehicleNo = other.getVehicleNo();
                           if (this$vehicleNo == null ? other$vehicleNo == null : this$vehicleNo.equals(other$vehicleNo)) {
                              Object this$companyName = this.getCompanyName();
                              Object other$companyName = other.getCompanyName();
                              if (this$companyName == null ? other$companyName == null : this$companyName.equals(other$companyName)) {
                                 Object this$message = this.getMessage();
                                 Object other$message = other.getMessage();
                                 if (this$message == null ? other$message == null : this$message.equals(other$message)) {
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
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof ELDSupportViewDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $driverId = this.getDriverId();
      result = result * 59 + (int)($driverId >>> 32 ^ $driverId);
      long $vehicleId = this.getVehicleId();
      result = result * 59 + (int)($vehicleId >>> 32 ^ $vehicleId);
      long $companyId = this.getCompanyId();
      result = result * 59 + (int)($companyId >>> 32 ^ $companyId);
      long $utcDateTime = this.getUtcDateTime();
      result = result * 59 + (int)($utcDateTime >>> 32 ^ $utcDateTime);
      Object $tokenNo = this.getTokenNo();
      result = result * 59 + ($tokenNo == null ? 43 : $tokenNo.hashCode());
      Object $_id = this.get_id();
      result = result * 59 + ($_id == null ? 43 : $_id.hashCode());
      Object $fromDate = this.getFromDate();
      result = result * 59 + ($fromDate == null ? 43 : $fromDate.hashCode());
      Object $toDate = this.getToDate();
      result = result * 59 + ($toDate == null ? 43 : $toDate.hashCode());
      Object $driverName = this.getDriverName();
      result = result * 59 + ($driverName == null ? 43 : $driverName.hashCode());
      Object $vehicleNo = this.getVehicleNo();
      result = result * 59 + ($vehicleNo == null ? 43 : $vehicleNo.hashCode());
      Object $companyName = this.getCompanyName();
      result = result * 59 + ($companyName == null ? 43 : $companyName.hashCode());
      Object $message = this.getMessage();
      result = result * 59 + ($message == null ? 43 : $message.hashCode());
      Object $status = this.getStatus();
      return result * 59 + ($status == null ? 43 : $status.hashCode());
   }

   @Override
   public String toString() {
      return "ELDSupportViewDto(tokenNo="
         + this.getTokenNo()
         + ", _id="
         + this.get_id()
         + ", driverId="
         + this.getDriverId()
         + ", fromDate="
         + this.getFromDate()
         + ", toDate="
         + this.getToDate()
         + ", driverName="
         + this.getDriverName()
         + ", vehicleId="
         + this.getVehicleId()
         + ", vehicleNo="
         + this.getVehicleNo()
         + ", companyId="
         + this.getCompanyId()
         + ", companyName="
         + this.getCompanyName()
         + ", message="
         + this.getMessage()
         + ", status="
         + this.getStatus()
         + ", utcDateTime="
         + this.getUtcDateTime()
         + ")";
   }
}
