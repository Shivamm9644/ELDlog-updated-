package com.mes.eld_log.repo;

import com.mes.eld_log.models.CycleCanada;
import java.util.List;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CycleCanadaRepo extends MongoRepository<CycleCanada, String> {
   @Query("{ 'cycleCanadaId' : ?0 }")
   CycleCanada findByCycleCanadaId(Integer cycleCanadaId);

   @Query("{ 'cycleCanadaId' : ?0}")
   List<CycleCanada> findAndViewByCycleCanadaId(Integer cycleUsaId);

   @Query("{ 'clientId' : ?0 }")
   List<CycleCanada> findAllCycleCanada(long clientId);

   @Aggregation(
      pipeline = {"{$group: { _id: '', maxID: {$max: $cycleCanadaId }}}"}
   )
   Object findMaxIdInCycleCanada();

   @Query(
      value = "{'cycleCanadaId' : ?0}",
      delete = true
   )
   CycleCanada DeleteCycleCanadaById(Integer cycleCanadaId);
}
