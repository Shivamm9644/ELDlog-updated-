package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DeviceMasterCRUDDto {
   @JsonProperty("deviceId")
   private Integer deviceId;
   @JsonProperty("clientId")
   private long clientId;

   public Integer getDeviceId() {
      return this.deviceId;
   }

   public long getClientId() {
      return this.clientId;
   }

   @JsonProperty("deviceId")
   public void setDeviceId(final Integer deviceId) {
      this.deviceId = deviceId;
   }

   @JsonProperty("clientId")
   public void setClientId(final long clientId) {
      this.clientId = clientId;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof DeviceMasterCRUDDto)) {
         return false;
      } else {
         DeviceMasterCRUDDto other = (DeviceMasterCRUDDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else {
            Object this$deviceId = this.getDeviceId();
            Object other$deviceId = other.getDeviceId();
            return this$deviceId == null ? other$deviceId == null : this$deviceId.equals(other$deviceId);
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof DeviceMasterCRUDDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $clientId = this.getClientId();
      result = result * 59 + (int)($clientId >>> 32 ^ $clientId);
      Object $deviceId = this.getDeviceId();
      return result * 59 + ($deviceId == null ? 43 : $deviceId.hashCode());
   }

   @Override
   public String toString() {
      return "DeviceMasterCRUDDto(deviceId=" + this.getDeviceId() + ", clientId=" + this.getClientId() + ")";
   }
}
