package com.mes.eld_log.repo;

import com.mes.eld_log.models.VehicleCondition;
import java.util.List;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleConditionRepo extends MongoRepository<VehicleCondition, String> {
   @Query("{ 'vehicleConditionId' : ?0 }")
   VehicleCondition findByVehicleConditionId(Integer vehicleConditionId);

   @Query("{ 'vehicleConditionId' : ?0,'clientId' : ?1}")
   List<VehicleCondition> findAndViewByVehicleConditionId(Integer vehicleConditionId, long clientId);

   @Query("{ 'clientId' : ?0 }")
   List<VehicleCondition> findAllVehicleConditions(long clientId);

   @Aggregation(
      pipeline = {"{$group: { _id: '', maxID: {$max: $vehicleConditionId }}}"}
   )
   Object findMaxIdInVehicleConditionMaster();

   @Query(
      value = "{'vehicleConditionId' : ?0}",
      delete = true
   )
   VehicleCondition DeleteVehicleConditionById(Integer vehicleConditionId);
}
