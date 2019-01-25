package com.app.MavenSpringBootConstructorInjectionWithLifecyclePostProcessorAndAutowiring.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value = "employee")
public class EmployeeBean {
	
	@NotBlank
	private String eUserid;
	
	@NotBlank
	private String ePassword;
	
	@NotBlank
	private String eName;
	
	@NotNull
	@Autowired
	@Qualifier(value = "employee")
	private AddressBean employeeAddress;

	public EmployeeBean() {
		System.out.println("default constructor of employee bean is called");
	}

	public EmployeeBean(@NotBlank String eUserid, @NotBlank String ePassword, @NotBlank String eName,
			@NotNull AddressBean employeeAddress) {
		this.eUserid = eUserid;
		this.ePassword = ePassword;
		this.eName = eName;
		this.employeeAddress = employeeAddress;
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("this is post construct method of employee bean is called");
		System.out.println("");
	}
	
	@PreDestroy
	public void PreDestroy() {
		System.out.println("this is pre destroy method of employee bean is called");
		System.out.println("");
	}

	@Override
	public String toString() {
		return "EmployeeBean [eUserid=" + eUserid + ", ePassword=" + ePassword + ", eName=" + eName
				+ ", employeeAddress=" + employeeAddress + "]";
	}
}
