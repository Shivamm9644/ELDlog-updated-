package com.mes.eld_log.repo;

import com.mes.eld_log.models.Simulator;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SimulatorRepo extends MongoRepository<Simulator, String> {
   @Query(
      value = "{'_id' : ?0}",
      delete = true
   )
   Simulator DeleteSimulatorById(ObjectId _id);
}
