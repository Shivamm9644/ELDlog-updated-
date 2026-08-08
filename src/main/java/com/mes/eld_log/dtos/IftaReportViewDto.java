package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IftaReportViewDto {
   @JsonProperty("carrierName")
   private String carrierName;
   @JsonProperty("fromDate")
   private String fromDate;
   @JsonProperty("toDate")
   private String toDate;
   @JsonProperty("vehicleNo")
   private String vehicleNo;
   @JsonProperty("vehicleId")
   private String vehicleId;
   @JsonProperty("DriverId")
   private String DriverId;
   @JsonProperty("stateId")
   private long stateId;
   @JsonProperty("clientId")
   private long clientId;
   @JsonProperty("utcDateTime")
   private long utcDateTime;
   @JsonProperty("make")
   private String make;
   @JsonProperty("vin")
   private String vin;
   @JsonProperty("model")
   private String model;
   @JsonProperty("manufacturingYear")
   private long manufacturingYear;
   @JsonProperty("stateName")
   private String stateName;
   @JsonProperty("stateCode")
   private String stateCode;
   @JsonProperty("totalOdometer")
   private double totalOdometer;
   @JsonProperty("Odometer")
   private String Odometer;
   @JsonProperty("firstOdometer")
   private double firstOdometer;
   @JsonProperty("lastOdometer")
   private double lastOdometer;
   @JsonProperty("Lattitude")
   private double Lattitude;
   @JsonProperty("Longitude")
   private double Longitude;
   @JsonProperty("gpsKm")
   private double gpsKm;
   @JsonProperty("currentTimestamp")
   private long currentTimestamp;
   @JsonProperty("fileName")
   private String fileName;

   public String getCarrierName() {
      return this.carrierName;
   }

   public String getFromDate() {
      return this.fromDate;
   }

   public String getToDate() {
      return this.toDate;
   }

   public String getVehicleNo() {
      return this.vehicleNo;
   }

   public String getVehicleId() {
      return this.vehicleId;
   }

   public String getDriverId() {
      return this.DriverId;
   }

   public long getStateId() {
      return this.stateId;
   }

   public long getClientId() {
      return this.clientId;
   }

   public long getUtcDateTime() {
      return this.utcDateTime;
   }

   public String getMake() {
      return this.make;
   }

   public String getVin() {
      return this.vin;
   }

   public String getModel() {
      return this.model;
   }

   public long getManufacturingYear() {
      return this.manufacturingYear;
   }

   public String getStateName() {
      return this.stateName;
   }

   public String getStateCode() {
      return this.stateCode;
   }

   public double getTotalOdometer() {
      return this.totalOdometer;
   }

   public String getOdometer() {
      return this.Odometer;
   }

   public double getFirstOdometer() {
      return this.firstOdometer;
   }

   public double getLastOdometer() {
      return this.lastOdometer;
   }

   public double getLattitude() {
      return this.Lattitude;
   }

   public double getLongitude() {
      return this.Longitude;
   }

   public double getGpsKm() {
      return this.gpsKm;
   }

   public long getCurrentTimestamp() {
      return this.currentTimestamp;
   }

   public String getFileName() {
      return this.fileName;
   }

   @JsonProperty("carrierName")
   public void setCarrierName(final String carrierName) {
      this.carrierName = carrierName;
   }

   @JsonProperty("fromDate")
   public void setFromDate(final String fromDate) {
      this.fromDate = fromDate;
   }

   @JsonProperty("toDate")
   public void setToDate(final String toDate) {
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

   @JsonProperty("DriverId")
   public void setDriverId(final String DriverId) {
      this.DriverId = DriverId;
   }

   @JsonProperty("stateId")
   public void setStateId(final long stateId) {
      this.stateId = stateId;
   }

   @JsonProperty("clientId")
   public void setClientId(final long clientId) {
      this.clientId = clientId;
   }

   @JsonProperty("utcDateTime")
   public void setUtcDateTime(final long utcDateTime) {
      this.utcDateTime = utcDateTime;
   }

   @JsonProperty("make")
   public void setMake(final String make) {
      this.make = make;
   }

   @JsonProperty("vin")
   public void setVin(final String vin) {
      this.vin = vin;
   }

   @JsonProperty("model")
   public void setModel(final String model) {
      this.model = model;
   }

   @JsonProperty("manufacturingYear")
   public void setManufacturingYear(final long manufacturingYear) {
      this.manufacturingYear = manufacturingYear;
   }

   @JsonProperty("stateName")
   public void setStateName(final String stateName) {
      this.stateName = stateName;
   }

   @JsonProperty("stateCode")
   public void setStateCode(final String stateCode) {
      this.stateCode = stateCode;
   }

   @JsonProperty("totalOdometer")
   public void setTotalOdometer(final double totalOdometer) {
      this.totalOdometer = totalOdometer;
   }

   @JsonProperty("Odometer")
   public void setOdometer(final String Odometer) {
      this.Odometer = Odometer;
   }

   @JsonProperty("firstOdometer")
   public void setFirstOdometer(final double firstOdometer) {
      this.firstOdometer = firstOdometer;
   }

   @JsonProperty("lastOdometer")
   public void setLastOdometer(final double lastOdometer) {
      this.lastOdometer = lastOdometer;
   }

   @JsonProperty("Lattitude")
   public void setLattitude(final double Lattitude) {
      this.Lattitude = Lattitude;
   }

   @JsonProperty("Longitude")
   public void setLongitude(final double Longitude) {
      this.Longitude = Longitude;
   }

   @JsonProperty("gpsKm")
   public void setGpsKm(final double gpsKm) {
      this.gpsKm = gpsKm;
   }

   @JsonProperty("currentTimestamp")
   public void setCurrentTimestamp(final long currentTimestamp) {
      this.currentTimestamp = currentTimestamp;
   }

   @JsonProperty("fileName")
   public void setFileName(final String fileName) {
      this.fileName = fileName;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof IftaReportViewDto)) {
         return false;
      } else {
         IftaReportViewDto other = (IftaReportViewDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getStateId() != other.getStateId()) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else if (this.getUtcDateTime() != other.getUtcDateTime()) {
            return false;
         } else if (this.getManufacturingYear() != other.getManufacturingYear()) {
            return false;
         } else if (Double.compare(this.getTotalOdometer(), other.getTotalOdometer()) != 0) {
            return false;
         } else if (Double.compare(this.getFirstOdometer(), other.getFirstOdometer()) != 0) {
            return false;
         } else if (Double.compare(this.getLastOdometer(), other.getLastOdometer()) != 0) {
            return false;
         } else if (Double.compare(this.getLattitude(), other.getLattitude()) != 0) {
            return false;
         } else if (Double.compare(this.getLongitude(), other.getLongitude()) != 0) {
            return false;
         } else if (Double.compare(this.getGpsKm(), other.getGpsKm()) != 0) {
            return false;
         } else if (this.getCurrentTimestamp() != other.getCurrentTimestamp()) {
            return false;
         } else {
            Object this$carrierName = this.getCarrierName();
            Object other$carrierName = other.getCarrierName();
            if (this$carrierName == null ? other$carrierName == null : this$carrierName.equals(other$carrierName)) {
               Object this$fromDate = this.getFromDate();
               Object other$fromDate = other.getFromDate();
               if (this$fromDate == null ? other$fromDate == null : this$fromDate.equals(other$fromDate)) {
                  Object this$toDate = this.getToDate();
                  Object other$toDate = other.getToDate();
                  if (this$toDate == null ? other$toDate == null : this$toDate.equals(other$toDate)) {
                     Object this$vehicleNo = this.getVehicleNo();
                     Object other$vehicleNo = other.getVehicleNo();
                     if (this$vehicleNo == null ? other$vehicleNo == null : this$vehicleNo.equals(other$vehicleNo)) {
                        Object this$vehicleId = this.getVehicleId();
                        Object other$vehicleId = other.getVehicleId();
                        if (this$vehicleId == null ? other$vehicleId == null : this$vehicleId.equals(other$vehicleId)) {
                           Object this$DriverId = this.getDriverId();
                           Object other$DriverId = other.getDriverId();
                           if (this$DriverId == null ? other$DriverId == null : this$DriverId.equals(other$DriverId)) {
                              Object this$make = this.getMake();
                              Object other$make = other.getMake();
                              if (this$make == null ? other$make == null : this$make.equals(other$make)) {
                                 Object this$vin = this.getVin();
                                 Object other$vin = other.getVin();
                                 if (this$vin == null ? other$vin == null : this$vin.equals(other$vin)) {
                                    Object this$model = this.getModel();
                                    Object other$model = other.getModel();
                                    if (this$model == null ? other$model == null : this$model.equals(other$model)) {
                                       Object this$stateName = this.getStateName();
                                       Object other$stateName = other.getStateName();
                                       if (this$stateName == null ? other$stateName == null : this$stateName.equals(other$stateName)) {
                                          Object this$stateCode = this.getStateCode();
                                          Object other$stateCode = other.getStateCode();
                                          if (this$stateCode == null ? other$stateCode == null : this$stateCode.equals(other$stateCode)) {
                                             Object this$Odometer = this.getOdometer();
                                             Object other$Odometer = other.getOdometer();
                                             if (this$Odometer == null ? other$Odometer == null : this$Odometer.equals(other$Odometer)) {
                                                Object this$fileName = this.getFileName();
                                                Object other$fileName = other.getFileName();
                                                return this$fileName == null ? other$fileName == null : this$fileName.equals(other$fileName);
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
      return other instanceof IftaReportViewDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $stateId = this.getStateId();
      result = result * 59 + (int)($stateId >>> 32 ^ $stateId);
      long $clientId = this.getClientId();
      result = result * 59 + (int)($clientId >>> 32 ^ $clientId);
      long $utcDateTime = this.getUtcDateTime();
      result = result * 59 + (int)($utcDateTime >>> 32 ^ $utcDateTime);
      long $manufacturingYear = this.getManufacturingYear();
      result = result * 59 + (int)($manufacturingYear >>> 32 ^ $manufacturingYear);
      long $totalOdometer = Double.doubleToLongBits(this.getTotalOdometer());
      result = result * 59 + (int)($totalOdometer >>> 32 ^ $totalOdometer);
      long $firstOdometer = Double.doubleToLongBits(this.getFirstOdometer());
      result = result * 59 + (int)($firstOdometer >>> 32 ^ $firstOdometer);
      long $lastOdometer = Double.doubleToLongBits(this.getLastOdometer());
      result = result * 59 + (int)($lastOdometer >>> 32 ^ $lastOdometer);
      long $Lattitude = Double.doubleToLongBits(this.getLattitude());
      result = result * 59 + (int)($Lattitude >>> 32 ^ $Lattitude);
      long $Longitude = Double.doubleToLongBits(this.getLongitude());
      result = result * 59 + (int)($Longitude >>> 32 ^ $Longitude);
      long $gpsKm = Double.doubleToLongBits(this.getGpsKm());
      result = result * 59 + (int)($gpsKm >>> 32 ^ $gpsKm);
      long $currentTimestamp = this.getCurrentTimestamp();
      result = result * 59 + (int)($currentTimestamp >>> 32 ^ $currentTimestamp);
      Object $carrierName = this.getCarrierName();
      result = result * 59 + ($carrierName == null ? 43 : $carrierName.hashCode());
      Object $fromDate = this.getFromDate();
      result = result * 59 + ($fromDate == null ? 43 : $fromDate.hashCode());
      Object $toDate = this.getToDate();
      result = result * 59 + ($toDate == null ? 43 : $toDate.hashCode());
      Object $vehicleNo = this.getVehicleNo();
      result = result * 59 + ($vehicleNo == null ? 43 : $vehicleNo.hashCode());
      Object $vehicleId = this.getVehicleId();
      result = result * 59 + ($vehicleId == null ? 43 : $vehicleId.hashCode());
      Object $DriverId = this.getDriverId();
      result = result * 59 + ($DriverId == null ? 43 : $DriverId.hashCode());
      Object $make = this.getMake();
      result = result * 59 + ($make == null ? 43 : $make.hashCode());
      Object $vin = this.getVin();
      result = result * 59 + ($vin == null ? 43 : $vin.hashCode());
      Object $model = this.getModel();
      result = result * 59 + ($model == null ? 43 : $model.hashCode());
      Object $stateName = this.getStateName();
      result = result * 59 + ($stateName == null ? 43 : $stateName.hashCode());
      Object $stateCode = this.getStateCode();
      result = result * 59 + ($stateCode == null ? 43 : $stateCode.hashCode());
      Object $Odometer = this.getOdometer();
      result = result * 59 + ($Odometer == null ? 43 : $Odometer.hashCode());
      Object $fileName = this.getFileName();
      return result * 59 + ($fileName == null ? 43 : $fileName.hashCode());
   }

   @Override
   public String toString() {
      return "IftaReportViewDto(carrierName="
         + this.getCarrierName()
         + ", fromDate="
         + this.getFromDate()
         + ", toDate="
         + this.getToDate()
         + ", vehicleNo="
         + this.getVehicleNo()
         + ", vehicleId="
         + this.getVehicleId()
         + ", DriverId="
         + this.getDriverId()
         + ", stateId="
         + this.getStateId()
         + ", clientId="
         + this.getClientId()
         + ", utcDateTime="
         + this.getUtcDateTime()
         + ", make="
         + this.getMake()
         + ", vin="
         + this.getVin()
         + ", model="
         + this.getModel()
         + ", manufacturingYear="
         + this.getManufacturingYear()
         + ", stateName="
         + this.getStateName()
         + ", stateCode="
         + this.getStateCode()
         + ", totalOdometer="
         + this.getTotalOdometer()
         + ", Odometer="
         + this.getOdometer()
         + ", firstOdometer="
         + this.getFirstOdometer()
         + ", lastOdometer="
         + this.getLastOdometer()
         + ", Lattitude="
         + this.getLattitude()
         + ", Longitude="
         + this.getLongitude()
         + ", gpsKm="
         + this.getGpsKm()
         + ", currentTimestamp="
         + this.getCurrentTimestamp()
         + ", fileName="
         + this.getFileName()
         + ")";
   }
}
