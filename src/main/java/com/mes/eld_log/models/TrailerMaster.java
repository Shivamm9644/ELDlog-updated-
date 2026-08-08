package com.mes.eld_log.models;

import java.io.Serializable;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.core.mapping.Document;

@EntityScan
@Document(
   collection = "trailer_master"
)
public class TrailerMaster implements Serializable {
   private static final long serialVersionUID = 1L;
   private Integer trailerId;
   private String trailerName;
   private long clientId;
   private long addedTimestamp;
   private long updatedTimestamp;

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof TrailerMaster)) {
         return false;
      } else {
         TrailerMaster other = (TrailerMaster)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else if (this.getAddedTimestamp() != other.getAddedTimestamp()) {
            return false;
         } else if (this.getUpdatedTimestamp() != other.getUpdatedTimestamp()) {
            return false;
         } else {
            Object this$trailerId = this.getTrailerId();
            Object other$trailerId = other.getTrailerId();
            if (this$trailerId == null ? other$trailerId == null : this$trailerId.equals(other$trailerId)) {
               Object this$trailerName = this.getTrailerName();
               Object other$trailerName = other.getTrailerName();
               return this$trailerName == null ? other$trailerName == null : this$trailerName.equals(other$trailerName);
            } else {
               return false;
            }
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof TrailerMaster;
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
      Object $trailerId = this.getTrailerId();
      result = result * 59 + ($trailerId == null ? 43 : $trailerId.hashCode());
      Object $trailerName = this.getTrailerName();
      return result * 59 + ($trailerName == null ? 43 : $trailerName.hashCode());
   }

   @Override
   public String toString() {
      return "TrailerMaster(trailerId="
         + this.getTrailerId()
         + ", trailerName="
         + this.getTrailerName()
         + ", clientId="
         + this.getClientId()
         + ", addedTimestamp="
         + this.getAddedTimestamp()
         + ", updatedTimestamp="
         + this.getUpdatedTimestamp()
         + ")";
   }

   public Integer getTrailerId() {
      return this.trailerId;
   }

   public String getTrailerName() {
      return this.trailerName;
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

   public void setTrailerId(final Integer trailerId) {
      this.trailerId = trailerId;
   }

   public void setTrailerName(final String trailerName) {
      this.trailerName = trailerName;
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
