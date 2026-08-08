package com.mes.eld_log.repo;

import com.mes.eld_log.models.VehicleTypeMaster;
import java.util.List;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleTypeMasterRepo extends MongoRepository<VehicleTypeMaster, String> {
   @Query("{ 'vehicleTypeId' : ?0 }")
   VehicleTypeMaster findByVehicleTypeId(Integer vehicleTypeId);

   @Query("{ 'vehicleTypeId' : ?0, 'clientId' : ?1 }")
   List<VehicleTypeMaster> findAndViewByVehicleTypeId(Integer vehicleTypeId, long clientId);

   @Query("{ 'clientId' : ?0 }")
   List<VehicleTypeMaster> findAllVehicleTypes(long clientId);

   @Aggregation(
      pipeline = {"{$group: { _id: '', maxID: {$max: $vehicleTypeId }}}"}
   )
   Object findMaxIdInVehicleTypeMaster();

   @Query(
      value = "{'vehicleTypeId' : ?0}",
      delete = true
   )
   VehicleTypeMaster DeleteVehicleTypeById(Integer vehicleTypeId);
}
