package com.mes.eld_log.models;

import java.io.Serializable;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.core.mapping.Document;

@EntityScan
@Document(
   collection = "restart_master"
)
public class RestartMaster implements Serializable {
   private static final long serialVersionUID = 1L;
   private Integer restartId;
   private String restartName;
   private long clientId;
   private long addedTimestamp;
   private long updatedTimestamp;

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof RestartMaster)) {
         return false;
      } else {
         RestartMaster other = (RestartMaster)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else if (this.getAddedTimestamp() != other.getAddedTimestamp()) {
            return false;
         } else if (this.getUpdatedTimestamp() != other.getUpdatedTimestamp()) {
            return false;
         } else {
            Object this$restartId = this.getRestartId();
            Object other$restartId = other.getRestartId();
            if (this$restartId == null ? other$restartId == null : this$restartId.equals(other$restartId)) {
               Object this$restartName = this.getRestartName();
               Object other$restartName = other.getRestartName();
               return this$restartName == null ? other$restartName == null : this$restartName.equals(other$restartName);
            } else {
               return false;
            }
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof RestartMaster;
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
      Object $restartId = this.getRestartId();
      result = result * 59 + ($restartId == null ? 43 : $restartId.hashCode());
      Object $restartName = this.getRestartName();
      return result * 59 + ($restartName == null ? 43 : $restartName.hashCode());
   }

   @Override
   public String toString() {
      return "RestartMaster(restartId="
         + this.getRestartId()
         + ", restartName="
         + this.getRestartName()
         + ", clientId="
         + this.getClientId()
         + ", addedTimestamp="
         + this.getAddedTimestamp()
         + ", updatedTimestamp="
         + this.getUpdatedTimestamp()
         + ")";
   }

   public Integer getRestartId() {
      return this.restartId;
   }

   public String getRestartName() {
      return this.restartName;
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

   public void setRestartId(final Integer restartId) {
      this.restartId = restartId;
   }

   public void setRestartName(final String restartName) {
      this.restartName = restartName;
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
