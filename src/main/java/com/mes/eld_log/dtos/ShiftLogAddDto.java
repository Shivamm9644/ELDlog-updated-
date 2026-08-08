package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ShiftLogAddDto {
   @JsonProperty("logStatusId")
   private String logStatusId;
   @JsonProperty("logStatus")
   private String logStatus;
   @JsonProperty("driverId")
   private long driverId;
   @JsonProperty("days")
   private int days;
   @JsonProperty("shift")
   private int shift;
   @JsonProperty("totalWeeklyTime")
   private long totalWeeklyTime;
   @JsonProperty("totalTimeOnDuty")
   private long totalTimeOnDuty;
   @JsonProperty("totalTimeDrive")
   private long totalTimeDrive;
   @JsonProperty("totalTimeOnSleep")
   private long totalTimeOnSleep;
   @JsonProperty("utcDateTime")
   private long utcDateTime;
   @JsonProperty("debugTime")
   private long debugTime;
   @JsonProperty("debugData")
   private String debugData;

   public String getLogStatusId() {
      return this.logStatusId;
   }

   public String getLogStatus() {
      return this.logStatus;
   }

   public long getDriverId() {
      return this.driverId;
   }

   public int getDays() {
      return this.days;
   }

   public int getShift() {
      return this.shift;
   }

   public long getTotalWeeklyTime() {
      return this.totalWeeklyTime;
   }

   public long getTotalTimeOnDuty() {
      return this.totalTimeOnDuty;
   }

   public long getTotalTimeDrive() {
      return this.totalTimeDrive;
   }

   public long getTotalTimeOnSleep() {
      return this.totalTimeOnSleep;
   }

   public long getUtcDateTime() {
      return this.utcDateTime;
   }

   public long getDebugTime() {
      return this.debugTime;
   }

   public String getDebugData() {
      return this.debugData;
   }

   @JsonProperty("logStatusId")
   public void setLogStatusId(final String logStatusId) {
      this.logStatusId = logStatusId;
   }

   @JsonProperty("logStatus")
   public void setLogStatus(final String logStatus) {
      this.logStatus = logStatus;
   }

   @JsonProperty("driverId")
   public void setDriverId(final long driverId) {
      this.driverId = driverId;
   }

   @JsonProperty("days")
   public void setDays(final int days) {
      this.days = days;
   }

   @JsonProperty("shift")
   public void setShift(final int shift) {
      this.shift = shift;
   }

   @JsonProperty("totalWeeklyTime")
   public void setTotalWeeklyTime(final long totalWeeklyTime) {
      this.totalWeeklyTime = totalWeeklyTime;
   }

   @JsonProperty("totalTimeOnDuty")
   public void setTotalTimeOnDuty(final long totalTimeOnDuty) {
      this.totalTimeOnDuty = totalTimeOnDuty;
   }

   @JsonProperty("totalTimeDrive")
   public void setTotalTimeDrive(final long totalTimeDrive) {
      this.totalTimeDrive = totalTimeDrive;
   }

   @JsonProperty("totalTimeOnSleep")
   public void setTotalTimeOnSleep(final long totalTimeOnSleep) {
      this.totalTimeOnSleep = totalTimeOnSleep;
   }

   @JsonProperty("utcDateTime")
   public void setUtcDateTime(final long utcDateTime) {
      this.utcDateTime = utcDateTime;
   }

   @JsonProperty("debugTime")
   public void setDebugTime(final long debugTime) {
      this.debugTime = debugTime;
   }

   @JsonProperty("debugData")
   public void setDebugData(final String debugData) {
      this.debugData = debugData;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ShiftLogAddDto)) {
         return false;
      } else {
         ShiftLogAddDto other = (ShiftLogAddDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getDriverId() != other.getDriverId()) {
            return false;
         } else if (this.getDays() != other.getDays()) {
            return false;
         } else if (this.getShift() != other.getShift()) {
            return false;
         } else if (this.getTotalWeeklyTime() != other.getTotalWeeklyTime()) {
            return false;
         } else if (this.getTotalTimeOnDuty() != other.getTotalTimeOnDuty()) {
            return false;
         } else if (this.getTotalTimeDrive() != other.getTotalTimeDrive()) {
            return false;
         } else if (this.getTotalTimeOnSleep() != other.getTotalTimeOnSleep()) {
            return false;
         } else if (this.getUtcDateTime() != other.getUtcDateTime()) {
            return false;
         } else if (this.getDebugTime() != other.getDebugTime()) {
            return false;
         } else {
            Object this$logStatusId = this.getLogStatusId();
            Object other$logStatusId = other.getLogStatusId();
            if (this$logStatusId == null ? other$logStatusId == null : this$logStatusId.equals(other$logStatusId)) {
               Object this$logStatus = this.getLogStatus();
               Object other$logStatus = other.getLogStatus();
               if (this$logStatus == null ? other$logStatus == null : this$logStatus.equals(other$logStatus)) {
                  Object this$debugData = this.getDebugData();
                  Object other$debugData = other.getDebugData();
                  return this$debugData == null ? other$debugData == null : this$debugData.equals(other$debugData);
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
      return other instanceof ShiftLogAddDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $driverId = this.getDriverId();
      result = result * 59 + (int)($driverId >>> 32 ^ $driverId);
      result = result * 59 + this.getDays();
      result = result * 59 + this.getShift();
      long $totalWeeklyTime = this.getTotalWeeklyTime();
      result = result * 59 + (int)($totalWeeklyTime >>> 32 ^ $totalWeeklyTime);
      long $totalTimeOnDuty = this.getTotalTimeOnDuty();
      result = result * 59 + (int)($totalTimeOnDuty >>> 32 ^ $totalTimeOnDuty);
      long $totalTimeDrive = this.getTotalTimeDrive();
      result = result * 59 + (int)($totalTimeDrive >>> 32 ^ $totalTimeDrive);
      long $totalTimeOnSleep = this.getTotalTimeOnSleep();
      result = result * 59 + (int)($totalTimeOnSleep >>> 32 ^ $totalTimeOnSleep);
      long $utcDateTime = this.getUtcDateTime();
      result = result * 59 + (int)($utcDateTime >>> 32 ^ $utcDateTime);
      long $debugTime = this.getDebugTime();
      result = result * 59 + (int)($debugTime >>> 32 ^ $debugTime);
      Object $logStatusId = this.getLogStatusId();
      result = result * 59 + ($logStatusId == null ? 43 : $logStatusId.hashCode());
      Object $logStatus = this.getLogStatus();
      result = result * 59 + ($logStatus == null ? 43 : $logStatus.hashCode());
      Object $debugData = this.getDebugData();
      return result * 59 + ($debugData == null ? 43 : $debugData.hashCode());
   }

   @Override
   public String toString() {
      return "ShiftLogAddDto(logStatusId="
         + this.getLogStatusId()
         + ", logStatus="
         + this.getLogStatus()
         + ", driverId="
         + this.getDriverId()
         + ", days="
         + this.getDays()
         + ", shift="
         + this.getShift()
         + ", totalWeeklyTime="
         + this.getTotalWeeklyTime()
         + ", totalTimeOnDuty="
         + this.getTotalTimeOnDuty()
         + ", totalTimeDrive="
         + this.getTotalTimeDrive()
         + ", totalTimeOnSleep="
         + this.getTotalTimeOnSleep()
         + ", utcDateTime="
         + this.getUtcDateTime()
         + ", debugTime="
         + this.getDebugTime()
         + ", debugData="
         + this.getDebugData()
         + ")";
   }
}
