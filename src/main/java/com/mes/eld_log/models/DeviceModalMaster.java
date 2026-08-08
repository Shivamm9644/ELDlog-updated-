package com.mes.eld_log.models;

import java.io.Serializable;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.core.mapping.Document;

@EntityScan
@Document(
   collection = "device_modal_master"
)
public class DeviceModalMaster implements Serializable {
   private static final long serialVersionUID = 1L;
   private Integer deviceModalId;
   private String deviceModalName;
   private long clientId;
   private long addedTimestamp;
   private long updatedTimestamp;

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof DeviceModalMaster)) {
         return false;
      } else {
         DeviceModalMaster other = (DeviceModalMaster)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else if (this.getAddedTimestamp() != other.getAddedTimestamp()) {
            return false;
         } else if (this.getUpdatedTimestamp() != other.getUpdatedTimestamp()) {
            return false;
         } else {
            Object this$deviceModalId = this.getDeviceModalId();
            Object other$deviceModalId = other.getDeviceModalId();
            if (this$deviceModalId == null ? other$deviceModalId == null : this$deviceModalId.equals(other$deviceModalId)) {
               Object this$deviceModalName = this.getDeviceModalName();
               Object other$deviceModalName = other.getDeviceModalName();
               return this$deviceModalName == null ? other$deviceModalName == null : this$deviceModalName.equals(other$deviceModalName);
            } else {
               return false;
            }
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof DeviceModalMaster;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $clientId = this.getClientId();
      result = result * 59 + (int)($clientId >>> 32 ^ $clientId);
      long $addedTimestamp = this.getAddedTimestamp();
      result = result * 59 + (int)($addedTimestamp >>> 32 ^ $addedTimestamp);
      long $updatedTimestamp = this.getUpdatedTimestamp();
      result = result * 59 + (int)($updatedTimestamp >>> 32 ^ $updatedTimestamp);
      Object $deviceModalId = this.getDeviceModalId();
      result = result * 59 + ($deviceModalId == null ? 43 : $deviceModalId.hashCode());
      Object $deviceModalName = this.getDeviceModalName();
      return result * 59 + ($deviceModalName == null ? 43 : $deviceModalName.hashCode());
   }

   @Override
   public String toString() {
      return "DeviceModalMaster(deviceModalId="
         + this.getDeviceModalId()
         + ", deviceModalName="
         + this.getDeviceModalName()
         + ", clientId="
         + this.getClientId()
         + ", addedTimestamp="
         + this.getAddedTimestamp()
         + ", updatedTimestamp="
         + this.getUpdatedTimestamp()
         + ")";
   }

   public Integer getDeviceModalId() {
      return this.deviceModalId;
   }

   public String getDeviceModalName() {
      return this.deviceModalName;
   }

   public long getClientId() {
      return this.clientId;
   }

   public long getAddedTimestamp() {
      return this.addedTimestamp;
   }

   public long getUpdatedTimestamp() {
      return this.updatedTimestamp;
   }

   public void setDeviceModalId(final Integer deviceModalId) {
      this.deviceModalId = deviceModalId;
   }

   public void setDeviceModalName(final String deviceModalName) {
      this.deviceModalName = deviceModalName;
   }

   public void setClientId(final long clientId) {
      this.clientId = clientId;
   }

   public void setAddedTimestamp(final long addedTimestamp) {
      this.addedTimestamp = addedTimestamp;
   }

   public void setUpdatedTimestamp(final long updatedTimestamp) {
      this.updatedTimestamp = updatedTimestamp;
   }
}
