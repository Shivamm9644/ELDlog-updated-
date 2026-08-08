package com.mes.eld_log.models;

import java.io.Serializable;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.core.mapping.Document;

@EntityScan
@Document(
   collection = "timezone_master"
)
public class TimezoneMaster implements Serializable {
   private static final long serialVersionUID = 1L;
   private Integer timezoneId;
   private String timezoneName;
   private long clientId;
   private String address;
   private String remarks;
   private long addedTimestamp;
   private long updatedTimestamp;

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof TimezoneMaster)) {
         return false;
      } else {
         TimezoneMaster other = (TimezoneMaster)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else if (this.getAddedTimestamp() != other.getAddedTimestamp()) {
            return false;
         } else if (this.getUpdatedTimestamp() != other.getUpdatedTimestamp()) {
            return false;
         } else {
            Object this$timezoneId = this.getTimezoneId();
            Object other$timezoneId = other.getTimezoneId();
            if (this$timezoneId == null ? other$timezoneId == null : this$timezoneId.equals(other$timezoneId)) {
               Object this$timezoneName = this.getTimezoneName();
               Object other$timezoneName = other.getTimezoneName();
               if (this$timezoneName == null ? other$timezoneName == null : this$timezoneName.equals(other$timezoneName)) {
                  Object this$address = this.getAddress();
                  Object other$address = other.getAddress();
                  if (this$address == null ? other$address == null : this$address.equals(other$address)) {
                     Object this$remarks = this.getRemarks();
                     Object other$remarks = other.getRemarks();
                     return this$remarks == null ? other$remarks == null : this$remarks.equals(other$remarks);
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
      return other instanceof TimezoneMaster;
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
      Object $timezoneId = this.getTimezoneId();
      result = result * 59 + ($timezoneId == null ? 43 : $timezoneId.hashCode());
      Object $timezoneName = this.getTimezoneName();
      result = result * 59 + ($timezoneName == null ? 43 : $timezoneName.hashCode());
      Object $address = this.getAddress();
      result = result * 59 + ($address == null ? 43 : $address.hashCode());
      Object $remarks = this.getRemarks();
      return result * 59 + ($remarks == null ? 43 : $remarks.hashCode());
   }

   @Override
   public String toString() {
      return "TimezoneMaster(timezoneId="
         + this.getTimezoneId()
         + ", timezoneName="
         + this.getTimezoneName()
         + ", clientId="
         + this.getClientId()
         + ", address="
         + this.getAddress()
         + ", remarks="
         + this.getRemarks()
         + ", addedTimestamp="
         + this.getAddedTimestamp()
         + ", updatedTimestamp="
         + this.getUpdatedTimestamp()
         + ")";
   }

   public Integer getTimezoneId() {
      return this.timezoneId;
   }

   public String getTimezoneName() {
      return this.timezoneName;
   }

   public long getClientId() {
      return this.clientId;
   }

   public String getAddress() {
      return this.address;
   }

   public String getRemarks() {
      return this.remarks;
   }

   public long getAddedTimestamp() {
      return this.addedTimestamp;
   }

   public long getUpdatedTimestamp() {
      return this.updatedTimestamp;
   }

   public void setTimezoneId(final Integer timezoneId) {
      this.timezoneId = timezoneId;
   }

   public void setTimezoneName(final String timezoneName) {
      this.timezoneName = timezoneName;
   }

   public void setClientId(final long clientId) {
      this.clientId = clientId;
   }

   public void setAddress(final String address) {
      this.address = address;
   }

   public void setRemarks(final String remarks) {
      this.remarks = remarks;
   }

   public void setAddedTimestamp(final long addedTimestamp) {
      this.addedTimestamp = addedTimestamp;
   }

   public void setUpdatedTimestamp(final long updatedTimestamp) {
      this.updatedTimestamp = updatedTimestamp;
   }
}
