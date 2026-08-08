package com.mes.eld_log.repo;

import com.mes.eld_log.models.LoginLog;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginLogRepo extends MongoRepository<LoginLog, String> {
   @Query("{ 'employeeId' : ?0 }")
   List<LoginLog> findAndViewLoginLog(Integer employeeId);

   @Query(
      value = "{'employeeId' : ?0}",
      delete = true
   )
   LoginLog deleteAllLoginLogByDriverId(Integer employeeId);

   @Query(
      value = "{'employeeId' : ?0,'receivedTimestamp' : { $gte: ?1, $lte: ?2 }}",
      delete = true
   )
   long deleteAllLoginLogByDriverIdAndDate(Integer employeeId, long startTimestamp, long endTimestamp);

   @Query(
      value = "{'employeeId' : ?0}",
      count = true
   )
   Integer CountLoginByDriverId(Integer employeeId);
}
