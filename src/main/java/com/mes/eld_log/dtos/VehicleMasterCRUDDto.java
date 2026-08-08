package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VehicleMasterCRUDDto {
   @JsonProperty("vehicleId")
   private Integer vehicleId;
   @JsonProperty("clientId")
   private long clientId;
   @JsonProperty("driverId")
   private long driverId;
   @JsonProperty("tokenNo")
   private String tokenNo;

   public Integer getVehicleId() {
      return this.vehicleId;
   }

   public long getClientId() {
      return this.clientId;
   }

   public long getDriverId() {
      return this.driverId;
   }

   public String getTokenNo() {
      return this.tokenNo;
   }

   @JsonProperty("vehicleId")
   public void setVehicleId(final Integer vehicleId) {
      this.vehicleId = vehicleId;
   }

   @JsonProperty("clientId")
   public void setClientId(final long clientId) {
      this.clientId = clientId;
   }

   @JsonProperty("driverId")
   public void setDriverId(final long driverId) {
      this.driverId = driverId;
   }

   @JsonProperty("tokenNo")
   public void setTokenNo(final String tokenNo) {
      this.tokenNo = tokenNo;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof VehicleMasterCRUDDto)) {
         return false;
      } else {
         VehicleMasterCRUDDto other = (VehicleMasterCRUDDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else if (this.getDriverId() != other.getDriverId()) {
            return false;
         } else {
            Object this$vehicleId = this.getVehicleId();
            Object other$vehicleId = other.getVehicleId();
            if (this$vehicleId == null ? other$vehicleId == null : this$vehicleId.equals(other$vehicleId)) {
               Object this$tokenNo = this.getTokenNo();
               Object other$tokenNo = other.getTokenNo();
               return this$tokenNo == null ? other$tokenNo == null : this$tokenNo.equals(other$tokenNo);
            } else {
               return false;
            }
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof VehicleMasterCRUDDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $clientId = this.getClientId();
      result = result * 59 + (int)($clientId >>> 32 ^ $clientId);
      long $driverId = this.getDriverId();
      result = result * 59 + (int)($driverId >>> 32 ^ $driverId);
      Object $vehicleId = this.getVehicleId();
      result = result * 59 + ($vehicleId == null ? 43 : $vehicleId.hashCode());
      Object $tokenNo = this.getTokenNo();
      return result * 59 + ($tokenNo == null ? 43 : $tokenNo.hashCode());
   }

   @Override
   public String toString() {
      return "VehicleMasterCRUDDto(vehicleId="
         + this.getVehicleId()
         + ", clientId="
         + this.getClientId()
         + ", driverId="
         + this.getDriverId()
         + ", tokenNo="
         + this.getTokenNo()
         + ")";
   }
}
