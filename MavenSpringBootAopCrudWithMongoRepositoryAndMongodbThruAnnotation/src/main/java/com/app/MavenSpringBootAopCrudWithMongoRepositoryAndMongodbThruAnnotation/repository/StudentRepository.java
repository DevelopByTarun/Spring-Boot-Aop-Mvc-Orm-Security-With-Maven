package com.app.MavenSpringBootAopCrudWithMongoRepositoryAndMongodbThruAnnotation.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.app.MavenSpringBootAopCrudWithMongoRepositoryAndMongodbThruAnnotation.dto.StudentDTO;

@Repository
public interface StudentRepository extends MongoRepository<StudentDTO, String> {
	
}
