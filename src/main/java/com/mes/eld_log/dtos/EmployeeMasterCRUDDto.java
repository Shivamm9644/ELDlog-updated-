package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mes.eld_log.models.SplitLog;
import java.util.List;

public class EmployeeMasterCRUDDto {
   @JsonProperty("tokenNo")
   private String tokenNo;
   @JsonProperty("disclaimerRead")
   private long disclaimerRead;
   @JsonProperty("disclaimer")
   private String disclaimer;
   @JsonProperty("status")
   private String status;
   @JsonProperty("employeeId")
   private Integer employeeId;
   @JsonProperty("clientId")
   private long clientId;
   @JsonProperty("mainTerminalId")
   private long mainTerminalId;
   @JsonProperty("clientName")
   private String clientName;
   @JsonProperty("timezone")
   private String timezone;
   @JsonProperty("timezoneOffSet")
   private String timezoneOffSet;
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
   @JsonProperty("loginDateTime")
   private long loginDateTime;
   @JsonProperty("macAddress")
   private String macAddress;
   @JsonProperty("vehicleId")
   private long vehicleId;
   @JsonProperty("vehicleNo")
   private String vehicleNo;
   @JsonProperty("isFirstLogin")
   private String isFirstLogin;
   @JsonProperty("onDutyTime")
   private long onDutyTime;
   @JsonProperty("onDriveTime")
   private long onDriveTime;
   @JsonProperty("onSleepTime")
   private long onSleepTime;
   @JsonProperty("continueDriveTime")
   private long continueDriveTime;
   @JsonProperty("breakTime")
   private long breakTime;
   @JsonProperty("cycleRestartTime")
   private long cycleRestartTime;
   @JsonProperty("exempt")
   private String exempt;
   @JsonProperty("personalUse")
   private String personalUse;
   @JsonProperty("yardMoves")
   private String yardMoves;
   @JsonProperty("shortHaulException")
   private String shortHaulException;
   @JsonProperty("unlimitedTrailers")
   private String unlimitedTrailers;
   @JsonProperty("unlimitedShippingDocs")
   private String unlimitedShippingDocs;
   @JsonProperty("androidVersion")
   private String androidVersion;
   @JsonProperty("androidCode")
   private String androidCode;
   @JsonProperty("iosVersion")
   private String iosVersion;
   @JsonProperty("iosCode")
   private String iosCode;
   @JsonProperty("termsAndCondition")
   private String termsAndCondition;
   @JsonProperty("driverLog")
   private List<DriveringStatusViewDto> driverLog;
   @JsonProperty("driverDvirLog")
   private List<DVIRDataCRUDDto> driverDvirLog;
   @JsonProperty("driverCertifiedLog")
   private List<CertifiedLogViewDto> driverCertifiedLog;
   @JsonProperty("loginLogoutLog")
   private List<DriveringStatusLogViewDto> loginLogoutLog;
   @JsonProperty("splitLog")
   private List<SplitLog> splitLog;
   @JsonProperty("rules")
   private List<CycleTimeRulesViewDto> rules;

   public String getTokenNo() {
      return this.tokenNo;
   }

   public long getDisclaimerRead() {
      return this.disclaimerRead;
   }

   public String getDisclaimer() {
      return this.disclaimer;
   }

   public String getStatus() {
      return this.status;
   }

   public Integer getEmployeeId() {
      return this.employeeId;
   }

   public long getClientId() {
      return this.clientId;
   }

   public long getMainTerminalId() {
      return this.mainTerminalId;
   }

   public String getClientName() {
      return this.clientName;
   }

   public String getTimezone() {
      return this.timezone;
   }

