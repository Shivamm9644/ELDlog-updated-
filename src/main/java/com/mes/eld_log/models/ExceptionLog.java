package com.mes.eld_log.models;

import java.io.Serializable;
import java.util.ArrayList;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.core.mapping.Document;

@EntityScan
@Document(
   collection = "exception_log"
)
public class ExceptionLog implements Serializable {
   private static final long serialVersionUID = 1L;
   private ArrayList exceptionIdList;
   private long driverId;
   private String tokenNo;
   private String reason;
   private long addedTimestamp;
   private long updatedTimestamp;

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ExceptionLog)) {
         return false;
      } else {
         ExceptionLog other = (ExceptionLog)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getDriverId() != other.getDriverId()) {
            return false;
         } else if (this.getAddedTimestamp() != other.getAddedTimestamp()) {
            return false;
         } else if (this.getUpdatedTimestamp() != other.getUpdatedTimestamp()) {
            return false;
         } else {
            Object this$exceptionIdList = this.getExceptionIdList();
            Object other$exceptionIdList = other.getExceptionIdList();
            if (this$exceptionIdList == null ? other$exceptionIdList == null : this$exceptionIdList.equals(other$exceptionIdList)) {
               Object this$tokenNo = this.getTokenNo();
               Object other$tokenNo = other.getTokenNo();
               if (this$tokenNo == null ? other$tokenNo == null : this$tokenNo.equals(other$tokenNo)) {
                  Object this$reason = this.getReason();
                  Object other$reason = other.getReason();
                  return this$reason == null ? other$reason == null : this$reason.equals(other$reason);
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
      return other instanceof ExceptionLog;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $driverId = this.getDriverId();
      result = result * 59 + (int)($driverId >>> 32 ^ $driverId);
      long $addedTimestamp = this.getAddedTimestamp();
      result = result * 59 + (int)($addedTimestamp >>> 32 ^ $addedTimestamp);
      long $updatedTimestamp = this.getUpdatedTimestamp();
      result = result * 59 + (int)($updatedTimestamp >>> 32 ^ $updatedTimestamp);
      Object $exceptionIdList = this.getExceptionIdList();
      result = result * 59 + ($exceptionIdList == null ? 43 : $exceptionIdList.hashCode());
      Object $tokenNo = this.getTokenNo();
      result = result * 59 + ($tokenNo == null ? 43 : $tokenNo.hashCode());
      Object $reason = this.getReason();
      return result * 59 + ($reason == null ? 43 : $reason.hashCode());
   }

   @Override
   public String toString() {
      return "ExceptionLog(exceptionIdList="
         + this.getExceptionIdList()
         + ", driverId="
         + this.getDriverId()
         + ", tokenNo="
         + this.getTokenNo()
         + ", reason="
         + this.getReason()
         + ", addedTimestamp="
         + this.getAddedTimestamp()
         + ", updatedTimestamp="
         + this.getUpdatedTimestamp()
         + ")";
   }

   public ArrayList getExceptionIdList() {
      return this.exceptionIdList;
   }

   public long getDriverId() {
      return this.driverId;
   }

   public String getTokenNo() {
      return this.tokenNo;
   }

   public String getReason() {
      return this.reason;
   }

   public long getAddedTimestamp() {
      return this.addedTimestamp;
   }

   public long getUpdatedTimestamp() {
      return this.updatedTimestamp;
   }

   public void setExceptionIdList(final ArrayList exceptionIdList) {
      this.exceptionIdList = exceptionIdList;
   }

   public void setDriverId(final long driverId) {
      this.driverId = driverId;
   }

   public void setTokenNo(final String tokenNo) {
      this.tokenNo = tokenNo;
   }

   public void setReason(final String reason) {
      this.reason = reason;
   }

   public void setAddedTimestamp(final long addedTimestamp) {
      this.addedTimestamp = addedTimestamp;
   }

   public void setUpdatedTimestamp(final long updatedTimestamp) {
      this.updatedTimestamp = updatedTimestamp;
   }
}
