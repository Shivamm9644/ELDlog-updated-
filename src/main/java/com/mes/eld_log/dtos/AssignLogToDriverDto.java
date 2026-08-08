package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class AssignLogToDriverDto {
   @JsonProperty("driverId")
   private long driverId;
   @JsonProperty("hour")
   private Integer hour;
   @JsonProperty("logShift")
   private String logShift;
   @JsonProperty("checkDvir")
   private String checkDvir;
   @JsonProperty("checkCertified")
   private String checkCertified;
   @JsonProperty("logStatusData")
   private List<DriveringStatusLogViewDto> logStatusData;

   public long getDriverId() {
      return this.driverId;
   }

   public Integer getHour() {
      return this.hour;
   }

   public String getLogShift() {
      return this.logShift;
   }

   public String getCheckDvir() {
      return this.checkDvir;
   }

   public String getCheckCertified() {
      return this.checkCertified;
   }

   public List<DriveringStatusLogViewDto> getLogStatusData() {
      return this.logStatusData;
   }

   @JsonProperty("driverId")
   public void setDriverId(final long driverId) {
      this.driverId = driverId;
   }

   @JsonProperty("hour")
   public void setHour(final Integer hour) {
      this.hour = hour;
   }

   @JsonProperty("logShift")
   public void setLogShift(final String logShift) {
      this.logShift = logShift;
   }

   @JsonProperty("checkDvir")
   public void setCheckDvir(final String checkDvir) {
      this.checkDvir = checkDvir;
   }

   @JsonProperty("checkCertified")
   public void setCheckCertified(final String checkCertified) {
      this.checkCertified = checkCertified;
   }

   @JsonProperty("logStatusData")
   public void setLogStatusData(final List<DriveringStatusLogViewDto> logStatusData) {
      this.logStatusData = logStatusData;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof AssignLogToDriverDto)) {
         return false;
      } else {
         AssignLogToDriverDto other = (AssignLogToDriverDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getDriverId() != other.getDriverId()) {
            return false;
         } else {
            Object this$hour = this.getHour();
            Object other$hour = other.getHour();
            if (this$hour == null ? other$hour == null : this$hour.equals(other$hour)) {
               Object this$logShift = this.getLogShift();
               Object other$logShift = other.getLogShift();
               if (this$logShift == null ? other$logShift == null : this$logShift.equals(other$logShift)) {
                  Object this$checkDvir = this.getCheckDvir();
                  Object other$checkDvir = other.getCheckDvir();
                  if (this$checkDvir == null ? other$checkDvir == null : this$checkDvir.equals(other$checkDvir)) {
                     Object this$checkCertified = this.getCheckCertified();
                     Object other$checkCertified = other.getCheckCertified();
                     if (this$checkCertified == null ? other$checkCertified == null : this$checkCertified.equals(other$checkCertified)) {
                        Object this$logStatusData = this.getLogStatusData();
                        Object other$logStatusData = other.getLogStatusData();
                        return this$logStatusData == null ? other$logStatusData == null : this$logStatusData.equals(other$logStatusData);
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
      return other instanceof AssignLogToDriverDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $driverId = this.getDriverId();
      result = result * 59 + (int)($driverId >>> 32 ^ $driverId);
      Object $hour = this.getHour();
      result = result * 59 + ($hour == null ? 43 : $hour.hashCode());
      Object $logShift = this.getLogShift();
      result = result * 59 + ($logShift == null ? 43 : $logShift.hashCode());
      Object $checkDvir = this.getCheckDvir();
      result = result * 59 + ($checkDvir == null ? 43 : $checkDvir.hashCode());
      Object $checkCertified = this.getCheckCertified();
      result = result * 59 + ($checkCertified == null ? 43 : $checkCertified.hashCode());
      Object $logStatusData = this.getLogStatusData();
      return result * 59 + ($logStatusData == null ? 43 : $logStatusData.hashCode());
   }

   @Override
   public String toString() {
      return "AssignLogToDriverDto(driverId="
         + this.getDriverId()
         + ", hour="
         + this.getHour()
         + ", logShift="
         + this.getLogShift()
         + ", checkDvir="
         + this.getCheckDvir()
         + ", checkCertified="
         + this.getCheckCertified()
         + ", logStatusData="
         + this.getLogStatusData()
         + ")";
   }
}
