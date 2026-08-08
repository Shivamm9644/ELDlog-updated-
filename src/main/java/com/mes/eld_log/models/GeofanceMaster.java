package com.mes.eld_log.models;

import java.io.Serializable;
import java.util.HashMap;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.core.mapping.Document;

@EntityScan
@Document(
   collection = "geofance_master"
)
public class GeofanceMaster implements Serializable {
   private static final long serialVersionUID = 1L;
   private Integer geoId;
   private String geofanceId;
   private long stateId;
   private String stateName;
   private String type;
   private HashMap latLng;
   private long addedTimestamp;
   private long updatedTimestamp;

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GeofanceMaster)) {
         return false;
      } else {
         GeofanceMaster other = (GeofanceMaster)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getStateId() != other.getStateId()) {
            return false;
         } else if (this.getAddedTimestamp() != other.getAddedTimestamp()) {
            return false;
         } else if (this.getUpdatedTimestamp() != other.getUpdatedTimestamp()) {
            return false;
         } else {
            Object this$geoId = this.getGeoId();
            Object other$geoId = other.getGeoId();
            if (this$geoId == null ? other$geoId == null : this$geoId.equals(other$geoId)) {
               Object this$geofanceId = this.getGeofanceId();
               Object other$geofanceId = other.getGeofanceId();
               if (this$geofanceId == null ? other$geofanceId == null : this$geofanceId.equals(other$geofanceId)) {
                  Object this$stateName = this.getStateName();
                  Object other$stateName = other.getStateName();
                  if (this$stateName == null ? other$stateName == null : this$stateName.equals(other$stateName)) {
                     Object this$type = this.getType();
                     Object other$type = other.getType();
                     if (this$type == null ? other$type == null : this$type.equals(other$type)) {
                        Object this$latLng = this.getLatLng();
                        Object other$latLng = other.getLatLng();
                        return this$latLng == null ? other$latLng == null : this$latLng.equals(other$latLng);
                     } else {
                        return false;
                     }
                  } else {
                     return false;
                  }
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
      return other instanceof GeofanceMaster;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $stateId = this.getStateId();
      result = result * 59 + (int)($stateId >>> 32 ^ $stateId);
      long $addedTimestamp = this.getAddedTimestamp();
      result = result * 59 + (int)($addedTimestamp >>> 32 ^ $addedTimestamp);
      long $updatedTimestamp = this.getUpdatedTimestamp();
      result = result * 59 + (int)($updatedTimestamp >>> 32 ^ $updatedTimestamp);
      Object $geoId = this.getGeoId();
      result = result * 59 + ($geoId == null ? 43 : $geoId.hashCode());
      Object $geofanceId = this.getGeofanceId();
      result = result * 59 + ($geofanceId == null ? 43 : $geofanceId.hashCode());
      Object $stateName = this.getStateName();
      result = result * 59 + ($stateName == null ? 43 : $stateName.hashCode());
      Object $type = this.getType();
      result = result * 59 + ($type == null ? 43 : $type.hashCode());
      Object $latLng = this.getLatLng();
      return result * 59 + ($latLng == null ? 43 : $latLng.hashCode());
   }

   @Override
   public String toString() {
      return "GeofanceMaster(geoId="
         + this.getGeoId()
         + ", geofanceId="
         + this.getGeofanceId()
         + ", stateId="
         + this.getStateId()
         + ", stateName="
         + this.getStateName()
         + ", type="
         + this.getType()
         + ", latLng="
         + this.getLatLng()
         + ", addedTimestamp="
         + this.getAddedTimestamp()
         + ", updatedTimestamp="
         + this.getUpdatedTimestamp()
         + ")";
   }

   public Integer getGeoId() {
      return this.geoId;
   }

   public String getGeofanceId() {
      return this.geofanceId;
   }

   public long getStateId() {
      return this.stateId;
   }

   public String getStateName() {
      return this.stateName;
   }

   public String getType() {
      return this.type;
   }

   public HashMap getLatLng() {
      return this.latLng;
   }

   public long getAddedTimestamp() {
      return this.addedTimestamp;
   }

   public long getUpdatedTimestamp() {
      return this.updatedTimestamp;
   }

   public void setGeoId(final Integer geoId) {
      this.geoId = geoId;
   }

   public void setGeofanceId(final String geofanceId) {
      this.geofanceId = geofanceId;
   }

   public void setStateId(final long stateId) {
      this.stateId = stateId;
   }

   public void setStateName(final String stateName) {
      this.stateName = stateName;
   }

   public void setType(final String type) {
      this.type = type;
   }

   public void setLatLng(final HashMap latLng) {
      this.latLng = latLng;
   }

   public void setAddedTimestamp(final long addedTimestamp) {
      this.addedTimestamp = addedTimestamp;
   }

   public void setUpdatedTimestamp(final long updatedTimestamp) {
      this.updatedTimestamp = updatedTimestamp;
   }
}
