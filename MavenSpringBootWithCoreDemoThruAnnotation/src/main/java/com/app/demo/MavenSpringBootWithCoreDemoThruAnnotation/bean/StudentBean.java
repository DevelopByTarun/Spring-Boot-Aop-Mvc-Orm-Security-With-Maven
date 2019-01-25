package com.app.demo.MavenSpringBootWithCoreDemoThruAnnotation.bean;

import org.springframework.stereotype.Component;

@Component
public class StudentBean implements IStudent {
	
	@Override
	public void getStudent() {
		// TODO Auto-generated method stub
		System.out.println("Student Id Is :: "+this.getId());
		System.out.println("Student Name Is :: "+this.getName());
		System.out.println("Student Age Is :: "+this.getAge());
		System.out.println("Student City Is :: "+this.getCity());
	}

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
	
	//
}
