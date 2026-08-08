package com.mes.eld_log.repo;

import com.mes.eld_log.models.RestBreakMaster;
import java.util.List;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RestBreakMasterRepo extends MongoRepository<RestBreakMaster, String> {
   @Query("{ 'restBreakId' : ?0 }")
   RestBreakMaster findByRestBreakMasterId(Integer restBreakId);

   @Query("{ 'restBreakId' : ?0}")
   List<RestBreakMaster> findAndViewByRestBreakMasterId(Integer restBreakId);

   @Query("{ 'clientId' : ?0 }")
   List<RestBreakMaster> findAllRestBreakMaster(long clientId);

   @Aggregation(
      pipeline = {"{$group: { _id: '', maxID: {$max: $restBreakId }}}"}
   )
   Object findMaxIdInRestBreakMaster();

   @Query(
      value = "{'restBreakId' : ?0}",
      delete = true
   )
   RestBreakMaster DeleteRestBreakMasterById(Integer restBreakId);
}
