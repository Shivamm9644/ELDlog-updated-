package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductMasterCRUDDto {
   @JsonProperty("productId")
   private Integer productId;
   @JsonProperty("clientId")
   private long clientId;

   public Integer getProductId() {
      return this.productId;
   }

   public long getClientId() {
      return this.clientId;
   }

   @JsonProperty("productId")
   public void setProductId(final Integer productId) {
      this.productId = productId;
   }

   @JsonProperty("clientId")
   public void setClientId(final long clientId) {
      this.clientId = clientId;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ProductMasterCRUDDto)) {
         return false;
      } else {
         ProductMasterCRUDDto other = (ProductMasterCRUDDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else {
            Object this$productId = this.getProductId();
            Object other$productId = other.getProductId();
            return this$productId == null ? other$productId == null : this$productId.equals(other$productId);
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof ProductMasterCRUDDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $clientId = this.getClientId();
      result = result * 59 + (int)($clientId >>> 32 ^ $clientId);
      Object $productId = this.getProductId();
      return result * 59 + ($productId == null ? 43 : $productId.hashCode());
   }

   @Override
   public String toString() {
      return "ProductMasterCRUDDto(productId=" + this.getProductId() + ", clientId=" + this.getClientId() + ")";
   }
}
