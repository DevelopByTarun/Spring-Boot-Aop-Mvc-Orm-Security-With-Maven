package com.app.MavenSpringBootSetterInjectionWithLifecyclePostProcessorAndAutowiring.bean;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value = "employee")
public class EmployeeBean implements InitializingBean, DisposableBean {

	public EmployeeBean() {
		// TODO Auto-generated constructor stub
		System.out.println("this is default constructor of employee bean is called");
	}
	
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
	
	public String geteUserid() {
		return eUserid;
	}

	public void seteUserid(String eUserid) {
		this.eUserid = eUserid;
	}

	public String getePassword() {
		return ePassword;
	}

	public void setePassword(String ePassword) {
		this.ePassword = ePassword;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public AddressBean getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(AddressBean employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("this is destroy method of employee bean is called");
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("this is after properties set method of employee bean is called");
	}
	
	@Override
	public String toString() {
		return "EmployeeBean [eUserid=" + eUserid + ", ePassword=" + ePassword + ", eName=" + eName
				+ ", employeeAddress=" + employeeAddress + "]";
	}
}
