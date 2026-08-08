package com.mes.eld_log.models;

import java.io.Serializable;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.core.mapping.Document;

@EntityScan
@Document(
   collection = "language_master"
)
public class LanguageMaster implements Serializable {
   private static final long serialVersionUID = 1L;
   private Integer languageId;
   private String languageName;
   private long clientId;
   private long addedTimestamp;
   private long updatedTimestamp;

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof LanguageMaster)) {
         return false;
      } else {
         LanguageMaster other = (LanguageMaster)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else if (this.getAddedTimestamp() != other.getAddedTimestamp()) {
            return false;
         } else if (this.getUpdatedTimestamp() != other.getUpdatedTimestamp()) {
            return false;
         } else {
            Object this$languageId = this.getLanguageId();
            Object other$languageId = other.getLanguageId();
            if (this$languageId == null ? other$languageId == null : this$languageId.equals(other$languageId)) {
               Object this$languageName = this.getLanguageName();
               Object other$languageName = other.getLanguageName();
               return this$languageName == null ? other$languageName == null : this$languageName.equals(other$languageName);
            } else {
               return false;
            }
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof LanguageMaster;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $clientId = this.getClientId();
      result = result * 59 + (int)($clientId >>> 32 ^ $clientId);
      long $addedTimestamp = this.getAddedTimestamp();
      result = result * 59 + (int)($addedTimestamp >>> 32 ^ $addedTimestamp);
      long $updatedTimestamp = this.getUpdatedTimestamp();
      result = result * 59 + (int)($updatedTimestamp >>> 32 ^ $updatedTimestamp);
      Object $languageId = this.getLanguageId();
      result = result * 59 + ($languageId == null ? 43 : $languageId.hashCode());
      Object $languageName = this.getLanguageName();
      return result * 59 + ($languageName == null ? 43 : $languageName.hashCode());
   }

   @Override
   public String toString() {
      return "LanguageMaster(languageId="
         + this.getLanguageId()
         + ", languageName="
         + this.getLanguageName()
         + ", clientId="
         + this.getClientId()
         + ", addedTimestamp="
         + this.getAddedTimestamp()
         + ", updatedTimestamp="
         + this.getUpdatedTimestamp()
         + ")";
   }

   public Integer getLanguageId() {
      return this.languageId;
   }

   public String getLanguageName() {
      return this.languageName;
   }

   public long getClientId() {
      return this.clientId;
   }

   public long getAddedTimestamp() {
      return this.addedTimestamp;
   }

   public long getUpdatedTimestamp() {
      return this.updatedTimestamp;
   }

   public void setLanguageId(final Integer languageId) {
      this.languageId = languageId;
   }

   public void setLanguageName(final String languageName) {
      this.languageName = languageName;
   }

   public void setClientId(final long clientId) {
      this.clientId = clientId;
   }

   public void setAddedTimestamp(final long addedTimestamp) {
      this.addedTimestamp = addedTimestamp;
   }

   public void setUpdatedTimestamp(final long updatedTimestamp) {
      this.updatedTimestamp = updatedTimestamp;
   }
}
