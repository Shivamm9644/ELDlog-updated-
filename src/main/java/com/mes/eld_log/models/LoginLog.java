package com.mes.eld_log.models;

import java.io.Serializable;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.core.mapping.Document;

@EntityScan
@Document(
   collection = "login_log"
)
public class LoginLog implements Serializable {
   private static final long serialVersionUID = 1L;
   private String _id;
   private Integer employeeId;
   private Integer userId;
   private long loginDateTime;
   private long logoutDateTime;
   private long receivedTimestamp;
   private String isCoDriver;
   private String loginType;
   private Integer isVisible = 1;
   private String email = "";

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof LoginLog)) {
         return false;
      } else {
         LoginLog other = (LoginLog)o;
         if (!other.canEqual(this)) {
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
                  Object this$isVisible = this.getIsVisible();
                  Object other$isVisible = other.getIsVisible();
                  if (this$isVisible == null ? other$isVisible == null : this$isVisible.equals(other$isVisible)) {
                     Object this$_id = this.get_id();
                     Object other$_id = other.get_id();
                     if (this$_id == null ? other$_id == null : this$_id.equals(other$_id)) {
                        Object this$isCoDriver = this.getIsCoDriver();
                        Object other$isCoDriver = other.getIsCoDriver();
                        if (this$isCoDriver == null ? other$isCoDriver == null : this$isCoDriver.equals(other$isCoDriver)) {
                           Object this$loginType = this.getLoginType();
                           Object other$loginType = other.getLoginType();
                           if (this$loginType == null ? other$loginType == null : this$loginType.equals(other$loginType)) {
                              Object this$email = this.getEmail();
                              Object other$email = other.getEmail();
                              return this$email == null ? other$email == null : this$email.equals(other$email);
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
      return other instanceof LoginLog;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
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
      Object $isVisible = this.getIsVisible();
      result = result * 59 + ($isVisible == null ? 43 : $isVisible.hashCode());
      Object $_id = this.get_id();
      result = result * 59 + ($_id == null ? 43 : $_id.hashCode());
      Object $isCoDriver = this.getIsCoDriver();
      result = result * 59 + ($isCoDriver == null ? 43 : $isCoDriver.hashCode());
      Object $loginType = this.getLoginType();
      result = result * 59 + ($loginType == null ? 43 : $loginType.hashCode());
      Object $email = this.getEmail();
      return result * 59 + ($email == null ? 43 : $email.hashCode());
   }

   @Override
   public String toString() {
      return "LoginLog(_id="
         + this.get_id()
         + ", employeeId="
         + this.getEmployeeId()
         + ", userId="
         + this.getUserId()
         + ", loginDateTime="
         + this.getLoginDateTime()
         + ", logoutDateTime="
         + this.getLogoutDateTime()
         + ", receivedTimestamp="
         + this.getReceivedTimestamp()
         + ", isCoDriver="
         + this.getIsCoDriver()
         + ", loginType="
         + this.getLoginType()
         + ", isVisible="
         + this.getIsVisible()
         + ", email="
         + this.getEmail()
         + ")";
   }

   public String get_id() {
      return this._id;
   }

   public Integer getEmployeeId() {
      return this.employeeId;
   }

   public Integer getUserId() {
      return this.userId;
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

   public String getLoginType() {
      return this.loginType;
   }

   public Integer getIsVisible() {
      return this.isVisible;
   }

   public String getEmail() {
      return this.email;
   }

   public void set_id(final String _id) {
      this._id = _id;
   }

   public void setEmployeeId(final Integer employeeId) {
      this.employeeId = employeeId;
   }

   public void setUserId(final Integer userId) {
      this.userId = userId;
   }

   public void setLoginDateTime(final long loginDateTime) {
      this.loginDateTime = loginDateTime;
   }

   public void setLogoutDateTime(final long logoutDateTime) {
      this.logoutDateTime = logoutDateTime;
   }

   public void setReceivedTimestamp(final long receivedTimestamp) {
      this.receivedTimestamp = receivedTimestamp;
   }

   public void setIsCoDriver(final String isCoDriver) {
      this.isCoDriver = isCoDriver;
   }

   public void setLoginType(final String loginType) {
      this.loginType = loginType;
   }

   public void setIsVisible(final Integer isVisible) {
      this.isVisible = isVisible;
   }

   public void setEmail(final String email) {
      this.email = email;
   }
}
