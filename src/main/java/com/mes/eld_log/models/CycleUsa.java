package com.mes.eld_log.models;

import java.io.Serializable;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.core.mapping.Document;

@EntityScan
@Document(
   collection = "cycle_usa_master"
)
public class CycleUsa implements Serializable {
   private static final long serialVersionUID = 1L;
   private Integer cycleUsaId;
   private String cycleUsaName;
   private long countryId;
   private long stateId;
   private long clientId;
   private long cycleHour;
   private long cycleDays;
   private long onDutyTime;
   private long onDriveTime;
   private long onSleepTime;
   private long continueDriveTime;
   private long breakTime;
   private long cycleRestartTime;
   private long warningTime1;
   private long warningTime2;
   private long cycleWarningTime1;
   private long cycleWarningTime2;
   private long addedTimestamp;
   private long updatedTimestamp;

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof CycleUsa)) {
         return false;
      } else {
         CycleUsa other = (CycleUsa)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getCountryId() != other.getCountryId()) {
            return false;
         } else if (this.getStateId() != other.getStateId()) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else if (this.getCycleHour() != other.getCycleHour()) {
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
         } else if (this.getWarningTime1() != other.getWarningTime1()) {
            return false;
         } else if (this.getWarningTime2() != other.getWarningTime2()) {
            return false;
         } else if (this.getCycleWarningTime1() != other.getCycleWarningTime1()) {
            return false;
         } else if (this.getCycleWarningTime2() != other.getCycleWarningTime2()) {
            return false;
         } else if (this.getAddedTimestamp() != other.getAddedTimestamp()) {
            return false;
         } else if (this.getUpdatedTimestamp() != other.getUpdatedTimestamp()) {
            return false;
         } else {
            Object this$cycleUsaId = this.getCycleUsaId();
            Object other$cycleUsaId = other.getCycleUsaId();
            if (this$cycleUsaId == null ? other$cycleUsaId == null : this$cycleUsaId.equals(other$cycleUsaId)) {
               Object this$cycleUsaName = this.getCycleUsaName();
               Object other$cycleUsaName = other.getCycleUsaName();
               return this$cycleUsaName == null ? other$cycleUsaName == null : this$cycleUsaName.equals(other$cycleUsaName);
            } else {
               return false;
            }
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof CycleUsa;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $countryId = this.getCountryId();
      result = result * 59 + (int)($countryId >>> 32 ^ $countryId);
      long $stateId = this.getStateId();
      result = result * 59 + (int)($stateId >>> 32 ^ $stateId);
      long $clientId = this.getClientId();
      result = result * 59 + (int)($clientId >>> 32 ^ $clientId);
      long $cycleHour = this.getCycleHour();
      result = result * 59 + (int)($cycleHour >>> 32 ^ $cycleHour);
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
      long $warningTime1 = this.getWarningTime1();
      result = result * 59 + (int)($warningTime1 >>> 32 ^ $warningTime1);
      long $warningTime2 = this.getWarningTime2();
      result = result * 59 + (int)($warningTime2 >>> 32 ^ $warningTime2);
      long $cycleWarningTime1 = this.getCycleWarningTime1();
      result = result * 59 + (int)($cycleWarningTime1 >>> 32 ^ $cycleWarningTime1);
      long $cycleWarningTime2 = this.getCycleWarningTime2();
      result = result * 59 + (int)($cycleWarningTime2 >>> 32 ^ $cycleWarningTime2);
      long $addedTimestamp = this.getAddedTimestamp();
      result = result * 59 + (int)($addedTimestamp >>> 32 ^ $addedTimestamp);
      long $updatedTimestamp = this.getUpdatedTimestamp();
      result = result * 59 + (int)($updatedTimestamp >>> 32 ^ $updatedTimestamp);
      Object $cycleUsaId = this.getCycleUsaId();
      result = result * 59 + ($cycleUsaId == null ? 43 : $cycleUsaId.hashCode());
      Object $cycleUsaName = this.getCycleUsaName();
      return result * 59 + ($cycleUsaName == null ? 43 : $cycleUsaName.hashCode());
   }

   @Override
   public String toString() {
      return "CycleUsa(cycleUsaId="
         + this.getCycleUsaId()
         + ", cycleUsaName="
         + this.getCycleUsaName()
         + ", countryId="
         + this.getCountryId()
         + ", stateId="
         + this.getStateId()
         + ", clientId="
         + this.getClientId()
         + ", cycleHour="
         + this.getCycleHour()
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
         + ", warningTime1="
         + this.getWarningTime1()
         + ", warningTime2="
         + this.getWarningTime2()
         + ", cycleWarningTime1="
         + this.getCycleWarningTime1()
         + ", cycleWarningTime2="
         + this.getCycleWarningTime2()
         + ", addedTimestamp="
         + this.getAddedTimestamp()
         + ", updatedTimestamp="
         + this.getUpdatedTimestamp()
         + ")";
   }

   public Integer getCycleUsaId() {
      return this.cycleUsaId;
   }

   public String getCycleUsaName() {
      return this.cycleUsaName;
   }

   public long getCountryId() {
      return this.countryId;
   }

   public long getStateId() {
      return this.stateId;
   }

   public long getClientId() {
      return this.clientId;
   }

   public long getCycleHour() {
      return this.cycleHour;
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

   public long getWarningTime1() {
      return this.warningTime1;
   }

   public long getWarningTime2() {
      return this.warningTime2;
   }

   public long getCycleWarningTime1() {
      return this.cycleWarningTime1;
   }

   public long getCycleWarningTime2() {
      return this.cycleWarningTime2;
   }

   public long getAddedTimestamp() {
      return this.addedTimestamp;
   }

   public long getUpdatedTimestamp() {
      return this.updatedTimestamp;
   }

   public void setCycleUsaId(final Integer cycleUsaId) {
      this.cycleUsaId = cycleUsaId;
   }

   public void setCycleUsaName(final String cycleUsaName) {
      this.cycleUsaName = cycleUsaName;
   }

   public void setCountryId(final long countryId) {
      this.countryId = countryId;
   }

   public void setStateId(final long stateId) {
      this.stateId = stateId;
   }

   public void setClientId(final long clientId) {
      this.clientId = clientId;
   }

   public void setCycleHour(final long cycleHour) {
      this.cycleHour = cycleHour;
   }

   public void setCycleDays(final long cycleDays) {
      this.cycleDays = cycleDays;
   }

   public void setOnDutyTime(final long onDutyTime) {
      this.onDutyTime = onDutyTime;
   }

   public void setOnDriveTime(final long onDriveTime) {
      this.onDriveTime = onDriveTime;
   }

   public void setOnSleepTime(final long onSleepTime) {
      this.onSleepTime = onSleepTime;
   }

   public void setContinueDriveTime(final long continueDriveTime) {
      this.continueDriveTime = continueDriveTime;
   }

   public void setBreakTime(final long breakTime) {
      this.breakTime = breakTime;
   }

   public void setCycleRestartTime(final long cycleRestartTime) {
      this.cycleRestartTime = cycleRestartTime;
   }

   public void setWarningTime1(final long warningTime1) {
      this.warningTime1 = warningTime1;
   }

   public void setWarningTime2(final long warningTime2) {
      this.warningTime2 = warningTime2;
   }

   public void setCycleWarningTime1(final long cycleWarningTime1) {
      this.cycleWarningTime1 = cycleWarningTime1;
   }

   public void setCycleWarningTime2(final long cycleWarningTime2) {
      this.cycleWarningTime2 = cycleWarningTime2;
   }

   public void setAddedTimestamp(final long addedTimestamp) {
      this.addedTimestamp = addedTimestamp;
   }

   public void setUpdatedTimestamp(final long updatedTimestamp) {
      this.updatedTimestamp = updatedTimestamp;
   }
}
