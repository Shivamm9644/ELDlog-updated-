package com.mes.eld_log.models;

import java.io.Serializable;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.core.mapping.Document;

@EntityScan
@Document(
   collection = "cycle_canada_master"
)
public class CycleCanada implements Serializable {
   private static final long serialVersionUID = 1L;
   private Integer cycleCanadaId;
   private String cycleCanadaName;
   private long countryId;
   private long stateId;
   private long clientId;
   private long addedTimestamp;
   private long updatedTimestamp;

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof CycleCanada)) {
         return false;
      } else {
         CycleCanada other = (CycleCanada)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getCountryId() != other.getCountryId()) {
            return false;
         } else if (this.getStateId() != other.getStateId()) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else if (this.getAddedTimestamp() != other.getAddedTimestamp()) {
            return false;
         } else if (this.getUpdatedTimestamp() != other.getUpdatedTimestamp()) {
            return false;
         } else {
            Object this$cycleCanadaId = this.getCycleCanadaId();
            Object other$cycleCanadaId = other.getCycleCanadaId();
            if (this$cycleCanadaId == null ? other$cycleCanadaId == null : this$cycleCanadaId.equals(other$cycleCanadaId)) {
               Object this$cycleCanadaName = this.getCycleCanadaName();
               Object other$cycleCanadaName = other.getCycleCanadaName();
               return this$cycleCanadaName == null ? other$cycleCanadaName == null : this$cycleCanadaName.equals(other$cycleCanadaName);
            } else {
               return false;
            }
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof CycleCanada;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $countryId = this.getCountryId();
      result = result * 59 + (int)($countryId >>> 32 ^ $countryId);
      long $stateId = this.getStateId();
      result = result * 59 + (int)($stateId >>> 32 ^ $stateId);
      long $clientId = this.getClientId();
      result = result * 59 + (int)($clientId >>> 32 ^ $clientId);
      long $addedTimestamp = this.getAddedTimestamp();
      result = result * 59 + (int)($addedTimestamp >>> 32 ^ $addedTimestamp);
      long $updatedTimestamp = this.getUpdatedTimestamp();
      result = result * 59 + (int)($updatedTimestamp >>> 32 ^ $updatedTimestamp);
      Object $cycleCanadaId = this.getCycleCanadaId();
      result = result * 59 + ($cycleCanadaId == null ? 43 : $cycleCanadaId.hashCode());
      Object $cycleCanadaName = this.getCycleCanadaName();
      return result * 59 + ($cycleCanadaName == null ? 43 : $cycleCanadaName.hashCode());
   }

   @Override
   public String toString() {
      return "CycleCanada(cycleCanadaId="
         + this.getCycleCanadaId()
         + ", cycleCanadaName="
         + this.getCycleCanadaName()
         + ", countryId="
         + this.getCountryId()
         + ", stateId="
         + this.getStateId()
         + ", clientId="
         + this.getClientId()
         + ", addedTimestamp="
         + this.getAddedTimestamp()
         + ", updatedTimestamp="
         + this.getUpdatedTimestamp()
         + ")";
   }

   public Integer getCycleCanadaId() {
      return this.cycleCanadaId;
   }

   public String getCycleCanadaName() {
      return this.cycleCanadaName;
   }

   public long getCountryId() {
      return this.countryId;
   }

   public long getStateId() {
      return this.stateId;
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

   public void setCycleCanadaId(final Integer cycleCanadaId) {
      this.cycleCanadaId = cycleCanadaId;
   }

   public void setCycleCanadaName(final String cycleCanadaName) {
      this.cycleCanadaName = cycleCanadaName;
   }

   public void setCountryId(final long countryId) {
      this.countryId = countryId;
   }

   public void setStateId(final long stateId) {
      this.stateId = stateId;
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
