package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TimezoneMasterCRUDDto {
   @JsonProperty("timezoneId")
   private Integer timezoneId;
   @JsonProperty("clientId")
   private long clientId;

   public Integer getTimezoneId() {
      return this.timezoneId;
   }

   public long getClientId() {
      return this.clientId;
   }

   @JsonProperty("timezoneId")
   public void setTimezoneId(final Integer timezoneId) {
      this.timezoneId = timezoneId;
   }

   @JsonProperty("clientId")
   public void setClientId(final long clientId) {
      this.clientId = clientId;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof TimezoneMasterCRUDDto)) {
         return false;
      } else {
         TimezoneMasterCRUDDto other = (TimezoneMasterCRUDDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else {
            Object this$timezoneId = this.getTimezoneId();
            Object other$timezoneId = other.getTimezoneId();
            return this$timezoneId == null ? other$timezoneId == null : this$timezoneId.equals(other$timezoneId);
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof TimezoneMasterCRUDDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $clientId = this.getClientId();
      result = result * 59 + (int)($clientId >>> 32 ^ $clientId);
      Object $timezoneId = this.getTimezoneId();
      return result * 59 + ($timezoneId == null ? 43 : $timezoneId.hashCode());
   }

   @Override
   public String toString() {
      return "TimezoneMasterCRUDDto(timezoneId=" + this.getTimezoneId() + ", clientId=" + this.getClientId() + ")";
   }
}
