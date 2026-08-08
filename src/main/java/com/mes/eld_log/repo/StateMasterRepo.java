package com.mes.eld_log.repo;

import com.mes.eld_log.models.StateMaster;
import java.util.List;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StateMasterRepo extends MongoRepository<StateMaster, String> {
   @Query("{ 'stateId' : ?0 }")
   StateMaster findByStateId(Integer stateId);

   @Query("{ 'stateId' : ?0}")
   List<StateMaster> findAndViewByStateId(Integer stateId);

   @Query("{ 'countryId' : ?0}")
   List<StateMaster> findAndViewByCountryId(Integer countryId);

   @Query("{ 'geofanceId' : ?0}")
   List<StateMaster> findAndViewByGeofanceId(long geofanceId);

   @Query("{ 'clientId' : ?0 }")
   List<StateMaster> findAllStates(long clientId);

   @Aggregation(
      pipeline = {"{$group: { _id: '', maxID: {$max: $stateId }}}"}
   )
   Object findMaxIdInStateMaster();

   @Query(
      value = "{'stateId' : ?0}",
      delete = true
   )
   StateMaster DeleteStateById(Integer stateId);
}
