package com.mes.eld_log.repo;

import com.mes.eld_log.dtos.ReceiverDataViewDto;
import com.mes.eld_log.dtos.ShipperDataViewDto;
import com.mes.eld_log.models.ShipperReceiverDetails;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipperReceiverDetailsRepo extends MongoRepository<ShipperReceiverDetails, String> {
   @Query("{ 'dispatchId' : ?0 }")
   ShipperReceiverDetails findByDispatchId(String dispatchId);

   @Query("{ 'dispatchId' : ?0 }")
   List<ShipperReceiverDetails> findByDispatchSRId(String dispatchId);

   @Query("{ 'dispatchId' : ?0, 'shipperId' : ?1 }")
   List<ShipperDataViewDto> findByDispatchIdOfShipperData(String dispatchId, long shipperId);

   @Query("{ 'dispatchId' : ?0,'receiverId' : ?1 }")
   List<ReceiverDataViewDto> findByDispatchIdOfReceiverData(String dispatchId, long receiverId);
}
