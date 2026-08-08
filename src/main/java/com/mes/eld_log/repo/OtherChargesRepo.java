package com.mes.eld_log.repo;

import com.mes.eld_log.dtos.OtherChargeViewDto;
import com.mes.eld_log.models.OtherCharges;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface OtherChargesRepo extends MongoRepository<OtherCharges, String> {
   @Query("{ 'dispatchId' : ?0 }")
   List<OtherChargeViewDto> findAndViewByDispatchId(String dispatchId);
}
