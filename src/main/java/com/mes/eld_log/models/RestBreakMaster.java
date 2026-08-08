package com.mes.eld_log.models;

import java.io.Serializable;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.core.mapping.Document;

@EntityScan
@Document(
   collection = "rest_break_master"
)
public class RestBreakMaster implements Serializable {
   private static final long serialVersionUID = 1L;
   private Integer restBreakId;
   private String restBreakName;
   private long clientId;
   private long addedTimestamp;
   private long updatedTimestamp;

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof RestBreakMaster)) {
         return false;
      } else {
         RestBreakMaster other = (RestBreakMaster)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else if (this.getAddedTimestamp() != other.getAddedTimestamp()) {
            return false;
         } else if (this.getUpdatedTimestamp() != other.getUpdatedTimestamp()) {
            return false;
         } else {
            Object this$restBreakId = this.getRestBreakId();
            Object other$restBreakId = other.getRestBreakId();
            if (this$restBreakId == null ? other$restBreakId == null : this$restBreakId.equals(other$restBreakId)) {
               Object this$restBreakName = this.getRestBreakName();
               Object other$restBreakName = other.getRestBreakName();
               return this$restBreakName == null ? other$restBreakName == null : this$restBreakName.equals(other$restBreakName);
            } else {
               return false;
            }
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof RestBreakMaster;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $clientId = this.getClientId();
      result = result * 59 + (int)($clientId >>> 32 ^ $clientId);
      long $addedTimestamp = this.getAddedTimestamp();
      result = result * 59 + (int)($addedTimestamp >>> 32 ^ $addedTimestamp);
      long $updatedTimestamp = this.getUpdatedTimestamp();
      result = result * 59 + (int)($updatedTimestamp >>> 32 ^ $updatedTimestamp);
      Object $restBreakId = this.getRestBreakId();
      result = result * 59 + ($restBreakId == null ? 43 : $restBreakId.hashCode());
      Object $restBreakName = this.getRestBreakName();
      return result * 59 + ($restBreakName == null ? 43 : $restBreakName.hashCode());
   }

   @Override
   public String toString() {
      return "RestBreakMaster(restBreakId="
         + this.getRestBreakId()
         + ", restBreakName="
         + this.getRestBreakName()
         + ", clientId="
         + this.getClientId()
         + ", addedTimestamp="
         + this.getAddedTimestamp()
         + ", updatedTimestamp="
         + this.getUpdatedTimestamp()
         + ")";
   }

   public Integer getRestBreakId() {
      return this.restBreakId;
   }

   public String getRestBreakName() {
      return this.restBreakName;
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

   public void setRestBreakId(final Integer restBreakId) {
      this.restBreakId = restBreakId;
   }

   public void setRestBreakName(final String restBreakName) {
      this.restBreakName = restBreakName;
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
