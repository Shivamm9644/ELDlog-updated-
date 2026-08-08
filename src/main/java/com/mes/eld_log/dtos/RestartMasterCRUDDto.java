package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RestartMasterCRUDDto {
   @JsonProperty("restartId")
   private Integer restartId;
   @JsonProperty("clientId")
   private long clientId;

   public Integer getRestartId() {
      return this.restartId;
   }

   public long getClientId() {
      return this.clientId;
   }

   @JsonProperty("restartId")
   public void setRestartId(final Integer restartId) {
      this.restartId = restartId;
   }

   @JsonProperty("clientId")
   public void setClientId(final long clientId) {
      this.clientId = clientId;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof RestartMasterCRUDDto)) {
         return false;
      } else {
         RestartMasterCRUDDto other = (RestartMasterCRUDDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else {
            Object this$restartId = this.getRestartId();
            Object other$restartId = other.getRestartId();
            return this$restartId == null ? other$restartId == null : this$restartId.equals(other$restartId);
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof RestartMasterCRUDDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $clientId = this.getClientId();
      result = result * 59 + (int)($clientId >>> 32 ^ $clientId);
      Object $restartId = this.getRestartId();
      return result * 59 + ($restartId == null ? 43 : $restartId.hashCode());
   }

   @Override
   public String toString() {
      return "RestartMasterCRUDDto(restartId=" + this.getRestartId() + ", clientId=" + this.getClientId() + ")";
   }
}
