package com.mes.eld_log.models;

import java.io.Serializable;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.core.mapping.Document;

@EntityScan
@Document(
   collection = "company_master"
)
public class CompanyMaster implements Serializable {
   private static final long serialVersionUID = 1L;
   private Integer companyId;
   private String companyName;
   private String officeAddress;
   private String homeTerminalAddress;
   private String timeZone;
   private long clientId;
   private long addedTimestamp;
   private long updatedTimestamp;

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof CompanyMaster)) {
         return false;
      } else {
         CompanyMaster other = (CompanyMaster)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else if (this.getAddedTimestamp() != other.getAddedTimestamp()) {
            return false;
         } else if (this.getUpdatedTimestamp() != other.getUpdatedTimestamp()) {
            return false;
         } else {
            Object this$companyId = this.getCompanyId();
            Object other$companyId = other.getCompanyId();
            if (this$companyId == null ? other$companyId == null : this$companyId.equals(other$companyId)) {
               Object this$companyName = this.getCompanyName();
               Object other$companyName = other.getCompanyName();
               if (this$companyName == null ? other$companyName == null : this$companyName.equals(other$companyName)) {
                  Object this$officeAddress = this.getOfficeAddress();
                  Object other$officeAddress = other.getOfficeAddress();
                  if (this$officeAddress == null ? other$officeAddress == null : this$officeAddress.equals(other$officeAddress)) {
                     Object this$homeTerminalAddress = this.getHomeTerminalAddress();
                     Object other$homeTerminalAddress = other.getHomeTerminalAddress();
                     if (this$homeTerminalAddress == null ? other$homeTerminalAddress == null : this$homeTerminalAddress.equals(other$homeTerminalAddress)) {
                        Object this$timeZone = this.getTimeZone();
                        Object other$timeZone = other.getTimeZone();
                        return this$timeZone == null ? other$timeZone == null : this$timeZone.equals(other$timeZone);
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
      return other instanceof CompanyMaster;
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
      Object $companyId = this.getCompanyId();
      result = result * 59 + ($companyId == null ? 43 : $companyId.hashCode());
      Object $companyName = this.getCompanyName();
      result = result * 59 + ($companyName == null ? 43 : $companyName.hashCode());
      Object $officeAddress = this.getOfficeAddress();
      result = result * 59 + ($officeAddress == null ? 43 : $officeAddress.hashCode());
      Object $homeTerminalAddress = this.getHomeTerminalAddress();
      result = result * 59 + ($homeTerminalAddress == null ? 43 : $homeTerminalAddress.hashCode());
      Object $timeZone = this.getTimeZone();
      return result * 59 + ($timeZone == null ? 43 : $timeZone.hashCode());
   }

   @Override
   public String toString() {
      return "CompanyMaster(companyId="
         + this.getCompanyId()
         + ", companyName="
         + this.getCompanyName()
         + ", officeAddress="
         + this.getOfficeAddress()
         + ", homeTerminalAddress="
         + this.getHomeTerminalAddress()
         + ", timeZone="
         + this.getTimeZone()
         + ", clientId="
         + this.getClientId()
         + ", addedTimestamp="
         + this.getAddedTimestamp()
         + ", updatedTimestamp="
         + this.getUpdatedTimestamp()
         + ")";
   }

   public Integer getCompanyId() {
      return this.companyId;
   }

   public String getCompanyName() {
      return this.companyName;
   }

   public String getOfficeAddress() {
      return this.officeAddress;
   }

   public String getHomeTerminalAddress() {
      return this.homeTerminalAddress;
   }

   public String getTimeZone() {
      return this.timeZone;
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

   public void setCompanyId(final Integer companyId) {
      this.companyId = companyId;
   }

   public void setCompanyName(final String companyName) {
      this.companyName = companyName;
   }

   public void setOfficeAddress(final String officeAddress) {
      this.officeAddress = officeAddress;
   }

   public void setHomeTerminalAddress(final String homeTerminalAddress) {
      this.homeTerminalAddress = homeTerminalAddress;
   }

   public void setTimeZone(final String timeZone) {
      this.timeZone = timeZone;
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
