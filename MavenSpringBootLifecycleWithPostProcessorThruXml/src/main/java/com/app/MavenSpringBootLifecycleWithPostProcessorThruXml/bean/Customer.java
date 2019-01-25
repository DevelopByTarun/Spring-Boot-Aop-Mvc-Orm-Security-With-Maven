package com.app.MavenSpringBootLifecycleWithPostProcessorThruXml.bean;

import javax.validation.constraints.NotBlank;
import org.springframework.stereotype.Component;

@Component
public class Customer {
	
	@NotBlank
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
