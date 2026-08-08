package com.mes.eld_log.repo;

import com.mes.eld_log.models.PaymentStatusMaster;
import java.util.List;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentStatusMasterRepo extends MongoRepository<PaymentStatusMaster, String> {
   @Query("{ 'paymentStatusId' : ?0 }")
   PaymentStatusMaster findByPaymentStatusId(Integer paymentStatusId);

   @Query("{ 'paymentStatusId' : ?0}")
   List<PaymentStatusMaster> findAndViewByPaymentStatusId(Integer paymentStatusId);

   @Query("{ 'clientId' : ?0 }")
   List<PaymentStatusMaster> findAllPaymentStatus(long clientId);

   @Aggregation(
      pipeline = {"{$group: { _id: '', maxID: {$max: $paymentStatusId }}}"}
   )
   Object findMaxIdInPaymentStatusMaster();

   @Query(
      value = "{'paymentStatusId' : ?0}",
      delete = true
   )
   PaymentStatusMaster DeletePaymentStatusById(Integer paymentStatusId);
}
