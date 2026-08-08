package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RouteMasterCRUDDto {
   @JsonProperty("routeId")
   private Integer routeId;
   @JsonProperty("clientId")
   private long clientId;

   public Integer getRouteId() {
      return this.routeId;
   }

   public long getClientId() {
      return this.clientId;
   }

   @JsonProperty("routeId")
   public void setRouteId(final Integer routeId) {
      this.routeId = routeId;
   }

   @JsonProperty("clientId")
   public void setClientId(final long clientId) {
      this.clientId = clientId;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof RouteMasterCRUDDto)) {
         return false;
      } else {
         RouteMasterCRUDDto other = (RouteMasterCRUDDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else {
            Object this$routeId = this.getRouteId();
            Object other$routeId = other.getRouteId();
            return this$routeId == null ? other$routeId == null : this$routeId.equals(other$routeId);
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof RouteMasterCRUDDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $clientId = this.getClientId();
      result = result * 59 + (int)($clientId >>> 32 ^ $clientId);
      Object $routeId = this.getRouteId();
      return result * 59 + ($routeId == null ? 43 : $routeId.hashCode());
   }

   @Override
   public String toString() {
      return "RouteMasterCRUDDto(routeId=" + this.getRouteId() + ", clientId=" + this.getClientId() + ")";
   }
}
