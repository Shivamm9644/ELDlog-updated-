package com.mes.eld_log.models;

import java.io.Serializable;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.core.mapping.Document;

@EntityScan
@Document(
   collection = "device_master"
)
public class DeviceMaster implements Serializable {
   private static final long serialVersionUID = 1L;
   private Integer deviceId;
   private long clientId;
   private long vehicleId;
   private String deviceNo;
   private String macId;
   private String serialNo;
   private long deviceModelId;
   private String billingDate;
   private long lBillingDate;
   private long warranty;
   private String warrantyFromDate;
   private long lWarrantyFromDate;
   private String warrantyToDate;
   private long lWarrantyToDate;
   private String status;
   private String malFunction;
   private String fwVersion;
   private long addedTimestamp;
   private long updatedTimestamp;

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof DeviceMaster)) {
         return false;
      } else {
         DeviceMaster other = (DeviceMaster)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else if (this.getVehicleId() != other.getVehicleId()) {
            return false;
         } else if (this.getDeviceModelId() != other.getDeviceModelId()) {
            return false;
         } else if (this.getLBillingDate() != other.getLBillingDate()) {
            return false;
         } else if (this.getWarranty() != other.getWarranty()) {
            return false;
         } else if (this.getLWarrantyFromDate() != other.getLWarrantyFromDate()) {
            return false;
         } else if (this.getLWarrantyToDate() != other.getLWarrantyToDate()) {
            return false;
         } else if (this.getAddedTimestamp() != other.getAddedTimestamp()) {
            return false;
         } else if (this.getUpdatedTimestamp() != other.getUpdatedTimestamp()) {
            return false;
         } else {
            Object this$deviceId = this.getDeviceId();
            Object other$deviceId = other.getDeviceId();
            if (this$deviceId == null ? other$deviceId == null : this$deviceId.equals(other$deviceId)) {
               Object this$deviceNo = this.getDeviceNo();
               Object other$deviceNo = other.getDeviceNo();
               if (this$deviceNo == null ? other$deviceNo == null : this$deviceNo.equals(other$deviceNo)) {
                  Object this$macId = this.getMacId();
                  Object other$macId = other.getMacId();
                  if (this$macId == null ? other$macId == null : this$macId.equals(other$macId)) {
                     Object this$serialNo = this.getSerialNo();
                     Object other$serialNo = other.getSerialNo();
                     if (this$serialNo == null ? other$serialNo == null : this$serialNo.equals(other$serialNo)) {
                        Object this$billingDate = this.getBillingDate();
                        Object other$billingDate = other.getBillingDate();
                        if (this$billingDate == null ? other$billingDate == null : this$billingDate.equals(other$billingDate)) {
                           Object this$warrantyFromDate = this.getWarrantyFromDate();
                           Object other$warrantyFromDate = other.getWarrantyFromDate();
                           if (this$warrantyFromDate == null ? other$warrantyFromDate == null : this$warrantyFromDate.equals(other$warrantyFromDate)) {
                              Object this$warrantyToDate = this.getWarrantyToDate();
                              Object other$warrantyToDate = other.getWarrantyToDate();
                              if (this$warrantyToDate == null ? other$warrantyToDate == null : this$warrantyToDate.equals(other$warrantyToDate)) {
                                 Object this$status = this.getStatus();
                                 Object other$status = other.getStatus();
                                 if (this$status == null ? other$status == null : this$status.equals(other$status)) {
                                    Object this$malFunction = this.getMalFunction();
                                    Object other$malFunction = other.getMalFunction();
                                    if (this$malFunction == null ? other$malFunction == null : this$malFunction.equals(other$malFunction)) {
                                       Object this$fwVersion = this.getFwVersion();
                                       Object other$fwVersion = other.getFwVersion();
                                       return this$fwVersion == null ? other$fwVersion == null : this$fwVersion.equals(other$fwVersion);
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
      return other instanceof DeviceMaster;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $clientId = this.getClientId();
      result = result * 59 + (int)($clientId >>> 32 ^ $clientId);
      long $vehicleId = this.getVehicleId();
      result = result * 59 + (int)($vehicleId >>> 32 ^ $vehicleId);
      long $deviceModelId = this.getDeviceModelId();
      result = result * 59 + (int)($deviceModelId >>> 32 ^ $deviceModelId);
      long $lBillingDate = this.getLBillingDate();
      result = result * 59 + (int)($lBillingDate >>> 32 ^ $lBillingDate);
      long $warranty = this.getWarranty();
      result = result * 59 + (int)($warranty >>> 32 ^ $warranty);
      long $lWarrantyFromDate = this.getLWarrantyFromDate();
      result = result * 59 + (int)($lWarrantyFromDate >>> 32 ^ $lWarrantyFromDate);
      long $lWarrantyToDate = this.getLWarrantyToDate();
      result = result * 59 + (int)($lWarrantyToDate >>> 32 ^ $lWarrantyToDate);
      long $addedTimestamp = this.getAddedTimestamp();
      result = result * 59 + (int)($addedTimestamp >>> 32 ^ $addedTimestamp);
      long $updatedTimestamp = this.getUpdatedTimestamp();
      result = result * 59 + (int)($updatedTimestamp >>> 32 ^ $updatedTimestamp);
      Object $deviceId = this.getDeviceId();
      result = result * 59 + ($deviceId == null ? 43 : $deviceId.hashCode());
      Object $deviceNo = this.getDeviceNo();
      result = result * 59 + ($deviceNo == null ? 43 : $deviceNo.hashCode());
      Object $macId = this.getMacId();
      result = result * 59 + ($macId == null ? 43 : $macId.hashCode());
      Object $serialNo = this.getSerialNo();
      result = result * 59 + ($serialNo == null ? 43 : $serialNo.hashCode());
      Object $billingDate = this.getBillingDate();
      result = result * 59 + ($billingDate == null ? 43 : $billingDate.hashCode());
      Object $warrantyFromDate = this.getWarrantyFromDate();
      result = result * 59 + ($warrantyFromDate == null ? 43 : $warrantyFromDate.hashCode());
      Object $warrantyToDate = this.getWarrantyToDate();
      result = result * 59 + ($warrantyToDate == null ? 43 : $warrantyToDate.hashCode());
      Object $status = this.getStatus();
      result = result * 59 + ($status == null ? 43 : $status.hashCode());
      Object $malFunction = this.getMalFunction();
      result = result * 59 + ($malFunction == null ? 43 : $malFunction.hashCode());
      Object $fwVersion = this.getFwVersion();
      return result * 59 + ($fwVersion == null ? 43 : $fwVersion.hashCode());
   }

   @Override
   public String toString() {
      return "DeviceMaster(deviceId="
         + this.getDeviceId()
         + ", clientId="
         + this.getClientId()
         + ", vehicleId="
         + this.getVehicleId()
         + ", deviceNo="
         + this.getDeviceNo()
         + ", macId="
         + this.getMacId()
         + ", serialNo="
         + this.getSerialNo()
         + ", deviceModelId="
         + this.getDeviceModelId()
         + ", billingDate="
         + this.getBillingDate()
         + ", lBillingDate="
         + this.getLBillingDate()
         + ", warranty="
         + this.getWarranty()
         + ", warrantyFromDate="
         + this.getWarrantyFromDate()
         + ", lWarrantyFromDate="
         + this.getLWarrantyFromDate()
         + ", warrantyToDate="
         + this.getWarrantyToDate()
         + ", lWarrantyToDate="
         + this.getLWarrantyToDate()
         + ", status="
         + this.getStatus()
         + ", malFunction="
         + this.getMalFunction()
         + ", fwVersion="
         + this.getFwVersion()
         + ", addedTimestamp="
         + this.getAddedTimestamp()
         + ", updatedTimestamp="
         + this.getUpdatedTimestamp()
         + ")";
   }

   public Integer getDeviceId() {
      return this.deviceId;
   }

   public long getClientId() {
      return this.clientId;
   }

   public long getVehicleId() {
      return this.vehicleId;
   }

   public String getDeviceNo() {
      return this.deviceNo;
   }

   public String getMacId() {
      return this.macId;
   }

   public String getSerialNo() {
      return this.serialNo;
   }

   public long getDeviceModelId() {
      return this.deviceModelId;
   }

   public String getBillingDate() {
      return this.billingDate;
   }

   public long getLBillingDate() {
      return this.lBillingDate;
   }

   public long getWarranty() {
      return this.warranty;
   }

   public String getWarrantyFromDate() {
      return this.warrantyFromDate;
   }

   public long getLWarrantyFromDate() {
      return this.lWarrantyFromDate;
   }

   public String getWarrantyToDate() {
      return this.warrantyToDate;
   }

   public long getLWarrantyToDate() {
      return this.lWarrantyToDate;
   }

   public String getStatus() {
      return this.status;
   }

   public String getMalFunction() {
      return this.malFunction;
   }

   public String getFwVersion() {
      return this.fwVersion;
   }

   public long getAddedTimestamp() {
      return this.addedTimestamp;
   }

   public long getUpdatedTimestamp() {
      return this.updatedTimestamp;
   }

   public void setDeviceId(final Integer deviceId) {
      this.deviceId = deviceId;
   }

   public void setClientId(final long clientId) {
      this.clientId = clientId;
   }

   public void setVehicleId(final long vehicleId) {
      this.vehicleId = vehicleId;
   }

   public void setDeviceNo(final String deviceNo) {
      this.deviceNo = deviceNo;
   }

   public void setMacId(final String macId) {
      this.macId = macId;
   }

   public void setSerialNo(final String serialNo) {
      this.serialNo = serialNo;
   }

   public void setDeviceModelId(final long deviceModelId) {
      this.deviceModelId = deviceModelId;
   }

   public void setBillingDate(final String billingDate) {
      this.billingDate = billingDate;
   }

   public void setLBillingDate(final long lBillingDate) {
      this.lBillingDate = lBillingDate;
   }

   public void setWarranty(final long warranty) {
      this.warranty = warranty;
   }

   public void setWarrantyFromDate(final String warrantyFromDate) {
      this.warrantyFromDate = warrantyFromDate;
   }

   public void setLWarrantyFromDate(final long lWarrantyFromDate) {
      this.lWarrantyFromDate = lWarrantyFromDate;
   }

   public void setWarrantyToDate(final String warrantyToDate) {
      this.warrantyToDate = warrantyToDate;
   }

   public void setLWarrantyToDate(final long lWarrantyToDate) {
      this.lWarrantyToDate = lWarrantyToDate;
   }

   public void setStatus(final String status) {
      this.status = status;
   }

   public void setMalFunction(final String malFunction) {
      this.malFunction = malFunction;
   }

   public void setFwVersion(final String fwVersion) {
      this.fwVersion = fwVersion;
   }

   public void setAddedTimestamp(final long addedTimestamp) {
      this.addedTimestamp = addedTimestamp;
   }

   public void setUpdatedTimestamp(final long updatedTimestamp) {
      this.updatedTimestamp = updatedTimestamp;
   }
}
