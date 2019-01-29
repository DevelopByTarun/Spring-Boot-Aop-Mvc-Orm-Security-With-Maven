package com.app.MavenSpringBootMvcAopOrmSecurityCrudWithLog4jEmailJpaRepositoryAndMysqlThruAnnotation.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "Customer_SpringBootMvcAopOrmSecurityCrud_JpaRepository")
public class CustomerDTO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE , generator="customer_id_generator")
	@TableGenerator(
			name = "customer_id_generator",
			table = "Customer_JpaRepository_Id_Generator",
			pkColumnName = "myid",
			valueColumnName = "next",
			pkColumnValue = "course",
			allocationSize = 1
			)
	@Column(name = "customer_id", precision = 4, nullable = false)
	private int id;
	
	@Column(name = "customer_name", length = 15, insertable = true, updatable = true, nullable = false)
	private String name;
	
	@Column(name = "customer_age", precision = 4, insertable = true, updatable = true, nullable = false)
	private int age;
	
	@Column(name = "customer_city", length = 15, insertable = true, updatable = true, nullable = false)
	private String city;
	
	@Column(name = "customer_country", length = 15, insertable = true, updatable = true, nullable = false)
	private String country;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "account_number")
	private AccountDTO customerAccount;

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

	/**
	 * @return the customerAccount
	 */
	public AccountDTO getCustomerAccount() {
		return customerAccount;
	}

	/**
	 * @param customerAccount the customerAccount to set
	 */
	public void setCustomerAccount(AccountDTO customerAccount) {
		this.customerAccount = customerAccount;
	}
}
