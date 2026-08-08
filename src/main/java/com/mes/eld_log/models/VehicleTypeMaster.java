package com.mes.eld_log.models;

import java.io.Serializable;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.core.mapping.Document;

@EntityScan
@Document(
   collection = "vehicle_type_master"
)
public class VehicleTypeMaster implements Serializable {
   private static final long serialVersionUID = 1L;
   private Integer vehicleTypeId;
   private String vehicleTypeName;
   private long clientId;
   private long addedTimestamp;
   private long updatedTimestamp;

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof VehicleTypeMaster)) {
         return false;
      } else {
         VehicleTypeMaster other = (VehicleTypeMaster)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else if (this.getAddedTimestamp() != other.getAddedTimestamp()) {
            return false;
         } else if (this.getUpdatedTimestamp() != other.getUpdatedTimestamp()) {
            return false;
         } else {
            Object this$vehicleTypeId = this.getVehicleTypeId();
            Object other$vehicleTypeId = other.getVehicleTypeId();
            if (this$vehicleTypeId == null ? other$vehicleTypeId == null : this$vehicleTypeId.equals(other$vehicleTypeId)) {
               Object this$vehicleTypeName = this.getVehicleTypeName();
               Object other$vehicleTypeName = other.getVehicleTypeName();
               return this$vehicleTypeName == null ? other$vehicleTypeName == null : this$vehicleTypeName.equals(other$vehicleTypeName);
            } else {
               return false;
            }
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof VehicleTypeMaster;
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
      Object $vehicleTypeId = this.getVehicleTypeId();
      result = result * 59 + ($vehicleTypeId == null ? 43 : $vehicleTypeId.hashCode());
      Object $vehicleTypeName = this.getVehicleTypeName();
      return result * 59 + ($vehicleTypeName == null ? 43 : $vehicleTypeName.hashCode());
   }

   @Override
   public String toString() {
      return "VehicleTypeMaster(vehicleTypeId="
         + this.getVehicleTypeId()
         + ", vehicleTypeName="
         + this.getVehicleTypeName()
         + ", clientId="
         + this.getClientId()
         + ", addedTimestamp="
         + this.getAddedTimestamp()
         + ", updatedTimestamp="
         + this.getUpdatedTimestamp()
         + ")";
   }

   public Integer getVehicleTypeId() {
      return this.vehicleTypeId;
   }

   public String getVehicleTypeName() {
      return this.vehicleTypeName;
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

   public void setVehicleTypeId(final Integer vehicleTypeId) {
      this.vehicleTypeId = vehicleTypeId;
   }

   public void setVehicleTypeName(final String vehicleTypeName) {
      this.vehicleTypeName = vehicleTypeName;
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
