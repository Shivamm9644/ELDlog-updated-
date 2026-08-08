package com.mes.eld_log.models;

import java.io.Serializable;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.core.mapping.Document;

@EntityScan
@Document(
   collection = "fuel_type_master"
)
public class FuelTypeMaster implements Serializable {
   private static final long serialVersionUID = 1L;
   private Integer fuelTypeId;
   private String fuelTypeName;
   private long clientId;
   private long addedTimestamp;
   private long updatedTimestamp;

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof FuelTypeMaster)) {
         return false;
      } else {
         FuelTypeMaster other = (FuelTypeMaster)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else if (this.getAddedTimestamp() != other.getAddedTimestamp()) {
            return false;
         } else if (this.getUpdatedTimestamp() != other.getUpdatedTimestamp()) {
            return false;
         } else {
            Object this$fuelTypeId = this.getFuelTypeId();
            Object other$fuelTypeId = other.getFuelTypeId();
            if (this$fuelTypeId == null ? other$fuelTypeId == null : this$fuelTypeId.equals(other$fuelTypeId)) {
               Object this$fuelTypeName = this.getFuelTypeName();
               Object other$fuelTypeName = other.getFuelTypeName();
               return this$fuelTypeName == null ? other$fuelTypeName == null : this$fuelTypeName.equals(other$fuelTypeName);
            } else {
               return false;
            }
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof FuelTypeMaster;
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
      Object $fuelTypeId = this.getFuelTypeId();
      result = result * 59 + ($fuelTypeId == null ? 43 : $fuelTypeId.hashCode());
      Object $fuelTypeName = this.getFuelTypeName();
      return result * 59 + ($fuelTypeName == null ? 43 : $fuelTypeName.hashCode());
   }

   @Override
   public String toString() {
      return "FuelTypeMaster(fuelTypeId="
         + this.getFuelTypeId()
         + ", fuelTypeName="
         + this.getFuelTypeName()
         + ", clientId="
         + this.getClientId()
         + ", addedTimestamp="
         + this.getAddedTimestamp()
         + ", updatedTimestamp="
         + this.getUpdatedTimestamp()
         + ")";
   }

   public Integer getFuelTypeId() {
      return this.fuelTypeId;
   }

   public String getFuelTypeName() {
      return this.fuelTypeName;
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

   public void setFuelTypeId(final Integer fuelTypeId) {
      this.fuelTypeId = fuelTypeId;
   }

   public void setFuelTypeName(final String fuelTypeName) {
      this.fuelTypeName = fuelTypeName;
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
