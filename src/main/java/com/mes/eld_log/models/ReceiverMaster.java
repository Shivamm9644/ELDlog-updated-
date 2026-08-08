package com.mes.eld_log.models;

import java.io.Serializable;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.core.mapping.Document;

@EntityScan
@Document(
   collection = "receiver_master"
)
public class ReceiverMaster implements Serializable {
   private static final long serialVersionUID = 1L;
   private Integer receiverId;
   private String receiverName;
   private String receiverStartTime;
   private String receiverEndTime;
   private String appointment;
   private String physicalAddress;
   private long clientId;
   private long countryId;
   private long stateId;
   private long cityId;
   private long zipcode;
   private long contactNo;
   private String contactPerson;
   private String status;
   private String remarks;
   private long addedTimestamp;
   private long updatedTimestamp;

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ReceiverMaster)) {
         return false;
      } else {
         ReceiverMaster other = (ReceiverMaster)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else if (this.getCountryId() != other.getCountryId()) {
            return false;
         } else if (this.getStateId() != other.getStateId()) {
            return false;
         } else if (this.getCityId() != other.getCityId()) {
            return false;
         } else if (this.getZipcode() != other.getZipcode()) {
            return false;
         } else if (this.getContactNo() != other.getContactNo()) {
            return false;
         } else if (this.getAddedTimestamp() != other.getAddedTimestamp()) {
            return false;
         } else if (this.getUpdatedTimestamp() != other.getUpdatedTimestamp()) {
            return false;
         } else {
            Object this$receiverId = this.getReceiverId();
            Object other$receiverId = other.getReceiverId();
            if (this$receiverId == null ? other$receiverId == null : this$receiverId.equals(other$receiverId)) {
               Object this$receiverName = this.getReceiverName();
               Object other$receiverName = other.getReceiverName();
               if (this$receiverName == null ? other$receiverName == null : this$receiverName.equals(other$receiverName)) {
                  Object this$receiverStartTime = this.getReceiverStartTime();
                  Object other$receiverStartTime = other.getReceiverStartTime();
                  if (this$receiverStartTime == null ? other$receiverStartTime == null : this$receiverStartTime.equals(other$receiverStartTime)) {
                     Object this$receiverEndTime = this.getReceiverEndTime();
                     Object other$receiverEndTime = other.getReceiverEndTime();
                     if (this$receiverEndTime == null ? other$receiverEndTime == null : this$receiverEndTime.equals(other$receiverEndTime)) {
                        Object this$appointment = this.getAppointment();
                        Object other$appointment = other.getAppointment();
                        if (this$appointment == null ? other$appointment == null : this$appointment.equals(other$appointment)) {
                           Object this$physicalAddress = this.getPhysicalAddress();
                           Object other$physicalAddress = other.getPhysicalAddress();
                           if (this$physicalAddress == null ? other$physicalAddress == null : this$physicalAddress.equals(other$physicalAddress)) {
                              Object this$contactPerson = this.getContactPerson();
                              Object other$contactPerson = other.getContactPerson();
                              if (this$contactPerson == null ? other$contactPerson == null : this$contactPerson.equals(other$contactPerson)) {
                                 Object this$status = this.getStatus();
                                 Object other$status = other.getStatus();
                                 if (this$status == null ? other$status == null : this$status.equals(other$status)) {
                                    Object this$remarks = this.getRemarks();
                                    Object other$remarks = other.getRemarks();
                                    return this$remarks == null ? other$remarks == null : this$remarks.equals(other$remarks);
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
      return other instanceof ReceiverMaster;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $clientId = this.getClientId();
      result = result * 59 + (int)($clientId >>> 32 ^ $clientId);
      long $countryId = this.getCountryId();
      result = result * 59 + (int)($countryId >>> 32 ^ $countryId);
      long $stateId = this.getStateId();
      result = result * 59 + (int)($stateId >>> 32 ^ $stateId);
      long $cityId = this.getCityId();
      result = result * 59 + (int)($cityId >>> 32 ^ $cityId);
      long $zipcode = this.getZipcode();
      result = result * 59 + (int)($zipcode >>> 32 ^ $zipcode);
      long $contactNo = this.getContactNo();
      result = result * 59 + (int)($contactNo >>> 32 ^ $contactNo);
      long $addedTimestamp = this.getAddedTimestamp();
      result = result * 59 + (int)($addedTimestamp >>> 32 ^ $addedTimestamp);
      long $updatedTimestamp = this.getUpdatedTimestamp();
      result = result * 59 + (int)($updatedTimestamp >>> 32 ^ $updatedTimestamp);
      Object $receiverId = this.getReceiverId();
      result = result * 59 + ($receiverId == null ? 43 : $receiverId.hashCode());
      Object $receiverName = this.getReceiverName();
      result = result * 59 + ($receiverName == null ? 43 : $receiverName.hashCode());
      Object $receiverStartTime = this.getReceiverStartTime();
      result = result * 59 + ($receiverStartTime == null ? 43 : $receiverStartTime.hashCode());
      Object $receiverEndTime = this.getReceiverEndTime();
      result = result * 59 + ($receiverEndTime == null ? 43 : $receiverEndTime.hashCode());
      Object $appointment = this.getAppointment();
      result = result * 59 + ($appointment == null ? 43 : $appointment.hashCode());
      Object $physicalAddress = this.getPhysicalAddress();
      result = result * 59 + ($physicalAddress == null ? 43 : $physicalAddress.hashCode());
      Object $contactPerson = this.getContactPerson();
      result = result * 59 + ($contactPerson == null ? 43 : $contactPerson.hashCode());
      Object $status = this.getStatus();
      result = result * 59 + ($status == null ? 43 : $status.hashCode());
      Object $remarks = this.getRemarks();
      return result * 59 + ($remarks == null ? 43 : $remarks.hashCode());
   }

   @Override
   public String toString() {
      return "ReceiverMaster(receiverId="
         + this.getReceiverId()
         + ", receiverName="
         + this.getReceiverName()
         + ", receiverStartTime="
         + this.getReceiverStartTime()
         + ", receiverEndTime="
         + this.getReceiverEndTime()
         + ", appointment="
         + this.getAppointment()
         + ", physicalAddress="
         + this.getPhysicalAddress()
         + ", clientId="
         + this.getClientId()
         + ", countryId="
         + this.getCountryId()
         + ", stateId="
         + this.getStateId()
         + ", cityId="
         + this.getCityId()
         + ", zipcode="
         + this.getZipcode()
         + ", contactNo="
         + this.getContactNo()
         + ", contactPerson="
         + this.getContactPerson()
         + ", status="
         + this.getStatus()
         + ", remarks="
         + this.getRemarks()
         + ", addedTimestamp="
         + this.getAddedTimestamp()
         + ", updatedTimestamp="
         + this.getUpdatedTimestamp()
         + ")";
   }

   public Integer getReceiverId() {
      return this.receiverId;
   }

   public String getReceiverName() {
      return this.receiverName;
   }

   public String getReceiverStartTime() {
      return this.receiverStartTime;
   }

   public String getReceiverEndTime() {
      return this.receiverEndTime;
   }

   public String getAppointment() {
      return this.appointment;
   }

   public String getPhysicalAddress() {
      return this.physicalAddress;
   }

   public long getClientId() {
      return this.clientId;
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

   public long getZipcode() {
      return this.zipcode;
   }

   public long getContactNo() {
      return this.contactNo;
   }

   public String getContactPerson() {
      return this.contactPerson;
   }

   public String getStatus() {
      return this.status;
   }

   public String getRemarks() {
      return this.remarks;
   }

   public long getAddedTimestamp() {
      return this.addedTimestamp;
   }

   public long getUpdatedTimestamp() {
      return this.updatedTimestamp;
   }

   public void setReceiverId(final Integer receiverId) {
      this.receiverId = receiverId;
   }

   public void setReceiverName(final String receiverName) {
      this.receiverName = receiverName;
   }

   public void setReceiverStartTime(final String receiverStartTime) {
      this.receiverStartTime = receiverStartTime;
   }

   public void setReceiverEndTime(final String receiverEndTime) {
      this.receiverEndTime = receiverEndTime;
   }

   public void setAppointment(final String appointment) {
      this.appointment = appointment;
   }

   public void setPhysicalAddress(final String physicalAddress) {
      this.physicalAddress = physicalAddress;
   }

   public void setClientId(final long clientId) {
      this.clientId = clientId;
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

   public void setZipcode(final long zipcode) {
      this.zipcode = zipcode;
   }

   public void setContactNo(final long contactNo) {
      this.contactNo = contactNo;
   }

   public void setContactPerson(final String contactPerson) {
      this.contactPerson = contactPerson;
   }

   public void setStatus(final String status) {
      this.status = status;
   }

   public void setRemarks(final String remarks) {
      this.remarks = remarks;
   }

   public void setAddedTimestamp(final long addedTimestamp) {
      this.addedTimestamp = addedTimestamp;
   }

   public void setUpdatedTimestamp(final long updatedTimestamp) {
      this.updatedTimestamp = updatedTimestamp;
   }
}
