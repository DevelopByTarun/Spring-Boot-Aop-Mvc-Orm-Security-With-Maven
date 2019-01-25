package com.app.MavenSpringBootConstructorInjectionWithLifecyclePostProcessorAndAutowiring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import com.app.MavenSpringBootConstructorInjectionWithLifecyclePostProcessorAndAutowiring.service.IService;

@SpringBootApplication
public class MavenSpringBootConstructorInjectionWithLifecyclePostProcessorAndAutowiringApplication {

	public static void main(String[] args) throws Exception {
		ApplicationContext context = SpringApplication.run(MavenSpringBootConstructorInjectionWithLifecyclePostProcessorAndAutowiringApplication.class, args);
		IService service = (IService) context.getBean("myService");
		((AbstractApplicationContext) context).start();
		System.out.println("");
		System.out.println("*****Get Employee With Address*****");
		service.getEmployeeWithAddress();
		System.out.println("");
		System.out.println("*****Get Student With Address*****");
		service.getStudentWithAddress();
		System.out.println("");
		((AbstractApplicationContext) context).registerShutdownHook();
	}
}
