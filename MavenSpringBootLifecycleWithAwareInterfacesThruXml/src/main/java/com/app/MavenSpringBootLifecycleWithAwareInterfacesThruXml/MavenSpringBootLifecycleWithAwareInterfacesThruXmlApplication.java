package com.app.MavenSpringBootLifecycleWithAwareInterfacesThruXml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import com.app.MavenSpringBootLifecycleWithAwareInterfacesThruXml.service.CustomerServiceImpAwareInterface;
import com.app.MavenSpringBootLifecycleWithAwareInterfacesThruXml.service.CustomerServiceImpCustomMethod;

@SpringBootApplication
public class MavenSpringBootLifecycleWithAwareInterfacesThruXmlApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MavenSpringBootLifecycleWithAwareInterfacesThruXmlApplication.class, args);
		System.out.println("Context has been initialized");
		CustomerServiceImpCustomMethod service = (CustomerServiceImpCustomMethod) context.getBean("customerServiceCustomerMethod");
		System.out.println("Already retrieved Bean from context. Next, show Bean data.");
		System.out.println("Customer Name: " + service.getCustomer().getName());
		((ConfigurableApplicationContext) context).close();
		System.out.println("-----new testing Context-----");
		System.out.println("-----Spring Aware Interface-----");
		context = SpringApplication.run(MavenSpringBootLifecycleWithAwareInterfacesThruXmlApplication.class, args);
		context.getBean("customerServiceAware", CustomerServiceImpAwareInterface.class);
		((ConfigurableApplicationContext) context).close();
	}
}
