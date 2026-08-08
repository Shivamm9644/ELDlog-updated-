package com.mes.eld_log.models;

import java.io.Serializable;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.core.mapping.Document;

@EntityScan
@Document(
   collection = "dispatch_details"
)
public class DispatchDetails implements Serializable {
   private static final long serialVersionUID = 1L;
   private long clientId;
   private String clientName;
   private String load;
   private long customerId;
   private String customerReferenceNo;
   private String dispatcher;
   private String loadEnterBy;
   private String currency;
   private double flatRate;
   private double extraPD;
   private double fuelSurCharge;
   private double extraCharge;
   private double otherCharge;
   private double dudectionTotal;
   private double reimbursementTotal;
   private double total;
   private String dispatchBy;
   private long driverId;
   private long coDriverId;
   private long driverTruckId;
   private String driverTruck;
   private long driverTrailerId;
   private String driverTrailer;
   private double driverRate;
   private double totalMiles;
   private long carrierId;
   private String carrierTruck;
   private String carrierTrailer;
   private long equipmentType;
   private double carrierRate;
   private double carrierOtherCharges;
   private String isDataSaveAsDraft;
   private long addedTimestamp;
   private long updatedTimestamp;

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof DispatchDetails)) {
         return false;
      } else {
         DispatchDetails other = (DispatchDetails)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
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
         } else if (this.getCoDriverId() != other.getCoDriverId()) {
            return false;
         } else if (this.getDriverTruckId() != other.getDriverTruckId()) {
            return false;
         } else if (this.getDriverTrailerId() != other.getDriverTrailerId()) {
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
         } else if (this.getAddedTimestamp() != other.getAddedTimestamp()) {
            return false;
         } else if (this.getUpdatedTimestamp() != other.getUpdatedTimestamp()) {
            return false;
         } else {
            Object this$clientName = this.getClientName();
            Object other$clientName = other.getClientName();
            if (this$clientName == null ? other$clientName == null : this$clientName.equals(other$clientName)) {
               Object this$load = this.getLoad();
               Object other$load = other.getLoad();
               if (this$load == null ? other$load == null : this$load.equals(other$load)) {
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
                                 Object this$driverTruck = this.getDriverTruck();
                                 Object other$driverTruck = other.getDriverTruck();
                                 if (this$driverTruck == null ? other$driverTruck == null : this$driverTruck.equals(other$driverTruck)) {
                                    Object this$driverTrailer = this.getDriverTrailer();
                                    Object other$driverTrailer = other.getDriverTrailer();
                                    if (this$driverTrailer == null ? other$driverTrailer == null : this$driverTrailer.equals(other$driverTrailer)) {
                                       Object this$carrierTruck = this.getCarrierTruck();
                                       Object other$carrierTruck = other.getCarrierTruck();
                                       if (this$carrierTruck == null ? other$carrierTruck == null : this$carrierTruck.equals(other$carrierTruck)) {
                                          Object this$carrierTrailer = this.getCarrierTrailer();
                                          Object other$carrierTrailer = other.getCarrierTrailer();
                                          if (this$carrierTrailer == null ? other$carrierTrailer == null : this$carrierTrailer.equals(other$carrierTrailer)) {
                                             Object this$isDataSaveAsDraft = this.getIsDataSaveAsDraft();
                                             Object other$isDataSaveAsDraft = other.getIsDataSaveAsDraft();
                                             return this$isDataSaveAsDraft == null
                                                ? other$isDataSaveAsDraft == null
                                                : this$isDataSaveAsDraft.equals(other$isDataSaveAsDraft);
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
      return other instanceof DispatchDetails;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $clientId = this.getClientId();
      result = result * 59 + (int)($clientId >>> 32 ^ $clientId);
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
      long $coDriverId = this.getCoDriverId();
      result = result * 59 + (int)($coDriverId >>> 32 ^ $coDriverId);
      long $driverTruckId = this.getDriverTruckId();
      result = result * 59 + (int)($driverTruckId >>> 32 ^ $driverTruckId);
      long $driverTrailerId = this.getDriverTrailerId();
      result = result * 59 + (int)($driverTrailerId >>> 32 ^ $driverTrailerId);
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
      long $addedTimestamp = this.getAddedTimestamp();
      result = result * 59 + (int)($addedTimestamp >>> 32 ^ $addedTimestamp);
      long $updatedTimestamp = this.getUpdatedTimestamp();
      result = result * 59 + (int)($updatedTimestamp >>> 32 ^ $updatedTimestamp);
      Object $clientName = this.getClientName();
      result = result * 59 + ($clientName == null ? 43 : $clientName.hashCode());
      Object $load = this.getLoad();
      result = result * 59 + ($load == null ? 43 : $load.hashCode());
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
      Object $driverTruck = this.getDriverTruck();
      result = result * 59 + ($driverTruck == null ? 43 : $driverTruck.hashCode());
      Object $driverTrailer = this.getDriverTrailer();
      result = result * 59 + ($driverTrailer == null ? 43 : $driverTrailer.hashCode());
      Object $carrierTruck = this.getCarrierTruck();
      result = result * 59 + ($carrierTruck == null ? 43 : $carrierTruck.hashCode());
      Object $carrierTrailer = this.getCarrierTrailer();
      result = result * 59 + ($carrierTrailer == null ? 43 : $carrierTrailer.hashCode());
      Object $isDataSaveAsDraft = this.getIsDataSaveAsDraft();
      return result * 59 + ($isDataSaveAsDraft == null ? 43 : $isDataSaveAsDraft.hashCode());
   }

   @Override
   public String toString() {
      return "DispatchDetails(clientId="
         + this.getClientId()
         + ", clientName="
         + this.getClientName()
         + ", load="
         + this.getLoad()
         + ", customerId="
         + this.getCustomerId()
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
         + ", coDriverId="
         + this.getCoDriverId()
         + ", driverTruckId="
         + this.getDriverTruckId()
         + ", driverTruck="
         + this.getDriverTruck()
         + ", driverTrailerId="
         + this.getDriverTrailerId()
         + ", driverTrailer="
         + this.getDriverTrailer()
         + ", driverRate="
         + this.getDriverRate()
         + ", totalMiles="
         + this.getTotalMiles()
         + ", carrierId="
         + this.getCarrierId()
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
         + ", addedTimestamp="
         + this.getAddedTimestamp()
         + ", updatedTimestamp="
         + this.getUpdatedTimestamp()
         + ")";
   }

   public long getClientId() {
      return this.clientId;
   }

   public String getClientName() {
      return this.clientName;
   }

   public String getLoad() {
      return this.load;
   }

   public long getCustomerId() {
      return this.customerId;
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

   public long getCoDriverId() {
      return this.coDriverId;
   }

   public long getDriverTruckId() {
      return this.driverTruckId;
   }

   public String getDriverTruck() {
      return this.driverTruck;
   }

   public long getDriverTrailerId() {
      return this.driverTrailerId;
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

   public long getAddedTimestamp() {
      return this.addedTimestamp;
   }

   public long getUpdatedTimestamp() {
      return this.updatedTimestamp;
   }

   public void setClientId(final long clientId) {
      this.clientId = clientId;
   }

   public void setClientName(final String clientName) {
      this.clientName = clientName;
   }

   public void setLoad(final String load) {
      this.load = load;
   }

   public void setCustomerId(final long customerId) {
      this.customerId = customerId;
   }

   public void setCustomerReferenceNo(final String customerReferenceNo) {
      this.customerReferenceNo = customerReferenceNo;
   }

   public void setDispatcher(final String dispatcher) {
      this.dispatcher = dispatcher;
   }

   public void setLoadEnterBy(final String loadEnterBy) {
      this.loadEnterBy = loadEnterBy;
   }

   public void setCurrency(final String currency) {
      this.currency = currency;
   }

   public void setFlatRate(final double flatRate) {
      this.flatRate = flatRate;
   }

   public void setExtraPD(final double extraPD) {
      this.extraPD = extraPD;
   }

   public void setFuelSurCharge(final double fuelSurCharge) {
      this.fuelSurCharge = fuelSurCharge;
   }

   public void setExtraCharge(final double extraCharge) {
      this.extraCharge = extraCharge;
   }

   public void setOtherCharge(final double otherCharge) {
      this.otherCharge = otherCharge;
   }

   public void setDudectionTotal(final double dudectionTotal) {
      this.dudectionTotal = dudectionTotal;
   }

   public void setReimbursementTotal(final double reimbursementTotal) {
      this.reimbursementTotal = reimbursementTotal;
   }

   public void setTotal(final double total) {
      this.total = total;
   }

   public void setDispatchBy(final String dispatchBy) {
      this.dispatchBy = dispatchBy;
   }

   public void setDriverId(final long driverId) {
      this.driverId = driverId;
   }

   public void setCoDriverId(final long coDriverId) {
      this.coDriverId = coDriverId;
   }

   public void setDriverTruckId(final long driverTruckId) {
      this.driverTruckId = driverTruckId;
   }

   public void setDriverTruck(final String driverTruck) {
      this.driverTruck = driverTruck;
   }

   public void setDriverTrailerId(final long driverTrailerId) {
      this.driverTrailerId = driverTrailerId;
   }

   public void setDriverTrailer(final String driverTrailer) {
      this.driverTrailer = driverTrailer;
   }

   public void setDriverRate(final double driverRate) {
      this.driverRate = driverRate;
   }

   public void setTotalMiles(final double totalMiles) {
      this.totalMiles = totalMiles;
   }

   public void setCarrierId(final long carrierId) {
      this.carrierId = carrierId;
   }

   public void setCarrierTruck(final String carrierTruck) {
      this.carrierTruck = carrierTruck;
   }

   public void setCarrierTrailer(final String carrierTrailer) {
      this.carrierTrailer = carrierTrailer;
   }

   public void setEquipmentType(final long equipmentType) {
      this.equipmentType = equipmentType;
   }

   public void setCarrierRate(final double carrierRate) {
      this.carrierRate = carrierRate;
   }

   public void setCarrierOtherCharges(final double carrierOtherCharges) {
      this.carrierOtherCharges = carrierOtherCharges;
   }

   public void setIsDataSaveAsDraft(final String isDataSaveAsDraft) {
      this.isDataSaveAsDraft = isDataSaveAsDraft;
   }

   public void setAddedTimestamp(final long addedTimestamp) {
      this.addedTimestamp = addedTimestamp;
   }

   public void setUpdatedTimestamp(final long updatedTimestamp) {
      this.updatedTimestamp = updatedTimestamp;
   }
}
