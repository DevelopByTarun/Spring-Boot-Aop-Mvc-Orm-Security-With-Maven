package com.app.MavenSpringBootAopCrudWithMongoRepositoryAndMongodbThruAnnotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import com.app.MavenSpringBootAopCrudWithMongoRepositoryAndMongodbThruAnnotation.dao.IStudentDAO;
import com.app.MavenSpringBootAopCrudWithMongoRepositoryAndMongodbThruAnnotation.service.StudentService;

@Configuration
@ComponentScan(basePackages = "com.app.MavenSpringBootAopCrudWithMongoRepositoryAndMongodbThruAnnotation")
@EnableMongoRepositories("com.app.MavenSpringBootAopCrudWithMongoRepositoryAndMongodbThruAnnotation.repository")
@EnableAspectJAutoProxy
public class StudentConfig {
	
	@Bean(name = "myService")
	IStudentDAO getIStudentDAO() {
		return new StudentService();
	}
}
