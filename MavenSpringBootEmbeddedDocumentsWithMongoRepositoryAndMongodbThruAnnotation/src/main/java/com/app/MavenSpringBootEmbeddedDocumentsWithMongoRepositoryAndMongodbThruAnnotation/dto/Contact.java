package com.app.MavenSpringBootEmbeddedDocumentsWithMongoRepositoryAndMongodbThruAnnotation.dto;

import org.springframework.data.mongodb.core.mapping.Field;

public class Contact {
	
	@Field(value = "contact_address")
	private String address;
	
	@Field(value = "contact_phone")
	private String phone;
	
	public Contact(String address, String phone){
		this.address = address;
		this.phone = phone;
	}
	
	public void setAddress(String address){
		this.address = address;
	}
	
	public String getAddress(){
		return this.address;
	}
	
	public void setPhone(String phone){
		this.phone = phone;
	}
	
	public String getPhone(){
		return this.phone;
	}
}
