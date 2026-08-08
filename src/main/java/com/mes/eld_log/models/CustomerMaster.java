package com.mes.eld_log.models;

import java.io.Serializable;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.core.mapping.Document;

@EntityScan
@Document(
   collection = "customer_master"
)
public class CustomerMaster implements Serializable {
   private static final long serialVersionUID = 1L;
   private Integer customerId;
   private String customerName;
   private long productId;
   private long clientId;
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
   private String dispatchEmail;
   private long dispatchPhone;
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
      } else if (!(o instanceof CustomerMaster)) {
         return false;
      } else {
         CustomerMaster other = (CustomerMaster)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getProductId() != other.getProductId()) {
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
         } else if (this.getDispatchPhone() != other.getDispatchPhone()) {
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
            Object this$customerId = this.getCustomerId();
            Object other$customerId = other.getCustomerId();
            if (this$customerId == null ? other$customerId == null : this$customerId.equals(other$customerId)) {
               Object this$customerName = this.getCustomerName();
               Object other$customerName = other.getCustomerName();
               if (this$customerName == null ? other$customerName == null : this$customerName.equals(other$customerName)) {
                  Object this$billingAddress = this.getBillingAddress();
                  Object other$billingAddress = other.getBillingAddress();
                  if (this$billingAddress == null ? other$billingAddress == null : this$billingAddress.equals(other$billingAddress)) {
                     Object this$contactEmail = this.getContactEmail();
                     Object other$contactEmail = other.getContactEmail();
                     if (this$contactEmail == null ? other$contactEmail == null : this$contactEmail.equals(other$contactEmail)) {
                        Object this$physicalAddress = this.getPhysicalAddress();
                        Object other$physicalAddress = other.getPhysicalAddress();
                        if (this$physicalAddress == null ? other$physicalAddress == null : this$physicalAddress.equals(other$physicalAddress)) {
                           Object this$dispatchEmail = this.getDispatchEmail();
                           Object other$dispatchEmail = other.getDispatchEmail();
                           if (this$dispatchEmail == null ? other$dispatchEmail == null : this$dispatchEmail.equals(other$dispatchEmail)) {
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
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof CustomerMaster;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $productId = this.getProductId();
      result = result * 59 + (int)($productId >>> 32 ^ $productId);
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
      long $dispatchPhone = this.getDispatchPhone();
      result = result * 59 + (int)($dispatchPhone >>> 32 ^ $dispatchPhone);
      long $afterHoursPhone = this.getAfterHoursPhone();
      result = result * 59 + (int)($afterHoursPhone >>> 32 ^ $afterHoursPhone);
      long $accountingPhone = this.getAccountingPhone();
      result = result * 59 + (int)($accountingPhone >>> 32 ^ $accountingPhone);
      long $addedTimestamp = this.getAddedTimestamp();
      result = result * 59 + (int)($addedTimestamp >>> 32 ^ $addedTimestamp);
      long $updatedTimestamp = this.getUpdatedTimestamp();
      result = result * 59 + (int)($updatedTimestamp >>> 32 ^ $updatedTimestamp);
      Object $customerId = this.getCustomerId();
      result = result * 59 + ($customerId == null ? 43 : $customerId.hashCode());
      Object $customerName = this.getCustomerName();
      result = result * 59 + ($customerName == null ? 43 : $customerName.hashCode());
      Object $billingAddress = this.getBillingAddress();
      result = result * 59 + ($billingAddress == null ? 43 : $billingAddress.hashCode());
      Object $contactEmail = this.getContactEmail();
      result = result * 59 + ($contactEmail == null ? 43 : $contactEmail.hashCode());
      Object $physicalAddress = this.getPhysicalAddress();
      result = result * 59 + ($physicalAddress == null ? 43 : $physicalAddress.hashCode());
      Object $dispatchEmail = this.getDispatchEmail();
      result = result * 59 + ($dispatchEmail == null ? 43 : $dispatchEmail.hashCode());
      Object $accountingEmail = this.getAccountingEmail();
      result = result * 59 + ($accountingEmail == null ? 43 : $accountingEmail.hashCode());
      Object $status = this.getStatus();
      result = result * 59 + ($status == null ? 43 : $status.hashCode());
      Object $remarks = this.getRemarks();
      return result * 59 + ($remarks == null ? 43 : $remarks.hashCode());
   }

   @Override
   public String toString() {
      return "CustomerMaster(customerId="
         + this.getCustomerId()
         + ", customerName="
         + this.getCustomerName()
         + ", productId="
         + this.getProductId()
         + ", clientId="
         + this.getClientId()
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
         + ", dispatchEmail="
         + this.getDispatchEmail()
         + ", dispatchPhone="
         + this.getDispatchPhone()
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

   public Integer getCustomerId() {
      return this.customerId;
   }

   public String getCustomerName() {
      return this.customerName;
   }

   public long getProductId() {
      return this.productId;
   }

   public long getClientId() {
      return this.clientId;
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

   public String getDispatchEmail() {
      return this.dispatchEmail;
   }

   public long getDispatchPhone() {
      return this.dispatchPhone;
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

   public void setCustomerId(final Integer customerId) {
      this.customerId = customerId;
   }

   public void setCustomerName(final String customerName) {
      this.customerName = customerName;
   }

   public void setProductId(final long productId) {
      this.productId = productId;
   }

   public void setClientId(final long clientId) {
      this.clientId = clientId;
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

   public void setDispatchEmail(final String dispatchEmail) {
      this.dispatchEmail = dispatchEmail;
   }

   public void setDispatchPhone(final long dispatchPhone) {
      this.dispatchPhone = dispatchPhone;
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
