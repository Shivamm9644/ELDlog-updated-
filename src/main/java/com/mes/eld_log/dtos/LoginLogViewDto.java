package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LoginLogViewDto {
   @JsonProperty("_id")
   private String _id;
   @JsonProperty("employeeId")
   private Integer employeeId;
   @JsonProperty("userId")
   private Integer userId;
   @JsonProperty("firstName")
   private String firstName;
   @JsonProperty("lastName")
   private String lastName;
   @JsonProperty("email")
   private String email;
   @JsonProperty("mobileNo")
   private long mobileNo;
   @JsonProperty("loginDateTime")
   private long loginDateTime;
   @JsonProperty("logoutDateTime")
   private long logoutDateTime;
   @JsonProperty("receivedTimestamp")
   private long receivedTimestamp;
   @JsonProperty("isCoDriver")
   private String isCoDriver;

   public String get_id() {
      return this._id;
   }

   public Integer getEmployeeId() {
      return this.employeeId;
   }

   public Integer getUserId() {
      return this.userId;
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

   public long getMobileNo() {
      return this.mobileNo;
   }

   public long getLoginDateTime() {
      return this.loginDateTime;
   }

   public long getLogoutDateTime() {
      return this.logoutDateTime;
   }

   public long getReceivedTimestamp() {
      return this.receivedTimestamp;
   }

   public String getIsCoDriver() {
      return this.isCoDriver;
   }

   @JsonProperty("_id")
   public void set_id(final String _id) {
      this._id = _id;
   }

   @JsonProperty("employeeId")
   public void setEmployeeId(final Integer employeeId) {
      this.employeeId = employeeId;
   }

   @JsonProperty("userId")
   public void setUserId(final Integer userId) {
      this.userId = userId;
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

   @JsonProperty("mobileNo")
   public void setMobileNo(final long mobileNo) {
      this.mobileNo = mobileNo;
   }

   @JsonProperty("loginDateTime")
   public void setLoginDateTime(final long loginDateTime) {
      this.loginDateTime = loginDateTime;
   }

   @JsonProperty("logoutDateTime")
   public void setLogoutDateTime(final long logoutDateTime) {
      this.logoutDateTime = logoutDateTime;
   }

   @JsonProperty("receivedTimestamp")
   public void setReceivedTimestamp(final long receivedTimestamp) {
      this.receivedTimestamp = receivedTimestamp;
   }

   @JsonProperty("isCoDriver")
   public void setIsCoDriver(final String isCoDriver) {
      this.isCoDriver = isCoDriver;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof LoginLogViewDto)) {
         return false;
      } else {
         LoginLogViewDto other = (LoginLogViewDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getMobileNo() != other.getMobileNo()) {
            return false;
         } else if (this.getLoginDateTime() != other.getLoginDateTime()) {
            return false;
         } else if (this.getLogoutDateTime() != other.getLogoutDateTime()) {
            return false;
         } else if (this.getReceivedTimestamp() != other.getReceivedTimestamp()) {
            return false;
         } else {
            Object this$employeeId = this.getEmployeeId();
            Object other$employeeId = other.getEmployeeId();
            if (this$employeeId == null ? other$employeeId == null : this$employeeId.equals(other$employeeId)) {
               Object this$userId = this.getUserId();
               Object other$userId = other.getUserId();
               if (this$userId == null ? other$userId == null : this$userId.equals(other$userId)) {
                  Object this$_id = this.get_id();
                  Object other$_id = other.get_id();
                  if (this$_id == null ? other$_id == null : this$_id.equals(other$_id)) {
                     Object this$firstName = this.getFirstName();
                     Object other$firstName = other.getFirstName();
                     if (this$firstName == null ? other$firstName == null : this$firstName.equals(other$firstName)) {
                        Object this$lastName = this.getLastName();
                        Object other$lastName = other.getLastName();
                        if (this$lastName == null ? other$lastName == null : this$lastName.equals(other$lastName)) {
                           Object this$email = this.getEmail();
                           Object other$email = other.getEmail();
                           if (this$email == null ? other$email == null : this$email.equals(other$email)) {
                              Object this$isCoDriver = this.getIsCoDriver();
                              Object other$isCoDriver = other.getIsCoDriver();
                              return this$isCoDriver == null ? other$isCoDriver == null : this$isCoDriver.equals(other$isCoDriver);
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
      return other instanceof LoginLogViewDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $mobileNo = this.getMobileNo();
      result = result * 59 + (int)($mobileNo >>> 32 ^ $mobileNo);
      long $loginDateTime = this.getLoginDateTime();
      result = result * 59 + (int)($loginDateTime >>> 32 ^ $loginDateTime);
      long $logoutDateTime = this.getLogoutDateTime();
      result = result * 59 + (int)($logoutDateTime >>> 32 ^ $logoutDateTime);
      long $receivedTimestamp = this.getReceivedTimestamp();
      result = result * 59 + (int)($receivedTimestamp >>> 32 ^ $receivedTimestamp);
      Object $employeeId = this.getEmployeeId();
      result = result * 59 + ($employeeId == null ? 43 : $employeeId.hashCode());
      Object $userId = this.getUserId();
      result = result * 59 + ($userId == null ? 43 : $userId.hashCode());
      Object $_id = this.get_id();
      result = result * 59 + ($_id == null ? 43 : $_id.hashCode());
      Object $firstName = this.getFirstName();
      result = result * 59 + ($firstName == null ? 43 : $firstName.hashCode());
      Object $lastName = this.getLastName();
      result = result * 59 + ($lastName == null ? 43 : $lastName.hashCode());
      Object $email = this.getEmail();
      result = result * 59 + ($email == null ? 43 : $email.hashCode());
      Object $isCoDriver = this.getIsCoDriver();
      return result * 59 + ($isCoDriver == null ? 43 : $isCoDriver.hashCode());
   }

   @Override
   public String toString() {
      return "LoginLogViewDto(_id="
         + this.get_id()
         + ", employeeId="
         + this.getEmployeeId()
         + ", userId="
         + this.getUserId()
         + ", firstName="
         + this.getFirstName()
         + ", lastName="
         + this.getLastName()
         + ", email="
         + this.getEmail()
         + ", mobileNo="
         + this.getMobileNo()
         + ", loginDateTime="
         + this.getLoginDateTime()
         + ", logoutDateTime="
         + this.getLogoutDateTime()
         + ", receivedTimestamp="
         + this.getReceivedTimestamp()
         + ", isCoDriver="
         + this.getIsCoDriver()
         + ")";
   }
}
