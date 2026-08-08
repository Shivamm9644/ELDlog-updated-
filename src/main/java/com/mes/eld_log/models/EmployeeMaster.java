package com.mes.eld_log.models;

import java.io.Serializable;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.core.mapping.Document;

@EntityScan
@Document(
   collection = "employee_master"
)
public class EmployeeMaster implements Serializable {
   private static final long serialVersionUID = 1L;
   private Integer employeeId;
   private String title;
   private String firstName;
   private String lastName;
   private String email;
   private String username;
   private String status;
   private String driverId;
   private String password;
   private long restartId;
   private long restBreakId;
   private String shortHaulException;
   private String unlimitedTrailers;
   private String unlimitedShippingDocs;
   private long companyId;
   private long languageId;
   private long clientId;
   private String startTime;
   private long cycleUsaId;
   private long cycleCanadaId;
   private long mainTerminalId;
   private long mobileNo;
   private String cdlNo;
   private long cdlCountryId;
   private long cdlStateId;
   private String cdlExpiryDate;
   private long lCdlExpiryDate;
   private String pdfEmail;
   private double flatRate;
   private String exempt;
   private String personalUse;
   private String yardMoves;
   private String divR;
   private long cargoTypeId;
   private long truckNo;
   private String manageEquipement;
   private String transferLog;
   private String remarks;
   private String workingStatus;
   private String isFirstLogin;
   private Integer disclaimerRead;
   private long addedTimestamp;
   private long updatedTimestamp;

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof EmployeeMaster)) {
         return false;
      } else {
         EmployeeMaster other = (EmployeeMaster)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getRestartId() != other.getRestartId()) {
            return false;
         } else if (this.getRestBreakId() != other.getRestBreakId()) {
            return false;
         } else if (this.getCompanyId() != other.getCompanyId()) {
            return false;
         } else if (this.getLanguageId() != other.getLanguageId()) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else if (this.getCycleUsaId() != other.getCycleUsaId()) {
            return false;
         } else if (this.getCycleCanadaId() != other.getCycleCanadaId()) {
            return false;
         } else if (this.getMainTerminalId() != other.getMainTerminalId()) {
            return false;
         } else if (this.getMobileNo() != other.getMobileNo()) {
            return false;
         } else if (this.getCdlCountryId() != other.getCdlCountryId()) {
            return false;
         } else if (this.getCdlStateId() != other.getCdlStateId()) {
            return false;
         } else if (this.getLCdlExpiryDate() != other.getLCdlExpiryDate()) {
            return false;
         } else if (Double.compare(this.getFlatRate(), other.getFlatRate()) != 0) {
            return false;
         } else if (this.getCargoTypeId() != other.getCargoTypeId()) {
            return false;
         } else if (this.getTruckNo() != other.getTruckNo()) {
            return false;
         } else if (this.getAddedTimestamp() != other.getAddedTimestamp()) {
            return false;
         } else if (this.getUpdatedTimestamp() != other.getUpdatedTimestamp()) {
            return false;
         } else {
            Object this$employeeId = this.getEmployeeId();
            Object other$employeeId = other.getEmployeeId();
            if (this$employeeId == null ? other$employeeId == null : this$employeeId.equals(other$employeeId)) {
               Object this$disclaimerRead = this.getDisclaimerRead();
               Object other$disclaimerRead = other.getDisclaimerRead();
               if (this$disclaimerRead == null ? other$disclaimerRead == null : this$disclaimerRead.equals(other$disclaimerRead)) {
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
                                 Object this$status = this.getStatus();
                                 Object other$status = other.getStatus();
                                 if (this$status == null ? other$status == null : this$status.equals(other$status)) {
                                    Object this$driverId = this.getDriverId();
                                    Object other$driverId = other.getDriverId();
                                    if (this$driverId == null ? other$driverId == null : this$driverId.equals(other$driverId)) {
                                       Object this$password = this.getPassword();
                                       Object other$password = other.getPassword();
                                       if (this$password == null ? other$password == null : this$password.equals(other$password)) {
                                          Object this$shortHaulException = this.getShortHaulException();
                                          Object other$shortHaulException = other.getShortHaulException();
                                          if (this$shortHaulException == null
                                             ? other$shortHaulException == null
                                             : this$shortHaulException.equals(other$shortHaulException)) {
                                             Object this$unlimitedTrailers = this.getUnlimitedTrailers();
                                             Object other$unlimitedTrailers = other.getUnlimitedTrailers();
                                             if (this$unlimitedTrailers == null
                                                ? other$unlimitedTrailers == null
                                                : this$unlimitedTrailers.equals(other$unlimitedTrailers)) {
                                                Object this$unlimitedShippingDocs = this.getUnlimitedShippingDocs();
                                                Object other$unlimitedShippingDocs = other.getUnlimitedShippingDocs();
                                                if (this$unlimitedShippingDocs == null
                                                   ? other$unlimitedShippingDocs == null
                                                   : this$unlimitedShippingDocs.equals(other$unlimitedShippingDocs)) {
                                                   Object this$startTime = this.getStartTime();
                                                   Object other$startTime = other.getStartTime();
                                                   if (this$startTime == null ? other$startTime == null : this$startTime.equals(other$startTime)) {
                                                      Object this$cdlNo = this.getCdlNo();
                                                      Object other$cdlNo = other.getCdlNo();
                                                      if (this$cdlNo == null ? other$cdlNo == null : this$cdlNo.equals(other$cdlNo)) {
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
                                                                     if (this$yardMoves == null
                                                                        ? other$yardMoves == null
                                                                        : this$yardMoves.equals(other$yardMoves)) {
                                                                        Object this$divR = this.getDivR();
                                                                        Object other$divR = other.getDivR();
                                                                        if (this$divR == null ? other$divR == null : this$divR.equals(other$divR)) {
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
                                                                                 if (this$remarks == null
                                                                                    ? other$remarks == null
                                                                                    : this$remarks.equals(other$remarks)) {
                                                                                    Object this$workingStatus = this.getWorkingStatus();
                                                                                    Object other$workingStatus = other.getWorkingStatus();
                                                                                    if (this$workingStatus == null
                                                                                       ? other$workingStatus == null
                                                                                       : this$workingStatus.equals(other$workingStatus)) {
                                                                                       Object this$isFirstLogin = this.getIsFirstLogin();
                                                                                       Object other$isFirstLogin = other.getIsFirstLogin();
                                                                                       return this$isFirstLogin == null
                                                                                          ? other$isFirstLogin == null
                                                                                          : this$isFirstLogin.equals(other$isFirstLogin);
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
      return other instanceof EmployeeMaster;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $restartId = this.getRestartId();
      result = result * 59 + (int)($restartId >>> 32 ^ $restartId);
      long $restBreakId = this.getRestBreakId();
      result = result * 59 + (int)($restBreakId >>> 32 ^ $restBreakId);
      long $companyId = this.getCompanyId();
      result = result * 59 + (int)($companyId >>> 32 ^ $companyId);
      long $languageId = this.getLanguageId();
      result = result * 59 + (int)($languageId >>> 32 ^ $languageId);
      long $clientId = this.getClientId();
      result = result * 59 + (int)($clientId >>> 32 ^ $clientId);
      long $cycleUsaId = this.getCycleUsaId();
      result = result * 59 + (int)($cycleUsaId >>> 32 ^ $cycleUsaId);
      long $cycleCanadaId = this.getCycleCanadaId();
      result = result * 59 + (int)($cycleCanadaId >>> 32 ^ $cycleCanadaId);
      long $mainTerminalId = this.getMainTerminalId();
      result = result * 59 + (int)($mainTerminalId >>> 32 ^ $mainTerminalId);
      long $mobileNo = this.getMobileNo();
      result = result * 59 + (int)($mobileNo >>> 32 ^ $mobileNo);
      long $cdlCountryId = this.getCdlCountryId();
      result = result * 59 + (int)($cdlCountryId >>> 32 ^ $cdlCountryId);
      long $cdlStateId = this.getCdlStateId();
      result = result * 59 + (int)($cdlStateId >>> 32 ^ $cdlStateId);
      long $lCdlExpiryDate = this.getLCdlExpiryDate();
      result = result * 59 + (int)($lCdlExpiryDate >>> 32 ^ $lCdlExpiryDate);
      long $flatRate = Double.doubleToLongBits(this.getFlatRate());
      result = result * 59 + (int)($flatRate >>> 32 ^ $flatRate);
      long $cargoTypeId = this.getCargoTypeId();
      result = result * 59 + (int)($cargoTypeId >>> 32 ^ $cargoTypeId);
      long $truckNo = this.getTruckNo();
      result = result * 59 + (int)($truckNo >>> 32 ^ $truckNo);
      long $addedTimestamp = this.getAddedTimestamp();
      result = result * 59 + (int)($addedTimestamp >>> 32 ^ $addedTimestamp);
      long $updatedTimestamp = this.getUpdatedTimestamp();
      result = result * 59 + (int)($updatedTimestamp >>> 32 ^ $updatedTimestamp);
      Object $employeeId = this.getEmployeeId();
      result = result * 59 + ($employeeId == null ? 43 : $employeeId.hashCode());
      Object $disclaimerRead = this.getDisclaimerRead();
      result = result * 59 + ($disclaimerRead == null ? 43 : $disclaimerRead.hashCode());
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
      Object $status = this.getStatus();
      result = result * 59 + ($status == null ? 43 : $status.hashCode());
      Object $driverId = this.getDriverId();
      result = result * 59 + ($driverId == null ? 43 : $driverId.hashCode());
      Object $password = this.getPassword();
      result = result * 59 + ($password == null ? 43 : $password.hashCode());
      Object $shortHaulException = this.getShortHaulException();
      result = result * 59 + ($shortHaulException == null ? 43 : $shortHaulException.hashCode());
      Object $unlimitedTrailers = this.getUnlimitedTrailers();
      result = result * 59 + ($unlimitedTrailers == null ? 43 : $unlimitedTrailers.hashCode());
      Object $unlimitedShippingDocs = this.getUnlimitedShippingDocs();
      result = result * 59 + ($unlimitedShippingDocs == null ? 43 : $unlimitedShippingDocs.hashCode());
      Object $startTime = this.getStartTime();
      result = result * 59 + ($startTime == null ? 43 : $startTime.hashCode());
      Object $cdlNo = this.getCdlNo();
      result = result * 59 + ($cdlNo == null ? 43 : $cdlNo.hashCode());
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
      Object $manageEquipement = this.getManageEquipement();
      result = result * 59 + ($manageEquipement == null ? 43 : $manageEquipement.hashCode());
      Object $transferLog = this.getTransferLog();
      result = result * 59 + ($transferLog == null ? 43 : $transferLog.hashCode());
      Object $remarks = this.getRemarks();
      result = result * 59 + ($remarks == null ? 43 : $remarks.hashCode());
      Object $workingStatus = this.getWorkingStatus();
      result = result * 59 + ($workingStatus == null ? 43 : $workingStatus.hashCode());
      Object $isFirstLogin = this.getIsFirstLogin();
      return result * 59 + ($isFirstLogin == null ? 43 : $isFirstLogin.hashCode());
   }

   @Override
   public String toString() {
      return "EmployeeMaster(employeeId="
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
         + ", status="
         + this.getStatus()
         + ", driverId="
         + this.getDriverId()
         + ", password="
         + this.getPassword()
         + ", restartId="
         + this.getRestartId()
         + ", restBreakId="
         + this.getRestBreakId()
         + ", shortHaulException="
         + this.getShortHaulException()
         + ", unlimitedTrailers="
         + this.getUnlimitedTrailers()
         + ", unlimitedShippingDocs="
         + this.getUnlimitedShippingDocs()
         + ", companyId="
         + this.getCompanyId()
         + ", languageId="
         + this.getLanguageId()
         + ", clientId="
         + this.getClientId()
         + ", startTime="
         + this.getStartTime()
         + ", cycleUsaId="
         + this.getCycleUsaId()
         + ", cycleCanadaId="
         + this.getCycleCanadaId()
         + ", mainTerminalId="
         + this.getMainTerminalId()
         + ", mobileNo="
         + this.getMobileNo()
         + ", cdlNo="
         + this.getCdlNo()
         + ", cdlCountryId="
         + this.getCdlCountryId()
         + ", cdlStateId="
         + this.getCdlStateId()
         + ", cdlExpiryDate="
         + this.getCdlExpiryDate()
         + ", lCdlExpiryDate="
         + this.getLCdlExpiryDate()
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
         + ", cargoTypeId="
         + this.getCargoTypeId()
         + ", truckNo="
         + this.getTruckNo()
         + ", manageEquipement="
         + this.getManageEquipement()
         + ", transferLog="
         + this.getTransferLog()
         + ", remarks="
         + this.getRemarks()
         + ", workingStatus="
         + this.getWorkingStatus()
         + ", isFirstLogin="
         + this.getIsFirstLogin()
         + ", disclaimerRead="
         + this.getDisclaimerRead()
         + ", addedTimestamp="
         + this.getAddedTimestamp()
         + ", updatedTimestamp="
         + this.getUpdatedTimestamp()
         + ")";
   }

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

   public String getStatus() {
      return this.status;
   }

   public String getDriverId() {
      return this.driverId;
   }

   public String getPassword() {
      return this.password;
   }

   public long getRestartId() {
      return this.restartId;
   }

   public long getRestBreakId() {
      return this.restBreakId;
   }

   public String getShortHaulException() {
      return this.shortHaulException;
   }

   public String getUnlimitedTrailers() {
      return this.unlimitedTrailers;
   }

   public String getUnlimitedShippingDocs() {
      return this.unlimitedShippingDocs;
   }

   public long getCompanyId() {
      return this.companyId;
   }

   public long getLanguageId() {
      return this.languageId;
   }

   public long getClientId() {
      return this.clientId;
   }

   public String getStartTime() {
      return this.startTime;
   }

   public long getCycleUsaId() {
      return this.cycleUsaId;
   }

   public long getCycleCanadaId() {
      return this.cycleCanadaId;
   }

   public long getMainTerminalId() {
      return this.mainTerminalId;
   }

   public long getMobileNo() {
      return this.mobileNo;
   }

   public String getCdlNo() {
      return this.cdlNo;
   }

   public long getCdlCountryId() {
      return this.cdlCountryId;
   }

   public long getCdlStateId() {
      return this.cdlStateId;
   }

   public String getCdlExpiryDate() {
      return this.cdlExpiryDate;
   }

   public long getLCdlExpiryDate() {
      return this.lCdlExpiryDate;
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

   public long getCargoTypeId() {
      return this.cargoTypeId;
   }

   public long getTruckNo() {
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

   public String getWorkingStatus() {
      return this.workingStatus;
   }

   public String getIsFirstLogin() {
      return this.isFirstLogin;
   }

   public Integer getDisclaimerRead() {
      return this.disclaimerRead;
   }

   public long getAddedTimestamp() {
      return this.addedTimestamp;
   }

   public long getUpdatedTimestamp() {
      return this.updatedTimestamp;
   }

   public void setEmployeeId(final Integer employeeId) {
      this.employeeId = employeeId;
   }

   public void setTitle(final String title) {
      this.title = title;
   }

   public void setFirstName(final String firstName) {
      this.firstName = firstName;
   }

   public void setLastName(final String lastName) {
      this.lastName = lastName;
   }

   public void setEmail(final String email) {
      this.email = email;
   }

   public void setUsername(final String username) {
      this.username = username;
   }

   public void setStatus(final String status) {
      this.status = status;
   }

   public void setDriverId(final String driverId) {
      this.driverId = driverId;
   }

   public void setPassword(final String password) {
      this.password = password;
   }

   public void setRestartId(final long restartId) {
      this.restartId = restartId;
   }

   public void setRestBreakId(final long restBreakId) {
      this.restBreakId = restBreakId;
   }

   public void setShortHaulException(final String shortHaulException) {
      this.shortHaulException = shortHaulException;
   }

   public void setUnlimitedTrailers(final String unlimitedTrailers) {
      this.unlimitedTrailers = unlimitedTrailers;
   }

   public void setUnlimitedShippingDocs(final String unlimitedShippingDocs) {
      this.unlimitedShippingDocs = unlimitedShippingDocs;
   }

   public void setCompanyId(final long companyId) {
      this.companyId = companyId;
   }

   public void setLanguageId(final long languageId) {
      this.languageId = languageId;
   }

   public void setClientId(final long clientId) {
      this.clientId = clientId;
   }

   public void setStartTime(final String startTime) {
      this.startTime = startTime;
   }

   public void setCycleUsaId(final long cycleUsaId) {
      this.cycleUsaId = cycleUsaId;
   }

   public void setCycleCanadaId(final long cycleCanadaId) {
      this.cycleCanadaId = cycleCanadaId;
   }

   public void setMainTerminalId(final long mainTerminalId) {
      this.mainTerminalId = mainTerminalId;
   }

   public void setMobileNo(final long mobileNo) {
      this.mobileNo = mobileNo;
   }

   public void setCdlNo(final String cdlNo) {
      this.cdlNo = cdlNo;
   }

   public void setCdlCountryId(final long cdlCountryId) {
      this.cdlCountryId = cdlCountryId;
   }

   public void setCdlStateId(final long cdlStateId) {
      this.cdlStateId = cdlStateId;
   }

   public void setCdlExpiryDate(final String cdlExpiryDate) {
      this.cdlExpiryDate = cdlExpiryDate;
   }

   public void setLCdlExpiryDate(final long lCdlExpiryDate) {
      this.lCdlExpiryDate = lCdlExpiryDate;
   }

   public void setPdfEmail(final String pdfEmail) {
      this.pdfEmail = pdfEmail;
   }

   public void setFlatRate(final double flatRate) {
      this.flatRate = flatRate;
   }

   public void setExempt(final String exempt) {
      this.exempt = exempt;
   }

   public void setPersonalUse(final String personalUse) {
      this.personalUse = personalUse;
   }

   public void setYardMoves(final String yardMoves) {
      this.yardMoves = yardMoves;
   }

   public void setDivR(final String divR) {
      this.divR = divR;
   }

   public void setCargoTypeId(final long cargoTypeId) {
      this.cargoTypeId = cargoTypeId;
   }

   public void setTruckNo(final long truckNo) {
      this.truckNo = truckNo;
   }

   public void setManageEquipement(final String manageEquipement) {
      this.manageEquipement = manageEquipement;
   }

   public void setTransferLog(final String transferLog) {
      this.transferLog = transferLog;
   }

   public void setRemarks(final String remarks) {
      this.remarks = remarks;
   }

   public void setWorkingStatus(final String workingStatus) {
      this.workingStatus = workingStatus;
   }

   public void setIsFirstLogin(final String isFirstLogin) {
      this.isFirstLogin = isFirstLogin;
   }

   public void setDisclaimerRead(final Integer disclaimerRead) {
      this.disclaimerRead = disclaimerRead;
   }

   public void setAddedTimestamp(final long addedTimestamp) {
      this.addedTimestamp = addedTimestamp;
   }

   public void setUpdatedTimestamp(final long updatedTimestamp) {
      this.updatedTimestamp = updatedTimestamp;
   }
}
