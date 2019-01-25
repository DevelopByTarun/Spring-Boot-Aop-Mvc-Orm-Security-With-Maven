package com.app.MavenSpringBootEmbeddedDocumentsWithMongoRepositoryAndMongodbThruAnnotation.dto;

import org.springframework.data.mongodb.core.mapping.Field;

public class Product {
	
	@Field(value = "product_code")
	private String code;
	
	@Field(value = "product_name")
	private String name;
	
	@Field(value = "product_details")
	private String details;
	
	public Product(String code, String name, String details){
		this.code = code;
		this.name = name;
		this.details = details;
	}
	
	public void setCode(String code){
		this.code = code;
	}
	
	public String getCode(){
		return this.code;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setDetails(String details){
		this.details = details;
	}
	
	public String getDetails(){
		return this.details;
	}
}