package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AddEmployeeInfoDto {
   @JsonProperty("employeeId")
   private Integer employeeId;
   @JsonProperty("title")
   private String title;
   @JsonProperty("firstName")
   private String firstName;
   @JsonProperty("lastName")
   private String lastName;
   @JsonProperty("email")
   private String email;
   @JsonProperty("username")
   private String username;
   @JsonProperty("startTime")
   private String startTime;
   @JsonProperty("cycleUsa")
   private String cycleUsa;
   @JsonProperty("cycleCanada")
   private String cycleCanada;
   @JsonProperty("mainTerminal")
   private String mainTerminal;
   @JsonProperty("mobileNo")
   private long mobileNo;
   @JsonProperty("cdlNo")
   private String cdlNo;
   @JsonProperty("cdlCountry")
   private String cdlCountry;
   @JsonProperty("cdlState")
   private String cdlState;
   @JsonProperty("cdlExpiryDate")
   private String cdlExpiryDate;
   @JsonProperty("pdfEmail")
   private String pdfEmail;
   @JsonProperty("flatRate")
   private double flatRate;
   @JsonProperty("exempt")
   private String exempt;
   @JsonProperty("personalUse")
   private String personalUse;
   @JsonProperty("yardMoves")
   private String yardMoves;
   @JsonProperty("divR")
   private String divR;
   @JsonProperty("cargoType")
   private String cargoType;
   @JsonProperty("truckNo")
   private String truckNo;
   @JsonProperty("manageEquipement")
   private String manageEquipement;
   @JsonProperty("transferLog")
   private String transferLog;
   @JsonProperty("remarks")
   private String remarks;

   public Integer getEmployeeId() {
      return this.employeeId;
   }

   public String getTitle() {
      return this.title;
   }

   public String getFirstName() {
      return this.firstName;
   }

   public String getLastName() {
      return this.lastName;
   }

   public String getEmail() {
      return this.email;
   }

   public String getUsername() {
      return this.username;
   }

   public String getStartTime() {
      return this.startTime;
   }

   public String getCycleUsa() {
      return this.cycleUsa;
   }

   public String getCycleCanada() {
      return this.cycleCanada;
   }

   public String getMainTerminal() {
      return this.mainTerminal;
   }

   public long getMobileNo() {
      return this.mobileNo;
   }

   public String getCdlNo() {
      return this.cdlNo;
   }

   public String getCdlCountry() {
      return this.cdlCountry;
   }

   public String getCdlState() {
      return this.cdlState;
   }

   public String getCdlExpiryDate() {
      return this.cdlExpiryDate;
   }

   public String getPdfEmail() {
      return this.pdfEmail;
   }

   public double getFlatRate() {
      return this.flatRate;
   }

   public String getExempt() {
      return this.exempt;
   }

   public String getPersonalUse() {
      return this.personalUse;
   }

   public String getYardMoves() {
      return this.yardMoves;
   }

   public String getDivR() {
      return this.divR;
   }

   public String getCargoType() {
      return this.cargoType;
   }

   public String getTruckNo() {
      return this.truckNo;
   }

   public String getManageEquipement() {
      return this.manageEquipement;
   }

   public String getTransferLog() {
      return this.transferLog;
   }

   public String getRemarks() {
      return this.remarks;
   }

   @JsonProperty("employeeId")
   public void setEmployeeId(final Integer employeeId) {
      this.employeeId = employeeId;
   }

   @JsonProperty("title")
   public void setTitle(final String title) {
      this.title = title;
   }

   @JsonProperty("firstName")
   public void setFirstName(final String firstName) {
      this.firstName = firstName;
   }

   @JsonProperty("lastName")
   public void setLastName(final String lastName) {
      this.lastName = lastName;
   }

   @JsonProperty("email")
   public void setEmail(final String email) {
      this.email = email;
   }

   @JsonProperty("username")
   public void setUsername(final String username) {
      this.username = username;
   }

   @JsonProperty("startTime")
   public void setStartTime(final String startTime) {
      this.startTime = startTime;
   }

   @JsonProperty("cycleUsa")
   public void setCycleUsa(final String cycleUsa) {
      this.cycleUsa = cycleUsa;
   }

   @JsonProperty("cycleCanada")
   public void setCycleCanada(final String cycleCanada) {
      this.cycleCanada = cycleCanada;
   }

   @JsonProperty("mainTerminal")
   public void setMainTerminal(final String mainTerminal) {
      this.mainTerminal = mainTerminal;
   }

   @JsonProperty("mobileNo")
   public void setMobileNo(final long mobileNo) {
      this.mobileNo = mobileNo;
   }

   @JsonProperty("cdlNo")
   public void setCdlNo(final String cdlNo) {
      this.cdlNo = cdlNo;
   }

   @JsonProperty("cdlCountry")
   public void setCdlCountry(final String cdlCountry) {
      this.cdlCountry = cdlCountry;
   }

   @JsonProperty("cdlState")
   public void setCdlState(final String cdlState) {
      this.cdlState = cdlState;
   }

   @JsonProperty("cdlExpiryDate")
   public void setCdlExpiryDate(final String cdlExpiryDate) {
      this.cdlExpiryDate = cdlExpiryDate;
   }

   @JsonProperty("pdfEmail")
   public void setPdfEmail(final String pdfEmail) {
      this.pdfEmail = pdfEmail;
   }

   @JsonProperty("flatRate")
   public void setFlatRate(final double flatRate) {
      this.flatRate = flatRate;
   }

   @JsonProperty("exempt")
   public void setExempt(final String exempt) {
      this.exempt = exempt;
   }

   @JsonProperty("personalUse")
   public void setPersonalUse(final String personalUse) {
      this.personalUse = personalUse;
   }

   @JsonProperty("yardMoves")
   public void setYardMoves(final String yardMoves) {
      this.yardMoves = yardMoves;
   }

   @JsonProperty("divR")
   public void setDivR(final String divR) {
      this.divR = divR;
   }

   @JsonProperty("cargoType")
   public void setCargoType(final String cargoType) {
      this.cargoType = cargoType;
   }

   @JsonProperty("truckNo")
   public void setTruckNo(final String truckNo) {
      this.truckNo = truckNo;
   }

   @JsonProperty("manageEquipement")
   public void setManageEquipement(final String manageEquipement) {
      this.manageEquipement = manageEquipement;
   }

   @JsonProperty("transferLog")
   public void setTransferLog(final String transferLog) {
      this.transferLog = transferLog;
   }

   @JsonProperty("remarks")
   public void setRemarks(final String remarks) {
      this.remarks = remarks;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof AddEmployeeInfoDto)) {
         return false;
      } else {
         AddEmployeeInfoDto other = (AddEmployeeInfoDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getMobileNo() != other.getMobileNo()) {
            return false;
         } else if (Double.compare(this.getFlatRate(), other.getFlatRate()) != 0) {
            return false;
         } else {
            Object this$employeeId = this.getEmployeeId();
            Object other$employeeId = other.getEmployeeId();
            if (this$employeeId == null ? other$employeeId == null : this$employeeId.equals(other$employeeId)) {
               Object this$title = this.getTitle();
               Object other$title = other.getTitle();
               if (this$title == null ? other$title == null : this$title.equals(other$title)) {
                  Object this$firstName = this.getFirstName();
                  Object other$firstName = other.getFirstName();
                  if (this$firstName == null ? other$firstName == null : this$firstName.equals(other$firstName)) {
                     Object this$lastName = this.getLastName();
                     Object other$lastName = other.getLastName();
                     if (this$lastName == null ? other$lastName == null : this$lastName.equals(other$lastName)) {
                        Object this$email = this.getEmail();
                        Object other$email = other.getEmail();
                        if (this$email == null ? other$email == null : this$email.equals(other$email)) {
                           Object this$username = this.getUsername();
                           Object other$username = other.getUsername();
                           if (this$username == null ? other$username == null : this$username.equals(other$username)) {
                              Object this$startTime = this.getStartTime();
                              Object other$startTime = other.getStartTime();
                              if (this$startTime == null ? other$startTime == null : this$startTime.equals(other$startTime)) {
                                 Object this$cycleUsa = this.getCycleUsa();
                                 Object other$cycleUsa = other.getCycleUsa();
                                 if (this$cycleUsa == null ? other$cycleUsa == null : this$cycleUsa.equals(other$cycleUsa)) {
                                    Object this$cycleCanada = this.getCycleCanada();
                                    Object other$cycleCanada = other.getCycleCanada();
                                    if (this$cycleCanada == null ? other$cycleCanada == null : this$cycleCanada.equals(other$cycleCanada)) {
                                       Object this$mainTerminal = this.getMainTerminal();
                                       Object other$mainTerminal = other.getMainTerminal();
                                       if (this$mainTerminal == null ? other$mainTerminal == null : this$mainTerminal.equals(other$mainTerminal)) {
                                          Object this$cdlNo = this.getCdlNo();
                                          Object other$cdlNo = other.getCdlNo();
                                          if (this$cdlNo == null ? other$cdlNo == null : this$cdlNo.equals(other$cdlNo)) {
                                             Object this$cdlCountry = this.getCdlCountry();
                                             Object other$cdlCountry = other.getCdlCountry();
                                             if (this$cdlCountry == null ? other$cdlCountry == null : this$cdlCountry.equals(other$cdlCountry)) {
                                                Object this$cdlState = this.getCdlState();
                                                Object other$cdlState = other.getCdlState();
                                                if (this$cdlState == null ? other$cdlState == null : this$cdlState.equals(other$cdlState)) {
                                                   Object this$cdlExpiryDate = this.getCdlExpiryDate();
                                                   Object other$cdlExpiryDate = other.getCdlExpiryDate();
                                                   if (this$cdlExpiryDate == null
                                                      ? other$cdlExpiryDate == null
                                                      : this$cdlExpiryDate.equals(other$cdlExpiryDate)) {
                                                      Object this$pdfEmail = this.getPdfEmail();
                                                      Object other$pdfEmail = other.getPdfEmail();
                                                      if (this$pdfEmail == null ? other$pdfEmail == null : this$pdfEmail.equals(other$pdfEmail)) {
                                                         Object this$exempt = this.getExempt();
                                                         Object other$exempt = other.getExempt();
                                                         if (this$exempt == null ? other$exempt == null : this$exempt.equals(other$exempt)) {
                                                            Object this$personalUse = this.getPersonalUse();
                                                            Object other$personalUse = other.getPersonalUse();
                                                            if (this$personalUse == null
                                                               ? other$personalUse == null
                                                               : this$personalUse.equals(other$personalUse)) {
                                                               Object this$yardMoves = this.getYardMoves();
                                                               Object other$yardMoves = other.getYardMoves();
                                                               if (this$yardMoves == null ? other$yardMoves == null : this$yardMoves.equals(other$yardMoves)) {
                                                                  Object this$divR = this.getDivR();
                                                                  Object other$divR = other.getDivR();
                                                                  if (this$divR == null ? other$divR == null : this$divR.equals(other$divR)) {
                                                                     Object this$cargoType = this.getCargoType();
                                                                     Object other$cargoType = other.getCargoType();
                                                                     if (this$cargoType == null
                                                                        ? other$cargoType == null
                                                                        : this$cargoType.equals(other$cargoType)) {
                                                                        Object this$truckNo = this.getTruckNo();
                                                                        Object other$truckNo = other.getTruckNo();
                                                                        if (this$truckNo == null ? other$truckNo == null : this$truckNo.equals(other$truckNo)) {
                                                                           Object this$manageEquipement = this.getManageEquipement();
                                                                           Object other$manageEquipement = other.getManageEquipement();
                                                                           if (this$manageEquipement == null
                                                                              ? other$manageEquipement == null
                                                                              : this$manageEquipement.equals(other$manageEquipement)) {
                                                                              Object this$transferLog = this.getTransferLog();
                                                                              Object other$transferLog = other.getTransferLog();
                                                                              if (this$transferLog == null
                                                                                 ? other$transferLog == null
                                                                                 : this$transferLog.equals(other$transferLog)) {
                                                                                 Object this$remarks = this.getRemarks();
                                                                                 Object other$remarks = other.getRemarks();
                                                                                 return this$remarks == null
                                                                                    ? other$remarks == null
                                                                                    : this$remarks.equals(other$remarks);
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
      return other instanceof AddEmployeeInfoDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $mobileNo = this.getMobileNo();
      result = result * 59 + (int)($mobileNo >>> 32 ^ $mobileNo);
      long $flatRate = Double.doubleToLongBits(this.getFlatRate());
      result = result * 59 + (int)($flatRate >>> 32 ^ $flatRate);
      Object $employeeId = this.getEmployeeId();
      result = result * 59 + ($employeeId == null ? 43 : $employeeId.hashCode());
      Object $title = this.getTitle();
      result = result * 59 + ($title == null ? 43 : $title.hashCode());
      Object $firstName = this.getFirstName();
      result = result * 59 + ($firstName == null ? 43 : $firstName.hashCode());
      Object $lastName = this.getLastName();
      result = result * 59 + ($lastName == null ? 43 : $lastName.hashCode());
      Object $email = this.getEmail();
      result = result * 59 + ($email == null ? 43 : $email.hashCode());
      Object $username = this.getUsername();
      result = result * 59 + ($username == null ? 43 : $username.hashCode());
      Object $startTime = this.getStartTime();
      result = result * 59 + ($startTime == null ? 43 : $startTime.hashCode());
      Object $cycleUsa = this.getCycleUsa();
      result = result * 59 + ($cycleUsa == null ? 43 : $cycleUsa.hashCode());
      Object $cycleCanada = this.getCycleCanada();
      result = result * 59 + ($cycleCanada == null ? 43 : $cycleCanada.hashCode());
      Object $mainTerminal = this.getMainTerminal();
      result = result * 59 + ($mainTerminal == null ? 43 : $mainTerminal.hashCode());
      Object $cdlNo = this.getCdlNo();
      result = result * 59 + ($cdlNo == null ? 43 : $cdlNo.hashCode());
      Object $cdlCountry = this.getCdlCountry();
      result = result * 59 + ($cdlCountry == null ? 43 : $cdlCountry.hashCode());
      Object $cdlState = this.getCdlState();
      result = result * 59 + ($cdlState == null ? 43 : $cdlState.hashCode());
      Object $cdlExpiryDate = this.getCdlExpiryDate();
      result = result * 59 + ($cdlExpiryDate == null ? 43 : $cdlExpiryDate.hashCode());
      Object $pdfEmail = this.getPdfEmail();
      result = result * 59 + ($pdfEmail == null ? 43 : $pdfEmail.hashCode());
      Object $exempt = this.getExempt();
      result = result * 59 + ($exempt == null ? 43 : $exempt.hashCode());
      Object $personalUse = this.getPersonalUse();
      result = result * 59 + ($personalUse == null ? 43 : $personalUse.hashCode());
      Object $yardMoves = this.getYardMoves();
      result = result * 59 + ($yardMoves == null ? 43 : $yardMoves.hashCode());
      Object $divR = this.getDivR();
      result = result * 59 + ($divR == null ? 43 : $divR.hashCode());
      Object $cargoType = this.getCargoType();
      result = result * 59 + ($cargoType == null ? 43 : $cargoType.hashCode());
      Object $truckNo = this.getTruckNo();
      result = result * 59 + ($truckNo == null ? 43 : $truckNo.hashCode());
      Object $manageEquipement = this.getManageEquipement();
      result = result * 59 + ($manageEquipement == null ? 43 : $manageEquipement.hashCode());
      Object $transferLog = this.getTransferLog();
      result = result * 59 + ($transferLog == null ? 43 : $transferLog.hashCode());
      Object $remarks = this.getRemarks();
      return result * 59 + ($remarks == null ? 43 : $remarks.hashCode());
   }

   @Override
   public String toString() {
      return "AddEmployeeInfoDto(employeeId="
         + this.getEmployeeId()
         + ", title="
         + this.getTitle()
         + ", firstName="
         + this.getFirstName()
         + ", lastName="
         + this.getLastName()
         + ", email="
         + this.getEmail()
         + ", username="
         + this.getUsername()
         + ", startTime="
         + this.getStartTime()
         + ", cycleUsa="
         + this.getCycleUsa()
         + ", cycleCanada="
         + this.getCycleCanada()
         + ", mainTerminal="
         + this.getMainTerminal()
         + ", mobileNo="
         + this.getMobileNo()
         + ", cdlNo="
         + this.getCdlNo()
         + ", cdlCountry="
         + this.getCdlCountry()
         + ", cdlState="
         + this.getCdlState()
         + ", cdlExpiryDate="
         + this.getCdlExpiryDate()
         + ", pdfEmail="
         + this.getPdfEmail()
         + ", flatRate="
         + this.getFlatRate()
         + ", exempt="
         + this.getExempt()
         + ", personalUse="
         + this.getPersonalUse()
         + ", yardMoves="
         + this.getYardMoves()
         + ", divR="
         + this.getDivR()
         + ", cargoType="
         + this.getCargoType()
         + ", truckNo="
         + this.getTruckNo()
         + ", manageEquipement="
         + this.getManageEquipement()
         + ", transferLog="
         + this.getTransferLog()
         + ", remarks="
         + this.getRemarks()
         + ")";
   }
}
