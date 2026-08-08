package com.mes.eld_log.repo;

import com.mes.eld_log.models.CargoTypeMaster;
import java.util.List;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CargoTypeMasterRepo extends MongoRepository<CargoTypeMaster, String> {
   @Query("{ 'cargoTypeId' : ?0 }")
   CargoTypeMaster findByCargoTypeId(Integer cargoTypeId);

   @Query("{ 'cargoTypeId' : ?0 }")
   List<CargoTypeMaster> findAndViewByCargoTypeId(Integer cargoTypeId);

   @Query("{ 'clientId' : ?0 }")
   List<CargoTypeMaster> findAndllCargoTypes(long clientId);

   @Aggregation(
      pipeline = {"{$group: { _id: '', maxID: {$max: $cargoTypeId }}}"}
   )
   Object findMaxIdInCargoTypeMaster();

   @Query(
      value = "{'cargoTypeId' : ?0}",
      delete = true
   )
   CargoTypeMaster DeleteCargoTypeById(Integer cargoTypeId);
}
