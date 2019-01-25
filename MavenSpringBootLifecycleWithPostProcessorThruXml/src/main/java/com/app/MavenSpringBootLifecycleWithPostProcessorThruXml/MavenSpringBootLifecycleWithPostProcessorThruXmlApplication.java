package com.app.MavenSpringBootLifecycleWithPostProcessorThruXml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import com.app.MavenSpringBootLifecycleWithPostProcessorThruXml.service.CustomerService;

@SpringBootApplication
public class MavenSpringBootLifecycleWithPostProcessorThruXmlApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MavenSpringBootLifecycleWithPostProcessorThruXmlApplication.class, args);
		System.out.println("Context has been initialized");
		CustomerService service = (CustomerService) context.getBean("customerService");
		System.out.println("Already retrieved Bean from context. Next, show Bean data.");
		System.out.println("Customer Name: " + service.getCustomer().getName());
		((ConfigurableApplicationContext) context).close();
	}
}
