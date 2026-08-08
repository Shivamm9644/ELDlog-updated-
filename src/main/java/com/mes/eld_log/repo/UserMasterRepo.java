package com.mes.eld_log.repo;

import com.mes.eld_log.dtos.UserMasterViewDto;
import com.mes.eld_log.models.UserMaster;
import java.util.List;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMasterRepo extends MongoRepository<UserMaster, String> {
   @Query("{ 'userId' : ?0 }")
   UserMaster findByUserId(Integer userId);

   @Query("{ 'userId' : ?0}")
   List<UserMaster> findAndViewByUserId(Integer userId);

   @Query("{ 'email' : ?0,'password' : ?1 }")
   List<UserMasterViewDto> findAndViewByEmailAndPassword(String email, String password);

   @Query("{ 'clientId' : ?0 }")
   List<UserMaster> findAllUsers(long clientId);

   @Aggregation(
      pipeline = {"{$group: { _id: '', maxID: {$max: $userId }}}"}
   )
   Object findMaxIdInUserMaster();

   @Query(
      value = "{'userId' : ?0}",
      delete = true
   )
   UserMaster DeleteUserById(Integer userId);

   boolean existsByEmail(String email);

   boolean existsByUserTypeId(long userTypeId);
}
