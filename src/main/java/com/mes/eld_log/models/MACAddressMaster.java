package com.mes.eld_log.models;

import java.io.Serializable;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.core.mapping.Document;

@EntityScan
@Document(
   collection = "mac_address_master"
)
public class MACAddressMaster implements Serializable {
   private static final long serialVersionUID = 1L;
   private long driverId;
   private String tokenNo;
   private long vehicleId;
   private String macAddress;
   private String serialNo;
   private String version;
   private String modelNo;
   private String deviceStatus;
   private long addedTimestamp;
   private long updatedTimestamp;

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof MACAddressMaster)) {
         return false;
      } else {
         MACAddressMaster other = (MACAddressMaster)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getDriverId() != other.getDriverId()) {
            return false;
         } else if (this.getVehicleId() != other.getVehicleId()) {
            return false;
         } else if (this.getAddedTimestamp() != other.getAddedTimestamp()) {
            return false;
         } else if (this.getUpdatedTimestamp() != other.getUpdatedTimestamp()) {
            return false;
         } else {
            Object this$tokenNo = this.getTokenNo();
            Object other$tokenNo = other.getTokenNo();
            if (this$tokenNo == null ? other$tokenNo == null : this$tokenNo.equals(other$tokenNo)) {
               Object this$macAddress = this.getMacAddress();
               Object other$macAddress = other.getMacAddress();
               if (this$macAddress == null ? other$macAddress == null : this$macAddress.equals(other$macAddress)) {
                  Object this$serialNo = this.getSerialNo();
                  Object other$serialNo = other.getSerialNo();
                  if (this$serialNo == null ? other$serialNo == null : this$serialNo.equals(other$serialNo)) {
                     Object this$version = this.getVersion();
                     Object other$version = other.getVersion();
                     if (this$version == null ? other$version == null : this$version.equals(other$version)) {
                        Object this$modelNo = this.getModelNo();
                        Object other$modelNo = other.getModelNo();
                        if (this$modelNo == null ? other$modelNo == null : this$modelNo.equals(other$modelNo)) {
                           Object this$deviceStatus = this.getDeviceStatus();
                           Object other$deviceStatus = other.getDeviceStatus();
                           return this$deviceStatus == null ? other$deviceStatus == null : this$deviceStatus.equals(other$deviceStatus);
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
      return other instanceof MACAddressMaster;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $driverId = this.getDriverId();
      result = result * 59 + (int)($driverId >>> 32 ^ $driverId);
      long $vehicleId = this.getVehicleId();
      result = result * 59 + (int)($vehicleId >>> 32 ^ $vehicleId);
      long $addedTimestamp = this.getAddedTimestamp();
      result = result * 59 + (int)($addedTimestamp >>> 32 ^ $addedTimestamp);
      long $updatedTimestamp = this.getUpdatedTimestamp();
      result = result * 59 + (int)($updatedTimestamp >>> 32 ^ $updatedTimestamp);
      Object $tokenNo = this.getTokenNo();
      result = result * 59 + ($tokenNo == null ? 43 : $tokenNo.hashCode());
      Object $macAddress = this.getMacAddress();
      result = result * 59 + ($macAddress == null ? 43 : $macAddress.hashCode());
      Object $serialNo = this.getSerialNo();
      result = result * 59 + ($serialNo == null ? 43 : $serialNo.hashCode());
      Object $version = this.getVersion();
      result = result * 59 + ($version == null ? 43 : $version.hashCode());
      Object $modelNo = this.getModelNo();
      result = result * 59 + ($modelNo == null ? 43 : $modelNo.hashCode());
      Object $deviceStatus = this.getDeviceStatus();
      return result * 59 + ($deviceStatus == null ? 43 : $deviceStatus.hashCode());
   }

   @Override
   public String toString() {
      return "MACAddressMaster(driverId="
         + this.getDriverId()
         + ", tokenNo="
         + this.getTokenNo()
         + ", vehicleId="
         + this.getVehicleId()
         + ", macAddress="
         + this.getMacAddress()
         + ", serialNo="
         + this.getSerialNo()
         + ", version="
         + this.getVersion()
         + ", modelNo="
         + this.getModelNo()
         + ", deviceStatus="
         + this.getDeviceStatus()
         + ", addedTimestamp="
         + this.getAddedTimestamp()
         + ", updatedTimestamp="
         + this.getUpdatedTimestamp()
         + ")";
   }

   public long getDriverId() {
      return this.driverId;
   }

   public String getTokenNo() {
      return this.tokenNo;
   }

   public long getVehicleId() {
      return this.vehicleId;
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

   public String getDeviceStatus() {
      return this.deviceStatus;
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

   public void setTokenNo(final String tokenNo) {
      this.tokenNo = tokenNo;
   }

   public void setVehicleId(final long vehicleId) {
      this.vehicleId = vehicleId;
   }

   public void setMacAddress(final String macAddress) {
      this.macAddress = macAddress;
   }

   public void setSerialNo(final String serialNo) {
      this.serialNo = serialNo;
   }

   public void setVersion(final String version) {
      this.version = version;
   }

   public void setModelNo(final String modelNo) {
      this.modelNo = modelNo;
   }

   public void setDeviceStatus(final String deviceStatus) {
      this.deviceStatus = deviceStatus;
   }

   public void setAddedTimestamp(final long addedTimestamp) {
      this.addedTimestamp = addedTimestamp;
   }

   public void setUpdatedTimestamp(final long updatedTimestamp) {
      this.updatedTimestamp = updatedTimestamp;
   }
}
