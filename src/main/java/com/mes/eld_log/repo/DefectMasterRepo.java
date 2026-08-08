package com.mes.eld_log.repo;

import com.mes.eld_log.models.DefectMaster;
import java.util.List;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DefectMasterRepo extends MongoRepository<DefectMaster, String> {
   @Query("{ 'defectId' : ?0 }")
   DefectMaster findByDefectMasterId(Integer defectId);

   @Query("{ 'defectId' : ?0}")
   List<DefectMaster> findAndViewByDefectMasterId(Integer defectId);

   @Query("{ 'clientId' : ?0 }")
   List<DefectMaster> findAllDefectMaster(long clientId);

   @Aggregation(
      pipeline = {"{$group: { _id: '', maxID: {$max: $defectId }}}"}
   )
   Object findMaxIdInDefectMaster();

   @Query(
      value = "{'defectId' : ?0}",
      delete = true
   )
   DefectMaster DeleteDefectMasterById(Integer defectId);
}
