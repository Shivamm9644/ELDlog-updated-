package com.mes.eld_log.models;

import java.io.Serializable;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.core.mapping.Document;

@EntityScan
@Document(
   collection = "route_master"
)
public class RouteMaster implements Serializable {
   private static final long serialVersionUID = 1L;
   private Integer routeId;
   private String routeName;
   private long clientId;
   private long addedTimestamp;
   private long updatedTimestamp;

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof RouteMaster)) {
         return false;
      } else {
         RouteMaster other = (RouteMaster)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else if (this.getAddedTimestamp() != other.getAddedTimestamp()) {
            return false;
         } else if (this.getUpdatedTimestamp() != other.getUpdatedTimestamp()) {
            return false;
         } else {
            Object this$routeId = this.getRouteId();
            Object other$routeId = other.getRouteId();
            if (this$routeId == null ? other$routeId == null : this$routeId.equals(other$routeId)) {
               Object this$routeName = this.getRouteName();
               Object other$routeName = other.getRouteName();
               return this$routeName == null ? other$routeName == null : this$routeName.equals(other$routeName);
            } else {
               return false;
            }
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof RouteMaster;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $clientId = this.getClientId();
      result = result * 59 + (int)($clientId >>> 32 ^ $clientId);
      long $addedTimestamp = this.getAddedTimestamp();
      result = result * 59 + (int)($addedTimestamp >>> 32 ^ $addedTimestamp);
      long $updatedTimestamp = this.getUpdatedTimestamp();
      result = result * 59 + (int)($updatedTimestamp >>> 32 ^ $updatedTimestamp);
      Object $routeId = this.getRouteId();
      result = result * 59 + ($routeId == null ? 43 : $routeId.hashCode());
      Object $routeName = this.getRouteName();
      return result * 59 + ($routeName == null ? 43 : $routeName.hashCode());
   }

   @Override
   public String toString() {
      return "RouteMaster(routeId="
         + this.getRouteId()
         + ", routeName="
         + this.getRouteName()
         + ", clientId="
         + this.getClientId()
         + ", addedTimestamp="
         + this.getAddedTimestamp()
         + ", updatedTimestamp="
         + this.getUpdatedTimestamp()
         + ")";
   }

   public Integer getRouteId() {
      return this.routeId;
   }

   public String getRouteName() {
      return this.routeName;
   }

   public long getClientId() {
      return this.clientId;
   }

   public long getAddedTimestamp() {
      return this.addedTimestamp;
   }

   public long getUpdatedTimestamp() {
      return this.updatedTimestamp;
   }

   public void setRouteId(final Integer routeId) {
      this.routeId = routeId;
   }

   public void setRouteName(final String routeName) {
      this.routeName = routeName;
   }

   public void setClientId(final long clientId) {
      this.clientId = clientId;
   }

   public void setAddedTimestamp(final long addedTimestamp) {
      this.addedTimestamp = addedTimestamp;
   }

   public void setUpdatedTimestamp(final long updatedTimestamp) {
      this.updatedTimestamp = updatedTimestamp;
   }
}
