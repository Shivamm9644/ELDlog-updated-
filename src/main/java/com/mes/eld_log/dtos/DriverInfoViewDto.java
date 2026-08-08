package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DriverInfoViewDto {
   @JsonProperty("employeeId")
   private Integer employeeId;
   @JsonProperty("title")
   private String title;
   @JsonProperty("firstName")
   private String firstName;
   @JsonProperty("lastName")
   private String lastName;
   @JsonProperty("email")
   private String email;
   @JsonProperty("status")
   private String status;
   @JsonProperty("mobileNo")
   private long mobileNo;
   @JsonProperty("cdlNo")
   private String cdlNo;
   @JsonProperty("companyId")
   private long companyId;
   @JsonProperty("companyName")
   private String companyName;
   @JsonProperty("clientId")
   private long clientId;
   @JsonProperty("mainTerminalId")
   private long mainTerminalId;
   @JsonProperty("mainOfficeAddress")
   private String mainOfficeAddress;
   @JsonProperty("homeTerminalAddress")
   private String homeTerminalAddress;
   @JsonProperty("timeZone")
   private String timeZone;
   @JsonProperty("languageId")
   private long languageId;
   @JsonProperty("languageName")
   private String languageName;
   @JsonProperty("odometer")
   private long odometer;
   @JsonProperty("cdlStateId")
   private long cdlStateId;
   @JsonProperty("cdlStateName")
   private String cdlStateName;

   public Integer getEmployeeId() {
      return this.employeeId;
   }

   public String getTitle() {
      return this.title;
   }

   public String getFirstName() {
      return this.firstName;
   }

   public String getLastName() {
      return this.lastName;
   }

   public String getEmail() {
      return this.email;
   }

   public String getStatus() {
      return this.status;
   }

   public long getMobileNo() {
      return this.mobileNo;
   }

   public String getCdlNo() {
      return this.cdlNo;
   }

   public long getCompanyId() {
      return this.companyId;
   }

   public String getCompanyName() {
      return this.companyName;
   }

   public long getClientId() {
      return this.clientId;
   }

   public long getMainTerminalId() {
      return this.mainTerminalId;
   }

   public String getMainOfficeAddress() {
      return this.mainOfficeAddress;
   }

   public String getHomeTerminalAddress() {
      return this.homeTerminalAddress;
   }

   public String getTimeZone() {
      return this.timeZone;
   }

   public long getLanguageId() {
      return this.languageId;
   }

   public String getLanguageName() {
      return this.languageName;
   }

   public long getOdometer() {
      return this.odometer;
   }

   public long getCdlStateId() {
      return this.cdlStateId;
   }

   public String getCdlStateName() {
      return this.cdlStateName;
   }

   @JsonProperty("employeeId")
   public void setEmployeeId(final Integer employeeId) {
      this.employeeId = employeeId;
   }

   @JsonProperty("title")
   public void setTitle(final String title) {
      this.title = title;
   }

   @JsonProperty("firstName")
   public void setFirstName(final String firstName) {
      this.firstName = firstName;
   }

   @JsonProperty("lastName")
   public void setLastName(final String lastName) {
      this.lastName = lastName;
   }

   @JsonProperty("email")
   public void setEmail(final String email) {
      this.email = email;
   }

   @JsonProperty("status")
   public void setStatus(final String status) {
      this.status = status;
   }

   @JsonProperty("mobileNo")
   public void setMobileNo(final long mobileNo) {
      this.mobileNo = mobileNo;
   }

   @JsonProperty("cdlNo")
   public void setCdlNo(final String cdlNo) {
      this.cdlNo = cdlNo;
   }

   @JsonProperty("companyId")
   public void setCompanyId(final long companyId) {
      this.companyId = companyId;
   }

   @JsonProperty("companyName")
   public void setCompanyName(final String companyName) {
      this.companyName = companyName;
   }

   @JsonProperty("clientId")
   public void setClientId(final long clientId) {
      this.clientId = clientId;
   }

   @JsonProperty("mainTerminalId")
   public void setMainTerminalId(final long mainTerminalId) {
      this.mainTerminalId = mainTerminalId;
   }

   @JsonProperty("mainOfficeAddress")
   public void setMainOfficeAddress(final String mainOfficeAddress) {
      this.mainOfficeAddress = mainOfficeAddress;
   }

   @JsonProperty("homeTerminalAddress")
   public void setHomeTerminalAddress(final String homeTerminalAddress) {
      this.homeTerminalAddress = homeTerminalAddress;
   }

   @JsonProperty("timeZone")
   public void setTimeZone(final String timeZone) {
      this.timeZone = timeZone;
   }

   @JsonProperty("languageId")
   public void setLanguageId(final long languageId) {
      this.languageId = languageId;
   }

   @JsonProperty("languageName")
   public void setLanguageName(final String languageName) {
      this.languageName = languageName;
   }

   @JsonProperty("odometer")
   public void setOdometer(final long odometer) {
      this.odometer = odometer;
   }

   @JsonProperty("cdlStateId")
   public void setCdlStateId(final long cdlStateId) {
      this.cdlStateId = cdlStateId;
   }

   @JsonProperty("cdlStateName")
   public void setCdlStateName(final String cdlStateName) {
      this.cdlStateName = cdlStateName;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof DriverInfoViewDto)) {
         return false;
      } else {
         DriverInfoViewDto other = (DriverInfoViewDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getMobileNo() != other.getMobileNo()) {
            return false;
         } else if (this.getCompanyId() != other.getCompanyId()) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else if (this.getMainTerminalId() != other.getMainTerminalId()) {
            return false;
         } else if (this.getLanguageId() != other.getLanguageId()) {
            return false;
         } else if (this.getOdometer() != other.getOdometer()) {
            return false;
         } else if (this.getCdlStateId() != other.getCdlStateId()) {
            return false;
         } else {
            Object this$employeeId = this.getEmployeeId();
            Object other$employeeId = other.getEmployeeId();
            if (this$employeeId == null ? other$employeeId == null : this$employeeId.equals(other$employeeId)) {
               Object this$title = this.getTitle();
               Object other$title = other.getTitle();
               if (this$title == null ? other$title == null : this$title.equals(other$title)) {
                  Object this$firstName = this.getFirstName();
                  Object other$firstName = other.getFirstName();
                  if (this$firstName == null ? other$firstName == null : this$firstName.equals(other$firstName)) {
                     Object this$lastName = this.getLastName();
                     Object other$lastName = other.getLastName();
                     if (this$lastName == null ? other$lastName == null : this$lastName.equals(other$lastName)) {
                        Object this$email = this.getEmail();
                        Object other$email = other.getEmail();
                        if (this$email == null ? other$email == null : this$email.equals(other$email)) {
                           Object this$status = this.getStatus();
                           Object other$status = other.getStatus();
                           if (this$status == null ? other$status == null : this$status.equals(other$status)) {
                              Object this$cdlNo = this.getCdlNo();
                              Object other$cdlNo = other.getCdlNo();
                              if (this$cdlNo == null ? other$cdlNo == null : this$cdlNo.equals(other$cdlNo)) {
                                 Object this$companyName = this.getCompanyName();
                                 Object other$companyName = other.getCompanyName();
                                 if (this$companyName == null ? other$companyName == null : this$companyName.equals(other$companyName)) {
                                    Object this$mainOfficeAddress = this.getMainOfficeAddress();
                                    Object other$mainOfficeAddress = other.getMainOfficeAddress();
                                    if (this$mainOfficeAddress == null
                                       ? other$mainOfficeAddress == null
                                       : this$mainOfficeAddress.equals(other$mainOfficeAddress)) {
                                       Object this$homeTerminalAddress = this.getHomeTerminalAddress();
                                       Object other$homeTerminalAddress = other.getHomeTerminalAddress();
                                       if (this$homeTerminalAddress == null
                                          ? other$homeTerminalAddress == null
                                          : this$homeTerminalAddress.equals(other$homeTerminalAddress)) {
                                          Object this$timeZone = this.getTimeZone();
                                          Object other$timeZone = other.getTimeZone();
                                          if (this$timeZone == null ? other$timeZone == null : this$timeZone.equals(other$timeZone)) {
                                             Object this$languageName = this.getLanguageName();
                                             Object other$languageName = other.getLanguageName();
                                             if (this$languageName == null ? other$languageName == null : this$languageName.equals(other$languageName)) {
                                                Object this$cdlStateName = this.getCdlStateName();
                                                Object other$cdlStateName = other.getCdlStateName();
                                                return this$cdlStateName == null ? other$cdlStateName == null : this$cdlStateName.equals(other$cdlStateName);
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
      return other instanceof DriverInfoViewDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $mobileNo = this.getMobileNo();
      result = result * 59 + (int)($mobileNo >>> 32 ^ $mobileNo);
      long $companyId = this.getCompanyId();
      result = result * 59 + (int)($companyId >>> 32 ^ $companyId);
      long $clientId = this.getClientId();
      result = result * 59 + (int)($clientId >>> 32 ^ $clientId);
      long $mainTerminalId = this.getMainTerminalId();
      result = result * 59 + (int)($mainTerminalId >>> 32 ^ $mainTerminalId);
      long $languageId = this.getLanguageId();
      result = result * 59 + (int)($languageId >>> 32 ^ $languageId);
      long $odometer = this.getOdometer();
      result = result * 59 + (int)($odometer >>> 32 ^ $odometer);
      long $cdlStateId = this.getCdlStateId();
      result = result * 59 + (int)($cdlStateId >>> 32 ^ $cdlStateId);
      Object $employeeId = this.getEmployeeId();
      result = result * 59 + ($employeeId == null ? 43 : $employeeId.hashCode());
      Object $title = this.getTitle();
      result = result * 59 + ($title == null ? 43 : $title.hashCode());
      Object $firstName = this.getFirstName();
      result = result * 59 + ($firstName == null ? 43 : $firstName.hashCode());
      Object $lastName = this.getLastName();
      result = result * 59 + ($lastName == null ? 43 : $lastName.hashCode());
      Object $email = this.getEmail();
      result = result * 59 + ($email == null ? 43 : $email.hashCode());
      Object $status = this.getStatus();
      result = result * 59 + ($status == null ? 43 : $status.hashCode());
      Object $cdlNo = this.getCdlNo();
      result = result * 59 + ($cdlNo == null ? 43 : $cdlNo.hashCode());
      Object $companyName = this.getCompanyName();
      result = result * 59 + ($companyName == null ? 43 : $companyName.hashCode());
      Object $mainOfficeAddress = this.getMainOfficeAddress();
      result = result * 59 + ($mainOfficeAddress == null ? 43 : $mainOfficeAddress.hashCode());
      Object $homeTerminalAddress = this.getHomeTerminalAddress();
      result = result * 59 + ($homeTerminalAddress == null ? 43 : $homeTerminalAddress.hashCode());
      Object $timeZone = this.getTimeZone();
      result = result * 59 + ($timeZone == null ? 43 : $timeZone.hashCode());
      Object $languageName = this.getLanguageName();
      result = result * 59 + ($languageName == null ? 43 : $languageName.hashCode());
      Object $cdlStateName = this.getCdlStateName();
      return result * 59 + ($cdlStateName == null ? 43 : $cdlStateName.hashCode());
   }

   @Override
   public String toString() {
      return "DriverInfoViewDto(employeeId="
         + this.getEmployeeId()
         + ", title="
         + this.getTitle()
         + ", firstName="
         + this.getFirstName()
         + ", lastName="
         + this.getLastName()
         + ", email="
         + this.getEmail()
         + ", status="
         + this.getStatus()
         + ", mobileNo="
         + this.getMobileNo()
         + ", cdlNo="
         + this.getCdlNo()
         + ", companyId="
         + this.getCompanyId()
         + ", companyName="
         + this.getCompanyName()
         + ", clientId="
         + this.getClientId()
         + ", mainTerminalId="
         + this.getMainTerminalId()
         + ", mainOfficeAddress="
         + this.getMainOfficeAddress()
         + ", homeTerminalAddress="
         + this.getHomeTerminalAddress()
         + ", timeZone="
         + this.getTimeZone()
         + ", languageId="
         + this.getLanguageId()
         + ", languageName="
         + this.getLanguageName()
         + ", odometer="
         + this.getOdometer()
         + ", cdlStateId="
         + this.getCdlStateId()
         + ", cdlStateName="
         + this.getCdlStateName()
         + ")";
   }
}
