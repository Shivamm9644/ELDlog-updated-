package com.mes.eld_log.repo;

import com.mes.eld_log.models.DeviceModalMaster;
import java.util.List;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceModalMasterRepo extends MongoRepository<DeviceModalMaster, String> {
   @Query("{ 'deviceModalId' : ?0 }")
   DeviceModalMaster findByDeviceModalId(Integer deviceModalId);

   @Query("{ 'deviceModalId' : ?0}")
   List<DeviceModalMaster> findAndViewByDeviceModalId(Integer deviceModalId);

   @Query("{ 'clientId' : ?0 }")
   List<DeviceModalMaster> findAllDeviceModals(long clientId);

   @Aggregation(
      pipeline = {"{$group: { _id: '', maxID: {$max: $deviceModalId }}}"}
   )
   Object findMaxIdInDeviceModal();

   @Query(
      value = "{'deviceModalId' : ?0}",
      delete = true
   )
   DeviceModalMaster DeleteDeviceModalById(Integer deviceModalId);
}
