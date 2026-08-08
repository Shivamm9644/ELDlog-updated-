package com.mes.eld_log.repo;

import com.mes.eld_log.models.UserTypeMaster;
import java.util.List;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserTypeMasterRepo extends MongoRepository<UserTypeMaster, String> {
   @Query("{ 'userTypeId' : ?0 }")
   UserTypeMaster findByUserTypeId(Integer userTypeId);

   @Query("{ 'userTypeId' : ?0}")
   List<UserTypeMaster> findAndViewByUserTypeId(Integer userTypeId);

   @Query("{ 'clientId' : ?0 }")
   List<UserTypeMaster> findAllUserTypes(long clientId);

   @Aggregation(
      pipeline = {"{$group: { _id: '', maxID: {$max: $userTypeId }}}"}
   )
   Object findMaxIdInUserTypeMaster();

   @Query(
      value = "{'userTypeId' : ?0}",
      delete = true
   )
   UserTypeMaster DeleteUserTypeById(Integer userTypeId);
}
