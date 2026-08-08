package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class AllDispatchDataViewDto {
   @JsonProperty("dispatchData")
   private List<DispatchDataViewDto> dispatchData;
   @JsonProperty("otherChargeData")
   private List<OtherChargeViewDto> otherChargeData;
   @JsonProperty("shippingData")
   private List<ShipperDataViewDto> shippingData;
   @JsonProperty("receivingData")
   private List<ReceiverDataViewDto> receivingData;

   public List<DispatchDataViewDto> getDispatchData() {
      return this.dispatchData;
   }

   public List<OtherChargeViewDto> getOtherChargeData() {
      return this.otherChargeData;
   }

   public List<ShipperDataViewDto> getShippingData() {
      return this.shippingData;
   }

   public List<ReceiverDataViewDto> getReceivingData() {
      return this.receivingData;
   }

   @JsonProperty("dispatchData")
   public void setDispatchData(final List<DispatchDataViewDto> dispatchData) {
      this.dispatchData = dispatchData;
   }

   @JsonProperty("otherChargeData")
   public void setOtherChargeData(final List<OtherChargeViewDto> otherChargeData) {
      this.otherChargeData = otherChargeData;
   }

   @JsonProperty("shippingData")
   public void setShippingData(final List<ShipperDataViewDto> shippingData) {
      this.shippingData = shippingData;
   }

   @JsonProperty("receivingData")
   public void setReceivingData(final List<ReceiverDataViewDto> receivingData) {
      this.receivingData = receivingData;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof AllDispatchDataViewDto)) {
         return false;
      } else {
         AllDispatchDataViewDto other = (AllDispatchDataViewDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$dispatchData = this.getDispatchData();
            Object other$dispatchData = other.getDispatchData();
            if (this$dispatchData == null ? other$dispatchData == null : this$dispatchData.equals(other$dispatchData)) {
               Object this$otherChargeData = this.getOtherChargeData();
               Object other$otherChargeData = other.getOtherChargeData();
               if (this$otherChargeData == null ? other$otherChargeData == null : this$otherChargeData.equals(other$otherChargeData)) {
                  Object this$shippingData = this.getShippingData();
                  Object other$shippingData = other.getShippingData();
                  if (this$shippingData == null ? other$shippingData == null : this$shippingData.equals(other$shippingData)) {
                     Object this$receivingData = this.getReceivingData();
                     Object other$receivingData = other.getReceivingData();
                     return this$receivingData == null ? other$receivingData == null : this$receivingData.equals(other$receivingData);
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
      return other instanceof AllDispatchDataViewDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $dispatchData = this.getDispatchData();
      result = result * 59 + ($dispatchData == null ? 43 : $dispatchData.hashCode());
      Object $otherChargeData = this.getOtherChargeData();
      result = result * 59 + ($otherChargeData == null ? 43 : $otherChargeData.hashCode());
      Object $shippingData = this.getShippingData();
      result = result * 59 + ($shippingData == null ? 43 : $shippingData.hashCode());
      Object $receivingData = this.getReceivingData();
      return result * 59 + ($receivingData == null ? 43 : $receivingData.hashCode());
   }

   @Override
   public String toString() {
      return "AllDispatchDataViewDto(dispatchData="
         + this.getDispatchData()
         + ", otherChargeData="
         + this.getOtherChargeData()
         + ", shippingData="
         + this.getShippingData()
         + ", receivingData="
         + this.getReceivingData()
         + ")";
   }
}
