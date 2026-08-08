package com.mes.eld_log.models;

import java.io.Serializable;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.core.mapping.Document;

@EntityScan
@Document(
   collection = "alerts_log"
)
public class AlertsLog implements Serializable {
   private static final long serialVersionUID = 1L;
   private long driverId;
   private long vehicleId;
   private long clientId;
   private String MAC;
   private String model;
   private String serialNo;
   private String vin;
   private String version;
   private String odometer;
   private long startUtcDateTime;
   private long endUtcDateTime;
   private long durationInMillis;
   private String placeAddress;
   private String message;
   private int isRead;
   private String readByEmail;
   private long readingTimestamp;
   private double lattitude;
   private double longitude;
   private long addedTimestamp;

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof AlertsLog)) {
         return false;
      } else {
         AlertsLog other = (AlertsLog)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getDriverId() != other.getDriverId()) {
            return false;
         } else if (this.getVehicleId() != other.getVehicleId()) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else if (this.getStartUtcDateTime() != other.getStartUtcDateTime()) {
            return false;
         } else if (this.getEndUtcDateTime() != other.getEndUtcDateTime()) {
            return false;
         } else if (this.getDurationInMillis() != other.getDurationInMillis()) {
            return false;
         } else if (this.getIsRead() != other.getIsRead()) {
            return false;
         } else if (this.getReadingTimestamp() != other.getReadingTimestamp()) {
            return false;
         } else if (Double.compare(this.getLattitude(), other.getLattitude()) != 0) {
            return false;
         } else if (Double.compare(this.getLongitude(), other.getLongitude()) != 0) {
            return false;
         } else if (this.getAddedTimestamp() != other.getAddedTimestamp()) {
            return false;
         } else {
            Object this$MAC = this.getMAC();
            Object other$MAC = other.getMAC();
            if (this$MAC == null ? other$MAC == null : this$MAC.equals(other$MAC)) {
               Object this$model = this.getModel();
               Object other$model = other.getModel();
               if (this$model == null ? other$model == null : this$model.equals(other$model)) {
                  Object this$serialNo = this.getSerialNo();
                  Object other$serialNo = other.getSerialNo();
                  if (this$serialNo == null ? other$serialNo == null : this$serialNo.equals(other$serialNo)) {
                     Object this$vin = this.getVin();
                     Object other$vin = other.getVin();
                     if (this$vin == null ? other$vin == null : this$vin.equals(other$vin)) {
                        Object this$version = this.getVersion();
                        Object other$version = other.getVersion();
                        if (this$version == null ? other$version == null : this$version.equals(other$version)) {
                           Object this$odometer = this.getOdometer();
                           Object other$odometer = other.getOdometer();
                           if (this$odometer == null ? other$odometer == null : this$odometer.equals(other$odometer)) {
                              Object this$placeAddress = this.getPlaceAddress();
                              Object other$placeAddress = other.getPlaceAddress();
                              if (this$placeAddress == null ? other$placeAddress == null : this$placeAddress.equals(other$placeAddress)) {
                                 Object this$message = this.getMessage();
                                 Object other$message = other.getMessage();
                                 if (this$message == null ? other$message == null : this$message.equals(other$message)) {
                                    Object this$readByEmail = this.getReadByEmail();
                                    Object other$readByEmail = other.getReadByEmail();
                                    return this$readByEmail == null ? other$readByEmail == null : this$readByEmail.equals(other$readByEmail);
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
      return other instanceof AlertsLog;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $driverId = this.getDriverId();
      result = result * 59 + (int)($driverId >>> 32 ^ $driverId);
      long $vehicleId = this.getVehicleId();
      result = result * 59 + (int)($vehicleId >>> 32 ^ $vehicleId);
      long $clientId = this.getClientId();
      result = result * 59 + (int)($clientId >>> 32 ^ $clientId);
      long $startUtcDateTime = this.getStartUtcDateTime();
      result = result * 59 + (int)($startUtcDateTime >>> 32 ^ $startUtcDateTime);
      long $endUtcDateTime = this.getEndUtcDateTime();
      result = result * 59 + (int)($endUtcDateTime >>> 32 ^ $endUtcDateTime);
      long $durationInMillis = this.getDurationInMillis();
      result = result * 59 + (int)($durationInMillis >>> 32 ^ $durationInMillis);
      result = result * 59 + this.getIsRead();
      long $readingTimestamp = this.getReadingTimestamp();
      result = result * 59 + (int)($readingTimestamp >>> 32 ^ $readingTimestamp);
      long $lattitude = Double.doubleToLongBits(this.getLattitude());
      result = result * 59 + (int)($lattitude >>> 32 ^ $lattitude);
      long $longitude = Double.doubleToLongBits(this.getLongitude());
      result = result * 59 + (int)($longitude >>> 32 ^ $longitude);
      long $addedTimestamp = this.getAddedTimestamp();
      result = result * 59 + (int)($addedTimestamp >>> 32 ^ $addedTimestamp);
      Object $MAC = this.getMAC();
      result = result * 59 + ($MAC == null ? 43 : $MAC.hashCode());
      Object $model = this.getModel();
      result = result * 59 + ($model == null ? 43 : $model.hashCode());
      Object $serialNo = this.getSerialNo();
      result = result * 59 + ($serialNo == null ? 43 : $serialNo.hashCode());
      Object $vin = this.getVin();
      result = result * 59 + ($vin == null ? 43 : $vin.hashCode());
      Object $version = this.getVersion();
      result = result * 59 + ($version == null ? 43 : $version.hashCode());
      Object $odometer = this.getOdometer();
      result = result * 59 + ($odometer == null ? 43 : $odometer.hashCode());
      Object $placeAddress = this.getPlaceAddress();
      result = result * 59 + ($placeAddress == null ? 43 : $placeAddress.hashCode());
      Object $message = this.getMessage();
      result = result * 59 + ($message == null ? 43 : $message.hashCode());
      Object $readByEmail = this.getReadByEmail();
      return result * 59 + ($readByEmail == null ? 43 : $readByEmail.hashCode());
   }

   @Override
   public String toString() {
      return "AlertsLog(driverId="
         + this.getDriverId()
         + ", vehicleId="
         + this.getVehicleId()
         + ", clientId="
         + this.getClientId()
         + ", MAC="
         + this.getMAC()
         + ", model="
         + this.getModel()
         + ", serialNo="
         + this.getSerialNo()
         + ", vin="
         + this.getVin()
         + ", version="
         + this.getVersion()
         + ", odometer="
         + this.getOdometer()
         + ", startUtcDateTime="
         + this.getStartUtcDateTime()
         + ", endUtcDateTime="
         + this.getEndUtcDateTime()
         + ", durationInMillis="
         + this.getDurationInMillis()
         + ", placeAddress="
         + this.getPlaceAddress()
         + ", message="
         + this.getMessage()
         + ", isRead="
         + this.getIsRead()
         + ", readByEmail="
         + this.getReadByEmail()
         + ", readingTimestamp="
         + this.getReadingTimestamp()
         + ", lattitude="
         + this.getLattitude()
         + ", longitude="
         + this.getLongitude()
         + ", addedTimestamp="
         + this.getAddedTimestamp()
         + ")";
   }

   public long getDriverId() {
      return this.driverId;
   }

   public long getVehicleId() {
      return this.vehicleId;
   }

   public long getClientId() {
      return this.clientId;
   }

   public String getMAC() {
      return this.MAC;
   }

   public String getModel() {
      return this.model;
   }

   public String getSerialNo() {
      return this.serialNo;
   }

   public String getVin() {
      return this.vin;
   }

   public String getVersion() {
      return this.version;
   }

   public String getOdometer() {
      return this.odometer;
   }

   public long getStartUtcDateTime() {
      return this.startUtcDateTime;
   }

   public long getEndUtcDateTime() {
      return this.endUtcDateTime;
   }

   public long getDurationInMillis() {
      return this.durationInMillis;
   }

   public String getPlaceAddress() {
      return this.placeAddress;
   }

   public String getMessage() {
      return this.message;
   }

   public int getIsRead() {
      return this.isRead;
   }

   public String getReadByEmail() {
      return this.readByEmail;
   }

   public long getReadingTimestamp() {
      return this.readingTimestamp;
   }

   public double getLattitude() {
      return this.lattitude;
   }

   public double getLongitude() {
      return this.longitude;
   }

   public long getAddedTimestamp() {
      return this.addedTimestamp;
   }

   public void setDriverId(final long driverId) {
      this.driverId = driverId;
   }

   public void setVehicleId(final long vehicleId) {
      this.vehicleId = vehicleId;
   }

   public void setClientId(final long clientId) {
      this.clientId = clientId;
   }

   public void setMAC(final String MAC) {
      this.MAC = MAC;
   }

   public void setModel(final String model) {
      this.model = model;
   }

   public void setSerialNo(final String serialNo) {
      this.serialNo = serialNo;
   }

   public void setVin(final String vin) {
      this.vin = vin;
   }

   public void setVersion(final String version) {
      this.version = version;
   }

   public void setOdometer(final String odometer) {
      this.odometer = odometer;
   }

   public void setStartUtcDateTime(final long startUtcDateTime) {
      this.startUtcDateTime = startUtcDateTime;
   }

   public void setEndUtcDateTime(final long endUtcDateTime) {
      this.endUtcDateTime = endUtcDateTime;
   }

   public void setDurationInMillis(final long durationInMillis) {
      this.durationInMillis = durationInMillis;
   }

   public void setPlaceAddress(final String placeAddress) {
      this.placeAddress = placeAddress;
   }

   public void setMessage(final String message) {
      this.message = message;
   }

   public void setIsRead(final int isRead) {
      this.isRead = isRead;
   }

   public void setReadByEmail(final String readByEmail) {
      this.readByEmail = readByEmail;
   }

   public void setReadingTimestamp(final long readingTimestamp) {
      this.readingTimestamp = readingTimestamp;
   }

   public void setLattitude(final double lattitude) {
      this.lattitude = lattitude;
   }

   public void setLongitude(final double longitude) {
      this.longitude = longitude;
   }

   public void setAddedTimestamp(final long addedTimestamp) {
      this.addedTimestamp = addedTimestamp;
   }
}
