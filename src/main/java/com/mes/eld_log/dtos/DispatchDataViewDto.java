package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DispatchDataViewDto {
   @JsonProperty("_id")
   private String _id;
   @JsonProperty("load")
   private String load;
   @JsonProperty("customerId")
   private long customerId;
   @JsonProperty("customerName")
   private String customerName;
   @JsonProperty("customerReferenceNo")
   private String customerReferenceNo;
   @JsonProperty("dispatcher")
   private String dispatcher;
   @JsonProperty("loadEnterBy")
   private String loadEnterBy;
   @JsonProperty("currency")
   private String currency;
   @JsonProperty("flatRate")
   private double flatRate;
   @JsonProperty("extraPD")
   private double extraPD;
   @JsonProperty("fuelSurCharge")
   private double fuelSurCharge;
   @JsonProperty("extraCharge")
   private double extraCharge;
   @JsonProperty("otherCharge")
   private double otherCharge;
   @JsonProperty("dudectionTotal")
   private double dudectionTotal;
   @JsonProperty("reimbursementTotal")
   private double reimbursementTotal;
   @JsonProperty("total")
   private double total;
   @JsonProperty("dispatchBy")
   private String dispatchBy;
   @JsonProperty("driverId")
   private long driverId;
   @JsonProperty("driverName")
   private String driverName;
   @JsonProperty("driverTruck")
   private String driverTruck;
   @JsonProperty("driverTrailer")
   private String driverTrailer;
   @JsonProperty("driverRate")
   private double driverRate;
   @JsonProperty("totalMiles")
   private double totalMiles;
   @JsonProperty("carrierId")
   private long carrierId;
   @JsonProperty("carrierName")
   private String carrierName;
   @JsonProperty("carrierTruck")
   private String carrierTruck;
   @JsonProperty("carrierTrailer")
   private String carrierTrailer;
   @JsonProperty("equipmentType")
   private long equipmentType;
   @JsonProperty("carrierRate")
   private double carrierRate;
   @JsonProperty("carrierOtherCharges")
   private double carrierOtherCharges;
   @JsonProperty("isDataSaveAsDraft")
   private String isDataSaveAsDraft;
   @JsonProperty("divR")
   private String divR;

   public String get_id() {
      return this._id;
   }

   public String getLoad() {
      return this.load;
   }

   public long getCustomerId() {
      return this.customerId;
   }

   public String getCustomerName() {
      return this.customerName;
   }

   public String getCustomerReferenceNo() {
      return this.customerReferenceNo;
   }

   public String getDispatcher() {
      return this.dispatcher;
   }

   public String getLoadEnterBy() {
      return this.loadEnterBy;
   }

   public String getCurrency() {
      return this.currency;
   }

   public double getFlatRate() {
      return this.flatRate;
   }

   public double getExtraPD() {
      return this.extraPD;
   }

   public double getFuelSurCharge() {
      return this.fuelSurCharge;
   }

   public double getExtraCharge() {
      return this.extraCharge;
   }

   public double getOtherCharge() {
      return this.otherCharge;
   }

   public double getDudectionTotal() {
      return this.dudectionTotal;
   }

   public double getReimbursementTotal() {
      return this.reimbursementTotal;
   }

   public double getTotal() {
      return this.total;
   }

   public String getDispatchBy() {
      return this.dispatchBy;
   }

   public long getDriverId() {
      return this.driverId;
   }

   public String getDriverName() {
      return this.driverName;
   }

   public String getDriverTruck() {
      return this.driverTruck;
   }

   public String getDriverTrailer() {
      return this.driverTrailer;
   }

   public double getDriverRate() {
      return this.driverRate;
   }

   public double getTotalMiles() {
      return this.totalMiles;
   }

   public long getCarrierId() {
      return this.carrierId;
   }

   public String getCarrierName() {
      return this.carrierName;
   }

   public String getCarrierTruck() {
      return this.carrierTruck;
   }

   public String getCarrierTrailer() {
      return this.carrierTrailer;
   }

   public long getEquipmentType() {
      return this.equipmentType;
   }

   public double getCarrierRate() {
      return this.carrierRate;
   }

   public double getCarrierOtherCharges() {
      return this.carrierOtherCharges;
   }

   public String getIsDataSaveAsDraft() {
      return this.isDataSaveAsDraft;
   }

   public String getDivR() {
      return this.divR;
   }

   @JsonProperty("_id")
   public void set_id(final String _id) {
      this._id = _id;
   }

   @JsonProperty("load")
   public void setLoad(final String load) {
      this.load = load;
   }

   @JsonProperty("customerId")
   public void setCustomerId(final long customerId) {
      this.customerId = customerId;
   }

   @JsonProperty("customerName")
   public void setCustomerName(final String customerName) {
      this.customerName = customerName;
   }

   @JsonProperty("customerReferenceNo")
   public void setCustomerReferenceNo(final String customerReferenceNo) {
      this.customerReferenceNo = customerReferenceNo;
   }

   @JsonProperty("dispatcher")
   public void setDispatcher(final String dispatcher) {
      this.dispatcher = dispatcher;
   }

   @JsonProperty("loadEnterBy")
   public void setLoadEnterBy(final String loadEnterBy) {
      this.loadEnterBy = loadEnterBy;
   }

   @JsonProperty("currency")
   public void setCurrency(final String currency) {
      this.currency = currency;
   }

   @JsonProperty("flatRate")
   public void setFlatRate(final double flatRate) {
      this.flatRate = flatRate;
   }

   @JsonProperty("extraPD")
   public void setExtraPD(final double extraPD) {
      this.extraPD = extraPD;
   }

   @JsonProperty("fuelSurCharge")
   public void setFuelSurCharge(final double fuelSurCharge) {
      this.fuelSurCharge = fuelSurCharge;
   }

   @JsonProperty("extraCharge")
   public void setExtraCharge(final double extraCharge) {
      this.extraCharge = extraCharge;
   }

   @JsonProperty("otherCharge")
   public void setOtherCharge(final double otherCharge) {
      this.otherCharge = otherCharge;
   }

   @JsonProperty("dudectionTotal")
   public void setDudectionTotal(final double dudectionTotal) {
      this.dudectionTotal = dudectionTotal;
   }

   @JsonProperty("reimbursementTotal")
   public void setReimbursementTotal(final double reimbursementTotal) {
      this.reimbursementTotal = reimbursementTotal;
   }

   @JsonProperty("total")
   public void setTotal(final double total) {
      this.total = total;
   }

   @JsonProperty("dispatchBy")
   public void setDispatchBy(final String dispatchBy) {
      this.dispatchBy = dispatchBy;
   }

   @JsonProperty("driverId")
   public void setDriverId(final long driverId) {
      this.driverId = driverId;
   }

   @JsonProperty("driverName")
   public void setDriverName(final String driverName) {
      this.driverName = driverName;
   }

   @JsonProperty("driverTruck")
   public void setDriverTruck(final String driverTruck) {
      this.driverTruck = driverTruck;
   }

   @JsonProperty("driverTrailer")
   public void setDriverTrailer(final String driverTrailer) {
      this.driverTrailer = driverTrailer;
   }

   @JsonProperty("driverRate")
   public void setDriverRate(final double driverRate) {
      this.driverRate = driverRate;
   }

   @JsonProperty("totalMiles")
   public void setTotalMiles(final double totalMiles) {
      this.totalMiles = totalMiles;
   }

   @JsonProperty("carrierId")
   public void setCarrierId(final long carrierId) {
      this.carrierId = carrierId;
   }

   @JsonProperty("carrierName")
   public void setCarrierName(final String carrierName) {
      this.carrierName = carrierName;
   }

   @JsonProperty("carrierTruck")
   public void setCarrierTruck(final String carrierTruck) {
      this.carrierTruck = carrierTruck;
   }

   @JsonProperty("carrierTrailer")
   public void setCarrierTrailer(final String carrierTrailer) {
      this.carrierTrailer = carrierTrailer;
   }

   @JsonProperty("equipmentType")
   public void setEquipmentType(final long equipmentType) {
      this.equipmentType = equipmentType;
   }

   @JsonProperty("carrierRate")
   public void setCarrierRate(final double carrierRate) {
      this.carrierRate = carrierRate;
   }

   @JsonProperty("carrierOtherCharges")
   public void setCarrierOtherCharges(final double carrierOtherCharges) {
      this.carrierOtherCharges = carrierOtherCharges;
   }

   @JsonProperty("isDataSaveAsDraft")
   public void setIsDataSaveAsDraft(final String isDataSaveAsDraft) {
      this.isDataSaveAsDraft = isDataSaveAsDraft;
   }

   @JsonProperty("divR")
   public void setDivR(final String divR) {
      this.divR = divR;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof DispatchDataViewDto)) {
         return false;
      } else {
         DispatchDataViewDto other = (DispatchDataViewDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getCustomerId() != other.getCustomerId()) {
            return false;
         } else if (Double.compare(this.getFlatRate(), other.getFlatRate()) != 0) {
            return false;
         } else if (Double.compare(this.getExtraPD(), other.getExtraPD()) != 0) {
            return false;
         } else if (Double.compare(this.getFuelSurCharge(), other.getFuelSurCharge()) != 0) {
            return false;
         } else if (Double.compare(this.getExtraCharge(), other.getExtraCharge()) != 0) {
            return false;
         } else if (Double.compare(this.getOtherCharge(), other.getOtherCharge()) != 0) {
            return false;
         } else if (Double.compare(this.getDudectionTotal(), other.getDudectionTotal()) != 0) {
            return false;
         } else if (Double.compare(this.getReimbursementTotal(), other.getReimbursementTotal()) != 0) {
            return false;
         } else if (Double.compare(this.getTotal(), other.getTotal()) != 0) {
            return false;
         } else if (this.getDriverId() != other.getDriverId()) {
            return false;
         } else if (Double.compare(this.getDriverRate(), other.getDriverRate()) != 0) {
            return false;
         } else if (Double.compare(this.getTotalMiles(), other.getTotalMiles()) != 0) {
            return false;
         } else if (this.getCarrierId() != other.getCarrierId()) {
            return false;
         } else if (this.getEquipmentType() != other.getEquipmentType()) {
            return false;
         } else if (Double.compare(this.getCarrierRate(), other.getCarrierRate()) != 0) {
            return false;
         } else if (Double.compare(this.getCarrierOtherCharges(), other.getCarrierOtherCharges()) != 0) {
            return false;
         } else {
            Object this$_id = this.get_id();
            Object other$_id = other.get_id();
            if (this$_id == null ? other$_id == null : this$_id.equals(other$_id)) {
               Object this$load = this.getLoad();
               Object other$load = other.getLoad();
               if (this$load == null ? other$load == null : this$load.equals(other$load)) {
                  Object this$customerName = this.getCustomerName();
                  Object other$customerName = other.getCustomerName();
                  if (this$customerName == null ? other$customerName == null : this$customerName.equals(other$customerName)) {
                     Object this$customerReferenceNo = this.getCustomerReferenceNo();
                     Object other$customerReferenceNo = other.getCustomerReferenceNo();
                     if (this$customerReferenceNo == null ? other$customerReferenceNo == null : this$customerReferenceNo.equals(other$customerReferenceNo)) {
                        Object this$dispatcher = this.getDispatcher();
                        Object other$dispatcher = other.getDispatcher();
                        if (this$dispatcher == null ? other$dispatcher == null : this$dispatcher.equals(other$dispatcher)) {
                           Object this$loadEnterBy = this.getLoadEnterBy();
                           Object other$loadEnterBy = other.getLoadEnterBy();
                           if (this$loadEnterBy == null ? other$loadEnterBy == null : this$loadEnterBy.equals(other$loadEnterBy)) {
                              Object this$currency = this.getCurrency();
                              Object other$currency = other.getCurrency();
                              if (this$currency == null ? other$currency == null : this$currency.equals(other$currency)) {
                                 Object this$dispatchBy = this.getDispatchBy();
                                 Object other$dispatchBy = other.getDispatchBy();
                                 if (this$dispatchBy == null ? other$dispatchBy == null : this$dispatchBy.equals(other$dispatchBy)) {
                                    Object this$driverName = this.getDriverName();
                                    Object other$driverName = other.getDriverName();
                                    if (this$driverName == null ? other$driverName == null : this$driverName.equals(other$driverName)) {
                                       Object this$driverTruck = this.getDriverTruck();
                                       Object other$driverTruck = other.getDriverTruck();
                                       if (this$driverTruck == null ? other$driverTruck == null : this$driverTruck.equals(other$driverTruck)) {
                                          Object this$driverTrailer = this.getDriverTrailer();
                                          Object other$driverTrailer = other.getDriverTrailer();
                                          if (this$driverTrailer == null ? other$driverTrailer == null : this$driverTrailer.equals(other$driverTrailer)) {
                                             Object this$carrierName = this.getCarrierName();
                                             Object other$carrierName = other.getCarrierName();
                                             if (this$carrierName == null ? other$carrierName == null : this$carrierName.equals(other$carrierName)) {
                                                Object this$carrierTruck = this.getCarrierTruck();
                                                Object other$carrierTruck = other.getCarrierTruck();
                                                if (this$carrierTruck == null ? other$carrierTruck == null : this$carrierTruck.equals(other$carrierTruck)) {
                                                   Object this$carrierTrailer = this.getCarrierTrailer();
                                                   Object other$carrierTrailer = other.getCarrierTrailer();
                                                   if (this$carrierTrailer == null
                                                      ? other$carrierTrailer == null
                                                      : this$carrierTrailer.equals(other$carrierTrailer)) {
                                                      Object this$isDataSaveAsDraft = this.getIsDataSaveAsDraft();
                                                      Object other$isDataSaveAsDraft = other.getIsDataSaveAsDraft();
                                                      if (this$isDataSaveAsDraft == null
                                                         ? other$isDataSaveAsDraft == null
                                                         : this$isDataSaveAsDraft.equals(other$isDataSaveAsDraft)) {
                                                         Object this$divR = this.getDivR();
                                                         Object other$divR = other.getDivR();
                                                         return this$divR == null ? other$divR == null : this$divR.equals(other$divR);
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
      return other instanceof DispatchDataViewDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $customerId = this.getCustomerId();
      result = result * 59 + (int)($customerId >>> 32 ^ $customerId);
      long $flatRate = Double.doubleToLongBits(this.getFlatRate());
      result = result * 59 + (int)($flatRate >>> 32 ^ $flatRate);
      long $extraPD = Double.doubleToLongBits(this.getExtraPD());
      result = result * 59 + (int)($extraPD >>> 32 ^ $extraPD);
      long $fuelSurCharge = Double.doubleToLongBits(this.getFuelSurCharge());
      result = result * 59 + (int)($fuelSurCharge >>> 32 ^ $fuelSurCharge);
      long $extraCharge = Double.doubleToLongBits(this.getExtraCharge());
      result = result * 59 + (int)($extraCharge >>> 32 ^ $extraCharge);
      long $otherCharge = Double.doubleToLongBits(this.getOtherCharge());
      result = result * 59 + (int)($otherCharge >>> 32 ^ $otherCharge);
      long $dudectionTotal = Double.doubleToLongBits(this.getDudectionTotal());
      result = result * 59 + (int)($dudectionTotal >>> 32 ^ $dudectionTotal);
      long $reimbursementTotal = Double.doubleToLongBits(this.getReimbursementTotal());
      result = result * 59 + (int)($reimbursementTotal >>> 32 ^ $reimbursementTotal);
      long $total = Double.doubleToLongBits(this.getTotal());
      result = result * 59 + (int)($total >>> 32 ^ $total);
      long $driverId = this.getDriverId();
      result = result * 59 + (int)($driverId >>> 32 ^ $driverId);
      long $driverRate = Double.doubleToLongBits(this.getDriverRate());
      result = result * 59 + (int)($driverRate >>> 32 ^ $driverRate);
      long $totalMiles = Double.doubleToLongBits(this.getTotalMiles());
      result = result * 59 + (int)($totalMiles >>> 32 ^ $totalMiles);
      long $carrierId = this.getCarrierId();
      result = result * 59 + (int)($carrierId >>> 32 ^ $carrierId);
      long $equipmentType = this.getEquipmentType();
      result = result * 59 + (int)($equipmentType >>> 32 ^ $equipmentType);
      long $carrierRate = Double.doubleToLongBits(this.getCarrierRate());
      result = result * 59 + (int)($carrierRate >>> 32 ^ $carrierRate);
      long $carrierOtherCharges = Double.doubleToLongBits(this.getCarrierOtherCharges());
      result = result * 59 + (int)($carrierOtherCharges >>> 32 ^ $carrierOtherCharges);
      Object $_id = this.get_id();
      result = result * 59 + ($_id == null ? 43 : $_id.hashCode());
      Object $load = this.getLoad();
      result = result * 59 + ($load == null ? 43 : $load.hashCode());
      Object $customerName = this.getCustomerName();
      result = result * 59 + ($customerName == null ? 43 : $customerName.hashCode());
      Object $customerReferenceNo = this.getCustomerReferenceNo();
      result = result * 59 + ($customerReferenceNo == null ? 43 : $customerReferenceNo.hashCode());
      Object $dispatcher = this.getDispatcher();
      result = result * 59 + ($dispatcher == null ? 43 : $dispatcher.hashCode());
      Object $loadEnterBy = this.getLoadEnterBy();
      result = result * 59 + ($loadEnterBy == null ? 43 : $loadEnterBy.hashCode());
      Object $currency = this.getCurrency();
      result = result * 59 + ($currency == null ? 43 : $currency.hashCode());
      Object $dispatchBy = this.getDispatchBy();
      result = result * 59 + ($dispatchBy == null ? 43 : $dispatchBy.hashCode());
      Object $driverName = this.getDriverName();
      result = result * 59 + ($driverName == null ? 43 : $driverName.hashCode());
      Object $driverTruck = this.getDriverTruck();
      result = result * 59 + ($driverTruck == null ? 43 : $driverTruck.hashCode());
      Object $driverTrailer = this.getDriverTrailer();
      result = result * 59 + ($driverTrailer == null ? 43 : $driverTrailer.hashCode());
      Object $carrierName = this.getCarrierName();
      result = result * 59 + ($carrierName == null ? 43 : $carrierName.hashCode());
      Object $carrierTruck = this.getCarrierTruck();
      result = result * 59 + ($carrierTruck == null ? 43 : $carrierTruck.hashCode());
      Object $carrierTrailer = this.getCarrierTrailer();
      result = result * 59 + ($carrierTrailer == null ? 43 : $carrierTrailer.hashCode());
      Object $isDataSaveAsDraft = this.getIsDataSaveAsDraft();
      result = result * 59 + ($isDataSaveAsDraft == null ? 43 : $isDataSaveAsDraft.hashCode());
      Object $divR = this.getDivR();
      return result * 59 + ($divR == null ? 43 : $divR.hashCode());
   }

   @Override
   public String toString() {
      return "DispatchDataViewDto(_id="
         + this.get_id()
         + ", load="
         + this.getLoad()
         + ", customerId="
         + this.getCustomerId()
         + ", customerName="
         + this.getCustomerName()
         + ", customerReferenceNo="
         + this.getCustomerReferenceNo()
         + ", dispatcher="
         + this.getDispatcher()
         + ", loadEnterBy="
         + this.getLoadEnterBy()
         + ", currency="
         + this.getCurrency()
         + ", flatRate="
         + this.getFlatRate()
         + ", extraPD="
         + this.getExtraPD()
         + ", fuelSurCharge="
         + this.getFuelSurCharge()
         + ", extraCharge="
         + this.getExtraCharge()
         + ", otherCharge="
         + this.getOtherCharge()
         + ", dudectionTotal="
         + this.getDudectionTotal()
         + ", reimbursementTotal="
         + this.getReimbursementTotal()
         + ", total="
         + this.getTotal()
         + ", dispatchBy="
         + this.getDispatchBy()
         + ", driverId="
         + this.getDriverId()
         + ", driverName="
         + this.getDriverName()
         + ", driverTruck="
         + this.getDriverTruck()
         + ", driverTrailer="
         + this.getDriverTrailer()
         + ", driverRate="
         + this.getDriverRate()
         + ", totalMiles="
         + this.getTotalMiles()
         + ", carrierId="
         + this.getCarrierId()
         + ", carrierName="
         + this.getCarrierName()
         + ", carrierTruck="
         + this.getCarrierTruck()
         + ", carrierTrailer="
         + this.getCarrierTrailer()
         + ", equipmentType="
         + this.getEquipmentType()
         + ", carrierRate="
         + this.getCarrierRate()
         + ", carrierOtherCharges="
         + this.getCarrierOtherCharges()
         + ", isDataSaveAsDraft="
         + this.getIsDataSaveAsDraft()
         + ", divR="
         + this.getDivR()
         + ")";
   }
}
