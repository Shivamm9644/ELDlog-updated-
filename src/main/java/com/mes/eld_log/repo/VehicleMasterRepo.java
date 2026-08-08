package com.mes.eld_log.repo;

import com.mes.eld_log.dtos.VehicleMasterViewDto;
import com.mes.eld_log.models.VehicleMaster;
import java.util.List;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleMasterRepo extends MongoRepository<VehicleMaster, String> {
   @Query("{ 'vehicleId' : ?0 }")
   VehicleMaster findByVehicleId(Integer vehicleId);

   @Query("{ 'vehicleId' : ?0,'clientId' : ?1 }")
   List<VehicleMasterViewDto> findAndViewByVehicleId(Integer vehicleId, long clientId);

   @Query("{ 'clientId' : ?0 }")
   List<VehicleMasterViewDto> findAllVehicles(long clientId);

   @Query("{}")
   List<VehicleMasterViewDto> findAllVehicleList();

   @Query("{ 'clientId' : ?0, 'status' : ?1 }")
   List<VehicleMasterViewDto> findAllActiveVehicles(long clientId, String status);

   @Aggregation(
      pipeline = {"{$group: { _id: '', maxID: {$max: $vehicleId }}}"}
   )
   Object findMaxIdInVehicleMaster();

   @Query(
      value = "{'vehicleId' : ?0}",
      delete = true
   )
   VehicleMaster DeleteVehicleById(Integer vehicleId);

   @Query("{ 'clientId' : ?0 }")
   List<VehicleMaster> findByClientId(long clientId);

   @Query("{ 'vehicleNo' : { $regex: ?0, $options: 'i' }, 'clientId' : ?1 }")
   VehicleMaster findFirstByVehicleNoIgnoreCaseAndClientId(String vehicleNo, long clientId);

   @Query("{ 'vehicleNo' : { $regex: ?0, $options: 'i' } }")
   VehicleMaster findFirstByVehicleNoIgnoreCase(String vehicleNo);
}
