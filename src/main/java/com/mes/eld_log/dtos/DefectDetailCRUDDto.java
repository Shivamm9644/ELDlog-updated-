package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DefectDetailCRUDDto {
   @JsonProperty("_id")
   private String _id;
   @JsonProperty("dvirId")
   private String dvirId;
   @JsonProperty("defectName")
   private String defectName;
   @JsonProperty("defectType")
   private String defectType;
   @JsonProperty("driverId")
   private long driverId;
   @JsonProperty("vehicleId")
   private long vehicleId;
   @JsonProperty("clientId")
   private long clientId;
   @JsonProperty("fileName")
   private String fileName;
   @JsonProperty("dateTime")
   private String dateTime;
   @JsonProperty("lDateTime")
   private long lDateTime;
   private long receivedTimestamp;

   public String get_id() {
      return this._id;
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

   public long getReceivedTimestamp() {
      return this.receivedTimestamp;
   }

   @JsonProperty("_id")
   public void set_id(final String _id) {
      this._id = _id;
   }

   @JsonProperty("dvirId")
   public void setDvirId(final String dvirId) {
      this.dvirId = dvirId;
   }

   @JsonProperty("defectName")
   public void setDefectName(final String defectName) {
      this.defectName = defectName;
   }

   @JsonProperty("defectType")
   public void setDefectType(final String defectType) {
      this.defectType = defectType;
   }

   @JsonProperty("driverId")
   public void setDriverId(final long driverId) {
      this.driverId = driverId;
   }

   @JsonProperty("vehicleId")
   public void setVehicleId(final long vehicleId) {
      this.vehicleId = vehicleId;
   }

   @JsonProperty("clientId")
   public void setClientId(final long clientId) {
      this.clientId = clientId;
   }

   @JsonProperty("fileName")
   public void setFileName(final String fileName) {
      this.fileName = fileName;
   }

   @JsonProperty("dateTime")
   public void setDateTime(final String dateTime) {
      this.dateTime = dateTime;
   }

   @JsonProperty("lDateTime")
   public void setLDateTime(final long lDateTime) {
      this.lDateTime = lDateTime;
   }

   public void setReceivedTimestamp(final long receivedTimestamp) {
      this.receivedTimestamp = receivedTimestamp;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof DefectDetailCRUDDto)) {
         return false;
      } else {
         DefectDetailCRUDDto other = (DefectDetailCRUDDto)o;
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
         } else if (this.getReceivedTimestamp() != other.getReceivedTimestamp()) {
            return false;
         } else {
            Object this$_id = this.get_id();
            Object other$_id = other.get_id();
            if (this$_id == null ? other$_id == null : this$_id.equals(other$_id)) {
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
      return other instanceof DefectDetailCRUDDto;
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
      long $receivedTimestamp = this.getReceivedTimestamp();
      result = result * 59 + (int)($receivedTimestamp >>> 32 ^ $receivedTimestamp);
      Object $_id = this.get_id();
      result = result * 59 + ($_id == null ? 43 : $_id.hashCode());
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
      return "DefectDetailCRUDDto(_id="
         + this.get_id()
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
         + ", receivedTimestamp="
         + this.getReceivedTimestamp()
         + ")";
   }
}
