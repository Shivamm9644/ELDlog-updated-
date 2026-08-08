package com.mes.eld_log.models;

import java.io.Serializable;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.core.mapping.Document;

@EntityScan
@Document(
   collection = "eld_log_data"
)
public class ELDLogData implements Serializable {
   private static final long serialVersionUID = 1L;
   private long CoolantTemp;
   private String DateTime;
   private long lDateTime;
   private String DriverId;
   private long clientId;
   private double EngineHours;
   private long FuelTankTemp;
   private String LatLong;
   private double Lattitude;
   private double Longitude;
   private String PlaceAddress;
   private String MAC;
   private String Model;
   private String Odometer;
   private long OilTemp;
   private long RPM;
   private String SerialNo;
   private long Speed;
   private String VIN;
   private String VehicleId;
   private String Version;
   private long utcDateTime;
   private long stateId;
   private long geoStateId;
   private long receive_time;
   private String receive_data_time;

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ELDLogData)) {
         return false;
      } else {
         ELDLogData other = (ELDLogData)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getCoolantTemp() != other.getCoolantTemp()) {
            return false;
         } else if (this.getLDateTime() != other.getLDateTime()) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else if (Double.compare(this.getEngineHours(), other.getEngineHours()) != 0) {
            return false;
         } else if (this.getFuelTankTemp() != other.getFuelTankTemp()) {
            return false;
         } else if (Double.compare(this.getLattitude(), other.getLattitude()) != 0) {
            return false;
         } else if (Double.compare(this.getLongitude(), other.getLongitude()) != 0) {
            return false;
         } else if (this.getOilTemp() != other.getOilTemp()) {
            return false;
         } else if (this.getRPM() != other.getRPM()) {
            return false;
         } else if (this.getSpeed() != other.getSpeed()) {
            return false;
         } else if (this.getUtcDateTime() != other.getUtcDateTime()) {
            return false;
         } else if (this.getStateId() != other.getStateId()) {
            return false;
         } else if (this.getGeoStateId() != other.getGeoStateId()) {
            return false;
         } else if (this.getReceive_time() != other.getReceive_time()) {
            return false;
         } else {
            Object this$DateTime = this.getDateTime();
            Object other$DateTime = other.getDateTime();
            if (this$DateTime == null ? other$DateTime == null : this$DateTime.equals(other$DateTime)) {
               Object this$DriverId = this.getDriverId();
               Object other$DriverId = other.getDriverId();
               if (this$DriverId == null ? other$DriverId == null : this$DriverId.equals(other$DriverId)) {
                  Object this$LatLong = this.getLatLong();
                  Object other$LatLong = other.getLatLong();
                  if (this$LatLong == null ? other$LatLong == null : this$LatLong.equals(other$LatLong)) {
                     Object this$PlaceAddress = this.getPlaceAddress();
                     Object other$PlaceAddress = other.getPlaceAddress();
                     if (this$PlaceAddress == null ? other$PlaceAddress == null : this$PlaceAddress.equals(other$PlaceAddress)) {
                        Object this$MAC = this.getMAC();
                        Object other$MAC = other.getMAC();
                        if (this$MAC == null ? other$MAC == null : this$MAC.equals(other$MAC)) {
                           Object this$Model = this.getModel();
                           Object other$Model = other.getModel();
                           if (this$Model == null ? other$Model == null : this$Model.equals(other$Model)) {
                              Object this$Odometer = this.getOdometer();
                              Object other$Odometer = other.getOdometer();
                              if (this$Odometer == null ? other$Odometer == null : this$Odometer.equals(other$Odometer)) {
                                 Object this$SerialNo = this.getSerialNo();
                                 Object other$SerialNo = other.getSerialNo();
                                 if (this$SerialNo == null ? other$SerialNo == null : this$SerialNo.equals(other$SerialNo)) {
                                    Object this$VIN = this.getVIN();
                                    Object other$VIN = other.getVIN();
                                    if (this$VIN == null ? other$VIN == null : this$VIN.equals(other$VIN)) {
                                       Object this$VehicleId = this.getVehicleId();
                                       Object other$VehicleId = other.getVehicleId();
                                       if (this$VehicleId == null ? other$VehicleId == null : this$VehicleId.equals(other$VehicleId)) {
                                          Object this$Version = this.getVersion();
                                          Object other$Version = other.getVersion();
                                          if (this$Version == null ? other$Version == null : this$Version.equals(other$Version)) {
                                             Object this$receive_data_time = this.getReceive_data_time();
                                             Object other$receive_data_time = other.getReceive_data_time();
                                             return this$receive_data_time == null
                                                ? other$receive_data_time == null
                                                : this$receive_data_time.equals(other$receive_data_time);
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
      return other instanceof ELDLogData;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $CoolantTemp = this.getCoolantTemp();
      result = result * 59 + (int)($CoolantTemp >>> 32 ^ $CoolantTemp);
      long $lDateTime = this.getLDateTime();
      result = result * 59 + (int)($lDateTime >>> 32 ^ $lDateTime);
      long $clientId = this.getClientId();
      result = result * 59 + (int)($clientId >>> 32 ^ $clientId);
      long $EngineHours = Double.doubleToLongBits(this.getEngineHours());
      result = result * 59 + (int)($EngineHours >>> 32 ^ $EngineHours);
      long $FuelTankTemp = this.getFuelTankTemp();
      result = result * 59 + (int)($FuelTankTemp >>> 32 ^ $FuelTankTemp);
      long $Lattitude = Double.doubleToLongBits(this.getLattitude());
      result = result * 59 + (int)($Lattitude >>> 32 ^ $Lattitude);
      long $Longitude = Double.doubleToLongBits(this.getLongitude());
      result = result * 59 + (int)($Longitude >>> 32 ^ $Longitude);
      long $OilTemp = this.getOilTemp();
      result = result * 59 + (int)($OilTemp >>> 32 ^ $OilTemp);
      long $RPM = this.getRPM();
      result = result * 59 + (int)($RPM >>> 32 ^ $RPM);
      long $Speed = this.getSpeed();
      result = result * 59 + (int)($Speed >>> 32 ^ $Speed);
      long $utcDateTime = this.getUtcDateTime();
      result = result * 59 + (int)($utcDateTime >>> 32 ^ $utcDateTime);
      long $stateId = this.getStateId();
      result = result * 59 + (int)($stateId >>> 32 ^ $stateId);
      long $geoStateId = this.getGeoStateId();
      result = result * 59 + (int)($geoStateId >>> 32 ^ $geoStateId);
      long $receive_time = this.getReceive_time();
      result = result * 59 + (int)($receive_time >>> 32 ^ $receive_time);
      Object $DateTime = this.getDateTime();
      result = result * 59 + ($DateTime == null ? 43 : $DateTime.hashCode());
      Object $DriverId = this.getDriverId();
      result = result * 59 + ($DriverId == null ? 43 : $DriverId.hashCode());
      Object $LatLong = this.getLatLong();
      result = result * 59 + ($LatLong == null ? 43 : $LatLong.hashCode());
      Object $PlaceAddress = this.getPlaceAddress();
      result = result * 59 + ($PlaceAddress == null ? 43 : $PlaceAddress.hashCode());
      Object $MAC = this.getMAC();
      result = result * 59 + ($MAC == null ? 43 : $MAC.hashCode());
      Object $Model = this.getModel();
      result = result * 59 + ($Model == null ? 43 : $Model.hashCode());
      Object $Odometer = this.getOdometer();
      result = result * 59 + ($Odometer == null ? 43 : $Odometer.hashCode());
      Object $SerialNo = this.getSerialNo();
      result = result * 59 + ($SerialNo == null ? 43 : $SerialNo.hashCode());
      Object $VIN = this.getVIN();
      result = result * 59 + ($VIN == null ? 43 : $VIN.hashCode());
      Object $VehicleId = this.getVehicleId();
      result = result * 59 + ($VehicleId == null ? 43 : $VehicleId.hashCode());
      Object $Version = this.getVersion();
      result = result * 59 + ($Version == null ? 43 : $Version.hashCode());
      Object $receive_data_time = this.getReceive_data_time();
      return result * 59 + ($receive_data_time == null ? 43 : $receive_data_time.hashCode());
   }

   @Override
   public String toString() {
      return "ELDLogData(CoolantTemp="
         + this.getCoolantTemp()
         + ", DateTime="
         + this.getDateTime()
         + ", lDateTime="
         + this.getLDateTime()
         + ", DriverId="
         + this.getDriverId()
         + ", clientId="
         + this.getClientId()
         + ", EngineHours="
         + this.getEngineHours()
         + ", FuelTankTemp="
         + this.getFuelTankTemp()
         + ", LatLong="
         + this.getLatLong()
         + ", Lattitude="
         + this.getLattitude()
         + ", Longitude="
         + this.getLongitude()
         + ", PlaceAddress="
         + this.getPlaceAddress()
         + ", MAC="
         + this.getMAC()
         + ", Model="
         + this.getModel()
         + ", Odometer="
         + this.getOdometer()
         + ", OilTemp="
         + this.getOilTemp()
         + ", RPM="
         + this.getRPM()
         + ", SerialNo="
         + this.getSerialNo()
         + ", Speed="
         + this.getSpeed()
         + ", VIN="
         + this.getVIN()
         + ", VehicleId="
         + this.getVehicleId()
         + ", Version="
         + this.getVersion()
         + ", utcDateTime="
         + this.getUtcDateTime()
         + ", stateId="
         + this.getStateId()
         + ", geoStateId="
         + this.getGeoStateId()
         + ", receive_time="
         + this.getReceive_time()
         + ", receive_data_time="
         + this.getReceive_data_time()
         + ")";
   }

   public long getCoolantTemp() {
      return this.CoolantTemp;
   }

   public String getDateTime() {
      return this.DateTime;
   }

   public long getLDateTime() {
      return this.lDateTime;
   }

   public String getDriverId() {
      return this.DriverId;
   }

   public long getClientId() {
      return this.clientId;
   }

   public double getEngineHours() {
      return this.EngineHours;
   }

   public long getFuelTankTemp() {
      return this.FuelTankTemp;
   }

   public String getLatLong() {
      return this.LatLong;
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

   public String getMAC() {
      return this.MAC;
   }

   public String getModel() {
      return this.Model;
   }

   public String getOdometer() {
      return this.Odometer;
   }

   public long getOilTemp() {
      return this.OilTemp;
   }

   public long getRPM() {
      return this.RPM;
   }

   public String getSerialNo() {
      return this.SerialNo;
   }

   public long getSpeed() {
      return this.Speed;
   }

   public String getVIN() {
      return this.VIN;
   }

   public String getVehicleId() {
      return this.VehicleId;
   }

   public String getVersion() {
      return this.Version;
   }

   public long getUtcDateTime() {
      return this.utcDateTime;
   }

   public long getStateId() {
      return this.stateId;
   }

   public long getGeoStateId() {
      return this.geoStateId;
   }

   public long getReceive_time() {
      return this.receive_time;
   }

   public String getReceive_data_time() {
      return this.receive_data_time;
   }

   public void setCoolantTemp(final long CoolantTemp) {
      this.CoolantTemp = CoolantTemp;
   }

   public void setDateTime(final String DateTime) {
      this.DateTime = DateTime;
   }

   public void setLDateTime(final long lDateTime) {
      this.lDateTime = lDateTime;
   }

   public void setDriverId(final String DriverId) {
      this.DriverId = DriverId;
   }

   public void setClientId(final long clientId) {
      this.clientId = clientId;
   }

   public void setEngineHours(final double EngineHours) {
      this.EngineHours = EngineHours;
   }

   public void setFuelTankTemp(final long FuelTankTemp) {
      this.FuelTankTemp = FuelTankTemp;
   }

   public void setLatLong(final String LatLong) {
      this.LatLong = LatLong;
   }

   public void setLattitude(final double Lattitude) {
      this.Lattitude = Lattitude;
   }

   public void setLongitude(final double Longitude) {
      this.Longitude = Longitude;
   }

   public void setPlaceAddress(final String PlaceAddress) {
      this.PlaceAddress = PlaceAddress;
   }

   public void setMAC(final String MAC) {
      this.MAC = MAC;
   }

   public void setModel(final String Model) {
      this.Model = Model;
   }

   public void setOdometer(final String Odometer) {
      this.Odometer = Odometer;
   }

   public void setOilTemp(final long OilTemp) {
      this.OilTemp = OilTemp;
   }

   public void setRPM(final long RPM) {
      this.RPM = RPM;
   }

   public void setSerialNo(final String SerialNo) {
      this.SerialNo = SerialNo;
   }

   public void setSpeed(final long Speed) {
      this.Speed = Speed;
   }

   public void setVIN(final String VIN) {
      this.VIN = VIN;
   }

   public void setVehicleId(final String VehicleId) {
      this.VehicleId = VehicleId;
   }

   public void setVersion(final String Version) {
      this.Version = Version;
   }

   public void setUtcDateTime(final long utcDateTime) {
      this.utcDateTime = utcDateTime;
   }

   public void setStateId(final long stateId) {
      this.stateId = stateId;
   }

   public void setGeoStateId(final long geoStateId) {
      this.geoStateId = geoStateId;
   }

   public void setReceive_time(final long receive_time) {
      this.receive_time = receive_time;
   }

   public void setReceive_data_time(final String receive_data_time) {
      this.receive_data_time = receive_data_time;
   }
}
