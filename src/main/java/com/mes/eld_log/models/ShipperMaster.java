package com.mes.eld_log.models;

import java.io.Serializable;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.core.mapping.Document;

@EntityScan
@Document(
   collection = "shipper_master"
)
public class ShipperMaster implements Serializable {
   private static final long serialVersionUID = 1L;
   private Integer shipperId;
   private String shipperName;
   private String shipperStartTime;
   private String shipperEndTime;
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
      } else if (!(o instanceof ShipperMaster)) {
         return false;
      } else {
         ShipperMaster other = (ShipperMaster)o;
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
            Object this$shipperId = this.getShipperId();
            Object other$shipperId = other.getShipperId();
            if (this$shipperId == null ? other$shipperId == null : this$shipperId.equals(other$shipperId)) {
               Object this$shipperName = this.getShipperName();
               Object other$shipperName = other.getShipperName();
               if (this$shipperName == null ? other$shipperName == null : this$shipperName.equals(other$shipperName)) {
                  Object this$shipperStartTime = this.getShipperStartTime();
                  Object other$shipperStartTime = other.getShipperStartTime();
                  if (this$shipperStartTime == null ? other$shipperStartTime == null : this$shipperStartTime.equals(other$shipperStartTime)) {
                     Object this$shipperEndTime = this.getShipperEndTime();
                     Object other$shipperEndTime = other.getShipperEndTime();
                     if (this$shipperEndTime == null ? other$shipperEndTime == null : this$shipperEndTime.equals(other$shipperEndTime)) {
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
      return other instanceof ShipperMaster;
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
      Object $shipperId = this.getShipperId();
      result = result * 59 + ($shipperId == null ? 43 : $shipperId.hashCode());
      Object $shipperName = this.getShipperName();
      result = result * 59 + ($shipperName == null ? 43 : $shipperName.hashCode());
      Object $shipperStartTime = this.getShipperStartTime();
      result = result * 59 + ($shipperStartTime == null ? 43 : $shipperStartTime.hashCode());
      Object $shipperEndTime = this.getShipperEndTime();
      result = result * 59 + ($shipperEndTime == null ? 43 : $shipperEndTime.hashCode());
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
      return "ShipperMaster(shipperId="
         + this.getShipperId()
         + ", shipperName="
         + this.getShipperName()
         + ", shipperStartTime="
         + this.getShipperStartTime()
         + ", shipperEndTime="
         + this.getShipperEndTime()
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

   public Integer getShipperId() {
      return this.shipperId;
   }

   public String getShipperName() {
      return this.shipperName;
   }

   public String getShipperStartTime() {
      return this.shipperStartTime;
   }

   public String getShipperEndTime() {
      return this.shipperEndTime;
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

   public void setShipperId(final Integer shipperId) {
      this.shipperId = shipperId;
   }

   public void setShipperName(final String shipperName) {
      this.shipperName = shipperName;
   }

   public void setShipperStartTime(final String shipperStartTime) {
      this.shipperStartTime = shipperStartTime;
   }

   public void setShipperEndTime(final String shipperEndTime) {
      this.shipperEndTime = shipperEndTime;
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
