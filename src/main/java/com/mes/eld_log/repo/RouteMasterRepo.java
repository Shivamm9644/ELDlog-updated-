package com.mes.eld_log.repo;

import com.mes.eld_log.models.RouteMaster;
import java.util.List;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RouteMasterRepo extends MongoRepository<RouteMaster, String> {
   @Query("{ 'routeId' : ?0 }")
   RouteMaster findByRouteId(Integer routeId);

   @Query("{ 'routeId' : ?0,'clientId' : ?1 }")
   List<RouteMaster> findAndViewByRouteId(Integer routeId, long clientId);

   @Query("{ 'clientId' : ?0 }")
   List<RouteMaster> findAllRoutes(long clientId);

   @Aggregation(
      pipeline = {"{$group: { _id: '', maxID: {$max: $routeId }}}"}
   )
   Object findMaxIdInRouteMaster();

   @Query(
      value = "{'routeId' : ?0}",
      delete = true
   )
   RouteMaster DeleteRouteById(Integer routeId);
}
