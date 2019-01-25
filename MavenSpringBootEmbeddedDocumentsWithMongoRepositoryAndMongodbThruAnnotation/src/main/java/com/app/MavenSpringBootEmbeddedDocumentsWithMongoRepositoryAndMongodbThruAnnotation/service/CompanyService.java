package com.app.MavenSpringBootEmbeddedDocumentsWithMongoRepositoryAndMongodbThruAnnotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.MavenSpringBootEmbeddedDocumentsWithMongoRepositoryAndMongodbThruAnnotation.dto.Company;
import com.app.MavenSpringBootEmbeddedDocumentsWithMongoRepositoryAndMongodbThruAnnotation.repository.CompanyRepository;

@Service
public class CompanyService {
	
	@Autowired
	private CompanyRepository companyRepo;
	
	public void saveCustomer(Company company) {
		companyRepo.save(company);
	}
}
