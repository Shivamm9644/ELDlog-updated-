package com.mes.eld_log.models;

import java.io.Serializable;
import java.util.ArrayList;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.core.mapping.Document;

@EntityScan
@Document(
   collection = "dvir_data"
)
public class DVIRData implements Serializable {
   private static final long serialVersionUID = 1L;
   private String tokenNo;
   private String localId;
   private long driverId;
   private long vehicleId;
   private long clientId;
   private String dateTime;
   private long lDateTime;
   private String location;
   private ArrayList truckDefect;
   private ArrayList trailerDefect;
   private String notes;
   private String vehicleCondition;
   private String driverSignFile;
   private String companyName;
   private double odometer;
   private String engineHour;
   private ArrayList trailer;
   private String timestamp;
   private long receivedTimestamp;

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof DVIRData)) {
         return false;
      } else {
         DVIRData other = (DVIRData)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getDriverId() != other.getDriverId()) {
            return false;
         } else if (this.getVehicleId() != other.getVehicleId()) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else if (this.getLDateTime() != other.getLDateTime()) {
            return false;
         } else if (Double.compare(this.getOdometer(), other.getOdometer()) != 0) {
            return false;
         } else if (this.getReceivedTimestamp() != other.getReceivedTimestamp()) {
            return false;
         } else {
            Object this$tokenNo = this.getTokenNo();
            Object other$tokenNo = other.getTokenNo();
            if (this$tokenNo == null ? other$tokenNo == null : this$tokenNo.equals(other$tokenNo)) {
               Object this$localId = this.getLocalId();
               Object other$localId = other.getLocalId();
               if (this$localId == null ? other$localId == null : this$localId.equals(other$localId)) {
                  Object this$dateTime = this.getDateTime();
                  Object other$dateTime = other.getDateTime();
                  if (this$dateTime == null ? other$dateTime == null : this$dateTime.equals(other$dateTime)) {
                     Object this$location = this.getLocation();
                     Object other$location = other.getLocation();
                     if (this$location == null ? other$location == null : this$location.equals(other$location)) {
                        Object this$truckDefect = this.getTruckDefect();
                        Object other$truckDefect = other.getTruckDefect();
                        if (this$truckDefect == null ? other$truckDefect == null : this$truckDefect.equals(other$truckDefect)) {
                           Object this$trailerDefect = this.getTrailerDefect();
                           Object other$trailerDefect = other.getTrailerDefect();
                           if (this$trailerDefect == null ? other$trailerDefect == null : this$trailerDefect.equals(other$trailerDefect)) {
                              Object this$notes = this.getNotes();
                              Object other$notes = other.getNotes();
                              if (this$notes == null ? other$notes == null : this$notes.equals(other$notes)) {
                                 Object this$vehicleCondition = this.getVehicleCondition();
                                 Object other$vehicleCondition = other.getVehicleCondition();
                                 if (this$vehicleCondition == null ? other$vehicleCondition == null : this$vehicleCondition.equals(other$vehicleCondition)) {
                                    Object this$driverSignFile = this.getDriverSignFile();
                                    Object other$driverSignFile = other.getDriverSignFile();
                                    if (this$driverSignFile == null ? other$driverSignFile == null : this$driverSignFile.equals(other$driverSignFile)) {
                                       Object this$companyName = this.getCompanyName();
                                       Object other$companyName = other.getCompanyName();
                                       if (this$companyName == null ? other$companyName == null : this$companyName.equals(other$companyName)) {
                                          Object this$engineHour = this.getEngineHour();
                                          Object other$engineHour = other.getEngineHour();
                                          if (this$engineHour == null ? other$engineHour == null : this$engineHour.equals(other$engineHour)) {
                                             Object this$trailer = this.getTrailer();
                                             Object other$trailer = other.getTrailer();
                                             if (this$trailer == null ? other$trailer == null : this$trailer.equals(other$trailer)) {
                                                Object this$timestamp = this.getTimestamp();
                                                Object other$timestamp = other.getTimestamp();
                                                return this$timestamp == null ? other$timestamp == null : this$timestamp.equals(other$timestamp);
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
      return other instanceof DVIRData;
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
      long $lDateTime = this.getLDateTime();
      result = result * 59 + (int)($lDateTime >>> 32 ^ $lDateTime);
      long $odometer = Double.doubleToLongBits(this.getOdometer());
      result = result * 59 + (int)($odometer >>> 32 ^ $odometer);
      long $receivedTimestamp = this.getReceivedTimestamp();
      result = result * 59 + (int)($receivedTimestamp >>> 32 ^ $receivedTimestamp);
      Object $tokenNo = this.getTokenNo();
      result = result * 59 + ($tokenNo == null ? 43 : $tokenNo.hashCode());
      Object $localId = this.getLocalId();
      result = result * 59 + ($localId == null ? 43 : $localId.hashCode());
      Object $dateTime = this.getDateTime();
      result = result * 59 + ($dateTime == null ? 43 : $dateTime.hashCode());
      Object $location = this.getLocation();
      result = result * 59 + ($location == null ? 43 : $location.hashCode());
      Object $truckDefect = this.getTruckDefect();
      result = result * 59 + ($truckDefect == null ? 43 : $truckDefect.hashCode());
      Object $trailerDefect = this.getTrailerDefect();
      result = result * 59 + ($trailerDefect == null ? 43 : $trailerDefect.hashCode());
      Object $notes = this.getNotes();
      result = result * 59 + ($notes == null ? 43 : $notes.hashCode());
      Object $vehicleCondition = this.getVehicleCondition();
      result = result * 59 + ($vehicleCondition == null ? 43 : $vehicleCondition.hashCode());
      Object $driverSignFile = this.getDriverSignFile();
      result = result * 59 + ($driverSignFile == null ? 43 : $driverSignFile.hashCode());
      Object $companyName = this.getCompanyName();
      result = result * 59 + ($companyName == null ? 43 : $companyName.hashCode());
      Object $engineHour = this.getEngineHour();
      result = result * 59 + ($engineHour == null ? 43 : $engineHour.hashCode());
      Object $trailer = this.getTrailer();
      result = result * 59 + ($trailer == null ? 43 : $trailer.hashCode());
      Object $timestamp = this.getTimestamp();
      return result * 59 + ($timestamp == null ? 43 : $timestamp.hashCode());
   }

   @Override
   public String toString() {
      return "DVIRData(tokenNo="
         + this.getTokenNo()
         + ", localId="
         + this.getLocalId()
         + ", driverId="
         + this.getDriverId()
         + ", vehicleId="
         + this.getVehicleId()
         + ", clientId="
         + this.getClientId()
         + ", dateTime="
         + this.getDateTime()
         + ", lDateTime="
         + this.getLDateTime()
         + ", location="
         + this.getLocation()
         + ", truckDefect="
         + this.getTruckDefect()
         + ", trailerDefect="
         + this.getTrailerDefect()
         + ", notes="
         + this.getNotes()
         + ", vehicleCondition="
         + this.getVehicleCondition()
         + ", driverSignFile="
         + this.getDriverSignFile()
         + ", companyName="
         + this.getCompanyName()
         + ", odometer="
         + this.getOdometer()
         + ", engineHour="
         + this.getEngineHour()
         + ", trailer="
         + this.getTrailer()
         + ", timestamp="
         + this.getTimestamp()
         + ", receivedTimestamp="
         + this.getReceivedTimestamp()
         + ")";
   }

   public String getTokenNo() {
      return this.tokenNo;
   }

   public String getLocalId() {
      return this.localId;
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

   public String getDateTime() {
      return this.dateTime;
   }

   public long getLDateTime() {
      return this.lDateTime;
   }

   public String getLocation() {
      return this.location;
   }

   public ArrayList getTruckDefect() {
      return this.truckDefect;
   }

   public ArrayList getTrailerDefect() {
      return this.trailerDefect;
   }

   public String getNotes() {
      return this.notes;
   }

   public String getVehicleCondition() {
      return this.vehicleCondition;
   }

   public String getDriverSignFile() {
      return this.driverSignFile;
   }

   public String getCompanyName() {
      return this.companyName;
   }

   public double getOdometer() {
      return this.odometer;
   }

   public String getEngineHour() {
      return this.engineHour;
   }

   public ArrayList getTrailer() {
      return this.trailer;
   }

   public String getTimestamp() {
      return this.timestamp;
   }

   public long getReceivedTimestamp() {
      return this.receivedTimestamp;
   }

   public void setTokenNo(final String tokenNo) {
      this.tokenNo = tokenNo;
   }

   public void setLocalId(final String localId) {
      this.localId = localId;
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

   public void setDateTime(final String dateTime) {
      this.dateTime = dateTime;
   }

   public void setLDateTime(final long lDateTime) {
      this.lDateTime = lDateTime;
   }

   public void setLocation(final String location) {
      this.location = location;
   }

   public void setTruckDefect(final ArrayList truckDefect) {
      this.truckDefect = truckDefect;
   }

   public void setTrailerDefect(final ArrayList trailerDefect) {
      this.trailerDefect = trailerDefect;
   }

   public void setNotes(final String notes) {
      this.notes = notes;
   }

   public void setVehicleCondition(final String vehicleCondition) {
      this.vehicleCondition = vehicleCondition;
   }

   public void setDriverSignFile(final String driverSignFile) {
      this.driverSignFile = driverSignFile;
   }

   public void setCompanyName(final String companyName) {
      this.companyName = companyName;
   }

   public void setOdometer(final double odometer) {
      this.odometer = odometer;
   }

   public void setEngineHour(final String engineHour) {
      this.engineHour = engineHour;
   }

   public void setTrailer(final ArrayList trailer) {
      this.trailer = trailer;
   }

   public void setTimestamp(final String timestamp) {
      this.timestamp = timestamp;
   }

   public void setReceivedTimestamp(final long receivedTimestamp) {
      this.receivedTimestamp = receivedTimestamp;
   }
}
