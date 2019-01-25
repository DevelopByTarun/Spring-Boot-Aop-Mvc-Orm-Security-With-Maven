package com.app.MavenSpringBootMvcWithRequestSessionAndApplicationScopeThruAnnotation.bean;

import javax.validation.constraints.NotBlank;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@RequestScope
@Component
public class Address {
	
	@NotBlank
	private String address = "US";

	public Address() {
		System.out.println("Create new Address: " + this.address);
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
