package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PaymentStatusMasterCRUDDto {
   @JsonProperty("paymentStatusId")
   private Integer paymentStatusId;
   @JsonProperty("clientId")
   private long clientId;

   public Integer getPaymentStatusId() {
      return this.paymentStatusId;
   }

   public long getClientId() {
      return this.clientId;
   }

   @JsonProperty("paymentStatusId")
   public void setPaymentStatusId(final Integer paymentStatusId) {
      this.paymentStatusId = paymentStatusId;
   }

   @JsonProperty("clientId")
   public void setClientId(final long clientId) {
      this.clientId = clientId;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof PaymentStatusMasterCRUDDto)) {
         return false;
      } else {
         PaymentStatusMasterCRUDDto other = (PaymentStatusMasterCRUDDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else {
            Object this$paymentStatusId = this.getPaymentStatusId();
            Object other$paymentStatusId = other.getPaymentStatusId();
            return this$paymentStatusId == null ? other$paymentStatusId == null : this$paymentStatusId.equals(other$paymentStatusId);
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof PaymentStatusMasterCRUDDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $clientId = this.getClientId();
      result = result * 59 + (int)($clientId >>> 32 ^ $clientId);
      Object $paymentStatusId = this.getPaymentStatusId();
      return result * 59 + ($paymentStatusId == null ? 43 : $paymentStatusId.hashCode());
   }

   @Override
   public String toString() {
      return "PaymentStatusMasterCRUDDto(paymentStatusId=" + this.getPaymentStatusId() + ", clientId=" + this.getClientId() + ")";
   }
}
