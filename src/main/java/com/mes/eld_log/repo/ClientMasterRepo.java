package com.mes.eld_log.repo;

import com.mes.eld_log.models.ClientMaster;
import java.util.List;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientMasterRepo extends MongoRepository<ClientMaster, String> {
   @Query("{ 'clientId' : ?0 }")
   ClientMaster findByClientId(Integer clientId);

   @Query("{ 'clientId' : ?0 }")
   List<ClientMaster> findAndViewByClientId(Integer clientId);

   @Query("{ 'companyId' : ?0 }")
   List<ClientMaster> findAndViewByCompanyId(String companyId);

   @Aggregation(
      pipeline = {"{$group: { _id: '', maxID: {$max: $clientId }}}"}
   )
   Object findMaxIdInClientMaster();

   @Query(
      value = "{'clientId' : ?0}",
      delete = true
   )
   ClientMaster DeleteClientById(Integer clientId);

   boolean existsByClientName(String clientName);

   boolean existsByDotNo(String dotNo);
}
