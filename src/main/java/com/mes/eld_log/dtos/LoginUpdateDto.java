package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LoginUpdateDto {
   @JsonProperty("driverId")
   private long driverId;
   @JsonProperty("loginDateTime")
   private long loginDateTime;
   @JsonProperty("timestamp")
   private long timestamp;

   public long getDriverId() {
      return this.driverId;
   }

   public long getLoginDateTime() {
      return this.loginDateTime;
   }

   public long getTimestamp() {
      return this.timestamp;
   }

   @JsonProperty("driverId")
   public void setDriverId(final long driverId) {
      this.driverId = driverId;
   }

   @JsonProperty("loginDateTime")
   public void setLoginDateTime(final long loginDateTime) {
      this.loginDateTime = loginDateTime;
   }

   @JsonProperty("timestamp")
   public void setTimestamp(final long timestamp) {
      this.timestamp = timestamp;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof LoginUpdateDto)) {
         return false;
      } else {
         LoginUpdateDto other = (LoginUpdateDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getDriverId() != other.getDriverId()) {
            return false;
         } else if (this.getLoginDateTime() != other.getLoginDateTime()) {
            return false;
         } else {
            return this.getTimestamp() == other.getTimestamp();
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof LoginUpdateDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $driverId = this.getDriverId();
      result = result * 59 + (int)($driverId >>> 32 ^ $driverId);
      long $loginDateTime = this.getLoginDateTime();
      result = result * 59 + (int)($loginDateTime >>> 32 ^ $loginDateTime);
      long $timestamp = this.getTimestamp();
      return result * 59 + (int)($timestamp >>> 32 ^ $timestamp);
   }

   @Override
   public String toString() {
      return "LoginUpdateDto(driverId=" + this.getDriverId() + ", loginDateTime=" + this.getLoginDateTime() + ", timestamp=" + this.getTimestamp() + ")";
   }
}
