package com.mes.eld_log.models;

import java.io.Serializable;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.core.mapping.Document;

@EntityScan
@Document(
   collection = "defect_master"
)
public class DefectMaster implements Serializable {
   private static final long serialVersionUID = 1L;
   private Integer defectId;
   private String defectName;
   private String defectType;
   private long clientId;
   private long addedTimestamp;
   private long updatedTimestamp;

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof DefectMaster)) {
         return false;
      } else {
         DefectMaster other = (DefectMaster)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else if (this.getAddedTimestamp() != other.getAddedTimestamp()) {
            return false;
         } else if (this.getUpdatedTimestamp() != other.getUpdatedTimestamp()) {
            return false;
         } else {
            Object this$defectId = this.getDefectId();
            Object other$defectId = other.getDefectId();
            if (this$defectId == null ? other$defectId == null : this$defectId.equals(other$defectId)) {
               Object this$defectName = this.getDefectName();
               Object other$defectName = other.getDefectName();
               if (this$defectName == null ? other$defectName == null : this$defectName.equals(other$defectName)) {
                  Object this$defectType = this.getDefectType();
                  Object other$defectType = other.getDefectType();
                  return this$defectType == null ? other$defectType == null : this$defectType.equals(other$defectType);
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
      return other instanceof DefectMaster;
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
      Object $defectId = this.getDefectId();
      result = result * 59 + ($defectId == null ? 43 : $defectId.hashCode());
      Object $defectName = this.getDefectName();
      result = result * 59 + ($defectName == null ? 43 : $defectName.hashCode());
      Object $defectType = this.getDefectType();
      return result * 59 + ($defectType == null ? 43 : $defectType.hashCode());
   }

   @Override
   public String toString() {
      return "DefectMaster(defectId="
         + this.getDefectId()
         + ", defectName="
         + this.getDefectName()
         + ", defectType="
         + this.getDefectType()
         + ", clientId="
         + this.getClientId()
         + ", addedTimestamp="
         + this.getAddedTimestamp()
         + ", updatedTimestamp="
         + this.getUpdatedTimestamp()
         + ")";
   }

   public Integer getDefectId() {
      return this.defectId;
   }

   public String getDefectName() {
      return this.defectName;
   }

   public String getDefectType() {
      return this.defectType;
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

   public void setDefectId(final Integer defectId) {
      this.defectId = defectId;
   }

   public void setDefectName(final String defectName) {
      this.defectName = defectName;
   }

   public void setDefectType(final String defectType) {
      this.defectType = defectType;
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
