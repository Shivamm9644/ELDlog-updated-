package com.mes.eld_log.models;

import java.io.Serializable;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.core.mapping.Document;

@EntityScan
@Document(
   collection = "carrier_master"
)
public class CarrierMaster implements Serializable {
   private static final long serialVersionUID = 1L;
   private Integer carrierId;
   private String carrierName;
   private long routeId;
   private long clientId;
   private String dot;
   private String taxId;
   private String billingAddress;
   private long billingCountryId;
   private long billingStateId;
   private long billingCityId;
   private long billingZipcode;
   private String contactEmail;
   private long contactPhone;
   private String physicalAddress;
   private long physicalCountryId;
   private long physicalStateId;
   private long physicalCityId;
   private long physicalZipcode;
   private String mainEmail;
   private long mainPhone;
   private String mcNumber;
   private long afterHoursPhone;
   private String accountingEmail;
   private long accountingPhone;
   private String status;
   private String remarks;
   private long addedTimestamp;
   private long updatedTimestamp;

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof CarrierMaster)) {
         return false;
      } else {
         CarrierMaster other = (CarrierMaster)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getRouteId() != other.getRouteId()) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else if (this.getBillingCountryId() != other.getBillingCountryId()) {
            return false;
         } else if (this.getBillingStateId() != other.getBillingStateId()) {
            return false;
         } else if (this.getBillingCityId() != other.getBillingCityId()) {
            return false;
         } else if (this.getBillingZipcode() != other.getBillingZipcode()) {
            return false;
         } else if (this.getContactPhone() != other.getContactPhone()) {
            return false;
         } else if (this.getPhysicalCountryId() != other.getPhysicalCountryId()) {
            return false;
         } else if (this.getPhysicalStateId() != other.getPhysicalStateId()) {
            return false;
         } else if (this.getPhysicalCityId() != other.getPhysicalCityId()) {
            return false;
         } else if (this.getPhysicalZipcode() != other.getPhysicalZipcode()) {
            return false;
         } else if (this.getMainPhone() != other.getMainPhone()) {
            return false;
         } else if (this.getAfterHoursPhone() != other.getAfterHoursPhone()) {
            return false;
         } else if (this.getAccountingPhone() != other.getAccountingPhone()) {
            return false;
         } else if (this.getAddedTimestamp() != other.getAddedTimestamp()) {
            return false;
         } else if (this.getUpdatedTimestamp() != other.getUpdatedTimestamp()) {
            return false;
         } else {
            Object this$carrierId = this.getCarrierId();
            Object other$carrierId = other.getCarrierId();
            if (this$carrierId == null ? other$carrierId == null : this$carrierId.equals(other$carrierId)) {
               Object this$carrierName = this.getCarrierName();
               Object other$carrierName = other.getCarrierName();
               if (this$carrierName == null ? other$carrierName == null : this$carrierName.equals(other$carrierName)) {
                  Object this$dot = this.getDot();
                  Object other$dot = other.getDot();
                  if (this$dot == null ? other$dot == null : this$dot.equals(other$dot)) {
                     Object this$taxId = this.getTaxId();
                     Object other$taxId = other.getTaxId();
                     if (this$taxId == null ? other$taxId == null : this$taxId.equals(other$taxId)) {
                        Object this$billingAddress = this.getBillingAddress();
                        Object other$billingAddress = other.getBillingAddress();
                        if (this$billingAddress == null ? other$billingAddress == null : this$billingAddress.equals(other$billingAddress)) {
                           Object this$contactEmail = this.getContactEmail();
                           Object other$contactEmail = other.getContactEmail();
                           if (this$contactEmail == null ? other$contactEmail == null : this$contactEmail.equals(other$contactEmail)) {
                              Object this$physicalAddress = this.getPhysicalAddress();
                              Object other$physicalAddress = other.getPhysicalAddress();
                              if (this$physicalAddress == null ? other$physicalAddress == null : this$physicalAddress.equals(other$physicalAddress)) {
                                 Object this$mainEmail = this.getMainEmail();
                                 Object other$mainEmail = other.getMainEmail();
                                 if (this$mainEmail == null ? other$mainEmail == null : this$mainEmail.equals(other$mainEmail)) {
                                    Object this$mcNumber = this.getMcNumber();
                                    Object other$mcNumber = other.getMcNumber();
                                    if (this$mcNumber == null ? other$mcNumber == null : this$mcNumber.equals(other$mcNumber)) {
                                       Object this$accountingEmail = this.getAccountingEmail();
                                       Object other$accountingEmail = other.getAccountingEmail();
                                       if (this$accountingEmail == null ? other$accountingEmail == null : this$accountingEmail.equals(other$accountingEmail)) {
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
      return other instanceof CarrierMaster;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $routeId = this.getRouteId();
      result = result * 59 + (int)($routeId >>> 32 ^ $routeId);
      long $clientId = this.getClientId();
      result = result * 59 + (int)($clientId >>> 32 ^ $clientId);
      long $billingCountryId = this.getBillingCountryId();
      result = result * 59 + (int)($billingCountryId >>> 32 ^ $billingCountryId);
      long $billingStateId = this.getBillingStateId();
      result = result * 59 + (int)($billingStateId >>> 32 ^ $billingStateId);
      long $billingCityId = this.getBillingCityId();
      result = result * 59 + (int)($billingCityId >>> 32 ^ $billingCityId);
      long $billingZipcode = this.getBillingZipcode();
      result = result * 59 + (int)($billingZipcode >>> 32 ^ $billingZipcode);
      long $contactPhone = this.getContactPhone();
      result = result * 59 + (int)($contactPhone >>> 32 ^ $contactPhone);
      long $physicalCountryId = this.getPhysicalCountryId();
      result = result * 59 + (int)($physicalCountryId >>> 32 ^ $physicalCountryId);
      long $physicalStateId = this.getPhysicalStateId();
      result = result * 59 + (int)($physicalStateId >>> 32 ^ $physicalStateId);
      long $physicalCityId = this.getPhysicalCityId();
      result = result * 59 + (int)($physicalCityId >>> 32 ^ $physicalCityId);
      long $physicalZipcode = this.getPhysicalZipcode();
      result = result * 59 + (int)($physicalZipcode >>> 32 ^ $physicalZipcode);
      long $mainPhone = this.getMainPhone();
      result = result * 59 + (int)($mainPhone >>> 32 ^ $mainPhone);
      long $afterHoursPhone = this.getAfterHoursPhone();
      result = result * 59 + (int)($afterHoursPhone >>> 32 ^ $afterHoursPhone);
      long $accountingPhone = this.getAccountingPhone();
      result = result * 59 + (int)($accountingPhone >>> 32 ^ $accountingPhone);
      long $addedTimestamp = this.getAddedTimestamp();
      result = result * 59 + (int)($addedTimestamp >>> 32 ^ $addedTimestamp);
      long $updatedTimestamp = this.getUpdatedTimestamp();
      result = result * 59 + (int)($updatedTimestamp >>> 32 ^ $updatedTimestamp);
      Object $carrierId = this.getCarrierId();
      result = result * 59 + ($carrierId == null ? 43 : $carrierId.hashCode());
      Object $carrierName = this.getCarrierName();
      result = result * 59 + ($carrierName == null ? 43 : $carrierName.hashCode());
      Object $dot = this.getDot();
      result = result * 59 + ($dot == null ? 43 : $dot.hashCode());
      Object $taxId = this.getTaxId();
      result = result * 59 + ($taxId == null ? 43 : $taxId.hashCode());
      Object $billingAddress = this.getBillingAddress();
      result = result * 59 + ($billingAddress == null ? 43 : $billingAddress.hashCode());
      Object $contactEmail = this.getContactEmail();
      result = result * 59 + ($contactEmail == null ? 43 : $contactEmail.hashCode());
      Object $physicalAddress = this.getPhysicalAddress();
      result = result * 59 + ($physicalAddress == null ? 43 : $physicalAddress.hashCode());
      Object $mainEmail = this.getMainEmail();
      result = result * 59 + ($mainEmail == null ? 43 : $mainEmail.hashCode());
      Object $mcNumber = this.getMcNumber();
      result = result * 59 + ($mcNumber == null ? 43 : $mcNumber.hashCode());
      Object $accountingEmail = this.getAccountingEmail();
      result = result * 59 + ($accountingEmail == null ? 43 : $accountingEmail.hashCode());
      Object $status = this.getStatus();
      result = result * 59 + ($status == null ? 43 : $status.hashCode());
      Object $remarks = this.getRemarks();
      return result * 59 + ($remarks == null ? 43 : $remarks.hashCode());
   }

   @Override
   public String toString() {
      return "CarrierMaster(carrierId="
         + this.getCarrierId()
         + ", carrierName="
         + this.getCarrierName()
         + ", routeId="
         + this.getRouteId()
         + ", clientId="
         + this.getClientId()
         + ", dot="
         + this.getDot()
         + ", taxId="
         + this.getTaxId()
         + ", billingAddress="
         + this.getBillingAddress()
         + ", billingCountryId="
         + this.getBillingCountryId()
         + ", billingStateId="
         + this.getBillingStateId()
         + ", billingCityId="
         + this.getBillingCityId()
         + ", billingZipcode="
         + this.getBillingZipcode()
         + ", contactEmail="
         + this.getContactEmail()
         + ", contactPhone="
         + this.getContactPhone()
         + ", physicalAddress="
         + this.getPhysicalAddress()
         + ", physicalCountryId="
         + this.getPhysicalCountryId()
         + ", physicalStateId="
         + this.getPhysicalStateId()
         + ", physicalCityId="
         + this.getPhysicalCityId()
         + ", physicalZipcode="
         + this.getPhysicalZipcode()
         + ", mainEmail="
         + this.getMainEmail()
         + ", mainPhone="
         + this.getMainPhone()
         + ", mcNumber="
         + this.getMcNumber()
         + ", afterHoursPhone="
         + this.getAfterHoursPhone()
         + ", accountingEmail="
         + this.getAccountingEmail()
         + ", accountingPhone="
         + this.getAccountingPhone()
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

   public Integer getCarrierId() {
      return this.carrierId;
   }

   public String getCarrierName() {
      return this.carrierName;
   }

   public long getRouteId() {
      return this.routeId;
   }

   public long getClientId() {
      return this.clientId;
   }

   public String getDot() {
      return this.dot;
   }

   public String getTaxId() {
      return this.taxId;
   }

   public String getBillingAddress() {
      return this.billingAddress;
   }

   public long getBillingCountryId() {
      return this.billingCountryId;
   }

   public long getBillingStateId() {
      return this.billingStateId;
   }

   public long getBillingCityId() {
      return this.billingCityId;
   }

   public long getBillingZipcode() {
      return this.billingZipcode;
   }

   public String getContactEmail() {
      return this.contactEmail;
   }

   public long getContactPhone() {
      return this.contactPhone;
   }

   public String getPhysicalAddress() {
      return this.physicalAddress;
   }

   public long getPhysicalCountryId() {
      return this.physicalCountryId;
   }

   public long getPhysicalStateId() {
      return this.physicalStateId;
   }

   public long getPhysicalCityId() {
      return this.physicalCityId;
   }

   public long getPhysicalZipcode() {
      return this.physicalZipcode;
   }

   public String getMainEmail() {
      return this.mainEmail;
   }

   public long getMainPhone() {
      return this.mainPhone;
   }

   public String getMcNumber() {
      return this.mcNumber;
   }

   public long getAfterHoursPhone() {
      return this.afterHoursPhone;
   }

   public String getAccountingEmail() {
      return this.accountingEmail;
   }

   public long getAccountingPhone() {
      return this.accountingPhone;
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

   public void setCarrierId(final Integer carrierId) {
      this.carrierId = carrierId;
   }

   public void setCarrierName(final String carrierName) {
      this.carrierName = carrierName;
   }

   public void setRouteId(final long routeId) {
      this.routeId = routeId;
   }

   public void setClientId(final long clientId) {
      this.clientId = clientId;
   }

   public void setDot(final String dot) {
      this.dot = dot;
   }

   public void setTaxId(final String taxId) {
      this.taxId = taxId;
   }

   public void setBillingAddress(final String billingAddress) {
      this.billingAddress = billingAddress;
   }

   public void setBillingCountryId(final long billingCountryId) {
      this.billingCountryId = billingCountryId;
   }

   public void setBillingStateId(final long billingStateId) {
      this.billingStateId = billingStateId;
   }

   public void setBillingCityId(final long billingCityId) {
      this.billingCityId = billingCityId;
   }

   public void setBillingZipcode(final long billingZipcode) {
      this.billingZipcode = billingZipcode;
   }

   public void setContactEmail(final String contactEmail) {
      this.contactEmail = contactEmail;
   }

   public void setContactPhone(final long contactPhone) {
      this.contactPhone = contactPhone;
   }

   public void setPhysicalAddress(final String physicalAddress) {
      this.physicalAddress = physicalAddress;
   }

   public void setPhysicalCountryId(final long physicalCountryId) {
      this.physicalCountryId = physicalCountryId;
   }

   public void setPhysicalStateId(final long physicalStateId) {
      this.physicalStateId = physicalStateId;
   }

   public void setPhysicalCityId(final long physicalCityId) {
      this.physicalCityId = physicalCityId;
   }

   public void setPhysicalZipcode(final long physicalZipcode) {
      this.physicalZipcode = physicalZipcode;
   }

   public void setMainEmail(final String mainEmail) {
      this.mainEmail = mainEmail;
   }

   public void setMainPhone(final long mainPhone) {
      this.mainPhone = mainPhone;
   }

   public void setMcNumber(final String mcNumber) {
      this.mcNumber = mcNumber;
   }

   public void setAfterHoursPhone(final long afterHoursPhone) {
      this.afterHoursPhone = afterHoursPhone;
   }

   public void setAccountingEmail(final String accountingEmail) {
      this.accountingEmail = accountingEmail;
   }

   public void setAccountingPhone(final long accountingPhone) {
      this.accountingPhone = accountingPhone;
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
