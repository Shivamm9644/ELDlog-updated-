package com.mes.eld_log.repo;

import com.mes.eld_log.models.ExceptionMaster;
import java.util.List;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ExceptionMasterRepo extends MongoRepository<ExceptionMaster, String> {
   @Query("{ 'exceptionId' : ?0 }")
   ExceptionMaster findByExceptionId(Integer exceptionId);

   @Query("{ 'exceptionId' : ?0}")
   List<ExceptionMaster> findAndViewByExceptionId(Integer exceptionId);

   @Query("{ 'clientId' : ?0 }")
   List<ExceptionMaster> findAllExceptions(long clientId);

   @Aggregation(
      pipeline = {"{$group: { _id: '', maxID: {$max: $exceptionId }}}"}
   )
   Object findMaxIdInExceptionMaster();

   @Query(
      value = "{'exceptionId' : ?0}",
      delete = true
   )
   ExceptionMaster DeleteExceptionById(Integer exceptionId);
}
