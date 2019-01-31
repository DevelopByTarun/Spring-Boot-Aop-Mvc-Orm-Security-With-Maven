package com.app.MavenSpringBootMvcSecurityWithLoginLogoutAndMethodLevelThruAnnotation.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.app.MavenSpringBootMvcSecurityWithLoginLogoutAndMethodLevelThruAnnotation.model.Product;

@Repository
public interface IProductDAO {
	
	public void addProduct(int id, String name, String desc, double price) throws Exception;
	
	public void deleteProduct(int id) throws Exception;
	
	public List<Product> getAllProducts() throws Exception;
}
