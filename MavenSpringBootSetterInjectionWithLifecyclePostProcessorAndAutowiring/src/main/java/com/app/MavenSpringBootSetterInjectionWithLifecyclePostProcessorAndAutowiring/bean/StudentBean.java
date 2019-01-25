package com.app.MavenSpringBootSetterInjectionWithLifecyclePostProcessorAndAutowiring.bean;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value = "student")
public class StudentBean implements InitializingBean, DisposableBean {

	public StudentBean() {
		// TODO Auto-generated constructor stub
		System.out.println("this is default constructor of student bean is called");
	}
	
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

	public String getsUserid() {
		return sUserid;
	}

	public void setsUserid(String sUserid) {
		this.sUserid = sUserid;
	}

	public String getsPassword() {
		return sPassword;
	}

	public void setsPassword(String sPassword) {
		this.sPassword = sPassword;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public AddressBean getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(AddressBean studentAddress) {
		this.studentAddress = studentAddress;
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("this is destroy method of student bean is called");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("this is after properties set method of student bean is called");
	}

	@Override
	public String toString() {
		return "StudentBean [sUserid=" + sUserid + ", sPassword=" + sPassword + ", sName=" + sName + ", studentAddress="
				+ studentAddress + "]";
	}
}
