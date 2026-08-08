package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IftaSummaryReport {
   @JsonProperty("carrierName")
   private String carrierName;
   @JsonProperty("fromDate")
   private long fromDate;
   @JsonProperty("toDate")
   private long toDate;
   @JsonProperty("vehicleNo")
   private String vehicleNo;
   @JsonProperty("vehicleId")
   private String vehicleId;
   @JsonProperty("make")
   private String make;
   @JsonProperty("model")
   private String model;
   @JsonProperty("manufacturingYear")
   private long manufacturingYear;
   @JsonProperty("driverId")
   private String driverId;
   @JsonProperty("driverName")
   private String driverName;
   @JsonProperty("fromPlaceAddress")
   private String fromPlaceAddress;
   @JsonProperty("toPlaceAddress")
   private String toPlaceAddress;
   @JsonProperty("fromStateName")
   private String fromStateName;
   @JsonProperty("toStateName")
   private String toStateName;
   @JsonProperty("fromStateCode")
   private String fromStateCode;
   @JsonProperty("toStateCode")
   private String toStateCode;
   @JsonProperty("firstOdometer")
   private double firstOdometer;
   @JsonProperty("lastOdometer")
   private double lastOdometer;
   @JsonProperty("odometerMileage")
   private double odometerMileage;
   @JsonProperty("gpsMileage")
   private double gpsMileage;

   public String getCarrierName() {
      return this.carrierName;
   }

   public long getFromDate() {
      return this.fromDate;
   }

   public long getToDate() {
      return this.toDate;
   }

   public String getVehicleNo() {
      return this.vehicleNo;
   }

   public String getVehicleId() {
      return this.vehicleId;
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

   public String getDriverId() {
      return this.driverId;
   }

   public String getDriverName() {
      return this.driverName;
   }

   public String getFromPlaceAddress() {
      return this.fromPlaceAddress;
   }

   public String getToPlaceAddress() {
      return this.toPlaceAddress;
   }

   public String getFromStateName() {
      return this.fromStateName;
   }

   public String getToStateName() {
      return this.toStateName;
   }

   public String getFromStateCode() {
      return this.fromStateCode;
   }

   public String getToStateCode() {
      return this.toStateCode;
   }

   public double getFirstOdometer() {
      return this.firstOdometer;
   }

   public double getLastOdometer() {
      return this.lastOdometer;
   }

   public double getOdometerMileage() {
      return this.odometerMileage;
   }

   public double getGpsMileage() {
      return this.gpsMileage;
   }

   @JsonProperty("carrierName")
   public void setCarrierName(final String carrierName) {
      this.carrierName = carrierName;
   }

   @JsonProperty("fromDate")
   public void setFromDate(final long fromDate) {
      this.fromDate = fromDate;
   }

   @JsonProperty("toDate")
   public void setToDate(final long toDate) {
      this.toDate = toDate;
   }

   @JsonProperty("vehicleNo")
   public void setVehicleNo(final String vehicleNo) {
      this.vehicleNo = vehicleNo;
   }

   @JsonProperty("vehicleId")
   public void setVehicleId(final String vehicleId) {
      this.vehicleId = vehicleId;
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

   @JsonProperty("driverId")
   public void setDriverId(final String driverId) {
      this.driverId = driverId;
   }

   @JsonProperty("driverName")
   public void setDriverName(final String driverName) {
      this.driverName = driverName;
   }

   @JsonProperty("fromPlaceAddress")
   public void setFromPlaceAddress(final String fromPlaceAddress) {
      this.fromPlaceAddress = fromPlaceAddress;
   }

   @JsonProperty("toPlaceAddress")
   public void setToPlaceAddress(final String toPlaceAddress) {
      this.toPlaceAddress = toPlaceAddress;
   }

   @JsonProperty("fromStateName")
   public void setFromStateName(final String fromStateName) {
      this.fromStateName = fromStateName;
   }

   @JsonProperty("toStateName")
   public void setToStateName(final String toStateName) {
      this.toStateName = toStateName;
   }

   @JsonProperty("fromStateCode")
   public void setFromStateCode(final String fromStateCode) {
      this.fromStateCode = fromStateCode;
   }

   @JsonProperty("toStateCode")
   public void setToStateCode(final String toStateCode) {
      this.toStateCode = toStateCode;
   }

   @JsonProperty("firstOdometer")
   public void setFirstOdometer(final double firstOdometer) {
      this.firstOdometer = firstOdometer;
   }

   @JsonProperty("lastOdometer")
   public void setLastOdometer(final double lastOdometer) {
      this.lastOdometer = lastOdometer;
   }

   @JsonProperty("odometerMileage")
   public void setOdometerMileage(final double odometerMileage) {
      this.odometerMileage = odometerMileage;
   }

   @JsonProperty("gpsMileage")
   public void setGpsMileage(final double gpsMileage) {
      this.gpsMileage = gpsMileage;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof IftaSummaryReport)) {
         return false;
      } else {
         IftaSummaryReport other = (IftaSummaryReport)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getFromDate() != other.getFromDate()) {
            return false;
         } else if (this.getToDate() != other.getToDate()) {
            return false;
         } else if (this.getManufacturingYear() != other.getManufacturingYear()) {
            return false;
         } else if (Double.compare(this.getFirstOdometer(), other.getFirstOdometer()) != 0) {
            return false;
         } else if (Double.compare(this.getLastOdometer(), other.getLastOdometer()) != 0) {
            return false;
         } else if (Double.compare(this.getOdometerMileage(), other.getOdometerMileage()) != 0) {
            return false;
         } else if (Double.compare(this.getGpsMileage(), other.getGpsMileage()) != 0) {
            return false;
         } else {
            Object this$carrierName = this.getCarrierName();
            Object other$carrierName = other.getCarrierName();
            if (this$carrierName == null ? other$carrierName == null : this$carrierName.equals(other$carrierName)) {
               Object this$vehicleNo = this.getVehicleNo();
               Object other$vehicleNo = other.getVehicleNo();
               if (this$vehicleNo == null ? other$vehicleNo == null : this$vehicleNo.equals(other$vehicleNo)) {
                  Object this$vehicleId = this.getVehicleId();
                  Object other$vehicleId = other.getVehicleId();
                  if (this$vehicleId == null ? other$vehicleId == null : this$vehicleId.equals(other$vehicleId)) {
                     Object this$make = this.getMake();
                     Object other$make = other.getMake();
                     if (this$make == null ? other$make == null : this$make.equals(other$make)) {
                        Object this$model = this.getModel();
                        Object other$model = other.getModel();
                        if (this$model == null ? other$model == null : this$model.equals(other$model)) {
                           Object this$driverId = this.getDriverId();
                           Object other$driverId = other.getDriverId();
                           if (this$driverId == null ? other$driverId == null : this$driverId.equals(other$driverId)) {
                              Object this$driverName = this.getDriverName();
                              Object other$driverName = other.getDriverName();
                              if (this$driverName == null ? other$driverName == null : this$driverName.equals(other$driverName)) {
                                 Object this$fromPlaceAddress = this.getFromPlaceAddress();
                                 Object other$fromPlaceAddress = other.getFromPlaceAddress();
                                 if (this$fromPlaceAddress == null ? other$fromPlaceAddress == null : this$fromPlaceAddress.equals(other$fromPlaceAddress)) {
                                    Object this$toPlaceAddress = this.getToPlaceAddress();
                                    Object other$toPlaceAddress = other.getToPlaceAddress();
                                    if (this$toPlaceAddress == null ? other$toPlaceAddress == null : this$toPlaceAddress.equals(other$toPlaceAddress)) {
                                       Object this$fromStateName = this.getFromStateName();
                                       Object other$fromStateName = other.getFromStateName();
                                       if (this$fromStateName == null ? other$fromStateName == null : this$fromStateName.equals(other$fromStateName)) {
                                          Object this$toStateName = this.getToStateName();
                                          Object other$toStateName = other.getToStateName();
                                          if (this$toStateName == null ? other$toStateName == null : this$toStateName.equals(other$toStateName)) {
                                             Object this$fromStateCode = this.getFromStateCode();
                                             Object other$fromStateCode = other.getFromStateCode();
                                             if (this$fromStateCode == null ? other$fromStateCode == null : this$fromStateCode.equals(other$fromStateCode)) {
                                                Object this$toStateCode = this.getToStateCode();
                                                Object other$toStateCode = other.getToStateCode();
                                                return this$toStateCode == null ? other$toStateCode == null : this$toStateCode.equals(other$toStateCode);
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
      return other instanceof IftaSummaryReport;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $fromDate = this.getFromDate();
      result = result * 59 + (int)($fromDate >>> 32 ^ $fromDate);
      long $toDate = this.getToDate();
      result = result * 59 + (int)($toDate >>> 32 ^ $toDate);
      long $manufacturingYear = this.getManufacturingYear();
      result = result * 59 + (int)($manufacturingYear >>> 32 ^ $manufacturingYear);
      long $firstOdometer = Double.doubleToLongBits(this.getFirstOdometer());
      result = result * 59 + (int)($firstOdometer >>> 32 ^ $firstOdometer);
      long $lastOdometer = Double.doubleToLongBits(this.getLastOdometer());
      result = result * 59 + (int)($lastOdometer >>> 32 ^ $lastOdometer);
      long $odometerMileage = Double.doubleToLongBits(this.getOdometerMileage());
      result = result * 59 + (int)($odometerMileage >>> 32 ^ $odometerMileage);
      long $gpsMileage = Double.doubleToLongBits(this.getGpsMileage());
      result = result * 59 + (int)($gpsMileage >>> 32 ^ $gpsMileage);
      Object $carrierName = this.getCarrierName();
      result = result * 59 + ($carrierName == null ? 43 : $carrierName.hashCode());
      Object $vehicleNo = this.getVehicleNo();
      result = result * 59 + ($vehicleNo == null ? 43 : $vehicleNo.hashCode());
      Object $vehicleId = this.getVehicleId();
      result = result * 59 + ($vehicleId == null ? 43 : $vehicleId.hashCode());
      Object $make = this.getMake();
      result = result * 59 + ($make == null ? 43 : $make.hashCode());
      Object $model = this.getModel();
      result = result * 59 + ($model == null ? 43 : $model.hashCode());
      Object $driverId = this.getDriverId();
      result = result * 59 + ($driverId == null ? 43 : $driverId.hashCode());
      Object $driverName = this.getDriverName();
      result = result * 59 + ($driverName == null ? 43 : $driverName.hashCode());
      Object $fromPlaceAddress = this.getFromPlaceAddress();
      result = result * 59 + ($fromPlaceAddress == null ? 43 : $fromPlaceAddress.hashCode());
      Object $toPlaceAddress = this.getToPlaceAddress();
      result = result * 59 + ($toPlaceAddress == null ? 43 : $toPlaceAddress.hashCode());
      Object $fromStateName = this.getFromStateName();
      result = result * 59 + ($fromStateName == null ? 43 : $fromStateName.hashCode());
      Object $toStateName = this.getToStateName();
      result = result * 59 + ($toStateName == null ? 43 : $toStateName.hashCode());
      Object $fromStateCode = this.getFromStateCode();
      result = result * 59 + ($fromStateCode == null ? 43 : $fromStateCode.hashCode());
      Object $toStateCode = this.getToStateCode();
      return result * 59 + ($toStateCode == null ? 43 : $toStateCode.hashCode());
   }

   @Override
   public String toString() {
      return "IftaSummaryReport(carrierName="
         + this.getCarrierName()
         + ", fromDate="
         + this.getFromDate()
         + ", toDate="
         + this.getToDate()
         + ", vehicleNo="
         + this.getVehicleNo()
         + ", vehicleId="
         + this.getVehicleId()
         + ", make="
         + this.getMake()
         + ", model="
         + this.getModel()
         + ", manufacturingYear="
         + this.getManufacturingYear()
         + ", driverId="
         + this.getDriverId()
         + ", driverName="
         + this.getDriverName()
         + ", fromPlaceAddress="
         + this.getFromPlaceAddress()
         + ", toPlaceAddress="
         + this.getToPlaceAddress()
         + ", fromStateName="
         + this.getFromStateName()
         + ", toStateName="
         + this.getToStateName()
         + ", fromStateCode="
         + this.getFromStateCode()
         + ", toStateCode="
         + this.getToStateCode()
         + ", firstOdometer="
         + this.getFirstOdometer()
         + ", lastOdometer="
         + this.getLastOdometer()
         + ", odometerMileage="
         + this.getOdometerMileage()
         + ", gpsMileage="
         + this.getGpsMileage()
         + ")";
   }
}
