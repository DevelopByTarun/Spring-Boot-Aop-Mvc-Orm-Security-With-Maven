package com.app.MavenSpringBootManyToManyRelationWithJpaRepositoryAndMysqlThruAnnotation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.app.MavenSpringBootManyToManyRelationWithJpaRepositoryAndMysqlThruAnnotation.dto.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{
}
