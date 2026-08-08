package com.mes.eld_log.repo;

import com.mes.eld_log.models.ELDOta;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ELDOtaRepo extends MongoRepository<ELDOta, String> {
   @Query(
      value = "{'otaId' : ?0}",
      delete = true
   )
   ELDOta deleteELDOtaById(Integer otaId);

   @Aggregation(
      pipeline = {"{$group: { _id: '', maxID: {$max: $otaId }}}"}
   )
   Object findMaxIdInELDOta();
}
