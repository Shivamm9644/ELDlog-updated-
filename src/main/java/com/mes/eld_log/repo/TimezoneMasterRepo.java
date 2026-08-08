package com.mes.eld_log.repo;

import com.mes.eld_log.models.TimezoneMaster;
import java.util.List;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TimezoneMasterRepo extends MongoRepository<TimezoneMaster, String> {
   @Query("{ 'timezoneId' : ?0 }")
   TimezoneMaster findByTimezoneId(Integer timezoneId);

   @Query("{ 'timezoneId' : ?0}")
   List<TimezoneMaster> findAndViewByTimezoneId(Integer timezoneId);

   @Query("{ 'clientId' : ?0 }")
   List<TimezoneMaster> findAllTimezones(long clientId);

   @Aggregation(
      pipeline = {"{$group: { _id: '', maxID: {$max: $timezoneId }}}"}
   )
   Object findMaxIdInTimezoneMaster();

   @Query(
      value = "{'timezoneId' : ?0}",
      delete = true
   )
   TimezoneMaster DeleteTimezoneById(Integer timezoneId);
}
