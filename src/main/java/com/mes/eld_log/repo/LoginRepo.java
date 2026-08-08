package com.mes.eld_log.repo;

import com.mes.eld_log.dtos.UserLoginDto;
import com.mes.eld_log.models.Login;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepo extends MongoRepository<Login, String> {
   @Query("{'username' : ?0,'password' : ?1}")
   List<Login> ValidateAndLogin(String username, String password);

   @Query("{ 'email' : ?0 }")
   List<Login> ForgotPassword(String email);

   @Query("{ 'mobileNo' : ?0 }")
   List<Login> ForgotUsername(long mobileNo);

   @Query("{ 'email' : ?0 }")
   UserLoginDto GetLoginDataByEmail(String email);

   @Query("{ 'employeeId' : ?0 }")
   UserLoginDto GetLoginDataByEmployeeId(Integer employeeId);

   @Query("{ 'employeeId' : ?0 },{ 'tokenNo' : ?1 }")
   Login ValidateLoginToken(Integer employeeId, String tokenNo);

   @Query(
      value = "{'employeeId' : ?0}",
      delete = true
   )
   Login DeleteEmployeeById(Integer employeeId);
}
