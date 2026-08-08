package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CycleCanadaCRUDDto {
   @JsonProperty("cycleCanadaId")
   private Integer cycleCanadaId;
   @JsonProperty("clientId")
   private long clientId;

   public Integer getCycleCanadaId() {
      return this.cycleCanadaId;
   }

   public long getClientId() {
      return this.clientId;
   }

   @JsonProperty("cycleCanadaId")
   public void setCycleCanadaId(final Integer cycleCanadaId) {
      this.cycleCanadaId = cycleCanadaId;
   }

   @JsonProperty("clientId")
   public void setClientId(final long clientId) {
      this.clientId = clientId;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof CycleCanadaCRUDDto)) {
         return false;
      } else {
         CycleCanadaCRUDDto other = (CycleCanadaCRUDDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else {
            Object this$cycleCanadaId = this.getCycleCanadaId();
            Object other$cycleCanadaId = other.getCycleCanadaId();
            return this$cycleCanadaId == null ? other$cycleCanadaId == null : this$cycleCanadaId.equals(other$cycleCanadaId);
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof CycleCanadaCRUDDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $clientId = this.getClientId();
      result = result * 59 + (int)($clientId >>> 32 ^ $clientId);
      Object $cycleCanadaId = this.getCycleCanadaId();
      return result * 59 + ($cycleCanadaId == null ? 43 : $cycleCanadaId.hashCode());
   }

   @Override
   public String toString() {
      return "CycleCanadaCRUDDto(cycleCanadaId=" + this.getCycleCanadaId() + ", clientId=" + this.getClientId() + ")";
   }
}
