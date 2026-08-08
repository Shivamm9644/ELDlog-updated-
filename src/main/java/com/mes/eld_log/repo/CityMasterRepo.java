package com.mes.eld_log.repo;

import com.mes.eld_log.models.CityMaster;
import java.util.List;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CityMasterRepo extends MongoRepository<CityMaster, String> {
   @Query("{ 'cityId' : ?0 }")
   CityMaster findByCityId(Integer cityId);

   @Query("{ 'cityId' : ?0}")
   List<CityMaster> findAndViewByCityId(Integer cityId);

   @Query("{ 'clientId' : ?0 }")
   List<CityMaster> findAllCities(long clientId);

   @Aggregation(
      pipeline = {"{$group: { _id: '', maxID: {$max: $cityId }}}"}
   )
   Object findMaxIdInCityMaster();

   @Query(
      value = "{'cityId' : ?0}",
      delete = true
   )
   CityMaster DeleteCityById(Integer cityId);
}
