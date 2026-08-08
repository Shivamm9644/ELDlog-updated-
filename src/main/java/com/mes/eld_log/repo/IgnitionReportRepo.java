package com.mes.eld_log.repo;

import com.mes.eld_log.models.IgnitionReport;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IgnitionReportRepo extends MongoRepository<IgnitionReport, String> {
}
