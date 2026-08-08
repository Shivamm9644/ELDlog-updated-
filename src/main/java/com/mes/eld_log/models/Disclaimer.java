package com.mes.eld_log.models;

import java.io.Serializable;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.core.mapping.Document;

@EntityScan
@Document(
   collection = "disclaimer"
)
public class Disclaimer implements Serializable {
   private static final long serialVersionUID = 1L;
   private Integer disclaimerId;
   private String disclaimer;
   private Integer isRead;
   private long addedTimestamp;
   private long updatedTimestamp;

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof Disclaimer)) {
         return false;
      } else {
         Disclaimer other = (Disclaimer)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getAddedTimestamp() != other.getAddedTimestamp()) {
            return false;
         } else if (this.getUpdatedTimestamp() != other.getUpdatedTimestamp()) {
            return false;
         } else {
            Object this$disclaimerId = this.getDisclaimerId();
            Object other$disclaimerId = other.getDisclaimerId();
            if (this$disclaimerId == null ? other$disclaimerId == null : this$disclaimerId.equals(other$disclaimerId)) {
               Object this$isRead = this.getIsRead();
               Object other$isRead = other.getIsRead();
               if (this$isRead == null ? other$isRead == null : this$isRead.equals(other$isRead)) {
                  Object this$disclaimer = this.getDisclaimer();
                  Object other$disclaimer = other.getDisclaimer();
                  return this$disclaimer == null ? other$disclaimer == null : this$disclaimer.equals(other$disclaimer);
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
      return other instanceof Disclaimer;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $addedTimestamp = this.getAddedTimestamp();
      result = result * 59 + (int)($addedTimestamp >>> 32 ^ $addedTimestamp);
      long $updatedTimestamp = this.getUpdatedTimestamp();
      result = result * 59 + (int)($updatedTimestamp >>> 32 ^ $updatedTimestamp);
      Object $disclaimerId = this.getDisclaimerId();
      result = result * 59 + ($disclaimerId == null ? 43 : $disclaimerId.hashCode());
      Object $isRead = this.getIsRead();
      result = result * 59 + ($isRead == null ? 43 : $isRead.hashCode());
      Object $disclaimer = this.getDisclaimer();
      return result * 59 + ($disclaimer == null ? 43 : $disclaimer.hashCode());
   }

   @Override
   public String toString() {
      return "Disclaimer(disclaimerId="
         + this.getDisclaimerId()
         + ", disclaimer="
         + this.getDisclaimer()
         + ", isRead="
         + this.getIsRead()
         + ", addedTimestamp="
         + this.getAddedTimestamp()
         + ", updatedTimestamp="
         + this.getUpdatedTimestamp()
         + ")";
   }

   public Integer getDisclaimerId() {
      return this.disclaimerId;
   }

   public String getDisclaimer() {
      return this.disclaimer;
   }

   public Integer getIsRead() {
      return this.isRead;
   }

   public long getAddedTimestamp() {
      return this.addedTimestamp;
   }

   public long getUpdatedTimestamp() {
      return this.updatedTimestamp;
   }

   public void setDisclaimerId(final Integer disclaimerId) {
      this.disclaimerId = disclaimerId;
   }

   public void setDisclaimer(final String disclaimer) {
      this.disclaimer = disclaimer;
   }

   public void setIsRead(final Integer isRead) {
      this.isRead = isRead;
   }

   public void setAddedTimestamp(final long addedTimestamp) {
      this.addedTimestamp = addedTimestamp;
   }

   public void setUpdatedTimestamp(final long updatedTimestamp) {
      this.updatedTimestamp = updatedTimestamp;
   }
}
