package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DeviceModalMasterCRUDDto {
   @JsonProperty("deviceModalId")
   private Integer deviceModalId;
   @JsonProperty("clientId")
   private long clientId;

   public Integer getDeviceModalId() {
      return this.deviceModalId;
   }

   public long getClientId() {
      return this.clientId;
   }

   @JsonProperty("deviceModalId")
   public void setDeviceModalId(final Integer deviceModalId) {
      this.deviceModalId = deviceModalId;
   }

   @JsonProperty("clientId")
   public void setClientId(final long clientId) {
      this.clientId = clientId;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof DeviceModalMasterCRUDDto)) {
         return false;
      } else {
         DeviceModalMasterCRUDDto other = (DeviceModalMasterCRUDDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else {
            Object this$deviceModalId = this.getDeviceModalId();
            Object other$deviceModalId = other.getDeviceModalId();
            return this$deviceModalId == null ? other$deviceModalId == null : this$deviceModalId.equals(other$deviceModalId);
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof DeviceModalMasterCRUDDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $clientId = this.getClientId();
      result = result * 59 + (int)($clientId >>> 32 ^ $clientId);
      Object $deviceModalId = this.getDeviceModalId();
      return result * 59 + ($deviceModalId == null ? 43 : $deviceModalId.hashCode());
   }

   @Override
   public String toString() {
      return "DeviceModalMasterCRUDDto(deviceModalId=" + this.getDeviceModalId() + ", clientId=" + this.getClientId() + ")";
   }
}
