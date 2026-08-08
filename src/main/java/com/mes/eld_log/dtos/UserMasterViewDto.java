package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserMasterViewDto {
   @JsonProperty("userId")
   private Integer userId;
   @JsonProperty("disclaimerRead")
   private long disclaimerRead;
   @JsonProperty("disclaimer")
   private String disclaimer;
   @JsonProperty("clientId")
   private long clientId;
   @JsonProperty("clientName")
   private String clientName;
   @JsonProperty("username")
   private String username;
   @JsonProperty("tokenNo")
   private String tokenNo;
   @JsonProperty("password")
   private String password;
   @JsonProperty("userTypeId")
   private long userTypeId;
   @JsonProperty("userTypeName")
   private String userTypeName;
   @JsonProperty("firstName")
   private String firstName;
   @JsonProperty("lastName")
   private String lastName;
   @JsonProperty("mobileNo")
   private long mobileNo;
   @JsonProperty("email")
   private String email;
   @JsonProperty("countryId")
   private long countryId;
   @JsonProperty("stateId")
   private long stateId;
   @JsonProperty("cityId")
   private long cityId;
   @JsonProperty("zipcode")
   private long zipcode;
   @JsonProperty("timezone")
   private String timezone;
   @JsonProperty("status")
   private String status;
   @JsonProperty("webAccess")
   private String webAccess;
   @JsonProperty("mobileAccess")
   private String mobileAccess;
   @JsonProperty("eldFeature")
   private String eldFeature;
   @JsonProperty("dispatchFeature")
   private String dispatchFeature;
   @JsonProperty("addedTimestamp")
   private long addedTimestamp;
   @JsonProperty("updatedTimestamp")
   private long updatedTimestamp;
   @JsonProperty("lattitude")
   private double lattitude;
   @JsonProperty("longitude")
   private double longitude;
   @JsonProperty("loginDateTime")
   private long loginDateTime;
   @JsonProperty("allowTracking")
   private String allowTracking;
   @JsonProperty("allowGpsTracking")
   private String allowGpsTracking;
   @JsonProperty("allowIfta")
   private String allowIfta;
   @JsonProperty("exemptDriver")
   private String exemptDriver;
   @JsonProperty("personalUse")
   private String personalUse;
   @JsonProperty("yardMoves")
   private String yardMoves;
   @JsonProperty("shortHaulException")
   private String shortHaulException;

   public Integer getUserId() {
      return this.userId;
   }

   public long getDisclaimerRead() {
      return this.disclaimerRead;
   }

   public String getDisclaimer() {
      return this.disclaimer;
   }

   public long getClientId() {
      return this.clientId;
   }

   public String getClientName() {
      return this.clientName;
   }

   public String getUsername() {
      return this.username;
   }

   public String getTokenNo() {
      return this.tokenNo;
   }

   public String getPassword() {
      return this.password;
   }

   public long getUserTypeId() {
      return this.userTypeId;
   }

   public String getUserTypeName() {
      return this.userTypeName;
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

   public double getLattitude() {
      return this.lattitude;
   }

   public double getLongitude() {
      return this.longitude;
   }

   public long getLoginDateTime() {
      return this.loginDateTime;
   }

   public String getAllowTracking() {
      return this.allowTracking;
   }

   public String getAllowGpsTracking() {
      return this.allowGpsTracking;
   }

   public String getAllowIfta() {
      return this.allowIfta;
   }

   public String getExemptDriver() {
      return this.exemptDriver;
   }

   public String getPersonalUse() {
      return this.personalUse;
   }

   public String getYardMoves() {
      return this.yardMoves;
   }

   public String getShortHaulException() {
      return this.shortHaulException;
   }

   @JsonProperty("userId")
   public void setUserId(final Integer userId) {
      this.userId = userId;
   }

   @JsonProperty("disclaimerRead")
   public void setDisclaimerRead(final long disclaimerRead) {
      this.disclaimerRead = disclaimerRead;
   }

   @JsonProperty("disclaimer")
   public void setDisclaimer(final String disclaimer) {
      this.disclaimer = disclaimer;
   }

   @JsonProperty("clientId")
   public void setClientId(final long clientId) {
      this.clientId = clientId;
   }

   @JsonProperty("clientName")
   public void setClientName(final String clientName) {
      this.clientName = clientName;
   }

   @JsonProperty("username")
   public void setUsername(final String username) {
      this.username = username;
   }

   @JsonProperty("tokenNo")
   public void setTokenNo(final String tokenNo) {
      this.tokenNo = tokenNo;
   }

   @JsonProperty("password")
   public void setPassword(final String password) {
      this.password = password;
   }

   @JsonProperty("userTypeId")
   public void setUserTypeId(final long userTypeId) {
      this.userTypeId = userTypeId;
   }

   @JsonProperty("userTypeName")
   public void setUserTypeName(final String userTypeName) {
      this.userTypeName = userTypeName;
   }

   @JsonProperty("firstName")
   public void setFirstName(final String firstName) {
      this.firstName = firstName;
   }

   @JsonProperty("lastName")
   public void setLastName(final String lastName) {
      this.lastName = lastName;
   }

   @JsonProperty("mobileNo")
   public void setMobileNo(final long mobileNo) {
      this.mobileNo = mobileNo;
   }

   @JsonProperty("email")
   public void setEmail(final String email) {
      this.email = email;
   }

   @JsonProperty("countryId")
   public void setCountryId(final long countryId) {
      this.countryId = countryId;
   }

   @JsonProperty("stateId")
   public void setStateId(final long stateId) {
      this.stateId = stateId;
   }

   @JsonProperty("cityId")
   public void setCityId(final long cityId) {
      this.cityId = cityId;
   }

   @JsonProperty("zipcode")
   public void setZipcode(final long zipcode) {
      this.zipcode = zipcode;
   }

   @JsonProperty("timezone")
   public void setTimezone(final String timezone) {
      this.timezone = timezone;
   }

   @JsonProperty("status")
   public void setStatus(final String status) {
      this.status = status;
   }

   @JsonProperty("webAccess")
   public void setWebAccess(final String webAccess) {
      this.webAccess = webAccess;
   }

   @JsonProperty("mobileAccess")
   public void setMobileAccess(final String mobileAccess) {
      this.mobileAccess = mobileAccess;
   }

   @JsonProperty("eldFeature")
   public void setEldFeature(final String eldFeature) {
      this.eldFeature = eldFeature;
   }

   @JsonProperty("dispatchFeature")
   public void setDispatchFeature(final String dispatchFeature) {
      this.dispatchFeature = dispatchFeature;
   }

   @JsonProperty("addedTimestamp")
   public void setAddedTimestamp(final long addedTimestamp) {
      this.addedTimestamp = addedTimestamp;
   }

   @JsonProperty("updatedTimestamp")
   public void setUpdatedTimestamp(final long updatedTimestamp) {
      this.updatedTimestamp = updatedTimestamp;
   }

   @JsonProperty("lattitude")
   public void setLattitude(final double lattitude) {
      this.lattitude = lattitude;
   }

   @JsonProperty("longitude")
   public void setLongitude(final double longitude) {
      this.longitude = longitude;
   }

   @JsonProperty("loginDateTime")
   public void setLoginDateTime(final long loginDateTime) {
      this.loginDateTime = loginDateTime;
   }

   @JsonProperty("allowTracking")
   public void setAllowTracking(final String allowTracking) {
      this.allowTracking = allowTracking;
   }

   @JsonProperty("allowGpsTracking")
   public void setAllowGpsTracking(final String allowGpsTracking) {
      this.allowGpsTracking = allowGpsTracking;
   }

   @JsonProperty("allowIfta")
   public void setAllowIfta(final String allowIfta) {
      this.allowIfta = allowIfta;
   }

   @JsonProperty("exemptDriver")
   public void setExemptDriver(final String exemptDriver) {
      this.exemptDriver = exemptDriver;
   }

   @JsonProperty("personalUse")
   public void setPersonalUse(final String personalUse) {
      this.personalUse = personalUse;
   }

   @JsonProperty("yardMoves")
   public void setYardMoves(final String yardMoves) {
      this.yardMoves = yardMoves;
   }

   @JsonProperty("shortHaulException")
   public void setShortHaulException(final String shortHaulException) {
      this.shortHaulException = shortHaulException;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof UserMasterViewDto)) {
         return false;
      } else {
         UserMasterViewDto other = (UserMasterViewDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getDisclaimerRead() != other.getDisclaimerRead()) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else if (this.getUserTypeId() != other.getUserTypeId()) {
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
         } else if (Double.compare(this.getLattitude(), other.getLattitude()) != 0) {
            return false;
         } else if (Double.compare(this.getLongitude(), other.getLongitude()) != 0) {
            return false;
         } else if (this.getLoginDateTime() != other.getLoginDateTime()) {
            return false;
         } else {
            Object this$userId = this.getUserId();
            Object other$userId = other.getUserId();
            if (this$userId == null ? other$userId == null : this$userId.equals(other$userId)) {
               Object this$disclaimer = this.getDisclaimer();
               Object other$disclaimer = other.getDisclaimer();
               if (this$disclaimer == null ? other$disclaimer == null : this$disclaimer.equals(other$disclaimer)) {
                  Object this$clientName = this.getClientName();
                  Object other$clientName = other.getClientName();
                  if (this$clientName == null ? other$clientName == null : this$clientName.equals(other$clientName)) {
                     Object this$username = this.getUsername();
                     Object other$username = other.getUsername();
                     if (this$username == null ? other$username == null : this$username.equals(other$username)) {
                        Object this$tokenNo = this.getTokenNo();
                        Object other$tokenNo = other.getTokenNo();
                        if (this$tokenNo == null ? other$tokenNo == null : this$tokenNo.equals(other$tokenNo)) {
                           Object this$password = this.getPassword();
                           Object other$password = other.getPassword();
                           if (this$password == null ? other$password == null : this$password.equals(other$password)) {
                              Object this$userTypeName = this.getUserTypeName();
                              Object other$userTypeName = other.getUserTypeName();
                              if (this$userTypeName == null ? other$userTypeName == null : this$userTypeName.equals(other$userTypeName)) {
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
                                                         if (this$dispatchFeature == null
                                                            ? other$dispatchFeature == null
                                                            : this$dispatchFeature.equals(other$dispatchFeature)) {
                                                            Object this$allowTracking = this.getAllowTracking();
                                                            Object other$allowTracking = other.getAllowTracking();
                                                            if (this$allowTracking == null
                                                               ? other$allowTracking == null
                                                               : this$allowTracking.equals(other$allowTracking)) {
                                                               Object this$allowGpsTracking = this.getAllowGpsTracking();
                                                               Object other$allowGpsTracking = other.getAllowGpsTracking();
                                                               if (this$allowGpsTracking == null
                                                                  ? other$allowGpsTracking == null
                                                                  : this$allowGpsTracking.equals(other$allowGpsTracking)) {
                                                                  Object this$allowIfta = this.getAllowIfta();
                                                                  Object other$allowIfta = other.getAllowIfta();
                                                                  if (this$allowIfta == null
                                                                     ? other$allowIfta == null
                                                                     : this$allowIfta.equals(other$allowIfta)) {
                                                                     Object this$exemptDriver = this.getExemptDriver();
                                                                     Object other$exemptDriver = other.getExemptDriver();
                                                                     if (this$exemptDriver == null
                                                                        ? other$exemptDriver == null
                                                                        : this$exemptDriver.equals(other$exemptDriver)) {
                                                                        Object this$personalUse = this.getPersonalUse();
                                                                        Object other$personalUse = other.getPersonalUse();
                                                                        if (this$personalUse == null
                                                                           ? other$personalUse == null
                                                                           : this$personalUse.equals(other$personalUse)) {
                                                                           Object this$yardMoves = this.getYardMoves();
                                                                           Object other$yardMoves = other.getYardMoves();
                                                                           if (this$yardMoves == null
                                                                              ? other$yardMoves == null
                                                                              : this$yardMoves.equals(other$yardMoves)) {
                                                                              Object this$shortHaulException = this.getShortHaulException();
                                                                              Object other$shortHaulException = other.getShortHaulException();
                                                                              return this$shortHaulException == null
                                                                                 ? other$shortHaulException == null
                                                                                 : this$shortHaulException.equals(other$shortHaulException);
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
      return other instanceof UserMasterViewDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $disclaimerRead = this.getDisclaimerRead();
      result = result * 59 + (int)($disclaimerRead >>> 32 ^ $disclaimerRead);
      long $clientId = this.getClientId();
      result = result * 59 + (int)($clientId >>> 32 ^ $clientId);
      long $userTypeId = this.getUserTypeId();
      result = result * 59 + (int)($userTypeId >>> 32 ^ $userTypeId);
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
      long $lattitude = Double.doubleToLongBits(this.getLattitude());
      result = result * 59 + (int)($lattitude >>> 32 ^ $lattitude);
      long $longitude = Double.doubleToLongBits(this.getLongitude());
      result = result * 59 + (int)($longitude >>> 32 ^ $longitude);
      long $loginDateTime = this.getLoginDateTime();
      result = result * 59 + (int)($loginDateTime >>> 32 ^ $loginDateTime);
      Object $userId = this.getUserId();
      result = result * 59 + ($userId == null ? 43 : $userId.hashCode());
      Object $disclaimer = this.getDisclaimer();
      result = result * 59 + ($disclaimer == null ? 43 : $disclaimer.hashCode());
      Object $clientName = this.getClientName();
      result = result * 59 + ($clientName == null ? 43 : $clientName.hashCode());
      Object $username = this.getUsername();
      result = result * 59 + ($username == null ? 43 : $username.hashCode());
      Object $tokenNo = this.getTokenNo();
      result = result * 59 + ($tokenNo == null ? 43 : $tokenNo.hashCode());
      Object $password = this.getPassword();
      result = result * 59 + ($password == null ? 43 : $password.hashCode());
      Object $userTypeName = this.getUserTypeName();
      result = result * 59 + ($userTypeName == null ? 43 : $userTypeName.hashCode());
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
      result = result * 59 + ($dispatchFeature == null ? 43 : $dispatchFeature.hashCode());
      Object $allowTracking = this.getAllowTracking();
      result = result * 59 + ($allowTracking == null ? 43 : $allowTracking.hashCode());
      Object $allowGpsTracking = this.getAllowGpsTracking();
      result = result * 59 + ($allowGpsTracking == null ? 43 : $allowGpsTracking.hashCode());
      Object $allowIfta = this.getAllowIfta();
      result = result * 59 + ($allowIfta == null ? 43 : $allowIfta.hashCode());
      Object $exemptDriver = this.getExemptDriver();
      result = result * 59 + ($exemptDriver == null ? 43 : $exemptDriver.hashCode());
      Object $personalUse = this.getPersonalUse();
      result = result * 59 + ($personalUse == null ? 43 : $personalUse.hashCode());
      Object $yardMoves = this.getYardMoves();
      result = result * 59 + ($yardMoves == null ? 43 : $yardMoves.hashCode());
      Object $shortHaulException = this.getShortHaulException();
      return result * 59 + ($shortHaulException == null ? 43 : $shortHaulException.hashCode());
   }

   @Override
   public String toString() {
      return "UserMasterViewDto(userId="
         + this.getUserId()
         + ", disclaimerRead="
         + this.getDisclaimerRead()
         + ", disclaimer="
         + this.getDisclaimer()
         + ", clientId="
         + this.getClientId()
         + ", clientName="
         + this.getClientName()
         + ", username="
         + this.getUsername()
         + ", tokenNo="
         + this.getTokenNo()
         + ", password="
         + this.getPassword()
         + ", userTypeId="
         + this.getUserTypeId()
         + ", userTypeName="
         + this.getUserTypeName()
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
         + ", lattitude="
         + this.getLattitude()
         + ", longitude="
         + this.getLongitude()
         + ", loginDateTime="
         + this.getLoginDateTime()
         + ", allowTracking="
         + this.getAllowTracking()
         + ", allowGpsTracking="
         + this.getAllowGpsTracking()
         + ", allowIfta="
         + this.getAllowIfta()
         + ", exemptDriver="
         + this.getExemptDriver()
         + ", personalUse="
         + this.getPersonalUse()
         + ", yardMoves="
         + this.getYardMoves()
         + ", shortHaulException="
         + this.getShortHaulException()
         + ")";
   }
}
