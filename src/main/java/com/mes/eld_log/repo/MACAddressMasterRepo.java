package com.mes.eld_log.repo;

import com.mes.eld_log.models.MACAddressMaster;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MACAddressMasterRepo extends MongoRepository<MACAddressMaster, String> {
   @Query("{ 'driverId' : ?0 }")
   MACAddressMaster findByMACAddressMasterId(long driverId);

   @Query("{ 'vehicleId' : ?0 }")
   List<MACAddressMaster> findByMACAddressMasterByVehicleId(long vehicleId);

   @Query("{ 'driverId' : ?0}")
   List<MACAddressMaster> findAndViewByMACAddressMasterId(long driverId);
}
