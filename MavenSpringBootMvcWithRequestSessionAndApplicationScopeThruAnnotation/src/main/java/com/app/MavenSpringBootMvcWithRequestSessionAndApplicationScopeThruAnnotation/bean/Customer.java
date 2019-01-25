package com.app.MavenSpringBootMvcWithRequestSessionAndApplicationScopeThruAnnotation.bean;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer {
	
	@NotBlank
	private String name;

	@Autowired
	@NotNull
	private Age age;

	@Autowired
	@NotNull
	private Address address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age.getAge();
	}

	public void setAge(String age) {
		this.age.setAge(age);
	}

	public String getAddress() {
		return address.getAddress();
	}

	public void setAddress(String address) {
		this.address.setAddress(address);
	}
}