   public String getTimezoneOffSet() {
      return this.timezoneOffSet;
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

   public long getLoginDateTime() {
      return this.loginDateTime;
   }

   public String getMacAddress() {
      return this.macAddress;
   }

   public long getVehicleId() {
      return this.vehicleId;
   }

   public String getVehicleNo() {
      return this.vehicleNo;
   }

   public String getIsFirstLogin() {
      return this.isFirstLogin;
   }

   public long getOnDutyTime() {
      return this.onDutyTime;
   }

   public long getOnDriveTime() {
      return this.onDriveTime;
   }

   public long getOnSleepTime() {
      return this.onSleepTime;
   }

   public long getContinueDriveTime() {
      return this.continueDriveTime;
   }

   public long getBreakTime() {
      return this.breakTime;
   }

   public long getCycleRestartTime() {
      return this.cycleRestartTime;
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

   public String getShortHaulException() {
      return this.shortHaulException;
   }

   public String getUnlimitedTrailers() {
      return this.unlimitedTrailers;
   }

   public String getUnlimitedShippingDocs() {
      return this.unlimitedShippingDocs;
   }

   public String getAndroidVersion() {
      return this.androidVersion;
   }

   public String getAndroidCode() {
      return this.androidCode;
   }

   public String getIosVersion() {
      return this.iosVersion;
   }

   public String getIosCode() {
      return this.iosCode;
   }

   public String getTermsAndCondition() {
      return this.termsAndCondition;
   }

   public List<DriveringStatusViewDto> getDriverLog() {
      return this.driverLog;
   }

   public List<DVIRDataCRUDDto> getDriverDvirLog() {
      return this.driverDvirLog;
   }

   public List<CertifiedLogViewDto> getDriverCertifiedLog() {
      return this.driverCertifiedLog;
   }

   public List<DriveringStatusLogViewDto> getLoginLogoutLog() {
      return this.loginLogoutLog;
   }

   public List<SplitLog> getSplitLog() {
      return this.splitLog;
   }

   public List<CycleTimeRulesViewDto> getRules() {
      return this.rules;
   }

   @JsonProperty("tokenNo")
   public void setTokenNo(final String tokenNo) {
      this.tokenNo = tokenNo;
   }

   @JsonProperty("disclaimerRead")
   public void setDisclaimerRead(final long disclaimerRead) {
      this.disclaimerRead = disclaimerRead;
   }

   @JsonProperty("disclaimer")
   public void setDisclaimer(final String disclaimer) {
      this.disclaimer = disclaimer;
   }

   @JsonProperty("status")
   public void setStatus(final String status) {
      this.status = status;
   }

   @JsonProperty("employeeId")
   public void setEmployeeId(final Integer employeeId) {
      this.employeeId = employeeId;
   }

   @JsonProperty("clientId")
   public void setClientId(final long clientId) {
      this.clientId = clientId;
   }

   @JsonProperty("mainTerminalId")
   public void setMainTerminalId(final long mainTerminalId) {
      this.mainTerminalId = mainTerminalId;
   }

   @JsonProperty("clientName")
   public void setClientName(final String clientName) {
      this.clientName = clientName;
   }

   @JsonProperty("timezone")
   public void setTimezone(final String timezone) {
      this.timezone = timezone;
   }

   @JsonProperty("timezoneOffSet")
   public void setTimezoneOffSet(final String timezoneOffSet) {
      this.timezoneOffSet = timezoneOffSet;
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

   @JsonProperty("loginDateTime")
   public void setLoginDateTime(final long loginDateTime) {
      this.loginDateTime = loginDateTime;
   }

   @JsonProperty("macAddress")
   public void setMacAddress(final String macAddress) {
      this.macAddress = macAddress;
   }

   @JsonProperty("vehicleId")
   public void setVehicleId(final long vehicleId) {
      this.vehicleId = vehicleId;
   }

   @JsonProperty("vehicleNo")
   public void setVehicleNo(final String vehicleNo) {
      this.vehicleNo = vehicleNo;
   }

   @JsonProperty("isFirstLogin")
   public void setIsFirstLogin(final String isFirstLogin) {
      this.isFirstLogin = isFirstLogin;
   }

   @JsonProperty("onDutyTime")
   public void setOnDutyTime(final long onDutyTime) {
      this.onDutyTime = onDutyTime;
   }

   @JsonProperty("onDriveTime")
   public void setOnDriveTime(final long onDriveTime) {
      this.onDriveTime = onDriveTime;
   }

   @JsonProperty("onSleepTime")
   public void setOnSleepTime(final long onSleepTime) {
      this.onSleepTime = onSleepTime;
   }

   @JsonProperty("continueDriveTime")
   public void setContinueDriveTime(final long continueDriveTime) {
      this.continueDriveTime = continueDriveTime;
   }

   @JsonProperty("breakTime")
   public void setBreakTime(final long breakTime) {
      this.breakTime = breakTime;
   }

   @JsonProperty("cycleRestartTime")
   public void setCycleRestartTime(final long cycleRestartTime) {
      this.cycleRestartTime = cycleRestartTime;
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

   @JsonProperty("shortHaulException")
   public void setShortHaulException(final String shortHaulException) {
      this.shortHaulException = shortHaulException;
   }

   @JsonProperty("unlimitedTrailers")
   public void setUnlimitedTrailers(final String unlimitedTrailers) {
      this.unlimitedTrailers = unlimitedTrailers;
   }

   @JsonProperty("unlimitedShippingDocs")
   public void setUnlimitedShippingDocs(final String unlimitedShippingDocs) {
      this.unlimitedShippingDocs = unlimitedShippingDocs;
   }

   @JsonProperty("androidVersion")
   public void setAndroidVersion(final String androidVersion) {
      this.androidVersion = androidVersion;
   }

   @JsonProperty("androidCode")
   public void setAndroidCode(final String androidCode) {
      this.androidCode = androidCode;
   }

   @JsonProperty("iosVersion")
   public void setIosVersion(final String iosVersion) {
      this.iosVersion = iosVersion;
   }

   @JsonProperty("iosCode")
   public void setIosCode(final String iosCode) {
      this.iosCode = iosCode;
   }

   @JsonProperty("termsAndCondition")
   public void setTermsAndCondition(final String termsAndCondition) {
      this.termsAndCondition = termsAndCondition;
   }

   @JsonProperty("driverLog")
   public void setDriverLog(final List<DriveringStatusViewDto> driverLog) {
      this.driverLog = driverLog;
   }

   @JsonProperty("driverDvirLog")
   public void setDriverDvirLog(final List<DVIRDataCRUDDto> driverDvirLog) {
      this.driverDvirLog = driverDvirLog;
   }

   @JsonProperty("driverCertifiedLog")
   public void setDriverCertifiedLog(final List<CertifiedLogViewDto> driverCertifiedLog) {
      this.driverCertifiedLog = driverCertifiedLog;
   }

   @JsonProperty("loginLogoutLog")
   public void setLoginLogoutLog(final List<DriveringStatusLogViewDto> loginLogoutLog) {
      this.loginLogoutLog = loginLogoutLog;
   }

   @JsonProperty("splitLog")
   public void setSplitLog(final List<SplitLog> splitLog) {
      this.splitLog = splitLog;
   }

   @JsonProperty("rules")
   public void setRules(final List<CycleTimeRulesViewDto> rules) {
      this.rules = rules;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof EmployeeMasterCRUDDto)) {
         return false;
      } else {
         EmployeeMasterCRUDDto other = (EmployeeMasterCRUDDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getDisclaimerRead() != other.getDisclaimerRead()) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else if (this.getMainTerminalId() != other.getMainTerminalId()) {
            return false;
         } else if (this.getLoginDateTime() != other.getLoginDateTime()) {
            return false;
         } else if (this.getVehicleId() != other.getVehicleId()) {
            return false;
         } else if (this.getOnDutyTime() != other.getOnDutyTime()) {
            return false;
         } else if (this.getOnDriveTime() != other.getOnDriveTime()) {
            return false;
         } else if (this.getOnSleepTime() != other.getOnSleepTime()) {
            return false;
         } else if (this.getContinueDriveTime() != other.getContinueDriveTime()) {
            return false;
         } else if (this.getBreakTime() != other.getBreakTime()) {
            return false;
         } else if (this.getCycleRestartTime() != other.getCycleRestartTime()) {
            return false;
         } else {
            Object this$employeeId = this.getEmployeeId();
            Object other$employeeId = other.getEmployeeId();
            if (this$employeeId == null ? other$employeeId == null : this$employeeId.equals(other$employeeId)) {
               Object this$tokenNo = this.getTokenNo();
               Object other$tokenNo = other.getTokenNo();
               if (this$tokenNo == null ? other$tokenNo == null : this$tokenNo.equals(other$tokenNo)) {
                  Object this$disclaimer = this.getDisclaimer();
                  Object other$disclaimer = other.getDisclaimer();
                  if (this$disclaimer == null ? other$disclaimer == null : this$disclaimer.equals(other$disclaimer)) {
                     Object this$status = this.getStatus();
                     Object other$status = other.getStatus();
                     if (this$status == null ? other$status == null : this$status.equals(other$status)) {
                        Object this$clientName = this.getClientName();
                        Object other$clientName = other.getClientName();
                        if (this$clientName == null ? other$clientName == null : this$clientName.equals(other$clientName)) {
                           Object this$timezone = this.getTimezone();
                           Object other$timezone = other.getTimezone();
                           if (this$timezone == null ? other$timezone == null : this$timezone.equals(other$timezone)) {
                              Object this$timezoneOffSet = this.getTimezoneOffSet();
                              Object other$timezoneOffSet = other.getTimezoneOffSet();
                              if (this$timezoneOffSet == null ? other$timezoneOffSet == null : this$timezoneOffSet.equals(other$timezoneOffSet)) {
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
                                                Object this$macAddress = this.getMacAddress();
                                                Object other$macAddress = other.getMacAddress();
                                                if (this$macAddress == null ? other$macAddress == null : this$macAddress.equals(other$macAddress)) {
                                                   Object this$vehicleNo = this.getVehicleNo();
                                                   Object other$vehicleNo = other.getVehicleNo();
                                                   if (this$vehicleNo == null ? other$vehicleNo == null : this$vehicleNo.equals(other$vehicleNo)) {
                                                      Object this$isFirstLogin = this.getIsFirstLogin();
                                                      Object other$isFirstLogin = other.getIsFirstLogin();
                                                      if (this$isFirstLogin == null
                                                         ? other$isFirstLogin == null
                                                         : this$isFirstLogin.equals(other$isFirstLogin)) {
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
                                                                           Object this$androidVersion = this.getAndroidVersion();
                                                                           Object other$androidVersion = other.getAndroidVersion();
                                                                           if (this$androidVersion == null
                                                                              ? other$androidVersion == null
                                                                              : this$androidVersion.equals(other$androidVersion)) {
                                                                              Object this$androidCode = this.getAndroidCode();
                                                                              Object other$androidCode = other.getAndroidCode();
                                                                              if (this$androidCode == null
                                                                                 ? other$androidCode == null
                                                                                 : this$androidCode.equals(other$androidCode)) {
                                                                                 Object this$iosVersion = this.getIosVersion();
                                                                                 Object other$iosVersion = other.getIosVersion();
                                                                                 if (this$iosVersion == null
                                                                                    ? other$iosVersion == null
                                                                                    : this$iosVersion.equals(other$iosVersion)) {
                                                                                    Object this$iosCode = this.getIosCode();
                                                                                    Object other$iosCode = other.getIosCode();
                                                                                    if (this$iosCode == null
                                                                                       ? other$iosCode == null
                                                                                       : this$iosCode.equals(other$iosCode)) {
                                                                                       Object this$termsAndCondition = this.getTermsAndCondition();
                                                                                       Object other$termsAndCondition = other.getTermsAndCondition();
                                                                                       if (this$termsAndCondition == null
                                                                                          ? other$termsAndCondition == null
                                                                                          : this$termsAndCondition.equals(other$termsAndCondition)) {
                                                                                          Object this$driverLog = this.getDriverLog();
                                                                                          Object other$driverLog = other.getDriverLog();
                                                                                          if (this$driverLog == null
                                                                                             ? other$driverLog == null
                                                                                             : this$driverLog.equals(other$driverLog)) {
                                                                                             Object this$driverDvirLog = this.getDriverDvirLog();
                                                                                             Object other$driverDvirLog = other.getDriverDvirLog();
                                                                                             if (this$driverDvirLog == null
                                                                                                ? other$driverDvirLog == null
                                                                                                : this$driverDvirLog.equals(other$driverDvirLog)) {
                                                                                                Object this$driverCertifiedLog = this.getDriverCertifiedLog();
                                                                                                Object other$driverCertifiedLog = other.getDriverCertifiedLog();
                                                                                                if (this$driverCertifiedLog == null
                                                                                                   ? other$driverCertifiedLog == null
                                                                                                   : this$driverCertifiedLog.equals(other$driverCertifiedLog)) {
                                                                                                   Object this$loginLogoutLog = this.getLoginLogoutLog();
                                                                                                   Object other$loginLogoutLog = other.getLoginLogoutLog();
                                                                                                   if (this$loginLogoutLog == null
                                                                                                      ? other$loginLogoutLog == null
                                                                                                      : this$loginLogoutLog.equals(other$loginLogoutLog)) {
                                                                                                      Object this$splitLog = this.getSplitLog();
                                                                                                      Object other$splitLog = other.getSplitLog();
                                                                                                      if (this$splitLog == null
                                                                                                         ? other$splitLog == null
                                                                                                         : this$splitLog.equals(other$splitLog)) {
                                                                                                         Object this$rules = this.getRules();
                                                                                                         Object other$rules = other.getRules();
                                                                                                         return this$rules == null
                                                                                                            ? other$rules == null
                                                                                                            : this$rules.equals(other$rules);
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
      return other instanceof EmployeeMasterCRUDDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $disclaimerRead = this.getDisclaimerRead();
      result = result * 59 + (int)($disclaimerRead >>> 32 ^ $disclaimerRead);
      long $clientId = this.getClientId();
      result = result * 59 + (int)($clientId >>> 32 ^ $clientId);
      long $mainTerminalId = this.getMainTerminalId();
      result = result * 59 + (int)($mainTerminalId >>> 32 ^ $mainTerminalId);
      long $loginDateTime = this.getLoginDateTime();
      result = result * 59 + (int)($loginDateTime >>> 32 ^ $loginDateTime);
      long $vehicleId = this.getVehicleId();
      result = result * 59 + (int)($vehicleId >>> 32 ^ $vehicleId);
      long $onDutyTime = this.getOnDutyTime();
      result = result * 59 + (int)($onDutyTime >>> 32 ^ $onDutyTime);
      long $onDriveTime = this.getOnDriveTime();
      result = result * 59 + (int)($onDriveTime >>> 32 ^ $onDriveTime);
      long $onSleepTime = this.getOnSleepTime();
      result = result * 59 + (int)($onSleepTime >>> 32 ^ $onSleepTime);
      long $continueDriveTime = this.getContinueDriveTime();
      result = result * 59 + (int)($continueDriveTime >>> 32 ^ $continueDriveTime);
      long $breakTime = this.getBreakTime();
      result = result * 59 + (int)($breakTime >>> 32 ^ $breakTime);
      long $cycleRestartTime = this.getCycleRestartTime();
      result = result * 59 + (int)($cycleRestartTime >>> 32 ^ $cycleRestartTime);
      Object $employeeId = this.getEmployeeId();
      result = result * 59 + ($employeeId == null ? 43 : $employeeId.hashCode());
      Object $tokenNo = this.getTokenNo();
      result = result * 59 + ($tokenNo == null ? 43 : $tokenNo.hashCode());
      Object $disclaimer = this.getDisclaimer();
      result = result * 59 + ($disclaimer == null ? 43 : $disclaimer.hashCode());
      Object $status = this.getStatus();
      result = result * 59 + ($status == null ? 43 : $status.hashCode());
      Object $clientName = this.getClientName();
      result = result * 59 + ($clientName == null ? 43 : $clientName.hashCode());
      Object $timezone = this.getTimezone();
      result = result * 59 + ($timezone == null ? 43 : $timezone.hashCode());
      Object $timezoneOffSet = this.getTimezoneOffSet();
      result = result * 59 + ($timezoneOffSet == null ? 43 : $timezoneOffSet.hashCode());
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
      Object $macAddress = this.getMacAddress();
      result = result * 59 + ($macAddress == null ? 43 : $macAddress.hashCode());
      Object $vehicleNo = this.getVehicleNo();
      result = result * 59 + ($vehicleNo == null ? 43 : $vehicleNo.hashCode());
      Object $isFirstLogin = this.getIsFirstLogin();
      result = result * 59 + ($isFirstLogin == null ? 43 : $isFirstLogin.hashCode());
      Object $exempt = this.getExempt();
      result = result * 59 + ($exempt == null ? 43 : $exempt.hashCode());
      Object $personalUse = this.getPersonalUse();
      result = result * 59 + ($personalUse == null ? 43 : $personalUse.hashCode());
      Object $yardMoves = this.getYardMoves();
      result = result * 59 + ($yardMoves == null ? 43 : $yardMoves.hashCode());
      Object $shortHaulException = this.getShortHaulException();
      result = result * 59 + ($shortHaulException == null ? 43 : $shortHaulException.hashCode());
      Object $unlimitedTrailers = this.getUnlimitedTrailers();
      result = result * 59 + ($unlimitedTrailers == null ? 43 : $unlimitedTrailers.hashCode());
      Object $unlimitedShippingDocs = this.getUnlimitedShippingDocs();
      result = result * 59 + ($unlimitedShippingDocs == null ? 43 : $unlimitedShippingDocs.hashCode());
      Object $androidVersion = this.getAndroidVersion();
      result = result * 59 + ($androidVersion == null ? 43 : $androidVersion.hashCode());
      Object $androidCode = this.getAndroidCode();
      result = result * 59 + ($androidCode == null ? 43 : $androidCode.hashCode());
      Object $iosVersion = this.getIosVersion();
      result = result * 59 + ($iosVersion == null ? 43 : $iosVersion.hashCode());
      Object $iosCode = this.getIosCode();
      result = result * 59 + ($iosCode == null ? 43 : $iosCode.hashCode());
      Object $termsAndCondition = this.getTermsAndCondition();
      result = result * 59 + ($termsAndCondition == null ? 43 : $termsAndCondition.hashCode());
      Object $driverLog = this.getDriverLog();
      result = result * 59 + ($driverLog == null ? 43 : $driverLog.hashCode());
      Object $driverDvirLog = this.getDriverDvirLog();
      result = result * 59 + ($driverDvirLog == null ? 43 : $driverDvirLog.hashCode());
      Object $driverCertifiedLog = this.getDriverCertifiedLog();
      result = result * 59 + ($driverCertifiedLog == null ? 43 : $driverCertifiedLog.hashCode());
      Object $loginLogoutLog = this.getLoginLogoutLog();
      result = result * 59 + ($loginLogoutLog == null ? 43 : $loginLogoutLog.hashCode());
      Object $splitLog = this.getSplitLog();
      result = result * 59 + ($splitLog == null ? 43 : $splitLog.hashCode());
      Object $rules = this.getRules();
      return result * 59 + ($rules == null ? 43 : $rules.hashCode());
   }

   @Override
   public String toString() {
      return "EmployeeMasterCRUDDto(tokenNo="
         + this.getTokenNo()
         + ", disclaimerRead="
         + this.getDisclaimerRead()
         + ", disclaimer="
         + this.getDisclaimer()
         + ", status="
         + this.getStatus()
         + ", employeeId="
         + this.getEmployeeId()
         + ", clientId="
         + this.getClientId()
         + ", mainTerminalId="
         + this.getMainTerminalId()
         + ", clientName="
         + this.getClientName()
         + ", timezone="
         + this.getTimezone()
         + ", timezoneOffSet="
         + this.getTimezoneOffSet()
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
         + ", loginDateTime="
         + this.getLoginDateTime()
         + ", macAddress="
         + this.getMacAddress()
         + ", vehicleId="
         + this.getVehicleId()
         + ", vehicleNo="
         + this.getVehicleNo()
         + ", isFirstLogin="
         + this.getIsFirstLogin()
         + ", onDutyTime="
         + this.getOnDutyTime()
         + ", onDriveTime="
         + this.getOnDriveTime()
         + ", onSleepTime="
         + this.getOnSleepTime()
         + ", continueDriveTime="
         + this.getContinueDriveTime()
         + ", breakTime="
         + this.getBreakTime()
         + ", cycleRestartTime="
         + this.getCycleRestartTime()
         + ", exempt="
         + this.getExempt()
         + ", personalUse="
         + this.getPersonalUse()
         + ", yardMoves="
         + this.getYardMoves()
         + ", shortHaulException="
         + this.getShortHaulException()
         + ", unlimitedTrailers="
         + this.getUnlimitedTrailers()
         + ", unlimitedShippingDocs="
         + this.getUnlimitedShippingDocs()
         + ", androidVersion="
         + this.getAndroidVersion()
         + ", androidCode="
         + this.getAndroidCode()
         + ", iosVersion="
         + this.getIosVersion()
         + ", iosCode="
         + this.getIosCode()
         + ", termsAndCondition="
         + this.getTermsAndCondition()
         + ", driverLog="
         + this.getDriverLog()
         + ", driverDvirLog="
         + this.getDriverDvirLog()
         + ", driverCertifiedLog="
         + this.getDriverCertifiedLog()
         + ", loginLogoutLog="
         + this.getLoginLogoutLog()
         + ", splitLog="
         + this.getSplitLog()
         + ", rules="
         + this.getRules()
         + ")";
   }
}
