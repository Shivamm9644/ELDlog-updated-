package com.mes.eld_log.models;

import java.io.Serializable;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.core.mapping.Document;

@EntityScan
@Document(
   collection = "driver_working_status"
)
public class DriverWorkingStatus implements Serializable {
   private static final long serialVersionUID = 1L;
   private long driverId;
   private Integer shift;
   private Integer days;
   private String status;
   private String onDutyTime;
   private String onDriveTime;
   private String onSleepTime;
   private String weeklyTime;
   private String onBreak;
   private String tokenNo;
   private long receivedTimestamp;

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof DriverWorkingStatus)) {
         return false;
      } else {
         DriverWorkingStatus other = (DriverWorkingStatus)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getDriverId() != other.getDriverId()) {
            return false;
         } else if (this.getReceivedTimestamp() != other.getReceivedTimestamp()) {
            return false;
         } else {
            Object this$shift = this.getShift();
            Object other$shift = other.getShift();
            if (this$shift == null ? other$shift == null : this$shift.equals(other$shift)) {
               Object this$days = this.getDays();
               Object other$days = other.getDays();
               if (this$days == null ? other$days == null : this$days.equals(other$days)) {
                  Object this$status = this.getStatus();
                  Object other$status = other.getStatus();
                  if (this$status == null ? other$status == null : this$status.equals(other$status)) {
                     Object this$onDutyTime = this.getOnDutyTime();
                     Object other$onDutyTime = other.getOnDutyTime();
                     if (this$onDutyTime == null ? other$onDutyTime == null : this$onDutyTime.equals(other$onDutyTime)) {
                        Object this$onDriveTime = this.getOnDriveTime();
                        Object other$onDriveTime = other.getOnDriveTime();
                        if (this$onDriveTime == null ? other$onDriveTime == null : this$onDriveTime.equals(other$onDriveTime)) {
                           Object this$onSleepTime = this.getOnSleepTime();
                           Object other$onSleepTime = other.getOnSleepTime();
                           if (this$onSleepTime == null ? other$onSleepTime == null : this$onSleepTime.equals(other$onSleepTime)) {
                              Object this$weeklyTime = this.getWeeklyTime();
                              Object other$weeklyTime = other.getWeeklyTime();
                              if (this$weeklyTime == null ? other$weeklyTime == null : this$weeklyTime.equals(other$weeklyTime)) {
                                 Object this$onBreak = this.getOnBreak();
                                 Object other$onBreak = other.getOnBreak();
                                 if (this$onBreak == null ? other$onBreak == null : this$onBreak.equals(other$onBreak)) {
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
            } else {
               return false;
            }
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof DriverWorkingStatus;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $driverId = this.getDriverId();
      result = result * 59 + (int)($driverId >>> 32 ^ $driverId);
      long $receivedTimestamp = this.getReceivedTimestamp();
      result = result * 59 + (int)($receivedTimestamp >>> 32 ^ $receivedTimestamp);
      Object $shift = this.getShift();
      result = result * 59 + ($shift == null ? 43 : $shift.hashCode());
      Object $days = this.getDays();
      result = result * 59 + ($days == null ? 43 : $days.hashCode());
      Object $status = this.getStatus();
      result = result * 59 + ($status == null ? 43 : $status.hashCode());
      Object $onDutyTime = this.getOnDutyTime();
      result = result * 59 + ($onDutyTime == null ? 43 : $onDutyTime.hashCode());
      Object $onDriveTime = this.getOnDriveTime();
      result = result * 59 + ($onDriveTime == null ? 43 : $onDriveTime.hashCode());
      Object $onSleepTime = this.getOnSleepTime();
      result = result * 59 + ($onSleepTime == null ? 43 : $onSleepTime.hashCode());
      Object $weeklyTime = this.getWeeklyTime();
      result = result * 59 + ($weeklyTime == null ? 43 : $weeklyTime.hashCode());
      Object $onBreak = this.getOnBreak();
      result = result * 59 + ($onBreak == null ? 43 : $onBreak.hashCode());
      Object $tokenNo = this.getTokenNo();
      return result * 59 + ($tokenNo == null ? 43 : $tokenNo.hashCode());
   }

   @Override
   public String toString() {
      return "DriverWorkingStatus(driverId="
         + this.getDriverId()
         + ", shift="
         + this.getShift()
         + ", days="
         + this.getDays()
         + ", status="
         + this.getStatus()
         + ", onDutyTime="
         + this.getOnDutyTime()
         + ", onDriveTime="
         + this.getOnDriveTime()
         + ", onSleepTime="
         + this.getOnSleepTime()
         + ", weeklyTime="
         + this.getWeeklyTime()
         + ", onBreak="
         + this.getOnBreak()
         + ", tokenNo="
         + this.getTokenNo()
         + ", receivedTimestamp="
         + this.getReceivedTimestamp()
         + ")";
   }

   public long getDriverId() {
      return this.driverId;
   }

   public Integer getShift() {
      return this.shift;
   }

   public Integer getDays() {
      return this.days;
   }

   public String getStatus() {
      return this.status;
   }

   public String getOnDutyTime() {
      return this.onDutyTime;
   }

   public String getOnDriveTime() {
      return this.onDriveTime;
   }

   public String getOnSleepTime() {
      return this.onSleepTime;
   }

   public String getWeeklyTime() {
      return this.weeklyTime;
   }

   public String getOnBreak() {
      return this.onBreak;
   }

   public String getTokenNo() {
      return this.tokenNo;
   }

   public long getReceivedTimestamp() {
      return this.receivedTimestamp;
   }

   public void setDriverId(final long driverId) {
      this.driverId = driverId;
   }

   public void setShift(final Integer shift) {
      this.shift = shift;
   }

   public void setDays(final Integer days) {
      this.days = days;
   }

   public void setStatus(final String status) {
      this.status = status;
   }

   public void setOnDutyTime(final String onDutyTime) {
      this.onDutyTime = onDutyTime;
   }

   public void setOnDriveTime(final String onDriveTime) {
      this.onDriveTime = onDriveTime;
   }

   public void setOnSleepTime(final String onSleepTime) {
      this.onSleepTime = onSleepTime;
   }

   public void setWeeklyTime(final String weeklyTime) {
      this.weeklyTime = weeklyTime;
   }

   public void setOnBreak(final String onBreak) {
      this.onBreak = onBreak;
   }

   public void setTokenNo(final String tokenNo) {
      this.tokenNo = tokenNo;
   }

   public void setReceivedTimestamp(final long receivedTimestamp) {
      this.receivedTimestamp = receivedTimestamp;
   }
}
