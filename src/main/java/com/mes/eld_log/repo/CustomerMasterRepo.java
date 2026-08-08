package com.mes.eld_log.repo;

import com.mes.eld_log.models.CustomerMaster;
import java.util.List;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerMasterRepo extends MongoRepository<CustomerMaster, String> {
   @Query("{ 'customerId' : ?0 }")
   CustomerMaster findByCustomerId(Integer customerId);

   @Query("{ 'customerId' : ?0, 'clientId' : ?1 }")
   List<CustomerMaster> findAndViewByCustomerId(Integer customerId, long clientId);

   @Query("{ 'clientId' : ?0 }")
   List<CustomerMaster> findAllCustomers(long clientId);

   @Aggregation(
      pipeline = {"{$group: { _id: '', maxID: {$max: $customerId }}}"}
   )
   Object findMaxIdInCustomerMaster();

   @Query(
      value = "{'customerId' : ?0}",
      delete = true
   )
   CustomerMaster DeleteCustomerById(Integer customerId);
}
