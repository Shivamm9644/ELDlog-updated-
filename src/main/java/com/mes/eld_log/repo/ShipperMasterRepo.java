package com.mes.eld_log.repo;

import com.mes.eld_log.models.ShipperMaster;
import java.util.List;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipperMasterRepo extends MongoRepository<ShipperMaster, String> {
   @Query("{ 'shipperId' : ?0 }")
   ShipperMaster findByShipperId(Integer shipperId);

   @Query("{ 'shipperId' : ?0,'clientId' : ?1 }")
   List<ShipperMaster> findAndViewByShipperId(Integer shipperId, long clientId);

   @Query("{ 'clientId' : ?0 }")
   List<ShipperMaster> findAllShippers(long clientId);

   @Aggregation(
      pipeline = {"{$group: { _id: '', maxID: {$max: $shipperId }}}"}
   )
   Object findMaxIdInShipperMaster();

   @Query(
      value = "{'shipperId' : ?0}",
      delete = true
   )
   ShipperMaster DeleteShipperById(Integer shipperId);
}
