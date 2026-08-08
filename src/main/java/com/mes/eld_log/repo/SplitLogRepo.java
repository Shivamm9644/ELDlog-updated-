package com.mes.eld_log.repo;

import com.mes.eld_log.models.SplitLog;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SplitLogRepo extends MongoRepository<SplitLog, String> {
   @Query("{ 'driverId' : ?0 }")
   List<SplitLog> findSplitLogByDriverId(long driverId);

   @Query(
      value = "{'driverId' : ?0}",
      delete = true
   )
   long deleteAllSplitLogByDriverId(long driverId);
}
