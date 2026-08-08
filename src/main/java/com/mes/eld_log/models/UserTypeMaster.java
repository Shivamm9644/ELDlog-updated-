package com.mes.eld_log.models;

import java.io.Serializable;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.core.mapping.Document;

@EntityScan
@Document(
   collection = "user_type_master"
)
public class UserTypeMaster implements Serializable {
   private static final long serialVersionUID = 1L;
   private Integer userTypeId;
   private String userTypeName;
   private long clientId;
   private long addedTimestamp;
   private long updatedTimestamp;

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof UserTypeMaster)) {
         return false;
      } else {
         UserTypeMaster other = (UserTypeMaster)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else if (this.getAddedTimestamp() != other.getAddedTimestamp()) {
            return false;
         } else if (this.getUpdatedTimestamp() != other.getUpdatedTimestamp()) {
            return false;
         } else {
            Object this$userTypeId = this.getUserTypeId();
            Object other$userTypeId = other.getUserTypeId();
            if (this$userTypeId == null ? other$userTypeId == null : this$userTypeId.equals(other$userTypeId)) {
               Object this$userTypeName = this.getUserTypeName();
               Object other$userTypeName = other.getUserTypeName();
               return this$userTypeName == null ? other$userTypeName == null : this$userTypeName.equals(other$userTypeName);
            } else {
               return false;
            }
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof UserTypeMaster;
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
      Object $userTypeId = this.getUserTypeId();
      result = result * 59 + ($userTypeId == null ? 43 : $userTypeId.hashCode());
      Object $userTypeName = this.getUserTypeName();
      return result * 59 + ($userTypeName == null ? 43 : $userTypeName.hashCode());
   }

   @Override
   public String toString() {
      return "UserTypeMaster(userTypeId="
         + this.getUserTypeId()
         + ", userTypeName="
         + this.getUserTypeName()
         + ", clientId="
         + this.getClientId()
         + ", addedTimestamp="
         + this.getAddedTimestamp()
         + ", updatedTimestamp="
         + this.getUpdatedTimestamp()
         + ")";
   }

   public Integer getUserTypeId() {
      return this.userTypeId;
   }

   public String getUserTypeName() {
      return this.userTypeName;
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

   public void setUserTypeId(final Integer userTypeId) {
      this.userTypeId = userTypeId;
   }

   public void setUserTypeName(final String userTypeName) {
      this.userTypeName = userTypeName;
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
