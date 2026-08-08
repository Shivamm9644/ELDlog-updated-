package com.mes.eld_log.repo;

import com.mes.eld_log.models.TrailerMaster;
import java.util.List;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TrailerMasterRepo extends MongoRepository<TrailerMaster, String> {
   @Query("{ 'trailerId' : ?0 }")
   TrailerMaster findByTrailerId(Integer trailerId);

   @Query("{ 'trailerId' : ?0,'clientId' : ?1 }")
   List<TrailerMaster> findAndViewByTrailerId(Integer trailerId, long clientId);

   @Query("{ 'clientId' : ?0 }")
   List<TrailerMaster> findAllTrailers(long clientId);

   @Aggregation(
      pipeline = {"{$group: { _id: '', maxID: {$max: $trailerId }}}"}
   )
   Object findMaxIdInTrailerMaster();

   @Query(
      value = "{'trailerId' : ?0}",
      delete = true
   )
   TrailerMaster DeleteTrailerById(Integer trailerId);
}
