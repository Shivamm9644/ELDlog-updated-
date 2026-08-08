package com.mes.eld_log.models;

import java.io.Serializable;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.core.mapping.Document;

@EntityScan
@Document(
   collection = "server_health"
)
public class ServerHealth implements Serializable {
   private static final long serialVersionUID = 1L;
   private String host;
   private String date;
   private Double cpu;
   private Double memory;
   private Double tomcat;
   private String load;
   private long receivedTimestamp;

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ServerHealth)) {
         return false;
      } else {
         ServerHealth other = (ServerHealth)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getReceivedTimestamp() != other.getReceivedTimestamp()) {
            return false;
         } else {
            Object this$cpu = this.getCpu();
            Object other$cpu = other.getCpu();
            if (this$cpu == null ? other$cpu == null : this$cpu.equals(other$cpu)) {
               Object this$memory = this.getMemory();
               Object other$memory = other.getMemory();
               if (this$memory == null ? other$memory == null : this$memory.equals(other$memory)) {
                  Object this$tomcat = this.getTomcat();
                  Object other$tomcat = other.getTomcat();
                  if (this$tomcat == null ? other$tomcat == null : this$tomcat.equals(other$tomcat)) {
                     Object this$host = this.getHost();
                     Object other$host = other.getHost();
                     if (this$host == null ? other$host == null : this$host.equals(other$host)) {
                        Object this$date = this.getDate();
                        Object other$date = other.getDate();
                        if (this$date == null ? other$date == null : this$date.equals(other$date)) {
                           Object this$load = this.getLoad();
                           Object other$load = other.getLoad();
                           return this$load == null ? other$load == null : this$load.equals(other$load);
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
      return other instanceof ServerHealth;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $receivedTimestamp = this.getReceivedTimestamp();
      result = result * 59 + (int)($receivedTimestamp >>> 32 ^ $receivedTimestamp);
      Object $cpu = this.getCpu();
      result = result * 59 + ($cpu == null ? 43 : $cpu.hashCode());
      Object $memory = this.getMemory();
      result = result * 59 + ($memory == null ? 43 : $memory.hashCode());
      Object $tomcat = this.getTomcat();
      result = result * 59 + ($tomcat == null ? 43 : $tomcat.hashCode());
      Object $host = this.getHost();
      result = result * 59 + ($host == null ? 43 : $host.hashCode());
      Object $date = this.getDate();
      result = result * 59 + ($date == null ? 43 : $date.hashCode());
      Object $load = this.getLoad();
      return result * 59 + ($load == null ? 43 : $load.hashCode());
   }

   @Override
   public String toString() {
      return "ServerHealth(host="
         + this.getHost()
         + ", date="
         + this.getDate()
         + ", cpu="
         + this.getCpu()
         + ", memory="
         + this.getMemory()
         + ", tomcat="
         + this.getTomcat()
         + ", load="
         + this.getLoad()
         + ", receivedTimestamp="
         + this.getReceivedTimestamp()
         + ")";
   }

   public String getHost() {
      return this.host;
   }

   public String getDate() {
      return this.date;
   }

   public Double getCpu() {
      return this.cpu;
   }

   public Double getMemory() {
      return this.memory;
   }

   public Double getTomcat() {
      return this.tomcat;
   }

   public String getLoad() {
      return this.load;
   }

   public long getReceivedTimestamp() {
      return this.receivedTimestamp;
   }

   public void setHost(final String host) {
      this.host = host;
   }

   public void setDate(final String date) {
      this.date = date;
   }

   public void setCpu(final Double cpu) {
      this.cpu = cpu;
   }

   public void setMemory(final Double memory) {
      this.memory = memory;
   }

   public void setTomcat(final Double tomcat) {
      this.tomcat = tomcat;
   }

   public void setLoad(final String load) {
      this.load = load;
   }

   public void setReceivedTimestamp(final long receivedTimestamp) {
      this.receivedTimestamp = receivedTimestamp;
   }
}
