package com.mes.eld_log.repo;

import com.mes.eld_log.models.ELDSupport;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ELDSupportRepo extends MongoRepository<ELDSupport, String> {
}
