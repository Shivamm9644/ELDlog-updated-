package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LiveDataLogViewDto {
   @JsonProperty("MAC")
   private String MAC;
   @JsonProperty("AmbTemp")
   private double AmbTemp;
   @JsonProperty("DateTime")
   private String DateTime;
   @JsonProperty("utcDateTime")
   private long utcDateTime;
   @JsonProperty("FuelEconomy")
   private double FuelEconomy;
   @JsonProperty("FuelRate")
   private double FuelRate;
   @JsonProperty("IdleHours")
   private long IdleHours;
   @JsonProperty("Lattitude")
   private double Lattitude;
   @JsonProperty("Longitude")
   private double Longitude;
   @JsonProperty("PlaceAddress")
   private String PlaceAddress;
   @JsonProperty("Model")
   private String Model;
   @JsonProperty("Odometer")
   private String Odometer;
   @JsonProperty("SatStatus")
   private String SatStatus;
   @JsonProperty("SerialNo")
   private String SerialNo;
   @JsonProperty("Speed")
   private long Speed;
   @JsonProperty("TotalFuelIdle")
   private double TotalFuelIdle;
   @JsonProperty("TotalFuelUsed")
   private double TotalFuelUsed;
   @JsonProperty("VIN")
   private String VIN;
   @JsonProperty("VehicleId")
   private String VehicleId;
   @JsonProperty("VehicleName")
   private String VehicleName;
   @JsonProperty("DriverId")
   private String DriverId;
   @JsonProperty("DriverName")
   private String DriverName;
   @JsonProperty("mobileNo")
   private long mobileNo;
   @JsonProperty("Version")
   private String Version;
   @JsonProperty("stateId")
   private long stateId;
   @JsonProperty("stateName")
   private String stateName;
   @JsonProperty("stateCode")
   private String stateCode;
   @JsonProperty("receive_time")
   private long receive_time;

   public String getMAC() {
      return this.MAC;
   }

   public double getAmbTemp() {
      return this.AmbTemp;
   }

   public String getDateTime() {
      return this.DateTime;
   }

   public long getUtcDateTime() {
      return this.utcDateTime;
   }

   public double getFuelEconomy() {
      return this.FuelEconomy;
   }

   public double getFuelRate() {
      return this.FuelRate;
   }

   public long getIdleHours() {
      return this.IdleHours;
   }

   public double getLattitude() {
      return this.Lattitude;
   }

   public double getLongitude() {
      return this.Longitude;
   }

   public String getPlaceAddress() {
      return this.PlaceAddress;
   }

   public String getModel() {
      return this.Model;
   }

   public String getOdometer() {
      return this.Odometer;
   }

   public String getSatStatus() {
      return this.SatStatus;
   }

   public String getSerialNo() {
      return this.SerialNo;
   }

   public long getSpeed() {
      return this.Speed;
   }

   public double getTotalFuelIdle() {
      return this.TotalFuelIdle;
   }

   public double getTotalFuelUsed() {
      return this.TotalFuelUsed;
   }

   public String getVIN() {
      return this.VIN;
   }

   public String getVehicleId() {
      return this.VehicleId;
   }

   public String getVehicleName() {
      return this.VehicleName;
   }

   public String getDriverId() {
      return this.DriverId;
   }

   public String getDriverName() {
      return this.DriverName;
   }

   public long getMobileNo() {
      return this.mobileNo;
   }

   public String getVersion() {
      return this.Version;
   }

   public long getStateId() {
      return this.stateId;
   }

   public String getStateName() {
      return this.stateName;
   }

   public String getStateCode() {
      return this.stateCode;
   }

   public long getReceive_time() {
      return this.receive_time;
   }

   @JsonProperty("MAC")
   public void setMAC(final String MAC) {
      this.MAC = MAC;
   }

   @JsonProperty("AmbTemp")
   public void setAmbTemp(final double AmbTemp) {
      this.AmbTemp = AmbTemp;
   }

   @JsonProperty("DateTime")
   public void setDateTime(final String DateTime) {
      this.DateTime = DateTime;
   }

   @JsonProperty("utcDateTime")
   public void setUtcDateTime(final long utcDateTime) {
      this.utcDateTime = utcDateTime;
   }

   @JsonProperty("FuelEconomy")
   public void setFuelEconomy(final double FuelEconomy) {
      this.FuelEconomy = FuelEconomy;
   }

   @JsonProperty("FuelRate")
   public void setFuelRate(final double FuelRate) {
      this.FuelRate = FuelRate;
   }

   @JsonProperty("IdleHours")
   public void setIdleHours(final long IdleHours) {
      this.IdleHours = IdleHours;
   }

   @JsonProperty("Lattitude")
   public void setLattitude(final double Lattitude) {
      this.Lattitude = Lattitude;
   }

   @JsonProperty("Longitude")
   public void setLongitude(final double Longitude) {
      this.Longitude = Longitude;
   }

   @JsonProperty("PlaceAddress")
   public void setPlaceAddress(final String PlaceAddress) {
      this.PlaceAddress = PlaceAddress;
   }

   @JsonProperty("Model")
   public void setModel(final String Model) {
      this.Model = Model;
   }

   @JsonProperty("Odometer")
   public void setOdometer(final String Odometer) {
      this.Odometer = Odometer;
   }

   @JsonProperty("SatStatus")
   public void setSatStatus(final String SatStatus) {
      this.SatStatus = SatStatus;
   }

   @JsonProperty("SerialNo")
   public void setSerialNo(final String SerialNo) {
      this.SerialNo = SerialNo;
   }

   @JsonProperty("Speed")
   public void setSpeed(final long Speed) {
      this.Speed = Speed;
   }

   @JsonProperty("TotalFuelIdle")
   public void setTotalFuelIdle(final double TotalFuelIdle) {
      this.TotalFuelIdle = TotalFuelIdle;
   }

   @JsonProperty("TotalFuelUsed")
   public void setTotalFuelUsed(final double TotalFuelUsed) {
      this.TotalFuelUsed = TotalFuelUsed;
   }

   @JsonProperty("VIN")
   public void setVIN(final String VIN) {
      this.VIN = VIN;
   }

   @JsonProperty("VehicleId")
   public void setVehicleId(final String VehicleId) {
      this.VehicleId = VehicleId;
   }

   @JsonProperty("VehicleName")
   public void setVehicleName(final String VehicleName) {
      this.VehicleName = VehicleName;
   }

   @JsonProperty("DriverId")
   public void setDriverId(final String DriverId) {
      this.DriverId = DriverId;
   }

   @JsonProperty("DriverName")
   public void setDriverName(final String DriverName) {
      this.DriverName = DriverName;
   }

   @JsonProperty("mobileNo")
   public void setMobileNo(final long mobileNo) {
      this.mobileNo = mobileNo;
   }

   @JsonProperty("Version")
   public void setVersion(final String Version) {
      this.Version = Version;
   }

   @JsonProperty("stateId")
   public void setStateId(final long stateId) {
      this.stateId = stateId;
   }

   @JsonProperty("stateName")
   public void setStateName(final String stateName) {
      this.stateName = stateName;
   }

   @JsonProperty("stateCode")
   public void setStateCode(final String stateCode) {
      this.stateCode = stateCode;
   }

   @JsonProperty("receive_time")
   public void setReceive_time(final long receive_time) {
      this.receive_time = receive_time;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof LiveDataLogViewDto)) {
         return false;
      } else {
         LiveDataLogViewDto other = (LiveDataLogViewDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (Double.compare(this.getAmbTemp(), other.getAmbTemp()) != 0) {
            return false;
         } else if (this.getUtcDateTime() != other.getUtcDateTime()) {
            return false;
         } else if (Double.compare(this.getFuelEconomy(), other.getFuelEconomy()) != 0) {
            return false;
         } else if (Double.compare(this.getFuelRate(), other.getFuelRate()) != 0) {
            return false;
         } else if (this.getIdleHours() != other.getIdleHours()) {
            return false;
         } else if (Double.compare(this.getLattitude(), other.getLattitude()) != 0) {
            return false;
         } else if (Double.compare(this.getLongitude(), other.getLongitude()) != 0) {
            return false;
         } else if (this.getSpeed() != other.getSpeed()) {
            return false;
         } else if (Double.compare(this.getTotalFuelIdle(), other.getTotalFuelIdle()) != 0) {
            return false;
         } else if (Double.compare(this.getTotalFuelUsed(), other.getTotalFuelUsed()) != 0) {
            return false;
         } else if (this.getMobileNo() != other.getMobileNo()) {
            return false;
         } else if (this.getStateId() != other.getStateId()) {
            return false;
         } else if (this.getReceive_time() != other.getReceive_time()) {
            return false;
         } else {
            Object this$MAC = this.getMAC();
            Object other$MAC = other.getMAC();
            if (this$MAC == null ? other$MAC == null : this$MAC.equals(other$MAC)) {
               Object this$DateTime = this.getDateTime();
               Object other$DateTime = other.getDateTime();
               if (this$DateTime == null ? other$DateTime == null : this$DateTime.equals(other$DateTime)) {
                  Object this$PlaceAddress = this.getPlaceAddress();
                  Object other$PlaceAddress = other.getPlaceAddress();
                  if (this$PlaceAddress == null ? other$PlaceAddress == null : this$PlaceAddress.equals(other$PlaceAddress)) {
                     Object this$Model = this.getModel();
                     Object other$Model = other.getModel();
                     if (this$Model == null ? other$Model == null : this$Model.equals(other$Model)) {
                        Object this$Odometer = this.getOdometer();
                        Object other$Odometer = other.getOdometer();
                        if (this$Odometer == null ? other$Odometer == null : this$Odometer.equals(other$Odometer)) {
                           Object this$SatStatus = this.getSatStatus();
                           Object other$SatStatus = other.getSatStatus();
                           if (this$SatStatus == null ? other$SatStatus == null : this$SatStatus.equals(other$SatStatus)) {
                              Object this$SerialNo = this.getSerialNo();
                              Object other$SerialNo = other.getSerialNo();
                              if (this$SerialNo == null ? other$SerialNo == null : this$SerialNo.equals(other$SerialNo)) {
                                 Object this$VIN = this.getVIN();
                                 Object other$VIN = other.getVIN();
                                 if (this$VIN == null ? other$VIN == null : this$VIN.equals(other$VIN)) {
                                    Object this$VehicleId = this.getVehicleId();
                                    Object other$VehicleId = other.getVehicleId();
                                    if (this$VehicleId == null ? other$VehicleId == null : this$VehicleId.equals(other$VehicleId)) {
                                       Object this$VehicleName = this.getVehicleName();
                                       Object other$VehicleName = other.getVehicleName();
                                       if (this$VehicleName == null ? other$VehicleName == null : this$VehicleName.equals(other$VehicleName)) {
                                          Object this$DriverId = this.getDriverId();
                                          Object other$DriverId = other.getDriverId();
                                          if (this$DriverId == null ? other$DriverId == null : this$DriverId.equals(other$DriverId)) {
                                             Object this$DriverName = this.getDriverName();
                                             Object other$DriverName = other.getDriverName();
                                             if (this$DriverName == null ? other$DriverName == null : this$DriverName.equals(other$DriverName)) {
                                                Object this$Version = this.getVersion();
                                                Object other$Version = other.getVersion();
                                                if (this$Version == null ? other$Version == null : this$Version.equals(other$Version)) {
                                                   Object this$stateName = this.getStateName();
                                                   Object other$stateName = other.getStateName();
                                                   if (this$stateName == null ? other$stateName == null : this$stateName.equals(other$stateName)) {
                                                      Object this$stateCode = this.getStateCode();
                                                      Object other$stateCode = other.getStateCode();
                                                      return this$stateCode == null ? other$stateCode == null : this$stateCode.equals(other$stateCode);
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
      return other instanceof LiveDataLogViewDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $AmbTemp = Double.doubleToLongBits(this.getAmbTemp());
      result = result * 59 + (int)($AmbTemp >>> 32 ^ $AmbTemp);
      long $utcDateTime = this.getUtcDateTime();
      result = result * 59 + (int)($utcDateTime >>> 32 ^ $utcDateTime);
      long $FuelEconomy = Double.doubleToLongBits(this.getFuelEconomy());
      result = result * 59 + (int)($FuelEconomy >>> 32 ^ $FuelEconomy);
      long $FuelRate = Double.doubleToLongBits(this.getFuelRate());
      result = result * 59 + (int)($FuelRate >>> 32 ^ $FuelRate);
      long $IdleHours = this.getIdleHours();
      result = result * 59 + (int)($IdleHours >>> 32 ^ $IdleHours);
      long $Lattitude = Double.doubleToLongBits(this.getLattitude());
      result = result * 59 + (int)($Lattitude >>> 32 ^ $Lattitude);
      long $Longitude = Double.doubleToLongBits(this.getLongitude());
      result = result * 59 + (int)($Longitude >>> 32 ^ $Longitude);
      long $Speed = this.getSpeed();
      result = result * 59 + (int)($Speed >>> 32 ^ $Speed);
      long $TotalFuelIdle = Double.doubleToLongBits(this.getTotalFuelIdle());
      result = result * 59 + (int)($TotalFuelIdle >>> 32 ^ $TotalFuelIdle);
      long $TotalFuelUsed = Double.doubleToLongBits(this.getTotalFuelUsed());
      result = result * 59 + (int)($TotalFuelUsed >>> 32 ^ $TotalFuelUsed);
      long $mobileNo = this.getMobileNo();
      result = result * 59 + (int)($mobileNo >>> 32 ^ $mobileNo);
      long $stateId = this.getStateId();
      result = result * 59 + (int)($stateId >>> 32 ^ $stateId);
      long $receive_time = this.getReceive_time();
      result = result * 59 + (int)($receive_time >>> 32 ^ $receive_time);
      Object $MAC = this.getMAC();
      result = result * 59 + ($MAC == null ? 43 : $MAC.hashCode());
      Object $DateTime = this.getDateTime();
      result = result * 59 + ($DateTime == null ? 43 : $DateTime.hashCode());
      Object $PlaceAddress = this.getPlaceAddress();
      result = result * 59 + ($PlaceAddress == null ? 43 : $PlaceAddress.hashCode());
      Object $Model = this.getModel();
      result = result * 59 + ($Model == null ? 43 : $Model.hashCode());
      Object $Odometer = this.getOdometer();
      result = result * 59 + ($Odometer == null ? 43 : $Odometer.hashCode());
      Object $SatStatus = this.getSatStatus();
      result = result * 59 + ($SatStatus == null ? 43 : $SatStatus.hashCode());
      Object $SerialNo = this.getSerialNo();
      result = result * 59 + ($SerialNo == null ? 43 : $SerialNo.hashCode());
      Object $VIN = this.getVIN();
      result = result * 59 + ($VIN == null ? 43 : $VIN.hashCode());
      Object $VehicleId = this.getVehicleId();
      result = result * 59 + ($VehicleId == null ? 43 : $VehicleId.hashCode());
      Object $VehicleName = this.getVehicleName();
      result = result * 59 + ($VehicleName == null ? 43 : $VehicleName.hashCode());
      Object $DriverId = this.getDriverId();
      result = result * 59 + ($DriverId == null ? 43 : $DriverId.hashCode());
      Object $DriverName = this.getDriverName();
      result = result * 59 + ($DriverName == null ? 43 : $DriverName.hashCode());
      Object $Version = this.getVersion();
      result = result * 59 + ($Version == null ? 43 : $Version.hashCode());
      Object $stateName = this.getStateName();
      result = result * 59 + ($stateName == null ? 43 : $stateName.hashCode());
      Object $stateCode = this.getStateCode();
      return result * 59 + ($stateCode == null ? 43 : $stateCode.hashCode());
   }

   @Override
   public String toString() {
      return "LiveDataLogViewDto(MAC="
         + this.getMAC()
         + ", AmbTemp="
         + this.getAmbTemp()
         + ", DateTime="
         + this.getDateTime()
         + ", utcDateTime="
         + this.getUtcDateTime()
         + ", FuelEconomy="
         + this.getFuelEconomy()
         + ", FuelRate="
         + this.getFuelRate()
         + ", IdleHours="
         + this.getIdleHours()
         + ", Lattitude="
         + this.getLattitude()
         + ", Longitude="
         + this.getLongitude()
         + ", PlaceAddress="
         + this.getPlaceAddress()
         + ", Model="
         + this.getModel()
         + ", Odometer="
         + this.getOdometer()
         + ", SatStatus="
         + this.getSatStatus()
         + ", SerialNo="
         + this.getSerialNo()
         + ", Speed="
         + this.getSpeed()
         + ", TotalFuelIdle="
         + this.getTotalFuelIdle()
         + ", TotalFuelUsed="
         + this.getTotalFuelUsed()
         + ", VIN="
         + this.getVIN()
         + ", VehicleId="
         + this.getVehicleId()
         + ", VehicleName="
         + this.getVehicleName()
         + ", DriverId="
         + this.getDriverId()
         + ", DriverName="
         + this.getDriverName()
         + ", mobileNo="
         + this.getMobileNo()
         + ", Version="
         + this.getVersion()
         + ", stateId="
         + this.getStateId()
         + ", stateName="
         + this.getStateName()
         + ", stateCode="
         + this.getStateCode()
         + ", receive_time="
         + this.getReceive_time()
         + ")";
   }
}
