package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MaxIdViewDto {
   @JsonProperty("statusId")
   private long statusId;

   public long getStatusId() {
      return this.statusId;
   }

   @JsonProperty("statusId")
   public void setStatusId(final long statusId) {
      this.statusId = statusId;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof MaxIdViewDto)) {
         return false;
      } else {
         MaxIdViewDto other = (MaxIdViewDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            return this.getStatusId() == other.getStatusId();
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof MaxIdViewDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $statusId = this.getStatusId();
      return result * 59 + (int)($statusId >>> 32 ^ $statusId);
   }

   @Override
   public String toString() {
      return "MaxIdViewDto(statusId=" + this.getStatusId() + ")";
   }
}
