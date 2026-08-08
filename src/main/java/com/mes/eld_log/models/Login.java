package com.mes.eld_log.models;

import java.io.Serializable;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.core.mapping.Document;

@EntityScan
@Document(
   collection = "login"
)
public class Login implements Serializable {
   private static final long serialVersionUID = 1L;
   private Integer employeeId;
   private String email;
   private String username;
   private String password;
   private String loginStatus;
   private long loginDateTime;
   private long logoutDateTime;
   private long mobileNo;
   private long dateTime;
   private String mobileDeviceId;
   private String isCoDriver;
   private String tokenNo;

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof Login)) {
         return false;
      } else {
         Login other = (Login)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getLoginDateTime() != other.getLoginDateTime()) {
            return false;
         } else if (this.getLogoutDateTime() != other.getLogoutDateTime()) {
            return false;
         } else if (this.getMobileNo() != other.getMobileNo()) {
            return false;
         } else if (this.getDateTime() != other.getDateTime()) {
            return false;
         } else {
            Object this$employeeId = this.getEmployeeId();
            Object other$employeeId = other.getEmployeeId();
            if (this$employeeId == null ? other$employeeId == null : this$employeeId.equals(other$employeeId)) {
               Object this$email = this.getEmail();
               Object other$email = other.getEmail();
               if (this$email == null ? other$email == null : this$email.equals(other$email)) {
                  Object this$username = this.getUsername();
                  Object other$username = other.getUsername();
                  if (this$username == null ? other$username == null : this$username.equals(other$username)) {
                     Object this$password = this.getPassword();
                     Object other$password = other.getPassword();
                     if (this$password == null ? other$password == null : this$password.equals(other$password)) {
                        Object this$loginStatus = this.getLoginStatus();
                        Object other$loginStatus = other.getLoginStatus();
                        if (this$loginStatus == null ? other$loginStatus == null : this$loginStatus.equals(other$loginStatus)) {
                           Object this$mobileDeviceId = this.getMobileDeviceId();
                           Object other$mobileDeviceId = other.getMobileDeviceId();
                           if (this$mobileDeviceId == null ? other$mobileDeviceId == null : this$mobileDeviceId.equals(other$mobileDeviceId)) {
                              Object this$isCoDriver = this.getIsCoDriver();
                              Object other$isCoDriver = other.getIsCoDriver();
                              if (this$isCoDriver == null ? other$isCoDriver == null : this$isCoDriver.equals(other$isCoDriver)) {
                                 Object this$tokenNo = this.getTokenNo();
                                 Object other$tokenNo = other.getTokenNo();
                                 return this$tokenNo == null ? other$tokenNo == null : this$tokenNo.equals(other$tokenNo);
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
      return other instanceof Login;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $loginDateTime = this.getLoginDateTime();
      result = result * 59 + (int)($loginDateTime >>> 32 ^ $loginDateTime);
      long $logoutDateTime = this.getLogoutDateTime();
      result = result * 59 + (int)($logoutDateTime >>> 32 ^ $logoutDateTime);
      long $mobileNo = this.getMobileNo();
      result = result * 59 + (int)($mobileNo >>> 32 ^ $mobileNo);
      long $dateTime = this.getDateTime();
      result = result * 59 + (int)($dateTime >>> 32 ^ $dateTime);
      Object $employeeId = this.getEmployeeId();
      result = result * 59 + ($employeeId == null ? 43 : $employeeId.hashCode());
      Object $email = this.getEmail();
      result = result * 59 + ($email == null ? 43 : $email.hashCode());
      Object $username = this.getUsername();
      result = result * 59 + ($username == null ? 43 : $username.hashCode());
      Object $password = this.getPassword();
      result = result * 59 + ($password == null ? 43 : $password.hashCode());
      Object $loginStatus = this.getLoginStatus();
      result = result * 59 + ($loginStatus == null ? 43 : $loginStatus.hashCode());
      Object $mobileDeviceId = this.getMobileDeviceId();
      result = result * 59 + ($mobileDeviceId == null ? 43 : $mobileDeviceId.hashCode());
      Object $isCoDriver = this.getIsCoDriver();
      result = result * 59 + ($isCoDriver == null ? 43 : $isCoDriver.hashCode());
      Object $tokenNo = this.getTokenNo();
      return result * 59 + ($tokenNo == null ? 43 : $tokenNo.hashCode());
   }

   @Override
   public String toString() {
      return "Login(employeeId="
         + this.getEmployeeId()
         + ", email="
         + this.getEmail()
         + ", username="
         + this.getUsername()
         + ", password="
         + this.getPassword()
         + ", loginStatus="
         + this.getLoginStatus()
         + ", loginDateTime="
         + this.getLoginDateTime()
         + ", logoutDateTime="
         + this.getLogoutDateTime()
         + ", mobileNo="
         + this.getMobileNo()
         + ", dateTime="
         + this.getDateTime()
         + ", mobileDeviceId="
         + this.getMobileDeviceId()
         + ", isCoDriver="
         + this.getIsCoDriver()
         + ", tokenNo="
         + this.getTokenNo()
         + ")";
   }

   public Integer getEmployeeId() {
      return this.employeeId;
   }

   public String getEmail() {
      return this.email;
   }

   public String getUsername() {
      return this.username;
   }

   public String getPassword() {
      return this.password;
   }

   public String getLoginStatus() {
      return this.loginStatus;
   }

   public long getLoginDateTime() {
      return this.loginDateTime;
   }

   public long getLogoutDateTime() {
      return this.logoutDateTime;
   }

   public long getMobileNo() {
      return this.mobileNo;
   }

   public long getDateTime() {
      return this.dateTime;
   }

   public String getMobileDeviceId() {
      return this.mobileDeviceId;
   }

   public String getIsCoDriver() {
      return this.isCoDriver;
   }

   public String getTokenNo() {
      return this.tokenNo;
   }

   public void setEmployeeId(final Integer employeeId) {
      this.employeeId = employeeId;
   }

   public void setEmail(final String email) {
      this.email = email;
   }

   public void setUsername(final String username) {
      this.username = username;
   }

   public void setPassword(final String password) {
      this.password = password;
   }

   public void setLoginStatus(final String loginStatus) {
      this.loginStatus = loginStatus;
   }

   public void setLoginDateTime(final long loginDateTime) {
      this.loginDateTime = loginDateTime;
   }

   public void setLogoutDateTime(final long logoutDateTime) {
      this.logoutDateTime = logoutDateTime;
   }

   public void setMobileNo(final long mobileNo) {
      this.mobileNo = mobileNo;
   }

   public void setDateTime(final long dateTime) {
      this.dateTime = dateTime;
   }

   public void setMobileDeviceId(final String mobileDeviceId) {
      this.mobileDeviceId = mobileDeviceId;
   }

   public void setIsCoDriver(final String isCoDriver) {
      this.isCoDriver = isCoDriver;
   }

   public void setTokenNo(final String tokenNo) {
      this.tokenNo = tokenNo;
   }
}
