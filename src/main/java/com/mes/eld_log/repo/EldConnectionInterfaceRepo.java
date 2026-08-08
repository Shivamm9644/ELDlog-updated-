package com.mes.eld_log.repo;

import com.mes.eld_log.models.EldConnectionInterface;
import java.util.List;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EldConnectionInterfaceRepo extends MongoRepository<EldConnectionInterface, String> {
   @Query("{ 'eldConnectionInterfaceId' : ?0 }")
   EldConnectionInterface findByEldConnectionInterfaceId(Integer eldConnectionInterfaceId);

   @Query("{ 'eldConnectionInterfaceId' : ?0}")
   List<EldConnectionInterface> findAndViewByEldConnectionInterfaceId(Integer eldConnectionInterfaceId);

   @Query("{ 'clientId' : ?0 }")
   List<EldConnectionInterface> findAllEldConnectionInterface(long clientId);

   @Aggregation(
      pipeline = {"{$group: { _id: '', maxID: {$max: $eldConnectionInterfaceId }}}"}
   )
   Object findMaxIdInEldConnectionInterface();

   @Query(
      value = "{'eldConnectionInterfaceId' : ?0}",
      delete = true
   )
   EldConnectionInterface DeleteEldConnectionInterfaceById(Integer eldConnectionInterfaceId);
}
