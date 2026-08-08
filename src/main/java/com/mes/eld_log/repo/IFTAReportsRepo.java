package com.mes.eld_log.repo;

import com.mes.eld_log.models.IFTAReports;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IFTAReportsRepo extends MongoRepository<IFTAReports, String> {
   @Query("{ 'vehicleId' : ?0, 'fromDate' : ?1, 'toDate' : ?2 }")
   List<IFTAReports> findAndViewIftaReport(String vehicleId, String fromDate, String toDate);

   @Query("{ 'clientId' : ?0}")
   List<IFTAReports> findAndViewIftaReportByClient(long clientId);
}
