package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ELDOtaCRUDDto {
   @JsonProperty("otaId")
   private Integer otaId;
   @JsonProperty("fromDate")
   private String fromDate;
   @JsonProperty("toDate")
   private String toDate;

   public Integer getOtaId() {
      return this.otaId;
   }

   public String getFromDate() {
      return this.fromDate;
   }

   public String getToDate() {
      return this.toDate;
   }

   @JsonProperty("otaId")
   public void setOtaId(final Integer otaId) {
      this.otaId = otaId;
   }

   @JsonProperty("fromDate")
   public void setFromDate(final String fromDate) {
      this.fromDate = fromDate;
   }

   @JsonProperty("toDate")
   public void setToDate(final String toDate) {
      this.toDate = toDate;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ELDOtaCRUDDto)) {
         return false;
      } else {
         ELDOtaCRUDDto other = (ELDOtaCRUDDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$otaId = this.getOtaId();
            Object other$otaId = other.getOtaId();
            if (this$otaId == null ? other$otaId == null : this$otaId.equals(other$otaId)) {
               Object this$fromDate = this.getFromDate();
               Object other$fromDate = other.getFromDate();
               if (this$fromDate == null ? other$fromDate == null : this$fromDate.equals(other$fromDate)) {
                  Object this$toDate = this.getToDate();
                  Object other$toDate = other.getToDate();
                  return this$toDate == null ? other$toDate == null : this$toDate.equals(other$toDate);
               } else {
                  return false;
               }
            } else {
               return false;
            }
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof ELDOtaCRUDDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $otaId = this.getOtaId();
      result = result * 59 + ($otaId == null ? 43 : $otaId.hashCode());
      Object $fromDate = this.getFromDate();
      result = result * 59 + ($fromDate == null ? 43 : $fromDate.hashCode());
      Object $toDate = this.getToDate();
      return result * 59 + ($toDate == null ? 43 : $toDate.hashCode());
   }

   @Override
   public String toString() {
      return "ELDOtaCRUDDto(otaId=" + this.getOtaId() + ", fromDate=" + this.getFromDate() + ", toDate=" + this.getToDate() + ")";
   }
}
