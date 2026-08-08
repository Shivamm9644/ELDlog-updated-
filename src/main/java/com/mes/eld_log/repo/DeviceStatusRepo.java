package com.mes.eld_log.repo;

import com.mes.eld_log.models.DeviceStatus;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceStatusRepo extends MongoRepository<DeviceStatus, String> {
   @Query("{ 'driverId' : ?0 }")
   DeviceStatus findByDeviceStatusId(long driverId);

   @Query(
      value = "{ 'driverId' : ?0 }",
      sort = "{ 'addedTimestamp' : -1 }"
   )
   List<DeviceStatus> findAndViewByDeviceStatusId(long driverId);
}
