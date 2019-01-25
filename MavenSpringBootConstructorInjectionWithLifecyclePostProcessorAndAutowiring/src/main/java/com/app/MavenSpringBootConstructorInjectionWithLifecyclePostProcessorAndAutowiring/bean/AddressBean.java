package com.app.MavenSpringBootConstructorInjectionWithLifecyclePostProcessorAndAutowiring.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.validation.constraints.NotBlank;
import org.springframework.stereotype.Component;

@Component
public class AddressBean {
	
	@NotBlank
	private String state;
	
	@NotBlank
	private String country;
	
	public AddressBean() {
		System.out.println("default constructor of address bean is called");
	}

	public AddressBean(@NotBlank String state, @NotBlank String country) {
		this.state = state;
		this.country = country;
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("this is post construct method of address bean is called");
		System.out.println("");
	}
	
	@PreDestroy
	public void PreDestroy() {
		System.out.println("this is pre destroy method of address bean is called");
		System.out.println("");
	}

	@Override
	public String toString() {
		return "AddressBean [state=" + state + ", country=" + country + "]";
	}
}
