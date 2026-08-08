package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EldConnectionInterfaceCRUDDto {
   @JsonProperty("eldConnectionInterfaceId")
   private Integer eldConnectionInterfaceId;

   public Integer getEldConnectionInterfaceId() {
      return this.eldConnectionInterfaceId;
   }

   @JsonProperty("eldConnectionInterfaceId")
   public void setEldConnectionInterfaceId(final Integer eldConnectionInterfaceId) {
      this.eldConnectionInterfaceId = eldConnectionInterfaceId;
   }

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof EldConnectionInterfaceCRUDDto)) {
         return false;
      } else {
         EldConnectionInterfaceCRUDDto other = (EldConnectionInterfaceCRUDDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$eldConnectionInterfaceId = this.getEldConnectionInterfaceId();
            Object other$eldConnectionInterfaceId = other.getEldConnectionInterfaceId();
            return this$eldConnectionInterfaceId == null
               ? other$eldConnectionInterfaceId == null
               : this$eldConnectionInterfaceId.equals(other$eldConnectionInterfaceId);
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof EldConnectionInterfaceCRUDDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $eldConnectionInterfaceId = this.getEldConnectionInterfaceId();
      return result * 59 + ($eldConnectionInterfaceId == null ? 43 : $eldConnectionInterfaceId.hashCode());
   }

   @Override
   public String toString() {
      return "EldConnectionInterfaceCRUDDto(eldConnectionInterfaceId=" + this.getEldConnectionInterfaceId() + ")";
   }
}
