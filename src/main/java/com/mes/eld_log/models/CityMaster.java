package com.mes.eld_log.models;

import java.io.Serializable;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.core.mapping.Document;

@EntityScan
@Document(
   collection = "city_master"
)
public class CityMaster implements Serializable {
   private static final long serialVersionUID = 1L;
   private Integer cityId;
   private Integer countryId;
   private Integer stateId;
   private String cityName;
   private long clientId;
   private long addedTimestamp;
   private long updatedTimestamp;

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof CityMaster)) {
         return false;
      } else {
         CityMaster other = (CityMaster)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else if (this.getAddedTimestamp() != other.getAddedTimestamp()) {
            return false;
         } else if (this.getUpdatedTimestamp() != other.getUpdatedTimestamp()) {
            return false;
         } else {
            Object this$cityId = this.getCityId();
            Object other$cityId = other.getCityId();
            if (this$cityId == null ? other$cityId == null : this$cityId.equals(other$cityId)) {
               Object this$countryId = this.getCountryId();
               Object other$countryId = other.getCountryId();
               if (this$countryId == null ? other$countryId == null : this$countryId.equals(other$countryId)) {
                  Object this$stateId = this.getStateId();
                  Object other$stateId = other.getStateId();
                  if (this$stateId == null ? other$stateId == null : this$stateId.equals(other$stateId)) {
                     Object this$cityName = this.getCityName();
                     Object other$cityName = other.getCityName();
                     return this$cityName == null ? other$cityName == null : this$cityName.equals(other$cityName);
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
      return other instanceof CityMaster;
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
      Object $cityId = this.getCityId();
      result = result * 59 + ($cityId == null ? 43 : $cityId.hashCode());
      Object $countryId = this.getCountryId();
      result = result * 59 + ($countryId == null ? 43 : $countryId.hashCode());
      Object $stateId = this.getStateId();
      result = result * 59 + ($stateId == null ? 43 : $stateId.hashCode());
      Object $cityName = this.getCityName();
      return result * 59 + ($cityName == null ? 43 : $cityName.hashCode());
   }

   @Override
   public String toString() {
      return "CityMaster(cityId="
         + this.getCityId()
         + ", countryId="
         + this.getCountryId()
         + ", stateId="
         + this.getStateId()
         + ", cityName="
         + this.getCityName()
         + ", clientId="
         + this.getClientId()
         + ", addedTimestamp="
         + this.getAddedTimestamp()
         + ", updatedTimestamp="
         + this.getUpdatedTimestamp()
         + ")";
   }

   public Integer getCityId() {
      return this.cityId;
   }

   public Integer getCountryId() {
      return this.countryId;
   }

   public Integer getStateId() {
      return this.stateId;
   }

   public String getCityName() {
      return this.cityName;
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

   public void setCityId(final Integer cityId) {
      this.cityId = cityId;
   }

   public void setCountryId(final Integer countryId) {
      this.countryId = countryId;
   }

   public void setStateId(final Integer stateId) {
      this.stateId = stateId;
   }

   public void setCityName(final String cityName) {
      this.cityName = cityName;
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
