package com.mes.eld_log.models;

import java.io.Serializable;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.core.mapping.Document;

@EntityScan
@Document(
   collection = "refer_mode_master"
)
public class ReferModeMaster implements Serializable {
   private static final long serialVersionUID = 1L;
   private Integer referModeId;
   private String referModeName;
   private long clientId;
   private long addedTimestamp;
   private long updatedTimestamp;

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ReferModeMaster)) {
         return false;
      } else {
         ReferModeMaster other = (ReferModeMaster)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else if (this.getAddedTimestamp() != other.getAddedTimestamp()) {
            return false;
         } else if (this.getUpdatedTimestamp() != other.getUpdatedTimestamp()) {
            return false;
         } else {
            Object this$referModeId = this.getReferModeId();
            Object other$referModeId = other.getReferModeId();
            if (this$referModeId == null ? other$referModeId == null : this$referModeId.equals(other$referModeId)) {
               Object this$referModeName = this.getReferModeName();
               Object other$referModeName = other.getReferModeName();
               return this$referModeName == null ? other$referModeName == null : this$referModeName.equals(other$referModeName);
            } else {
               return false;
            }
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof ReferModeMaster;
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
      Object $referModeId = this.getReferModeId();
      result = result * 59 + ($referModeId == null ? 43 : $referModeId.hashCode());
      Object $referModeName = this.getReferModeName();
      return result * 59 + ($referModeName == null ? 43 : $referModeName.hashCode());
   }

   @Override
   public String toString() {
      return "ReferModeMaster(referModeId="
         + this.getReferModeId()
         + ", referModeName="
         + this.getReferModeName()
         + ", clientId="
         + this.getClientId()
         + ", addedTimestamp="
         + this.getAddedTimestamp()
         + ", updatedTimestamp="
         + this.getUpdatedTimestamp()
         + ")";
   }

   public Integer getReferModeId() {
      return this.referModeId;
   }

   public String getReferModeName() {
      return this.referModeName;
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

   public void setReferModeId(final Integer referModeId) {
      this.referModeId = referModeId;
   }

   public void setReferModeName(final String referModeName) {
      this.referModeName = referModeName;
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
