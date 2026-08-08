package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

public class CertifiedLogViewDto {
   @JsonProperty("_id")
   private String _id;
   @JsonProperty("driverId")
   private long driverId;
   @JsonProperty("driverName")
   private String driverName;
   @JsonProperty("vehicleId")
   private long vehicleId;
   @JsonProperty("vehicleName")
   private String vehicleName;
   @JsonProperty("trailers")
   private ArrayList trailers;
   @JsonProperty("shippingDocs")
   private ArrayList shippingDocs;
   @JsonProperty("coDriverId")
   private long coDriverId;
   @JsonProperty("coDriverName")
   private String coDriverName;
   @JsonProperty("certifiedSignature")
   private String certifiedSignature;
   @JsonProperty("certifiedDate")
   private String certifiedDate;
   @JsonProperty("lCertifiedDate")
   private long lCertifiedDate;
   @JsonProperty("certifiedDateTime")
   private long certifiedDateTime;
   @JsonProperty("certifiedAt")
   private long certifiedAt;
   @JsonProperty("addedTimestamp")
   private long addedTimestamp;

   public String get_id() {
      return this._id;
   }

   public long getDriverId() {
      return this.driverId;
   }

   public String getDriverName() {
      return this.driverName;
   }

   public long getVehicleId() {
      return this.vehicleId;
   }

