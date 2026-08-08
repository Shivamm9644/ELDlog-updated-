package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserTypeMasterCRUDDto {
   @JsonProperty("userTypeId")
   private Integer userTypeId;
   @JsonProperty("clientId")
   private long clientId;

   public Integer getUserTypeId() {
      return this.userTypeId;
   }

   public long getClientId() {
      return this.clientId;
   }

   @JsonProperty("userTypeId")
   public void setUserTypeId(final Integer userTypeId) {
      this.userTypeId = userTypeId;
   }

   @JsonProperty("clientId")
   public void setClientId(final long clientId) {
      this.clientId = clientId;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof UserTypeMasterCRUDDto)) {
         return false;
      } else {
         UserTypeMasterCRUDDto other = (UserTypeMasterCRUDDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else {
            Object this$userTypeId = this.getUserTypeId();
            Object other$userTypeId = other.getUserTypeId();
            return this$userTypeId == null ? other$userTypeId == null : this$userTypeId.equals(other$userTypeId);
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof UserTypeMasterCRUDDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $clientId = this.getClientId();
      result = result * 59 + (int)($clientId >>> 32 ^ $clientId);
      Object $userTypeId = this.getUserTypeId();
      return result * 59 + ($userTypeId == null ? 43 : $userTypeId.hashCode());
   }

   @Override
   public String toString() {
      return "UserTypeMasterCRUDDto(userTypeId=" + this.getUserTypeId() + ", clientId=" + this.getClientId() + ")";
   }
}
