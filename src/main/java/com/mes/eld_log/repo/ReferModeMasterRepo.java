package com.mes.eld_log.repo;

import com.mes.eld_log.models.ReferModeMaster;
import java.util.List;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ReferModeMasterRepo extends MongoRepository<ReferModeMaster, String> {
   @Query("{ 'referModeId' : ?0 }")
   ReferModeMaster findByReferModeId(Integer referModeId);

   @Query("{ 'referModeId' : ?0}")
   List<ReferModeMaster> findAndViewByReferModeId(Integer referModeId);

   @Query("{ 'clientId' : ?0 }")
   List<ReferModeMaster> findAllReferMode(long clientId);

   @Aggregation(
      pipeline = {"{$group: { _id: '', maxID: {$max: $referModeId }}}"}
   )
   Object findMaxIdInReferModeMaster();

   @Query(
      value = "{'referModeId' : ?0}",
      delete = true
   )
   ReferModeMaster DeleteReferModeById(Integer referModeId);
}
