package com.mes.eld_log.models;

import java.io.Serializable;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.core.mapping.Document;

@EntityScan
@Document(
   collection = "cargo_type_master"
)
public class CargoTypeMaster implements Serializable {
   private static final long serialVersionUID = 1L;
   private Integer cargoTypeId;
   private String cargoTypeName;
   private long clientId;
   private long addedTimestamp;
   private long updatedTimestamp;

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof CargoTypeMaster)) {
         return false;
      } else {
         CargoTypeMaster other = (CargoTypeMaster)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else if (this.getAddedTimestamp() != other.getAddedTimestamp()) {
            return false;
         } else if (this.getUpdatedTimestamp() != other.getUpdatedTimestamp()) {
            return false;
         } else {
            Object this$cargoTypeId = this.getCargoTypeId();
            Object other$cargoTypeId = other.getCargoTypeId();
            if (this$cargoTypeId == null ? other$cargoTypeId == null : this$cargoTypeId.equals(other$cargoTypeId)) {
               Object this$cargoTypeName = this.getCargoTypeName();
               Object other$cargoTypeName = other.getCargoTypeName();
               return this$cargoTypeName == null ? other$cargoTypeName == null : this$cargoTypeName.equals(other$cargoTypeName);
            } else {
               return false;
            }
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof CargoTypeMaster;
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
      Object $cargoTypeId = this.getCargoTypeId();
      result = result * 59 + ($cargoTypeId == null ? 43 : $cargoTypeId.hashCode());
      Object $cargoTypeName = this.getCargoTypeName();
      return result * 59 + ($cargoTypeName == null ? 43 : $cargoTypeName.hashCode());
   }

   @Override
   public String toString() {
      return "CargoTypeMaster(cargoTypeId="
         + this.getCargoTypeId()
         + ", cargoTypeName="
         + this.getCargoTypeName()
         + ", clientId="
         + this.getClientId()
         + ", addedTimestamp="
         + this.getAddedTimestamp()
         + ", updatedTimestamp="
         + this.getUpdatedTimestamp()
         + ")";
   }

   public Integer getCargoTypeId() {
      return this.cargoTypeId;
   }

   public String getCargoTypeName() {
      return this.cargoTypeName;
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

   public void setCargoTypeId(final Integer cargoTypeId) {
      this.cargoTypeId = cargoTypeId;
   }

   public void setCargoTypeName(final String cargoTypeName) {
      this.cargoTypeName = cargoTypeName;
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
