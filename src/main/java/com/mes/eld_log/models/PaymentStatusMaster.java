package com.mes.eld_log.models;

import java.io.Serializable;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.core.mapping.Document;

@EntityScan
@Document(
   collection = "payment_status_master"
)
public class PaymentStatusMaster implements Serializable {
   private static final long serialVersionUID = 1L;
   private Integer paymentStatusId;
   private String paymentStatusName;
   private long clientId;
   private long addedTimestamp;
   private long updatedTimestamp;

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof PaymentStatusMaster)) {
         return false;
      } else {
         PaymentStatusMaster other = (PaymentStatusMaster)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else if (this.getAddedTimestamp() != other.getAddedTimestamp()) {
            return false;
         } else if (this.getUpdatedTimestamp() != other.getUpdatedTimestamp()) {
            return false;
         } else {
            Object this$paymentStatusId = this.getPaymentStatusId();
            Object other$paymentStatusId = other.getPaymentStatusId();
            if (this$paymentStatusId == null ? other$paymentStatusId == null : this$paymentStatusId.equals(other$paymentStatusId)) {
               Object this$paymentStatusName = this.getPaymentStatusName();
               Object other$paymentStatusName = other.getPaymentStatusName();
               return this$paymentStatusName == null ? other$paymentStatusName == null : this$paymentStatusName.equals(other$paymentStatusName);
            } else {
               return false;
            }
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof PaymentStatusMaster;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $clientId = this.getClientId();
      result = result * 59 + (int)($clientId >>> 32 ^ $clientId);
      long $addedTimestamp = this.getAddedTimestamp();
      result = result * 59 + (int)($addedTimestamp >>> 32 ^ $addedTimestamp);
      long $updatedTimestamp = this.getUpdatedTimestamp();
      result = result * 59 + (int)($updatedTimestamp >>> 32 ^ $updatedTimestamp);
      Object $paymentStatusId = this.getPaymentStatusId();
      result = result * 59 + ($paymentStatusId == null ? 43 : $paymentStatusId.hashCode());
      Object $paymentStatusName = this.getPaymentStatusName();
      return result * 59 + ($paymentStatusName == null ? 43 : $paymentStatusName.hashCode());
   }

   @Override
   public String toString() {
      return "PaymentStatusMaster(paymentStatusId="
         + this.getPaymentStatusId()
         + ", paymentStatusName="
         + this.getPaymentStatusName()
         + ", clientId="
         + this.getClientId()
         + ", addedTimestamp="
         + this.getAddedTimestamp()
         + ", updatedTimestamp="
         + this.getUpdatedTimestamp()
         + ")";
   }

   public Integer getPaymentStatusId() {
      return this.paymentStatusId;
   }

   public String getPaymentStatusName() {
      return this.paymentStatusName;
   }

   public long getClientId() {
      return this.clientId;
   }

   public long getAddedTimestamp() {
      return this.addedTimestamp;
   }

   public long getUpdatedTimestamp() {
      return this.updatedTimestamp;
   }

   public void setPaymentStatusId(final Integer paymentStatusId) {
      this.paymentStatusId = paymentStatusId;
   }

   public void setPaymentStatusName(final String paymentStatusName) {
      this.paymentStatusName = paymentStatusName;
   }

   public void setClientId(final long clientId) {
      this.clientId = clientId;
   }

   public void setAddedTimestamp(final long addedTimestamp) {
      this.addedTimestamp = addedTimestamp;
   }

   public void setUpdatedTimestamp(final long updatedTimestamp) {
      this.updatedTimestamp = updatedTimestamp;
   }
}
