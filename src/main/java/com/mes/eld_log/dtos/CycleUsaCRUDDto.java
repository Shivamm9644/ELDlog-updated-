package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CycleUsaCRUDDto {
   @JsonProperty("cycleUsaId")
   private Integer cycleUsaId;
   @JsonProperty("clientId")
   private long clientId;

   public Integer getCycleUsaId() {
      return this.cycleUsaId;
   }

   public long getClientId() {
      return this.clientId;
   }

   @JsonProperty("cycleUsaId")
   public void setCycleUsaId(final Integer cycleUsaId) {
      this.cycleUsaId = cycleUsaId;
   }

   @JsonProperty("clientId")
   public void setClientId(final long clientId) {
      this.clientId = clientId;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof CycleUsaCRUDDto)) {
         return false;
      } else {
         CycleUsaCRUDDto other = (CycleUsaCRUDDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else {
            Object this$cycleUsaId = this.getCycleUsaId();
            Object other$cycleUsaId = other.getCycleUsaId();
            return this$cycleUsaId == null ? other$cycleUsaId == null : this$cycleUsaId.equals(other$cycleUsaId);
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof CycleUsaCRUDDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $clientId = this.getClientId();
      result = result * 59 + (int)($clientId >>> 32 ^ $clientId);
      Object $cycleUsaId = this.getCycleUsaId();
      return result * 59 + ($cycleUsaId == null ? 43 : $cycleUsaId.hashCode());
   }

   @Override
   public String toString() {
      return "CycleUsaCRUDDto(cycleUsaId=" + this.getCycleUsaId() + ", clientId=" + this.getClientId() + ")";
   }
}
