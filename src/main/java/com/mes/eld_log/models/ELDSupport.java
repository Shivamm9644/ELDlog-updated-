package com.mes.eld_log.models;

import java.io.Serializable;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.core.mapping.Document;

@EntityScan
@Document(
   collection = "eld_support"
)
public class ELDSupport implements Serializable {
   private static final long serialVersionUID = 1L;
   private String tokenNo;
   private long driverId;
   private long vehicleId;
   private long companyId;
   private String message;
   private String status;
   private long utcDateTime;
   private String remark;
   private long receivedTimestamp;

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ELDSupport)) {
         return false;
      } else {
         ELDSupport other = (ELDSupport)o;
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
         } else if (this.getReceivedTimestamp() != other.getReceivedTimestamp()) {
            return false;
         } else {
            Object this$tokenNo = this.getTokenNo();
            Object other$tokenNo = other.getTokenNo();
            if (this$tokenNo == null ? other$tokenNo == null : this$tokenNo.equals(other$tokenNo)) {
               Object this$message = this.getMessage();
               Object other$message = other.getMessage();
               if (this$message == null ? other$message == null : this$message.equals(other$message)) {
                  Object this$status = this.getStatus();
                  Object other$status = other.getStatus();
                  if (this$status == null ? other$status == null : this$status.equals(other$status)) {
                     Object this$remark = this.getRemark();
                     Object other$remark = other.getRemark();
                     return this$remark == null ? other$remark == null : this$remark.equals(other$remark);
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
      return other instanceof ELDSupport;
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
      long $receivedTimestamp = this.getReceivedTimestamp();
      result = result * 59 + (int)($receivedTimestamp >>> 32 ^ $receivedTimestamp);
      Object $tokenNo = this.getTokenNo();
      result = result * 59 + ($tokenNo == null ? 43 : $tokenNo.hashCode());
      Object $message = this.getMessage();
      result = result * 59 + ($message == null ? 43 : $message.hashCode());
      Object $status = this.getStatus();
      result = result * 59 + ($status == null ? 43 : $status.hashCode());
      Object $remark = this.getRemark();
      return result * 59 + ($remark == null ? 43 : $remark.hashCode());
   }

   @Override
   public String toString() {
      return "ELDSupport(tokenNo="
         + this.getTokenNo()
         + ", driverId="
         + this.getDriverId()
         + ", vehicleId="
         + this.getVehicleId()
         + ", companyId="
         + this.getCompanyId()
         + ", message="
         + this.getMessage()
         + ", status="
         + this.getStatus()
         + ", utcDateTime="
         + this.getUtcDateTime()
         + ", remark="
         + this.getRemark()
         + ", receivedTimestamp="
         + this.getReceivedTimestamp()
         + ")";
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

   public long getCompanyId() {
      return this.companyId;
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

   public String getRemark() {
      return this.remark;
   }

   public long getReceivedTimestamp() {
      return this.receivedTimestamp;
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

   public void setCompanyId(final long companyId) {
      this.companyId = companyId;
   }

   public void setMessage(final String message) {
      this.message = message;
   }

   public void setStatus(final String status) {
      this.status = status;
   }

   public void setUtcDateTime(final long utcDateTime) {
      this.utcDateTime = utcDateTime;
   }

   public void setRemark(final String remark) {
      this.remark = remark;
   }

   public void setReceivedTimestamp(final long receivedTimestamp) {
      this.receivedTimestamp = receivedTimestamp;
   }
}
