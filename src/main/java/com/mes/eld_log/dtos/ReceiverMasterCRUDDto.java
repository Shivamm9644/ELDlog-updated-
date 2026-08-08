package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReceiverMasterCRUDDto {
   @JsonProperty("receiverId")
   private Integer receiverId;
   @JsonProperty("clientId")
   private long clientId;

   public Integer getReceiverId() {
      return this.receiverId;
   }

   public long getClientId() {
      return this.clientId;
   }

   @JsonProperty("receiverId")
   public void setReceiverId(final Integer receiverId) {
      this.receiverId = receiverId;
   }

   @JsonProperty("clientId")
   public void setClientId(final long clientId) {
      this.clientId = clientId;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ReceiverMasterCRUDDto)) {
         return false;
      } else {
         ReceiverMasterCRUDDto other = (ReceiverMasterCRUDDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else {
            Object this$receiverId = this.getReceiverId();
            Object other$receiverId = other.getReceiverId();
            return this$receiverId == null ? other$receiverId == null : this$receiverId.equals(other$receiverId);
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof ReceiverMasterCRUDDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $clientId = this.getClientId();
      result = result * 59 + (int)($clientId >>> 32 ^ $clientId);
      Object $receiverId = this.getReceiverId();
      return result * 59 + ($receiverId == null ? 43 : $receiverId.hashCode());
   }

   @Override
   public String toString() {
      return "ReceiverMasterCRUDDto(receiverId=" + this.getReceiverId() + ", clientId=" + this.getClientId() + ")";
   }
}
