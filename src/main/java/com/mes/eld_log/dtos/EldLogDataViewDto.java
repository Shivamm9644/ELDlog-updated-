package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EldLogDataViewDto {
   @JsonProperty("Model")
   private String Model;
   @JsonProperty("DriverId")
   private long DriverId;
   @JsonProperty("VehicleId")
   private long VehicleId;
   @JsonProperty("DeviceType")
   private String DeviceType;
   @JsonProperty("Lattitude")
   private double Lattitude;
   @JsonProperty("Longitude")
   private double Longitude;
   @JsonProperty("PlaceAddress")
   private String PlaceAddress;
   @JsonProperty("SerialNo")
   private String SerialNo;
   @JsonProperty("MAC")
   private String MAC;
   @JsonProperty("Version")
   private String Version;
   @JsonProperty("VIN")
   private String VIN;
   @JsonProperty("UpTime")
   private String UpTime;
   @JsonProperty("Event")
   private String Event;
   @JsonProperty("DateTime")
   private String DateTime;
   @JsonProperty("LatLong")
   private String LatLong;
   @JsonProperty("Heading")
   private String Heading;
   @JsonProperty("SatStatus")
   private String SatStatus;
   @JsonProperty("Odometer")
   private String Odometer;
   @JsonProperty("Velocity")
   private String Velocity;
   @JsonProperty("EngineHours")
   private String EngineHours;
   @JsonProperty("RPM")
   private String RPM;
   @JsonProperty("Gear")
   private String Gear;
   @JsonProperty("Bus")
   private String Bus;
   @JsonProperty("SeatBelt")
   private String SeatBelt;
   @JsonProperty("BreakBelt")
   private String BreakBelt;
   @JsonProperty("Speed")
   private String Speed;
   @JsonProperty("Retarder")
   private String Retarder;
   @JsonProperty("DTC")
   private String DTC;
   @JsonProperty("OilPressure")
   private String OilPressure;
   @JsonProperty("OilLevel")
   private String OilLevel;
   @JsonProperty("OilTemp")
   private String OilTemp;
   @JsonProperty("CoolantTemp")
   private String CoolantTemp;
   @JsonProperty("CoolantLevel")
   private String CoolantLevel;
   @JsonProperty("FuelLevel")
   private String FuelLevel;
   @JsonProperty("FuelLevelTank2")
   private String FuelLevelTank2;
   @JsonProperty("DEFLevel")
   private String DEFLevel;
   @JsonProperty("Load")
   private String Load;
   @JsonProperty("AmbPressure")
   private String AmbPressure;
   @JsonProperty("IntakeTemp")
   private String IntakeTemp;
   @JsonProperty("IntakePressure")
   private String IntakePressure;
   @JsonProperty("FuelTankTemp")
   private String FuelTankTemp;
   @JsonProperty("IntercoolerTemp")
   private String IntercoolerTemp;
   @JsonProperty("TurboOilTemp")
   private String TurboOilTemp;
   @JsonProperty("TransmOilTemp")
   private String TransmOilTemp;
   @JsonProperty("FuelRate")
   private String FuelRate;
   @JsonProperty("FuelEconomy")
   private String FuelEconomy;
   @JsonProperty("AmbTemp")
   private String AmbTemp;
   @JsonProperty("IdleHours")
   private String IdleHours;
   @JsonProperty("PTO")
   private String PTO;
   @JsonProperty("TotalFuelIdle")
   private String TotalFuelIdle;
   @JsonProperty("TotalFuelUsed")
   private String TotalFuelUsed;
   @JsonProperty("receive_time")
   private String receive_time;
   @JsonProperty("receive_data_time")
   private String receive_data_time;

   public String getModel() {
      return this.Model;
   }

   public long getDriverId() {
      return this.DriverId;
   }

   public long getVehicleId() {
      return this.VehicleId;
   }

   public String getDeviceType() {
      return this.DeviceType;
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

   public String getSerialNo() {
      return this.SerialNo;
   }

   public String getMAC() {
      return this.MAC;
   }

   public String getVersion() {
      return this.Version;
   }

   public String getVIN() {
      return this.VIN;
   }

   public String getUpTime() {
      return this.UpTime;
   }

   public String getEvent() {
      return this.Event;
   }

   public String getDateTime() {
      return this.DateTime;
   }

   public String getLatLong() {
      return this.LatLong;
   }

   public String getHeading() {
      return this.Heading;
   }

   public String getSatStatus() {
      return this.SatStatus;
   }

   public String getOdometer() {
      return this.Odometer;
   }

   public String getVelocity() {
      return this.Velocity;
   }

   public String getEngineHours() {
      return this.EngineHours;
   }

   public String getRPM() {
      return this.RPM;
   }

   public String getGear() {
      return this.Gear;
   }

   public String getBus() {
      return this.Bus;
   }

   public String getSeatBelt() {
      return this.SeatBelt;
   }

   public String getBreakBelt() {
      return this.BreakBelt;
   }

   public String getSpeed() {
      return this.Speed;
   }

   public String getRetarder() {
      return this.Retarder;
   }

   public String getDTC() {
      return this.DTC;
   }

   public String getOilPressure() {
      return this.OilPressure;
   }

   public String getOilLevel() {
      return this.OilLevel;
   }

   public String getOilTemp() {
      return this.OilTemp;
   }

   public String getCoolantTemp() {
      return this.CoolantTemp;
   }

   public String getCoolantLevel() {
      return this.CoolantLevel;
   }

   public String getFuelLevel() {
      return this.FuelLevel;
   }

   public String getFuelLevelTank2() {
      return this.FuelLevelTank2;
   }

   public String getDEFLevel() {
      return this.DEFLevel;
   }

   public String getLoad() {
      return this.Load;
   }

   public String getAmbPressure() {
      return this.AmbPressure;
   }

   public String getIntakeTemp() {
      return this.IntakeTemp;
   }

   public String getIntakePressure() {
      return this.IntakePressure;
   }

   public String getFuelTankTemp() {
      return this.FuelTankTemp;
   }

   public String getIntercoolerTemp() {
      return this.IntercoolerTemp;
   }

   public String getTurboOilTemp() {
      return this.TurboOilTemp;
   }

   public String getTransmOilTemp() {
      return this.TransmOilTemp;
   }

   public String getFuelRate() {
      return this.FuelRate;
   }

   public String getFuelEconomy() {
      return this.FuelEconomy;
   }

   public String getAmbTemp() {
      return this.AmbTemp;
   }

   public String getIdleHours() {
      return this.IdleHours;
   }

   public String getPTO() {
      return this.PTO;
   }

   public String getTotalFuelIdle() {
      return this.TotalFuelIdle;
   }

   public String getTotalFuelUsed() {
      return this.TotalFuelUsed;
   }

   public String getReceive_time() {
      return this.receive_time;
   }

   public String getReceive_data_time() {
      return this.receive_data_time;
   }

   @JsonProperty("Model")
   public void setModel(final String Model) {
      this.Model = Model;
   }

   @JsonProperty("DriverId")
   public void setDriverId(final long DriverId) {
      this.DriverId = DriverId;
   }

   @JsonProperty("VehicleId")
   public void setVehicleId(final long VehicleId) {
      this.VehicleId = VehicleId;
   }

   @JsonProperty("DeviceType")
   public void setDeviceType(final String DeviceType) {
      this.DeviceType = DeviceType;
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

   @JsonProperty("SerialNo")
   public void setSerialNo(final String SerialNo) {
      this.SerialNo = SerialNo;
   }

   @JsonProperty("MAC")
   public void setMAC(final String MAC) {
      this.MAC = MAC;
   }

   @JsonProperty("Version")
   public void setVersion(final String Version) {
      this.Version = Version;
   }

   @JsonProperty("VIN")
   public void setVIN(final String VIN) {
      this.VIN = VIN;
   }

   @JsonProperty("UpTime")
   public void setUpTime(final String UpTime) {
      this.UpTime = UpTime;
   }

   @JsonProperty("Event")
   public void setEvent(final String Event) {
      this.Event = Event;
   }

   @JsonProperty("DateTime")
   public void setDateTime(final String DateTime) {
      this.DateTime = DateTime;
   }

   @JsonProperty("LatLong")
   public void setLatLong(final String LatLong) {
      this.LatLong = LatLong;
   }

   @JsonProperty("Heading")
   public void setHeading(final String Heading) {
      this.Heading = Heading;
   }

   @JsonProperty("SatStatus")
   public void setSatStatus(final String SatStatus) {
      this.SatStatus = SatStatus;
   }

   @JsonProperty("Odometer")
   public void setOdometer(final String Odometer) {
      this.Odometer = Odometer;
   }

   @JsonProperty("Velocity")
   public void setVelocity(final String Velocity) {
      this.Velocity = Velocity;
   }

   @JsonProperty("EngineHours")
   public void setEngineHours(final String EngineHours) {
      this.EngineHours = EngineHours;
   }

   @JsonProperty("RPM")
   public void setRPM(final String RPM) {
      this.RPM = RPM;
   }

   @JsonProperty("Gear")
   public void setGear(final String Gear) {
      this.Gear = Gear;
   }

   @JsonProperty("Bus")
   public void setBus(final String Bus) {
      this.Bus = Bus;
   }

   @JsonProperty("SeatBelt")
   public void setSeatBelt(final String SeatBelt) {
      this.SeatBelt = SeatBelt;
   }

   @JsonProperty("BreakBelt")
   public void setBreakBelt(final String BreakBelt) {
      this.BreakBelt = BreakBelt;
   }

   @JsonProperty("Speed")
   public void setSpeed(final String Speed) {
      this.Speed = Speed;
   }

   @JsonProperty("Retarder")
   public void setRetarder(final String Retarder) {
      this.Retarder = Retarder;
   }

   @JsonProperty("DTC")
   public void setDTC(final String DTC) {
      this.DTC = DTC;
   }

   @JsonProperty("OilPressure")
   public void setOilPressure(final String OilPressure) {
      this.OilPressure = OilPressure;
   }

   @JsonProperty("OilLevel")
   public void setOilLevel(final String OilLevel) {
      this.OilLevel = OilLevel;
   }

   @JsonProperty("OilTemp")
   public void setOilTemp(final String OilTemp) {
      this.OilTemp = OilTemp;
   }

   @JsonProperty("CoolantTemp")
   public void setCoolantTemp(final String CoolantTemp) {
      this.CoolantTemp = CoolantTemp;
   }

   @JsonProperty("CoolantLevel")
   public void setCoolantLevel(final String CoolantLevel) {
      this.CoolantLevel = CoolantLevel;
   }

   @JsonProperty("FuelLevel")
   public void setFuelLevel(final String FuelLevel) {
      this.FuelLevel = FuelLevel;
   }

   @JsonProperty("FuelLevelTank2")
   public void setFuelLevelTank2(final String FuelLevelTank2) {
      this.FuelLevelTank2 = FuelLevelTank2;
   }

   @JsonProperty("DEFLevel")
   public void setDEFLevel(final String DEFLevel) {
      this.DEFLevel = DEFLevel;
   }

   @JsonProperty("Load")
   public void setLoad(final String Load) {
      this.Load = Load;
   }

   @JsonProperty("AmbPressure")
   public void setAmbPressure(final String AmbPressure) {
      this.AmbPressure = AmbPressure;
   }

   @JsonProperty("IntakeTemp")
   public void setIntakeTemp(final String IntakeTemp) {
      this.IntakeTemp = IntakeTemp;
   }

   @JsonProperty("IntakePressure")
   public void setIntakePressure(final String IntakePressure) {
      this.IntakePressure = IntakePressure;
   }

   @JsonProperty("FuelTankTemp")
   public void setFuelTankTemp(final String FuelTankTemp) {
      this.FuelTankTemp = FuelTankTemp;
   }

   @JsonProperty("IntercoolerTemp")
   public void setIntercoolerTemp(final String IntercoolerTemp) {
      this.IntercoolerTemp = IntercoolerTemp;
   }

   @JsonProperty("TurboOilTemp")
   public void setTurboOilTemp(final String TurboOilTemp) {
      this.TurboOilTemp = TurboOilTemp;
   }

   @JsonProperty("TransmOilTemp")
   public void setTransmOilTemp(final String TransmOilTemp) {
      this.TransmOilTemp = TransmOilTemp;
   }

   @JsonProperty("FuelRate")
   public void setFuelRate(final String FuelRate) {
      this.FuelRate = FuelRate;
   }

   @JsonProperty("FuelEconomy")
   public void setFuelEconomy(final String FuelEconomy) {
      this.FuelEconomy = FuelEconomy;
   }

   @JsonProperty("AmbTemp")
   public void setAmbTemp(final String AmbTemp) {
      this.AmbTemp = AmbTemp;
   }

   @JsonProperty("IdleHours")
   public void setIdleHours(final String IdleHours) {
      this.IdleHours = IdleHours;
   }

   @JsonProperty("PTO")
   public void setPTO(final String PTO) {
      this.PTO = PTO;
   }

   @JsonProperty("TotalFuelIdle")
   public void setTotalFuelIdle(final String TotalFuelIdle) {
      this.TotalFuelIdle = TotalFuelIdle;
   }

   @JsonProperty("TotalFuelUsed")
   public void setTotalFuelUsed(final String TotalFuelUsed) {
      this.TotalFuelUsed = TotalFuelUsed;
   }

   @JsonProperty("receive_time")
   public void setReceive_time(final String receive_time) {
      this.receive_time = receive_time;
   }

   @JsonProperty("receive_data_time")
   public void setReceive_data_time(final String receive_data_time) {
      this.receive_data_time = receive_data_time;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof EldLogDataViewDto)) {
         return false;
      } else {
         EldLogDataViewDto other = (EldLogDataViewDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getDriverId() != other.getDriverId()) {
            return false;
         } else if (this.getVehicleId() != other.getVehicleId()) {
            return false;
         } else if (Double.compare(this.getLattitude(), other.getLattitude()) != 0) {
            return false;
         } else if (Double.compare(this.getLongitude(), other.getLongitude()) != 0) {
            return false;
         } else {
            Object this$Model = this.getModel();
            Object other$Model = other.getModel();
            if (this$Model == null ? other$Model == null : this$Model.equals(other$Model)) {
               Object this$DeviceType = this.getDeviceType();
               Object other$DeviceType = other.getDeviceType();
               if (this$DeviceType == null ? other$DeviceType == null : this$DeviceType.equals(other$DeviceType)) {
                  Object this$PlaceAddress = this.getPlaceAddress();
                  Object other$PlaceAddress = other.getPlaceAddress();
                  if (this$PlaceAddress == null ? other$PlaceAddress == null : this$PlaceAddress.equals(other$PlaceAddress)) {
                     Object this$SerialNo = this.getSerialNo();
                     Object other$SerialNo = other.getSerialNo();
                     if (this$SerialNo == null ? other$SerialNo == null : this$SerialNo.equals(other$SerialNo)) {
                        Object this$MAC = this.getMAC();
                        Object other$MAC = other.getMAC();
                        if (this$MAC == null ? other$MAC == null : this$MAC.equals(other$MAC)) {
                           Object this$Version = this.getVersion();
                           Object other$Version = other.getVersion();
                           if (this$Version == null ? other$Version == null : this$Version.equals(other$Version)) {
                              Object this$VIN = this.getVIN();
                              Object other$VIN = other.getVIN();
                              if (this$VIN == null ? other$VIN == null : this$VIN.equals(other$VIN)) {
                                 Object this$UpTime = this.getUpTime();
                                 Object other$UpTime = other.getUpTime();
                                 if (this$UpTime == null ? other$UpTime == null : this$UpTime.equals(other$UpTime)) {
                                    Object this$Event = this.getEvent();
                                    Object other$Event = other.getEvent();
                                    if (this$Event == null ? other$Event == null : this$Event.equals(other$Event)) {
                                       Object this$DateTime = this.getDateTime();
                                       Object other$DateTime = other.getDateTime();
                                       if (this$DateTime == null ? other$DateTime == null : this$DateTime.equals(other$DateTime)) {
                                          Object this$LatLong = this.getLatLong();
                                          Object other$LatLong = other.getLatLong();
                                          if (this$LatLong == null ? other$LatLong == null : this$LatLong.equals(other$LatLong)) {
                                             Object this$Heading = this.getHeading();
                                             Object other$Heading = other.getHeading();
                                             if (this$Heading == null ? other$Heading == null : this$Heading.equals(other$Heading)) {
                                                Object this$SatStatus = this.getSatStatus();
                                                Object other$SatStatus = other.getSatStatus();
                                                if (this$SatStatus == null ? other$SatStatus == null : this$SatStatus.equals(other$SatStatus)) {
                                                   Object this$Odometer = this.getOdometer();
                                                   Object other$Odometer = other.getOdometer();
                                                   if (this$Odometer == null ? other$Odometer == null : this$Odometer.equals(other$Odometer)) {
                                                      Object this$Velocity = this.getVelocity();
                                                      Object other$Velocity = other.getVelocity();
                                                      if (this$Velocity == null ? other$Velocity == null : this$Velocity.equals(other$Velocity)) {
                                                         Object this$EngineHours = this.getEngineHours();
                                                         Object other$EngineHours = other.getEngineHours();
                                                         if (this$EngineHours == null ? other$EngineHours == null : this$EngineHours.equals(other$EngineHours)
                                                            )
                                                          {
                                                            Object this$RPM = this.getRPM();
                                                            Object other$RPM = other.getRPM();
                                                            if (this$RPM == null ? other$RPM == null : this$RPM.equals(other$RPM)) {
                                                               Object this$Gear = this.getGear();
                                                               Object other$Gear = other.getGear();
                                                               if (this$Gear == null ? other$Gear == null : this$Gear.equals(other$Gear)) {
                                                                  Object this$Bus = this.getBus();
                                                                  Object other$Bus = other.getBus();
                                                                  if (this$Bus == null ? other$Bus == null : this$Bus.equals(other$Bus)) {
                                                                     Object this$SeatBelt = this.getSeatBelt();
                                                                     Object other$SeatBelt = other.getSeatBelt();
                                                                     if (this$SeatBelt == null ? other$SeatBelt == null : this$SeatBelt.equals(other$SeatBelt)
                                                                        )
                                                                      {
                                                                        Object this$BreakBelt = this.getBreakBelt();
                                                                        Object other$BreakBelt = other.getBreakBelt();
                                                                        if (this$BreakBelt == null
                                                                           ? other$BreakBelt == null
                                                                           : this$BreakBelt.equals(other$BreakBelt)) {
                                                                           Object this$Speed = this.getSpeed();
                                                                           Object other$Speed = other.getSpeed();
                                                                           if (this$Speed == null ? other$Speed == null : this$Speed.equals(other$Speed)) {
                                                                              Object this$Retarder = this.getRetarder();
                                                                              Object other$Retarder = other.getRetarder();
                                                                              if (this$Retarder == null
                                                                                 ? other$Retarder == null
                                                                                 : this$Retarder.equals(other$Retarder)) {
                                                                                 Object this$DTC = this.getDTC();
                                                                                 Object other$DTC = other.getDTC();
                                                                                 if (this$DTC == null ? other$DTC == null : this$DTC.equals(other$DTC)) {
                                                                                    Object this$OilPressure = this.getOilPressure();
                                                                                    Object other$OilPressure = other.getOilPressure();
                                                                                    if (this$OilPressure == null
                                                                                       ? other$OilPressure == null
                                                                                       : this$OilPressure.equals(other$OilPressure)) {
                                                                                       Object this$OilLevel = this.getOilLevel();
                                                                                       Object other$OilLevel = other.getOilLevel();
                                                                                       if (this$OilLevel == null
                                                                                          ? other$OilLevel == null
                                                                                          : this$OilLevel.equals(other$OilLevel)) {
                                                                                          Object this$OilTemp = this.getOilTemp();
                                                                                          Object other$OilTemp = other.getOilTemp();
                                                                                          if (this$OilTemp == null
                                                                                             ? other$OilTemp == null
                                                                                             : this$OilTemp.equals(other$OilTemp)) {
                                                                                             Object this$CoolantTemp = this.getCoolantTemp();
                                                                                             Object other$CoolantTemp = other.getCoolantTemp();
                                                                                             if (this$CoolantTemp == null
                                                                                                ? other$CoolantTemp == null
                                                                                                : this$CoolantTemp.equals(other$CoolantTemp)) {
                                                                                                Object this$CoolantLevel = this.getCoolantLevel();
                                                                                                Object other$CoolantLevel = other.getCoolantLevel();
                                                                                                if (this$CoolantLevel == null
                                                                                                   ? other$CoolantLevel == null
                                                                                                   : this$CoolantLevel.equals(other$CoolantLevel)) {
                                                                                                   Object this$FuelLevel = this.getFuelLevel();
                                                                                                   Object other$FuelLevel = other.getFuelLevel();
                                                                                                   if (this$FuelLevel == null
                                                                                                      ? other$FuelLevel == null
                                                                                                      : this$FuelLevel.equals(other$FuelLevel)) {
                                                                                                      Object this$FuelLevelTank2 = this.getFuelLevelTank2();
                                                                                                      Object other$FuelLevelTank2 = other.getFuelLevelTank2();
                                                                                                      if (this$FuelLevelTank2 == null
                                                                                                         ? other$FuelLevelTank2 == null
                                                                                                         : this$FuelLevelTank2.equals(other$FuelLevelTank2)) {
                                                                                                         Object this$DEFLevel = this.getDEFLevel();
                                                                                                         Object other$DEFLevel = other.getDEFLevel();
                                                                                                         if (this$DEFLevel == null
                                                                                                            ? other$DEFLevel == null
                                                                                                            : this$DEFLevel.equals(other$DEFLevel)) {
                                                                                                            Object this$Load = this.getLoad();
                                                                                                            Object other$Load = other.getLoad();
                                                                                                            if (this$Load == null
                                                                                                               ? other$Load == null
                                                                                                               : this$Load.equals(other$Load)) {
                                                                                                               Object this$AmbPressure = this.getAmbPressure();
                                                                                                               Object other$AmbPressure = other.getAmbPressure(
                                                                                                                  
                                                                                                               );
                                                                                                               if (this$AmbPressure == null
                                                                                                                  ? other$AmbPressure == null
                                                                                                                  : this$AmbPressure.equals(other$AmbPressure)
                                                                                                                  )
                                                                                                                {
                                                                                                                  Object this$IntakeTemp = this.getIntakeTemp();
                                                                                                                  Object other$IntakeTemp = other.getIntakeTemp(
                                                                                                                     
                                                                                                                  );
                                                                                                                  if (this$IntakeTemp == null
                                                                                                                     ? other$IntakeTemp == null
                                                                                                                     : this$IntakeTemp.equals(other$IntakeTemp)
                                                                                                                     )
                                                                                                                   {
                                                                                                                     Object this$IntakePressure = this.getIntakePressure(
                                                                                                                        
                                                                                                                     );
                                                                                                                     Object other$IntakePressure = other.getIntakePressure(
                                                                                                                        
                                                                                                                     );
                                                                                                                     if (this$IntakePressure == null
                                                                                                                        ? other$IntakePressure == null
                                                                                                                        : this$IntakePressure.equals(
                                                                                                                           other$IntakePressure
                                                                                                                        )) {
                                                                                                                        Object this$FuelTankTemp = this.getFuelTankTemp(
                                                                                                                           
                                                                                                                        );
                                                                                                                        Object other$FuelTankTemp = other.getFuelTankTemp(
                                                                                                                           
                                                                                                                        );
                                                                                                                        if (this$FuelTankTemp == null
                                                                                                                           ? other$FuelTankTemp == null
                                                                                                                           : this$FuelTankTemp.equals(
                                                                                                                              other$FuelTankTemp
                                                                                                                           )) {
                                                                                                                           Object this$IntercoolerTemp = this.getIntercoolerTemp(
                                                                                                                              
                                                                                                                           );
                                                                                                                           Object other$IntercoolerTemp = other.getIntercoolerTemp(
                                                                                                                              
                                                                                                                           );
                                                                                                                           if (this$IntercoolerTemp == null
                                                                                                                              ? other$IntercoolerTemp == null
                                                                                                                              : this$IntercoolerTemp.equals(
                                                                                                                                 other$IntercoolerTemp
                                                                                                                              )) {
                                                                                                                              Object this$TurboOilTemp = this.getTurboOilTemp(
                                                                                                                                 
                                                                                                                              );
                                                                                                                              Object other$TurboOilTemp = other.getTurboOilTemp(
                                                                                                                                 
                                                                                                                              );
                                                                                                                              if (this$TurboOilTemp == null
                                                                                                                                 ? other$TurboOilTemp == null
                                                                                                                                 : this$TurboOilTemp.equals(
                                                                                                                                    other$TurboOilTemp
                                                                                                                                 )) {
                                                                                                                                 Object this$TransmOilTemp = this.getTransmOilTemp(
                                                                                                                                    
                                                                                                                                 );
                                                                                                                                 Object other$TransmOilTemp = other.getTransmOilTemp(
                                                                                                                                    
                                                                                                                                 );
                                                                                                                                 if (this$TransmOilTemp
                                                                                                                                       == null
                                                                                                                                    ? other$TransmOilTemp
                                                                                                                                       == null
                                                                                                                                    : this$TransmOilTemp.equals(
                                                                                                                                       other$TransmOilTemp
                                                                                                                                    )) {
                                                                                                                                    Object this$FuelRate = this.getFuelRate(
                                                                                                                                       
                                                                                                                                    );
                                                                                                                                    Object other$FuelRate = other.getFuelRate(
                                                                                                                                       
                                                                                                                                    );
                                                                                                                                    if (this$FuelRate == null
                                                                                                                                       ? other$FuelRate
                                                                                                                                          == null
                                                                                                                                       : this$FuelRate.equals(
                                                                                                                                          other$FuelRate
                                                                                                                                       )) {
                                                                                                                                       Object this$FuelEconomy = this.getFuelEconomy(
                                                                                                                                          
                                                                                                                                       );
                                                                                                                                       Object other$FuelEconomy = other.getFuelEconomy(
                                                                                                                                          
                                                                                                                                       );
                                                                                                                                       if (this$FuelEconomy
                                                                                                                                             == null
                                                                                                                                          ? other$FuelEconomy
                                                                                                                                             == null
                                                                                                                                          : this$FuelEconomy.equals(
                                                                                                                                             other$FuelEconomy
                                                                                                                                          )) {
                                                                                                                                          Object this$AmbTemp = this.getAmbTemp(
                                                                                                                                             
                                                                                                                                          );
                                                                                                                                          Object other$AmbTemp = other.getAmbTemp(
                                                                                                                                             
                                                                                                                                          );
                                                                                                                                          if (this$AmbTemp
                                                                                                                                                == null
                                                                                                                                             ? other$AmbTemp
                                                                                                                                                == null
                                                                                                                                             : this$AmbTemp.equals(
                                                                                                                                                other$AmbTemp
                                                                                                                                             )) {
                                                                                                                                             Object this$IdleHours = this.getIdleHours(
                                                                                                                                                
                                                                                                                                             );
                                                                                                                                             Object other$IdleHours = other.getIdleHours(
                                                                                                                                                
                                                                                                                                             );
                                                                                                                                             if (this$IdleHours
                                                                                                                                                   == null
                                                                                                                                                ? other$IdleHours
                                                                                                                                                   == null
                                                                                                                                                : this$IdleHours.equals(
                                                                                                                                                   other$IdleHours
                                                                                                                                                )) {
                                                                                                                                                Object this$PTO = this.getPTO(
                                                                                                                                                   
                                                                                                                                                );
                                                                                                                                                Object other$PTO = other.getPTO(
                                                                                                                                                   
                                                                                                                                                );
                                                                                                                                                if (this$PTO
                                                                                                                                                      == null
                                                                                                                                                   ? other$PTO
                                                                                                                                                      == null
                                                                                                                                                   : this$PTO.equals(
                                                                                                                                                      other$PTO
                                                                                                                                                   )) {
                                                                                                                                                   Object this$TotalFuelIdle = this.getTotalFuelIdle(
                                                                                                                                                      
                                                                                                                                                   );
                                                                                                                                                   Object other$TotalFuelIdle = other.getTotalFuelIdle(
                                                                                                                                                      
                                                                                                                                                   );
                                                                                                                                                   if (this$TotalFuelIdle
                                                                                                                                                         == null
                                                                                                                                                      ? other$TotalFuelIdle
                                                                                                                                                         == null
                                                                                                                                                      : this$TotalFuelIdle.equals(
                                                                                                                                                         other$TotalFuelIdle
                                                                                                                                                      )) {
                                                                                                                                                      Object this$TotalFuelUsed = this.getTotalFuelUsed(
                                                                                                                                                         
                                                                                                                                                      );
                                                                                                                                                      Object other$TotalFuelUsed = other.getTotalFuelUsed(
                                                                                                                                                         
                                                                                                                                                      );
                                                                                                                                                      if (this$TotalFuelUsed
                                                                                                                                                            == null
                                                                                                                                                         ? other$TotalFuelUsed
                                                                                                                                                            == null
                                                                                                                                                         : this$TotalFuelUsed.equals(
                                                                                                                                                            other$TotalFuelUsed
                                                                                                                                                         )) {
                                                                                                                                                         Object this$receive_time = this.getReceive_time(
                                                                                                                                                            
                                                                                                                                                         );
                                                                                                                                                         Object other$receive_time = other.getReceive_time(
                                                                                                                                                            
                                                                                                                                                         );
                                                                                                                                                         if (this$receive_time
                                                                                                                                                               == null
                                                                                                                                                            ? other$receive_time
                                                                                                                                                               == null
                                                                                                                                                            : this$receive_time.equals(
                                                                                                                                                               other$receive_time
                                                                                                                                                            )) {
                                                                                                                                                            Object this$receive_data_time = this.getReceive_data_time(
                                                                                                                                                               
                                                                                                                                                            );
                                                                                                                                                            Object other$receive_data_time = other.getReceive_data_time(
                                                                                                                                                               
                                                                                                                                                            );
                                                                                                                                                            return this$receive_data_time
                                                                                                                                                                  == null
                                                                                                                                                               ? other$receive_data_time
                                                                                                                                                                  == null
                                                                                                                                                               : this$receive_data_time.equals(
                                                                                                                                                                  other$receive_data_time
                                                                                                                                                               );
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
      return other instanceof EldLogDataViewDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $DriverId = this.getDriverId();
      result = result * 59 + (int)($DriverId >>> 32 ^ $DriverId);
      long $VehicleId = this.getVehicleId();
      result = result * 59 + (int)($VehicleId >>> 32 ^ $VehicleId);
      long $Lattitude = Double.doubleToLongBits(this.getLattitude());
      result = result * 59 + (int)($Lattitude >>> 32 ^ $Lattitude);
      long $Longitude = Double.doubleToLongBits(this.getLongitude());
      result = result * 59 + (int)($Longitude >>> 32 ^ $Longitude);
      Object $Model = this.getModel();
      result = result * 59 + ($Model == null ? 43 : $Model.hashCode());
      Object $DeviceType = this.getDeviceType();
      result = result * 59 + ($DeviceType == null ? 43 : $DeviceType.hashCode());
      Object $PlaceAddress = this.getPlaceAddress();
      result = result * 59 + ($PlaceAddress == null ? 43 : $PlaceAddress.hashCode());
      Object $SerialNo = this.getSerialNo();
      result = result * 59 + ($SerialNo == null ? 43 : $SerialNo.hashCode());
      Object $MAC = this.getMAC();
      result = result * 59 + ($MAC == null ? 43 : $MAC.hashCode());
      Object $Version = this.getVersion();
      result = result * 59 + ($Version == null ? 43 : $Version.hashCode());
      Object $VIN = this.getVIN();
      result = result * 59 + ($VIN == null ? 43 : $VIN.hashCode());
      Object $UpTime = this.getUpTime();
      result = result * 59 + ($UpTime == null ? 43 : $UpTime.hashCode());
      Object $Event = this.getEvent();
      result = result * 59 + ($Event == null ? 43 : $Event.hashCode());
      Object $DateTime = this.getDateTime();
      result = result * 59 + ($DateTime == null ? 43 : $DateTime.hashCode());
      Object $LatLong = this.getLatLong();
      result = result * 59 + ($LatLong == null ? 43 : $LatLong.hashCode());
      Object $Heading = this.getHeading();
      result = result * 59 + ($Heading == null ? 43 : $Heading.hashCode());
      Object $SatStatus = this.getSatStatus();
      result = result * 59 + ($SatStatus == null ? 43 : $SatStatus.hashCode());
      Object $Odometer = this.getOdometer();
      result = result * 59 + ($Odometer == null ? 43 : $Odometer.hashCode());
      Object $Velocity = this.getVelocity();
      result = result * 59 + ($Velocity == null ? 43 : $Velocity.hashCode());
      Object $EngineHours = this.getEngineHours();
      result = result * 59 + ($EngineHours == null ? 43 : $EngineHours.hashCode());
      Object $RPM = this.getRPM();
      result = result * 59 + ($RPM == null ? 43 : $RPM.hashCode());
      Object $Gear = this.getGear();
      result = result * 59 + ($Gear == null ? 43 : $Gear.hashCode());
      Object $Bus = this.getBus();
      result = result * 59 + ($Bus == null ? 43 : $Bus.hashCode());
      Object $SeatBelt = this.getSeatBelt();
      result = result * 59 + ($SeatBelt == null ? 43 : $SeatBelt.hashCode());
      Object $BreakBelt = this.getBreakBelt();
      result = result * 59 + ($BreakBelt == null ? 43 : $BreakBelt.hashCode());
      Object $Speed = this.getSpeed();
      result = result * 59 + ($Speed == null ? 43 : $Speed.hashCode());
      Object $Retarder = this.getRetarder();
      result = result * 59 + ($Retarder == null ? 43 : $Retarder.hashCode());
      Object $DTC = this.getDTC();
      result = result * 59 + ($DTC == null ? 43 : $DTC.hashCode());
      Object $OilPressure = this.getOilPressure();
      result = result * 59 + ($OilPressure == null ? 43 : $OilPressure.hashCode());
      Object $OilLevel = this.getOilLevel();
      result = result * 59 + ($OilLevel == null ? 43 : $OilLevel.hashCode());
      Object $OilTemp = this.getOilTemp();
      result = result * 59 + ($OilTemp == null ? 43 : $OilTemp.hashCode());
      Object $CoolantTemp = this.getCoolantTemp();
      result = result * 59 + ($CoolantTemp == null ? 43 : $CoolantTemp.hashCode());
      Object $CoolantLevel = this.getCoolantLevel();
      result = result * 59 + ($CoolantLevel == null ? 43 : $CoolantLevel.hashCode());
      Object $FuelLevel = this.getFuelLevel();
      result = result * 59 + ($FuelLevel == null ? 43 : $FuelLevel.hashCode());
      Object $FuelLevelTank2 = this.getFuelLevelTank2();
      result = result * 59 + ($FuelLevelTank2 == null ? 43 : $FuelLevelTank2.hashCode());
      Object $DEFLevel = this.getDEFLevel();
      result = result * 59 + ($DEFLevel == null ? 43 : $DEFLevel.hashCode());
      Object $Load = this.getLoad();
      result = result * 59 + ($Load == null ? 43 : $Load.hashCode());
      Object $AmbPressure = this.getAmbPressure();
      result = result * 59 + ($AmbPressure == null ? 43 : $AmbPressure.hashCode());
      Object $IntakeTemp = this.getIntakeTemp();
      result = result * 59 + ($IntakeTemp == null ? 43 : $IntakeTemp.hashCode());
      Object $IntakePressure = this.getIntakePressure();
      result = result * 59 + ($IntakePressure == null ? 43 : $IntakePressure.hashCode());
      Object $FuelTankTemp = this.getFuelTankTemp();
      result = result * 59 + ($FuelTankTemp == null ? 43 : $FuelTankTemp.hashCode());
      Object $IntercoolerTemp = this.getIntercoolerTemp();
      result = result * 59 + ($IntercoolerTemp == null ? 43 : $IntercoolerTemp.hashCode());
      Object $TurboOilTemp = this.getTurboOilTemp();
      result = result * 59 + ($TurboOilTemp == null ? 43 : $TurboOilTemp.hashCode());
      Object $TransmOilTemp = this.getTransmOilTemp();
      result = result * 59 + ($TransmOilTemp == null ? 43 : $TransmOilTemp.hashCode());
      Object $FuelRate = this.getFuelRate();
      result = result * 59 + ($FuelRate == null ? 43 : $FuelRate.hashCode());
      Object $FuelEconomy = this.getFuelEconomy();
      result = result * 59 + ($FuelEconomy == null ? 43 : $FuelEconomy.hashCode());
      Object $AmbTemp = this.getAmbTemp();
      result = result * 59 + ($AmbTemp == null ? 43 : $AmbTemp.hashCode());
      Object $IdleHours = this.getIdleHours();
      result = result * 59 + ($IdleHours == null ? 43 : $IdleHours.hashCode());
      Object $PTO = this.getPTO();
      result = result * 59 + ($PTO == null ? 43 : $PTO.hashCode());
      Object $TotalFuelIdle = this.getTotalFuelIdle();
      result = result * 59 + ($TotalFuelIdle == null ? 43 : $TotalFuelIdle.hashCode());
      Object $TotalFuelUsed = this.getTotalFuelUsed();
      result = result * 59 + ($TotalFuelUsed == null ? 43 : $TotalFuelUsed.hashCode());
      Object $receive_time = this.getReceive_time();
      result = result * 59 + ($receive_time == null ? 43 : $receive_time.hashCode());
      Object $receive_data_time = this.getReceive_data_time();
      return result * 59 + ($receive_data_time == null ? 43 : $receive_data_time.hashCode());
   }

   @Override
   public String toString() {
      return "EldLogDataViewDto(Model="
         + this.getModel()
         + ", DriverId="
         + this.getDriverId()
         + ", VehicleId="
         + this.getVehicleId()
         + ", DeviceType="
         + this.getDeviceType()
         + ", Lattitude="
         + this.getLattitude()
         + ", Longitude="
         + this.getLongitude()
         + ", PlaceAddress="
         + this.getPlaceAddress()
         + ", SerialNo="
         + this.getSerialNo()
         + ", MAC="
         + this.getMAC()
         + ", Version="
         + this.getVersion()
         + ", VIN="
         + this.getVIN()
         + ", UpTime="
         + this.getUpTime()
         + ", Event="
         + this.getEvent()
         + ", DateTime="
         + this.getDateTime()
         + ", LatLong="
         + this.getLatLong()
         + ", Heading="
         + this.getHeading()
         + ", SatStatus="
         + this.getSatStatus()
         + ", Odometer="
         + this.getOdometer()
         + ", Velocity="
         + this.getVelocity()
         + ", EngineHours="
         + this.getEngineHours()
         + ", RPM="
         + this.getRPM()
         + ", Gear="
         + this.getGear()
         + ", Bus="
         + this.getBus()
         + ", SeatBelt="
         + this.getSeatBelt()
         + ", BreakBelt="
         + this.getBreakBelt()
         + ", Speed="
         + this.getSpeed()
         + ", Retarder="
         + this.getRetarder()
         + ", DTC="
         + this.getDTC()
         + ", OilPressure="
         + this.getOilPressure()
         + ", OilLevel="
         + this.getOilLevel()
         + ", OilTemp="
         + this.getOilTemp()
         + ", CoolantTemp="
         + this.getCoolantTemp()
         + ", CoolantLevel="
         + this.getCoolantLevel()
         + ", FuelLevel="
         + this.getFuelLevel()
         + ", FuelLevelTank2="
         + this.getFuelLevelTank2()
         + ", DEFLevel="
         + this.getDEFLevel()
         + ", Load="
         + this.getLoad()
         + ", AmbPressure="
         + this.getAmbPressure()
         + ", IntakeTemp="
         + this.getIntakeTemp()
         + ", IntakePressure="
         + this.getIntakePressure()
         + ", FuelTankTemp="
         + this.getFuelTankTemp()
         + ", IntercoolerTemp="
         + this.getIntercoolerTemp()
         + ", TurboOilTemp="
         + this.getTurboOilTemp()
         + ", TransmOilTemp="
         + this.getTransmOilTemp()
         + ", FuelRate="
         + this.getFuelRate()
         + ", FuelEconomy="
         + this.getFuelEconomy()
         + ", AmbTemp="
         + this.getAmbTemp()
         + ", IdleHours="
         + this.getIdleHours()
         + ", PTO="
         + this.getPTO()
         + ", TotalFuelIdle="
         + this.getTotalFuelIdle()
         + ", TotalFuelUsed="
         + this.getTotalFuelUsed()
         + ", receive_time="
         + this.getReceive_time()
         + ", receive_data_time="
         + this.getReceive_data_time()
         + ")";
   }
}
