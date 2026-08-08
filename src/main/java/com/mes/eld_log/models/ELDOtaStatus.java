package com.mes.eld_log.models;

import java.io.Serializable;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.core.mapping.Document;

@EntityScan
@Document(
   collection = "eld_ota_status"
)
public class ELDOtaStatus implements Serializable {
   private static final long serialVersionUID = 1L;
   private Integer otaStatusId;
   private String hardwareVersion;
   private String firmwareVersion;
   private String deviceId;
   private long addedTimestamp;

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ELDOtaStatus)) {
         return false;
      } else {
         ELDOtaStatus other = (ELDOtaStatus)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getAddedTimestamp() != other.getAddedTimestamp()) {
            return false;
         } else {
            Object this$otaStatusId = this.getOtaStatusId();
            Object other$otaStatusId = other.getOtaStatusId();
            if (this$otaStatusId == null ? other$otaStatusId == null : this$otaStatusId.equals(other$otaStatusId)) {
               Object this$hardwareVersion = this.getHardwareVersion();
               Object other$hardwareVersion = other.getHardwareVersion();
               if (this$hardwareVersion == null ? other$hardwareVersion == null : this$hardwareVersion.equals(other$hardwareVersion)) {
                  Object this$firmwareVersion = this.getFirmwareVersion();
                  Object other$firmwareVersion = other.getFirmwareVersion();
                  if (this$firmwareVersion == null ? other$firmwareVersion == null : this$firmwareVersion.equals(other$firmwareVersion)) {
                     Object this$deviceId = this.getDeviceId();
                     Object other$deviceId = other.getDeviceId();
                     return this$deviceId == null ? other$deviceId == null : this$deviceId.equals(other$deviceId);
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
      return other instanceof ELDOtaStatus;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $addedTimestamp = this.getAddedTimestamp();
      result = result * 59 + (int)($addedTimestamp >>> 32 ^ $addedTimestamp);
      Object $otaStatusId = this.getOtaStatusId();
      result = result * 59 + ($otaStatusId == null ? 43 : $otaStatusId.hashCode());
      Object $hardwareVersion = this.getHardwareVersion();
      result = result * 59 + ($hardwareVersion == null ? 43 : $hardwareVersion.hashCode());
      Object $firmwareVersion = this.getFirmwareVersion();
      result = result * 59 + ($firmwareVersion == null ? 43 : $firmwareVersion.hashCode());
      Object $deviceId = this.getDeviceId();
      return result * 59 + ($deviceId == null ? 43 : $deviceId.hashCode());
   }

   @Override
   public String toString() {
      return "ELDOtaStatus(otaStatusId="
         + this.getOtaStatusId()
         + ", hardwareVersion="
         + this.getHardwareVersion()
         + ", firmwareVersion="
         + this.getFirmwareVersion()
         + ", deviceId="
         + this.getDeviceId()
         + ", addedTimestamp="
         + this.getAddedTimestamp()
         + ")";
   }

   public Integer getOtaStatusId() {
      return this.otaStatusId;
   }

   public String getHardwareVersion() {
      return this.hardwareVersion;
   }

   public String getFirmwareVersion() {
      return this.firmwareVersion;
   }

   public String getDeviceId() {
      return this.deviceId;
   }

   public long getAddedTimestamp() {
      return this.addedTimestamp;
   }

   public void setOtaStatusId(final Integer otaStatusId) {
      this.otaStatusId = otaStatusId;
   }

   public void setHardwareVersion(final String hardwareVersion) {
      this.hardwareVersion = hardwareVersion;
   }

   public void setFirmwareVersion(final String firmwareVersion) {
      this.firmwareVersion = firmwareVersion;
   }

   public void setDeviceId(final String deviceId) {
      this.deviceId = deviceId;
   }

   public void setAddedTimestamp(final long addedTimestamp) {
      this.addedTimestamp = addedTimestamp;
   }
}
