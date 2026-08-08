package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ClientMasterCRUDDto {
   @JsonProperty("clientId")
   private Integer clientId;
   @JsonProperty("vehicleId")
   private long vehicleId;
   @JsonProperty("fromDate")
   private String fromDate;
   @JsonProperty("toDate")
   private String toDate;

   public Integer getClientId() {
      return this.clientId;
   }

   public long getVehicleId() {
      return this.vehicleId;
   }

   public String getFromDate() {
      return this.fromDate;
   }

   public String getToDate() {
      return this.toDate;
   }

   @JsonProperty("clientId")
   public void setClientId(final Integer clientId) {
      this.clientId = clientId;
   }

   @JsonProperty("vehicleId")
   public void setVehicleId(final long vehicleId) {
      this.vehicleId = vehicleId;
   }

   @JsonProperty("fromDate")
   public void setFromDate(final String fromDate) {
      this.fromDate = fromDate;
   }

   @JsonProperty("toDate")
   public void setToDate(final String toDate) {
      this.toDate = toDate;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ClientMasterCRUDDto)) {
         return false;
      } else {
         ClientMasterCRUDDto other = (ClientMasterCRUDDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getVehicleId() != other.getVehicleId()) {
            return false;
         } else {
            Object this$clientId = this.getClientId();
            Object other$clientId = other.getClientId();
            if (this$clientId == null ? other$clientId == null : this$clientId.equals(other$clientId)) {
               Object this$fromDate = this.getFromDate();
               Object other$fromDate = other.getFromDate();
               if (this$fromDate == null ? other$fromDate == null : this$fromDate.equals(other$fromDate)) {
                  Object this$toDate = this.getToDate();
                  Object other$toDate = other.getToDate();
                  return this$toDate == null ? other$toDate == null : this$toDate.equals(other$toDate);
               } else {
                  return false;
               }
            } else {
               return false;
            }
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof ClientMasterCRUDDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $vehicleId = this.getVehicleId();
      result = result * 59 + (int)($vehicleId >>> 32 ^ $vehicleId);
      Object $clientId = this.getClientId();
      result = result * 59 + ($clientId == null ? 43 : $clientId.hashCode());
      Object $fromDate = this.getFromDate();
      result = result * 59 + ($fromDate == null ? 43 : $fromDate.hashCode());
      Object $toDate = this.getToDate();
      return result * 59 + ($toDate == null ? 43 : $toDate.hashCode());
   }

   @Override
   public String toString() {
      return "ClientMasterCRUDDto(clientId="
         + this.getClientId()
         + ", vehicleId="
         + this.getVehicleId()
         + ", fromDate="
         + this.getFromDate()
         + ", toDate="
         + this.getToDate()
         + ")";
   }
}
