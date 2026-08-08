package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CycleTimeRulesViewDto {
   @JsonProperty("cycleTime")
   private long cycleTime;
   @JsonProperty("cycleDays")
   private long cycleDays;
   @JsonProperty("onDutyTime")
   private long onDutyTime;
   @JsonProperty("onDriveTime")
   private long onDriveTime;
   @JsonProperty("onSleepTime")
   private long onSleepTime;
   @JsonProperty("continueDriveTime")
   private long continueDriveTime;
   @JsonProperty("breakTime")
   private long breakTime;
   @JsonProperty("cycleRestartTime")
   private long cycleRestartTime;
   @JsonProperty("warningOnDutyTime1")
   private long warningOnDutyTime1;
   @JsonProperty("warningOnDutyTime2")
   private long warningOnDutyTime2;
   @JsonProperty("warningOnDriveTime1")
   private long warningOnDriveTime1;
   @JsonProperty("warningOnDriveTime2")
   private long warningOnDriveTime2;
   @JsonProperty("warningBreakTime1")
   private long warningBreakTime1;
   @JsonProperty("warningBreakTime2")
   private long warningBreakTime2;
   @JsonProperty("cycleWarningTime1")
   private long cycleWarningTime1;
   @JsonProperty("cycleWarningTime2")
   private long cycleWarningTime2;

   public long getCycleTime() {
      return this.cycleTime;
   }

   public long getCycleDays() {
      return this.cycleDays;
   }

   public long getOnDutyTime() {
      return this.onDutyTime;
   }

   public long getOnDriveTime() {
      return this.onDriveTime;
   }

   public long getOnSleepTime() {
      return this.onSleepTime;
   }

   public long getContinueDriveTime() {
      return this.continueDriveTime;
   }

   public long getBreakTime() {
      return this.breakTime;
   }

   public long getCycleRestartTime() {
      return this.cycleRestartTime;
   }

   public long getWarningOnDutyTime1() {
      return this.warningOnDutyTime1;
   }

   public long getWarningOnDutyTime2() {
      return this.warningOnDutyTime2;
   }

   public long getWarningOnDriveTime1() {
      return this.warningOnDriveTime1;
   }

   public long getWarningOnDriveTime2() {
      return this.warningOnDriveTime2;
   }

   public long getWarningBreakTime1() {
      return this.warningBreakTime1;
   }

   public long getWarningBreakTime2() {
      return this.warningBreakTime2;
   }

   public long getCycleWarningTime1() {
      return this.cycleWarningTime1;
   }

   public long getCycleWarningTime2() {
      return this.cycleWarningTime2;
   }

   @JsonProperty("cycleTime")
   public void setCycleTime(final long cycleTime) {
      this.cycleTime = cycleTime;
   }

   @JsonProperty("cycleDays")
   public void setCycleDays(final long cycleDays) {
      this.cycleDays = cycleDays;
   }

   @JsonProperty("onDutyTime")
   public void setOnDutyTime(final long onDutyTime) {
      this.onDutyTime = onDutyTime;
   }

   @JsonProperty("onDriveTime")
   public void setOnDriveTime(final long onDriveTime) {
      this.onDriveTime = onDriveTime;
   }

   @JsonProperty("onSleepTime")
   public void setOnSleepTime(final long onSleepTime) {
      this.onSleepTime = onSleepTime;
   }

   @JsonProperty("continueDriveTime")
   public void setContinueDriveTime(final long continueDriveTime) {
      this.continueDriveTime = continueDriveTime;
   }

   @JsonProperty("breakTime")
   public void setBreakTime(final long breakTime) {
      this.breakTime = breakTime;
   }

   @JsonProperty("cycleRestartTime")
   public void setCycleRestartTime(final long cycleRestartTime) {
      this.cycleRestartTime = cycleRestartTime;
   }

   @JsonProperty("warningOnDutyTime1")
   public void setWarningOnDutyTime1(final long warningOnDutyTime1) {
      this.warningOnDutyTime1 = warningOnDutyTime1;
   }

   @JsonProperty("warningOnDutyTime2")
   public void setWarningOnDutyTime2(final long warningOnDutyTime2) {
      this.warningOnDutyTime2 = warningOnDutyTime2;
   }

   @JsonProperty("warningOnDriveTime1")
   public void setWarningOnDriveTime1(final long warningOnDriveTime1) {
      this.warningOnDriveTime1 = warningOnDriveTime1;
   }

   @JsonProperty("warningOnDriveTime2")
   public void setWarningOnDriveTime2(final long warningOnDriveTime2) {
      this.warningOnDriveTime2 = warningOnDriveTime2;
   }

   @JsonProperty("warningBreakTime1")
   public void setWarningBreakTime1(final long warningBreakTime1) {
      this.warningBreakTime1 = warningBreakTime1;
   }

   @JsonProperty("warningBreakTime2")
   public void setWarningBreakTime2(final long warningBreakTime2) {
      this.warningBreakTime2 = warningBreakTime2;
   }

   @JsonProperty("cycleWarningTime1")
   public void setCycleWarningTime1(final long cycleWarningTime1) {
      this.cycleWarningTime1 = cycleWarningTime1;
   }

   @JsonProperty("cycleWarningTime2")
   public void setCycleWarningTime2(final long cycleWarningTime2) {
      this.cycleWarningTime2 = cycleWarningTime2;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof CycleTimeRulesViewDto)) {
         return false;
      } else {
         CycleTimeRulesViewDto other = (CycleTimeRulesViewDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getCycleTime() != other.getCycleTime()) {
            return false;
         } else if (this.getCycleDays() != other.getCycleDays()) {
            return false;
         } else if (this.getOnDutyTime() != other.getOnDutyTime()) {
            return false;
         } else if (this.getOnDriveTime() != other.getOnDriveTime()) {
            return false;
         } else if (this.getOnSleepTime() != other.getOnSleepTime()) {
            return false;
         } else if (this.getContinueDriveTime() != other.getContinueDriveTime()) {
            return false;
         } else if (this.getBreakTime() != other.getBreakTime()) {
            return false;
         } else if (this.getCycleRestartTime() != other.getCycleRestartTime()) {
            return false;
         } else if (this.getWarningOnDutyTime1() != other.getWarningOnDutyTime1()) {
            return false;
         } else if (this.getWarningOnDutyTime2() != other.getWarningOnDutyTime2()) {
            return false;
         } else if (this.getWarningOnDriveTime1() != other.getWarningOnDriveTime1()) {
            return false;
         } else if (this.getWarningOnDriveTime2() != other.getWarningOnDriveTime2()) {
            return false;
         } else if (this.getWarningBreakTime1() != other.getWarningBreakTime1()) {
            return false;
         } else if (this.getWarningBreakTime2() != other.getWarningBreakTime2()) {
            return false;
         } else if (this.getCycleWarningTime1() != other.getCycleWarningTime1()) {
            return false;
         } else {
            return this.getCycleWarningTime2() == other.getCycleWarningTime2();
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof CycleTimeRulesViewDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $cycleTime = this.getCycleTime();
      result = result * 59 + (int)($cycleTime >>> 32 ^ $cycleTime);
      long $cycleDays = this.getCycleDays();
      result = result * 59 + (int)($cycleDays >>> 32 ^ $cycleDays);
      long $onDutyTime = this.getOnDutyTime();
      result = result * 59 + (int)($onDutyTime >>> 32 ^ $onDutyTime);
      long $onDriveTime = this.getOnDriveTime();
      result = result * 59 + (int)($onDriveTime >>> 32 ^ $onDriveTime);
      long $onSleepTime = this.getOnSleepTime();
      result = result * 59 + (int)($onSleepTime >>> 32 ^ $onSleepTime);
      long $continueDriveTime = this.getContinueDriveTime();
      result = result * 59 + (int)($continueDriveTime >>> 32 ^ $continueDriveTime);
      long $breakTime = this.getBreakTime();
      result = result * 59 + (int)($breakTime >>> 32 ^ $breakTime);
      long $cycleRestartTime = this.getCycleRestartTime();
      result = result * 59 + (int)($cycleRestartTime >>> 32 ^ $cycleRestartTime);
      long $warningOnDutyTime1 = this.getWarningOnDutyTime1();
      result = result * 59 + (int)($warningOnDutyTime1 >>> 32 ^ $warningOnDutyTime1);
      long $warningOnDutyTime2 = this.getWarningOnDutyTime2();
      result = result * 59 + (int)($warningOnDutyTime2 >>> 32 ^ $warningOnDutyTime2);
      long $warningOnDriveTime1 = this.getWarningOnDriveTime1();
      result = result * 59 + (int)($warningOnDriveTime1 >>> 32 ^ $warningOnDriveTime1);
      long $warningOnDriveTime2 = this.getWarningOnDriveTime2();
      result = result * 59 + (int)($warningOnDriveTime2 >>> 32 ^ $warningOnDriveTime2);
      long $warningBreakTime1 = this.getWarningBreakTime1();
      result = result * 59 + (int)($warningBreakTime1 >>> 32 ^ $warningBreakTime1);
      long $warningBreakTime2 = this.getWarningBreakTime2();
      result = result * 59 + (int)($warningBreakTime2 >>> 32 ^ $warningBreakTime2);
      long $cycleWarningTime1 = this.getCycleWarningTime1();
      result = result * 59 + (int)($cycleWarningTime1 >>> 32 ^ $cycleWarningTime1);
      long $cycleWarningTime2 = this.getCycleWarningTime2();
      return result * 59 + (int)($cycleWarningTime2 >>> 32 ^ $cycleWarningTime2);
   }

   @Override
   public String toString() {
      return "CycleTimeRulesViewDto(cycleTime="
         + this.getCycleTime()
         + ", cycleDays="
         + this.getCycleDays()
         + ", onDutyTime="
         + this.getOnDutyTime()
         + ", onDriveTime="
         + this.getOnDriveTime()
         + ", onSleepTime="
         + this.getOnSleepTime()
         + ", continueDriveTime="
         + this.getContinueDriveTime()
         + ", breakTime="
         + this.getBreakTime()
         + ", cycleRestartTime="
         + this.getCycleRestartTime()
         + ", warningOnDutyTime1="
         + this.getWarningOnDutyTime1()
         + ", warningOnDutyTime2="
         + this.getWarningOnDutyTime2()
         + ", warningOnDriveTime1="
         + this.getWarningOnDriveTime1()
         + ", warningOnDriveTime2="
         + this.getWarningOnDriveTime2()
         + ", warningBreakTime1="
         + this.getWarningBreakTime1()
         + ", warningBreakTime2="
         + this.getWarningBreakTime2()
         + ", cycleWarningTime1="
         + this.getCycleWarningTime1()
         + ", cycleWarningTime2="
         + this.getCycleWarningTime2()
         + ")";
   }
}
