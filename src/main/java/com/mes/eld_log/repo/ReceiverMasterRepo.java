package com.mes.eld_log.repo;

import com.mes.eld_log.models.ReceiverMaster;
import java.util.List;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ReceiverMasterRepo extends MongoRepository<ReceiverMaster, String> {
   @Query("{ 'receiverId' : ?0 }")
   ReceiverMaster findByReceiverId(Integer receiverId);

   @Query("{ 'receiverId' : ?0, 'clientId' : ?1 }")
   List<ReceiverMaster> findAndViewByReceiverId(Integer receiverId, long clientId);

   @Query("{ 'clientId' : ?0 }")
   List<ReceiverMaster> findAllReceivers(long clientId);

   @Aggregation(
      pipeline = {"{$group: { _id: '', maxID: {$max: $receiverId }}}"}
   )
   Object findMaxIdInReceiverMaster();

   @Query(
      value = "{'receiverId' : ?0}",
      delete = true
   )
   ReceiverMaster DeleteReceiverById(Integer receiverId);
}
