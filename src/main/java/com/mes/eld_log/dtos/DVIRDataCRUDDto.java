package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

public class DVIRDataCRUDDto {
   @JsonProperty("_id")
   private String _id;
   @JsonProperty("tokenNo")
   private String tokenNo;
   @JsonProperty("fromDate")
   private String fromDate;
   @JsonProperty("toDate")
   private String toDate;
   @JsonProperty("email")
   private String email;
   @JsonProperty("clientId")
   private long clientId;
   @JsonProperty("dvirLogId")
   private String dvirLogId;
   @JsonProperty("driverId")
   private long driverId;
   @JsonProperty("driverName")
   private String driverName;
   @JsonProperty("dateTime")
   private String dateTime;
   @JsonProperty("lDateTime")
   private long lDateTime;
   @JsonProperty("location")
   private String location;
   @JsonProperty("truckDefect")
   private ArrayList truckDefect;
   @JsonProperty("trailerDefect")
   private ArrayList trailerDefect;
   @JsonProperty("trailer")
   private ArrayList trailer;
   @JsonProperty("truckDefectImage")
   private ArrayList truckDefectImage;
   @JsonProperty("trailerDefectImage")
   private ArrayList trailerDefectImage;
   @JsonProperty("notes")
   private String notes;
   @JsonProperty("vehicleCondition")
   private String vehicleCondition;
   @JsonProperty("driverSignFile")
   private String driverSignFile;
   @JsonProperty("companyName")
   private String companyName;
   @JsonProperty("odometer")
   private double odometer;
   @JsonProperty("engineHour")
   private String engineHour;
   @JsonProperty("vehicleId")
   private long vehicleId;
   @JsonProperty("vehicleNo")
   private String vehicleNo;
   @JsonProperty("vin")
   private String vin;
   @JsonProperty("timezoneName")
   private String timezoneName;
   @JsonProperty("timezoneOffSet")
   private String timezoneOffSet;
   @JsonProperty("timestamp")
   private String timestamp;
   @JsonProperty("receivedTimestamp")
   private long receivedTimestamp;

   public String get_id() {
      return this._id;
   }

   public String getTokenNo() {
      return this.tokenNo;
   }

   public String getFromDate() {
      return this.fromDate;
   }

   public String getToDate() {
      return this.toDate;
   }

   public String getEmail() {
      return this.email;
   }

   public long getClientId() {
      return this.clientId;
   }

   public String getDvirLogId() {
      return this.dvirLogId;
   }

   public long getDriverId() {
      return this.driverId;
   }

