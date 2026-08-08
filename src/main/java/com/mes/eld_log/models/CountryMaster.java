package com.mes.eld_log.models;

import java.io.Serializable;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.core.mapping.Document;

@EntityScan
@Document(
   collection = "country_master"
)
public class CountryMaster implements Serializable {
   private static final long serialVersionUID = 1L;
   private Integer countryId;
   private String countryCode;
   private String countryName;
   private double lattitude;
   private double longitude;
   private long clientId;
   private long addedTimestamp;
   private long updatedTimestamp;

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof CountryMaster)) {
         return false;
      } else {
         CountryMaster other = (CountryMaster)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (Double.compare(this.getLattitude(), other.getLattitude()) != 0) {
            return false;
         } else if (Double.compare(this.getLongitude(), other.getLongitude()) != 0) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else if (this.getAddedTimestamp() != other.getAddedTimestamp()) {
            return false;
         } else if (this.getUpdatedTimestamp() != other.getUpdatedTimestamp()) {
            return false;
         } else {
            Object this$countryId = this.getCountryId();
            Object other$countryId = other.getCountryId();
            if (this$countryId == null ? other$countryId == null : this$countryId.equals(other$countryId)) {
               Object this$countryCode = this.getCountryCode();
               Object other$countryCode = other.getCountryCode();
               if (this$countryCode == null ? other$countryCode == null : this$countryCode.equals(other$countryCode)) {
                  Object this$countryName = this.getCountryName();
                  Object other$countryName = other.getCountryName();
                  return this$countryName == null ? other$countryName == null : this$countryName.equals(other$countryName);
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
      return other instanceof CountryMaster;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $lattitude = Double.doubleToLongBits(this.getLattitude());
      result = result * 59 + (int)($lattitude >>> 32 ^ $lattitude);
      long $longitude = Double.doubleToLongBits(this.getLongitude());
      result = result * 59 + (int)($longitude >>> 32 ^ $longitude);
      long $clientId = this.getClientId();
      result = result * 59 + (int)($clientId >>> 32 ^ $clientId);
      long $addedTimestamp = this.getAddedTimestamp();
      result = result * 59 + (int)($addedTimestamp >>> 32 ^ $addedTimestamp);
      long $updatedTimestamp = this.getUpdatedTimestamp();
      result = result * 59 + (int)($updatedTimestamp >>> 32 ^ $updatedTimestamp);
      Object $countryId = this.getCountryId();
      result = result * 59 + ($countryId == null ? 43 : $countryId.hashCode());
      Object $countryCode = this.getCountryCode();
      result = result * 59 + ($countryCode == null ? 43 : $countryCode.hashCode());
      Object $countryName = this.getCountryName();
      return result * 59 + ($countryName == null ? 43 : $countryName.hashCode());
   }

   @Override
   public String toString() {
      return "CountryMaster(countryId="
         + this.getCountryId()
         + ", countryCode="
         + this.getCountryCode()
         + ", countryName="
         + this.getCountryName()
         + ", lattitude="
         + this.getLattitude()
         + ", longitude="
         + this.getLongitude()
         + ", clientId="
         + this.getClientId()
         + ", addedTimestamp="
         + this.getAddedTimestamp()
         + ", updatedTimestamp="
         + this.getUpdatedTimestamp()
         + ")";
   }

   public Integer getCountryId() {
      return this.countryId;
   }

   public String getCountryCode() {
      return this.countryCode;
   }

   public String getCountryName() {
      return this.countryName;
   }

   public double getLattitude() {
      return this.lattitude;
   }

   public double getLongitude() {
      return this.longitude;
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

   public void setCountryId(final Integer countryId) {
      this.countryId = countryId;
   }

   public void setCountryCode(final String countryCode) {
      this.countryCode = countryCode;
   }

   public void setCountryName(final String countryName) {
      this.countryName = countryName;
   }

   public void setLattitude(final double lattitude) {
      this.lattitude = lattitude;
   }

   public void setLongitude(final double longitude) {
      this.longitude = longitude;
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
