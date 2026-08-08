package com.mes.eld_log.models;

import java.io.Serializable;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.core.mapping.Document;

@EntityScan
@Document(
   collection = "user_master"
)
public class UserMaster implements Serializable {
   private static final long serialVersionUID = 1L;
   private Integer userId;
   private long disclaimerRead;
   private String username;
   private String password;
   private long userTypeId;
   private long clientId;
   private String firstName;
   private String lastName;
   private long mobileNo;
   private String email;
   private long countryId;
   private long stateId;
   private long cityId;
   private long zipcode;
   private String timezone;
   private String status;
   private String webAccess;
   private String mobileAccess;
   private String eldFeature;
   private String dispatchFeature;
   private long addedTimestamp;
   private long updatedTimestamp;

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof UserMaster)) {
         return false;
      } else {
         UserMaster other = (UserMaster)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getDisclaimerRead() != other.getDisclaimerRead()) {
            return false;
         } else if (this.getUserTypeId() != other.getUserTypeId()) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else if (this.getMobileNo() != other.getMobileNo()) {
            return false;
         } else if (this.getCountryId() != other.getCountryId()) {
            return false;
         } else if (this.getStateId() != other.getStateId()) {
            return false;
         } else if (this.getCityId() != other.getCityId()) {
            return false;
         } else if (this.getZipcode() != other.getZipcode()) {
            return false;
         } else if (this.getAddedTimestamp() != other.getAddedTimestamp()) {
            return false;
         } else if (this.getUpdatedTimestamp() != other.getUpdatedTimestamp()) {
            return false;
         } else {
            Object this$userId = this.getUserId();
            Object other$userId = other.getUserId();
            if (this$userId == null ? other$userId == null : this$userId.equals(other$userId)) {
               Object this$username = this.getUsername();
               Object other$username = other.getUsername();
               if (this$username == null ? other$username == null : this$username.equals(other$username)) {
                  Object this$password = this.getPassword();
                  Object other$password = other.getPassword();
                  if (this$password == null ? other$password == null : this$password.equals(other$password)) {
                     Object this$firstName = this.getFirstName();
                     Object other$firstName = other.getFirstName();
                     if (this$firstName == null ? other$firstName == null : this$firstName.equals(other$firstName)) {
                        Object this$lastName = this.getLastName();
                        Object other$lastName = other.getLastName();
                        if (this$lastName == null ? other$lastName == null : this$lastName.equals(other$lastName)) {
                           Object this$email = this.getEmail();
                           Object other$email = other.getEmail();
                           if (this$email == null ? other$email == null : this$email.equals(other$email)) {
                              Object this$timezone = this.getTimezone();
                              Object other$timezone = other.getTimezone();
                              if (this$timezone == null ? other$timezone == null : this$timezone.equals(other$timezone)) {
                                 Object this$status = this.getStatus();
                                 Object other$status = other.getStatus();
                                 if (this$status == null ? other$status == null : this$status.equals(other$status)) {
                                    Object this$webAccess = this.getWebAccess();
                                    Object other$webAccess = other.getWebAccess();
                                    if (this$webAccess == null ? other$webAccess == null : this$webAccess.equals(other$webAccess)) {
                                       Object this$mobileAccess = this.getMobileAccess();
                                       Object other$mobileAccess = other.getMobileAccess();
                                       if (this$mobileAccess == null ? other$mobileAccess == null : this$mobileAccess.equals(other$mobileAccess)) {
                                          Object this$eldFeature = this.getEldFeature();
                                          Object other$eldFeature = other.getEldFeature();
                                          if (this$eldFeature == null ? other$eldFeature == null : this$eldFeature.equals(other$eldFeature)) {
                                             Object this$dispatchFeature = this.getDispatchFeature();
                                             Object other$dispatchFeature = other.getDispatchFeature();
                                             return this$dispatchFeature == null
                                                ? other$dispatchFeature == null
                                                : this$dispatchFeature.equals(other$dispatchFeature);
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
      return other instanceof UserMaster;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $disclaimerRead = this.getDisclaimerRead();
      result = result * 59 + (int)($disclaimerRead >>> 32 ^ $disclaimerRead);
      long $userTypeId = this.getUserTypeId();
      result = result * 59 + (int)($userTypeId >>> 32 ^ $userTypeId);
      long $clientId = this.getClientId();
      result = result * 59 + (int)($clientId >>> 32 ^ $clientId);
      long $mobileNo = this.getMobileNo();
      result = result * 59 + (int)($mobileNo >>> 32 ^ $mobileNo);
      long $countryId = this.getCountryId();
      result = result * 59 + (int)($countryId >>> 32 ^ $countryId);
      long $stateId = this.getStateId();
      result = result * 59 + (int)($stateId >>> 32 ^ $stateId);
      long $cityId = this.getCityId();
      result = result * 59 + (int)($cityId >>> 32 ^ $cityId);
      long $zipcode = this.getZipcode();
      result = result * 59 + (int)($zipcode >>> 32 ^ $zipcode);
      long $addedTimestamp = this.getAddedTimestamp();
      result = result * 59 + (int)($addedTimestamp >>> 32 ^ $addedTimestamp);
      long $updatedTimestamp = this.getUpdatedTimestamp();
      result = result * 59 + (int)($updatedTimestamp >>> 32 ^ $updatedTimestamp);
      Object $userId = this.getUserId();
      result = result * 59 + ($userId == null ? 43 : $userId.hashCode());
      Object $username = this.getUsername();
      result = result * 59 + ($username == null ? 43 : $username.hashCode());
      Object $password = this.getPassword();
      result = result * 59 + ($password == null ? 43 : $password.hashCode());
      Object $firstName = this.getFirstName();
      result = result * 59 + ($firstName == null ? 43 : $firstName.hashCode());
      Object $lastName = this.getLastName();
      result = result * 59 + ($lastName == null ? 43 : $lastName.hashCode());
      Object $email = this.getEmail();
      result = result * 59 + ($email == null ? 43 : $email.hashCode());
      Object $timezone = this.getTimezone();
      result = result * 59 + ($timezone == null ? 43 : $timezone.hashCode());
      Object $status = this.getStatus();
      result = result * 59 + ($status == null ? 43 : $status.hashCode());
      Object $webAccess = this.getWebAccess();
      result = result * 59 + ($webAccess == null ? 43 : $webAccess.hashCode());
      Object $mobileAccess = this.getMobileAccess();
      result = result * 59 + ($mobileAccess == null ? 43 : $mobileAccess.hashCode());
      Object $eldFeature = this.getEldFeature();
      result = result * 59 + ($eldFeature == null ? 43 : $eldFeature.hashCode());
      Object $dispatchFeature = this.getDispatchFeature();
      return result * 59 + ($dispatchFeature == null ? 43 : $dispatchFeature.hashCode());
   }

   @Override
   public String toString() {
      return "UserMaster(userId="
         + this.getUserId()
         + ", disclaimerRead="
         + this.getDisclaimerRead()
         + ", username="
         + this.getUsername()
         + ", password="
         + this.getPassword()
         + ", userTypeId="
         + this.getUserTypeId()
         + ", clientId="
         + this.getClientId()
         + ", firstName="
         + this.getFirstName()
         + ", lastName="
         + this.getLastName()
         + ", mobileNo="
         + this.getMobileNo()
         + ", email="
         + this.getEmail()
         + ", countryId="
         + this.getCountryId()
         + ", stateId="
         + this.getStateId()
         + ", cityId="
         + this.getCityId()
         + ", zipcode="
         + this.getZipcode()
         + ", timezone="
         + this.getTimezone()
         + ", status="
         + this.getStatus()
         + ", webAccess="
         + this.getWebAccess()
         + ", mobileAccess="
         + this.getMobileAccess()
         + ", eldFeature="
         + this.getEldFeature()
         + ", dispatchFeature="
         + this.getDispatchFeature()
         + ", addedTimestamp="
         + this.getAddedTimestamp()
         + ", updatedTimestamp="
         + this.getUpdatedTimestamp()
         + ")";
   }

   public Integer getUserId() {
      return this.userId;
   }

   public long getDisclaimerRead() {
      return this.disclaimerRead;
   }

   public String getUsername() {
      return this.username;
   }

   public String getPassword() {
      return this.password;
   }

   public long getUserTypeId() {
      return this.userTypeId;
   }

   public long getClientId() {
      return this.clientId;
   }

   public String getFirstName() {
      return this.firstName;
   }

   public String getLastName() {
      return this.lastName;
   }

   public long getMobileNo() {
      return this.mobileNo;
   }

   public String getEmail() {
      return this.email;
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

   public String getTimezone() {
      return this.timezone;
   }

   public String getStatus() {
      return this.status;
   }

   public String getWebAccess() {
      return this.webAccess;
   }

   public String getMobileAccess() {
      return this.mobileAccess;
   }

   public String getEldFeature() {
      return this.eldFeature;
   }

   public String getDispatchFeature() {
      return this.dispatchFeature;
   }

   public long getAddedTimestamp() {
      return this.addedTimestamp;
   }

   public long getUpdatedTimestamp() {
      return this.updatedTimestamp;
   }

   public void setUserId(final Integer userId) {
      this.userId = userId;
   }

   public void setDisclaimerRead(final long disclaimerRead) {
      this.disclaimerRead = disclaimerRead;
   }

   public void setUsername(final String username) {
      this.username = username;
   }

   public void setPassword(final String password) {
      this.password = password;
   }

   public void setUserTypeId(final long userTypeId) {
      this.userTypeId = userTypeId;
   }

   public void setClientId(final long clientId) {
      this.clientId = clientId;
   }

   public void setFirstName(final String firstName) {
      this.firstName = firstName;
   }

   public void setLastName(final String lastName) {
      this.lastName = lastName;
   }

   public void setMobileNo(final long mobileNo) {
      this.mobileNo = mobileNo;
   }

   public void setEmail(final String email) {
      this.email = email;
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

   public void setTimezone(final String timezone) {
      this.timezone = timezone;
   }

   public void setStatus(final String status) {
      this.status = status;
   }

   public void setWebAccess(final String webAccess) {
      this.webAccess = webAccess;
   }

   public void setMobileAccess(final String mobileAccess) {
      this.mobileAccess = mobileAccess;
   }

   public void setEldFeature(final String eldFeature) {
      this.eldFeature = eldFeature;
   }

   public void setDispatchFeature(final String dispatchFeature) {
      this.dispatchFeature = dispatchFeature;
   }

   public void setAddedTimestamp(final long addedTimestamp) {
      this.addedTimestamp = addedTimestamp;
   }

   public void setUpdatedTimestamp(final long updatedTimestamp) {
      this.updatedTimestamp = updatedTimestamp;
   }
}
