package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

public class SimulatorCRUDDto {
   @JsonProperty("_id")
   private String _id;
   @JsonProperty("driverId")
   private Integer driverId;
   @JsonProperty("title")
   private ArrayList title;
   @JsonProperty("firstName")
   private ArrayList firstName;
   @JsonProperty("lastName")
   private ArrayList lastName;
   @JsonProperty("status")
   private String status;
   @JsonProperty("dateTime")
   private String dateTime;
   @JsonProperty("lDateTime")
   private long lDateTime;
   @JsonProperty("isSend")
   private String isSend;
   @JsonProperty("sendDateTime")
   private String sendDateTime;
   @JsonProperty("receivedTimestamp")
   private String receivedTimestamp;
   @JsonProperty("clientId")
   private long clientId;
   @JsonProperty("fromDate")
   private String fromDate;
   @JsonProperty("toDate")
   private String toDate;

   public String get_id() {
      return this._id;
   }

   public Integer getDriverId() {
      return this.driverId;
   }

   public ArrayList getTitle() {
      return this.title;
   }

   public ArrayList getFirstName() {
      return this.firstName;
   }

   public ArrayList getLastName() {
      return this.lastName;
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

   public String getIsSend() {
      return this.isSend;
   }

   public String getSendDateTime() {
      return this.sendDateTime;
   }

   public String getReceivedTimestamp() {
      return this.receivedTimestamp;
   }

   public long getClientId() {
      return this.clientId;
   }

   public String getFromDate() {
      return this.fromDate;
   }

   public String getToDate() {
      return this.toDate;
   }

   @JsonProperty("_id")
   public void set_id(final String _id) {
      this._id = _id;
   }

   @JsonProperty("driverId")
   public void setDriverId(final Integer driverId) {
      this.driverId = driverId;
   }

   @JsonProperty("title")
   public void setTitle(final ArrayList title) {
      this.title = title;
   }

   @JsonProperty("firstName")
   public void setFirstName(final ArrayList firstName) {
      this.firstName = firstName;
   }

   @JsonProperty("lastName")
   public void setLastName(final ArrayList lastName) {
      this.lastName = lastName;
   }

   @JsonProperty("status")
   public void setStatus(final String status) {
      this.status = status;
   }

   @JsonProperty("dateTime")
   public void setDateTime(final String dateTime) {
      this.dateTime = dateTime;
   }

   @JsonProperty("lDateTime")
   public void setLDateTime(final long lDateTime) {
      this.lDateTime = lDateTime;
   }

   @JsonProperty("isSend")
   public void setIsSend(final String isSend) {
      this.isSend = isSend;
   }

   @JsonProperty("sendDateTime")
   public void setSendDateTime(final String sendDateTime) {
      this.sendDateTime = sendDateTime;
   }

   @JsonProperty("receivedTimestamp")
   public void setReceivedTimestamp(final String receivedTimestamp) {
      this.receivedTimestamp = receivedTimestamp;
   }

   @JsonProperty("clientId")
   public void setClientId(final long clientId) {
      this.clientId = clientId;
   }

   @JsonProperty("fromDate")
   public void setFromDate(final String fromDate) {
      this.fromDate = fromDate;
   }

   @JsonProperty("toDate")
   public void setToDate(final String toDate) {
      this.toDate = toDate;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof SimulatorCRUDDto)) {
         return false;
      } else {
         SimulatorCRUDDto other = (SimulatorCRUDDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getLDateTime() != other.getLDateTime()) {
            return false;
         } else if (this.getClientId() != other.getClientId()) {
            return false;
         } else {
            Object this$driverId = this.getDriverId();
            Object other$driverId = other.getDriverId();
            if (this$driverId == null ? other$driverId == null : this$driverId.equals(other$driverId)) {
               Object this$_id = this.get_id();
               Object other$_id = other.get_id();
               if (this$_id == null ? other$_id == null : this$_id.equals(other$_id)) {
                  Object this$title = this.getTitle();
                  Object other$title = other.getTitle();
                  if (this$title == null ? other$title == null : this$title.equals(other$title)) {
                     Object this$firstName = this.getFirstName();
                     Object other$firstName = other.getFirstName();
                     if (this$firstName == null ? other$firstName == null : this$firstName.equals(other$firstName)) {
                        Object this$lastName = this.getLastName();
                        Object other$lastName = other.getLastName();
                        if (this$lastName == null ? other$lastName == null : this$lastName.equals(other$lastName)) {
                           Object this$status = this.getStatus();
                           Object other$status = other.getStatus();
                           if (this$status == null ? other$status == null : this$status.equals(other$status)) {
                              Object this$dateTime = this.getDateTime();
                              Object other$dateTime = other.getDateTime();
                              if (this$dateTime == null ? other$dateTime == null : this$dateTime.equals(other$dateTime)) {
                                 Object this$isSend = this.getIsSend();
                                 Object other$isSend = other.getIsSend();
                                 if (this$isSend == null ? other$isSend == null : this$isSend.equals(other$isSend)) {
                                    Object this$sendDateTime = this.getSendDateTime();
                                    Object other$sendDateTime = other.getSendDateTime();
                                    if (this$sendDateTime == null ? other$sendDateTime == null : this$sendDateTime.equals(other$sendDateTime)) {
                                       Object this$receivedTimestamp = this.getReceivedTimestamp();
                                       Object other$receivedTimestamp = other.getReceivedTimestamp();
                                       if (this$receivedTimestamp == null
                                          ? other$receivedTimestamp == null
                                          : this$receivedTimestamp.equals(other$receivedTimestamp)) {
                                          Object this$fromDate = this.getFromDate();
                                          Object other$fromDate = other.getFromDate();
                                          if (this$fromDate == null ? other$fromDate == null : this$fromDate.equals(other$fromDate)) {
                                             Object this$toDate = this.getToDate();
                                             Object other$toDate = other.getToDate();
                                             return this$toDate == null ? other$toDate == null : this$toDate.equals(other$toDate);
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
      return other instanceof SimulatorCRUDDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $lDateTime = this.getLDateTime();
      result = result * 59 + (int)($lDateTime >>> 32 ^ $lDateTime);
      long $clientId = this.getClientId();
      result = result * 59 + (int)($clientId >>> 32 ^ $clientId);
      Object $driverId = this.getDriverId();
      result = result * 59 + ($driverId == null ? 43 : $driverId.hashCode());
      Object $_id = this.get_id();
      result = result * 59 + ($_id == null ? 43 : $_id.hashCode());
      Object $title = this.getTitle();
      result = result * 59 + ($title == null ? 43 : $title.hashCode());
      Object $firstName = this.getFirstName();
      result = result * 59 + ($firstName == null ? 43 : $firstName.hashCode());
      Object $lastName = this.getLastName();
      result = result * 59 + ($lastName == null ? 43 : $lastName.hashCode());
      Object $status = this.getStatus();
      result = result * 59 + ($status == null ? 43 : $status.hashCode());
      Object $dateTime = this.getDateTime();
      result = result * 59 + ($dateTime == null ? 43 : $dateTime.hashCode());
      Object $isSend = this.getIsSend();
      result = result * 59 + ($isSend == null ? 43 : $isSend.hashCode());
      Object $sendDateTime = this.getSendDateTime();
      result = result * 59 + ($sendDateTime == null ? 43 : $sendDateTime.hashCode());
      Object $receivedTimestamp = this.getReceivedTimestamp();
      result = result * 59 + ($receivedTimestamp == null ? 43 : $receivedTimestamp.hashCode());
      Object $fromDate = this.getFromDate();
      result = result * 59 + ($fromDate == null ? 43 : $fromDate.hashCode());
      Object $toDate = this.getToDate();
      return result * 59 + ($toDate == null ? 43 : $toDate.hashCode());
   }

   @Override
   public String toString() {
      return "SimulatorCRUDDto(_id="
         + this.get_id()
         + ", driverId="
         + this.getDriverId()
         + ", title="
         + this.getTitle()
         + ", firstName="
         + this.getFirstName()
         + ", lastName="
         + this.getLastName()
         + ", status="
         + this.getStatus()
         + ", dateTime="
         + this.getDateTime()
         + ", lDateTime="
         + this.getLDateTime()
         + ", isSend="
         + this.getIsSend()
         + ", sendDateTime="
         + this.getSendDateTime()
         + ", receivedTimestamp="
         + this.getReceivedTimestamp()
         + ", clientId="
         + this.getClientId()
         + ", fromDate="
         + this.getFromDate()
         + ", toDate="
         + this.getToDate()
         + ")";
   }
}
