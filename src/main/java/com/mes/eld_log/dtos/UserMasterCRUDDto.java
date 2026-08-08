package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserMasterCRUDDto {
   @JsonProperty("userId")
   private Integer userId;
   @JsonProperty("driverId")
   private long driverId;
   @JsonProperty("clientId")
   private long clientId;
   @JsonProperty("graceTime")
   private String graceTime;
   @JsonProperty("webAccess")
   private String webAccess;
   @JsonProperty("mobileAccess")
   private String mobileAccess;
   @JsonProperty("status")
   private String status;

   public Integer getUserId() {
      return this.userId;
   }

   public long getDriverId() {
      return this.driverId;
   }

   public long getClientId() {
      return this.clientId;
   }

   public String getGraceTime() {
      return this.graceTime;
   }

   public String getWebAccess() {
      return this.webAccess;
   }

   public String getMobileAccess() {
      return this.mobileAccess;
   }

   public String getStatus() {
      return this.status;
   }

   @JsonProperty("userId")
   public void setUserId(final Integer userId) {
      this.userId = userId;
   }

   @JsonProperty("driverId")
   public void setDriverId(final long driverId) {
      this.driverId = driverId;
   }

   @JsonProperty("clientId")
   public void setClientId(final long clientId) {
      this.clientId = clientId;
   }

   @JsonProperty("graceTime")
   public void setGraceTime(final String graceTime) {
      this.graceTime = graceTime;
   }

   @JsonProperty("webAccess")
   public void setWebAccess(final String webAccess) {
      this.webAccess = webAccess;
   }

   @JsonProperty("mobileAccess")
   public void setMobileAccess(final String mobileAccess) {
      this.mobileAccess = mobileAccess;
   }

   @JsonProperty("status")
   public void setStatus(final String status) {
      this.status = status;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof UserMasterCRUDDto)) {
         return false;
      } else {
         UserMasterCRUDDto other = (UserMasterCRUDDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getDriverId() != other.getDriverId()) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else {
            Object this$userId = this.getUserId();
            Object other$userId = other.getUserId();
            if (this$userId == null ? other$userId == null : this$userId.equals(other$userId)) {
               Object this$graceTime = this.getGraceTime();
               Object other$graceTime = other.getGraceTime();
               if (this$graceTime == null ? other$graceTime == null : this$graceTime.equals(other$graceTime)) {
                  Object this$webAccess = this.getWebAccess();
                  Object other$webAccess = other.getWebAccess();
                  if (this$webAccess == null ? other$webAccess == null : this$webAccess.equals(other$webAccess)) {
                     Object this$mobileAccess = this.getMobileAccess();
                     Object other$mobileAccess = other.getMobileAccess();
                     if (this$mobileAccess == null ? other$mobileAccess == null : this$mobileAccess.equals(other$mobileAccess)) {
                        Object this$status = this.getStatus();
                        Object other$status = other.getStatus();
                        return this$status == null ? other$status == null : this$status.equals(other$status);
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
      return other instanceof UserMasterCRUDDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $driverId = this.getDriverId();
      result = result * 59 + (int)($driverId >>> 32 ^ $driverId);
      long $clientId = this.getClientId();
      result = result * 59 + (int)($clientId >>> 32 ^ $clientId);
      Object $userId = this.getUserId();
      result = result * 59 + ($userId == null ? 43 : $userId.hashCode());
      Object $graceTime = this.getGraceTime();
      result = result * 59 + ($graceTime == null ? 43 : $graceTime.hashCode());
      Object $webAccess = this.getWebAccess();
      result = result * 59 + ($webAccess == null ? 43 : $webAccess.hashCode());
      Object $mobileAccess = this.getMobileAccess();
      result = result * 59 + ($mobileAccess == null ? 43 : $mobileAccess.hashCode());
      Object $status = this.getStatus();
      return result * 59 + ($status == null ? 43 : $status.hashCode());
   }

   @Override
   public String toString() {
      return "UserMasterCRUDDto(userId="
         + this.getUserId()
         + ", driverId="
         + this.getDriverId()
         + ", clientId="
         + this.getClientId()
         + ", graceTime="
         + this.getGraceTime()
         + ", webAccess="
         + this.getWebAccess()
         + ", mobileAccess="
         + this.getMobileAccess()
         + ", status="
         + this.getStatus()
         + ")";
   }
}
