package com.mes.eld_log.dtos;

import java.util.List;

public class EldReportDto {
   private EldReportDto.EldHeader eldHeader;
   private EldReportDto.Carrier carrier;
   private EldReportDto.Driver driver;
   private EldReportDto.Vehicle vehicle;
   private List<EldReportDto.EventRecord> eventRecords;
   private List<EldReportDto.Annotation> annotations;
   private List<Object> malfunctions;
   private List<Object> diagnostics;
   private String signature;

   public EldReportDto.EldHeader getEldHeader() {
      return this.eldHeader;
   }

   public EldReportDto.Carrier getCarrier() {
      return this.carrier;
   }

   public EldReportDto.Driver getDriver() {
      return this.driver;
   }

   public EldReportDto.Vehicle getVehicle() {
      return this.vehicle;
   }

   public List<EldReportDto.EventRecord> getEventRecords() {
      return this.eventRecords;
   }

   public List<EldReportDto.Annotation> getAnnotations() {
      return this.annotations;
   }

   public List<Object> getMalfunctions() {
      return this.malfunctions;
   }

   public List<Object> getDiagnostics() {
      return this.diagnostics;
   }

   public String getSignature() {
      return this.signature;
   }

   public void setEldHeader(final EldReportDto.EldHeader eldHeader) {
      this.eldHeader = eldHeader;
   }

   public void setCarrier(final EldReportDto.Carrier carrier) {
      this.carrier = carrier;
   }

   public void setDriver(final EldReportDto.Driver driver) {
      this.driver = driver;
   }

   public void setVehicle(final EldReportDto.Vehicle vehicle) {
      this.vehicle = vehicle;
   }

   public void setEventRecords(final List<EldReportDto.EventRecord> eventRecords) {
      this.eventRecords = eventRecords;
   }

   public void setAnnotations(final List<EldReportDto.Annotation> annotations) {
      this.annotations = annotations;
   }

   public void setMalfunctions(final List<Object> malfunctions) {
      this.malfunctions = malfunctions;
   }

   public void setDiagnostics(final List<Object> diagnostics) {
      this.diagnostics = diagnostics;
   }

