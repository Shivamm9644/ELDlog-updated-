package com.mes.eld_log.models;

import java.io.Serializable;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.core.mapping.Document;

@EntityScan
@Document(
   collection = "eld_settings"
)
public class ELDSettings implements Serializable {
   private static final long serialVersionUID = 1L;
   private Integer settingId;
   private String eldIdentifier;
   private String eldProvider;
   private String eldSoftwareVersion;
   private String eldRegistrationId;
   private String googleApiUrl;
   private String smsApiUrl;
   private String androidVersion;
   private String androidCode;
   private String iosVersion;
   private String iosCode;
   private String termsAndCondition;
   private long addedTimestamp;
   private long updatedTimestamp;

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ELDSettings)) {
         return false;
      } else {
         ELDSettings other = (ELDSettings)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getAddedTimestamp() != other.getAddedTimestamp()) {
            return false;
         } else if (this.getUpdatedTimestamp() != other.getUpdatedTimestamp()) {
            return false;
         } else {
            Object this$settingId = this.getSettingId();
            Object other$settingId = other.getSettingId();
            if (this$settingId == null ? other$settingId == null : this$settingId.equals(other$settingId)) {
               Object this$eldIdentifier = this.getEldIdentifier();
               Object other$eldIdentifier = other.getEldIdentifier();
               if (this$eldIdentifier == null ? other$eldIdentifier == null : this$eldIdentifier.equals(other$eldIdentifier)) {
                  Object this$eldProvider = this.getEldProvider();
                  Object other$eldProvider = other.getEldProvider();
                  if (this$eldProvider == null ? other$eldProvider == null : this$eldProvider.equals(other$eldProvider)) {
                     Object this$eldSoftwareVersion = this.getEldSoftwareVersion();
                     Object other$eldSoftwareVersion = other.getEldSoftwareVersion();
                     if (this$eldSoftwareVersion == null ? other$eldSoftwareVersion == null : this$eldSoftwareVersion.equals(other$eldSoftwareVersion)) {
                        Object this$eldRegistrationId = this.getEldRegistrationId();
                        Object other$eldRegistrationId = other.getEldRegistrationId();
                        if (this$eldRegistrationId == null ? other$eldRegistrationId == null : this$eldRegistrationId.equals(other$eldRegistrationId)) {
                           Object this$googleApiUrl = this.getGoogleApiUrl();
                           Object other$googleApiUrl = other.getGoogleApiUrl();
                           if (this$googleApiUrl == null ? other$googleApiUrl == null : this$googleApiUrl.equals(other$googleApiUrl)) {
                              Object this$smsApiUrl = this.getSmsApiUrl();
                              Object other$smsApiUrl = other.getSmsApiUrl();
                              if (this$smsApiUrl == null ? other$smsApiUrl == null : this$smsApiUrl.equals(other$smsApiUrl)) {
                                 Object this$androidVersion = this.getAndroidVersion();
                                 Object other$androidVersion = other.getAndroidVersion();
                                 if (this$androidVersion == null ? other$androidVersion == null : this$androidVersion.equals(other$androidVersion)) {
                                    Object this$androidCode = this.getAndroidCode();
                                    Object other$androidCode = other.getAndroidCode();
                                    if (this$androidCode == null ? other$androidCode == null : this$androidCode.equals(other$androidCode)) {
                                       Object this$iosVersion = this.getIosVersion();
                                       Object other$iosVersion = other.getIosVersion();
                                       if (this$iosVersion == null ? other$iosVersion == null : this$iosVersion.equals(other$iosVersion)) {
                                          Object this$iosCode = this.getIosCode();
                                          Object other$iosCode = other.getIosCode();
                                          if (this$iosCode == null ? other$iosCode == null : this$iosCode.equals(other$iosCode)) {
                                             Object this$termsAndCondition = this.getTermsAndCondition();
                                             Object other$termsAndCondition = other.getTermsAndCondition();
                                             return this$termsAndCondition == null
                                                ? other$termsAndCondition == null
                                                : this$termsAndCondition.equals(other$termsAndCondition);
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
      return other instanceof ELDSettings;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $addedTimestamp = this.getAddedTimestamp();
      result = result * 59 + (int)($addedTimestamp >>> 32 ^ $addedTimestamp);
      long $updatedTimestamp = this.getUpdatedTimestamp();
      result = result * 59 + (int)($updatedTimestamp >>> 32 ^ $updatedTimestamp);
      Object $settingId = this.getSettingId();
      result = result * 59 + ($settingId == null ? 43 : $settingId.hashCode());
      Object $eldIdentifier = this.getEldIdentifier();
      result = result * 59 + ($eldIdentifier == null ? 43 : $eldIdentifier.hashCode());
      Object $eldProvider = this.getEldProvider();
      result = result * 59 + ($eldProvider == null ? 43 : $eldProvider.hashCode());
      Object $eldSoftwareVersion = this.getEldSoftwareVersion();
      result = result * 59 + ($eldSoftwareVersion == null ? 43 : $eldSoftwareVersion.hashCode());
      Object $eldRegistrationId = this.getEldRegistrationId();
      result = result * 59 + ($eldRegistrationId == null ? 43 : $eldRegistrationId.hashCode());
      Object $googleApiUrl = this.getGoogleApiUrl();
      result = result * 59 + ($googleApiUrl == null ? 43 : $googleApiUrl.hashCode());
      Object $smsApiUrl = this.getSmsApiUrl();
      result = result * 59 + ($smsApiUrl == null ? 43 : $smsApiUrl.hashCode());
      Object $androidVersion = this.getAndroidVersion();
      result = result * 59 + ($androidVersion == null ? 43 : $androidVersion.hashCode());
      Object $androidCode = this.getAndroidCode();
      result = result * 59 + ($androidCode == null ? 43 : $androidCode.hashCode());
      Object $iosVersion = this.getIosVersion();
      result = result * 59 + ($iosVersion == null ? 43 : $iosVersion.hashCode());
      Object $iosCode = this.getIosCode();
      result = result * 59 + ($iosCode == null ? 43 : $iosCode.hashCode());
      Object $termsAndCondition = this.getTermsAndCondition();
      return result * 59 + ($termsAndCondition == null ? 43 : $termsAndCondition.hashCode());
   }

   @Override
   public String toString() {
      return "ELDSettings(settingId="
         + this.getSettingId()
         + ", eldIdentifier="
         + this.getEldIdentifier()
         + ", eldProvider="
         + this.getEldProvider()
         + ", eldSoftwareVersion="
         + this.getEldSoftwareVersion()
         + ", eldRegistrationId="
         + this.getEldRegistrationId()
         + ", googleApiUrl="
         + this.getGoogleApiUrl()
         + ", smsApiUrl="
         + this.getSmsApiUrl()
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
         + ", addedTimestamp="
         + this.getAddedTimestamp()
         + ", updatedTimestamp="
         + this.getUpdatedTimestamp()
         + ")";
   }

   public Integer getSettingId() {
      return this.settingId;
   }

   public String getEldIdentifier() {
      return this.eldIdentifier;
   }

   public String getEldProvider() {
      return this.eldProvider;
   }

   public String getEldSoftwareVersion() {
      return this.eldSoftwareVersion;
   }

   public String getEldRegistrationId() {
      return this.eldRegistrationId;
   }

   public String getGoogleApiUrl() {
      return this.googleApiUrl;
   }

   public String getSmsApiUrl() {
      return this.smsApiUrl;
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

   public long getAddedTimestamp() {
      return this.addedTimestamp;
   }

   public long getUpdatedTimestamp() {
      return this.updatedTimestamp;
   }

   public void setSettingId(final Integer settingId) {
      this.settingId = settingId;
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

   public void setEldRegistrationId(final String eldRegistrationId) {
      this.eldRegistrationId = eldRegistrationId;
   }

   public void setGoogleApiUrl(final String googleApiUrl) {
      this.googleApiUrl = googleApiUrl;
   }

   public void setSmsApiUrl(final String smsApiUrl) {
      this.smsApiUrl = smsApiUrl;
   }

   public void setAndroidVersion(final String androidVersion) {
      this.androidVersion = androidVersion;
   }

   public void setAndroidCode(final String androidCode) {
      this.androidCode = androidCode;
   }

   public void setIosVersion(final String iosVersion) {
      this.iosVersion = iosVersion;
   }

   public void setIosCode(final String iosCode) {
      this.iosCode = iosCode;
   }

   public void setTermsAndCondition(final String termsAndCondition) {
      this.termsAndCondition = termsAndCondition;
   }

   public void setAddedTimestamp(final long addedTimestamp) {
      this.addedTimestamp = addedTimestamp;
   }

   public void setUpdatedTimestamp(final long updatedTimestamp) {
      this.updatedTimestamp = updatedTimestamp;
   }
}
