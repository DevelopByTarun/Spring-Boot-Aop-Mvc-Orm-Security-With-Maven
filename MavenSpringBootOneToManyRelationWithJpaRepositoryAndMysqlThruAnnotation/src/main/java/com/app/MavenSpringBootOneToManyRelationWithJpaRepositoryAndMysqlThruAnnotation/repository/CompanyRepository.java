package com.app.MavenSpringBootOneToManyRelationWithJpaRepositoryAndMysqlThruAnnotation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.app.MavenSpringBootOneToManyRelationWithJpaRepositoryAndMysqlThruAnnotation.dto.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Integer>{
}