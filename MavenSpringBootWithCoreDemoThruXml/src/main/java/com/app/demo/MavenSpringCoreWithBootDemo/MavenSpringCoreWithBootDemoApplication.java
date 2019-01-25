package com.app.demo.MavenSpringCoreWithBootDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MavenSpringCoreWithBootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MavenSpringCoreWithBootDemoApplication.class, args);
		IEmployee emp = (IEmployee) context.getBean("empObject");
		emp.getEmployee();
	}
}
