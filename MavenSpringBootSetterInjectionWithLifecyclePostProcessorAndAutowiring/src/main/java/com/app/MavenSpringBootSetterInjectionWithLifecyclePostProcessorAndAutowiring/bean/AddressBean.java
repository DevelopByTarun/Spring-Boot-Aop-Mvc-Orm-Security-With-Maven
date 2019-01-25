package com.app.MavenSpringBootSetterInjectionWithLifecyclePostProcessorAndAutowiring.bean;

import javax.validation.constraints.NotBlank;
import org.springframework.stereotype.Component;

@Component
public class AddressBean {

	public AddressBean() {
		// TODO Auto-generated constructor stub
		System.out.println("this is default constructor of address bean is called");
	}
	
	@NotBlank
	private String state;
	
	@NotBlank
	private String country;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "AddressBean [state=" + state + ", country=" + country + "]";
	}
}
