package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TrailerMasterCRUDDto {
   @JsonProperty("trailerId")
   private Integer trailerId;
   @JsonProperty("clientId")
   private long clientId;

   public Integer getTrailerId() {
      return this.trailerId;
   }

   public long getClientId() {
      return this.clientId;
   }

   @JsonProperty("trailerId")
   public void setTrailerId(final Integer trailerId) {
      this.trailerId = trailerId;
   }

   @JsonProperty("clientId")
   public void setClientId(final long clientId) {
      this.clientId = clientId;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof TrailerMasterCRUDDto)) {
         return false;
      } else {
         TrailerMasterCRUDDto other = (TrailerMasterCRUDDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else {
            Object this$trailerId = this.getTrailerId();
            Object other$trailerId = other.getTrailerId();
            return this$trailerId == null ? other$trailerId == null : this$trailerId.equals(other$trailerId);
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof TrailerMasterCRUDDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $clientId = this.getClientId();
      result = result * 59 + (int)($clientId >>> 32 ^ $clientId);
      Object $trailerId = this.getTrailerId();
      return result * 59 + ($trailerId == null ? 43 : $trailerId.hashCode());
   }

   @Override
   public String toString() {
      return "TrailerMasterCRUDDto(trailerId=" + this.getTrailerId() + ", clientId=" + this.getClientId() + ")";
   }
}
