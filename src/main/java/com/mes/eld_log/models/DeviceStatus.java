package com.mes.eld_log.models;

import java.io.Serializable;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.core.mapping.Document;

@EntityScan
@Document(
   collection = "device_status"
)
public class DeviceStatus implements Serializable {
   private static final long serialVersionUID = 1L;
   private long driverId;
   private String status;
   private String tokenNo;
   private long addedTimestamp;
   private long updatedTimestamp;

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof DeviceStatus)) {
         return false;
      } else {
         DeviceStatus other = (DeviceStatus)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getDriverId() != other.getDriverId()) {
            return false;
         } else if (this.getAddedTimestamp() != other.getAddedTimestamp()) {
            return false;
         } else if (this.getUpdatedTimestamp() != other.getUpdatedTimestamp()) {
            return false;
         } else {
            Object this$status = this.getStatus();
            Object other$status = other.getStatus();
            if (this$status == null ? other$status == null : this$status.equals(other$status)) {
               Object this$tokenNo = this.getTokenNo();
               Object other$tokenNo = other.getTokenNo();
               return this$tokenNo == null ? other$tokenNo == null : this$tokenNo.equals(other$tokenNo);
            } else {
               return false;
            }
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof DeviceStatus;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $driverId = this.getDriverId();
      result = result * 59 + (int)($driverId >>> 32 ^ $driverId);
      long $addedTimestamp = this.getAddedTimestamp();
      result = result * 59 + (int)($addedTimestamp >>> 32 ^ $addedTimestamp);
      long $updatedTimestamp = this.getUpdatedTimestamp();
      result = result * 59 + (int)($updatedTimestamp >>> 32 ^ $updatedTimestamp);
      Object $status = this.getStatus();
      result = result * 59 + ($status == null ? 43 : $status.hashCode());
      Object $tokenNo = this.getTokenNo();
      return result * 59 + ($tokenNo == null ? 43 : $tokenNo.hashCode());
   }

   @Override
   public String toString() {
      return "DeviceStatus(driverId="
         + this.getDriverId()
         + ", status="
         + this.getStatus()
         + ", tokenNo="
         + this.getTokenNo()
         + ", addedTimestamp="
         + this.getAddedTimestamp()
         + ", updatedTimestamp="
         + this.getUpdatedTimestamp()
         + ")";
   }

   public long getDriverId() {
      return this.driverId;
   }

   public String getStatus() {
      return this.status;
   }

   public String getTokenNo() {
      return this.tokenNo;
   }

   public long getAddedTimestamp() {
      return this.addedTimestamp;
   }

   public long getUpdatedTimestamp() {
      return this.updatedTimestamp;
   }

   public void setDriverId(final long driverId) {
      this.driverId = driverId;
   }

   public void setStatus(final String status) {
      this.status = status;
   }

   public void setTokenNo(final String tokenNo) {
      this.tokenNo = tokenNo;
   }

   public void setAddedTimestamp(final long addedTimestamp) {
      this.addedTimestamp = addedTimestamp;
   }

   public void setUpdatedTimestamp(final long updatedTimestamp) {
      this.updatedTimestamp = updatedTimestamp;
   }
}
