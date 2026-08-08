package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class ViewDriverLogWithDetailDto {
   @JsonProperty("driverLog")
   private List<DriveringStatusViewDto> driverLog;

   public List<DriveringStatusViewDto> getDriverLog() {
      return this.driverLog;
   }

   @JsonProperty("driverLog")
   public void setDriverLog(final List<DriveringStatusViewDto> driverLog) {
      this.driverLog = driverLog;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ViewDriverLogWithDetailDto)) {
         return false;
      } else {
         ViewDriverLogWithDetailDto other = (ViewDriverLogWithDetailDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$driverLog = this.getDriverLog();
            Object other$driverLog = other.getDriverLog();
            return this$driverLog == null ? other$driverLog == null : this$driverLog.equals(other$driverLog);
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof ViewDriverLogWithDetailDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $driverLog = this.getDriverLog();
      return result * 59 + ($driverLog == null ? 43 : $driverLog.hashCode());
   }

   @Override
   public String toString() {
      return "ViewDriverLogWithDetailDto(driverLog=" + this.getDriverLog() + ")";
   }
}
