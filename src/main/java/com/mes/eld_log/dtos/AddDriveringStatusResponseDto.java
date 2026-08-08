package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AddDriveringStatusResponseDto {
   @JsonProperty("localId")
   private String localId;
   @JsonProperty("serverId")
   private String serverId;

   public String getLocalId() {
      return this.localId;
   }

   public String getServerId() {
      return this.serverId;
   }

   @JsonProperty("localId")
   public void setLocalId(final String localId) {
      this.localId = localId;
   }

   @JsonProperty("serverId")
   public void setServerId(final String serverId) {
      this.serverId = serverId;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof AddDriveringStatusResponseDto)) {
         return false;
      } else {
         AddDriveringStatusResponseDto other = (AddDriveringStatusResponseDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$localId = this.getLocalId();
            Object other$localId = other.getLocalId();
            if (this$localId == null ? other$localId == null : this$localId.equals(other$localId)) {
               Object this$serverId = this.getServerId();
               Object other$serverId = other.getServerId();
               return this$serverId == null ? other$serverId == null : this$serverId.equals(other$serverId);
            } else {
               return false;
            }
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof AddDriveringStatusResponseDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $localId = this.getLocalId();
      result = result * 59 + ($localId == null ? 43 : $localId.hashCode());
      Object $serverId = this.getServerId();
      return result * 59 + ($serverId == null ? 43 : $serverId.hashCode());
   }

   @Override
   public String toString() {
      return "AddDriveringStatusResponseDto(localId=" + this.getLocalId() + ", serverId=" + this.getServerId() + ")";
   }
}
