package com.app.MavenSpringBootPropertiesWithConfigurationProperty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.app.MavenSpringBootPropertiesWithConfigurationProperty.service.IService;

@SpringBootApplication
public class MavenSpringBootPropertiesWithConfigurationPropertyApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MavenSpringBootPropertiesWithConfigurationPropertyApplication.class, args);
		IService service = (IService) context.getBean("myService");
		System.out.println("");
		System.out.println("*****Get Employee*****");
		service.getEmployee();
		System.out.println("");
		System.out.println("*****Get Employee Address*****");
		service.getEmployeeAddress();
		System.out.println("");
		System.out.println("*****Get Employee With Address*****");
		service.getEmployeeWithAddress();
		System.out.println("");
	}
}
