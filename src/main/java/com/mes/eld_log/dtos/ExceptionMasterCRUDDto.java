package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExceptionMasterCRUDDto {
   @JsonProperty("exceptionId")
   private Integer exceptionId;
   @JsonProperty("clientId")
   private long clientId;
   @JsonProperty("driverId")
   private long driverId;
   @JsonProperty("tokenNo")
   private String tokenNo;

   public Integer getExceptionId() {
      return this.exceptionId;
   }

   public long getClientId() {
      return this.clientId;
   }

   public long getDriverId() {
      return this.driverId;
   }

   public String getTokenNo() {
      return this.tokenNo;
   }

   @JsonProperty("exceptionId")
   public void setExceptionId(final Integer exceptionId) {
      this.exceptionId = exceptionId;
   }

   @JsonProperty("clientId")
   public void setClientId(final long clientId) {
      this.clientId = clientId;
   }

   @JsonProperty("driverId")
   public void setDriverId(final long driverId) {
      this.driverId = driverId;
   }

   @JsonProperty("tokenNo")
   public void setTokenNo(final String tokenNo) {
      this.tokenNo = tokenNo;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ExceptionMasterCRUDDto)) {
         return false;
      } else {
         ExceptionMasterCRUDDto other = (ExceptionMasterCRUDDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else if (this.getDriverId() != other.getDriverId()) {
            return false;
         } else {
            Object this$exceptionId = this.getExceptionId();
            Object other$exceptionId = other.getExceptionId();
            if (this$exceptionId == null ? other$exceptionId == null : this$exceptionId.equals(other$exceptionId)) {
               Object this$tokenNo = this.getTokenNo();
               Object other$tokenNo = other.getTokenNo();
               return this$tokenNo == null ? other$tokenNo == null : this$tokenNo.equals(other$tokenNo);
            } else {
               return false;
            }
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof ExceptionMasterCRUDDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $clientId = this.getClientId();
      result = result * 59 + (int)($clientId >>> 32 ^ $clientId);
      long $driverId = this.getDriverId();
      result = result * 59 + (int)($driverId >>> 32 ^ $driverId);
      Object $exceptionId = this.getExceptionId();
      result = result * 59 + ($exceptionId == null ? 43 : $exceptionId.hashCode());
      Object $tokenNo = this.getTokenNo();
      return result * 59 + ($tokenNo == null ? 43 : $tokenNo.hashCode());
   }

   @Override
   public String toString() {
      return "ExceptionMasterCRUDDto(exceptionId="
         + this.getExceptionId()
         + ", clientId="
         + this.getClientId()
         + ", driverId="
         + this.getDriverId()
         + ", tokenNo="
         + this.getTokenNo()
         + ")";
   }
}
