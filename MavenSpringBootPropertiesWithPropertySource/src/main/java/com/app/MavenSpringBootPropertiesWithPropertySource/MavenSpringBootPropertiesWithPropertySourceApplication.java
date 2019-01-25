package com.app.MavenSpringBootPropertiesWithPropertySource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.app.MavenSpringBootPropertiesWithPropertySource.service.IService;

@SpringBootApplication
public class MavenSpringBootPropertiesWithPropertySourceApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MavenSpringBootPropertiesWithPropertySourceApplication.class, args);
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
		System.out.println("*****Get Student*****");
		service.getStudent();
		System.out.println("");
		System.out.println("*****Get Student Address*****");
		service.getStudentAddress();
		System.out.println("");
		System.out.println("*****Get Student With Address*****");
		service.getStudentWithAddress();
		System.out.println("");
	}
}
