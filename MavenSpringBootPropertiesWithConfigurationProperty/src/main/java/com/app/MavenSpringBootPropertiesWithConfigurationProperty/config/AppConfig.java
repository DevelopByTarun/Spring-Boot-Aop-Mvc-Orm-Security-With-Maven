package com.app.MavenSpringBootPropertiesWithConfigurationProperty.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import com.app.MavenSpringBootPropertiesWithConfigurationProperty.bean.EmployeeBean;
import com.app.MavenSpringBootPropertiesWithConfigurationProperty.service.IService;
import com.app.MavenSpringBootPropertiesWithConfigurationProperty.service.ServiceImple;

@Configuration
@EnableConfigurationProperties(EmployeeBean.class)
@PropertySource("application.properties")
@ComponentScan(basePackages = "com.app")
public class AppConfig {
	
	@Bean(name = "myService")
	IService getIService() {
		return new ServiceImple();
	}
}
