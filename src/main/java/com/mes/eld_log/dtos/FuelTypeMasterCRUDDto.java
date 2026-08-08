package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FuelTypeMasterCRUDDto {
   @JsonProperty("fuelTypeId")
   private Integer fuelTypeId;
   @JsonProperty("clientId")
   private long clientId;

   public Integer getFuelTypeId() {
      return this.fuelTypeId;
   }

   public long getClientId() {
      return this.clientId;
   }

   @JsonProperty("fuelTypeId")
   public void setFuelTypeId(final Integer fuelTypeId) {
      this.fuelTypeId = fuelTypeId;
   }

   @JsonProperty("clientId")
   public void setClientId(final long clientId) {
      this.clientId = clientId;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof FuelTypeMasterCRUDDto)) {
         return false;
      } else {
         FuelTypeMasterCRUDDto other = (FuelTypeMasterCRUDDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else {
            Object this$fuelTypeId = this.getFuelTypeId();
            Object other$fuelTypeId = other.getFuelTypeId();
            return this$fuelTypeId == null ? other$fuelTypeId == null : this$fuelTypeId.equals(other$fuelTypeId);
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof FuelTypeMasterCRUDDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $clientId = this.getClientId();
      result = result * 59 + (int)($clientId >>> 32 ^ $clientId);
      Object $fuelTypeId = this.getFuelTypeId();
      return result * 59 + ($fuelTypeId == null ? 43 : $fuelTypeId.hashCode());
   }

   @Override
   public String toString() {
      return "FuelTypeMasterCRUDDto(fuelTypeId=" + this.getFuelTypeId() + ", clientId=" + this.getClientId() + ")";
   }
}
