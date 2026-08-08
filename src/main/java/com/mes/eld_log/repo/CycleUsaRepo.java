package com.mes.eld_log.repo;

import com.mes.eld_log.models.CycleUsa;
import java.util.List;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CycleUsaRepo extends MongoRepository<CycleUsa, String> {
   @Query("{ 'cycleUsaId' : ?0 }")
   CycleUsa findByCycleUsaId(Integer cycleUsaId);

   @Query("{ 'cycleUsaId' : ?0}")
   List<CycleUsa> findAndViewByCycleUsaId(Integer cycleUsaId);

   @Query("{ 'clientId' : ?0 }")
   List<CycleUsa> findAllCycleUsa(long clientId);

   @Aggregation(
      pipeline = {"{$group: { _id: '', maxID: {$max: $cycleUsaId }}}"}
   )
   Object findMaxIdInCycleUsa();

   @Query(
      value = "{'cycleUsaId' : ?0}",
      delete = true
   )
   CycleUsa DeleteCycleUsaById(Integer cycleUsaId);
}
