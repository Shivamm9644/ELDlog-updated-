package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReceiverDataViewDto {
   @JsonProperty("dispatchId")
   private String dispatchId;
   @JsonProperty("receiverId")
   private long receiverId;
   @JsonProperty("receiverName")
   private String receiverName;
   @JsonProperty("address")
   private String address;
   @JsonProperty("countryId")
   private long countryId;
   @JsonProperty("countryName")
   private String countryName;
   @JsonProperty("stateId")
   private long stateId;
   @JsonProperty("stateName")
   private String stateName;
   @JsonProperty("cityId")
   private long cityId;
   @JsonProperty("cityName")
   private String cityName;
   @JsonProperty("date")
   private String date;
   @JsonProperty("time")
   private String time;
   @JsonProperty("receivingNo")
   private String receivingNo;
   @JsonProperty("comodity")
   private String comodity;
   @JsonProperty("reeferTemp")
   private double reeferTemp;
   @JsonProperty("referModeId")
   private long referModeId;
   @JsonProperty("referModeName")
   private String referModeName;
   @JsonProperty("caseCount")
   private long caseCount;
   @JsonProperty("pallets")
   private long pallets;
   @JsonProperty("weight")
   private double weight;
   @JsonProperty("shippingNotes")
   private String shippingNotes;
   @JsonProperty("contactPerson")
   private String contactPerson;
   @JsonProperty("mobileNo")
   private String mobileNo;
   @JsonProperty("order")
   private String order;

   public String getDispatchId() {
      return this.dispatchId;
   }

   public long getReceiverId() {
      return this.receiverId;
   }

   public String getReceiverName() {
      return this.receiverName;
   }

   public String getAddress() {
      return this.address;
   }

   public long getCountryId() {
      return this.countryId;
   }

   public String getCountryName() {
      return this.countryName;
   }

   public long getStateId() {
      return this.stateId;
   }

   public String getStateName() {
      return this.stateName;
   }

   public long getCityId() {
      return this.cityId;
   }

   public String getCityName() {
      return this.cityName;
   }

   public String getDate() {
      return this.date;
   }

   public String getTime() {
      return this.time;
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

   public String getReferModeName() {
      return this.referModeName;
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

   @JsonProperty("dispatchId")
   public void setDispatchId(final String dispatchId) {
      this.dispatchId = dispatchId;
   }

   @JsonProperty("receiverId")
   public void setReceiverId(final long receiverId) {
      this.receiverId = receiverId;
   }

   @JsonProperty("receiverName")
   public void setReceiverName(final String receiverName) {
      this.receiverName = receiverName;
   }

   @JsonProperty("address")
   public void setAddress(final String address) {
      this.address = address;
   }

   @JsonProperty("countryId")
   public void setCountryId(final long countryId) {
      this.countryId = countryId;
   }

   @JsonProperty("countryName")
   public void setCountryName(final String countryName) {
      this.countryName = countryName;
   }

   @JsonProperty("stateId")
   public void setStateId(final long stateId) {
      this.stateId = stateId;
   }

   @JsonProperty("stateName")
   public void setStateName(final String stateName) {
      this.stateName = stateName;
   }

   @JsonProperty("cityId")
   public void setCityId(final long cityId) {
      this.cityId = cityId;
   }

   @JsonProperty("cityName")
   public void setCityName(final String cityName) {
      this.cityName = cityName;
   }

   @JsonProperty("date")
   public void setDate(final String date) {
      this.date = date;
   }

   @JsonProperty("time")
   public void setTime(final String time) {
      this.time = time;
   }

   @JsonProperty("receivingNo")
   public void setReceivingNo(final String receivingNo) {
      this.receivingNo = receivingNo;
   }

   @JsonProperty("comodity")
   public void setComodity(final String comodity) {
      this.comodity = comodity;
   }

   @JsonProperty("reeferTemp")
   public void setReeferTemp(final double reeferTemp) {
      this.reeferTemp = reeferTemp;
   }

   @JsonProperty("referModeId")
   public void setReferModeId(final long referModeId) {
      this.referModeId = referModeId;
   }

   @JsonProperty("referModeName")
   public void setReferModeName(final String referModeName) {
      this.referModeName = referModeName;
   }

   @JsonProperty("caseCount")
   public void setCaseCount(final long caseCount) {
      this.caseCount = caseCount;
   }

   @JsonProperty("pallets")
   public void setPallets(final long pallets) {
      this.pallets = pallets;
   }

   @JsonProperty("weight")
   public void setWeight(final double weight) {
      this.weight = weight;
   }

   @JsonProperty("shippingNotes")
   public void setShippingNotes(final String shippingNotes) {
      this.shippingNotes = shippingNotes;
   }

   @JsonProperty("contactPerson")
   public void setContactPerson(final String contactPerson) {
      this.contactPerson = contactPerson;
   }

   @JsonProperty("mobileNo")
   public void setMobileNo(final String mobileNo) {
      this.mobileNo = mobileNo;
   }

   @JsonProperty("order")
   public void setOrder(final String order) {
      this.order = order;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ReceiverDataViewDto)) {
         return false;
      } else {
         ReceiverDataViewDto other = (ReceiverDataViewDto)o;
         if (!other.canEqual(this)) {
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
         } else {
            Object this$dispatchId = this.getDispatchId();
            Object other$dispatchId = other.getDispatchId();
            if (this$dispatchId == null ? other$dispatchId == null : this$dispatchId.equals(other$dispatchId)) {
               Object this$receiverName = this.getReceiverName();
               Object other$receiverName = other.getReceiverName();
               if (this$receiverName == null ? other$receiverName == null : this$receiverName.equals(other$receiverName)) {
                  Object this$address = this.getAddress();
                  Object other$address = other.getAddress();
                  if (this$address == null ? other$address == null : this$address.equals(other$address)) {
                     Object this$countryName = this.getCountryName();
                     Object other$countryName = other.getCountryName();
                     if (this$countryName == null ? other$countryName == null : this$countryName.equals(other$countryName)) {
                        Object this$stateName = this.getStateName();
                        Object other$stateName = other.getStateName();
                        if (this$stateName == null ? other$stateName == null : this$stateName.equals(other$stateName)) {
                           Object this$cityName = this.getCityName();
                           Object other$cityName = other.getCityName();
                           if (this$cityName == null ? other$cityName == null : this$cityName.equals(other$cityName)) {
                              Object this$date = this.getDate();
                              Object other$date = other.getDate();
                              if (this$date == null ? other$date == null : this$date.equals(other$date)) {
                                 Object this$time = this.getTime();
                                 Object other$time = other.getTime();
                                 if (this$time == null ? other$time == null : this$time.equals(other$time)) {
                                    Object this$receivingNo = this.getReceivingNo();
                                    Object other$receivingNo = other.getReceivingNo();
                                    if (this$receivingNo == null ? other$receivingNo == null : this$receivingNo.equals(other$receivingNo)) {
                                       Object this$comodity = this.getComodity();
                                       Object other$comodity = other.getComodity();
                                       if (this$comodity == null ? other$comodity == null : this$comodity.equals(other$comodity)) {
                                          Object this$referModeName = this.getReferModeName();
                                          Object other$referModeName = other.getReferModeName();
                                          if (this$referModeName == null ? other$referModeName == null : this$referModeName.equals(other$referModeName)) {
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
      return other instanceof ReceiverDataViewDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
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
      Object $dispatchId = this.getDispatchId();
      result = result * 59 + ($dispatchId == null ? 43 : $dispatchId.hashCode());
      Object $receiverName = this.getReceiverName();
      result = result * 59 + ($receiverName == null ? 43 : $receiverName.hashCode());
      Object $address = this.getAddress();
      result = result * 59 + ($address == null ? 43 : $address.hashCode());
      Object $countryName = this.getCountryName();
      result = result * 59 + ($countryName == null ? 43 : $countryName.hashCode());
      Object $stateName = this.getStateName();
      result = result * 59 + ($stateName == null ? 43 : $stateName.hashCode());
      Object $cityName = this.getCityName();
      result = result * 59 + ($cityName == null ? 43 : $cityName.hashCode());
      Object $date = this.getDate();
      result = result * 59 + ($date == null ? 43 : $date.hashCode());
      Object $time = this.getTime();
      result = result * 59 + ($time == null ? 43 : $time.hashCode());
      Object $receivingNo = this.getReceivingNo();
      result = result * 59 + ($receivingNo == null ? 43 : $receivingNo.hashCode());
      Object $comodity = this.getComodity();
      result = result * 59 + ($comodity == null ? 43 : $comodity.hashCode());
      Object $referModeName = this.getReferModeName();
      result = result * 59 + ($referModeName == null ? 43 : $referModeName.hashCode());
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
      return "ReceiverDataViewDto(dispatchId="
         + this.getDispatchId()
         + ", receiverId="
         + this.getReceiverId()
         + ", receiverName="
         + this.getReceiverName()
         + ", address="
         + this.getAddress()
         + ", countryId="
         + this.getCountryId()
         + ", countryName="
         + this.getCountryName()
         + ", stateId="
         + this.getStateId()
         + ", stateName="
         + this.getStateName()
         + ", cityId="
         + this.getCityId()
         + ", cityName="
         + this.getCityName()
         + ", date="
         + this.getDate()
         + ", time="
         + this.getTime()
         + ", receivingNo="
         + this.getReceivingNo()
         + ", comodity="
         + this.getComodity()
         + ", reeferTemp="
         + this.getReeferTemp()
         + ", referModeId="
         + this.getReferModeId()
         + ", referModeName="
         + this.getReferModeName()
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
         + ")";
   }
}
