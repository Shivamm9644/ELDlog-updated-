package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mes.eld_log.models.DVIRData;
import com.mes.eld_log.models.DefectDetails;
import java.util.ArrayList;

public class AddDvirDataDto {
   @JsonProperty("dvirStatusData")
   private ArrayList<DVIRData> dvirStatusData;
   @JsonProperty("defectData")
   private ArrayList<DefectDetails> defectData;

   public ArrayList<DVIRData> getDvirStatusData() {
      return this.dvirStatusData;
   }

   public ArrayList<DefectDetails> getDefectData() {
      return this.defectData;
   }

   @JsonProperty("dvirStatusData")
   public void setDvirStatusData(final ArrayList<DVIRData> dvirStatusData) {
      this.dvirStatusData = dvirStatusData;
   }

   @JsonProperty("defectData")
   public void setDefectData(final ArrayList<DefectDetails> defectData) {
      this.defectData = defectData;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof AddDvirDataDto)) {
         return false;
      } else {
         AddDvirDataDto other = (AddDvirDataDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$dvirStatusData = this.getDvirStatusData();
            Object other$dvirStatusData = other.getDvirStatusData();
            if (this$dvirStatusData == null ? other$dvirStatusData == null : this$dvirStatusData.equals(other$dvirStatusData)) {
               Object this$defectData = this.getDefectData();
               Object other$defectData = other.getDefectData();
               return this$defectData == null ? other$defectData == null : this$defectData.equals(other$defectData);
            } else {
               return false;
            }
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof AddDvirDataDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $dvirStatusData = this.getDvirStatusData();
      result = result * 59 + ($dvirStatusData == null ? 43 : $dvirStatusData.hashCode());
      Object $defectData = this.getDefectData();
      return result * 59 + ($defectData == null ? 43 : $defectData.hashCode());
   }

   @Override
   public String toString() {
      return "AddDvirDataDto(dvirStatusData=" + this.getDvirStatusData() + ", defectData=" + this.getDefectData() + ")";
   }
}
