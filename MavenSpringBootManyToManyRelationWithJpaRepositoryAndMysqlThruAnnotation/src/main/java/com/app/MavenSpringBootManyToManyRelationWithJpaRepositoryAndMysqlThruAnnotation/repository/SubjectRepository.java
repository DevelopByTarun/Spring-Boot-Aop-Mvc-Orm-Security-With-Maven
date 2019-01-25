package com.app.MavenSpringBootManyToManyRelationWithJpaRepositoryAndMysqlThruAnnotation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.app.MavenSpringBootManyToManyRelationWithJpaRepositoryAndMysqlThruAnnotation.dto.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Integer>{
}
