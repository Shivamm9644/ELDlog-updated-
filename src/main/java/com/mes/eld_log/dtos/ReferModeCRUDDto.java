package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReferModeCRUDDto {
   @JsonProperty("referModeId")
   private Integer referModeId;
   @JsonProperty("clientId")
   private long clientId;

   public Integer getReferModeId() {
      return this.referModeId;
   }

   public long getClientId() {
      return this.clientId;
   }

   @JsonProperty("referModeId")
   public void setReferModeId(final Integer referModeId) {
      this.referModeId = referModeId;
   }

   @JsonProperty("clientId")
   public void setClientId(final long clientId) {
      this.clientId = clientId;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ReferModeCRUDDto)) {
         return false;
      } else {
         ReferModeCRUDDto other = (ReferModeCRUDDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else {
            Object this$referModeId = this.getReferModeId();
            Object other$referModeId = other.getReferModeId();
            return this$referModeId == null ? other$referModeId == null : this$referModeId.equals(other$referModeId);
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof ReferModeCRUDDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $clientId = this.getClientId();
      result = result * 59 + (int)($clientId >>> 32 ^ $clientId);
      Object $referModeId = this.getReferModeId();
      return result * 59 + ($referModeId == null ? 43 : $referModeId.hashCode());
   }

   @Override
   public String toString() {
      return "ReferModeCRUDDto(referModeId=" + this.getReferModeId() + ", clientId=" + this.getClientId() + ")";
   }
}
