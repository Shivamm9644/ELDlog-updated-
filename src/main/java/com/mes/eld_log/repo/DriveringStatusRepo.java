package com.mes.eld_log.repo;

import com.mes.eld_log.dtos.DriveringStatusViewDto;
import com.mes.eld_log.models.DriveringStatus;
import java.util.List;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DriveringStatusRepo extends MongoRepository<DriveringStatus, String> {
   @Query("{ 'driverId' : ?0, 'utcDateTime' : ?1 }")
   DriveringStatusViewDto findAndViewDriverStatusById(long driverId, long utcDateTime);

   @Query("{ 'driverId' : ?0, 'utcDateTime' : ?1 }")
   List<DriveringStatusViewDto> findListAndViewDriverStatusById(long driverId, long utcDateTime);

   @Query("{ 'driverId' : ?0, 'dateTime' : ?1, 'isActive' : { $in: [0, 2] } }")
   List<DriveringStatusViewDto> findAndViewDriverStatusByDate(long driverId, String dateTime);

   @Query("{ 'driverId' : ?0, 'utcDateTime' : { $gte: ?1, $lte: ?2 } }")
   List<DriveringStatus> findAndViewDriverStatusData(long driverId, long startTimestamp, long endTimestamp);

   @Query(
      value = "{'driverId' : ?0}",
      count = true
   )
   Integer CountDriverStatusByDriverId(long driverId);

   @Aggregation(
      pipeline = {"{$group: { _id: '', maxID: {$max: $id }}}"}
   )
   Object findMaxIdInDriveringStatus(long driverId);

   @Query(
      value = "{'driverId' : ?0}",
      delete = true
   )
   DriveringStatus deleteAllDriveringStatusByDriverId(long driverId);

   @Query(
      value = "{'driverId' : ?0, 'utcDateTime' : { $gte: ?1, $lte: ?2 }}",
      delete = true
   )
   long deleteAllDriveringStatusByDriverIdAndDate(long driverId, long startTimestamp, long endTimestamp);

   @Query(
      value = "{'driverId' : ?0, 'utcDateTime' : { $gte: ?1, $lte: ?2 }, 'isVoilation' : ?3}",
      delete = true
   )
   long deleteAllDriveringStatusVoilation(long driverId, long startTimestamp, long endTimestamp, Integer isVoilation);

   @Query(
      value = "{'driverId' : ?0, 'utcDateTime' : { $gte: ?1, $lte: ?2 }, 'isVoilation' : ?3,'voilationHour' : ?4}",
      delete = true
   )
   long deleteAllDriveringStatusVoilationByHour(long driverId, long startTimestamp, long endTimestamp, Integer isVoilation, Integer voilationHour);

   @Query(
      value = "{'driverId' : ?0, 'utcDateTime' : { $gte: ?1, $lte: ?2 }, 'isVoilation' : ?3, 'voilationHour' : ?4}",
      count = true
   )
   Integer countVoilationRecords(long driverId, long startTimestamp, long endTimestamp, Integer isVoilation, Integer voilationHour);

   @Query(
      value = "{ 'driverId': ?0, 'voilationType': ?3, 'utcDateTime': { $gte: ?1, $lte: ?2 } }",
      delete = true
   )
   void deleteVoilationByType(long driverId, long from, long to, int type);

   @Query(
      value = "{ 'driverId': ?0, 'voilationType': ?1, 'utcDateTime': { $gte: ?2, $lte: ?3 } }",
      exists = true
   )
   boolean existsViolationBetweenTime(long driverId, int type, long fromTime, long toTime);
}
