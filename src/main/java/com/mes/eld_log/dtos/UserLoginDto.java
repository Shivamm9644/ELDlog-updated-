package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserLoginDto {
   @JsonProperty("username")
   private String username;
   @JsonProperty("password")
   private String password;
   @JsonProperty("dateTime")
   private String dateTime;
   @JsonProperty("mobileNo")
   private long mobileNo;
   @JsonProperty("email")
   private String email;
   @JsonProperty("employeeId")
   private Integer employeeId;
   @JsonProperty("tokenNo")
   private String tokenNo;
   @JsonProperty("loginDateTime")
   private long loginDateTime;
   @JsonProperty("logoutDateTime")
   private long logoutDateTime;
   @JsonProperty("mobileDeviceId")
   private String mobileDeviceId;
   @JsonProperty("isCoDriver")
   private String isCoDriver;

   public String getUsername() {
      return this.username;
   }

   public String getPassword() {
      return this.password;
   }

   public String getDateTime() {
      return this.dateTime;
   }

   public long getMobileNo() {
      return this.mobileNo;
   }

   public String getEmail() {
      return this.email;
   }

   public Integer getEmployeeId() {
      return this.employeeId;
   }

   public String getTokenNo() {
      return this.tokenNo;
   }

   public long getLoginDateTime() {
      return this.loginDateTime;
   }

   public long getLogoutDateTime() {
      return this.logoutDateTime;
   }

   public String getMobileDeviceId() {
      return this.mobileDeviceId;
   }

   public String getIsCoDriver() {
      return this.isCoDriver;
   }

   @JsonProperty("username")
   public void setUsername(final String username) {
      this.username = username;
   }

   @JsonProperty("password")
   public void setPassword(final String password) {
      this.password = password;
   }

   @JsonProperty("dateTime")
   public void setDateTime(final String dateTime) {
      this.dateTime = dateTime;
   }

   @JsonProperty("mobileNo")
   public void setMobileNo(final long mobileNo) {
      this.mobileNo = mobileNo;
   }

   @JsonProperty("email")
   public void setEmail(final String email) {
      this.email = email;
   }

   @JsonProperty("employeeId")
   public void setEmployeeId(final Integer employeeId) {
      this.employeeId = employeeId;
   }

   @JsonProperty("tokenNo")
   public void setTokenNo(final String tokenNo) {
      this.tokenNo = tokenNo;
   }

   @JsonProperty("loginDateTime")
   public void setLoginDateTime(final long loginDateTime) {
      this.loginDateTime = loginDateTime;
   }

   @JsonProperty("logoutDateTime")
   public void setLogoutDateTime(final long logoutDateTime) {
      this.logoutDateTime = logoutDateTime;
   }

   @JsonProperty("mobileDeviceId")
   public void setMobileDeviceId(final String mobileDeviceId) {
      this.mobileDeviceId = mobileDeviceId;
   }

   @JsonProperty("isCoDriver")
   public void setIsCoDriver(final String isCoDriver) {
      this.isCoDriver = isCoDriver;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof UserLoginDto)) {
         return false;
      } else {
         UserLoginDto other = (UserLoginDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getMobileNo() != other.getMobileNo()) {
            return false;
         } else if (this.getLoginDateTime() != other.getLoginDateTime()) {
            return false;
         } else if (this.getLogoutDateTime() != other.getLogoutDateTime()) {
            return false;
         } else {
            Object this$employeeId = this.getEmployeeId();
            Object other$employeeId = other.getEmployeeId();
            if (this$employeeId == null ? other$employeeId == null : this$employeeId.equals(other$employeeId)) {
               Object this$username = this.getUsername();
               Object other$username = other.getUsername();
               if (this$username == null ? other$username == null : this$username.equals(other$username)) {
                  Object this$password = this.getPassword();
                  Object other$password = other.getPassword();
                  if (this$password == null ? other$password == null : this$password.equals(other$password)) {
                     Object this$dateTime = this.getDateTime();
                     Object other$dateTime = other.getDateTime();
                     if (this$dateTime == null ? other$dateTime == null : this$dateTime.equals(other$dateTime)) {
                        Object this$email = this.getEmail();
                        Object other$email = other.getEmail();
                        if (this$email == null ? other$email == null : this$email.equals(other$email)) {
                           Object this$tokenNo = this.getTokenNo();
                           Object other$tokenNo = other.getTokenNo();
                           if (this$tokenNo == null ? other$tokenNo == null : this$tokenNo.equals(other$tokenNo)) {
                              Object this$mobileDeviceId = this.getMobileDeviceId();
                              Object other$mobileDeviceId = other.getMobileDeviceId();
                              if (this$mobileDeviceId == null ? other$mobileDeviceId == null : this$mobileDeviceId.equals(other$mobileDeviceId)) {
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
            } else {
               return false;
            }
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof UserLoginDto;
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
      Object $employeeId = this.getEmployeeId();
      result = result * 59 + ($employeeId == null ? 43 : $employeeId.hashCode());
      Object $username = this.getUsername();
      result = result * 59 + ($username == null ? 43 : $username.hashCode());
      Object $password = this.getPassword();
      result = result * 59 + ($password == null ? 43 : $password.hashCode());
      Object $dateTime = this.getDateTime();
      result = result * 59 + ($dateTime == null ? 43 : $dateTime.hashCode());
      Object $email = this.getEmail();
      result = result * 59 + ($email == null ? 43 : $email.hashCode());
      Object $tokenNo = this.getTokenNo();
      result = result * 59 + ($tokenNo == null ? 43 : $tokenNo.hashCode());
      Object $mobileDeviceId = this.getMobileDeviceId();
      result = result * 59 + ($mobileDeviceId == null ? 43 : $mobileDeviceId.hashCode());
      Object $isCoDriver = this.getIsCoDriver();
      return result * 59 + ($isCoDriver == null ? 43 : $isCoDriver.hashCode());
   }

   @Override
   public String toString() {
      return "UserLoginDto(username="
         + this.getUsername()
         + ", password="
         + this.getPassword()
         + ", dateTime="
         + this.getDateTime()
         + ", mobileNo="
         + this.getMobileNo()
         + ", email="
         + this.getEmail()
         + ", employeeId="
         + this.getEmployeeId()
         + ", tokenNo="
         + this.getTokenNo()
         + ", loginDateTime="
         + this.getLoginDateTime()
         + ", logoutDateTime="
         + this.getLogoutDateTime()
         + ", mobileDeviceId="
         + this.getMobileDeviceId()
         + ", isCoDriver="
         + this.getIsCoDriver()
         + ")";
   }
}
