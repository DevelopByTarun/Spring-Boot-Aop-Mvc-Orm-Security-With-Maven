package com.app.MavenSpringBootOneToManyRelationWithJpaRepositoryAndMysqlThruAnnotation.dto;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Entity
@Table(name="company_springBoot_OneToMany")
public class Company {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
    private String name;
    
    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Product> products;
    
    public Company(){
    }
    
    public Company(String name){
    	this.name = name;
    }
    
    // name
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    // products
    public void setProducts(Set<Product> products){
    	this.products = products;
    }
    
    public Set<Product> getProducts(){
    	return this.products;
    }
    
    public String toString(){
    	String info = "";
        JSONObject jsonInfo = new JSONObject();
        try {
			jsonInfo.put("name",this.name);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        JSONArray productArray = new JSONArray();
        if(this.products != null){
            this.products.forEach(product->{
                JSONObject subJson = new JSONObject();
                try {
					subJson.put("name", product.getName());
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                productArray.put(subJson);
            });
        }
        try {
			jsonInfo.put("products", productArray);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        info = jsonInfo.toString();
        return info;
    }
}
