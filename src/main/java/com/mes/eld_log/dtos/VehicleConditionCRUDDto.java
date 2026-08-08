package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VehicleConditionCRUDDto {
   @JsonProperty("vehicleConditionId")
   private Integer vehicleConditionId;
   @JsonProperty("clientId")
   private long clientId;

   public Integer getVehicleConditionId() {
      return this.vehicleConditionId;
   }

   public long getClientId() {
      return this.clientId;
   }

   @JsonProperty("vehicleConditionId")
   public void setVehicleConditionId(final Integer vehicleConditionId) {
      this.vehicleConditionId = vehicleConditionId;
   }

   @JsonProperty("clientId")
   public void setClientId(final long clientId) {
      this.clientId = clientId;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof VehicleConditionCRUDDto)) {
         return false;
      } else {
         VehicleConditionCRUDDto other = (VehicleConditionCRUDDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else {
            Object this$vehicleConditionId = this.getVehicleConditionId();
            Object other$vehicleConditionId = other.getVehicleConditionId();
            return this$vehicleConditionId == null ? other$vehicleConditionId == null : this$vehicleConditionId.equals(other$vehicleConditionId);
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof VehicleConditionCRUDDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $clientId = this.getClientId();
      result = result * 59 + (int)($clientId >>> 32 ^ $clientId);
      Object $vehicleConditionId = this.getVehicleConditionId();
      return result * 59 + ($vehicleConditionId == null ? 43 : $vehicleConditionId.hashCode());
   }

   @Override
   public String toString() {
      return "VehicleConditionCRUDDto(vehicleConditionId=" + this.getVehicleConditionId() + ", clientId=" + this.getClientId() + ")";
   }
}
