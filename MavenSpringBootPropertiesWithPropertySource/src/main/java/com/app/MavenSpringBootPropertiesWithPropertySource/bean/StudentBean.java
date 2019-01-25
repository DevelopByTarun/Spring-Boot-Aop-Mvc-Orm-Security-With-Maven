package com.app.MavenSpringBootPropertiesWithPropertySource.bean;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value = "student")
public class StudentBean {
	
	@NotBlank
	private int sid;
	
	@NotBlank
	private String sname;
	
	@NotBlank
	private int age;
	
	@Autowired
	@Qualifier(value = "student")
	@NotNull
	private AddressBean studentAddress;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public AddressBean getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(AddressBean studentAddress) {
		this.studentAddress = studentAddress;
	}

	@Override
	public String toString() {
		return "StudentBean [sid=" + sid + ", sname=" + sname + ", age=" + age + ", studentAddress=" + studentAddress
				+ "]";
	}
}
