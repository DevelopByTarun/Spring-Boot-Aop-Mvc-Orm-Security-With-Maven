package com.app.MavenSpringBootAopCrudWithJdbcTemplateAndMysqlThruAnnotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import com.app.MavenSpringBootAopCrudWithJdbcTemplateAndMysqlThruAnnotation.dao.IPersonDAO;
import com.app.MavenSpringBootAopCrudWithJdbcTemplateAndMysqlThruAnnotation.service.PersonDAOImpl;

@Configuration
@ComponentScan(basePackages = "com.app.MavenSpringBootAopCrudWithJdbcTemplateAndMysqlThruAnnotation")
@EnableTransactionManagement
@EnableAspectJAutoProxy
public class PersonConfig {
	
	@Bean(name = "iperson")
	@Scope("prototype")
	@Lazy
	IPersonDAO getIPersonDAO() {
		return new PersonDAOImpl();
	}
}
