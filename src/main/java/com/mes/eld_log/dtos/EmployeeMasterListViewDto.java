package com.mes.eld_log.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EmployeeMasterListViewDto {
   @JsonProperty("employeeId")
   private Integer employeeId;
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

   @JsonProperty("employeeId")
   public void setEmployeeId(final Integer employeeId) {
      this.employeeId = employeeId;
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

   @Override
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof EmployeeMasterListViewDto)) {
         return false;
      } else {
         EmployeeMasterListViewDto other = (EmployeeMasterListViewDto)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$employeeId = this.getEmployeeId();
            Object other$employeeId = other.getEmployeeId();
            if (this$employeeId == null ? other$employeeId == null : this$employeeId.equals(other$employeeId)) {
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
                           return this$username == null ? other$username == null : this$username.equals(other$username);
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
      return other instanceof EmployeeMasterListViewDto;
   }

   @Override
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $employeeId = this.getEmployeeId();
      result = result * 59 + ($employeeId == null ? 43 : $employeeId.hashCode());
      Object $title = this.getTitle();
      result = result * 59 + ($title == null ? 43 : $title.hashCode());
      Object $firstName = this.getFirstName();
      result = result * 59 + ($firstName == null ? 43 : $firstName.hashCode());
      Object $lastName = this.getLastName();
      result = result * 59 + ($lastName == null ? 43 : $lastName.hashCode());
      Object $email = this.getEmail();
      result = result * 59 + ($email == null ? 43 : $email.hashCode());
      Object $username = this.getUsername();
      return result * 59 + ($username == null ? 43 : $username.hashCode());
   }

   @Override
   public String toString() {
      return "EmployeeMasterListViewDto(employeeId="
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
         + ")";
   }
}
