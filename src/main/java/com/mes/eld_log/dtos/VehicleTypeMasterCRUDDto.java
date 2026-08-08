package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VehicleTypeMasterCRUDDto {
   @JsonProperty("vehicleTypeId")
   private Integer vehicleTypeId;
   @JsonProperty("clientId")
   private long clientId;

   public Integer getVehicleTypeId() {
      return this.vehicleTypeId;
   }

   public long getClientId() {
      return this.clientId;
   }

   @JsonProperty("vehicleTypeId")
   public void setVehicleTypeId(final Integer vehicleTypeId) {
      this.vehicleTypeId = vehicleTypeId;
   }

   @JsonProperty("clientId")
   public void setClientId(final long clientId) {
      this.clientId = clientId;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof VehicleTypeMasterCRUDDto)) {
         return false;
      } else {
         VehicleTypeMasterCRUDDto other = (VehicleTypeMasterCRUDDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else {
            Object this$vehicleTypeId = this.getVehicleTypeId();
            Object other$vehicleTypeId = other.getVehicleTypeId();
            return this$vehicleTypeId == null ? other$vehicleTypeId == null : this$vehicleTypeId.equals(other$vehicleTypeId);
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof VehicleTypeMasterCRUDDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $clientId = this.getClientId();
      result = result * 59 + (int)($clientId >>> 32 ^ $clientId);
      Object $vehicleTypeId = this.getVehicleTypeId();
      return result * 59 + ($vehicleTypeId == null ? 43 : $vehicleTypeId.hashCode());
   }

   @Override
   public String toString() {
      return "VehicleTypeMasterCRUDDto(vehicleTypeId=" + this.getVehicleTypeId() + ", clientId=" + this.getClientId() + ")";
   }
}
