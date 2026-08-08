package com.mes.eld_log.repo;

import com.mes.eld_log.models.ELDLogData;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ELDLogDataRepo extends MongoRepository<ELDLogData, String> {
}
