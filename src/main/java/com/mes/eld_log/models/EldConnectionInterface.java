package com.mes.eld_log.models;

import java.io.Serializable;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.core.mapping.Document;

@EntityScan
@Document(
   collection = "eld_connection_interface"
)
public class EldConnectionInterface implements Serializable {
   private static final long serialVersionUID = 1L;
   private Integer eldConnectionInterfaceId;
   private String eldConnectionInterfaceName;
   private long addedTimestamp;
   private long updatedTimestamp;

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof EldConnectionInterface)) {
         return false;
      } else {
         EldConnectionInterface other = (EldConnectionInterface)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getAddedTimestamp() != other.getAddedTimestamp()) {
            return false;
         } else if (this.getUpdatedTimestamp() != other.getUpdatedTimestamp()) {
            return false;
         } else {
            Object this$eldConnectionInterfaceId = this.getEldConnectionInterfaceId();
            Object other$eldConnectionInterfaceId = other.getEldConnectionInterfaceId();
            if (this$eldConnectionInterfaceId == null
               ? other$eldConnectionInterfaceId == null
               : this$eldConnectionInterfaceId.equals(other$eldConnectionInterfaceId)) {
               Object this$eldConnectionInterfaceName = this.getEldConnectionInterfaceName();
               Object other$eldConnectionInterfaceName = other.getEldConnectionInterfaceName();
               return this$eldConnectionInterfaceName == null
                  ? other$eldConnectionInterfaceName == null
                  : this$eldConnectionInterfaceName.equals(other$eldConnectionInterfaceName);
            } else {
               return false;
            }
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof EldConnectionInterface;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $addedTimestamp = this.getAddedTimestamp();
      result = result * 59 + (int)($addedTimestamp >>> 32 ^ $addedTimestamp);
      long $updatedTimestamp = this.getUpdatedTimestamp();
      result = result * 59 + (int)($updatedTimestamp >>> 32 ^ $updatedTimestamp);
      Object $eldConnectionInterfaceId = this.getEldConnectionInterfaceId();
      result = result * 59 + ($eldConnectionInterfaceId == null ? 43 : $eldConnectionInterfaceId.hashCode());
      Object $eldConnectionInterfaceName = this.getEldConnectionInterfaceName();
      return result * 59 + ($eldConnectionInterfaceName == null ? 43 : $eldConnectionInterfaceName.hashCode());
   }

   @Override
   public String toString() {
      return "EldConnectionInterface(eldConnectionInterfaceId="
         + this.getEldConnectionInterfaceId()
         + ", eldConnectionInterfaceName="
         + this.getEldConnectionInterfaceName()
         + ", addedTimestamp="
         + this.getAddedTimestamp()
         + ", updatedTimestamp="
         + this.getUpdatedTimestamp()
         + ")";
   }

   public Integer getEldConnectionInterfaceId() {
      return this.eldConnectionInterfaceId;
   }

   public String getEldConnectionInterfaceName() {
      return this.eldConnectionInterfaceName;
   }

   public long getAddedTimestamp() {
      return this.addedTimestamp;
   }

   public long getUpdatedTimestamp() {
      return this.updatedTimestamp;
   }

   public void setEldConnectionInterfaceId(final Integer eldConnectionInterfaceId) {
      this.eldConnectionInterfaceId = eldConnectionInterfaceId;
   }

   public void setEldConnectionInterfaceName(final String eldConnectionInterfaceName) {
      this.eldConnectionInterfaceName = eldConnectionInterfaceName;
   }

   public void setAddedTimestamp(final long addedTimestamp) {
      this.addedTimestamp = addedTimestamp;
   }

   public void setUpdatedTimestamp(final long updatedTimestamp) {
      this.updatedTimestamp = updatedTimestamp;
   }
}
