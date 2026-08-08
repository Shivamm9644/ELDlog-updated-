package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VehicleMasterViewDto {
   @JsonProperty("vehicleId")
   private Integer vehicleId;
   @JsonProperty("clientId")
   private long clientId;
   @JsonProperty("vehicleNo")
   private String vehicleNo;
   @JsonProperty("make")
   private String make;
   @JsonProperty("model")
   private String model;
   @JsonProperty("manufacturingYear")
   private long manufacturingYear;
   @JsonProperty("licensePlate")
   private String licensePlate;
   @JsonProperty("countryId")
   private long countryId;
   @JsonProperty("stateId")
   private long stateId;
   @JsonProperty("vin")
   private String vin;
   @JsonProperty("fuelTypeId")
   private long fuelTypeId;
   @JsonProperty("deviceId")
   private long deviceId;
   @JsonProperty("deviceName")
   private String deviceName;
   @JsonProperty("status")
   private String status;
   @JsonProperty("eldConnectionInterfaceId")
   private long eldConnectionInterfaceId;
   @JsonProperty("macAddress")
   private String macAddress;
   @JsonProperty("serialNo")
   private String serialNo;
   @JsonProperty("version")
   private String version;
   @JsonProperty("modelNo")
   private String modelNo;
   @JsonProperty("deviceStatus")
   private String deviceStatus;
   @JsonProperty("addedTimestamp")
   private long addedTimestamp;
   @JsonProperty("updatedTimestamp")
   private long updatedTimestamp;

   public Integer getVehicleId() {
      return this.vehicleId;
   }

   public long getClientId() {
      return this.clientId;
   }

   public String getVehicleNo() {
      return this.vehicleNo;
   }

   public String getMake() {
      return this.make;
   }

   public String getModel() {
      return this.model;
   }

   public long getManufacturingYear() {
      return this.manufacturingYear;
   }

   public String getLicensePlate() {
      return this.licensePlate;
   }

   public long getCountryId() {
      return this.countryId;
   }

   public long getStateId() {
      return this.stateId;
   }

   public String getVin() {
      return this.vin;
   }

   public long getFuelTypeId() {
      return this.fuelTypeId;
   }

   public long getDeviceId() {
      return this.deviceId;
   }

   public String getDeviceName() {
      return this.deviceName;
   }

   public String getStatus() {
      return this.status;
   }

   public long getEldConnectionInterfaceId() {
      return this.eldConnectionInterfaceId;
   }

   public String getMacAddress() {
      return this.macAddress;
   }

   public String getSerialNo() {
      return this.serialNo;
   }

   public String getVersion() {
      return this.version;
   }

   public String getModelNo() {
      return this.modelNo;
   }

   public String getDeviceStatus() {
      return this.deviceStatus;
   }

   public long getAddedTimestamp() {
      return this.addedTimestamp;
   }

   public long getUpdatedTimestamp() {
      return this.updatedTimestamp;
   }

   @JsonProperty("vehicleId")
   public void setVehicleId(final Integer vehicleId) {
      this.vehicleId = vehicleId;
   }

   @JsonProperty("clientId")
   public void setClientId(final long clientId) {
      this.clientId = clientId;
   }

   @JsonProperty("vehicleNo")
   public void setVehicleNo(final String vehicleNo) {
      this.vehicleNo = vehicleNo;
   }

   @JsonProperty("make")
   public void setMake(final String make) {
      this.make = make;
   }

   @JsonProperty("model")
   public void setModel(final String model) {
      this.model = model;
   }

   @JsonProperty("manufacturingYear")
   public void setManufacturingYear(final long manufacturingYear) {
      this.manufacturingYear = manufacturingYear;
   }

   @JsonProperty("licensePlate")
   public void setLicensePlate(final String licensePlate) {
      this.licensePlate = licensePlate;
   }

   @JsonProperty("countryId")
   public void setCountryId(final long countryId) {
      this.countryId = countryId;
   }

   @JsonProperty("stateId")
   public void setStateId(final long stateId) {
      this.stateId = stateId;
   }

   @JsonProperty("vin")
   public void setVin(final String vin) {
      this.vin = vin;
   }

   @JsonProperty("fuelTypeId")
   public void setFuelTypeId(final long fuelTypeId) {
      this.fuelTypeId = fuelTypeId;
   }

   @JsonProperty("deviceId")
   public void setDeviceId(final long deviceId) {
      this.deviceId = deviceId;
   }

   @JsonProperty("deviceName")
   public void setDeviceName(final String deviceName) {
      this.deviceName = deviceName;
   }

   @JsonProperty("status")
   public void setStatus(final String status) {
      this.status = status;
   }

   @JsonProperty("eldConnectionInterfaceId")
   public void setEldConnectionInterfaceId(final long eldConnectionInterfaceId) {
      this.eldConnectionInterfaceId = eldConnectionInterfaceId;
   }

   @JsonProperty("macAddress")
   public void setMacAddress(final String macAddress) {
      this.macAddress = macAddress;
   }

   @JsonProperty("serialNo")
   public void setSerialNo(final String serialNo) {
      this.serialNo = serialNo;
   }

   @JsonProperty("version")
   public void setVersion(final String version) {
      this.version = version;
   }

   @JsonProperty("modelNo")
   public void setModelNo(final String modelNo) {
      this.modelNo = modelNo;
   }

   @JsonProperty("deviceStatus")
   public void setDeviceStatus(final String deviceStatus) {
      this.deviceStatus = deviceStatus;
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
      } else if (!(o instanceof VehicleMasterViewDto)) {
         return false;
      } else {
         VehicleMasterViewDto other = (VehicleMasterViewDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else if (this.getManufacturingYear() != other.getManufacturingYear()) {
            return false;
         } else if (this.getCountryId() != other.getCountryId()) {
            return false;
         } else if (this.getStateId() != other.getStateId()) {
            return false;
         } else if (this.getFuelTypeId() != other.getFuelTypeId()) {
            return false;
         } else if (this.getDeviceId() != other.getDeviceId()) {
            return false;
         } else if (this.getEldConnectionInterfaceId() != other.getEldConnectionInterfaceId()) {
            return false;
         } else if (this.getAddedTimestamp() != other.getAddedTimestamp()) {
            return false;
         } else if (this.getUpdatedTimestamp() != other.getUpdatedTimestamp()) {
            return false;
         } else {
            Object this$vehicleId = this.getVehicleId();
            Object other$vehicleId = other.getVehicleId();
            if (this$vehicleId == null ? other$vehicleId == null : this$vehicleId.equals(other$vehicleId)) {
               Object this$vehicleNo = this.getVehicleNo();
               Object other$vehicleNo = other.getVehicleNo();
               if (this$vehicleNo == null ? other$vehicleNo == null : this$vehicleNo.equals(other$vehicleNo)) {
                  Object this$make = this.getMake();
                  Object other$make = other.getMake();
                  if (this$make == null ? other$make == null : this$make.equals(other$make)) {
                     Object this$model = this.getModel();
                     Object other$model = other.getModel();
                     if (this$model == null ? other$model == null : this$model.equals(other$model)) {
                        Object this$licensePlate = this.getLicensePlate();
                        Object other$licensePlate = other.getLicensePlate();
                        if (this$licensePlate == null ? other$licensePlate == null : this$licensePlate.equals(other$licensePlate)) {
                           Object this$vin = this.getVin();
                           Object other$vin = other.getVin();
                           if (this$vin == null ? other$vin == null : this$vin.equals(other$vin)) {
                              Object this$deviceName = this.getDeviceName();
                              Object other$deviceName = other.getDeviceName();
                              if (this$deviceName == null ? other$deviceName == null : this$deviceName.equals(other$deviceName)) {
                                 Object this$status = this.getStatus();
                                 Object other$status = other.getStatus();
                                 if (this$status == null ? other$status == null : this$status.equals(other$status)) {
                                    Object this$macAddress = this.getMacAddress();
                                    Object other$macAddress = other.getMacAddress();
                                    if (this$macAddress == null ? other$macAddress == null : this$macAddress.equals(other$macAddress)) {
                                       Object this$serialNo = this.getSerialNo();
                                       Object other$serialNo = other.getSerialNo();
                                       if (this$serialNo == null ? other$serialNo == null : this$serialNo.equals(other$serialNo)) {
                                          Object this$version = this.getVersion();
                                          Object other$version = other.getVersion();
                                          if (this$version == null ? other$version == null : this$version.equals(other$version)) {
                                             Object this$modelNo = this.getModelNo();
                                             Object other$modelNo = other.getModelNo();
                                             if (this$modelNo == null ? other$modelNo == null : this$modelNo.equals(other$modelNo)) {
                                                Object this$deviceStatus = this.getDeviceStatus();
                                                Object other$deviceStatus = other.getDeviceStatus();
                                                return this$deviceStatus == null ? other$deviceStatus == null : this$deviceStatus.equals(other$deviceStatus);
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
      return other instanceof VehicleMasterViewDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $clientId = this.getClientId();
      result = result * 59 + (int)($clientId >>> 32 ^ $clientId);
      long $manufacturingYear = this.getManufacturingYear();
      result = result * 59 + (int)($manufacturingYear >>> 32 ^ $manufacturingYear);
      long $countryId = this.getCountryId();
      result = result * 59 + (int)($countryId >>> 32 ^ $countryId);
      long $stateId = this.getStateId();
      result = result * 59 + (int)($stateId >>> 32 ^ $stateId);
      long $fuelTypeId = this.getFuelTypeId();
      result = result * 59 + (int)($fuelTypeId >>> 32 ^ $fuelTypeId);
      long $deviceId = this.getDeviceId();
      result = result * 59 + (int)($deviceId >>> 32 ^ $deviceId);
      long $eldConnectionInterfaceId = this.getEldConnectionInterfaceId();
      result = result * 59 + (int)($eldConnectionInterfaceId >>> 32 ^ $eldConnectionInterfaceId);
      long $addedTimestamp = this.getAddedTimestamp();
      result = result * 59 + (int)($addedTimestamp >>> 32 ^ $addedTimestamp);
      long $updatedTimestamp = this.getUpdatedTimestamp();
      result = result * 59 + (int)($updatedTimestamp >>> 32 ^ $updatedTimestamp);
      Object $vehicleId = this.getVehicleId();
      result = result * 59 + ($vehicleId == null ? 43 : $vehicleId.hashCode());
      Object $vehicleNo = this.getVehicleNo();
      result = result * 59 + ($vehicleNo == null ? 43 : $vehicleNo.hashCode());
      Object $make = this.getMake();
      result = result * 59 + ($make == null ? 43 : $make.hashCode());
      Object $model = this.getModel();
      result = result * 59 + ($model == null ? 43 : $model.hashCode());
      Object $licensePlate = this.getLicensePlate();
      result = result * 59 + ($licensePlate == null ? 43 : $licensePlate.hashCode());
      Object $vin = this.getVin();
      result = result * 59 + ($vin == null ? 43 : $vin.hashCode());
      Object $deviceName = this.getDeviceName();
      result = result * 59 + ($deviceName == null ? 43 : $deviceName.hashCode());
      Object $status = this.getStatus();
      result = result * 59 + ($status == null ? 43 : $status.hashCode());
      Object $macAddress = this.getMacAddress();
      result = result * 59 + ($macAddress == null ? 43 : $macAddress.hashCode());
      Object $serialNo = this.getSerialNo();
      result = result * 59 + ($serialNo == null ? 43 : $serialNo.hashCode());
      Object $version = this.getVersion();
      result = result * 59 + ($version == null ? 43 : $version.hashCode());
      Object $modelNo = this.getModelNo();
      result = result * 59 + ($modelNo == null ? 43 : $modelNo.hashCode());
      Object $deviceStatus = this.getDeviceStatus();
      return result * 59 + ($deviceStatus == null ? 43 : $deviceStatus.hashCode());
   }

   @Override
   public String toString() {
      return "VehicleMasterViewDto(vehicleId="
         + this.getVehicleId()
         + ", clientId="
         + this.getClientId()
         + ", vehicleNo="
         + this.getVehicleNo()
         + ", make="
         + this.getMake()
         + ", model="
         + this.getModel()
         + ", manufacturingYear="
         + this.getManufacturingYear()
         + ", licensePlate="
         + this.getLicensePlate()
         + ", countryId="
         + this.getCountryId()
         + ", stateId="
         + this.getStateId()
         + ", vin="
         + this.getVin()
         + ", fuelTypeId="
         + this.getFuelTypeId()
         + ", deviceId="
         + this.getDeviceId()
         + ", deviceName="
         + this.getDeviceName()
         + ", status="
         + this.getStatus()
         + ", eldConnectionInterfaceId="
         + this.getEldConnectionInterfaceId()
         + ", macAddress="
         + this.getMacAddress()
         + ", serialNo="
         + this.getSerialNo()
         + ", version="
         + this.getVersion()
         + ", modelNo="
         + this.getModelNo()
         + ", deviceStatus="
         + this.getDeviceStatus()
         + ", addedTimestamp="
         + this.getAddedTimestamp()
         + ", updatedTimestamp="
         + this.getUpdatedTimestamp()
         + ")";
   }
}
