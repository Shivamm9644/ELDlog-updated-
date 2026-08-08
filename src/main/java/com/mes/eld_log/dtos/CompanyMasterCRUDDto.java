package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CompanyMasterCRUDDto {
   @JsonProperty("companyId")
   private Integer companyId;
   @JsonProperty("clientId")
   private long clientId;

   public Integer getCompanyId() {
      return this.companyId;
   }

   public long getClientId() {
      return this.clientId;
   }

   @JsonProperty("companyId")
   public void setCompanyId(final Integer companyId) {
      this.companyId = companyId;
   }

   @JsonProperty("clientId")
   public void setClientId(final long clientId) {
      this.clientId = clientId;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof CompanyMasterCRUDDto)) {
         return false;
      } else {
         CompanyMasterCRUDDto other = (CompanyMasterCRUDDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else {
            Object this$companyId = this.getCompanyId();
            Object other$companyId = other.getCompanyId();
            return this$companyId == null ? other$companyId == null : this$companyId.equals(other$companyId);
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof CompanyMasterCRUDDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $clientId = this.getClientId();
      result = result * 59 + (int)($clientId >>> 32 ^ $clientId);
      Object $companyId = this.getCompanyId();
      return result * 59 + ($companyId == null ? 43 : $companyId.hashCode());
   }

   @Override
   public String toString() {
      return "CompanyMasterCRUDDto(companyId=" + this.getCompanyId() + ", clientId=" + this.getClientId() + ")";
   }
}
