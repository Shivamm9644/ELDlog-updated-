package com.mes.eld_log.repo;

import com.mes.eld_log.models.FuelTypeMaster;
import java.util.List;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FuelTypeMasterRepo extends MongoRepository<FuelTypeMaster, String> {
   @Query("{ 'fuelTypeId' : ?0 }")
   FuelTypeMaster findByFuelTypeId(Integer fuelTypeId);

   @Query("{ 'fuelTypeId' : ?0}")
   List<FuelTypeMaster> findAndViewByFuelTypeId(Integer fuelTypeId);

   @Query("{ 'clientId' : ?0 }")
   List<FuelTypeMaster> findAllFuelTypes(long clientId);

   @Aggregation(
      pipeline = {"{$group: { _id: '', maxID: {$max: $fuelTypeId }}}"}
   )
   Object findMaxIdInFuelTypeMaster();

   @Query(
      value = "{'fuelTypeId' : ?0}",
      delete = true
   )
   FuelTypeMaster DeleteFuelTypeById(Integer fuelTypeId);
}
