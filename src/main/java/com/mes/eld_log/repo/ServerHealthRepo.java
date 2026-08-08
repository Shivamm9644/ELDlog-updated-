package com.mes.eld_log.repo;

import com.mes.eld_log.models.ServerHealth;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServerHealthRepo extends MongoRepository<ServerHealth, String> {
   ServerHealth findTopByOrderByReceivedTimestampDesc();
}
