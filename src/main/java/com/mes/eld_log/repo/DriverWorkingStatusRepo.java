package com.mes.eld_log.repo;

import com.mes.eld_log.models.DriverWorkingStatus;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverWorkingStatusRepo extends MongoRepository<DriverWorkingStatus, String> {
   @Query("{ 'driverId' : ?0}")
   DriverWorkingStatus findAndViewDriverWorkingstatusByDriverId(long driverId);

   @Query("{ 'driverId' : ?0}")
   List<DriverWorkingStatus> findAndViewDriverWorkingstatusById(long driverId);
}
