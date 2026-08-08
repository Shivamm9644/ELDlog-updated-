package com.mes.eld_log.repo;

import com.mes.eld_log.models.CountryMaster;
import java.util.List;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryMasterRepo extends MongoRepository<CountryMaster, String> {
   @Query("{ 'countryId' : ?0 }")
   CountryMaster findByCountryId(Integer countryId);

   @Query("{ 'countryId' : ?0}")
   List<CountryMaster> findAndViewByCountryId(Integer countryId);

   @Query("{ 'clientId' : ?0 }")
   List<CountryMaster> findAllCountries(long clientId);

   @Aggregation(
      pipeline = {"{$group: { _id: '', maxID: {$max: $countryId }}}"}
   )
   Object findMaxIdInCountryMaster();

   @Query(
      value = "{'countryId' : ?0}",
      delete = true
   )
   CountryMaster DeleteCountryById(Integer countryId);
}
