package com.mes.eld_log.models;

import java.io.Serializable;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.core.mapping.Document;

@EntityScan
@Document(
   collection = "simulator"
)
public class Simulator implements Serializable {
   private static final long serialVersionUID = 1L;
   private long driverId;
   private String status;
   private String dateTime;
   private long lDateTime;
   private long clientId;
   private String isSend;
   private long sendDateTime;
   private long receivedTimestamp;

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof Simulator)) {
         return false;
      } else {
         Simulator other = (Simulator)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getDriverId() != other.getDriverId()) {
            return false;
         } else if (this.getLDateTime() != other.getLDateTime()) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else if (this.getSendDateTime() != other.getSendDateTime()) {
            return false;
         } else if (this.getReceivedTimestamp() != other.getReceivedTimestamp()) {
            return false;
         } else {
            Object this$status = this.getStatus();
            Object other$status = other.getStatus();
            if (this$status == null ? other$status == null : this$status.equals(other$status)) {
               Object this$dateTime = this.getDateTime();
               Object other$dateTime = other.getDateTime();
               if (this$dateTime == null ? other$dateTime == null : this$dateTime.equals(other$dateTime)) {
                  Object this$isSend = this.getIsSend();
                  Object other$isSend = other.getIsSend();
                  return this$isSend == null ? other$isSend == null : this$isSend.equals(other$isSend);
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
      return other instanceof Simulator;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $driverId = this.getDriverId();
      result = result * 59 + (int)($driverId >>> 32 ^ $driverId);
      long $lDateTime = this.getLDateTime();
      result = result * 59 + (int)($lDateTime >>> 32 ^ $lDateTime);
      long $clientId = this.getClientId();
      result = result * 59 + (int)($clientId >>> 32 ^ $clientId);
      long $sendDateTime = this.getSendDateTime();
      result = result * 59 + (int)($sendDateTime >>> 32 ^ $sendDateTime);
      long $receivedTimestamp = this.getReceivedTimestamp();
      result = result * 59 + (int)($receivedTimestamp >>> 32 ^ $receivedTimestamp);
      Object $status = this.getStatus();
      result = result * 59 + ($status == null ? 43 : $status.hashCode());
      Object $dateTime = this.getDateTime();
      result = result * 59 + ($dateTime == null ? 43 : $dateTime.hashCode());
      Object $isSend = this.getIsSend();
      return result * 59 + ($isSend == null ? 43 : $isSend.hashCode());
   }

   @Override
   public String toString() {
      return "Simulator(driverId="
         + this.getDriverId()
         + ", status="
         + this.getStatus()
         + ", dateTime="
         + this.getDateTime()
         + ", lDateTime="
         + this.getLDateTime()
         + ", clientId="
         + this.getClientId()
         + ", isSend="
         + this.getIsSend()
         + ", sendDateTime="
         + this.getSendDateTime()
         + ", receivedTimestamp="
         + this.getReceivedTimestamp()
         + ")";
   }

   public long getDriverId() {
      return this.driverId;
   }

   public String getStatus() {
      return this.status;
   }

   public String getDateTime() {
      return this.dateTime;
   }

   public long getLDateTime() {
      return this.lDateTime;
   }

   public long getClientId() {
      return this.clientId;
   }

   public String getIsSend() {
      return this.isSend;
   }

   public long getSendDateTime() {
      return this.sendDateTime;
   }

   public long getReceivedTimestamp() {
      return this.receivedTimestamp;
   }

   public void setDriverId(final long driverId) {
      this.driverId = driverId;
   }

   public void setStatus(final String status) {
      this.status = status;
   }

   public void setDateTime(final String dateTime) {
      this.dateTime = dateTime;
   }

   public void setLDateTime(final long lDateTime) {
      this.lDateTime = lDateTime;
   }

   public void setClientId(final long clientId) {
      this.clientId = clientId;
   }

   public void setIsSend(final String isSend) {
      this.isSend = isSend;
   }

   public void setSendDateTime(final long sendDateTime) {
      this.sendDateTime = sendDateTime;
   }

   public void setReceivedTimestamp(final long receivedTimestamp) {
      this.receivedTimestamp = receivedTimestamp;
   }
}
