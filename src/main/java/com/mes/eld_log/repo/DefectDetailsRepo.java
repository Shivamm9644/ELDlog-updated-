package com.mes.eld_log.repo;

import com.mes.eld_log.dtos.DefectDetailCRUDDto;
import com.mes.eld_log.models.DefectDetails;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DefectDetailsRepo extends MongoRepository<DefectDetails, String> {
   @Query("{'driverId' : ?0, 'lDateTime' : ?1}")
   DefectDetailCRUDDto findAndViewDefectDataByDriverId(long driverId, long lDateTime);

   @Query("{'dvirId' : ?0}")
   List<DefectDetailCRUDDto> findAndViewDefectDataByDvirId(String dvirId);

   @Query(
      value = "{'dvirId' : ?0}",
      delete = true
   )
   long DeleteAllDVIRDataByDriverIdAndDate(String dvirId);
}
