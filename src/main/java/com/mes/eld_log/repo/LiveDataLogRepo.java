package com.mes.eld_log.repo;

import com.mes.eld_log.models.LiveDataLog;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LiveDataLogRepo extends MongoRepository<LiveDataLog, String> {
   @Query("{ 'DriverId' : ?0,'MAC' : ?1 }")
   List<LiveDataLog> findAndViewLiveDataLog(String DriverId, String MAC);
}
