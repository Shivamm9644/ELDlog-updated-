package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mes.eld_log.models.DispatchDetails;
import com.mes.eld_log.models.OtherCharges;
import com.mes.eld_log.models.ShipperReceiverDetails;
import java.util.ArrayList;

public class DispatchDetailCRUDDto {
   @JsonProperty("dispatchId")
   private String dispatchId;
   @JsonProperty("driverId")
   private long driverId;
   @JsonProperty("clientId")
   private long clientId;
   @JsonProperty("dispatchData")
   private ArrayList<DispatchDetails> dispatchData;
   @JsonProperty("otherChargeData")
   private ArrayList<OtherCharges> otherChargeData;
   @JsonProperty("shipperData")
   private ArrayList<ShipperReceiverDetails> shipperData;
   @JsonProperty("receiverData")
   private ArrayList<ShipperReceiverDetails> receiverData;

   public String getDispatchId() {
      return this.dispatchId;
   }

   public long getDriverId() {
      return this.driverId;
   }

   public long getClientId() {
      return this.clientId;
   }

   public ArrayList<DispatchDetails> getDispatchData() {
      return this.dispatchData;
   }

   public ArrayList<OtherCharges> getOtherChargeData() {
      return this.otherChargeData;
   }

   public ArrayList<ShipperReceiverDetails> getShipperData() {
      return this.shipperData;
   }

   public ArrayList<ShipperReceiverDetails> getReceiverData() {
      return this.receiverData;
   }

   @JsonProperty("dispatchId")
   public void setDispatchId(final String dispatchId) {
      this.dispatchId = dispatchId;
   }

   @JsonProperty("driverId")
   public void setDriverId(final long driverId) {
      this.driverId = driverId;
   }

   @JsonProperty("clientId")
   public void setClientId(final long clientId) {
      this.clientId = clientId;
   }

   @JsonProperty("dispatchData")
   public void setDispatchData(final ArrayList<DispatchDetails> dispatchData) {
      this.dispatchData = dispatchData;
   }

   @JsonProperty("otherChargeData")
   public void setOtherChargeData(final ArrayList<OtherCharges> otherChargeData) {
      this.otherChargeData = otherChargeData;
   }

   @JsonProperty("shipperData")
   public void setShipperData(final ArrayList<ShipperReceiverDetails> shipperData) {
      this.shipperData = shipperData;
   }

   @JsonProperty("receiverData")
   public void setReceiverData(final ArrayList<ShipperReceiverDetails> receiverData) {
      this.receiverData = receiverData;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof DispatchDetailCRUDDto)) {
         return false;
      } else {
         DispatchDetailCRUDDto other = (DispatchDetailCRUDDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getDriverId() != other.getDriverId()) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else {
            Object this$dispatchId = this.getDispatchId();
            Object other$dispatchId = other.getDispatchId();
            if (this$dispatchId == null ? other$dispatchId == null : this$dispatchId.equals(other$dispatchId)) {
               Object this$dispatchData = this.getDispatchData();
               Object other$dispatchData = other.getDispatchData();
               if (this$dispatchData == null ? other$dispatchData == null : this$dispatchData.equals(other$dispatchData)) {
                  Object this$otherChargeData = this.getOtherChargeData();
                  Object other$otherChargeData = other.getOtherChargeData();
                  if (this$otherChargeData == null ? other$otherChargeData == null : this$otherChargeData.equals(other$otherChargeData)) {
                     Object this$shipperData = this.getShipperData();
                     Object other$shipperData = other.getShipperData();
                     if (this$shipperData == null ? other$shipperData == null : this$shipperData.equals(other$shipperData)) {
                        Object this$receiverData = this.getReceiverData();
                        Object other$receiverData = other.getReceiverData();
                        return this$receiverData == null ? other$receiverData == null : this$receiverData.equals(other$receiverData);
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
      return other instanceof DispatchDetailCRUDDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $driverId = this.getDriverId();
      result = result * 59 + (int)($driverId >>> 32 ^ $driverId);
      long $clientId = this.getClientId();
      result = result * 59 + (int)($clientId >>> 32 ^ $clientId);
      Object $dispatchId = this.getDispatchId();
      result = result * 59 + ($dispatchId == null ? 43 : $dispatchId.hashCode());
      Object $dispatchData = this.getDispatchData();
      result = result * 59 + ($dispatchData == null ? 43 : $dispatchData.hashCode());
      Object $otherChargeData = this.getOtherChargeData();
      result = result * 59 + ($otherChargeData == null ? 43 : $otherChargeData.hashCode());
      Object $shipperData = this.getShipperData();
      result = result * 59 + ($shipperData == null ? 43 : $shipperData.hashCode());
      Object $receiverData = this.getReceiverData();
      return result * 59 + ($receiverData == null ? 43 : $receiverData.hashCode());
   }

   @Override
   public String toString() {
      return "DispatchDetailCRUDDto(dispatchId="
         + this.getDispatchId()
         + ", driverId="
         + this.getDriverId()
         + ", clientId="
         + this.getClientId()
         + ", dispatchData="
         + this.getDispatchData()
         + ", otherChargeData="
         + this.getOtherChargeData()
         + ", shipperData="
         + this.getShipperData()
         + ", receiverData="
         + this.getReceiverData()
         + ")";
   }
}
