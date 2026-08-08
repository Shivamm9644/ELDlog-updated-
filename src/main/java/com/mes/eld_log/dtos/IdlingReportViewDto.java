package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IdlingReportViewDto {
   @JsonProperty("fromDate")
   private String fromDate;
   @JsonProperty("toDate")
   private String toDate;
   @JsonProperty("vehicleNo")
   private String vehicleNo;
   @JsonProperty("vehicleId")
   private String vehicleId;
   @JsonProperty("driverId")
   private String driverId;
   @JsonProperty("clientId")
   private long clientId;
   @JsonProperty("clientName")
   private String clientName;
   @JsonProperty("VIN")
   private String VIN;
   @JsonProperty("Version")
   private String Version;
   @JsonProperty("MAC")
   private String MAC;
   @JsonProperty("Model")
   private String Model;
   @JsonProperty("SerialNo")
   private String SerialNo;
   @JsonProperty("startDateTime")
   private String startDateTime;
   @JsonProperty("endDateTime")
   private String endDateTime;
   @JsonProperty("startUtcDateTime")
   private long startUtcDateTime;
   @JsonProperty("endUtcDateTime")
   private long endUtcDateTime;
   @JsonProperty("durationMillis")
   private long durationMillis;
   @JsonProperty("startAddress")
   private String startAddress;
   @JsonProperty("endAddress")
   private String endAddress;
   @JsonProperty("startEngineHours")
   private double startEngineHours;
   @JsonProperty("endEngineHours")
   private double endEngineHours;
   @JsonProperty("startOdometer")
   private String startOdometer;
   @JsonProperty("endOdometer")
   private String endOdometer;
   @JsonProperty("fileName")
   private String fileName;

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
      return this.driverId;
   }

   public long getClientId() {
      return this.clientId;
   }

   public String getClientName() {
      return this.clientName;
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

   public String getFileName() {
      return this.fileName;
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

   @JsonProperty("driverId")
   public void setDriverId(final String driverId) {
      this.driverId = driverId;
   }

   @JsonProperty("clientId")
   public void setClientId(final long clientId) {
      this.clientId = clientId;
   }

   @JsonProperty("clientName")
   public void setClientName(final String clientName) {
      this.clientName = clientName;
   }

   @JsonProperty("VIN")
   public void setVIN(final String VIN) {
      this.VIN = VIN;
   }

   @JsonProperty("Version")
   public void setVersion(final String Version) {
      this.Version = Version;
   }

   @JsonProperty("MAC")
   public void setMAC(final String MAC) {
      this.MAC = MAC;
   }

   @JsonProperty("Model")
   public void setModel(final String Model) {
      this.Model = Model;
   }

   @JsonProperty("SerialNo")
   public void setSerialNo(final String SerialNo) {
      this.SerialNo = SerialNo;
   }

   @JsonProperty("startDateTime")
   public void setStartDateTime(final String startDateTime) {
      this.startDateTime = startDateTime;
   }

   @JsonProperty("endDateTime")
   public void setEndDateTime(final String endDateTime) {
      this.endDateTime = endDateTime;
   }

   @JsonProperty("startUtcDateTime")
   public void setStartUtcDateTime(final long startUtcDateTime) {
      this.startUtcDateTime = startUtcDateTime;
   }

   @JsonProperty("endUtcDateTime")
   public void setEndUtcDateTime(final long endUtcDateTime) {
      this.endUtcDateTime = endUtcDateTime;
   }

   @JsonProperty("durationMillis")
   public void setDurationMillis(final long durationMillis) {
      this.durationMillis = durationMillis;
   }

   @JsonProperty("startAddress")
   public void setStartAddress(final String startAddress) {
      this.startAddress = startAddress;
   }

   @JsonProperty("endAddress")
   public void setEndAddress(final String endAddress) {
      this.endAddress = endAddress;
   }

   @JsonProperty("startEngineHours")
   public void setStartEngineHours(final double startEngineHours) {
      this.startEngineHours = startEngineHours;
   }

   @JsonProperty("endEngineHours")
   public void setEndEngineHours(final double endEngineHours) {
      this.endEngineHours = endEngineHours;
   }

   @JsonProperty("startOdometer")
   public void setStartOdometer(final String startOdometer) {
      this.startOdometer = startOdometer;
   }

   @JsonProperty("endOdometer")
   public void setEndOdometer(final String endOdometer) {
      this.endOdometer = endOdometer;
   }

   @JsonProperty("fileName")
   public void setFileName(final String fileName) {
      this.fileName = fileName;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof IdlingReportViewDto)) {
         return false;
      } else {
         IdlingReportViewDto other = (IdlingReportViewDto)o;
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
         } else if (Double.compare(this.getStartEngineHours(), other.getStartEngineHours()) != 0) {
            return false;
         } else if (Double.compare(this.getEndEngineHours(), other.getEndEngineHours()) != 0) {
            return false;
         } else {
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
                        Object this$driverId = this.getDriverId();
                        Object other$driverId = other.getDriverId();
                        if (this$driverId == null ? other$driverId == null : this$driverId.equals(other$driverId)) {
                           Object this$clientName = this.getClientName();
                           Object other$clientName = other.getClientName();
                           if (this$clientName == null ? other$clientName == null : this$clientName.equals(other$clientName)) {
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
                                                         if (this$startOdometer == null
                                                            ? other$startOdometer == null
                                                            : this$startOdometer.equals(other$startOdometer)) {
                                                            Object this$endOdometer = this.getEndOdometer();
                                                            Object other$endOdometer = other.getEndOdometer();
                                                            if (this$endOdometer == null
                                                               ? other$endOdometer == null
                                                               : this$endOdometer.equals(other$endOdometer)) {
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
      return other instanceof IdlingReportViewDto;
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
      long $startEngineHours = Double.doubleToLongBits(this.getStartEngineHours());
      result = result * 59 + (int)($startEngineHours >>> 32 ^ $startEngineHours);
      long $endEngineHours = Double.doubleToLongBits(this.getEndEngineHours());
      result = result * 59 + (int)($endEngineHours >>> 32 ^ $endEngineHours);
      Object $fromDate = this.getFromDate();
      result = result * 59 + ($fromDate == null ? 43 : $fromDate.hashCode());
      Object $toDate = this.getToDate();
      result = result * 59 + ($toDate == null ? 43 : $toDate.hashCode());
      Object $vehicleNo = this.getVehicleNo();
      result = result * 59 + ($vehicleNo == null ? 43 : $vehicleNo.hashCode());
      Object $vehicleId = this.getVehicleId();
      result = result * 59 + ($vehicleId == null ? 43 : $vehicleId.hashCode());
      Object $driverId = this.getDriverId();
      result = result * 59 + ($driverId == null ? 43 : $driverId.hashCode());
      Object $clientName = this.getClientName();
      result = result * 59 + ($clientName == null ? 43 : $clientName.hashCode());
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
      result = result * 59 + ($endOdometer == null ? 43 : $endOdometer.hashCode());
      Object $fileName = this.getFileName();
      return result * 59 + ($fileName == null ? 43 : $fileName.hashCode());
   }

   @Override
   public String toString() {
      return "IdlingReportViewDto(fromDate="
         + this.getFromDate()
         + ", toDate="
         + this.getToDate()
         + ", vehicleNo="
         + this.getVehicleNo()
         + ", vehicleId="
         + this.getVehicleId()
         + ", driverId="
         + this.getDriverId()
         + ", clientId="
         + this.getClientId()
         + ", clientName="
         + this.getClientName()
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
         + ", startEngineHours="
         + this.getStartEngineHours()
         + ", endEngineHours="
         + this.getEndEngineHours()
         + ", startOdometer="
         + this.getStartOdometer()
         + ", endOdometer="
         + this.getEndOdometer()
         + ", fileName="
         + this.getFileName()
         + ")";
   }
}
