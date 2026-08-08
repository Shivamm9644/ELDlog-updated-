package com.mes.eld_log.models;

import java.io.Serializable;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.core.mapping.Document;

@EntityScan
@Document(
   collection = "exception_master"
)
public class ExceptionMaster implements Serializable {
   private static final long serialVersionUID = 1L;
   private Integer exceptionId;
   private String exceptionName;
   private long maxTime;
   private long allowedCount;
   private long clientId;
   private long addedTimestamp;
   private long updatedTimestamp;

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ExceptionMaster)) {
         return false;
      } else {
         ExceptionMaster other = (ExceptionMaster)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getMaxTime() != other.getMaxTime()) {
            return false;
         } else if (this.getAllowedCount() != other.getAllowedCount()) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else if (this.getAddedTimestamp() != other.getAddedTimestamp()) {
            return false;
         } else if (this.getUpdatedTimestamp() != other.getUpdatedTimestamp()) {
            return false;
         } else {
            Object this$exceptionId = this.getExceptionId();
            Object other$exceptionId = other.getExceptionId();
            if (this$exceptionId == null ? other$exceptionId == null : this$exceptionId.equals(other$exceptionId)) {
               Object this$exceptionName = this.getExceptionName();
               Object other$exceptionName = other.getExceptionName();
               return this$exceptionName == null ? other$exceptionName == null : this$exceptionName.equals(other$exceptionName);
            } else {
               return false;
            }
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof ExceptionMaster;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $maxTime = this.getMaxTime();
      result = result * 59 + (int)($maxTime >>> 32 ^ $maxTime);
      long $allowedCount = this.getAllowedCount();
      result = result * 59 + (int)($allowedCount >>> 32 ^ $allowedCount);
      long $clientId = this.getClientId();
      result = result * 59 + (int)($clientId >>> 32 ^ $clientId);
      long $addedTimestamp = this.getAddedTimestamp();
      result = result * 59 + (int)($addedTimestamp >>> 32 ^ $addedTimestamp);
      long $updatedTimestamp = this.getUpdatedTimestamp();
      result = result * 59 + (int)($updatedTimestamp >>> 32 ^ $updatedTimestamp);
      Object $exceptionId = this.getExceptionId();
      result = result * 59 + ($exceptionId == null ? 43 : $exceptionId.hashCode());
      Object $exceptionName = this.getExceptionName();
      return result * 59 + ($exceptionName == null ? 43 : $exceptionName.hashCode());
   }

   @Override
   public String toString() {
      return "ExceptionMaster(exceptionId="
         + this.getExceptionId()
         + ", exceptionName="
         + this.getExceptionName()
         + ", maxTime="
         + this.getMaxTime()
         + ", allowedCount="
         + this.getAllowedCount()
         + ", clientId="
         + this.getClientId()
         + ", addedTimestamp="
         + this.getAddedTimestamp()
         + ", updatedTimestamp="
         + this.getUpdatedTimestamp()
         + ")";
   }

   public Integer getExceptionId() {
      return this.exceptionId;
   }

   public String getExceptionName() {
      return this.exceptionName;
   }

   public long getMaxTime() {
      return this.maxTime;
   }

   public long getAllowedCount() {
      return this.allowedCount;
   }

   public long getClientId() {
      return this.clientId;
   }

   public long getAddedTimestamp() {
      return this.addedTimestamp;
   }

   public long getUpdatedTimestamp() {
      return this.updatedTimestamp;
   }

   public void setExceptionId(final Integer exceptionId) {
      this.exceptionId = exceptionId;
   }

   public void setExceptionName(final String exceptionName) {
      this.exceptionName = exceptionName;
   }

   public void setMaxTime(final long maxTime) {
      this.maxTime = maxTime;
   }

   public void setAllowedCount(final long allowedCount) {
      this.allowedCount = allowedCount;
   }

   public void setClientId(final long clientId) {
      this.clientId = clientId;
   }

   public void setAddedTimestamp(final long addedTimestamp) {
      this.addedTimestamp = addedTimestamp;
   }

   public void setUpdatedTimestamp(final long updatedTimestamp) {
      this.updatedTimestamp = updatedTimestamp;
   }
}
