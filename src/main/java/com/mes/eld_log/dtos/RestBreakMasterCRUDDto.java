package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RestBreakMasterCRUDDto {
   @JsonProperty("restBreakId")
   private Integer restBreakId;
   @JsonProperty("clientId")
   private long clientId;

   public Integer getRestBreakId() {
      return this.restBreakId;
   }

   public long getClientId() {
      return this.clientId;
   }

   @JsonProperty("restBreakId")
   public void setRestBreakId(final Integer restBreakId) {
      this.restBreakId = restBreakId;
   }

   @JsonProperty("clientId")
   public void setClientId(final long clientId) {
      this.clientId = clientId;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof RestBreakMasterCRUDDto)) {
         return false;
      } else {
         RestBreakMasterCRUDDto other = (RestBreakMasterCRUDDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else {
            Object this$restBreakId = this.getRestBreakId();
            Object other$restBreakId = other.getRestBreakId();
            return this$restBreakId == null ? other$restBreakId == null : this$restBreakId.equals(other$restBreakId);
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof RestBreakMasterCRUDDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $clientId = this.getClientId();
      result = result * 59 + (int)($clientId >>> 32 ^ $clientId);
      Object $restBreakId = this.getRestBreakId();
      return result * 59 + ($restBreakId == null ? 43 : $restBreakId.hashCode());
   }

   @Override
   public String toString() {
      return "RestBreakMasterCRUDDto(restBreakId=" + this.getRestBreakId() + ", clientId=" + this.getClientId() + ")";
   }
}
