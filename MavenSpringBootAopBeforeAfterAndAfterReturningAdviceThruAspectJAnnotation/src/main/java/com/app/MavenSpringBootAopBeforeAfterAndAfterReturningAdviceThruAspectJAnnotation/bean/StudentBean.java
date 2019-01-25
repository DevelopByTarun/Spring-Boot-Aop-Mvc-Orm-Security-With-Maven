package com.app.MavenSpringBootAopBeforeAfterAndAfterReturningAdviceThruAspectJAnnotation.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value = "student")
public class StudentBean {
	
	public StudentBean() {
		// TODO Auto-generated constructor stub
		System.out.println("this is default constructor of student bean is called");
	}

	@NotBlank
	private int studentId;
	
	@NotBlank
	private String studentName;
	
	@NotBlank
	private int studentAge;
	
	@NotNull
	@Autowired
	@Qualifier(value = "student")
	private AddressBean studentAddress;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public AddressBean getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(AddressBean studentAddress) {
		this.studentAddress = studentAddress;
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("this is post construct method of student bean is called");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("this is pre destroy method of student bean is called");
	}

	@Override
	public String toString() {
		return "StudentBean [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge
				+ ", studentAddress=" + studentAddress + "]";
	}
}
