package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MainTerminalMasterCRUDDto {
   @JsonProperty("mainTerminalId")
   private Integer mainTerminalId;
   @JsonProperty("clientId")
   private long clientId;

   public Integer getMainTerminalId() {
      return this.mainTerminalId;
   }

   public long getClientId() {
      return this.clientId;
   }

   @JsonProperty("mainTerminalId")
   public void setMainTerminalId(final Integer mainTerminalId) {
      this.mainTerminalId = mainTerminalId;
   }

   @JsonProperty("clientId")
   public void setClientId(final long clientId) {
      this.clientId = clientId;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof MainTerminalMasterCRUDDto)) {
         return false;
      } else {
         MainTerminalMasterCRUDDto other = (MainTerminalMasterCRUDDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else {
            Object this$mainTerminalId = this.getMainTerminalId();
            Object other$mainTerminalId = other.getMainTerminalId();
            return this$mainTerminalId == null ? other$mainTerminalId == null : this$mainTerminalId.equals(other$mainTerminalId);
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof MainTerminalMasterCRUDDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $clientId = this.getClientId();
      result = result * 59 + (int)($clientId >>> 32 ^ $clientId);
      Object $mainTerminalId = this.getMainTerminalId();
      return result * 59 + ($mainTerminalId == null ? 43 : $mainTerminalId.hashCode());
   }

   @Override
   public String toString() {
      return "MainTerminalMasterCRUDDto(mainTerminalId=" + this.getMainTerminalId() + ", clientId=" + this.getClientId() + ")";
   }
}
