package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProjectDetailAnalyticsViewDto {
   @JsonProperty("totalUsers")
   private long totalUsers;
   @JsonProperty("totalDrivers")
   private long totalDrivers;
   @JsonProperty("totalCompanies")
   private long totalCompanies;
   @JsonProperty("totalVehicles")
   private long totalVehicles;
   @JsonProperty("totalDeviceConnected")
   private long totalDeviceConnected;
   @JsonProperty("totalDeviceDisconnected")
   private long totalDeviceDisconnected;

   public long getTotalUsers() {
      return this.totalUsers;
   }

   public long getTotalDrivers() {
      return this.totalDrivers;
   }

   public long getTotalCompanies() {
      return this.totalCompanies;
   }

   public long getTotalVehicles() {
      return this.totalVehicles;
   }

   public long getTotalDeviceConnected() {
      return this.totalDeviceConnected;
   }

   public long getTotalDeviceDisconnected() {
      return this.totalDeviceDisconnected;
   }

   @JsonProperty("totalUsers")
   public void setTotalUsers(final long totalUsers) {
      this.totalUsers = totalUsers;
   }

   @JsonProperty("totalDrivers")
   public void setTotalDrivers(final long totalDrivers) {
      this.totalDrivers = totalDrivers;
   }

   @JsonProperty("totalCompanies")
   public void setTotalCompanies(final long totalCompanies) {
      this.totalCompanies = totalCompanies;
   }

   @JsonProperty("totalVehicles")
   public void setTotalVehicles(final long totalVehicles) {
      this.totalVehicles = totalVehicles;
   }

   @JsonProperty("totalDeviceConnected")
   public void setTotalDeviceConnected(final long totalDeviceConnected) {
      this.totalDeviceConnected = totalDeviceConnected;
   }

   @JsonProperty("totalDeviceDisconnected")
   public void setTotalDeviceDisconnected(final long totalDeviceDisconnected) {
      this.totalDeviceDisconnected = totalDeviceDisconnected;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ProjectDetailAnalyticsViewDto)) {
         return false;
      } else {
         ProjectDetailAnalyticsViewDto other = (ProjectDetailAnalyticsViewDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getTotalUsers() != other.getTotalUsers()) {
            return false;
         } else if (this.getTotalDrivers() != other.getTotalDrivers()) {
            return false;
         } else if (this.getTotalCompanies() != other.getTotalCompanies()) {
            return false;
         } else if (this.getTotalVehicles() != other.getTotalVehicles()) {
            return false;
         } else if (this.getTotalDeviceConnected() != other.getTotalDeviceConnected()) {
            return false;
         } else {
            return this.getTotalDeviceDisconnected() == other.getTotalDeviceDisconnected();
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof ProjectDetailAnalyticsViewDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $totalUsers = this.getTotalUsers();
      result = result * 59 + (int)($totalUsers >>> 32 ^ $totalUsers);
      long $totalDrivers = this.getTotalDrivers();
      result = result * 59 + (int)($totalDrivers >>> 32 ^ $totalDrivers);
      long $totalCompanies = this.getTotalCompanies();
      result = result * 59 + (int)($totalCompanies >>> 32 ^ $totalCompanies);
      long $totalVehicles = this.getTotalVehicles();
      result = result * 59 + (int)($totalVehicles >>> 32 ^ $totalVehicles);
      long $totalDeviceConnected = this.getTotalDeviceConnected();
      result = result * 59 + (int)($totalDeviceConnected >>> 32 ^ $totalDeviceConnected);
      long $totalDeviceDisconnected = this.getTotalDeviceDisconnected();
      return result * 59 + (int)($totalDeviceDisconnected >>> 32 ^ $totalDeviceDisconnected);
   }

   @Override
   public String toString() {
      return "ProjectDetailAnalyticsViewDto(totalUsers="
         + this.getTotalUsers()
         + ", totalDrivers="
         + this.getTotalDrivers()
         + ", totalCompanies="
         + this.getTotalCompanies()
         + ", totalVehicles="
         + this.getTotalVehicles()
         + ", totalDeviceConnected="
         + this.getTotalDeviceConnected()
         + ", totalDeviceDisconnected="
         + this.getTotalDeviceDisconnected()
         + ")";
   }
}
