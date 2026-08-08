package com.mes.eld_log.repo;

import com.mes.eld_log.dtos.DVIRDataCRUDDto;
import com.mes.eld_log.models.DVIRData;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DVIRDataRepo extends MongoRepository<DVIRData, String> {
   @Query(
      value = "{'driverId' : ?0}",
      count = true
   )
   Integer CountDVIRByDriverId(long driverId);

   @Query(
      value = "{'driverId' : ?0}",
      delete = true
   )
   DVIRData deleteAllDVIRDataByDriverId(long driverId);

   @Query(
      value = "{'driverId' : ?0, 'lDateTime' : { $gte: ?1, $lte: ?2 }}",
      delete = true
   )
   long deleteAllDVIRDataByDriverIdAndDate(long driverId, long startTimestamp, long endTimestamp);

   @Query("{'driverId' : ?0, 'lDateTime' : ?1}")
   DVIRDataCRUDDto findAndViewDvirDataByDriverId(long driverId, long lDateTime);

   @Query(
      value = "{'driverId' : ?0, 'timestamp' : ?1}",
      delete = true
   )
   DVIRDataCRUDDto deleteDVIRDataByDriverIdAndTimestamp(long driverId, String timestamp);
}
