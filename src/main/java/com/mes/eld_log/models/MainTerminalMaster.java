package com.mes.eld_log.models;

import java.io.Serializable;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.core.mapping.Document;

@EntityScan
@Document(
   collection = "main_terminal_master"
)
public class MainTerminalMaster implements Serializable {
   private static final long serialVersionUID = 1L;
   private Integer mainTerminalId;
   private String mainTerminalName;
   private long clientId;
   private long stateId;
   private long addedTimestamp;
   private long updatedTimestamp;

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof MainTerminalMaster)) {
         return false;
      } else {
         MainTerminalMaster other = (MainTerminalMaster)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else if (this.getStateId() != other.getStateId()) {
            return false;
         } else if (this.getAddedTimestamp() != other.getAddedTimestamp()) {
            return false;
         } else if (this.getUpdatedTimestamp() != other.getUpdatedTimestamp()) {
            return false;
         } else {
            Object this$mainTerminalId = this.getMainTerminalId();
            Object other$mainTerminalId = other.getMainTerminalId();
            if (this$mainTerminalId == null ? other$mainTerminalId == null : this$mainTerminalId.equals(other$mainTerminalId)) {
               Object this$mainTerminalName = this.getMainTerminalName();
               Object other$mainTerminalName = other.getMainTerminalName();
               return this$mainTerminalName == null ? other$mainTerminalName == null : this$mainTerminalName.equals(other$mainTerminalName);
            } else {
               return false;
            }
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof MainTerminalMaster;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $clientId = this.getClientId();
      result = result * 59 + (int)($clientId >>> 32 ^ $clientId);
      long $stateId = this.getStateId();
      result = result * 59 + (int)($stateId >>> 32 ^ $stateId);
      long $addedTimestamp = this.getAddedTimestamp();
      result = result * 59 + (int)($addedTimestamp >>> 32 ^ $addedTimestamp);
      long $updatedTimestamp = this.getUpdatedTimestamp();
      result = result * 59 + (int)($updatedTimestamp >>> 32 ^ $updatedTimestamp);
      Object $mainTerminalId = this.getMainTerminalId();
      result = result * 59 + ($mainTerminalId == null ? 43 : $mainTerminalId.hashCode());
      Object $mainTerminalName = this.getMainTerminalName();
      return result * 59 + ($mainTerminalName == null ? 43 : $mainTerminalName.hashCode());
   }

   @Override
   public String toString() {
      return "MainTerminalMaster(mainTerminalId="
         + this.getMainTerminalId()
         + ", mainTerminalName="
         + this.getMainTerminalName()
         + ", clientId="
         + this.getClientId()
         + ", stateId="
         + this.getStateId()
         + ", addedTimestamp="
         + this.getAddedTimestamp()
         + ", updatedTimestamp="
         + this.getUpdatedTimestamp()
         + ")";
   }

   public Integer getMainTerminalId() {
      return this.mainTerminalId;
   }

   public String getMainTerminalName() {
      return this.mainTerminalName;
   }

   public long getClientId() {
      return this.clientId;
   }

   public long getStateId() {
      return this.stateId;
   }

   public long getAddedTimestamp() {
      return this.addedTimestamp;
   }

   public long getUpdatedTimestamp() {
      return this.updatedTimestamp;
   }

   public void setMainTerminalId(final Integer mainTerminalId) {
      this.mainTerminalId = mainTerminalId;
   }

   public void setMainTerminalName(final String mainTerminalName) {
      this.mainTerminalName = mainTerminalName;
   }

   public void setClientId(final long clientId) {
      this.clientId = clientId;
   }

   public void setStateId(final long stateId) {
      this.stateId = stateId;
   }

   public void setAddedTimestamp(final long addedTimestamp) {
      this.addedTimestamp = addedTimestamp;
   }

   public void setUpdatedTimestamp(final long updatedTimestamp) {
      this.updatedTimestamp = updatedTimestamp;
   }
}