   public void setSignature(final String signature) {
      this.signature = signature;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof EldReportDto)) {
         return false;
      } else {
         EldReportDto other = (EldReportDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$eldHeader = this.getEldHeader();
            Object other$eldHeader = other.getEldHeader();
            if (this$eldHeader == null ? other$eldHeader == null : this$eldHeader.equals(other$eldHeader)) {
               Object this$carrier = this.getCarrier();
               Object other$carrier = other.getCarrier();
               if (this$carrier == null ? other$carrier == null : this$carrier.equals(other$carrier)) {
                  Object this$driver = this.getDriver();
                  Object other$driver = other.getDriver();
                  if (this$driver == null ? other$driver == null : this$driver.equals(other$driver)) {
                     Object this$vehicle = this.getVehicle();
                     Object other$vehicle = other.getVehicle();
                     if (this$vehicle == null ? other$vehicle == null : this$vehicle.equals(other$vehicle)) {
                        Object this$eventRecords = this.getEventRecords();
                        Object other$eventRecords = other.getEventRecords();
                        if (this$eventRecords == null ? other$eventRecords == null : this$eventRecords.equals(other$eventRecords)) {
                           Object this$annotations = this.getAnnotations();
                           Object other$annotations = other.getAnnotations();
                           if (this$annotations == null ? other$annotations == null : this$annotations.equals(other$annotations)) {
                              Object this$malfunctions = this.getMalfunctions();
                              Object other$malfunctions = other.getMalfunctions();
                              if (this$malfunctions == null ? other$malfunctions == null : this$malfunctions.equals(other$malfunctions)) {
                                 Object this$diagnostics = this.getDiagnostics();
                                 Object other$diagnostics = other.getDiagnostics();
                                 if (this$diagnostics == null ? other$diagnostics == null : this$diagnostics.equals(other$diagnostics)) {
                                    Object this$signature = this.getSignature();
                                    Object other$signature = other.getSignature();
                                    return this$signature == null ? other$signature == null : this$signature.equals(other$signature);
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
      return other instanceof EldReportDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $eldHeader = this.getEldHeader();
      result = result * 59 + ($eldHeader == null ? 43 : $eldHeader.hashCode());
      Object $carrier = this.getCarrier();
      result = result * 59 + ($carrier == null ? 43 : $carrier.hashCode());
      Object $driver = this.getDriver();
      result = result * 59 + ($driver == null ? 43 : $driver.hashCode());
      Object $vehicle = this.getVehicle();
      result = result * 59 + ($vehicle == null ? 43 : $vehicle.hashCode());
      Object $eventRecords = this.getEventRecords();
      result = result * 59 + ($eventRecords == null ? 43 : $eventRecords.hashCode());
      Object $annotations = this.getAnnotations();
      result = result * 59 + ($annotations == null ? 43 : $annotations.hashCode());
      Object $malfunctions = this.getMalfunctions();
      result = result * 59 + ($malfunctions == null ? 43 : $malfunctions.hashCode());
      Object $diagnostics = this.getDiagnostics();
      result = result * 59 + ($diagnostics == null ? 43 : $diagnostics.hashCode());
      Object $signature = this.getSignature();
      return result * 59 + ($signature == null ? 43 : $signature.hashCode());
   }

   @Override
   public String toString() {
      return "EldReportDto(eldHeader="
         + this.getEldHeader()
         + ", carrier="
         + this.getCarrier()
         + ", driver="
         + this.getDriver()
         + ", vehicle="
         + this.getVehicle()
         + ", eventRecords="
         + this.getEventRecords()
         + ", annotations="
         + this.getAnnotations()
         + ", malfunctions="
         + this.getMalfunctions()
         + ", diagnostics="
         + this.getDiagnostics()
         + ", signature="
         + this.getSignature()
         + ")";
   }

   public static class Annotation {
      private String eventRef;
      private String note;

      public String getEventRef() {
         return this.eventRef;
      }

      public String getNote() {
         return this.note;
      }

      public void setEventRef(final String eventRef) {
         this.eventRef = eventRef;
      }

      public void setNote(final String note) {
         this.note = note;
      }

      @Override
      public boolean equals(final Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof EldReportDto.Annotation)) {
            return false;
         } else {
            EldReportDto.Annotation other = (EldReportDto.Annotation)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
               Object this$eventRef = this.getEventRef();
               Object other$eventRef = other.getEventRef();
               if (this$eventRef == null ? other$eventRef == null : this$eventRef.equals(other$eventRef)) {
                  Object this$note = this.getNote();
                  Object other$note = other.getNote();
                  return this$note == null ? other$note == null : this$note.equals(other$note);
               } else {
                  return false;
               }
            }
         }
      }

      protected boolean canEqual(final Object other) {
         return other instanceof EldReportDto.Annotation;
      }

      @Override
      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $eventRef = this.getEventRef();
         result = result * 59 + ($eventRef == null ? 43 : $eventRef.hashCode());
         Object $note = this.getNote();
         return result * 59 + ($note == null ? 43 : $note.hashCode());
      }

      @Override
      public String toString() {
         return "EldReportDto.Annotation(eventRef=" + this.getEventRef() + ", note=" + this.getNote() + ")";
      }
   }

   public static class Carrier {
      private String carrierName;
      private String usdotNumber;
      private String homeTerminal;

      public String getCarrierName() {
         return this.carrierName;
      }

      public String getUsdotNumber() {
         return this.usdotNumber;
      }

      public String getHomeTerminal() {
         return this.homeTerminal;
      }

      public void setCarrierName(final String carrierName) {
         this.carrierName = carrierName;
      }

      public void setUsdotNumber(final String usdotNumber) {
         this.usdotNumber = usdotNumber;
      }

      public void setHomeTerminal(final String homeTerminal) {
         this.homeTerminal = homeTerminal;
      }

      @Override
      public boolean equals(final Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof EldReportDto.Carrier)) {
            return false;
         } else {
            EldReportDto.Carrier other = (EldReportDto.Carrier)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
               Object this$carrierName = this.getCarrierName();
               Object other$carrierName = other.getCarrierName();
               if (this$carrierName == null ? other$carrierName == null : this$carrierName.equals(other$carrierName)) {
                  Object this$usdotNumber = this.getUsdotNumber();
                  Object other$usdotNumber = other.getUsdotNumber();
                  if (this$usdotNumber == null ? other$usdotNumber == null : this$usdotNumber.equals(other$usdotNumber)) {
                     Object this$homeTerminal = this.getHomeTerminal();
                     Object other$homeTerminal = other.getHomeTerminal();
                     return this$homeTerminal == null ? other$homeTerminal == null : this$homeTerminal.equals(other$homeTerminal);
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
         return other instanceof EldReportDto.Carrier;
      }

      @Override
      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $carrierName = this.getCarrierName();
         result = result * 59 + ($carrierName == null ? 43 : $carrierName.hashCode());
         Object $usdotNumber = this.getUsdotNumber();
         result = result * 59 + ($usdotNumber == null ? 43 : $usdotNumber.hashCode());
         Object $homeTerminal = this.getHomeTerminal();
         return result * 59 + ($homeTerminal == null ? 43 : $homeTerminal.hashCode());
      }

      @Override
      public String toString() {
         return "EldReportDto.Carrier(carrierName="
            + this.getCarrierName()
            + ", usdotNumber="
            + this.getUsdotNumber()
            + ", homeTerminal="
            + this.getHomeTerminal()
            + ")";
      }
   }

   public static class Driver {
      private String driverId;
      private String driverName;
      private String licenseNumber;
      private String licenseState;

      public String getDriverId() {
         return this.driverId;
      }

      public String getDriverName() {
         return this.driverName;
      }

      public String getLicenseNumber() {
         return this.licenseNumber;
      }

      public String getLicenseState() {
         return this.licenseState;
      }

      public void setDriverId(final String driverId) {
         this.driverId = driverId;
      }

      public void setDriverName(final String driverName) {
         this.driverName = driverName;
      }

      public void setLicenseNumber(final String licenseNumber) {
         this.licenseNumber = licenseNumber;
      }

      public void setLicenseState(final String licenseState) {
         this.licenseState = licenseState;
      }

      @Override
      public boolean equals(final Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof EldReportDto.Driver)) {
            return false;
         } else {
            EldReportDto.Driver other = (EldReportDto.Driver)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
               Object this$driverId = this.getDriverId();
               Object other$driverId = other.getDriverId();
               if (this$driverId == null ? other$driverId == null : this$driverId.equals(other$driverId)) {
                  Object this$driverName = this.getDriverName();
                  Object other$driverName = other.getDriverName();
                  if (this$driverName == null ? other$driverName == null : this$driverName.equals(other$driverName)) {
                     Object this$licenseNumber = this.getLicenseNumber();
                     Object other$licenseNumber = other.getLicenseNumber();
                     if (this$licenseNumber == null ? other$licenseNumber == null : this$licenseNumber.equals(other$licenseNumber)) {
                        Object this$licenseState = this.getLicenseState();
                        Object other$licenseState = other.getLicenseState();
                        return this$licenseState == null ? other$licenseState == null : this$licenseState.equals(other$licenseState);
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
         return other instanceof EldReportDto.Driver;
      }

      @Override
      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $driverId = this.getDriverId();
         result = result * 59 + ($driverId == null ? 43 : $driverId.hashCode());
         Object $driverName = this.getDriverName();
         result = result * 59 + ($driverName == null ? 43 : $driverName.hashCode());
         Object $licenseNumber = this.getLicenseNumber();
         result = result * 59 + ($licenseNumber == null ? 43 : $licenseNumber.hashCode());
         Object $licenseState = this.getLicenseState();
         return result * 59 + ($licenseState == null ? 43 : $licenseState.hashCode());
      }

      @Override
      public String toString() {
         return "EldReportDto.Driver(driverId="
            + this.getDriverId()
            + ", driverName="
            + this.getDriverName()
            + ", licenseNumber="
            + this.getLicenseNumber()
            + ", licenseState="
            + this.getLicenseState()
            + ")";
      }
   }

   public static class EldHeader {
      private String eldIdentifier;
      private String eldProvider;
      private String eldSoftwareVersion;
      private String outputFileFormat;
      private String fileGeneratedTime;
      private String fileSignature;

      public String getEldIdentifier() {
         return this.eldIdentifier;
      }

      public String getEldProvider() {
         return this.eldProvider;
      }

      public String getEldSoftwareVersion() {
         return this.eldSoftwareVersion;
      }

      public String getOutputFileFormat() {
         return this.outputFileFormat;
      }

      public String getFileGeneratedTime() {
         return this.fileGeneratedTime;
      }

      public String getFileSignature() {
         return this.fileSignature;
      }

      public void setEldIdentifier(final String eldIdentifier) {
         this.eldIdentifier = eldIdentifier;
      }

      public void setEldProvider(final String eldProvider) {
         this.eldProvider = eldProvider;
      }

      public void setEldSoftwareVersion(final String eldSoftwareVersion) {
         this.eldSoftwareVersion = eldSoftwareVersion;
      }

      public void setOutputFileFormat(final String outputFileFormat) {
         this.outputFileFormat = outputFileFormat;
      }

      public void setFileGeneratedTime(final String fileGeneratedTime) {
         this.fileGeneratedTime = fileGeneratedTime;
      }

      public void setFileSignature(final String fileSignature) {
         this.fileSignature = fileSignature;
      }

      @Override
      public boolean equals(final Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof EldReportDto.EldHeader)) {
            return false;
         } else {
            EldReportDto.EldHeader other = (EldReportDto.EldHeader)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
               Object this$eldIdentifier = this.getEldIdentifier();
               Object other$eldIdentifier = other.getEldIdentifier();
               if (this$eldIdentifier == null ? other$eldIdentifier == null : this$eldIdentifier.equals(other$eldIdentifier)) {
                  Object this$eldProvider = this.getEldProvider();
                  Object other$eldProvider = other.getEldProvider();
                  if (this$eldProvider == null ? other$eldProvider == null : this$eldProvider.equals(other$eldProvider)) {
                     Object this$eldSoftwareVersion = this.getEldSoftwareVersion();
                     Object other$eldSoftwareVersion = other.getEldSoftwareVersion();
                     if (this$eldSoftwareVersion == null ? other$eldSoftwareVersion == null : this$eldSoftwareVersion.equals(other$eldSoftwareVersion)) {
                        Object this$outputFileFormat = this.getOutputFileFormat();
                        Object other$outputFileFormat = other.getOutputFileFormat();
                        if (this$outputFileFormat == null ? other$outputFileFormat == null : this$outputFileFormat.equals(other$outputFileFormat)) {
                           Object this$fileGeneratedTime = this.getFileGeneratedTime();
                           Object other$fileGeneratedTime = other.getFileGeneratedTime();
                           if (this$fileGeneratedTime == null ? other$fileGeneratedTime == null : this$fileGeneratedTime.equals(other$fileGeneratedTime)) {
                              Object this$fileSignature = this.getFileSignature();
                              Object other$fileSignature = other.getFileSignature();
                              return this$fileSignature == null ? other$fileSignature == null : this$fileSignature.equals(other$fileSignature);
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
         return other instanceof EldReportDto.EldHeader;
      }

      @Override
      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $eldIdentifier = this.getEldIdentifier();
         result = result * 59 + ($eldIdentifier == null ? 43 : $eldIdentifier.hashCode());
         Object $eldProvider = this.getEldProvider();
         result = result * 59 + ($eldProvider == null ? 43 : $eldProvider.hashCode());
         Object $eldSoftwareVersion = this.getEldSoftwareVersion();
         result = result * 59 + ($eldSoftwareVersion == null ? 43 : $eldSoftwareVersion.hashCode());
         Object $outputFileFormat = this.getOutputFileFormat();
         result = result * 59 + ($outputFileFormat == null ? 43 : $outputFileFormat.hashCode());
         Object $fileGeneratedTime = this.getFileGeneratedTime();
         result = result * 59 + ($fileGeneratedTime == null ? 43 : $fileGeneratedTime.hashCode());
         Object $fileSignature = this.getFileSignature();
         return result * 59 + ($fileSignature == null ? 43 : $fileSignature.hashCode());
      }

      @Override
      public String toString() {
         return "EldReportDto.EldHeader(eldIdentifier="
            + this.getEldIdentifier()
            + ", eldProvider="
            + this.getEldProvider()
            + ", eldSoftwareVersion="
            + this.getEldSoftwareVersion()
            + ", outputFileFormat="
            + this.getOutputFileFormat()
            + ", fileGeneratedTime="
            + this.getFileGeneratedTime()
            + ", fileSignature="
            + this.getFileSignature()
            + ")";
      }
   }

   public static class EventRecord {
      private String eventCode;
      private String eventDescription;
      private String eventTime;
      private String location;
      private String odometer;
      private String engineHours;

      public String getEventCode() {
         return this.eventCode;
      }

      public String getEventDescription() {
         return this.eventDescription;
      }

      public String getEventTime() {
         return this.eventTime;
      }

      public String getLocation() {
         return this.location;
      }

      public String getOdometer() {
         return this.odometer;
      }

      public String getEngineHours() {
         return this.engineHours;
      }

      public void setEventCode(final String eventCode) {
         this.eventCode = eventCode;
      }

      public void setEventDescription(final String eventDescription) {
         this.eventDescription = eventDescription;
      }

      public void setEventTime(final String eventTime) {
         this.eventTime = eventTime;
      }

      public void setLocation(final String location) {
         this.location = location;
      }

      public void setOdometer(final String odometer) {
         this.odometer = odometer;
      }

      public void setEngineHours(final String engineHours) {
         this.engineHours = engineHours;
      }

      @Override
      public boolean equals(final Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof EldReportDto.EventRecord)) {
            return false;
         } else {
            EldReportDto.EventRecord other = (EldReportDto.EventRecord)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
               Object this$eventCode = this.getEventCode();
               Object other$eventCode = other.getEventCode();
               if (this$eventCode == null ? other$eventCode == null : this$eventCode.equals(other$eventCode)) {
                  Object this$eventDescription = this.getEventDescription();
                  Object other$eventDescription = other.getEventDescription();
                  if (this$eventDescription == null ? other$eventDescription == null : this$eventDescription.equals(other$eventDescription)) {
                     Object this$eventTime = this.getEventTime();
                     Object other$eventTime = other.getEventTime();
                     if (this$eventTime == null ? other$eventTime == null : this$eventTime.equals(other$eventTime)) {
                        Object this$location = this.getLocation();
                        Object other$location = other.getLocation();
                        if (this$location == null ? other$location == null : this$location.equals(other$location)) {
                           Object this$odometer = this.getOdometer();
                           Object other$odometer = other.getOdometer();
                           if (this$odometer == null ? other$odometer == null : this$odometer.equals(other$odometer)) {
                              Object this$engineHours = this.getEngineHours();
                              Object other$engineHours = other.getEngineHours();
                              return this$engineHours == null ? other$engineHours == null : this$engineHours.equals(other$engineHours);
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
         return other instanceof EldReportDto.EventRecord;
      }

      @Override
      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $eventCode = this.getEventCode();
         result = result * 59 + ($eventCode == null ? 43 : $eventCode.hashCode());
         Object $eventDescription = this.getEventDescription();
         result = result * 59 + ($eventDescription == null ? 43 : $eventDescription.hashCode());
         Object $eventTime = this.getEventTime();
         result = result * 59 + ($eventTime == null ? 43 : $eventTime.hashCode());
         Object $location = this.getLocation();
         result = result * 59 + ($location == null ? 43 : $location.hashCode());
         Object $odometer = this.getOdometer();
         result = result * 59 + ($odometer == null ? 43 : $odometer.hashCode());
         Object $engineHours = this.getEngineHours();
         return result * 59 + ($engineHours == null ? 43 : $engineHours.hashCode());
      }

      @Override
      public String toString() {
         return "EldReportDto.EventRecord(eventCode="
            + this.getEventCode()
            + ", eventDescription="
            + this.getEventDescription()
            + ", eventTime="
            + this.getEventTime()
            + ", location="
            + this.getLocation()
            + ", odometer="
            + this.getOdometer()
            + ", engineHours="
            + this.getEngineHours()
            + ")";
      }
   }

   public static class Vehicle {
      private String unitNumber;
      private String vin;
      private String odometerStart;
      private String odometerEnd;

      public String getUnitNumber() {
         return this.unitNumber;
      }

      public String getVin() {
         return this.vin;
      }

      public String getOdometerStart() {
         return this.odometerStart;
      }

      public String getOdometerEnd() {
         return this.odometerEnd;
      }

      public void setUnitNumber(final String unitNumber) {
         this.unitNumber = unitNumber;
      }

      public void setVin(final String vin) {
         this.vin = vin;
      }

      public void setOdometerStart(final String odometerStart) {
         this.odometerStart = odometerStart;
      }

      public void setOdometerEnd(final String odometerEnd) {
         this.odometerEnd = odometerEnd;
      }

      @Override
      public boolean equals(final Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof EldReportDto.Vehicle)) {
            return false;
         } else {
            EldReportDto.Vehicle other = (EldReportDto.Vehicle)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
               Object this$unitNumber = this.getUnitNumber();
               Object other$unitNumber = other.getUnitNumber();
               if (this$unitNumber == null ? other$unitNumber == null : this$unitNumber.equals(other$unitNumber)) {
                  Object this$vin = this.getVin();
                  Object other$vin = other.getVin();
                  if (this$vin == null ? other$vin == null : this$vin.equals(other$vin)) {
                     Object this$odometerStart = this.getOdometerStart();
                     Object other$odometerStart = other.getOdometerStart();
                     if (this$odometerStart == null ? other$odometerStart == null : this$odometerStart.equals(other$odometerStart)) {
                        Object this$odometerEnd = this.getOdometerEnd();
                        Object other$odometerEnd = other.getOdometerEnd();
                        return this$odometerEnd == null ? other$odometerEnd == null : this$odometerEnd.equals(other$odometerEnd);
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
         return other instanceof EldReportDto.Vehicle;
      }

      @Override
      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $unitNumber = this.getUnitNumber();
         result = result * 59 + ($unitNumber == null ? 43 : $unitNumber.hashCode());
         Object $vin = this.getVin();
         result = result * 59 + ($vin == null ? 43 : $vin.hashCode());
         Object $odometerStart = this.getOdometerStart();
         result = result * 59 + ($odometerStart == null ? 43 : $odometerStart.hashCode());
         Object $odometerEnd = this.getOdometerEnd();
         return result * 59 + ($odometerEnd == null ? 43 : $odometerEnd.hashCode());
      }

      @Override
      public String toString() {
         return "EldReportDto.Vehicle(unitNumber="
            + this.getUnitNumber()
            + ", vin="
            + this.getVin()
            + ", odometerStart="
            + this.getOdometerStart()
            + ", odometerEnd="
            + this.getOdometerEnd()
            + ")";
      }
   }
}
