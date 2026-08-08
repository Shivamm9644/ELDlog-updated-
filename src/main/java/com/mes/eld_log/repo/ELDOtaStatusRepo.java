package com.mes.eld_log.repo;

import com.mes.eld_log.models.ELDOtaStatus;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ELDOtaStatusRepo extends MongoRepository<ELDOtaStatus, String> {
   @Aggregation(
      pipeline = {"{$group: { _id: '', maxID: {$max: $otaStatusId }}}"}
   )
   Object findMaxIdInELDOtaStatus();
}
