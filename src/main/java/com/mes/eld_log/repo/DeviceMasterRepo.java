package com.mes.eld_log.repo;

import com.mes.eld_log.dtos.DeviceMasterViewDto;
import com.mes.eld_log.models.DeviceMaster;
import java.util.List;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceMasterRepo extends MongoRepository<DeviceMaster, String> {
   @Query("{ 'deviceId' : ?0 }")
   DeviceMaster findByDeviceId(Integer deviceId);

   @Query("{ 'deviceId' : ?0,'clientId' : ?1 }")
   List<DeviceMaster> findAndViewByDeviceId(Integer deviceId, long clientId);

   @Query("{ 'deviceId' : ?0,'clientId' : ?1 }")
   List<DeviceMasterViewDto> findAndViewByDeviceId1(Integer deviceId, long clientId);

   @Query("{ 'clientId' : ?0 }")
   List<DeviceMaster> findAllDevices(long clientId);

   @Query("{ 'clientId' : ?0 }")
   List<DeviceMasterViewDto> findAllDeviceData(long clientId);

   @Aggregation(
      pipeline = {"{$group: { _id: '', maxID: {$max: $deviceId }}}"}
   )
   Object findMaxIdInDeviceMaster();

   @Query(
      value = "{'deviceId' : ?0}",
      delete = true
   )
   DeviceMaster DeleteDeviceById(Integer deviceId);

   @Query("{ 'macId' : { $regex: ?0, $options: 'i' }, 'clientId' : ?1 }")
   DeviceMaster findFirstByMacIdIgnoreCaseAndClientId(String macId, long clientId);

   @Query("{ 'macId' : { $regex: ?0, $options: 'i' } }")
   DeviceMaster findFirstByMacIdIgnoreCase(String macId);
}
