package com.mes.eld_log.repo;

import com.mes.eld_log.models.CompanyMaster;
import java.util.List;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyMasterRepo extends MongoRepository<CompanyMaster, String> {
   @Query("{ 'companyId' : ?0 }")
   CompanyMaster findByCompanyId(Integer companyId);

   @Query("{ 'companyId' : ?0}")
   List<CompanyMaster> findAndViewByCompanyId(Integer companyId);

   @Query("{ 'clientId' : ?0 }")
   List<CompanyMaster> findAllCompanies(long clientId);

   @Aggregation(
      pipeline = {"{$group: { _id: '', maxID: {$max: $companyId }}}"}
   )
   Object findMaxIdInCompanyMaster();

   @Query(
      value = "{'companyId' : ?0}",
      delete = true
   )
   CompanyMaster DeleteCompanyById(Integer companyId);
}
