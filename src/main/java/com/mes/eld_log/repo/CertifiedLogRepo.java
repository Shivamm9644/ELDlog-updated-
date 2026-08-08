package com.mes.eld_log.repo;

import com.mes.eld_log.dtos.CertifiedLogViewDto;
import com.mes.eld_log.models.CertifiedLog;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CertifiedLogRepo extends MongoRepository<CertifiedLog, String> {
   @Query(
      value = "{'driverId' : ?0}",
      count = true
   )
   Integer CountCertifiedLogByDriverId(long driverId);

   @Query(
      value = "{'driverId' : ?0}",
      delete = true
   )
   CertifiedLog deleteAllCertifiedLogByDriverId(long driverId);

   @Query(
      value = "{'driverId' : ?0,'lCertifiedDate' : { $gte: ?1, $lte: ?2 }}",
      delete = true
   )
   long deleteAllCertifiedLogByDriverIdAndDate(long driverId, long startTimestamp, long endTimestamp);

   @Query("{'driverId' : ?0, 'lCertifiedDate' : ?1}")
   CertifiedLogViewDto findAndViewCertifiedLogByDriverId(long driverId, long lCertifiedDate);
}
