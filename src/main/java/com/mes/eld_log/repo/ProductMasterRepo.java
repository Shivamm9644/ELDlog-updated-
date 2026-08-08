package com.mes.eld_log.repo;

import com.mes.eld_log.models.ProductMaster;
import java.util.List;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductMasterRepo extends MongoRepository<ProductMaster, String> {
   @Query("{ 'productId' : ?0 }")
   ProductMaster findByProductId(Integer productId);

   @Query("{ 'productId' : ?0,'clientId' : ?1 }")
   List<ProductMaster> findAndViewByProductId(Integer productId, long clientId);

   @Query("{ 'clientId' : ?0 }")
   List<ProductMaster> findAllProducts(long clientId);

   @Aggregation(
      pipeline = {"{$group: { _id: '', maxID: {$max: $productId }}}"}
   )
   Object findMaxIdInProductMaster();

   @Query(
      value = "{'productId' : ?0}",
      delete = true
   )
   ProductMaster DeleteProductById(Integer productId);
}
