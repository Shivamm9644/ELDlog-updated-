package com.mes.eld_log.models;

import java.io.Serializable;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.core.mapping.Document;

@EntityScan
@Document(
   collection = "live_data_log"
)
public class LiveDataLog implements Serializable {
   private static final long serialVersionUID = 1L;
   private String MAC;
   private long DateTime;
   private String DriverId;
   private double Lattitude;
   private double Longitude;
   private String PlaceAddress;
   private String Model;
   private String Odometer;
   private long clientId;
   private String SerialNo;
   private long Speed;
   private String VIN;
   private String VehicleId;
   private String Version;
   private long receive_time;

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof LiveDataLog)) {
         return false;
      } else {
         LiveDataLog other = (LiveDataLog)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getDateTime() != other.getDateTime()) {
            return false;
         } else if (Double.compare(this.getLattitude(), other.getLattitude()) != 0) {
            return false;
         } else if (Double.compare(this.getLongitude(), other.getLongitude()) != 0) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else if (this.getSpeed() != other.getSpeed()) {
            return false;
         } else if (this.getReceive_time() != other.getReceive_time()) {
            return false;
         } else {
            Object this$MAC = this.getMAC();
            Object other$MAC = other.getMAC();
            if (this$MAC == null ? other$MAC == null : this$MAC.equals(other$MAC)) {
               Object this$DriverId = this.getDriverId();
               Object other$DriverId = other.getDriverId();
               if (this$DriverId == null ? other$DriverId == null : this$DriverId.equals(other$DriverId)) {
                  Object this$PlaceAddress = this.getPlaceAddress();
                  Object other$PlaceAddress = other.getPlaceAddress();
                  if (this$PlaceAddress == null ? other$PlaceAddress == null : this$PlaceAddress.equals(other$PlaceAddress)) {
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
                                    return this$Version == null ? other$Version == null : this$Version.equals(other$Version);
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
      return other instanceof LiveDataLog;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $DateTime = this.getDateTime();
      result = result * 59 + (int)($DateTime >>> 32 ^ $DateTime);
      long $Lattitude = Double.doubleToLongBits(this.getLattitude());
      result = result * 59 + (int)($Lattitude >>> 32 ^ $Lattitude);
      long $Longitude = Double.doubleToLongBits(this.getLongitude());
      result = result * 59 + (int)($Longitude >>> 32 ^ $Longitude);
      long $clientId = this.getClientId();
      result = result * 59 + (int)($clientId >>> 32 ^ $clientId);
      long $Speed = this.getSpeed();
      result = result * 59 + (int)($Speed >>> 32 ^ $Speed);
      long $receive_time = this.getReceive_time();
      result = result * 59 + (int)($receive_time >>> 32 ^ $receive_time);
      Object $MAC = this.getMAC();
      result = result * 59 + ($MAC == null ? 43 : $MAC.hashCode());
      Object $DriverId = this.getDriverId();
      result = result * 59 + ($DriverId == null ? 43 : $DriverId.hashCode());
      Object $PlaceAddress = this.getPlaceAddress();
      result = result * 59 + ($PlaceAddress == null ? 43 : $PlaceAddress.hashCode());
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
      return result * 59 + ($Version == null ? 43 : $Version.hashCode());
   }

   @Override
   public String toString() {
      return "LiveDataLog(MAC="
         + this.getMAC()
         + ", DateTime="
         + this.getDateTime()
         + ", DriverId="
         + this.getDriverId()
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
         + ", clientId="
         + this.getClientId()
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
         + ", receive_time="
         + this.getReceive_time()
         + ")";
   }

   public String getMAC() {
      return this.MAC;
   }

   public long getDateTime() {
      return this.DateTime;
   }

   public String getDriverId() {
      return this.DriverId;
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

   public long getClientId() {
      return this.clientId;
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

   public long getReceive_time() {
      return this.receive_time;
   }

   public void setMAC(final String MAC) {
      this.MAC = MAC;
   }

   public void setDateTime(final long DateTime) {
      this.DateTime = DateTime;
   }

   public void setDriverId(final String DriverId) {
      this.DriverId = DriverId;
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

   public void setModel(final String Model) {
      this.Model = Model;
   }

   public void setOdometer(final String Odometer) {
      this.Odometer = Odometer;
   }

   public void setClientId(final long clientId) {
      this.clientId = clientId;
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

   public void setReceive_time(final long receive_time) {
      this.receive_time = receive_time;
   }
}
