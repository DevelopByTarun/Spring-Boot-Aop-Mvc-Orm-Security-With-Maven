package com.app.MavenSpringBootAopOrmCrudWithJpaCrudRepositoryAndMysqlThruAnnotation.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.app.MavenSpringBootAopOrmCrudWithJpaCrudRepositoryAndMysqlThruAnnotation.dto.EmployeeDTO;

@Repository
public interface EmployeeRepository extends CrudRepository<EmployeeDTO, Integer> {

}
