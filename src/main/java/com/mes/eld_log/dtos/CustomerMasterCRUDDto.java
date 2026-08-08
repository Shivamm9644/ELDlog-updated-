package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomerMasterCRUDDto {
   @JsonProperty("customerId")
   private Integer customerId;
   @JsonProperty("clientId")
   private long clientId;

   public Integer getCustomerId() {
      return this.customerId;
   }

   public long getClientId() {
      return this.clientId;
   }

   @JsonProperty("customerId")
   public void setCustomerId(final Integer customerId) {
      this.customerId = customerId;
   }

   @JsonProperty("clientId")
   public void setClientId(final long clientId) {
      this.clientId = clientId;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof CustomerMasterCRUDDto)) {
         return false;
      } else {
         CustomerMasterCRUDDto other = (CustomerMasterCRUDDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else {
            Object this$customerId = this.getCustomerId();
            Object other$customerId = other.getCustomerId();
            return this$customerId == null ? other$customerId == null : this$customerId.equals(other$customerId);
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof CustomerMasterCRUDDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $clientId = this.getClientId();
      result = result * 59 + (int)($clientId >>> 32 ^ $clientId);
      Object $customerId = this.getCustomerId();
      return result * 59 + ($customerId == null ? 43 : $customerId.hashCode());
   }

   @Override
   public String toString() {
      return "CustomerMasterCRUDDto(customerId=" + this.getCustomerId() + ", clientId=" + this.getClientId() + ")";
   }
}
