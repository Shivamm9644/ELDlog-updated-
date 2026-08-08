package com.mes.eld_log.repo;

import com.mes.eld_log.models.Disclaimer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisclaimerRepo extends MongoRepository<Disclaimer, String> {
}
