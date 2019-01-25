package com.app.MavenSpringBootConstructorInjectionWithLifecyclePostProcessorAndAutowiring.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value = "student")
public class StudentBean {
	
	@NotBlank
	private String sUserid;
	
	@NotBlank
	private String sPassword;
	
	@NotBlank
	private String sName;
	
	@NotNull
	@Autowired
	@Qualifier(value = "student")
	private AddressBean studentAddress;
	
	public StudentBean() {
		System.out.println("default constructor of student bean is called");
	}

	public StudentBean(@NotBlank String sUserid, @NotBlank String sPassword, @NotBlank String sName,
			@NotNull AddressBean studentAddress) {
		this.sUserid = sUserid;
		this.sPassword = sPassword;
		this.sName = sName;
		this.studentAddress = studentAddress;
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("this is post construct method of student bean is called");
		System.out.println("");
	}
	
	@PreDestroy
	public void PreDestroy() {
		System.out.println("this is pre destroy method of student bean is called");
		System.out.println("");
	}

	@Override
	public String toString() {
		return "StudentBean [sUserid=" + sUserid + ", sPassword=" + sPassword + ", sName=" + sName + ", studentAddress="
				+ studentAddress + "]";
	}
}
