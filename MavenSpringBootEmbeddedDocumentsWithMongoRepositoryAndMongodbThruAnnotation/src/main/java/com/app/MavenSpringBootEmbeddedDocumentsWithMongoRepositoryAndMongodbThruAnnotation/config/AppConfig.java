package com.app.MavenSpringBootEmbeddedDocumentsWithMongoRepositoryAndMongodbThruAnnotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import com.app.MavenSpringBootEmbeddedDocumentsWithMongoRepositoryAndMongodbThruAnnotation.service.CompanyService;

@Configuration
@ComponentScan(basePackages = "com.app.MavenSpringBootEmbeddedDocumentsWithMongoRepositoryAndMongodbThruAnnotation")
public class AppConfig {
	
	@Bean(name = "dCompany")
	@Scope("prototype")
	@Lazy
	CompanyService getCompanyService() {
		return new CompanyService();
	}
}
