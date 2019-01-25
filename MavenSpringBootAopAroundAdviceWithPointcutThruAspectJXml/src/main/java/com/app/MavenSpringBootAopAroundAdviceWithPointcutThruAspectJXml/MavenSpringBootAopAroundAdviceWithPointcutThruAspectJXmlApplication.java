package com.app.MavenSpringBootAopAroundAdviceWithPointcutThruAspectJXml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import com.app.MavenSpringBootAopAroundAdviceWithPointcutThruAspectJXml.service.IService;

@SpringBootApplication
public class MavenSpringBootAopAroundAdviceWithPointcutThruAspectJXmlApplication {

	public static void main(String[] args) throws Exception {
		ApplicationContext context = SpringApplication.run(MavenSpringBootAopAroundAdviceWithPointcutThruAspectJXmlApplication.class, args);
		IService service = (IService) context.getBean("iservice");
		((AbstractApplicationContext) context).start();
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
		((AbstractApplicationContext) context).registerShutdownHook();
	}
}
