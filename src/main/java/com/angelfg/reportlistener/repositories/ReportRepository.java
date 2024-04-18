package com.angelfg.reportlistener.repositories;

import com.angelfg.reportlistener.documents.ReportDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReportRepository extends MongoRepository<ReportDocument, String> {

}
