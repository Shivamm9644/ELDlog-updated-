package com.mes.eld_log.repo;

import com.mes.eld_log.models.ExceptionLog;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ExceptionLogRepo extends MongoRepository<ExceptionLog, String> {
   @Query("{ 'driverId' : ?0 }")
   List<ExceptionLog> findAndViewByDriverId(Integer driverId);
}
