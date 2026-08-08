package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DefectMasterCRUDDto {
   @JsonProperty("defectId")
   private Integer defectId;
   @JsonProperty("tokenNo")
   private String tokenNo;
   @JsonProperty("driverId")
   private long driverId;
   @JsonProperty("clientId")
   private long clientId;

   public Integer getDefectId() {
      return this.defectId;
   }

   public String getTokenNo() {
      return this.tokenNo;
   }

   public long getDriverId() {
      return this.driverId;
   }

   public long getClientId() {
      return this.clientId;
   }

   @JsonProperty("defectId")
   public void setDefectId(final Integer defectId) {
      this.defectId = defectId;
   }

   @JsonProperty("tokenNo")
   public void setTokenNo(final String tokenNo) {
      this.tokenNo = tokenNo;
   }

   @JsonProperty("driverId")
   public void setDriverId(final long driverId) {
      this.driverId = driverId;
   }

   @JsonProperty("clientId")
   public void setClientId(final long clientId) {
      this.clientId = clientId;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof DefectMasterCRUDDto)) {
         return false;
      } else {
         DefectMasterCRUDDto other = (DefectMasterCRUDDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getDriverId() != other.getDriverId()) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else {
            Object this$defectId = this.getDefectId();
            Object other$defectId = other.getDefectId();
            if (this$defectId == null ? other$defectId == null : this$defectId.equals(other$defectId)) {
               Object this$tokenNo = this.getTokenNo();
               Object other$tokenNo = other.getTokenNo();
               return this$tokenNo == null ? other$tokenNo == null : this$tokenNo.equals(other$tokenNo);
            } else {
               return false;
            }
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof DefectMasterCRUDDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $driverId = this.getDriverId();
      result = result * 59 + (int)($driverId >>> 32 ^ $driverId);
      long $clientId = this.getClientId();
      result = result * 59 + (int)($clientId >>> 32 ^ $clientId);
      Object $defectId = this.getDefectId();
      result = result * 59 + ($defectId == null ? 43 : $defectId.hashCode());
      Object $tokenNo = this.getTokenNo();
      return result * 59 + ($tokenNo == null ? 43 : $tokenNo.hashCode());
   }

   @Override
   public String toString() {
      return "DefectMasterCRUDDto(defectId="
         + this.getDefectId()
         + ", tokenNo="
         + this.getTokenNo()
         + ", driverId="
         + this.getDriverId()
         + ", clientId="
         + this.getClientId()
         + ")";
   }
}
