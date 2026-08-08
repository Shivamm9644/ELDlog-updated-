package com.mes.eld_log.models;

import java.io.Serializable;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.core.mapping.Document;

@EntityScan
@Document(
   collection = "other_charges"
)
public class OtherCharges implements Serializable {
   private static final long serialVersionUID = 1L;
   private String dispatchId;
   private String type;
   private double amount;
   private String reason;
   private long addedTimestamp;
   private long updatedTimestamp;

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof OtherCharges)) {
         return false;
      } else {
         OtherCharges other = (OtherCharges)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (Double.compare(this.getAmount(), other.getAmount()) != 0) {
            return false;
         } else if (this.getAddedTimestamp() != other.getAddedTimestamp()) {
            return false;
         } else if (this.getUpdatedTimestamp() != other.getUpdatedTimestamp()) {
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
      return other instanceof OtherCharges;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $amount = Double.doubleToLongBits(this.getAmount());
      result = result * 59 + (int)($amount >>> 32 ^ $amount);
      long $addedTimestamp = this.getAddedTimestamp();
      result = result * 59 + (int)($addedTimestamp >>> 32 ^ $addedTimestamp);
      long $updatedTimestamp = this.getUpdatedTimestamp();
      result = result * 59 + (int)($updatedTimestamp >>> 32 ^ $updatedTimestamp);
      Object $dispatchId = this.getDispatchId();
      result = result * 59 + ($dispatchId == null ? 43 : $dispatchId.hashCode());
      Object $type = this.getType();
      result = result * 59 + ($type == null ? 43 : $type.hashCode());
      Object $reason = this.getReason();
      return result * 59 + ($reason == null ? 43 : $reason.hashCode());
   }

   @Override
   public String toString() {
      return "OtherCharges(dispatchId="
         + this.getDispatchId()
         + ", type="
         + this.getType()
         + ", amount="
         + this.getAmount()
         + ", reason="
         + this.getReason()
         + ", addedTimestamp="
         + this.getAddedTimestamp()
         + ", updatedTimestamp="
         + this.getUpdatedTimestamp()
         + ")";
   }

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

   public long getAddedTimestamp() {
      return this.addedTimestamp;
   }

   public long getUpdatedTimestamp() {
      return this.updatedTimestamp;
   }

   public void setDispatchId(final String dispatchId) {
      this.dispatchId = dispatchId;
   }

   public void setType(final String type) {
      this.type = type;
   }

   public void setAmount(final double amount) {
      this.amount = amount;
   }

   public void setReason(final String reason) {
      this.reason = reason;
   }

   public void setAddedTimestamp(final long addedTimestamp) {
      this.addedTimestamp = addedTimestamp;
   }

   public void setUpdatedTimestamp(final long updatedTimestamp) {
      this.updatedTimestamp = updatedTimestamp;
   }
}
