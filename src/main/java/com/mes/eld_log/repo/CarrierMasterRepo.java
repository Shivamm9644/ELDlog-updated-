package com.mes.eld_log.repo;

import com.mes.eld_log.models.CarrierMaster;
import java.util.List;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CarrierMasterRepo extends MongoRepository<CarrierMaster, String> {
   @Query("{ 'carrierId' : ?0 }")
   CarrierMaster findByCarrierId(Integer carrierId);

   @Query("{ 'carrierId' : ?0, 'clientId' : ?1 }")
   List<CarrierMaster> findAndViewByCarrierId(Integer carrierId, long clientId);

   @Query("{ 'clientId' : ?0 }")
   List<CarrierMaster> findAllCarriers(long clientId);

   @Aggregation(
      pipeline = {"{$group: { _id: '', maxID: {$max: $carrierId }}}"}
   )
   Object findMaxIdInCarrierMaster();

   @Query(
      value = "{'carrierId' : ?0}",
      delete = true
   )
   CarrierMaster DeleteCarrierById(Integer carrierId);
}
