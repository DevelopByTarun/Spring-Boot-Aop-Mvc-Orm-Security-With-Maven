package com.app.demo.MavenSpringCoreWithBootDemo;

import org.springframework.stereotype.Component;

@Component
public class EmployeeBean implements IEmployee {
	
	private int id;
	
	private String name;
	
	private int age;
	
	private String city;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public void getEmployee() {
		// TODO Auto-generated method stub
		System.out.println("Employee Id Is :: "+this.getId());
		System.out.println("Employee Name Is :: "+this.getName());
		System.out.println("Employee Age Is :: "+this.getAge());
		System.out.println("Employee City Is :: "+this.getCity());
	}
}
