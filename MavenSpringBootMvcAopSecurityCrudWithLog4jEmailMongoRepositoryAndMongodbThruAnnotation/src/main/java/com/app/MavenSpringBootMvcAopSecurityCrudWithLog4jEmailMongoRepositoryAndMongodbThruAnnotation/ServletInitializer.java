package com.app.MavenSpringBootMvcAopSecurityCrudWithLog4jEmailMongoRepositoryAndMongodbThruAnnotation;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(MavenSpringBootMvcAopSecurityCrudWithLog4jEmailMongoRepositoryAndMongodbThruAnnotationApplication.class);
	}

}
