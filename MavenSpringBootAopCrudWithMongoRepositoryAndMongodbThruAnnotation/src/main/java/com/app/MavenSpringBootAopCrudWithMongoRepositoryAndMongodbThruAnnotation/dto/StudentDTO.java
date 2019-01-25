package com.app.MavenSpringBootAopCrudWithMongoRepositoryAndMongodbThruAnnotation.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "studentSpringBootMongoMstr")
public class StudentDTO {
	
	@Id
	@Field(value = "student_id")
	private String id;
	
	@Field(value = "student_name")
	private String name;
	
	@Field(value = "student_age")
	private int age;
	
	@Field(value = "student_city")
	private String city;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/*
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "StudentDTO [id=" + id + ", name=" + name + ", age=" + age + ", city=" + city + "]";
	}
}
