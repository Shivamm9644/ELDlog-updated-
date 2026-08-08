package com.mes.eld_log.repo;

import com.mes.eld_log.models.IdlingReport;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IdlingReportRepo extends MongoRepository<IdlingReport, String> {
}
