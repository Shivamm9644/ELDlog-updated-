package com.mes.eld_log.models;

import java.io.Serializable;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.core.mapping.Document;

@EntityScan
@Document(
   collection = "ignition_report"
)
public class IgnitionReport implements Serializable {
   private static final long serialVersionUID = 1L;
   private String driverId;
   private String vehicleId;
   private long clientId;
   private String VIN;
   private String Version;
   private String MAC;
   private String Model;
   private String SerialNo;
   private String engineState;
   private String startDateTime;
   private String endDateTime;
   private long startUtcDateTime;
   private long endUtcDateTime;
   private long durationMillis;
   private String startAddress;
   private String endAddress;
   private long startRPM;
   private long endRPM;
   private double startLattitude;
   private double startLongitude;
   private double endLattitude;
   private double endLongitude;
   private long startSpeed;
   private long endSpeed;
   private long startCoolantTemp;
   private long endCoolantTemp;
   private long startFuelTankTemp;
   private long endFuelTankTemp;
   private long startOilTemp;
   private long endOilTemp;
   private double startEngineHours;
   private double endEngineHours;
   private String startOdometer;
   private String endOdometer;
   private long startStateId;
   private long endStateId;
   private long startGeoStateId;
   private long endGeoStateId;

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof IgnitionReport)) {
         return false;
      } else {
         IgnitionReport other = (IgnitionReport)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else if (this.getStartUtcDateTime() != other.getStartUtcDateTime()) {
            return false;
         } else if (this.getEndUtcDateTime() != other.getEndUtcDateTime()) {
            return false;
         } else if (this.getDurationMillis() != other.getDurationMillis()) {
            return false;
         } else if (this.getStartRPM() != other.getStartRPM()) {
            return false;
         } else if (this.getEndRPM() != other.getEndRPM()) {
            return false;
         } else if (Double.compare(this.getStartLattitude(), other.getStartLattitude()) != 0) {
            return false;
         } else if (Double.compare(this.getStartLongitude(), other.getStartLongitude()) != 0) {
            return false;
         } else if (Double.compare(this.getEndLattitude(), other.getEndLattitude()) != 0) {
            return false;
         } else if (Double.compare(this.getEndLongitude(), other.getEndLongitude()) != 0) {
            return false;
         } else if (this.getStartSpeed() != other.getStartSpeed()) {
            return false;
         } else if (this.getEndSpeed() != other.getEndSpeed()) {
            return false;
         } else if (this.getStartCoolantTemp() != other.getStartCoolantTemp()) {
            return false;
         } else if (this.getEndCoolantTemp() != other.getEndCoolantTemp()) {
            return false;
         } else if (this.getStartFuelTankTemp() != other.getStartFuelTankTemp()) {
            return false;
         } else if (this.getEndFuelTankTemp() != other.getEndFuelTankTemp()) {
            return false;
         } else if (this.getStartOilTemp() != other.getStartOilTemp()) {
            return false;
         } else if (this.getEndOilTemp() != other.getEndOilTemp()) {
            return false;
         } else if (Double.compare(this.getStartEngineHours(), other.getStartEngineHours()) != 0) {
            return false;
         } else if (Double.compare(this.getEndEngineHours(), other.getEndEngineHours()) != 0) {
            return false;
         } else if (this.getStartStateId() != other.getStartStateId()) {
            return false;
         } else if (this.getEndStateId() != other.getEndStateId()) {
            return false;
         } else if (this.getStartGeoStateId() != other.getStartGeoStateId()) {
            return false;
         } else if (this.getEndGeoStateId() != other.getEndGeoStateId()) {
            return false;
         } else {
            Object this$driverId = this.getDriverId();
            Object other$driverId = other.getDriverId();
            if (this$driverId == null ? other$driverId == null : this$driverId.equals(other$driverId)) {
               Object this$vehicleId = this.getVehicleId();
               Object other$vehicleId = other.getVehicleId();
               if (this$vehicleId == null ? other$vehicleId == null : this$vehicleId.equals(other$vehicleId)) {
                  Object this$VIN = this.getVIN();
                  Object other$VIN = other.getVIN();
                  if (this$VIN == null ? other$VIN == null : this$VIN.equals(other$VIN)) {
                     Object this$Version = this.getVersion();
                     Object other$Version = other.getVersion();
                     if (this$Version == null ? other$Version == null : this$Version.equals(other$Version)) {
                        Object this$MAC = this.getMAC();
                        Object other$MAC = other.getMAC();
                        if (this$MAC == null ? other$MAC == null : this$MAC.equals(other$MAC)) {
                           Object this$Model = this.getModel();
                           Object other$Model = other.getModel();
                           if (this$Model == null ? other$Model == null : this$Model.equals(other$Model)) {
                              Object this$SerialNo = this.getSerialNo();
                              Object other$SerialNo = other.getSerialNo();
                              if (this$SerialNo == null ? other$SerialNo == null : this$SerialNo.equals(other$SerialNo)) {
                                 Object this$engineState = this.getEngineState();
                                 Object other$engineState = other.getEngineState();
                                 if (this$engineState == null ? other$engineState == null : this$engineState.equals(other$engineState)) {
                                    Object this$startDateTime = this.getStartDateTime();
                                    Object other$startDateTime = other.getStartDateTime();
                                    if (this$startDateTime == null ? other$startDateTime == null : this$startDateTime.equals(other$startDateTime)) {
                                       Object this$endDateTime = this.getEndDateTime();
                                       Object other$endDateTime = other.getEndDateTime();
                                       if (this$endDateTime == null ? other$endDateTime == null : this$endDateTime.equals(other$endDateTime)) {
                                          Object this$startAddress = this.getStartAddress();
                                          Object other$startAddress = other.getStartAddress();
                                          if (this$startAddress == null ? other$startAddress == null : this$startAddress.equals(other$startAddress)) {
                                             Object this$endAddress = this.getEndAddress();
                                             Object other$endAddress = other.getEndAddress();
                                             if (this$endAddress == null ? other$endAddress == null : this$endAddress.equals(other$endAddress)) {
                                                Object this$startOdometer = this.getStartOdometer();
                                                Object other$startOdometer = other.getStartOdometer();
                                                if (this$startOdometer == null ? other$startOdometer == null : this$startOdometer.equals(other$startOdometer)) {
                                                   Object this$endOdometer = this.getEndOdometer();
                                                   Object other$endOdometer = other.getEndOdometer();
                                                   return this$endOdometer == null ? other$endOdometer == null : this$endOdometer.equals(other$endOdometer);
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
      return other instanceof IgnitionReport;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $clientId = this.getClientId();
      result = result * 59 + (int)($clientId >>> 32 ^ $clientId);
      long $startUtcDateTime = this.getStartUtcDateTime();
      result = result * 59 + (int)($startUtcDateTime >>> 32 ^ $startUtcDateTime);
      long $endUtcDateTime = this.getEndUtcDateTime();
      result = result * 59 + (int)($endUtcDateTime >>> 32 ^ $endUtcDateTime);
      long $durationMillis = this.getDurationMillis();
      result = result * 59 + (int)($durationMillis >>> 32 ^ $durationMillis);
      long $startRPM = this.getStartRPM();
      result = result * 59 + (int)($startRPM >>> 32 ^ $startRPM);
      long $endRPM = this.getEndRPM();
      result = result * 59 + (int)($endRPM >>> 32 ^ $endRPM);
      long $startLattitude = Double.doubleToLongBits(this.getStartLattitude());
      result = result * 59 + (int)($startLattitude >>> 32 ^ $startLattitude);
      long $startLongitude = Double.doubleToLongBits(this.getStartLongitude());
      result = result * 59 + (int)($startLongitude >>> 32 ^ $startLongitude);
      long $endLattitude = Double.doubleToLongBits(this.getEndLattitude());
      result = result * 59 + (int)($endLattitude >>> 32 ^ $endLattitude);
      long $endLongitude = Double.doubleToLongBits(this.getEndLongitude());
      result = result * 59 + (int)($endLongitude >>> 32 ^ $endLongitude);
      long $startSpeed = this.getStartSpeed();
      result = result * 59 + (int)($startSpeed >>> 32 ^ $startSpeed);
      long $endSpeed = this.getEndSpeed();
      result = result * 59 + (int)($endSpeed >>> 32 ^ $endSpeed);
      long $startCoolantTemp = this.getStartCoolantTemp();
      result = result * 59 + (int)($startCoolantTemp >>> 32 ^ $startCoolantTemp);
      long $endCoolantTemp = this.getEndCoolantTemp();
      result = result * 59 + (int)($endCoolantTemp >>> 32 ^ $endCoolantTemp);
      long $startFuelTankTemp = this.getStartFuelTankTemp();
      result = result * 59 + (int)($startFuelTankTemp >>> 32 ^ $startFuelTankTemp);
      long $endFuelTankTemp = this.getEndFuelTankTemp();
      result = result * 59 + (int)($endFuelTankTemp >>> 32 ^ $endFuelTankTemp);
      long $startOilTemp = this.getStartOilTemp();
      result = result * 59 + (int)($startOilTemp >>> 32 ^ $startOilTemp);
      long $endOilTemp = this.getEndOilTemp();
      result = result * 59 + (int)($endOilTemp >>> 32 ^ $endOilTemp);
      long $startEngineHours = Double.doubleToLongBits(this.getStartEngineHours());
      result = result * 59 + (int)($startEngineHours >>> 32 ^ $startEngineHours);
      long $endEngineHours = Double.doubleToLongBits(this.getEndEngineHours());
      result = result * 59 + (int)($endEngineHours >>> 32 ^ $endEngineHours);
      long $startStateId = this.getStartStateId();
      result = result * 59 + (int)($startStateId >>> 32 ^ $startStateId);
      long $endStateId = this.getEndStateId();
      result = result * 59 + (int)($endStateId >>> 32 ^ $endStateId);
      long $startGeoStateId = this.getStartGeoStateId();
      result = result * 59 + (int)($startGeoStateId >>> 32 ^ $startGeoStateId);
      long $endGeoStateId = this.getEndGeoStateId();
      result = result * 59 + (int)($endGeoStateId >>> 32 ^ $endGeoStateId);
      Object $driverId = this.getDriverId();
      result = result * 59 + ($driverId == null ? 43 : $driverId.hashCode());
      Object $vehicleId = this.getVehicleId();
      result = result * 59 + ($vehicleId == null ? 43 : $vehicleId.hashCode());
      Object $VIN = this.getVIN();
      result = result * 59 + ($VIN == null ? 43 : $VIN.hashCode());
      Object $Version = this.getVersion();
      result = result * 59 + ($Version == null ? 43 : $Version.hashCode());
      Object $MAC = this.getMAC();
      result = result * 59 + ($MAC == null ? 43 : $MAC.hashCode());
      Object $Model = this.getModel();
      result = result * 59 + ($Model == null ? 43 : $Model.hashCode());
      Object $SerialNo = this.getSerialNo();
      result = result * 59 + ($SerialNo == null ? 43 : $SerialNo.hashCode());
      Object $engineState = this.getEngineState();
      result = result * 59 + ($engineState == null ? 43 : $engineState.hashCode());
      Object $startDateTime = this.getStartDateTime();
      result = result * 59 + ($startDateTime == null ? 43 : $startDateTime.hashCode());
      Object $endDateTime = this.getEndDateTime();
      result = result * 59 + ($endDateTime == null ? 43 : $endDateTime.hashCode());
      Object $startAddress = this.getStartAddress();
      result = result * 59 + ($startAddress == null ? 43 : $startAddress.hashCode());
      Object $endAddress = this.getEndAddress();
      result = result * 59 + ($endAddress == null ? 43 : $endAddress.hashCode());
      Object $startOdometer = this.getStartOdometer();
      result = result * 59 + ($startOdometer == null ? 43 : $startOdometer.hashCode());
      Object $endOdometer = this.getEndOdometer();
      return result * 59 + ($endOdometer == null ? 43 : $endOdometer.hashCode());
   }

   @Override
   public String toString() {
      return "IgnitionReport(driverId="
         + this.getDriverId()
         + ", vehicleId="
         + this.getVehicleId()
         + ", clientId="
         + this.getClientId()
         + ", VIN="
         + this.getVIN()
         + ", Version="
         + this.getVersion()
         + ", MAC="
         + this.getMAC()
         + ", Model="
         + this.getModel()
         + ", SerialNo="
         + this.getSerialNo()
         + ", engineState="
         + this.getEngineState()
         + ", startDateTime="
         + this.getStartDateTime()
         + ", endDateTime="
         + this.getEndDateTime()
         + ", startUtcDateTime="
         + this.getStartUtcDateTime()
         + ", endUtcDateTime="
         + this.getEndUtcDateTime()
         + ", durationMillis="
         + this.getDurationMillis()
         + ", startAddress="
         + this.getStartAddress()
         + ", endAddress="
         + this.getEndAddress()
         + ", startRPM="
         + this.getStartRPM()
         + ", endRPM="
         + this.getEndRPM()
         + ", startLattitude="
         + this.getStartLattitude()
         + ", startLongitude="
         + this.getStartLongitude()
         + ", endLattitude="
         + this.getEndLattitude()
         + ", endLongitude="
         + this.getEndLongitude()
         + ", startSpeed="
         + this.getStartSpeed()
         + ", endSpeed="
         + this.getEndSpeed()
         + ", startCoolantTemp="
         + this.getStartCoolantTemp()
         + ", endCoolantTemp="
         + this.getEndCoolantTemp()
         + ", startFuelTankTemp="
         + this.getStartFuelTankTemp()
         + ", endFuelTankTemp="
         + this.getEndFuelTankTemp()
         + ", startOilTemp="
         + this.getStartOilTemp()
         + ", endOilTemp="
         + this.getEndOilTemp()
         + ", startEngineHours="
         + this.getStartEngineHours()
         + ", endEngineHours="
         + this.getEndEngineHours()
         + ", startOdometer="
         + this.getStartOdometer()
         + ", endOdometer="
         + this.getEndOdometer()
         + ", startStateId="
         + this.getStartStateId()
         + ", endStateId="
         + this.getEndStateId()
         + ", startGeoStateId="
         + this.getStartGeoStateId()
         + ", endGeoStateId="
         + this.getEndGeoStateId()
         + ")";
   }

   public String getDriverId() {
      return this.driverId;
   }

   public String getVehicleId() {
      return this.vehicleId;
   }

   public long getClientId() {
      return this.clientId;
   }

   public String getVIN() {
      return this.VIN;
   }

   public String getVersion() {
      return this.Version;
   }

   public String getMAC() {
      return this.MAC;
   }

   public String getModel() {
      return this.Model;
   }

   public String getSerialNo() {
      return this.SerialNo;
   }

   public String getEngineState() {
      return this.engineState;
   }

   public String getStartDateTime() {
      return this.startDateTime;
   }

   public String getEndDateTime() {
      return this.endDateTime;
   }

   public long getStartUtcDateTime() {
      return this.startUtcDateTime;
   }

   public long getEndUtcDateTime() {
      return this.endUtcDateTime;
   }

   public long getDurationMillis() {
      return this.durationMillis;
   }

   public String getStartAddress() {
      return this.startAddress;
   }

   public String getEndAddress() {
      return this.endAddress;
   }

   public long getStartRPM() {
      return this.startRPM;
   }

   public long getEndRPM() {
      return this.endRPM;
   }

   public double getStartLattitude() {
      return this.startLattitude;
   }

   public double getStartLongitude() {
      return this.startLongitude;
   }

   public double getEndLattitude() {
      return this.endLattitude;
   }

   public double getEndLongitude() {
      return this.endLongitude;
   }

   public long getStartSpeed() {
      return this.startSpeed;
   }

   public long getEndSpeed() {
      return this.endSpeed;
   }

   public long getStartCoolantTemp() {
      return this.startCoolantTemp;
   }

   public long getEndCoolantTemp() {
      return this.endCoolantTemp;
   }

   public long getStartFuelTankTemp() {
      return this.startFuelTankTemp;
   }

   public long getEndFuelTankTemp() {
      return this.endFuelTankTemp;
   }

   public long getStartOilTemp() {
      return this.startOilTemp;
   }

   public long getEndOilTemp() {
      return this.endOilTemp;
   }

   public double getStartEngineHours() {
      return this.startEngineHours;
   }

   public double getEndEngineHours() {
      return this.endEngineHours;
   }

   public String getStartOdometer() {
      return this.startOdometer;
   }

   public String getEndOdometer() {
      return this.endOdometer;
   }

   public long getStartStateId() {
      return this.startStateId;
   }

   public long getEndStateId() {
      return this.endStateId;
   }

   public long getStartGeoStateId() {
      return this.startGeoStateId;
   }

   public long getEndGeoStateId() {
      return this.endGeoStateId;
   }

   public void setDriverId(final String driverId) {
      this.driverId = driverId;
   }

   public void setVehicleId(final String vehicleId) {
      this.vehicleId = vehicleId;
   }

   public void setClientId(final long clientId) {
      this.clientId = clientId;
   }

   public void setVIN(final String VIN) {
      this.VIN = VIN;
   }

   public void setVersion(final String Version) {
      this.Version = Version;
   }

   public void setMAC(final String MAC) {
      this.MAC = MAC;
   }

   public void setModel(final String Model) {
      this.Model = Model;
   }

   public void setSerialNo(final String SerialNo) {
      this.SerialNo = SerialNo;
   }

   public void setEngineState(final String engineState) {
      this.engineState = engineState;
   }

   public void setStartDateTime(final String startDateTime) {
      this.startDateTime = startDateTime;
   }

   public void setEndDateTime(final String endDateTime) {
      this.endDateTime = endDateTime;
   }

   public void setStartUtcDateTime(final long startUtcDateTime) {
      this.startUtcDateTime = startUtcDateTime;
   }

   public void setEndUtcDateTime(final long endUtcDateTime) {
      this.endUtcDateTime = endUtcDateTime;
   }

   public void setDurationMillis(final long durationMillis) {
      this.durationMillis = durationMillis;
   }

   public void setStartAddress(final String startAddress) {
      this.startAddress = startAddress;
   }

   public void setEndAddress(final String endAddress) {
      this.endAddress = endAddress;
   }

   public void setStartRPM(final long startRPM) {
      this.startRPM = startRPM;
   }

   public void setEndRPM(final long endRPM) {
      this.endRPM = endRPM;
   }

   public void setStartLattitude(final double startLattitude) {
      this.startLattitude = startLattitude;
   }

   public void setStartLongitude(final double startLongitude) {
      this.startLongitude = startLongitude;
   }

   public void setEndLattitude(final double endLattitude) {
      this.endLattitude = endLattitude;
   }

   public void setEndLongitude(final double endLongitude) {
      this.endLongitude = endLongitude;
   }

   public void setStartSpeed(final long startSpeed) {
      this.startSpeed = startSpeed;
   }

   public void setEndSpeed(final long endSpeed) {
      this.endSpeed = endSpeed;
   }

   public void setStartCoolantTemp(final long startCoolantTemp) {
      this.startCoolantTemp = startCoolantTemp;
   }

   public void setEndCoolantTemp(final long endCoolantTemp) {
      this.endCoolantTemp = endCoolantTemp;
   }

   public void setStartFuelTankTemp(final long startFuelTankTemp) {
      this.startFuelTankTemp = startFuelTankTemp;
   }

   public void setEndFuelTankTemp(final long endFuelTankTemp) {
      this.endFuelTankTemp = endFuelTankTemp;
   }

   public void setStartOilTemp(final long startOilTemp) {
      this.startOilTemp = startOilTemp;
   }

   public void setEndOilTemp(final long endOilTemp) {
      this.endOilTemp = endOilTemp;
   }

   public void setStartEngineHours(final double startEngineHours) {
      this.startEngineHours = startEngineHours;
   }

   public void setEndEngineHours(final double endEngineHours) {
      this.endEngineHours = endEngineHours;
   }

   public void setStartOdometer(final String startOdometer) {
      this.startOdometer = startOdometer;
   }

   public void setEndOdometer(final String endOdometer) {
      this.endOdometer = endOdometer;
   }

   public void setStartStateId(final long startStateId) {
      this.startStateId = startStateId;
   }

   public void setEndStateId(final long endStateId) {
      this.endStateId = endStateId;
   }

   public void setStartGeoStateId(final long startGeoStateId) {
      this.startGeoStateId = startGeoStateId;
   }

   public void setEndGeoStateId(final long endGeoStateId) {
      this.endGeoStateId = endGeoStateId;
   }
}
