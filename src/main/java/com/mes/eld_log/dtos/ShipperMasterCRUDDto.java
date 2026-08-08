package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ShipperMasterCRUDDto {
   @JsonProperty("shipperId")
   private Integer shipperId;
   @JsonProperty("clientId")
   private long clientId;

   public Integer getShipperId() {
      return this.shipperId;
   }

   public long getClientId() {
      return this.clientId;
   }

   @JsonProperty("shipperId")
   public void setShipperId(final Integer shipperId) {
      this.shipperId = shipperId;
   }

   @JsonProperty("clientId")
   public void setClientId(final long clientId) {
      this.clientId = clientId;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ShipperMasterCRUDDto)) {
         return false;
      } else {
         ShipperMasterCRUDDto other = (ShipperMasterCRUDDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else {
            Object this$shipperId = this.getShipperId();
            Object other$shipperId = other.getShipperId();
            return this$shipperId == null ? other$shipperId == null : this$shipperId.equals(other$shipperId);
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof ShipperMasterCRUDDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $clientId = this.getClientId();
      result = result * 59 + (int)($clientId >>> 32 ^ $clientId);
      Object $shipperId = this.getShipperId();
      return result * 59 + ($shipperId == null ? 43 : $shipperId.hashCode());
   }

   @Override
   public String toString() {
      return "ShipperMasterCRUDDto(shipperId=" + this.getShipperId() + ", clientId=" + this.getClientId() + ")";
   }
}
