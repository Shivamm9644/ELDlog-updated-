package com.mes.eld_log.repo;

import com.mes.eld_log.models.LanguageMaster;
import java.util.List;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageMasterRepo extends MongoRepository<LanguageMaster, String> {
   @Query("{ 'languageId' : ?0 }")
   LanguageMaster findByLanguageId(Integer languageId);

   @Query("{ 'languageId' : ?0}")
   List<LanguageMaster> findAndViewByLanguageId(Integer languageId);

   @Query("{ 'clientId' : ?0 }")
   List<LanguageMaster> findAllLanguages(long clientId);

   @Aggregation(
      pipeline = {"{$group: { _id: '', maxID: {$max: $languageId }}}"}
   )
   Object findMaxIdInLanguageMaster();

   @Query(
      value = "{'languageId' : ?0}",
      delete = true
   )
   LanguageMaster DeleteLanguageById(Integer languageId);
}
