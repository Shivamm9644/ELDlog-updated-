package com.mes.eld_log.models;

import java.io.Serializable;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.core.mapping.Document;

@EntityScan
@Document(
   collection = "vehicle_condition"
)
public class VehicleCondition implements Serializable {
   private static final long serialVersionUID = 1L;
   private Integer vehicleConditionId;
   private String vehicleConditionName;
   private long clientId;
   private long addedTimestamp;
   private long updatedTimestamp;

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof VehicleCondition)) {
         return false;
      } else {
         VehicleCondition other = (VehicleCondition)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else if (this.getAddedTimestamp() != other.getAddedTimestamp()) {
            return false;
         } else if (this.getUpdatedTimestamp() != other.getUpdatedTimestamp()) {
            return false;
         } else {
            Object this$vehicleConditionId = this.getVehicleConditionId();
            Object other$vehicleConditionId = other.getVehicleConditionId();
            if (this$vehicleConditionId == null ? other$vehicleConditionId == null : this$vehicleConditionId.equals(other$vehicleConditionId)) {
               Object this$vehicleConditionName = this.getVehicleConditionName();
               Object other$vehicleConditionName = other.getVehicleConditionName();
               return this$vehicleConditionName == null ? other$vehicleConditionName == null : this$vehicleConditionName.equals(other$vehicleConditionName);
            } else {
               return false;
            }
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof VehicleCondition;
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
      Object $vehicleConditionId = this.getVehicleConditionId();
      result = result * 59 + ($vehicleConditionId == null ? 43 : $vehicleConditionId.hashCode());
      Object $vehicleConditionName = this.getVehicleConditionName();
      return result * 59 + ($vehicleConditionName == null ? 43 : $vehicleConditionName.hashCode());
   }

   @Override
   public String toString() {
      return "VehicleCondition(vehicleConditionId="
         + this.getVehicleConditionId()
         + ", vehicleConditionName="
         + this.getVehicleConditionName()
         + ", clientId="
         + this.getClientId()
         + ", addedTimestamp="
         + this.getAddedTimestamp()
         + ", updatedTimestamp="
         + this.getUpdatedTimestamp()
         + ")";
   }

   public Integer getVehicleConditionId() {
      return this.vehicleConditionId;
   }

   public String getVehicleConditionName() {
      return this.vehicleConditionName;
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

   public void setVehicleConditionId(final Integer vehicleConditionId) {
      this.vehicleConditionId = vehicleConditionId;
   }

   public void setVehicleConditionName(final String vehicleConditionName) {
      this.vehicleConditionName = vehicleConditionName;
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
