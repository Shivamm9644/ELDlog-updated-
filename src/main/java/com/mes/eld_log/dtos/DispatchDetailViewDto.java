package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DispatchDetailViewDto {
   @JsonProperty("_id")
   private String _id;
   @JsonProperty("load")
   private String load;
   @JsonProperty("customerId")
   private long customerId;
   @JsonProperty("customerName")
   private String customerName;
   @JsonProperty("customerReferenceNo")
   private String customerReferenceNo;
   @JsonProperty("shipperId")
   private long shipperId;
   @JsonProperty("shipperName")
   private String shipperName;
   @JsonProperty("receiverId")
   private long receiverId;
   @JsonProperty("receiverName")
   private String receiverName;
   @JsonProperty("shippingDate")
   private String shippingDate;
   @JsonProperty("receivingDate")
   private String receivingDate;

   public String get_id() {
      return this._id;
   }

   public String getLoad() {
      return this.load;
   }

   public long getCustomerId() {
      return this.customerId;
   }

   public String getCustomerName() {
      return this.customerName;
   }

   public String getCustomerReferenceNo() {
      return this.customerReferenceNo;
   }

   public long getShipperId() {
      return this.shipperId;
   }

   public String getShipperName() {
      return this.shipperName;
   }

   public long getReceiverId() {
      return this.receiverId;
   }

   public String getReceiverName() {
      return this.receiverName;
   }

   public String getShippingDate() {
      return this.shippingDate;
   }

   public String getReceivingDate() {
      return this.receivingDate;
   }

   @JsonProperty("_id")
   public void set_id(final String _id) {
      this._id = _id;
   }

   @JsonProperty("load")
   public void setLoad(final String load) {
      this.load = load;
   }

   @JsonProperty("customerId")
   public void setCustomerId(final long customerId) {
      this.customerId = customerId;
   }

   @JsonProperty("customerName")
   public void setCustomerName(final String customerName) {
      this.customerName = customerName;
   }

   @JsonProperty("customerReferenceNo")
   public void setCustomerReferenceNo(final String customerReferenceNo) {
      this.customerReferenceNo = customerReferenceNo;
   }

   @JsonProperty("shipperId")
   public void setShipperId(final long shipperId) {
      this.shipperId = shipperId;
   }

   @JsonProperty("shipperName")
   public void setShipperName(final String shipperName) {
      this.shipperName = shipperName;
   }

   @JsonProperty("receiverId")
   public void setReceiverId(final long receiverId) {
      this.receiverId = receiverId;
   }

   @JsonProperty("receiverName")
   public void setReceiverName(final String receiverName) {
      this.receiverName = receiverName;
   }

   @JsonProperty("shippingDate")
   public void setShippingDate(final String shippingDate) {
      this.shippingDate = shippingDate;
   }

   @JsonProperty("receivingDate")
   public void setReceivingDate(final String receivingDate) {
      this.receivingDate = receivingDate;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof DispatchDetailViewDto)) {
         return false;
      } else {
         DispatchDetailViewDto other = (DispatchDetailViewDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getCustomerId() != other.getCustomerId()) {
            return false;
         } else if (this.getShipperId() != other.getShipperId()) {
            return false;
         } else if (this.getReceiverId() != other.getReceiverId()) {
            return false;
         } else {
            Object this$_id = this.get_id();
            Object other$_id = other.get_id();
            if (this$_id == null ? other$_id == null : this$_id.equals(other$_id)) {
               Object this$load = this.getLoad();
               Object other$load = other.getLoad();
               if (this$load == null ? other$load == null : this$load.equals(other$load)) {
                  Object this$customerName = this.getCustomerName();
                  Object other$customerName = other.getCustomerName();
                  if (this$customerName == null ? other$customerName == null : this$customerName.equals(other$customerName)) {
                     Object this$customerReferenceNo = this.getCustomerReferenceNo();
                     Object other$customerReferenceNo = other.getCustomerReferenceNo();
                     if (this$customerReferenceNo == null ? other$customerReferenceNo == null : this$customerReferenceNo.equals(other$customerReferenceNo)) {
                        Object this$shipperName = this.getShipperName();
                        Object other$shipperName = other.getShipperName();
                        if (this$shipperName == null ? other$shipperName == null : this$shipperName.equals(other$shipperName)) {
                           Object this$receiverName = this.getReceiverName();
                           Object other$receiverName = other.getReceiverName();
                           if (this$receiverName == null ? other$receiverName == null : this$receiverName.equals(other$receiverName)) {
                              Object this$shippingDate = this.getShippingDate();
                              Object other$shippingDate = other.getShippingDate();
                              if (this$shippingDate == null ? other$shippingDate == null : this$shippingDate.equals(other$shippingDate)) {
                                 Object this$receivingDate = this.getReceivingDate();
                                 Object other$receivingDate = other.getReceivingDate();
                                 return this$receivingDate == null ? other$receivingDate == null : this$receivingDate.equals(other$receivingDate);
                              } else {
                                 return false;
                              }
                           } else {
                              return false;
                           }
                        } else {
                           return false;
                        }
                     } else {
                        return false;
                     }
                  } else {
                     return false;
                  }
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
      return other instanceof DispatchDetailViewDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $customerId = this.getCustomerId();
      result = result * 59 + (int)($customerId >>> 32 ^ $customerId);
      long $shipperId = this.getShipperId();
      result = result * 59 + (int)($shipperId >>> 32 ^ $shipperId);
      long $receiverId = this.getReceiverId();
      result = result * 59 + (int)($receiverId >>> 32 ^ $receiverId);
      Object $_id = this.get_id();
      result = result * 59 + ($_id == null ? 43 : $_id.hashCode());
      Object $load = this.getLoad();
      result = result * 59 + ($load == null ? 43 : $load.hashCode());
      Object $customerName = this.getCustomerName();
      result = result * 59 + ($customerName == null ? 43 : $customerName.hashCode());
      Object $customerReferenceNo = this.getCustomerReferenceNo();
      result = result * 59 + ($customerReferenceNo == null ? 43 : $customerReferenceNo.hashCode());
      Object $shipperName = this.getShipperName();
      result = result * 59 + ($shipperName == null ? 43 : $shipperName.hashCode());
      Object $receiverName = this.getReceiverName();
      result = result * 59 + ($receiverName == null ? 43 : $receiverName.hashCode());
      Object $shippingDate = this.getShippingDate();
      result = result * 59 + ($shippingDate == null ? 43 : $shippingDate.hashCode());
      Object $receivingDate = this.getReceivingDate();
      return result * 59 + ($receivingDate == null ? 43 : $receivingDate.hashCode());
   }

   @Override
   public String toString() {
      return "DispatchDetailViewDto(_id="
         + this.get_id()
         + ", load="
         + this.getLoad()
         + ", customerId="
         + this.getCustomerId()
         + ", customerName="
         + this.getCustomerName()
         + ", customerReferenceNo="
         + this.getCustomerReferenceNo()
         + ", shipperId="
         + this.getShipperId()
         + ", shipperName="
         + this.getShipperName()
         + ", receiverId="
         + this.getReceiverId()
         + ", receiverName="
         + this.getReceiverName()
         + ", shippingDate="
         + this.getShippingDate()
         + ", receivingDate="
         + this.getReceivingDate()
         + ")";
   }
}
