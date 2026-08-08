package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CargoTypeMasterCRUDDto {
   @JsonProperty("cargoTypeId")
   private Integer cargoTypeId;
   @JsonProperty("clientId")
   private long clientId;

   public Integer getCargoTypeId() {
      return this.cargoTypeId;
   }

   public long getClientId() {
      return this.clientId;
   }

   @JsonProperty("cargoTypeId")
   public void setCargoTypeId(final Integer cargoTypeId) {
      this.cargoTypeId = cargoTypeId;
   }

   @JsonProperty("clientId")
   public void setClientId(final long clientId) {
      this.clientId = clientId;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof CargoTypeMasterCRUDDto)) {
         return false;
      } else {
         CargoTypeMasterCRUDDto other = (CargoTypeMasterCRUDDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else {
            Object this$cargoTypeId = this.getCargoTypeId();
            Object other$cargoTypeId = other.getCargoTypeId();
            return this$cargoTypeId == null ? other$cargoTypeId == null : this$cargoTypeId.equals(other$cargoTypeId);
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof CargoTypeMasterCRUDDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $clientId = this.getClientId();
      result = result * 59 + (int)($clientId >>> 32 ^ $clientId);
      Object $cargoTypeId = this.getCargoTypeId();
      return result * 59 + ($cargoTypeId == null ? 43 : $cargoTypeId.hashCode());
   }

   @Override
   public String toString() {
      return "CargoTypeMasterCRUDDto(cargoTypeId=" + this.getCargoTypeId() + ", clientId=" + this.getClientId() + ")";
   }
}
