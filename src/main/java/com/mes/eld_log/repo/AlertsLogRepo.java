package com.mes.eld_log.repo;

import com.mes.eld_log.dtos.AlertsLogViewDto;
import com.mes.eld_log.models.AlertsLog;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AlertsLogRepo extends MongoRepository<AlertsLog, String> {
   @Query("{ 'driverId' : ?0, 'startUtcDateTime' : ?1 }")
   List<AlertsLog> findAndViewByDriverIdAndUtcDateTime(long driverId, long startUtcDateTime);

   @Query("{ 'clientId' : ?0, 'isRead' : ?1 }")
   List<AlertsLogViewDto> findAndViewAllUnreadAlerts(long clientId, int isRead);
}
