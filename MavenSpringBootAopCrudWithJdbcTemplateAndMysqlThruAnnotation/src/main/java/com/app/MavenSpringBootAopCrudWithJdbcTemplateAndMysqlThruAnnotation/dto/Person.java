package com.app.MavenSpringBootAopCrudWithJdbcTemplateAndMysqlThruAnnotation.dto;

import org.springframework.stereotype.Component;

@Component
public class Person {
	
	private Long id;
	
	private Integer age;
	
	private String firstName;
	
	private String lastName;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param age
	 * @param firstName
	 * @param lastName
	 */
	public Person(Long id, Integer age, String firstName, String lastName) {
		this.id = id;
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/* 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [id=" + id + ", age=" + age + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
}
