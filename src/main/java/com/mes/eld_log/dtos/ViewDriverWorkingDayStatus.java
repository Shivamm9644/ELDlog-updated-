package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ViewDriverWorkingDayStatus {
   @JsonProperty("dateTime")
   private String dateTime;
   @JsonProperty("lDateTime")
   private long lDateTime;

   public String getDateTime() {
      return this.dateTime;
   }

   public long getLDateTime() {
      return this.lDateTime;
   }

   @JsonProperty("dateTime")
   public void setDateTime(final String dateTime) {
      this.dateTime = dateTime;
   }

   @JsonProperty("lDateTime")
   public void setLDateTime(final long lDateTime) {
      this.lDateTime = lDateTime;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ViewDriverWorkingDayStatus)) {
         return false;
      } else {
         ViewDriverWorkingDayStatus other = (ViewDriverWorkingDayStatus)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getLDateTime() != other.getLDateTime()) {
            return false;
         } else {
            Object this$dateTime = this.getDateTime();
            Object other$dateTime = other.getDateTime();
            return this$dateTime == null ? other$dateTime == null : this$dateTime.equals(other$dateTime);
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof ViewDriverWorkingDayStatus;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $lDateTime = this.getLDateTime();
      result = result * 59 + (int)($lDateTime >>> 32 ^ $lDateTime);
      Object $dateTime = this.getDateTime();
      return result * 59 + ($dateTime == null ? 43 : $dateTime.hashCode());
   }

   @Override
   public String toString() {
      return "ViewDriverWorkingDayStatus(dateTime=" + this.getDateTime() + ", lDateTime=" + this.getLDateTime() + ")";
   }
}
