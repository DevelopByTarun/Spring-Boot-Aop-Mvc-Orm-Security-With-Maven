package com.app.MavenSpringBootAopBeforeAfterAndAfterReturningAdviceThruAspectJAnnotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import com.app.MavenSpringBootAopBeforeAfterAndAfterReturningAdviceThruAspectJAnnotation.service.IService;

@SpringBootApplication
public class MavenSpringBootAopBeforeAfterAndAfterReturningAdviceThruAspectJAnnotationApplication {
	
	public static void main(String[] args) throws Exception {
		ApplicationContext context = SpringApplication.run(MavenSpringBootAopBeforeAfterAndAfterReturningAdviceThruAspectJAnnotationApplication.class, args);
		IService service = (IService) context.getBean("iservice");
		((AbstractApplicationContext) context).start();
		System.out.println("");
		System.out.println("*****Get Employee*****");
		service.getEmployee();
		System.out.println("");
		System.out.println("*****Get Employee Address*****");
		System.out.println(service.getEmployeeAddress());
		System.out.println("");
		System.out.println("*****Get Employee With Address*****");
		System.out.println(service.getEmployeeWithAddress());
		System.out.println("");
		System.out.println("*****Get Employee Annual Salary Package*****");
		service.getEmployeeAnnualSalaryPackage();
		System.out.println("");
		System.out.println("*****Get Student*****");
		service.getStudent();
		System.out.println("");
		System.out.println("*****Get Student Address*****");
		System.out.println(service.getStudentAddress());
		System.out.println("");
		System.out.println("*****Get Student With Address*****");
		System.out.println(service.getStudentWithAddress());
		System.out.println("");
		((AbstractApplicationContext) context).registerShutdownHook();
	}
}
