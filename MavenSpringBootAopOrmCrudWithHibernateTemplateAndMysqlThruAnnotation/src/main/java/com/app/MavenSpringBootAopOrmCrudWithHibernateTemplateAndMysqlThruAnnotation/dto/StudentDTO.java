package com.app.MavenSpringBootAopOrmCrudWithHibernateTemplateAndMysqlThruAnnotation.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "STUDENT_SPRINGBOOT_HIBERNATE_MSTR")
public class StudentDTO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE , generator="student_id_generator")
	@TableGenerator(
			name = "student_id_generator",
			table = "STUDENT_SPRINGBOOT_ID_GENERATOR",
			pkColumnName = "myid",
			valueColumnName = "next",
			pkColumnValue = "course",
			allocationSize = 1
			)
	@Column(name = "student_id", precision = 4, nullable = false)
	private int id;
	
	@Column(name = "student_name", length = 11, unique = true, insertable = true, updatable = true, nullable = false)
	private String name;
	
	@Column(name = "student_age", precision = 4, insertable = true, updatable = true, nullable = false)
	private int age;
	
	@Column(name = "student_city", length = 15, insertable = true, updatable = true, nullable = false)
	private String city;
	
	@Column(name = "student_country", length = 15, insertable = true, updatable = true, nullable = false)
	private String country;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
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

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/*
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	/*
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof StudentDTO))
			return false;
		StudentDTO other = (StudentDTO) obj;
		if (age != other.age)
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	/* 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "StudentDTO [id=" + id + ", name=" + name + ", age=" + age + ", city=" + city + ", country=" + country
				+ "]";
	}
}
