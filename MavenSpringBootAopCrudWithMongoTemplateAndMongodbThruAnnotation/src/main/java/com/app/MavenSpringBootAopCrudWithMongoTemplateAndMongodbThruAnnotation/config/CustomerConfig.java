package com.app.MavenSpringBootAopCrudWithMongoTemplateAndMongodbThruAnnotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import com.app.MavenSpringBootAopCrudWithMongoTemplateAndMongodbThruAnnotation.dao.ICustomerDAO;
import com.app.MavenSpringBootAopCrudWithMongoTemplateAndMongodbThruAnnotation.service.CustomerService;

@Configuration
@ComponentScan(basePackages="")
@EnableAspectJAutoProxy
public class CustomerConfig {
	
	@Bean(name = "icustomer")
	@Scope("prototype")
	@Lazy
	ICustomerDAO getICustomerDAO() {
		return new CustomerService();
	}
}
