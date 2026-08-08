package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CompanyTerminalDataViewDto {
   @JsonProperty("terminalTimezoneId")
   private long terminalTimezoneId;
   @JsonProperty("terminalStartTime")
   private String terminalStartTime;
   @JsonProperty("terminalStreet")
   private String terminalStreet;
   @JsonProperty("terminalCity")
   private String terminalCity;
   @JsonProperty("terminalCountryId")
   private long terminalCountryId;
   @JsonProperty("terminalStateId")
   private long terminalStateId;
   @JsonProperty("terminalZipcode")
   private long terminalZipcode;

   public long getTerminalTimezoneId() {
      return this.terminalTimezoneId;
   }

   public String getTerminalStartTime() {
      return this.terminalStartTime;
   }

   public String getTerminalStreet() {
      return this.terminalStreet;
   }

   public String getTerminalCity() {
      return this.terminalCity;
   }

   public long getTerminalCountryId() {
      return this.terminalCountryId;
   }

   public long getTerminalStateId() {
      return this.terminalStateId;
   }

   public long getTerminalZipcode() {
      return this.terminalZipcode;
   }

   @JsonProperty("terminalTimezoneId")
   public void setTerminalTimezoneId(final long terminalTimezoneId) {
      this.terminalTimezoneId = terminalTimezoneId;
   }

   @JsonProperty("terminalStartTime")
   public void setTerminalStartTime(final String terminalStartTime) {
      this.terminalStartTime = terminalStartTime;
   }

   @JsonProperty("terminalStreet")
   public void setTerminalStreet(final String terminalStreet) {
      this.terminalStreet = terminalStreet;
   }

   @JsonProperty("terminalCity")
   public void setTerminalCity(final String terminalCity) {
      this.terminalCity = terminalCity;
   }

   @JsonProperty("terminalCountryId")
   public void setTerminalCountryId(final long terminalCountryId) {
      this.terminalCountryId = terminalCountryId;
   }

   @JsonProperty("terminalStateId")
   public void setTerminalStateId(final long terminalStateId) {
      this.terminalStateId = terminalStateId;
   }

   @JsonProperty("terminalZipcode")
   public void setTerminalZipcode(final long terminalZipcode) {
      this.terminalZipcode = terminalZipcode;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof CompanyTerminalDataViewDto)) {
         return false;
      } else {
         CompanyTerminalDataViewDto other = (CompanyTerminalDataViewDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getTerminalTimezoneId() != other.getTerminalTimezoneId()) {
            return false;
         } else if (this.getTerminalCountryId() != other.getTerminalCountryId()) {
            return false;
         } else if (this.getTerminalStateId() != other.getTerminalStateId()) {
            return false;
         } else if (this.getTerminalZipcode() != other.getTerminalZipcode()) {
            return false;
         } else {
            Object this$terminalStartTime = this.getTerminalStartTime();
            Object other$terminalStartTime = other.getTerminalStartTime();
            if (this$terminalStartTime == null ? other$terminalStartTime == null : this$terminalStartTime.equals(other$terminalStartTime)) {
               Object this$terminalStreet = this.getTerminalStreet();
               Object other$terminalStreet = other.getTerminalStreet();
               if (this$terminalStreet == null ? other$terminalStreet == null : this$terminalStreet.equals(other$terminalStreet)) {
                  Object this$terminalCity = this.getTerminalCity();
                  Object other$terminalCity = other.getTerminalCity();
                  return this$terminalCity == null ? other$terminalCity == null : this$terminalCity.equals(other$terminalCity);
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
      return other instanceof CompanyTerminalDataViewDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $terminalTimezoneId = this.getTerminalTimezoneId();
      result = result * 59 + (int)($terminalTimezoneId >>> 32 ^ $terminalTimezoneId);
      long $terminalCountryId = this.getTerminalCountryId();
      result = result * 59 + (int)($terminalCountryId >>> 32 ^ $terminalCountryId);
      long $terminalStateId = this.getTerminalStateId();
      result = result * 59 + (int)($terminalStateId >>> 32 ^ $terminalStateId);
      long $terminalZipcode = this.getTerminalZipcode();
      result = result * 59 + (int)($terminalZipcode >>> 32 ^ $terminalZipcode);
      Object $terminalStartTime = this.getTerminalStartTime();
      result = result * 59 + ($terminalStartTime == null ? 43 : $terminalStartTime.hashCode());
      Object $terminalStreet = this.getTerminalStreet();
      result = result * 59 + ($terminalStreet == null ? 43 : $terminalStreet.hashCode());
      Object $terminalCity = this.getTerminalCity();
      return result * 59 + ($terminalCity == null ? 43 : $terminalCity.hashCode());
   }

   @Override
   public String toString() {
      return "CompanyTerminalDataViewDto(terminalTimezoneId="
         + this.getTerminalTimezoneId()
         + ", terminalStartTime="
         + this.getTerminalStartTime()
         + ", terminalStreet="
         + this.getTerminalStreet()
         + ", terminalCity="
         + this.getTerminalCity()
         + ", terminalCountryId="
         + this.getTerminalCountryId()
         + ", terminalStateId="
         + this.getTerminalStateId()
         + ", terminalZipcode="
         + this.getTerminalZipcode()
         + ")";
   }
}
