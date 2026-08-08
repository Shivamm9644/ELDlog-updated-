package com.mes.eld_log.models;

import java.io.Serializable;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.core.mapping.Document;

@EntityScan
@Document(
   collection = "split_log"
)
public class SplitLog implements Serializable {
   private static final long serialVersionUID = 1L;
   private Integer dbId;
   private String status;
   private String splitTiming;
   private long driverId;
   private Integer shift;
   private Integer day;
   private long updatedTimestamp;

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof SplitLog)) {
         return false;
      } else {
         SplitLog other = (SplitLog)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getDriverId() != other.getDriverId()) {
            return false;
         } else if (this.getUpdatedTimestamp() != other.getUpdatedTimestamp()) {
            return false;
         } else {
            Object this$dbId = this.getDbId();
            Object other$dbId = other.getDbId();
            if (this$dbId == null ? other$dbId == null : this$dbId.equals(other$dbId)) {
               Object this$shift = this.getShift();
               Object other$shift = other.getShift();
               if (this$shift == null ? other$shift == null : this$shift.equals(other$shift)) {
                  Object this$day = this.getDay();
                  Object other$day = other.getDay();
                  if (this$day == null ? other$day == null : this$day.equals(other$day)) {
                     Object this$status = this.getStatus();
                     Object other$status = other.getStatus();
                     if (this$status == null ? other$status == null : this$status.equals(other$status)) {
                        Object this$splitTiming = this.getSplitTiming();
                        Object other$splitTiming = other.getSplitTiming();
                        return this$splitTiming == null ? other$splitTiming == null : this$splitTiming.equals(other$splitTiming);
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
      return other instanceof SplitLog;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $driverId = this.getDriverId();
      result = result * 59 + (int)($driverId >>> 32 ^ $driverId);
      long $updatedTimestamp = this.getUpdatedTimestamp();
      result = result * 59 + (int)($updatedTimestamp >>> 32 ^ $updatedTimestamp);
      Object $dbId = this.getDbId();
      result = result * 59 + ($dbId == null ? 43 : $dbId.hashCode());
      Object $shift = this.getShift();
      result = result * 59 + ($shift == null ? 43 : $shift.hashCode());
      Object $day = this.getDay();
      result = result * 59 + ($day == null ? 43 : $day.hashCode());
      Object $status = this.getStatus();
      result = result * 59 + ($status == null ? 43 : $status.hashCode());
      Object $splitTiming = this.getSplitTiming();
      return result * 59 + ($splitTiming == null ? 43 : $splitTiming.hashCode());
   }

   @Override
   public String toString() {
      return "SplitLog(dbId="
         + this.getDbId()
         + ", status="
         + this.getStatus()
         + ", splitTiming="
         + this.getSplitTiming()
         + ", driverId="
         + this.getDriverId()
         + ", shift="
         + this.getShift()
         + ", day="
         + this.getDay()
         + ", updatedTimestamp="
         + this.getUpdatedTimestamp()
         + ")";
   }

   public Integer getDbId() {
      return this.dbId;
   }

   public String getStatus() {
      return this.status;
   }

   public String getSplitTiming() {
      return this.splitTiming;
   }

   public long getDriverId() {
      return this.driverId;
   }

   public Integer getShift() {
      return this.shift;
   }

   public Integer getDay() {
      return this.day;
   }

   public long getUpdatedTimestamp() {
      return this.updatedTimestamp;
   }

   public void setDbId(final Integer dbId) {
      this.dbId = dbId;
   }

   public void setStatus(final String status) {
      this.status = status;
   }

   public void setSplitTiming(final String splitTiming) {
      this.splitTiming = splitTiming;
   }

   public void setDriverId(final long driverId) {
      this.driverId = driverId;
   }

   public void setShift(final Integer shift) {
      this.shift = shift;
   }

   public void setDay(final Integer day) {
      this.day = day;
   }

   public void setUpdatedTimestamp(final long updatedTimestamp) {
      this.updatedTimestamp = updatedTimestamp;
   }
}
