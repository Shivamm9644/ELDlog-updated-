package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mes.eld_log.models.LoginLog;
import java.util.List;

public class DriverLogWithLoginLogViewDto {
   @JsonProperty("driverLog")
   private List<DriveringStatusViewDto> driverLog;
   @JsonProperty("loginLog")
   private List<LoginLog> loginLog;

   public List<DriveringStatusViewDto> getDriverLog() {
      return this.driverLog;
   }

   public List<LoginLog> getLoginLog() {
      return this.loginLog;
   }

   @JsonProperty("driverLog")
   public void setDriverLog(final List<DriveringStatusViewDto> driverLog) {
      this.driverLog = driverLog;
   }

   @JsonProperty("loginLog")
   public void setLoginLog(final List<LoginLog> loginLog) {
      this.loginLog = loginLog;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof DriverLogWithLoginLogViewDto)) {
         return false;
      } else {
         DriverLogWithLoginLogViewDto other = (DriverLogWithLoginLogViewDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$driverLog = this.getDriverLog();
            Object other$driverLog = other.getDriverLog();
            if (this$driverLog == null ? other$driverLog == null : this$driverLog.equals(other$driverLog)) {
               Object this$loginLog = this.getLoginLog();
               Object other$loginLog = other.getLoginLog();
               return this$loginLog == null ? other$loginLog == null : this$loginLog.equals(other$loginLog);
            } else {
               return false;
            }
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof DriverLogWithLoginLogViewDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $driverLog = this.getDriverLog();
      result = result * 59 + ($driverLog == null ? 43 : $driverLog.hashCode());
      Object $loginLog = this.getLoginLog();
      return result * 59 + ($loginLog == null ? 43 : $loginLog.hashCode());
   }

   @Override
   public String toString() {
      return "DriverLogWithLoginLogViewDto(driverLog=" + this.getDriverLog() + ", loginLog=" + this.getLoginLog() + ")";
   }
}
