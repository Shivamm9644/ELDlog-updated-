package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mes.eld_log.models.CertifiedLog;
import java.util.ArrayList;

public class AddCertifiedLogDto {
   @JsonProperty("certifiedLogData")
   private ArrayList<CertifiedLog> certifiedLogData;

   public ArrayList<CertifiedLog> getCertifiedLogData() {
      return this.certifiedLogData;
   }

   @JsonProperty("certifiedLogData")
   public void setCertifiedLogData(final ArrayList<CertifiedLog> certifiedLogData) {
      this.certifiedLogData = certifiedLogData;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof AddCertifiedLogDto)) {
         return false;
      } else {
         AddCertifiedLogDto other = (AddCertifiedLogDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$certifiedLogData = this.getCertifiedLogData();
            Object other$certifiedLogData = other.getCertifiedLogData();
            return this$certifiedLogData == null ? other$certifiedLogData == null : this$certifiedLogData.equals(other$certifiedLogData);
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof AddCertifiedLogDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $certifiedLogData = this.getCertifiedLogData();
      return result * 59 + ($certifiedLogData == null ? 43 : $certifiedLogData.hashCode());
   }

   @Override
   public String toString() {
      return "AddCertifiedLogDto(certifiedLogData=" + this.getCertifiedLogData() + ")";
   }
}