   public String getDriverName() {
      return this.driverName;
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

   public ArrayList getTrailer() {
      return this.trailer;
   }

   public ArrayList getTruckDefectImage() {
      return this.truckDefectImage;
   }

   public ArrayList getTrailerDefectImage() {
      return this.trailerDefectImage;
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

   public long getVehicleId() {
      return this.vehicleId;
   }

   public String getVehicleNo() {
      return this.vehicleNo;
   }

   public String getVin() {
      return this.vin;
   }

   public String getTimezoneName() {
      return this.timezoneName;
   }

   public String getTimezoneOffSet() {
      return this.timezoneOffSet;
   }

   public String getTimestamp() {
      return this.timestamp;
   }

   public long getReceivedTimestamp() {
      return this.receivedTimestamp;
   }

   @JsonProperty("_id")
   public void set_id(final String _id) {
      this._id = _id;
   }

   @JsonProperty("tokenNo")
   public void setTokenNo(final String tokenNo) {
      this.tokenNo = tokenNo;
   }

   @JsonProperty("fromDate")
   public void setFromDate(final String fromDate) {
      this.fromDate = fromDate;
   }

   @JsonProperty("toDate")
   public void setToDate(final String toDate) {
      this.toDate = toDate;
   }

   @JsonProperty("email")
   public void setEmail(final String email) {
      this.email = email;
   }

   @JsonProperty("clientId")
   public void setClientId(final long clientId) {
      this.clientId = clientId;
   }

   @JsonProperty("dvirLogId")
   public void setDvirLogId(final String dvirLogId) {
      this.dvirLogId = dvirLogId;
   }

   @JsonProperty("driverId")
   public void setDriverId(final long driverId) {
      this.driverId = driverId;
   }

   @JsonProperty("driverName")
   public void setDriverName(final String driverName) {
      this.driverName = driverName;
   }

   @JsonProperty("dateTime")
   public void setDateTime(final String dateTime) {
      this.dateTime = dateTime;
   }

   @JsonProperty("lDateTime")
   public void setLDateTime(final long lDateTime) {
      this.lDateTime = lDateTime;
   }

   @JsonProperty("location")
   public void setLocation(final String location) {
      this.location = location;
   }

   @JsonProperty("truckDefect")
   public void setTruckDefect(final ArrayList truckDefect) {
      this.truckDefect = truckDefect;
   }

   @JsonProperty("trailerDefect")
   public void setTrailerDefect(final ArrayList trailerDefect) {
      this.trailerDefect = trailerDefect;
   }

   @JsonProperty("trailer")
   public void setTrailer(final ArrayList trailer) {
      this.trailer = trailer;
   }

   @JsonProperty("truckDefectImage")
   public void setTruckDefectImage(final ArrayList truckDefectImage) {
      this.truckDefectImage = truckDefectImage;
   }

   @JsonProperty("trailerDefectImage")
   public void setTrailerDefectImage(final ArrayList trailerDefectImage) {
      this.trailerDefectImage = trailerDefectImage;
   }

   @JsonProperty("notes")
   public void setNotes(final String notes) {
      this.notes = notes;
   }

   @JsonProperty("vehicleCondition")
   public void setVehicleCondition(final String vehicleCondition) {
      this.vehicleCondition = vehicleCondition;
   }

   @JsonProperty("driverSignFile")
   public void setDriverSignFile(final String driverSignFile) {
      this.driverSignFile = driverSignFile;
   }

   @JsonProperty("companyName")
   public void setCompanyName(final String companyName) {
      this.companyName = companyName;
   }

   @JsonProperty("odometer")
   public void setOdometer(final double odometer) {
      this.odometer = odometer;
   }

   @JsonProperty("engineHour")
   public void setEngineHour(final String engineHour) {
      this.engineHour = engineHour;
   }

   @JsonProperty("vehicleId")
   public void setVehicleId(final long vehicleId) {
      this.vehicleId = vehicleId;
   }

   @JsonProperty("vehicleNo")
   public void setVehicleNo(final String vehicleNo) {
      this.vehicleNo = vehicleNo;
   }

   @JsonProperty("vin")
   public void setVin(final String vin) {
      this.vin = vin;
   }

   @JsonProperty("timezoneName")
   public void setTimezoneName(final String timezoneName) {
      this.timezoneName = timezoneName;
   }

   @JsonProperty("timezoneOffSet")
   public void setTimezoneOffSet(final String timezoneOffSet) {
      this.timezoneOffSet = timezoneOffSet;
   }

   @JsonProperty("timestamp")
   public void setTimestamp(final String timestamp) {
      this.timestamp = timestamp;
   }

   @JsonProperty("receivedTimestamp")
   public void setReceivedTimestamp(final long receivedTimestamp) {
      this.receivedTimestamp = receivedTimestamp;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof DVIRDataCRUDDto)) {
         return false;
      } else {
         DVIRDataCRUDDto other = (DVIRDataCRUDDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else if (this.getDriverId() != other.getDriverId()) {
            return false;
         } else if (this.getLDateTime() != other.getLDateTime()) {
            return false;
         } else if (Double.compare(this.getOdometer(), other.getOdometer()) != 0) {
            return false;
         } else if (this.getVehicleId() != other.getVehicleId()) {
            return false;
         } else if (this.getReceivedTimestamp() != other.getReceivedTimestamp()) {
            return false;
         } else {
            Object this$_id = this.get_id();
            Object other$_id = other.get_id();
            if (this$_id == null ? other$_id == null : this$_id.equals(other$_id)) {
               Object this$tokenNo = this.getTokenNo();
               Object other$tokenNo = other.getTokenNo();
               if (this$tokenNo == null ? other$tokenNo == null : this$tokenNo.equals(other$tokenNo)) {
                  Object this$fromDate = this.getFromDate();
                  Object other$fromDate = other.getFromDate();
                  if (this$fromDate == null ? other$fromDate == null : this$fromDate.equals(other$fromDate)) {
                     Object this$toDate = this.getToDate();
                     Object other$toDate = other.getToDate();
                     if (this$toDate == null ? other$toDate == null : this$toDate.equals(other$toDate)) {
                        Object this$email = this.getEmail();
                        Object other$email = other.getEmail();
                        if (this$email == null ? other$email == null : this$email.equals(other$email)) {
                           Object this$dvirLogId = this.getDvirLogId();
                           Object other$dvirLogId = other.getDvirLogId();
                           if (this$dvirLogId == null ? other$dvirLogId == null : this$dvirLogId.equals(other$dvirLogId)) {
                              Object this$driverName = this.getDriverName();
                              Object other$driverName = other.getDriverName();
                              if (this$driverName == null ? other$driverName == null : this$driverName.equals(other$driverName)) {
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
                                             Object this$trailer = this.getTrailer();
                                             Object other$trailer = other.getTrailer();
                                             if (this$trailer == null ? other$trailer == null : this$trailer.equals(other$trailer)) {
                                                Object this$truckDefectImage = this.getTruckDefectImage();
                                                Object other$truckDefectImage = other.getTruckDefectImage();
                                                if (this$truckDefectImage == null
                                                   ? other$truckDefectImage == null
                                                   : this$truckDefectImage.equals(other$truckDefectImage)) {
                                                   Object this$trailerDefectImage = this.getTrailerDefectImage();
                                                   Object other$trailerDefectImage = other.getTrailerDefectImage();
                                                   if (this$trailerDefectImage == null
                                                      ? other$trailerDefectImage == null
                                                      : this$trailerDefectImage.equals(other$trailerDefectImage)) {
                                                      Object this$notes = this.getNotes();
                                                      Object other$notes = other.getNotes();
                                                      if (this$notes == null ? other$notes == null : this$notes.equals(other$notes)) {
                                                         Object this$vehicleCondition = this.getVehicleCondition();
                                                         Object other$vehicleCondition = other.getVehicleCondition();
                                                         if (this$vehicleCondition == null
                                                            ? other$vehicleCondition == null
                                                            : this$vehicleCondition.equals(other$vehicleCondition)) {
                                                            Object this$driverSignFile = this.getDriverSignFile();
                                                            Object other$driverSignFile = other.getDriverSignFile();
                                                            if (this$driverSignFile == null
                                                               ? other$driverSignFile == null
                                                               : this$driverSignFile.equals(other$driverSignFile)) {
                                                               Object this$companyName = this.getCompanyName();
                                                               Object other$companyName = other.getCompanyName();
                                                               if (this$companyName == null
                                                                  ? other$companyName == null
                                                                  : this$companyName.equals(other$companyName)) {
                                                                  Object this$engineHour = this.getEngineHour();
                                                                  Object other$engineHour = other.getEngineHour();
                                                                  if (this$engineHour == null
                                                                     ? other$engineHour == null
                                                                     : this$engineHour.equals(other$engineHour)) {
                                                                     Object this$vehicleNo = this.getVehicleNo();
                                                                     Object other$vehicleNo = other.getVehicleNo();
                                                                     if (this$vehicleNo == null
                                                                        ? other$vehicleNo == null
                                                                        : this$vehicleNo.equals(other$vehicleNo)) {
                                                                        Object this$vin = this.getVin();
                                                                        Object other$vin = other.getVin();
                                                                        if (this$vin == null ? other$vin == null : this$vin.equals(other$vin)) {
                                                                           Object this$timezoneName = this.getTimezoneName();
                                                                           Object other$timezoneName = other.getTimezoneName();
                                                                           if (this$timezoneName == null
                                                                              ? other$timezoneName == null
                                                                              : this$timezoneName.equals(other$timezoneName)) {
                                                                              Object this$timezoneOffSet = this.getTimezoneOffSet();
                                                                              Object other$timezoneOffSet = other.getTimezoneOffSet();
                                                                              if (this$timezoneOffSet == null
                                                                                 ? other$timezoneOffSet == null
                                                                                 : this$timezoneOffSet.equals(other$timezoneOffSet)) {
                                                                                 Object this$timestamp = this.getTimestamp();
                                                                                 Object other$timestamp = other.getTimestamp();
                                                                                 return this$timestamp == null
                                                                                    ? other$timestamp == null
                                                                                    : this$timestamp.equals(other$timestamp);
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
      return other instanceof DVIRDataCRUDDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $clientId = this.getClientId();
      result = result * 59 + (int)($clientId >>> 32 ^ $clientId);
      long $driverId = this.getDriverId();
      result = result * 59 + (int)($driverId >>> 32 ^ $driverId);
      long $lDateTime = this.getLDateTime();
      result = result * 59 + (int)($lDateTime >>> 32 ^ $lDateTime);
      long $odometer = Double.doubleToLongBits(this.getOdometer());
      result = result * 59 + (int)($odometer >>> 32 ^ $odometer);
      long $vehicleId = this.getVehicleId();
      result = result * 59 + (int)($vehicleId >>> 32 ^ $vehicleId);
      long $receivedTimestamp = this.getReceivedTimestamp();
      result = result * 59 + (int)($receivedTimestamp >>> 32 ^ $receivedTimestamp);
      Object $_id = this.get_id();
      result = result * 59 + ($_id == null ? 43 : $_id.hashCode());
      Object $tokenNo = this.getTokenNo();
      result = result * 59 + ($tokenNo == null ? 43 : $tokenNo.hashCode());
      Object $fromDate = this.getFromDate();
      result = result * 59 + ($fromDate == null ? 43 : $fromDate.hashCode());
      Object $toDate = this.getToDate();
      result = result * 59 + ($toDate == null ? 43 : $toDate.hashCode());
      Object $email = this.getEmail();
      result = result * 59 + ($email == null ? 43 : $email.hashCode());
      Object $dvirLogId = this.getDvirLogId();
      result = result * 59 + ($dvirLogId == null ? 43 : $dvirLogId.hashCode());
      Object $driverName = this.getDriverName();
      result = result * 59 + ($driverName == null ? 43 : $driverName.hashCode());
      Object $dateTime = this.getDateTime();
      result = result * 59 + ($dateTime == null ? 43 : $dateTime.hashCode());
      Object $location = this.getLocation();
      result = result * 59 + ($location == null ? 43 : $location.hashCode());
      Object $truckDefect = this.getTruckDefect();
      result = result * 59 + ($truckDefect == null ? 43 : $truckDefect.hashCode());
      Object $trailerDefect = this.getTrailerDefect();
      result = result * 59 + ($trailerDefect == null ? 43 : $trailerDefect.hashCode());
      Object $trailer = this.getTrailer();
      result = result * 59 + ($trailer == null ? 43 : $trailer.hashCode());
      Object $truckDefectImage = this.getTruckDefectImage();
      result = result * 59 + ($truckDefectImage == null ? 43 : $truckDefectImage.hashCode());
      Object $trailerDefectImage = this.getTrailerDefectImage();
      result = result * 59 + ($trailerDefectImage == null ? 43 : $trailerDefectImage.hashCode());
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
      Object $vehicleNo = this.getVehicleNo();
      result = result * 59 + ($vehicleNo == null ? 43 : $vehicleNo.hashCode());
      Object $vin = this.getVin();
      result = result * 59 + ($vin == null ? 43 : $vin.hashCode());
      Object $timezoneName = this.getTimezoneName();
      result = result * 59 + ($timezoneName == null ? 43 : $timezoneName.hashCode());
      Object $timezoneOffSet = this.getTimezoneOffSet();
      result = result * 59 + ($timezoneOffSet == null ? 43 : $timezoneOffSet.hashCode());
      Object $timestamp = this.getTimestamp();
      return result * 59 + ($timestamp == null ? 43 : $timestamp.hashCode());
   }

   @Override
   public String toString() {
      return "DVIRDataCRUDDto(_id="
         + this.get_id()
         + ", tokenNo="
         + this.getTokenNo()
         + ", fromDate="
         + this.getFromDate()
         + ", toDate="
         + this.getToDate()
         + ", email="
         + this.getEmail()
         + ", clientId="
         + this.getClientId()
         + ", dvirLogId="
         + this.getDvirLogId()
         + ", driverId="
         + this.getDriverId()
         + ", driverName="
         + this.getDriverName()
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
         + ", trailer="
         + this.getTrailer()
         + ", truckDefectImage="
         + this.getTruckDefectImage()
         + ", trailerDefectImage="
         + this.getTrailerDefectImage()
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
         + ", vehicleId="
         + this.getVehicleId()
         + ", vehicleNo="
         + this.getVehicleNo()
         + ", vin="
         + this.getVin()
         + ", timezoneName="
         + this.getTimezoneName()
         + ", timezoneOffSet="
         + this.getTimezoneOffSet()
         + ", timestamp="
         + this.getTimestamp()
         + ", receivedTimestamp="
         + this.getReceivedTimestamp()
         + ")";
   }
}
