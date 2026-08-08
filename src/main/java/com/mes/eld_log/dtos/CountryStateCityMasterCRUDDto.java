package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CountryStateCityMasterCRUDDto {
   @JsonProperty("countryId")
   private Integer countryId;
   @JsonProperty("stateId")
   private Integer stateId;
   @JsonProperty("cityId")
   private Integer cityId;
   @JsonProperty("clientId")
   private long clientId;

   public Integer getCountryId() {
      return this.countryId;
   }

   public Integer getStateId() {
      return this.stateId;
   }

   public Integer getCityId() {
      return this.cityId;
   }

   public long getClientId() {
      return this.clientId;
   }

   @JsonProperty("countryId")
   public void setCountryId(final Integer countryId) {
      this.countryId = countryId;
   }

   @JsonProperty("stateId")
   public void setStateId(final Integer stateId) {
      this.stateId = stateId;
   }

   @JsonProperty("cityId")
   public void setCityId(final Integer cityId) {
      this.cityId = cityId;
   }

   @JsonProperty("clientId")
   public void setClientId(final long clientId) {
      this.clientId = clientId;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof CountryStateCityMasterCRUDDto)) {
         return false;
      } else {
         CountryStateCityMasterCRUDDto other = (CountryStateCityMasterCRUDDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else {
            Object this$countryId = this.getCountryId();
            Object other$countryId = other.getCountryId();
            if (this$countryId == null ? other$countryId == null : this$countryId.equals(other$countryId)) {
               Object this$stateId = this.getStateId();
               Object other$stateId = other.getStateId();
               if (this$stateId == null ? other$stateId == null : this$stateId.equals(other$stateId)) {
                  Object this$cityId = this.getCityId();
                  Object other$cityId = other.getCityId();
                  return this$cityId == null ? other$cityId == null : this$cityId.equals(other$cityId);
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
      return other instanceof CountryStateCityMasterCRUDDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $clientId = this.getClientId();
      result = result * 59 + (int)($clientId >>> 32 ^ $clientId);
      Object $countryId = this.getCountryId();
      result = result * 59 + ($countryId == null ? 43 : $countryId.hashCode());
      Object $stateId = this.getStateId();
      result = result * 59 + ($stateId == null ? 43 : $stateId.hashCode());
      Object $cityId = this.getCityId();
      return result * 59 + ($cityId == null ? 43 : $cityId.hashCode());
   }

   @Override
   public String toString() {
      return "CountryStateCityMasterCRUDDto(countryId="
         + this.getCountryId()
         + ", stateId="
         + this.getStateId()
         + ", cityId="
         + this.getCityId()
         + ", clientId="
         + this.getClientId()
         + ")";
   }
}
