package com.mes.eld_log.repo;

import com.mes.eld_log.models.DriverStatusLog;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverStatusLogRepo extends MongoRepository<DriverStatusLog, String> {
   @Query("{ 'logDataId' : ?0}")
   DriverStatusLog findAndViewDriverStatusLogById(String logDataId);

   @Query("{ 'logDataId' : ?0}")
   List<DriverStatusLog> CheckDriverStatusLogById(String logDataId);

   @Query("{ 'driverId' : ?0, 'status' : ?1}")
   List<DriverStatusLog> findAndViewByDriverId(long driverId, String status);

   @Query("{ 'logDataId' : ?0, 'logType' : ?1}")
   DriverStatusLog findAndViewDriverStatusLogById1(String logDataId, String logType);

   @Query(
      value = "{'driverId' : ?0}",
      delete = true
   )
   DriverStatusLog deleteAllDriveringStatusLogByDriverId(long driverId);

   @Query(
      value = "{'driverId' : ?0}",
      count = true
   )
   Integer CountDriverStatusLogByDriverId(long driverId);

   @Query(
      value = "{'driverId' : ?0, 'dateTime' : { $gte: ?1, $lte: ?2 }}",
      delete = true
   )
   long deleteAllDriveringStatusLogByDriverIdAndDate(long driverId, long startTimestamp, long endTimestamp);
}
