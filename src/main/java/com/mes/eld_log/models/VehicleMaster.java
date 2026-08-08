package com.mes.eld_log.models;

import java.io.Serializable;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.core.mapping.Document;

@EntityScan
@Document(
   collection = "vehicle_master"
)
public class VehicleMaster implements Serializable {
   private static final long serialVersionUID = 1L;
   private Integer vehicleId;
   private long clientId;
   private String vehicleNo;
   private String make;
   private String model;
   private long manufacturingYear;
   private String licensePlate;
   private long countryId;
   private long stateId;
   private String vin;
   private long fuelTypeId;
   private String status;
   private long deviceId;
   private long eldConnectionInterfaceId;
   private long addedTimestamp;
   private long updatedTimestamp;

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof VehicleMaster)) {
         return false;
      } else {
         VehicleMaster other = (VehicleMaster)o;
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
                              Object this$status = this.getStatus();
                              Object other$status = other.getStatus();
                              return this$status == null ? other$status == null : this$status.equals(other$status);
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
      return other instanceof VehicleMaster;
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
      Object $status = this.getStatus();
      return result * 59 + ($status == null ? 43 : $status.hashCode());
   }

   @Override
   public String toString() {
      return "VehicleMaster(vehicleId="
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
         + ", status="
         + this.getStatus()
         + ", deviceId="
         + this.getDeviceId()
         + ", eldConnectionInterfaceId="
         + this.getEldConnectionInterfaceId()
         + ", addedTimestamp="
         + this.getAddedTimestamp()
         + ", updatedTimestamp="
         + this.getUpdatedTimestamp()
         + ")";
   }

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

   public String getStatus() {
      return this.status;
   }

   public long getDeviceId() {
      return this.deviceId;
   }

   public long getEldConnectionInterfaceId() {
      return this.eldConnectionInterfaceId;
   }

   public long getAddedTimestamp() {
      return this.addedTimestamp;
   }

   public long getUpdatedTimestamp() {
      return this.updatedTimestamp;
   }

   public void setVehicleId(final Integer vehicleId) {
      this.vehicleId = vehicleId;
   }

   public void setClientId(final long clientId) {
      this.clientId = clientId;
   }

   public void setVehicleNo(final String vehicleNo) {
      this.vehicleNo = vehicleNo;
   }

   public void setMake(final String make) {
      this.make = make;
   }

   public void setModel(final String model) {
      this.model = model;
   }

   public void setManufacturingYear(final long manufacturingYear) {
      this.manufacturingYear = manufacturingYear;
   }

   public void setLicensePlate(final String licensePlate) {
      this.licensePlate = licensePlate;
   }

   public void setCountryId(final long countryId) {
      this.countryId = countryId;
   }

   public void setStateId(final long stateId) {
      this.stateId = stateId;
   }

   public void setVin(final String vin) {
      this.vin = vin;
   }

   public void setFuelTypeId(final long fuelTypeId) {
      this.fuelTypeId = fuelTypeId;
   }

   public void setStatus(final String status) {
      this.status = status;
   }

   public void setDeviceId(final long deviceId) {
      this.deviceId = deviceId;
   }

   public void setEldConnectionInterfaceId(final long eldConnectionInterfaceId) {
      this.eldConnectionInterfaceId = eldConnectionInterfaceId;
   }

   public void setAddedTimestamp(final long addedTimestamp) {
      this.addedTimestamp = addedTimestamp;
   }

   public void setUpdatedTimestamp(final long updatedTimestamp) {
      this.updatedTimestamp = updatedTimestamp;
   }
}
