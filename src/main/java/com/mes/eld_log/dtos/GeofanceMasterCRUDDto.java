package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GeofanceMasterCRUDDto {
   @JsonProperty("geoId")
   private Integer geoId;
   @JsonProperty("clientId")
   private long clientId;

   public Integer getGeoId() {
      return this.geoId;
   }

   public long getClientId() {
      return this.clientId;
   }

   @JsonProperty("geoId")
   public void setGeoId(final Integer geoId) {
      this.geoId = geoId;
   }

   @JsonProperty("clientId")
   public void setClientId(final long clientId) {
      this.clientId = clientId;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GeofanceMasterCRUDDto)) {
         return false;
      } else {
         GeofanceMasterCRUDDto other = (GeofanceMasterCRUDDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else {
            Object this$geoId = this.getGeoId();
            Object other$geoId = other.getGeoId();
            return this$geoId == null ? other$geoId == null : this$geoId.equals(other$geoId);
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof GeofanceMasterCRUDDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $clientId = this.getClientId();
      result = result * 59 + (int)($clientId >>> 32 ^ $clientId);
      Object $geoId = this.getGeoId();
      return result * 59 + ($geoId == null ? 43 : $geoId.hashCode());
   }

   @Override
   public String toString() {
      return "GeofanceMasterCRUDDto(geoId=" + this.getGeoId() + ", clientId=" + this.getClientId() + ")";
   }
}
