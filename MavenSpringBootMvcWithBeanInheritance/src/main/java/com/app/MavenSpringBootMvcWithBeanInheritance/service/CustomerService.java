package com.app.MavenSpringBootMvcWithBeanInheritance.service;

import javax.validation.constraints.NotBlank;
import org.springframework.stereotype.Component;

@Component
public class CustomerService {
	
	@NotBlank
	private String welcomeMessage;
	
	@NotBlank
	private String customerName;

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

	public String sayHello() {
		return welcomeMessage + " " + customerName;
	}
}
