package com.mes.eld_log.models;

import java.io.Serializable;
import java.util.ArrayList;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.core.mapping.Document;

@EntityScan
@Document(
   collection = "certified_log"
)
public class CertifiedLog implements Serializable {
   private static final long serialVersionUID = 1L;
   private long driverId;
   private String localId;
   private String tokenNo;
   private long vehicleId;
   private ArrayList trailers;
   private ArrayList shippingDocs;
   private long coDriverId;
   private String certifiedDate;
   private long lCertifiedDate;
   private long certifiedDateTime;
   private long certifiedAt;
   private String certifiedSignature;
   private long addedTimestamp;
   private long updatedTimestamp;
   private Boolean isCertified;

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof CertifiedLog)) {
         return false;
      } else {
         CertifiedLog other = (CertifiedLog)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getDriverId() != other.getDriverId()) {
            return false;
         } else if (this.getVehicleId() != other.getVehicleId()) {
            return false;
         } else if (this.getCoDriverId() != other.getCoDriverId()) {
            return false;
         } else if (this.getLCertifiedDate() != other.getLCertifiedDate()) {
            return false;
         } else if (this.getCertifiedDateTime() != other.getCertifiedDateTime()) {
            return false;
         } else if (this.getCertifiedAt() != other.getCertifiedAt()) {
            return false;
         } else if (this.getAddedTimestamp() != other.getAddedTimestamp()) {
            return false;
         } else if (this.getUpdatedTimestamp() != other.getUpdatedTimestamp()) {
            return false;
         } else {
            Object this$localId = this.getLocalId();
            Object other$localId = other.getLocalId();
            if (this$localId == null ? other$localId == null : this$localId.equals(other$localId)) {
               Object this$tokenNo = this.getTokenNo();
               Object other$tokenNo = other.getTokenNo();
               if (this$tokenNo == null ? other$tokenNo == null : this$tokenNo.equals(other$tokenNo)) {
                  Object this$trailers = this.getTrailers();
                  Object other$trailers = other.getTrailers();
                  if (this$trailers == null ? other$trailers == null : this$trailers.equals(other$trailers)) {
                     Object this$shippingDocs = this.getShippingDocs();
                     Object other$shippingDocs = other.getShippingDocs();
                     if (this$shippingDocs == null ? other$shippingDocs == null : this$shippingDocs.equals(other$shippingDocs)) {
                        Object this$certifiedDate = this.getCertifiedDate();
                        Object other$certifiedDate = other.getCertifiedDate();
                        if (this$certifiedDate == null ? other$certifiedDate == null : this$certifiedDate.equals(other$certifiedDate)) {
                           Object this$certifiedSignature = this.getCertifiedSignature();
                           Object other$certifiedSignature = other.getCertifiedSignature();
                           return this$certifiedSignature == null
                              ? other$certifiedSignature == null
                              : this$certifiedSignature.equals(other$certifiedSignature);
                        } else {
                           return false;
                        }
                     } else {
                        return false;
                     }
                  } else {
                     return false;
                  }
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
      return other instanceof CertifiedLog;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $driverId = this.getDriverId();
      result = result * 59 + (int)($driverId >>> 32 ^ $driverId);
      long $vehicleId = this.getVehicleId();
      result = result * 59 + (int)($vehicleId >>> 32 ^ $vehicleId);
      long $coDriverId = this.getCoDriverId();
      result = result * 59 + (int)($coDriverId >>> 32 ^ $coDriverId);
      long $lCertifiedDate = this.getLCertifiedDate();
      result = result * 59 + (int)($lCertifiedDate >>> 32 ^ $lCertifiedDate);
      long $certifiedDateTime = this.getCertifiedDateTime();
      result = result * 59 + (int)($certifiedDateTime >>> 32 ^ $certifiedDateTime);
      long $certifiedAt = this.getCertifiedAt();
      result = result * 59 + (int)($certifiedAt >>> 32 ^ $certifiedAt);
      long $addedTimestamp = this.getAddedTimestamp();
      result = result * 59 + (int)($addedTimestamp >>> 32 ^ $addedTimestamp);
      long $updatedTimestamp = this.getUpdatedTimestamp();
      result = result * 59 + (int)($updatedTimestamp >>> 32 ^ $updatedTimestamp);
      Object $localId = this.getLocalId();
      result = result * 59 + ($localId == null ? 43 : $localId.hashCode());
      Object $tokenNo = this.getTokenNo();
      result = result * 59 + ($tokenNo == null ? 43 : $tokenNo.hashCode());
      Object $trailers = this.getTrailers();
      result = result * 59 + ($trailers == null ? 43 : $trailers.hashCode());
      Object $shippingDocs = this.getShippingDocs();
      result = result * 59 + ($shippingDocs == null ? 43 : $shippingDocs.hashCode());
      Object $certifiedDate = this.getCertifiedDate();
      result = result * 59 + ($certifiedDate == null ? 43 : $certifiedDate.hashCode());
      Object $certifiedSignature = this.getCertifiedSignature();
      return result * 59 + ($certifiedSignature == null ? 43 : $certifiedSignature.hashCode());
   }

   @Override
   public String toString() {
      return "CertifiedLog(driverId="
         + this.getDriverId()
         + ", localId="
         + this.getLocalId()
         + ", tokenNo="
         + this.getTokenNo()
         + ", vehicleId="
         + this.getVehicleId()
         + ", trailers="
         + this.getTrailers()
         + ", shippingDocs="
         + this.getShippingDocs()
         + ", coDriverId="
         + this.getCoDriverId()
         + ", certifiedDate="
         + this.getCertifiedDate()
         + ", lCertifiedDate="
         + this.getLCertifiedDate()
         + ", certifiedDateTime="
         + this.getCertifiedDateTime()
         + ", certifiedAt="
         + this.getCertifiedAt()
         + ", certifiedSignature="
         + this.getCertifiedSignature()
         + ", addedTimestamp="
         + this.getAddedTimestamp()
         + ", updatedTimestamp="
         + this.getUpdatedTimestamp()
         + ")";
   }

   public long getDriverId() {
      return this.driverId;
   }

   public String getLocalId() {
      return this.localId;
   }

   public String getTokenNo() {
      return this.tokenNo;
   }

   public long getVehicleId() {
      return this.vehicleId;
   }

   public ArrayList getTrailers() {
      return this.trailers;
   }

   public ArrayList getShippingDocs() {
      return this.shippingDocs;
   }

   public long getCoDriverId() {
      return this.coDriverId;
   }

   public String getCertifiedDate() {
      return this.certifiedDate;
   }

   public long getLCertifiedDate() {
      return this.lCertifiedDate;
   }

   public long getCertifiedDateTime() {
      return this.certifiedDateTime;
   }

   public long getCertifiedAt() {
      return this.certifiedAt;
   }

   public String getCertifiedSignature() {
      return this.certifiedSignature;
   }

   public long getAddedTimestamp() {
      return this.addedTimestamp;
   }

   public long getUpdatedTimestamp() {
      return this.updatedTimestamp;
   }

   public void setDriverId(final long driverId) {
      this.driverId = driverId;
   }

   public void setLocalId(final String localId) {
      this.localId = localId;
   }

   public void setTokenNo(final String tokenNo) {
      this.tokenNo = tokenNo;
   }

   public void setVehicleId(final long vehicleId) {
      this.vehicleId = vehicleId;
   }

   public void setTrailers(final ArrayList trailers) {
      this.trailers = trailers;
   }

   public void setShippingDocs(final ArrayList shippingDocs) {
      this.shippingDocs = shippingDocs;
   }

   public void setCoDriverId(final long coDriverId) {
      this.coDriverId = coDriverId;
   }

   public void setCertifiedDate(final String certifiedDate) {
      this.certifiedDate = certifiedDate;
   }

   public void setLCertifiedDate(final long lCertifiedDate) {
      this.lCertifiedDate = lCertifiedDate;
   }

   public void setCertifiedDateTime(final long certifiedDateTime) {
      this.certifiedDateTime = certifiedDateTime;
   }

   public void setCertifiedAt(final long certifiedAt) {
      this.certifiedAt = certifiedAt;
   }

   public void setCertifiedSignature(final String certifiedSignature) {
      this.certifiedSignature = certifiedSignature;
   }

   public void setAddedTimestamp(final long addedTimestamp) {
      this.addedTimestamp = addedTimestamp;
   }

   public void setUpdatedTimestamp(final long updatedTimestamp) {
      this.updatedTimestamp = updatedTimestamp;
   }

   public Boolean getIsCertified() {
      return this.isCertified;
   }

   public void setIsCertified(final Boolean isCertified) {
      this.isCertified = isCertified;
   }
}
