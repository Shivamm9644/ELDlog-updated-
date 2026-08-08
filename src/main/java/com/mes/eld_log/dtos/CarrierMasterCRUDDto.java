package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CarrierMasterCRUDDto {
   @JsonProperty("carrierId")
   private Integer carrierId;
   @JsonProperty("clientId")
   private long clientId;

   public Integer getCarrierId() {
      return this.carrierId;
   }

   public long getClientId() {
      return this.clientId;
   }

   @JsonProperty("carrierId")
   public void setCarrierId(final Integer carrierId) {
      this.carrierId = carrierId;
   }

   @JsonProperty("clientId")
   public void setClientId(final long clientId) {
      this.clientId = clientId;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof CarrierMasterCRUDDto)) {
         return false;
      } else {
         CarrierMasterCRUDDto other = (CarrierMasterCRUDDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else {
            Object this$carrierId = this.getCarrierId();
            Object other$carrierId = other.getCarrierId();
            return this$carrierId == null ? other$carrierId == null : this$carrierId.equals(other$carrierId);
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof CarrierMasterCRUDDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $clientId = this.getClientId();
      result = result * 59 + (int)($clientId >>> 32 ^ $clientId);
      Object $carrierId = this.getCarrierId();
      return result * 59 + ($carrierId == null ? 43 : $carrierId.hashCode());
   }

   @Override
   public String toString() {
      return "CarrierMasterCRUDDto(carrierId=" + this.getCarrierId() + ", clientId=" + this.getClientId() + ")";
   }
}
