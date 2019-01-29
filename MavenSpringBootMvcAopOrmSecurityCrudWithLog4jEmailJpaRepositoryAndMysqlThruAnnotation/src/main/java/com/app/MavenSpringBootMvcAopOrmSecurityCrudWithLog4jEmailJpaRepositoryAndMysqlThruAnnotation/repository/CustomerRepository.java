package com.app.MavenSpringBootMvcAopOrmSecurityCrudWithLog4jEmailJpaRepositoryAndMysqlThruAnnotation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.app.MavenSpringBootMvcAopOrmSecurityCrudWithLog4jEmailJpaRepositoryAndMysqlThruAnnotation.model.CustomerDTO;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerDTO, Integer> {

}
