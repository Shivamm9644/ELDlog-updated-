package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

public class CertifiedLogCRUDDto {
   @JsonProperty("fromDate")
   private String fromDate;
   @JsonProperty("toDate")
   private String toDate;
   @JsonProperty("driverId")
   private long driverId;
   @JsonProperty("email")
   private String email;
   @JsonProperty("certifiedLogId")
   private String certifiedLogId;
   @JsonProperty("trailers")
   private ArrayList trailers;
   @JsonProperty("shippingDocs")
   private ArrayList shippingDocs;
   @JsonProperty("coDriverId")
   private long coDriverId;

   public String getFromDate() {
      return this.fromDate;
   }

   public String getToDate() {
      return this.toDate;
   }

   public long getDriverId() {
      return this.driverId;
   }

   public String getEmail() {
      return this.email;
   }

   public String getCertifiedLogId() {
      return this.certifiedLogId;
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

   @JsonProperty("fromDate")
   public void setFromDate(final String fromDate) {
      this.fromDate = fromDate;
   }

   @JsonProperty("toDate")
   public void setToDate(final String toDate) {
      this.toDate = toDate;
   }

   @JsonProperty("driverId")
   public void setDriverId(final long driverId) {
      this.driverId = driverId;
   }

   @JsonProperty("email")
   public void setEmail(final String email) {
      this.email = email;
   }

   @JsonProperty("certifiedLogId")
   public void setCertifiedLogId(final String certifiedLogId) {
      this.certifiedLogId = certifiedLogId;
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

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof CertifiedLogCRUDDto)) {
         return false;
      } else {
         CertifiedLogCRUDDto other = (CertifiedLogCRUDDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getDriverId() != other.getDriverId()) {
            return false;
         } else if (this.getCoDriverId() != other.getCoDriverId()) {
            return false;
         } else {
            Object this$fromDate = this.getFromDate();
            Object other$fromDate = other.getFromDate();
            if (this$fromDate == null ? other$fromDate == null : this$fromDate.equals(other$fromDate)) {
               Object this$toDate = this.getToDate();
               Object other$toDate = other.getToDate();
               if (this$toDate == null ? other$toDate == null : this$toDate.equals(other$toDate)) {
                  Object this$email = this.getEmail();
                  Object other$email = other.getEmail();
                  if (this$email == null ? other$email == null : this$email.equals(other$email)) {
                     Object this$certifiedLogId = this.getCertifiedLogId();
                     Object other$certifiedLogId = other.getCertifiedLogId();
                     if (this$certifiedLogId == null ? other$certifiedLogId == null : this$certifiedLogId.equals(other$certifiedLogId)) {
                        Object this$trailers = this.getTrailers();
                        Object other$trailers = other.getTrailers();
                        if (this$trailers == null ? other$trailers == null : this$trailers.equals(other$trailers)) {
                           Object this$shippingDocs = this.getShippingDocs();
                           Object other$shippingDocs = other.getShippingDocs();
                           return this$shippingDocs == null ? other$shippingDocs == null : this$shippingDocs.equals(other$shippingDocs);
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
      return other instanceof CertifiedLogCRUDDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $driverId = this.getDriverId();
      result = result * 59 + (int)($driverId >>> 32 ^ $driverId);
      long $coDriverId = this.getCoDriverId();
      result = result * 59 + (int)($coDriverId >>> 32 ^ $coDriverId);
      Object $fromDate = this.getFromDate();
      result = result * 59 + ($fromDate == null ? 43 : $fromDate.hashCode());
      Object $toDate = this.getToDate();
      result = result * 59 + ($toDate == null ? 43 : $toDate.hashCode());
      Object $email = this.getEmail();
      result = result * 59 + ($email == null ? 43 : $email.hashCode());
      Object $certifiedLogId = this.getCertifiedLogId();
      result = result * 59 + ($certifiedLogId == null ? 43 : $certifiedLogId.hashCode());
      Object $trailers = this.getTrailers();
      result = result * 59 + ($trailers == null ? 43 : $trailers.hashCode());
      Object $shippingDocs = this.getShippingDocs();
      return result * 59 + ($shippingDocs == null ? 43 : $shippingDocs.hashCode());
   }

   @Override
   public String toString() {
      return "CertifiedLogCRUDDto(fromDate="
         + this.getFromDate()
         + ", toDate="
         + this.getToDate()
         + ", driverId="
         + this.getDriverId()
         + ", email="
         + this.getEmail()
         + ", certifiedLogId="
         + this.getCertifiedLogId()
         + ", trailers="
         + this.getTrailers()
         + ", shippingDocs="
         + this.getShippingDocs()
         + ", coDriverId="
         + this.getCoDriverId()
         + ")";
   }
}
