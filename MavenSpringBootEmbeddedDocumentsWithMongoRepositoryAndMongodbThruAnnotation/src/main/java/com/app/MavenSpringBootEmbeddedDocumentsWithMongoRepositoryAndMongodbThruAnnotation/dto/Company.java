package com.app.MavenSpringBootEmbeddedDocumentsWithMongoRepositoryAndMongodbThruAnnotation.dto;

import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fasterxml.jackson.databind.SerializationFeature;

@Document(collection="CompanySpringBootMongo")
public class Company {
	
	@Id
	@Field(value = "company_id")
	private int id;
	
	@Field(value = "company_name")
    private String name;
    
	@Field(value = "company_product")
    private List<Product> products;
    
	@Field(value = "company_contact")
    private Contact contact;
    
    public void setId(int id){
    	this.id = id;
    }
    
    public int getId(){
    	return this.id;
    }
    
    public void setName(String name){
    	this.name = name;
    }
    
    public String getName(){
    	return this.name;
    }
    
    public void setProducts(List<Product> products){
    	this.products = products;
    }
    
    public List<Product> getProducts(){
    	return this.products;
    }
    
    public void setContact(Contact contact){
    	this.contact = contact;
    }
    
    public Contact getContact(){
    	return this.contact;
    }
    
//    public Company(int id, String name, List<Product> products, Contact contact){
//    	this.id = id;
//    	this.name = name;
//    	this.products = products;
//    	this.contact = contact;
//    }

	/* 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", products=" + products + ", contact=" + contact + "]";
	}
    
//    @Override
//    public String toString() {
//    	ObjectMapper mapper = new ObjectMapper();
//    	
//    	String jsonString = "";
//		try {
//			mapper.enable(SerializationFeature.INDENT_OUTPUT);
//			jsonString = mapper.writeValueAsString(this);
//		} catch (JsonProcessingException e) {
//			e.printStackTrace();
//		}
//		
//    	return jsonString;
//    }
}
