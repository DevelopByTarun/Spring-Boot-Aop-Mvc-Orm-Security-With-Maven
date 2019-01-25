package com.app.MavenSpringBootEmbeddedDocumentsWithMongoRepositoryAndMongodbThruAnnotation.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import com.app.MavenSpringBootEmbeddedDocumentsWithMongoRepositoryAndMongodbThruAnnotation.dto.Company;

@Repository
public interface CompanyRepository extends MongoRepository<Company, String>{
	List<Company> findByName(String name);
	
	@Query("{'contact.address': ?0}")
	List<Company> findByAddress(String address);
}
