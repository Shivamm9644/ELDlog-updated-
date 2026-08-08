package com.mes.eld_log.models;

import java.io.Serializable;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.core.mapping.Document;

@EntityScan
@Document(
   collection = "eld_ota"
)
public class ELDOta implements Serializable {
   private static final long serialVersionUID = 1L;
   private Integer otaId;
   private String hardwareVersion;
   private String firmwareVersion;
   private String otaUrl;
   private Integer processOta;
   private String firmwareFileName;
   private String originalFirmwareFileName;
   private long addedTimestamp;

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ELDOta)) {
         return false;
      } else {
         ELDOta other = (ELDOta)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getAddedTimestamp() != other.getAddedTimestamp()) {
            return false;
         } else {
            Object this$otaId = this.getOtaId();
            Object other$otaId = other.getOtaId();
            if (this$otaId == null ? other$otaId == null : this$otaId.equals(other$otaId)) {
               Object this$processOta = this.getProcessOta();
               Object other$processOta = other.getProcessOta();
               if (this$processOta == null ? other$processOta == null : this$processOta.equals(other$processOta)) {
                  Object this$hardwareVersion = this.getHardwareVersion();
                  Object other$hardwareVersion = other.getHardwareVersion();
                  if (this$hardwareVersion == null ? other$hardwareVersion == null : this$hardwareVersion.equals(other$hardwareVersion)) {
                     Object this$firmwareVersion = this.getFirmwareVersion();
                     Object other$firmwareVersion = other.getFirmwareVersion();
                     if (this$firmwareVersion == null ? other$firmwareVersion == null : this$firmwareVersion.equals(other$firmwareVersion)) {
                        Object this$otaUrl = this.getOtaUrl();
                        Object other$otaUrl = other.getOtaUrl();
                        if (this$otaUrl == null ? other$otaUrl == null : this$otaUrl.equals(other$otaUrl)) {
                           Object this$firmwareFileName = this.getFirmwareFileName();
                           Object other$firmwareFileName = other.getFirmwareFileName();
                           if (this$firmwareFileName == null ? other$firmwareFileName == null : this$firmwareFileName.equals(other$firmwareFileName)) {
                              Object this$originalFirmwareFileName = this.getOriginalFirmwareFileName();
                              Object other$originalFirmwareFileName = other.getOriginalFirmwareFileName();
                              return this$originalFirmwareFileName == null
                                 ? other$originalFirmwareFileName == null
                                 : this$originalFirmwareFileName.equals(other$originalFirmwareFileName);
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
      return other instanceof ELDOta;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $addedTimestamp = this.getAddedTimestamp();
      result = result * 59 + (int)($addedTimestamp >>> 32 ^ $addedTimestamp);
      Object $otaId = this.getOtaId();
      result = result * 59 + ($otaId == null ? 43 : $otaId.hashCode());
      Object $processOta = this.getProcessOta();
      result = result * 59 + ($processOta == null ? 43 : $processOta.hashCode());
      Object $hardwareVersion = this.getHardwareVersion();
      result = result * 59 + ($hardwareVersion == null ? 43 : $hardwareVersion.hashCode());
      Object $firmwareVersion = this.getFirmwareVersion();
      result = result * 59 + ($firmwareVersion == null ? 43 : $firmwareVersion.hashCode());
      Object $otaUrl = this.getOtaUrl();
      result = result * 59 + ($otaUrl == null ? 43 : $otaUrl.hashCode());
      Object $firmwareFileName = this.getFirmwareFileName();
      result = result * 59 + ($firmwareFileName == null ? 43 : $firmwareFileName.hashCode());
      Object $originalFirmwareFileName = this.getOriginalFirmwareFileName();
      return result * 59 + ($originalFirmwareFileName == null ? 43 : $originalFirmwareFileName.hashCode());
   }

   @Override
   public String toString() {
      return "ELDOta(otaId="
         + this.getOtaId()
         + ", hardwareVersion="
         + this.getHardwareVersion()
         + ", firmwareVersion="
         + this.getFirmwareVersion()
         + ", otaUrl="
         + this.getOtaUrl()
         + ", processOta="
         + this.getProcessOta()
         + ", firmwareFileName="
         + this.getFirmwareFileName()
         + ", originalFirmwareFileName="
         + this.getOriginalFirmwareFileName()
         + ", addedTimestamp="
         + this.getAddedTimestamp()
         + ")";
   }

   public Integer getOtaId() {
      return this.otaId;
   }

   public String getHardwareVersion() {
      return this.hardwareVersion;
   }

   public String getFirmwareVersion() {
      return this.firmwareVersion;
   }

   public String getOtaUrl() {
      return this.otaUrl;
   }

   public Integer getProcessOta() {
      return this.processOta;
   }

   public String getFirmwareFileName() {
      return this.firmwareFileName;
   }

   public String getOriginalFirmwareFileName() {
      return this.originalFirmwareFileName;
   }

   public long getAddedTimestamp() {
      return this.addedTimestamp;
   }

   public void setOtaId(final Integer otaId) {
      this.otaId = otaId;
   }

   public void setHardwareVersion(final String hardwareVersion) {
      this.hardwareVersion = hardwareVersion;
   }

   public void setFirmwareVersion(final String firmwareVersion) {
      this.firmwareVersion = firmwareVersion;
   }

   public void setOtaUrl(final String otaUrl) {
      this.otaUrl = otaUrl;
   }

   public void setProcessOta(final Integer processOta) {
      this.processOta = processOta;
   }

   public void setFirmwareFileName(final String firmwareFileName) {
      this.firmwareFileName = firmwareFileName;
   }

   public void setOriginalFirmwareFileName(final String originalFirmwareFileName) {
      this.originalFirmwareFileName = originalFirmwareFileName;
   }

   public void setAddedTimestamp(final long addedTimestamp) {
      this.addedTimestamp = addedTimestamp;
   }
}
