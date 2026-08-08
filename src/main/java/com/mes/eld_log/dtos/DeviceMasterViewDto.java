package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DeviceMasterViewDto {
   @JsonProperty("deviceId")
   private Integer deviceId;
   @JsonProperty("clientId")
   private long clientId;
   @JsonProperty("clientName")
   private String clientName;
   @JsonProperty("vehicleId")
   private long vehicleId;
   @JsonProperty("vehicleNo")
   private String vehicleNo;
   @JsonProperty("deviceNo")
   private String deviceNo;
   @JsonProperty("macId")
   private String macId;
   @JsonProperty("serialNo")
   private String serialNo;
   @JsonProperty("deviceModelId")
   private long deviceModelId;
   @JsonProperty("deviceModelName")
   private String deviceModelName;
   @JsonProperty("billingDate")
   private String billingDate;
   @JsonProperty("lBillingDate")
   private long lBillingDate;
   @JsonProperty("warranty")
   private long warranty;
   @JsonProperty("warrantyFromDate")
   private String warrantyFromDate;
   @JsonProperty("lWarrantyFromDate")
   private long lWarrantyFromDate;
   @JsonProperty("warrantyToDate")
   private String warrantyToDate;
   @JsonProperty("lWarrantyToDate")
   private long lWarrantyToDate;
   @JsonProperty("status")
   private String status;
   @JsonProperty("malFunction")
   private String malFunction;
   @JsonProperty("fwVersion")
   private String fwVersion;
   @JsonProperty("addedTimestamp")
   private long addedTimestamp;
   @JsonProperty("updatedTimestamp")
   private long updatedTimestamp;

   public Integer getDeviceId() {
      return this.deviceId;
   }

   public long getClientId() {
      return this.clientId;
   }

   public String getClientName() {
      return this.clientName;
   }

   public long getVehicleId() {
      return this.vehicleId;
   }

   public String getVehicleNo() {
      return this.vehicleNo;
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

   public String getDeviceModelName() {
      return this.deviceModelName;
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

   @JsonProperty("deviceId")
   public void setDeviceId(final Integer deviceId) {
      this.deviceId = deviceId;
   }

   @JsonProperty("clientId")
   public void setClientId(final long clientId) {
      this.clientId = clientId;
   }

   @JsonProperty("clientName")
   public void setClientName(final String clientName) {
      this.clientName = clientName;
   }

   @JsonProperty("vehicleId")
   public void setVehicleId(final long vehicleId) {
      this.vehicleId = vehicleId;
   }

   @JsonProperty("vehicleNo")
   public void setVehicleNo(final String vehicleNo) {
      this.vehicleNo = vehicleNo;
   }

   @JsonProperty("deviceNo")
   public void setDeviceNo(final String deviceNo) {
      this.deviceNo = deviceNo;
   }

   @JsonProperty("macId")
   public void setMacId(final String macId) {
      this.macId = macId;
   }

   @JsonProperty("serialNo")
   public void setSerialNo(final String serialNo) {
      this.serialNo = serialNo;
   }

   @JsonProperty("deviceModelId")
   public void setDeviceModelId(final long deviceModelId) {
      this.deviceModelId = deviceModelId;
   }

   @JsonProperty("deviceModelName")
   public void setDeviceModelName(final String deviceModelName) {
      this.deviceModelName = deviceModelName;
   }

   @JsonProperty("billingDate")
   public void setBillingDate(final String billingDate) {
      this.billingDate = billingDate;
   }

   @JsonProperty("lBillingDate")
   public void setLBillingDate(final long lBillingDate) {
      this.lBillingDate = lBillingDate;
   }

   @JsonProperty("warranty")
   public void setWarranty(final long warranty) {
      this.warranty = warranty;
   }

   @JsonProperty("warrantyFromDate")
   public void setWarrantyFromDate(final String warrantyFromDate) {
      this.warrantyFromDate = warrantyFromDate;
   }

   @JsonProperty("lWarrantyFromDate")
   public void setLWarrantyFromDate(final long lWarrantyFromDate) {
      this.lWarrantyFromDate = lWarrantyFromDate;
   }

   @JsonProperty("warrantyToDate")
   public void setWarrantyToDate(final String warrantyToDate) {
      this.warrantyToDate = warrantyToDate;
   }

   @JsonProperty("lWarrantyToDate")
   public void setLWarrantyToDate(final long lWarrantyToDate) {
      this.lWarrantyToDate = lWarrantyToDate;
   }

   @JsonProperty("status")
   public void setStatus(final String status) {
      this.status = status;
   }

   @JsonProperty("malFunction")
   public void setMalFunction(final String malFunction) {
      this.malFunction = malFunction;
   }

   @JsonProperty("fwVersion")
   public void setFwVersion(final String fwVersion) {
      this.fwVersion = fwVersion;
   }

   @JsonProperty("addedTimestamp")
   public void setAddedTimestamp(final long addedTimestamp) {
      this.addedTimestamp = addedTimestamp;
   }

   @JsonProperty("updatedTimestamp")
   public void setUpdatedTimestamp(final long updatedTimestamp) {
      this.updatedTimestamp = updatedTimestamp;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof DeviceMasterViewDto)) {
         return false;
      } else {
         DeviceMasterViewDto other = (DeviceMasterViewDto)o;
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
               Object this$clientName = this.getClientName();
               Object other$clientName = other.getClientName();
               if (this$clientName == null ? other$clientName == null : this$clientName.equals(other$clientName)) {
                  Object this$vehicleNo = this.getVehicleNo();
                  Object other$vehicleNo = other.getVehicleNo();
                  if (this$vehicleNo == null ? other$vehicleNo == null : this$vehicleNo.equals(other$vehicleNo)) {
                     Object this$deviceNo = this.getDeviceNo();
                     Object other$deviceNo = other.getDeviceNo();
                     if (this$deviceNo == null ? other$deviceNo == null : this$deviceNo.equals(other$deviceNo)) {
                        Object this$macId = this.getMacId();
                        Object other$macId = other.getMacId();
                        if (this$macId == null ? other$macId == null : this$macId.equals(other$macId)) {
                           Object this$serialNo = this.getSerialNo();
                           Object other$serialNo = other.getSerialNo();
                           if (this$serialNo == null ? other$serialNo == null : this$serialNo.equals(other$serialNo)) {
                              Object this$deviceModelName = this.getDeviceModelName();
                              Object other$deviceModelName = other.getDeviceModelName();
                              if (this$deviceModelName == null ? other$deviceModelName == null : this$deviceModelName.equals(other$deviceModelName)) {
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
      return other instanceof DeviceMasterViewDto;
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
      Object $clientName = this.getClientName();
      result = result * 59 + ($clientName == null ? 43 : $clientName.hashCode());
      Object $vehicleNo = this.getVehicleNo();
      result = result * 59 + ($vehicleNo == null ? 43 : $vehicleNo.hashCode());
      Object $deviceNo = this.getDeviceNo();
      result = result * 59 + ($deviceNo == null ? 43 : $deviceNo.hashCode());
      Object $macId = this.getMacId();
      result = result * 59 + ($macId == null ? 43 : $macId.hashCode());
      Object $serialNo = this.getSerialNo();
      result = result * 59 + ($serialNo == null ? 43 : $serialNo.hashCode());
      Object $deviceModelName = this.getDeviceModelName();
      result = result * 59 + ($deviceModelName == null ? 43 : $deviceModelName.hashCode());
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
      return "DeviceMasterViewDto(deviceId="
         + this.getDeviceId()
         + ", clientId="
         + this.getClientId()
         + ", clientName="
         + this.getClientName()
         + ", vehicleId="
         + this.getVehicleId()
         + ", vehicleNo="
         + this.getVehicleNo()
         + ", deviceNo="
         + this.getDeviceNo()
         + ", macId="
         + this.getMacId()
         + ", serialNo="
         + this.getSerialNo()
         + ", deviceModelId="
         + this.getDeviceModelId()
         + ", deviceModelName="
         + this.getDeviceModelName()
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
}
