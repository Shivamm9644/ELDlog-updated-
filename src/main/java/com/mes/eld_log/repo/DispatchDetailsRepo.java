package com.mes.eld_log.repo;

import com.mes.eld_log.dtos.DispatchDetailViewDto;
import com.mes.eld_log.models.DispatchDetails;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DispatchDetailsRepo extends MongoRepository<DispatchDetails, String> {
   @Query("{ 'addedTimestamp' : ?0 }")
   DispatchDetailViewDto findDispatchDetailsByTimestamp(long addedTimestamp);

   @Query("{ 'addedTimestamp' : ?0 }")
   List<DispatchDetailViewDto> findAndViewDispatchDetailsByTimestamp(long addedTimestamp);

   @Query("{'clientId' : ?0}")
   List<DispatchDetailViewDto> findAllDispatchDetails(long clientId);

   @Query("{ '_id' : ?0, 'clientId' : ?1 }")
   List<DispatchDetailViewDto> findAndViewDispatchDetailsById(String _id, long clientId);
}
