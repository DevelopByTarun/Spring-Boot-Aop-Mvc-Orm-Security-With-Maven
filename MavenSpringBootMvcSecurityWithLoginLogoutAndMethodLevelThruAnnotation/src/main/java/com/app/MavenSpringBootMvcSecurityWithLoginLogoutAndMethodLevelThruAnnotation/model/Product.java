package com.app.MavenSpringBootMvcSecurityWithLoginLogoutAndMethodLevelThruAnnotation.model;

import javax.validation.constraints.NotBlank;
import org.springframework.stereotype.Component;

@Component
public class Product {
	
	@NotBlank
	private int id;
	
	@NotBlank
	private String name;
	
	@NotBlank
	private String desc;
	
	@NotBlank
	private double price;
	
	/**
	 * default constructor
	 */
	public Product() {
		// TODO Auto-generated constructor stub
		System.out.println("Default Constructor Of Product Is Called....");
	}

	/**
	 * @param id
	 * @param name
	 * @param desc
	 * @param price
	 */
	public Product(@NotBlank int id, @NotBlank String name, @NotBlank String desc, @NotBlank double price) {
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.price = price;
	}

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
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}

	/**
	 * @param desc the desc to set
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
}
