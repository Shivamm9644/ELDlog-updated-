package com.mes.eld_log.repo;

import com.mes.eld_log.models.RestartMaster;
import java.util.List;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RestartMasterRepo extends MongoRepository<RestartMaster, String> {
   @Query("{ 'restartId' : ?0 }")
   RestartMaster findBRestartMasterId(Integer restartId);

   @Query("{ 'restartId' : ?0}")
   List<RestartMaster> findAndViewByRestartMasterId(Integer restartId);

   @Query("{ 'clientId' : ?0 }")
   List<RestartMaster> findAllRestartMaster(long clientId);

   @Aggregation(
      pipeline = {"{$group: { _id: '', maxID: {$max: $restartId }}}"}
   )
   Object findMaxIdInRestartMaster();

   @Query(
      value = "{'restartId' : ?0}",
      delete = true
   )
   RestartMaster DeleteRestartMasterById(Integer restartId);
}
