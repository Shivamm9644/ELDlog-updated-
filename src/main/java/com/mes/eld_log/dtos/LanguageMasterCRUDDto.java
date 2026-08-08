package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LanguageMasterCRUDDto {
   @JsonProperty("languageId")
   private Integer languageId;
   @JsonProperty("clientId")
   private long clientId;

   public Integer getLanguageId() {
      return this.languageId;
   }

   public long getClientId() {
      return this.clientId;
   }

   @JsonProperty("languageId")
   public void setLanguageId(final Integer languageId) {
      this.languageId = languageId;
   }

   @JsonProperty("clientId")
   public void setClientId(final long clientId) {
      this.clientId = clientId;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof LanguageMasterCRUDDto)) {
         return false;
      } else {
         LanguageMasterCRUDDto other = (LanguageMasterCRUDDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else {
            Object this$languageId = this.getLanguageId();
            Object other$languageId = other.getLanguageId();
            return this$languageId == null ? other$languageId == null : this$languageId.equals(other$languageId);
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof LanguageMasterCRUDDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $clientId = this.getClientId();
      result = result * 59 + (int)($clientId >>> 32 ^ $clientId);
      Object $languageId = this.getLanguageId();
      return result * 59 + ($languageId == null ? 43 : $languageId.hashCode());
   }

   @Override
   public String toString() {
      return "LanguageMasterCRUDDto(languageId=" + this.getLanguageId() + ", clientId=" + this.getClientId() + ")";
   }
}
