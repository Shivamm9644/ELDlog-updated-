package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OtherChargeViewDto {
   @JsonProperty("dispatchId")
   private String dispatchId;
   @JsonProperty("type")
   private String type;
   @JsonProperty("amount")
   private double amount;
   @JsonProperty("reason")
   private String reason;

   public String getDispatchId() {
      return this.dispatchId;
   }

   public String getType() {
      return this.type;
   }

   public double getAmount() {
      return this.amount;
   }

   public String getReason() {
      return this.reason;
   }

   @JsonProperty("dispatchId")
   public void setDispatchId(final String dispatchId) {
      this.dispatchId = dispatchId;
   }

   @JsonProperty("type")
   public void setType(final String type) {
      this.type = type;
   }

   @JsonProperty("amount")
   public void setAmount(final double amount) {
      this.amount = amount;
   }

   @JsonProperty("reason")
   public void setReason(final String reason) {
      this.reason = reason;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof OtherChargeViewDto)) {
         return false;
      } else {
         OtherChargeViewDto other = (OtherChargeViewDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (Double.compare(this.getAmount(), other.getAmount()) != 0) {
            return false;
         } else {
            Object this$dispatchId = this.getDispatchId();
            Object other$dispatchId = other.getDispatchId();
            if (this$dispatchId == null ? other$dispatchId == null : this$dispatchId.equals(other$dispatchId)) {
               Object this$type = this.getType();
               Object other$type = other.getType();
               if (this$type == null ? other$type == null : this$type.equals(other$type)) {
                  Object this$reason = this.getReason();
                  Object other$reason = other.getReason();
                  return this$reason == null ? other$reason == null : this$reason.equals(other$reason);
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
      return other instanceof OtherChargeViewDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $amount = Double.doubleToLongBits(this.getAmount());
      result = result * 59 + (int)($amount >>> 32 ^ $amount);
      Object $dispatchId = this.getDispatchId();
      result = result * 59 + ($dispatchId == null ? 43 : $dispatchId.hashCode());
      Object $type = this.getType();
      result = result * 59 + ($type == null ? 43 : $type.hashCode());
      Object $reason = this.getReason();
      return result * 59 + ($reason == null ? 43 : $reason.hashCode());
   }

   @Override
   public String toString() {
      return "OtherChargeViewDto(dispatchId="
         + this.getDispatchId()
         + ", type="
         + this.getType()
         + ", amount="
         + this.getAmount()
         + ", reason="
         + this.getReason()
         + ")";
   }
}
