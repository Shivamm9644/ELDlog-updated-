package com.mes.eld_log.models;

import java.io.Serializable;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.core.mapping.Document;

@EntityScan
@Document(
   collection = "state_master"
)
public class StateMaster implements Serializable {
   private static final long serialVersionUID = 1L;
   private Integer stateId;
   private Integer countryId;
   private String stateName;
   private String timeZone;
   private String timezoneOffSet;
   private String stateCode;
   private long clientId;
   private long geofanceId;
   private long addedTimestamp;
   private long updatedTimestamp;

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof StateMaster)) {
         return false;
      } else {
         StateMaster other = (StateMaster)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else if (this.getGeofanceId() != other.getGeofanceId()) {
            return false;
         } else if (this.getAddedTimestamp() != other.getAddedTimestamp()) {
            return false;
         } else if (this.getUpdatedTimestamp() != other.getUpdatedTimestamp()) {
            return false;
         } else {
            Object this$stateId = this.getStateId();
            Object other$stateId = other.getStateId();
            if (this$stateId == null ? other$stateId == null : this$stateId.equals(other$stateId)) {
               Object this$countryId = this.getCountryId();
               Object other$countryId = other.getCountryId();
               if (this$countryId == null ? other$countryId == null : this$countryId.equals(other$countryId)) {
                  Object this$stateName = this.getStateName();
                  Object other$stateName = other.getStateName();
                  if (this$stateName == null ? other$stateName == null : this$stateName.equals(other$stateName)) {
                     Object this$timeZone = this.getTimeZone();
                     Object other$timeZone = other.getTimeZone();
                     if (this$timeZone == null ? other$timeZone == null : this$timeZone.equals(other$timeZone)) {
                        Object this$timezoneOffSet = this.getTimezoneOffSet();
                        Object other$timezoneOffSet = other.getTimezoneOffSet();
                        if (this$timezoneOffSet == null ? other$timezoneOffSet == null : this$timezoneOffSet.equals(other$timezoneOffSet)) {
                           Object this$stateCode = this.getStateCode();
                           Object other$stateCode = other.getStateCode();
                           return this$stateCode == null ? other$stateCode == null : this$stateCode.equals(other$stateCode);
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
            } else {
               return false;
            }
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof StateMaster;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $clientId = this.getClientId();
      result = result * 59 + (int)($clientId >>> 32 ^ $clientId);
      long $geofanceId = this.getGeofanceId();
      result = result * 59 + (int)($geofanceId >>> 32 ^ $geofanceId);
      long $addedTimestamp = this.getAddedTimestamp();
      result = result * 59 + (int)($addedTimestamp >>> 32 ^ $addedTimestamp);
      long $updatedTimestamp = this.getUpdatedTimestamp();
      result = result * 59 + (int)($updatedTimestamp >>> 32 ^ $updatedTimestamp);
      Object $stateId = this.getStateId();
      result = result * 59 + ($stateId == null ? 43 : $stateId.hashCode());
      Object $countryId = this.getCountryId();
      result = result * 59 + ($countryId == null ? 43 : $countryId.hashCode());
      Object $stateName = this.getStateName();
      result = result * 59 + ($stateName == null ? 43 : $stateName.hashCode());
      Object $timeZone = this.getTimeZone();
      result = result * 59 + ($timeZone == null ? 43 : $timeZone.hashCode());
      Object $timezoneOffSet = this.getTimezoneOffSet();
      result = result * 59 + ($timezoneOffSet == null ? 43 : $timezoneOffSet.hashCode());
      Object $stateCode = this.getStateCode();
      return result * 59 + ($stateCode == null ? 43 : $stateCode.hashCode());
   }

   @Override
   public String toString() {
      return "StateMaster(stateId="
         + this.getStateId()
         + ", countryId="
         + this.getCountryId()
         + ", stateName="
         + this.getStateName()
         + ", timeZone="
         + this.getTimeZone()
         + ", timezoneOffSet="
         + this.getTimezoneOffSet()
         + ", stateCode="
         + this.getStateCode()
         + ", clientId="
         + this.getClientId()
         + ", geofanceId="
         + this.getGeofanceId()
         + ", addedTimestamp="
         + this.getAddedTimestamp()
         + ", updatedTimestamp="
         + this.getUpdatedTimestamp()
         + ")";
   }

   public Integer getStateId() {
      return this.stateId;
   }

   public Integer getCountryId() {
      return this.countryId;
   }

   public String getStateName() {
      return this.stateName;
   }

   public String getTimeZone() {
      return this.timeZone;
   }

   public String getTimezoneOffSet() {
      return this.timezoneOffSet;
   }

   public String getStateCode() {
      return this.stateCode;
   }

   public long getClientId() {
      return this.clientId;
   }

   public long getGeofanceId() {
      return this.geofanceId;
   }

   public long getAddedTimestamp() {
      return this.addedTimestamp;
   }

   public long getUpdatedTimestamp() {
      return this.updatedTimestamp;
   }

   public void setStateId(final Integer stateId) {
      this.stateId = stateId;
   }

   public void setCountryId(final Integer countryId) {
      this.countryId = countryId;
   }

   public void setStateName(final String stateName) {
      this.stateName = stateName;
   }

   public void setTimeZone(final String timeZone) {
      this.timeZone = timeZone;
   }

   public void setTimezoneOffSet(final String timezoneOffSet) {
      this.timezoneOffSet = timezoneOffSet;
   }

   public void setStateCode(final String stateCode) {
      this.stateCode = stateCode;
   }

   public void setClientId(final long clientId) {
      this.clientId = clientId;
   }

   public void setGeofanceId(final long geofanceId) {
      this.geofanceId = geofanceId;
   }

   public void setAddedTimestamp(final long addedTimestamp) {
      this.addedTimestamp = addedTimestamp;
   }

   public void setUpdatedTimestamp(final long updatedTimestamp) {
      this.updatedTimestamp = updatedTimestamp;
   }
}