   public String getVehicleName() {
      return this.vehicleName;
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

   public String getCoDriverName() {
      return this.coDriverName;
   }

   public String getCertifiedSignature() {
      return this.certifiedSignature;
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

   public long getAddedTimestamp() {
      return this.addedTimestamp;
   }

   @JsonProperty("_id")
   public void set_id(final String _id) {
      this._id = _id;
   }

   @JsonProperty("driverId")
   public void setDriverId(final long driverId) {
      this.driverId = driverId;
   }

   @JsonProperty("driverName")
   public void setDriverName(final String driverName) {
      this.driverName = driverName;
   }

   @JsonProperty("vehicleId")
   public void setVehicleId(final long vehicleId) {
      this.vehicleId = vehicleId;
   }

   @JsonProperty("vehicleName")
   public void setVehicleName(final String vehicleName) {
      this.vehicleName = vehicleName;
   }

   @JsonProperty("trailers")
   public void setTrailers(final ArrayList trailers) {
      this.trailers = trailers;
   }

   @JsonProperty("shippingDocs")
   public void setShippingDocs(final ArrayList shippingDocs) {
      this.shippingDocs = shippingDocs;
   }

   @JsonProperty("coDriverId")
   public void setCoDriverId(final long coDriverId) {
      this.coDriverId = coDriverId;
   }

   @JsonProperty("coDriverName")
   public void setCoDriverName(final String coDriverName) {
      this.coDriverName = coDriverName;
   }

   @JsonProperty("certifiedSignature")
   public void setCertifiedSignature(final String certifiedSignature) {
      this.certifiedSignature = certifiedSignature;
   }

   @JsonProperty("certifiedDate")
   public void setCertifiedDate(final String certifiedDate) {
      this.certifiedDate = certifiedDate;
   }

   @JsonProperty("lCertifiedDate")
   public void setLCertifiedDate(final long lCertifiedDate) {
      this.lCertifiedDate = lCertifiedDate;
   }

   @JsonProperty("certifiedDateTime")
   public void setCertifiedDateTime(final long certifiedDateTime) {
      this.certifiedDateTime = certifiedDateTime;
   }

   @JsonProperty("certifiedAt")
   public void setCertifiedAt(final long certifiedAt) {
      this.certifiedAt = certifiedAt;
   }

   @JsonProperty("addedTimestamp")
   public void setAddedTimestamp(final long addedTimestamp) {
      this.addedTimestamp = addedTimestamp;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof CertifiedLogViewDto)) {
         return false;
      } else {
         CertifiedLogViewDto other = (CertifiedLogViewDto)o;
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
         } else {
            Object this$_id = this.get_id();
            Object other$_id = other.get_id();
            if (this$_id == null ? other$_id == null : this$_id.equals(other$_id)) {
               Object this$driverName = this.getDriverName();
               Object other$driverName = other.getDriverName();
               if (this$driverName == null ? other$driverName == null : this$driverName.equals(other$driverName)) {
                  Object this$vehicleName = this.getVehicleName();
                  Object other$vehicleName = other.getVehicleName();
                  if (this$vehicleName == null ? other$vehicleName == null : this$vehicleName.equals(other$vehicleName)) {
                     Object this$trailers = this.getTrailers();
                     Object other$trailers = other.getTrailers();
                     if (this$trailers == null ? other$trailers == null : this$trailers.equals(other$trailers)) {
                        Object this$shippingDocs = this.getShippingDocs();
                        Object other$shippingDocs = other.getShippingDocs();
                        if (this$shippingDocs == null ? other$shippingDocs == null : this$shippingDocs.equals(other$shippingDocs)) {
                           Object this$coDriverName = this.getCoDriverName();
                           Object other$coDriverName = other.getCoDriverName();
                           if (this$coDriverName == null ? other$coDriverName == null : this$coDriverName.equals(other$coDriverName)) {
                              Object this$certifiedSignature = this.getCertifiedSignature();
                              Object other$certifiedSignature = other.getCertifiedSignature();
                              if (this$certifiedSignature == null
                                 ? other$certifiedSignature == null
                                 : this$certifiedSignature.equals(other$certifiedSignature)) {
                                 Object this$certifiedDate = this.getCertifiedDate();
                                 Object other$certifiedDate = other.getCertifiedDate();
                                 return this$certifiedDate == null ? other$certifiedDate == null : this$certifiedDate.equals(other$certifiedDate);
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
      return other instanceof CertifiedLogViewDto;
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
      Object $_id = this.get_id();
      result = result * 59 + ($_id == null ? 43 : $_id.hashCode());
      Object $driverName = this.getDriverName();
      result = result * 59 + ($driverName == null ? 43 : $driverName.hashCode());
      Object $vehicleName = this.getVehicleName();
      result = result * 59 + ($vehicleName == null ? 43 : $vehicleName.hashCode());
      Object $trailers = this.getTrailers();
      result = result * 59 + ($trailers == null ? 43 : $trailers.hashCode());
      Object $shippingDocs = this.getShippingDocs();
      result = result * 59 + ($shippingDocs == null ? 43 : $shippingDocs.hashCode());
      Object $coDriverName = this.getCoDriverName();
      result = result * 59 + ($coDriverName == null ? 43 : $coDriverName.hashCode());
      Object $certifiedSignature = this.getCertifiedSignature();
      result = result * 59 + ($certifiedSignature == null ? 43 : $certifiedSignature.hashCode());
      Object $certifiedDate = this.getCertifiedDate();
      return result * 59 + ($certifiedDate == null ? 43 : $certifiedDate.hashCode());
   }

   @Override
   public String toString() {
      return "CertifiedLogViewDto(_id="
         + this.get_id()
         + ", driverId="
         + this.getDriverId()
         + ", driverName="
         + this.getDriverName()
         + ", vehicleId="
         + this.getVehicleId()
         + ", vehicleName="
         + this.getVehicleName()
         + ", trailers="
         + this.getTrailers()
         + ", shippingDocs="
         + this.getShippingDocs()
         + ", coDriverId="
         + this.getCoDriverId()
         + ", coDriverName="
         + this.getCoDriverName()
         + ", certifiedSignature="
         + this.getCertifiedSignature()
         + ", certifiedDate="
         + this.getCertifiedDate()
         + ", lCertifiedDate="
         + this.getLCertifiedDate()
         + ", certifiedDateTime="
         + this.getCertifiedDateTime()
         + ", certifiedAt="
         + this.getCertifiedAt()
         + ", addedTimestamp="
         + this.getAddedTimestamp()
         + ")";
   }
}
