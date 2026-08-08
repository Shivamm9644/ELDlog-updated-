package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mes.eld_log.models.DriveringStatus;
import com.mes.eld_log.models.ELDLogData;
import com.mes.eld_log.models.SplitLog;
import java.util.ArrayList;

public class AddDriveringStatusDto {
   @JsonProperty("driveringStatusData")
   private ArrayList<DriveringStatus> driveringStatusData;
   @JsonProperty("eldLogData")
   private ArrayList<ELDLogData> eldLogData;
   @JsonProperty("splitLog")
   private SplitLog splitLog;

   public ArrayList<DriveringStatus> getDriveringStatusData() {
      return this.driveringStatusData;
   }

   public ArrayList<ELDLogData> getEldLogData() {
      return this.eldLogData;
   }

   public SplitLog getSplitLog() {
      return this.splitLog;
   }

   @JsonProperty("driveringStatusData")
   public void setDriveringStatusData(final ArrayList<DriveringStatus> driveringStatusData) {
      this.driveringStatusData = driveringStatusData;
   }

   @JsonProperty("eldLogData")
   public void setEldLogData(final ArrayList<ELDLogData> eldLogData) {
      this.eldLogData = eldLogData;
   }

   @JsonProperty("splitLog")
   public void setSplitLog(final SplitLog splitLog) {
      this.splitLog = splitLog;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof AddDriveringStatusDto)) {
         return false;
      } else {
         AddDriveringStatusDto other = (AddDriveringStatusDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$driveringStatusData = this.getDriveringStatusData();
            Object other$driveringStatusData = other.getDriveringStatusData();
            if (this$driveringStatusData == null ? other$driveringStatusData == null : this$driveringStatusData.equals(other$driveringStatusData)) {
               Object this$eldLogData = this.getEldLogData();
               Object other$eldLogData = other.getEldLogData();
               if (this$eldLogData == null ? other$eldLogData == null : this$eldLogData.equals(other$eldLogData)) {
                  Object this$splitLog = this.getSplitLog();
                  Object other$splitLog = other.getSplitLog();
                  return this$splitLog == null ? other$splitLog == null : this$splitLog.equals(other$splitLog);
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
      return other instanceof AddDriveringStatusDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $driveringStatusData = this.getDriveringStatusData();
      result = result * 59 + ($driveringStatusData == null ? 43 : $driveringStatusData.hashCode());
      Object $eldLogData = this.getEldLogData();
      result = result * 59 + ($eldLogData == null ? 43 : $eldLogData.hashCode());
      Object $splitLog = this.getSplitLog();
      return result * 59 + ($splitLog == null ? 43 : $splitLog.hashCode());
   }

   @Override
   public String toString() {
      return "AddDriveringStatusDto(driveringStatusData="
         + this.getDriveringStatusData()
         + ", eldLogData="
         + this.getEldLogData()
         + ", splitLog="
         + this.getSplitLog()
         + ")";
   }
}
