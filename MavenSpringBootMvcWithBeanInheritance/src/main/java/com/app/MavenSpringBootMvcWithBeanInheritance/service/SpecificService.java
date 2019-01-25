package com.app.MavenSpringBootMvcWithBeanInheritance.service;

import javax.validation.constraints.NotBlank;
import org.springframework.stereotype.Component;

@Component
public class SpecificService {
	
	@NotBlank
	private String welcomeMessage;
	
	@NotBlank
	private String customerName;
	
	@NotBlank
	private String serviceName;

	public String getWelcomeMessage() {
		return welcomeMessage;
	}

	public void setWelcomeMessage(String welcomeMessage) {
		this.welcomeMessage = welcomeMessage;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String sayHello() {
		return welcomeMessage + " " + customerName + ". This is " + serviceName;
	}

	public String sayWelcome() {
		return welcomeMessage + serviceName;
	}
}
