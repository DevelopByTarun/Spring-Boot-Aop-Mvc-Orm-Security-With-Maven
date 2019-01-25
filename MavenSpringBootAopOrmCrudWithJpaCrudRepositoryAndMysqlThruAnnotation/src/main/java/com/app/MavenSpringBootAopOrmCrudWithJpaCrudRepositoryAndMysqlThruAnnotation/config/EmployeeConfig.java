package com.app.MavenSpringBootAopOrmCrudWithJpaCrudRepositoryAndMysqlThruAnnotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import com.app.MavenSpringBootAopOrmCrudWithJpaCrudRepositoryAndMysqlThruAnnotation.dao.IEmployeeDAO;
import com.app.MavenSpringBootAopOrmCrudWithJpaCrudRepositoryAndMysqlThruAnnotation.service.EmployeeServiceImple;

@Configuration
@EnableTransactionManagement
@EnableAspectJAutoProxy
@EnableJpaRepositories("com.app.MavenSpringBootAopOrmCrudWithJpaCrudRepositoryAndMysqlThruAnnotation.repository")
@ComponentScan(basePackages = "com.app.MavenSpringBootAopOrmCrudWithJpaCrudRepositoryAndMysqlThruAnnotation")
public class EmployeeConfig {
	
	@Bean(name = "employeeDAO")
	@Scope("prototype")
	@Lazy
	IEmployeeDAO getIEmployeeDAO() {
		return new EmployeeServiceImple();
	}
}
