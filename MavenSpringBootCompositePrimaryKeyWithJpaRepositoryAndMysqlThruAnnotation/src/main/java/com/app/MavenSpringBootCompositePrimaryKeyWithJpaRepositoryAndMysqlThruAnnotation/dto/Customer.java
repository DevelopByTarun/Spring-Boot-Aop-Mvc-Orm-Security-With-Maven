package com.app.MavenSpringBootCompositePrimaryKeyWithJpaRepositoryAndMysqlThruAnnotation.dto;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Entity
@Table(name = "customer_springBoot_compositeKey")
public class Customer {
	
	@EmbeddedId
	private CustomerId customerId;
	
	private String company;
	private String name;
	
	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private Set<OrderDetail> orderDetails;
	
	public Customer(){}
	
	public Customer(CustomerId customerId, String company, String name){
		this.customerId = customerId;
		this.company = company;
		this.name = name;
	}
	
	public Customer(CustomerId customerId, String company, String name, Set<OrderDetail> orderDetails){
		this.customerId = customerId;
		this.company = company;
		this.name = name;
		this.orderDetails = orderDetails;
	}
	
	public void setCustomerId(CustomerId customerId){
		this.customerId = customerId;
	}
	
	public CustomerId getCustomerId(){
		return this.customerId;
	}
	
	public void setCompany(String company){
		this.company = company;
	}
	
	public String getCompany(){
		return this.company;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setOrderDetails(Set<OrderDetail> orderDetails){
		this.orderDetails = orderDetails;
	}
	
	public Set<OrderDetail> getOrderDetails(){
		return this.orderDetails;
	}
	
	public String toString(){
        String info = "";
        JSONObject jsonInfo = new JSONObject();
        try {
        	 jsonInfo.put("customerId",this.customerId.getCustomerId());
             jsonInfo.put("brandcode", this.customerId.getBrandcode());
             jsonInfo.put("company", this.getCompany());
             jsonInfo.put("name", this.getName());
        } catch(JSONException e) {
        	// TODO Auto-generated catch block
			e.printStackTrace();
        }  
        JSONArray orders = new JSONArray();
        if(this.orderDetails != null){
            this.orderDetails.forEach(order->{
                JSONObject orderInfo = new JSONObject();
                try {
					orderInfo.put("orderId-" + order.getOrderId() , order);
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                orders.put(orderInfo);
            });
        }
        try {
			jsonInfo.put("products", orders);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        info = jsonInfo.toString();
        return info;

	}
}