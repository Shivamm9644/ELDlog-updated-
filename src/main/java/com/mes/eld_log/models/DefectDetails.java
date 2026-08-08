package com.mes.eld_log.models;

import java.io.Serializable;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.core.mapping.Document;

@EntityScan
@Document(
   collection = "defect_log"
)
public class DefectDetails implements Serializable {
   private static final long serialVersionUID = 1L;
   private String localId;
   private String dvirId;
   private String defectName;
   private String defectType;
   private long driverId;
   private long vehicleId;
   private long clientId;
   private String fileName;
   private String dateTime;
   private long lDateTime;
   private long utcDateTime;
   private long receivedTimestamp;

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof DefectDetails)) {
         return false;
      } else {
         DefectDetails other = (DefectDetails)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getDriverId() != other.getDriverId()) {
            return false;
         } else if (this.getVehicleId() != other.getVehicleId()) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else if (this.getLDateTime() != other.getLDateTime()) {
            return false;
         } else if (this.getUtcDateTime() != other.getUtcDateTime()) {
            return false;
         } else if (this.getReceivedTimestamp() != other.getReceivedTimestamp()) {
            return false;
         } else {
            Object this$localId = this.getLocalId();
            Object other$localId = other.getLocalId();
            if (this$localId == null ? other$localId == null : this$localId.equals(other$localId)) {
               Object this$dvirId = this.getDvirId();
               Object other$dvirId = other.getDvirId();
               if (this$dvirId == null ? other$dvirId == null : this$dvirId.equals(other$dvirId)) {
                  Object this$defectName = this.getDefectName();
                  Object other$defectName = other.getDefectName();
                  if (this$defectName == null ? other$defectName == null : this$defectName.equals(other$defectName)) {
                     Object this$defectType = this.getDefectType();
                     Object other$defectType = other.getDefectType();
                     if (this$defectType == null ? other$defectType == null : this$defectType.equals(other$defectType)) {
                        Object this$fileName = this.getFileName();
                        Object other$fileName = other.getFileName();
                        if (this$fileName == null ? other$fileName == null : this$fileName.equals(other$fileName)) {
                           Object this$dateTime = this.getDateTime();
                           Object other$dateTime = other.getDateTime();
                           return this$dateTime == null ? other$dateTime == null : this$dateTime.equals(other$dateTime);
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
      return other instanceof DefectDetails;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $driverId = this.getDriverId();
      result = result * 59 + (int)($driverId >>> 32 ^ $driverId);
      long $vehicleId = this.getVehicleId();
      result = result * 59 + (int)($vehicleId >>> 32 ^ $vehicleId);
      long $clientId = this.getClientId();
      result = result * 59 + (int)($clientId >>> 32 ^ $clientId);
      long $lDateTime = this.getLDateTime();
      result = result * 59 + (int)($lDateTime >>> 32 ^ $lDateTime);
      long $utcDateTime = this.getUtcDateTime();
      result = result * 59 + (int)($utcDateTime >>> 32 ^ $utcDateTime);
      long $receivedTimestamp = this.getReceivedTimestamp();
      result = result * 59 + (int)($receivedTimestamp >>> 32 ^ $receivedTimestamp);
      Object $localId = this.getLocalId();
      result = result * 59 + ($localId == null ? 43 : $localId.hashCode());
      Object $dvirId = this.getDvirId();
      result = result * 59 + ($dvirId == null ? 43 : $dvirId.hashCode());
      Object $defectName = this.getDefectName();
      result = result * 59 + ($defectName == null ? 43 : $defectName.hashCode());
      Object $defectType = this.getDefectType();
      result = result * 59 + ($defectType == null ? 43 : $defectType.hashCode());
      Object $fileName = this.getFileName();
      result = result * 59 + ($fileName == null ? 43 : $fileName.hashCode());
      Object $dateTime = this.getDateTime();
      return result * 59 + ($dateTime == null ? 43 : $dateTime.hashCode());
   }

   @Override
   public String toString() {
      return "DefectDetails(localId="
         + this.getLocalId()
         + ", dvirId="
         + this.getDvirId()
         + ", defectName="
         + this.getDefectName()
         + ", defectType="
         + this.getDefectType()
         + ", driverId="
         + this.getDriverId()
         + ", vehicleId="
         + this.getVehicleId()
         + ", clientId="
         + this.getClientId()
         + ", fileName="
         + this.getFileName()
         + ", dateTime="
         + this.getDateTime()
         + ", lDateTime="
         + this.getLDateTime()
         + ", utcDateTime="
         + this.getUtcDateTime()
         + ", receivedTimestamp="
         + this.getReceivedTimestamp()
         + ")";
   }

   public String getLocalId() {
      return this.localId;
   }

   public String getDvirId() {
      return this.dvirId;
   }

   public String getDefectName() {
      return this.defectName;
   }

   public String getDefectType() {
      return this.defectType;
   }

   public long getDriverId() {
      return this.driverId;
   }

   public long getVehicleId() {
      return this.vehicleId;
   }

   public long getClientId() {
      return this.clientId;
   }

   public String getFileName() {
      return this.fileName;
   }

   public String getDateTime() {
      return this.dateTime;
   }

   public long getLDateTime() {
      return this.lDateTime;
   }

   public long getUtcDateTime() {
      return this.utcDateTime;
   }

   public long getReceivedTimestamp() {
      return this.receivedTimestamp;
   }

   public void setLocalId(final String localId) {
      this.localId = localId;
   }

   public void setDvirId(final String dvirId) {
      this.dvirId = dvirId;
   }

   public void setDefectName(final String defectName) {
      this.defectName = defectName;
   }

   public void setDefectType(final String defectType) {
      this.defectType = defectType;
   }

   public void setDriverId(final long driverId) {
      this.driverId = driverId;
   }

   public void setVehicleId(final long vehicleId) {
      this.vehicleId = vehicleId;
   }

   public void setClientId(final long clientId) {
      this.clientId = clientId;
   }

   public void setFileName(final String fileName) {
      this.fileName = fileName;
   }

   public void setDateTime(final String dateTime) {
      this.dateTime = dateTime;
   }

   public void setLDateTime(final long lDateTime) {
      this.lDateTime = lDateTime;
   }

   public void setUtcDateTime(final long utcDateTime) {
      this.utcDateTime = utcDateTime;
   }

   public void setReceivedTimestamp(final long receivedTimestamp) {
      this.receivedTimestamp = receivedTimestamp;
   }
}
