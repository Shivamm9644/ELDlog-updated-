package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DriverWorkingStatusViewDto {
   @JsonProperty("driverId")
   private long driverId;
   @JsonProperty("driverName")
   private String driverName;
   @JsonProperty("fromOnDuty")
   private long fromOnDuty;
   @JsonProperty("toOnDuty")
   private long toOnDuty;
   @JsonProperty("onDuty")
   private long onDuty;
   @JsonProperty("fromOnDrive")
   private long fromOnDrive;
   @JsonProperty("toOnDrive")
   private long toOnDrive;
   @JsonProperty("onDrive")
   private long onDrive;
   @JsonProperty("fromOnSleep")
   private long fromOnSleep;
   @JsonProperty("toOnSleep")
   private long toOnSleep;
   @JsonProperty("onSleep")
   private long onSleep;
   @JsonProperty("fromOffDuty")
   private long fromOffDuty;
   @JsonProperty("toOffDuty")
   private long toOffDuty;
   @JsonProperty("offDuty")
   private long offDuty;

   public long getDriverId() {
      return this.driverId;
   }

   public String getDriverName() {
      return this.driverName;
   }

   public long getFromOnDuty() {
      return this.fromOnDuty;
   }

   public long getToOnDuty() {
      return this.toOnDuty;
   }

   public long getOnDuty() {
      return this.onDuty;
   }

   public long getFromOnDrive() {
      return this.fromOnDrive;
   }

   public long getToOnDrive() {
      return this.toOnDrive;
   }

   public long getOnDrive() {
      return this.onDrive;
   }

   public long getFromOnSleep() {
      return this.fromOnSleep;
   }

   public long getToOnSleep() {
      return this.toOnSleep;
   }

   public long getOnSleep() {
      return this.onSleep;
   }

   public long getFromOffDuty() {
      return this.fromOffDuty;
   }

   public long getToOffDuty() {
      return this.toOffDuty;
   }

   public long getOffDuty() {
      return this.offDuty;
   }

   @JsonProperty("driverId")
   public void setDriverId(final long driverId) {
      this.driverId = driverId;
   }

   @JsonProperty("driverName")
   public void setDriverName(final String driverName) {
      this.driverName = driverName;
   }

   @JsonProperty("fromOnDuty")
   public void setFromOnDuty(final long fromOnDuty) {
      this.fromOnDuty = fromOnDuty;
   }

   @JsonProperty("toOnDuty")
   public void setToOnDuty(final long toOnDuty) {
      this.toOnDuty = toOnDuty;
   }

   @JsonProperty("onDuty")
   public void setOnDuty(final long onDuty) {
      this.onDuty = onDuty;
   }

   @JsonProperty("fromOnDrive")
   public void setFromOnDrive(final long fromOnDrive) {
      this.fromOnDrive = fromOnDrive;
   }

   @JsonProperty("toOnDrive")
   public void setToOnDrive(final long toOnDrive) {
      this.toOnDrive = toOnDrive;
   }

   @JsonProperty("onDrive")
   public void setOnDrive(final long onDrive) {
      this.onDrive = onDrive;
   }

   @JsonProperty("fromOnSleep")
   public void setFromOnSleep(final long fromOnSleep) {
      this.fromOnSleep = fromOnSleep;
   }

   @JsonProperty("toOnSleep")
   public void setToOnSleep(final long toOnSleep) {
      this.toOnSleep = toOnSleep;
   }

   @JsonProperty("onSleep")
   public void setOnSleep(final long onSleep) {
      this.onSleep = onSleep;
   }

   @JsonProperty("fromOffDuty")
   public void setFromOffDuty(final long fromOffDuty) {
      this.fromOffDuty = fromOffDuty;
   }

   @JsonProperty("toOffDuty")
   public void setToOffDuty(final long toOffDuty) {
      this.toOffDuty = toOffDuty;
   }

   @JsonProperty("offDuty")
   public void setOffDuty(final long offDuty) {
      this.offDuty = offDuty;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof DriverWorkingStatusViewDto)) {
         return false;
      } else {
         DriverWorkingStatusViewDto other = (DriverWorkingStatusViewDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getDriverId() != other.getDriverId()) {
            return false;
         } else if (this.getFromOnDuty() != other.getFromOnDuty()) {
            return false;
         } else if (this.getToOnDuty() != other.getToOnDuty()) {
            return false;
         } else if (this.getOnDuty() != other.getOnDuty()) {
            return false;
         } else if (this.getFromOnDrive() != other.getFromOnDrive()) {
            return false;
         } else if (this.getToOnDrive() != other.getToOnDrive()) {
            return false;
         } else if (this.getOnDrive() != other.getOnDrive()) {
            return false;
         } else if (this.getFromOnSleep() != other.getFromOnSleep()) {
            return false;
         } else if (this.getToOnSleep() != other.getToOnSleep()) {
            return false;
         } else if (this.getOnSleep() != other.getOnSleep()) {
            return false;
         } else if (this.getFromOffDuty() != other.getFromOffDuty()) {
            return false;
         } else if (this.getToOffDuty() != other.getToOffDuty()) {
            return false;
         } else if (this.getOffDuty() != other.getOffDuty()) {
            return false;
         } else {
            Object this$driverName = this.getDriverName();
            Object other$driverName = other.getDriverName();
            return this$driverName == null ? other$driverName == null : this$driverName.equals(other$driverName);
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof DriverWorkingStatusViewDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $driverId = this.getDriverId();
      result = result * 59 + (int)($driverId >>> 32 ^ $driverId);
      long $fromOnDuty = this.getFromOnDuty();
      result = result * 59 + (int)($fromOnDuty >>> 32 ^ $fromOnDuty);
      long $toOnDuty = this.getToOnDuty();
      result = result * 59 + (int)($toOnDuty >>> 32 ^ $toOnDuty);
      long $onDuty = this.getOnDuty();
      result = result * 59 + (int)($onDuty >>> 32 ^ $onDuty);
      long $fromOnDrive = this.getFromOnDrive();
      result = result * 59 + (int)($fromOnDrive >>> 32 ^ $fromOnDrive);
      long $toOnDrive = this.getToOnDrive();
      result = result * 59 + (int)($toOnDrive >>> 32 ^ $toOnDrive);
      long $onDrive = this.getOnDrive();
      result = result * 59 + (int)($onDrive >>> 32 ^ $onDrive);
      long $fromOnSleep = this.getFromOnSleep();
      result = result * 59 + (int)($fromOnSleep >>> 32 ^ $fromOnSleep);
      long $toOnSleep = this.getToOnSleep();
      result = result * 59 + (int)($toOnSleep >>> 32 ^ $toOnSleep);
      long $onSleep = this.getOnSleep();
      result = result * 59 + (int)($onSleep >>> 32 ^ $onSleep);
      long $fromOffDuty = this.getFromOffDuty();
      result = result * 59 + (int)($fromOffDuty >>> 32 ^ $fromOffDuty);
      long $toOffDuty = this.getToOffDuty();
      result = result * 59 + (int)($toOffDuty >>> 32 ^ $toOffDuty);
      long $offDuty = this.getOffDuty();
      result = result * 59 + (int)($offDuty >>> 32 ^ $offDuty);
      Object $driverName = this.getDriverName();
      return result * 59 + ($driverName == null ? 43 : $driverName.hashCode());
   }

   @Override
   public String toString() {
      return "DriverWorkingStatusViewDto(driverId="
         + this.getDriverId()
         + ", driverName="
         + this.getDriverName()
         + ", fromOnDuty="
         + this.getFromOnDuty()
         + ", toOnDuty="
         + this.getToOnDuty()
         + ", onDuty="
         + this.getOnDuty()
         + ", fromOnDrive="
         + this.getFromOnDrive()
         + ", toOnDrive="
         + this.getToOnDrive()
         + ", onDrive="
         + this.getOnDrive()
         + ", fromOnSleep="
         + this.getFromOnSleep()
         + ", toOnSleep="
         + this.getToOnSleep()
         + ", onSleep="
         + this.getOnSleep()
         + ", fromOffDuty="
         + this.getFromOffDuty()
         + ", toOffDuty="
         + this.getToOffDuty()
         + ", offDuty="
         + this.getOffDuty()
         + ")";
   }
}
