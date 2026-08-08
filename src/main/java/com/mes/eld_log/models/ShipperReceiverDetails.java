package com.mes.eld_log.models;

import java.io.Serializable;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.core.mapping.Document;

@EntityScan
@Document(
   collection = "shipper_receiver_details"
)
public class ShipperReceiverDetails implements Serializable {
   private static final long serialVersionUID = 1L;
   private String dispatchId;
   private long shipperId;
   private long receiverId;
   private String address;
   private long countryId;
   private long stateId;
   private long cityId;
   private String date;
   private String time;
   private String pickupNo;
   private String receivingNo;
   private String comodity;
   private double reeferTemp;
   private long referModeId;
   private long caseCount;
   private long pallets;
   private double weight;
   private String shippingNotes;
   private String contactPerson;
   private String mobileNo;
   private String order;
   private long addedTimestamp;
   private long updatedTimestamp;

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ShipperReceiverDetails)) {
         return false;
      } else {
         ShipperReceiverDetails other = (ShipperReceiverDetails)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getShipperId() != other.getShipperId()) {
            return false;
         } else if (this.getReceiverId() != other.getReceiverId()) {
            return false;
         } else if (this.getCountryId() != other.getCountryId()) {
            return false;
         } else if (this.getStateId() != other.getStateId()) {
            return false;
         } else if (this.getCityId() != other.getCityId()) {
            return false;
         } else if (Double.compare(this.getReeferTemp(), other.getReeferTemp()) != 0) {
            return false;
         } else if (this.getReferModeId() != other.getReferModeId()) {
            return false;
         } else if (this.getCaseCount() != other.getCaseCount()) {
            return false;
         } else if (this.getPallets() != other.getPallets()) {
            return false;
         } else if (Double.compare(this.getWeight(), other.getWeight()) != 0) {
            return false;
         } else if (this.getAddedTimestamp() != other.getAddedTimestamp()) {
            return false;
         } else if (this.getUpdatedTimestamp() != other.getUpdatedTimestamp()) {
            return false;
         } else {
            Object this$dispatchId = this.getDispatchId();
            Object other$dispatchId = other.getDispatchId();
            if (this$dispatchId == null ? other$dispatchId == null : this$dispatchId.equals(other$dispatchId)) {
               Object this$address = this.getAddress();
               Object other$address = other.getAddress();
               if (this$address == null ? other$address == null : this$address.equals(other$address)) {
                  Object this$date = this.getDate();
                  Object other$date = other.getDate();
                  if (this$date == null ? other$date == null : this$date.equals(other$date)) {
                     Object this$time = this.getTime();
                     Object other$time = other.getTime();
                     if (this$time == null ? other$time == null : this$time.equals(other$time)) {
                        Object this$pickupNo = this.getPickupNo();
                        Object other$pickupNo = other.getPickupNo();
                        if (this$pickupNo == null ? other$pickupNo == null : this$pickupNo.equals(other$pickupNo)) {
                           Object this$receivingNo = this.getReceivingNo();
                           Object other$receivingNo = other.getReceivingNo();
                           if (this$receivingNo == null ? other$receivingNo == null : this$receivingNo.equals(other$receivingNo)) {
                              Object this$comodity = this.getComodity();
                              Object other$comodity = other.getComodity();
                              if (this$comodity == null ? other$comodity == null : this$comodity.equals(other$comodity)) {
                                 Object this$shippingNotes = this.getShippingNotes();
                                 Object other$shippingNotes = other.getShippingNotes();
                                 if (this$shippingNotes == null ? other$shippingNotes == null : this$shippingNotes.equals(other$shippingNotes)) {
                                    Object this$contactPerson = this.getContactPerson();
                                    Object other$contactPerson = other.getContactPerson();
                                    if (this$contactPerson == null ? other$contactPerson == null : this$contactPerson.equals(other$contactPerson)) {
                                       Object this$mobileNo = this.getMobileNo();
                                       Object other$mobileNo = other.getMobileNo();
                                       if (this$mobileNo == null ? other$mobileNo == null : this$mobileNo.equals(other$mobileNo)) {
                                          Object this$order = this.getOrder();
                                          Object other$order = other.getOrder();
                                          return this$order == null ? other$order == null : this$order.equals(other$order);
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
      return other instanceof ShipperReceiverDetails;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $shipperId = this.getShipperId();
      result = result * 59 + (int)($shipperId >>> 32 ^ $shipperId);
      long $receiverId = this.getReceiverId();
      result = result * 59 + (int)($receiverId >>> 32 ^ $receiverId);
      long $countryId = this.getCountryId();
      result = result * 59 + (int)($countryId >>> 32 ^ $countryId);
      long $stateId = this.getStateId();
      result = result * 59 + (int)($stateId >>> 32 ^ $stateId);
      long $cityId = this.getCityId();
      result = result * 59 + (int)($cityId >>> 32 ^ $cityId);
      long $reeferTemp = Double.doubleToLongBits(this.getReeferTemp());
      result = result * 59 + (int)($reeferTemp >>> 32 ^ $reeferTemp);
      long $referModeId = this.getReferModeId();
      result = result * 59 + (int)($referModeId >>> 32 ^ $referModeId);
      long $caseCount = this.getCaseCount();
      result = result * 59 + (int)($caseCount >>> 32 ^ $caseCount);
      long $pallets = this.getPallets();
      result = result * 59 + (int)($pallets >>> 32 ^ $pallets);
      long $weight = Double.doubleToLongBits(this.getWeight());
      result = result * 59 + (int)($weight >>> 32 ^ $weight);
      long $addedTimestamp = this.getAddedTimestamp();
      result = result * 59 + (int)($addedTimestamp >>> 32 ^ $addedTimestamp);
      long $updatedTimestamp = this.getUpdatedTimestamp();
      result = result * 59 + (int)($updatedTimestamp >>> 32 ^ $updatedTimestamp);
      Object $dispatchId = this.getDispatchId();
      result = result * 59 + ($dispatchId == null ? 43 : $dispatchId.hashCode());
      Object $address = this.getAddress();
      result = result * 59 + ($address == null ? 43 : $address.hashCode());
      Object $date = this.getDate();
      result = result * 59 + ($date == null ? 43 : $date.hashCode());
      Object $time = this.getTime();
      result = result * 59 + ($time == null ? 43 : $time.hashCode());
      Object $pickupNo = this.getPickupNo();
      result = result * 59 + ($pickupNo == null ? 43 : $pickupNo.hashCode());
      Object $receivingNo = this.getReceivingNo();
      result = result * 59 + ($receivingNo == null ? 43 : $receivingNo.hashCode());
      Object $comodity = this.getComodity();
      result = result * 59 + ($comodity == null ? 43 : $comodity.hashCode());
      Object $shippingNotes = this.getShippingNotes();
      result = result * 59 + ($shippingNotes == null ? 43 : $shippingNotes.hashCode());
      Object $contactPerson = this.getContactPerson();
      result = result * 59 + ($contactPerson == null ? 43 : $contactPerson.hashCode());
      Object $mobileNo = this.getMobileNo();
      result = result * 59 + ($mobileNo == null ? 43 : $mobileNo.hashCode());
      Object $order = this.getOrder();
      return result * 59 + ($order == null ? 43 : $order.hashCode());
   }

   @Override
   public String toString() {
      return "ShipperReceiverDetails(dispatchId="
         + this.getDispatchId()
         + ", shipperId="
         + this.getShipperId()
         + ", receiverId="
         + this.getReceiverId()
         + ", address="
         + this.getAddress()
         + ", countryId="
         + this.getCountryId()
         + ", stateId="
         + this.getStateId()
         + ", cityId="
         + this.getCityId()
         + ", date="
         + this.getDate()
         + ", time="
         + this.getTime()
         + ", pickupNo="
         + this.getPickupNo()
         + ", receivingNo="
         + this.getReceivingNo()
         + ", comodity="
         + this.getComodity()
         + ", reeferTemp="
         + this.getReeferTemp()
         + ", referModeId="
         + this.getReferModeId()
         + ", caseCount="
         + this.getCaseCount()
         + ", pallets="
         + this.getPallets()
         + ", weight="
         + this.getWeight()
         + ", shippingNotes="
         + this.getShippingNotes()
         + ", contactPerson="
         + this.getContactPerson()
         + ", mobileNo="
         + this.getMobileNo()
         + ", order="
         + this.getOrder()
         + ", addedTimestamp="
         + this.getAddedTimestamp()
         + ", updatedTimestamp="
         + this.getUpdatedTimestamp()
         + ")";
   }

   public String getDispatchId() {
      return this.dispatchId;
   }

   public long getShipperId() {
      return this.shipperId;
   }

   public long getReceiverId() {
      return this.receiverId;
   }

   public String getAddress() {
      return this.address;
   }

   public long getCountryId() {
      return this.countryId;
   }

   public long getStateId() {
      return this.stateId;
   }

   public long getCityId() {
      return this.cityId;
   }

   public String getDate() {
      return this.date;
   }

   public String getTime() {
      return this.time;
   }

   public String getPickupNo() {
      return this.pickupNo;
   }

   public String getReceivingNo() {
      return this.receivingNo;
   }

   public String getComodity() {
      return this.comodity;
   }

   public double getReeferTemp() {
      return this.reeferTemp;
   }

   public long getReferModeId() {
      return this.referModeId;
   }

   public long getCaseCount() {
      return this.caseCount;
   }

   public long getPallets() {
      return this.pallets;
   }

   public double getWeight() {
      return this.weight;
   }

   public String getShippingNotes() {
      return this.shippingNotes;
   }

   public String getContactPerson() {
      return this.contactPerson;
   }

   public String getMobileNo() {
      return this.mobileNo;
   }

   public String getOrder() {
      return this.order;
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

   public void setShipperId(final long shipperId) {
      this.shipperId = shipperId;
   }

   public void setReceiverId(final long receiverId) {
      this.receiverId = receiverId;
   }

   public void setAddress(final String address) {
      this.address = address;
   }

   public void setCountryId(final long countryId) {
      this.countryId = countryId;
   }

   public void setStateId(final long stateId) {
      this.stateId = stateId;
   }

   public void setCityId(final long cityId) {
      this.cityId = cityId;
   }

   public void setDate(final String date) {
      this.date = date;
   }

   public void setTime(final String time) {
      this.time = time;
   }

   public void setPickupNo(final String pickupNo) {
      this.pickupNo = pickupNo;
   }

   public void setReceivingNo(final String receivingNo) {
      this.receivingNo = receivingNo;
   }

   public void setComodity(final String comodity) {
      this.comodity = comodity;
   }

   public void setReeferTemp(final double reeferTemp) {
      this.reeferTemp = reeferTemp;
   }

   public void setReferModeId(final long referModeId) {
      this.referModeId = referModeId;
   }

   public void setCaseCount(final long caseCount) {
      this.caseCount = caseCount;
   }

   public void setPallets(final long pallets) {
      this.pallets = pallets;
   }

   public void setWeight(final double weight) {
      this.weight = weight;
   }

   public void setShippingNotes(final String shippingNotes) {
      this.shippingNotes = shippingNotes;
   }

   public void setContactPerson(final String contactPerson) {
      this.contactPerson = contactPerson;
   }

   public void setMobileNo(final String mobileNo) {
      this.mobileNo = mobileNo;
   }

   public void setOrder(final String order) {
      this.order = order;
   }

   public void setAddedTimestamp(final long addedTimestamp) {
      this.addedTimestamp = addedTimestamp;
   }

   public void setUpdatedTimestamp(final long updatedTimestamp) {
      this.updatedTimestamp = updatedTimestamp;
   }
}
