package com.mes.eld_log.repo;

import com.mes.eld_log.models.ELDSettings;
import java.util.List;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ELDSettingsRepo extends MongoRepository<ELDSettings, String> {
   @Query(
      value = "{'settingId' : ?0}",
      delete = true
   )
   ELDSettings DeleteSettingById(Integer settingId);

   @Aggregation(
      pipeline = {"{$group: { _id: '', maxID: {$max: $settingId }}}"}
   )
   Object findMaxIdInELDSettings();

   @Query("{ 'settingId' : ?0}")
   List<ELDSettings> findAndViewBySettingId(Integer settingId);
}
