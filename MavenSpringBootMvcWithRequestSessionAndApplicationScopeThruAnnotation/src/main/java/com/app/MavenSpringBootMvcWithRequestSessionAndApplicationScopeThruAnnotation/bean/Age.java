package com.app.MavenSpringBootMvcWithRequestSessionAndApplicationScopeThruAnnotation.bean;

import javax.validation.constraints.NotBlank;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@SessionScope
@Component
public class Age {
	
	@NotBlank
	private String age = "24";

	public Age() {
		System.out.println("Create new Age: " + this.age);
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
}
