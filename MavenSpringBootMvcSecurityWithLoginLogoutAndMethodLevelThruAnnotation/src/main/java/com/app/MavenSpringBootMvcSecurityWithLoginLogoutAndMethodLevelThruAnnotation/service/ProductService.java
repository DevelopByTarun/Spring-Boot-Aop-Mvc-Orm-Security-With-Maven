package com.app.MavenSpringBootMvcSecurityWithLoginLogoutAndMethodLevelThruAnnotation.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.springframework.stereotype.Service;
import com.app.MavenSpringBootMvcSecurityWithLoginLogoutAndMethodLevelThruAnnotation.dao.IProductDAO;
import com.app.MavenSpringBootMvcSecurityWithLoginLogoutAndMethodLevelThruAnnotation.model.Product;

@Service
public class ProductService implements IProductDAO {
	
	private static List<Product> productList = new ArrayList<Product>();
	
	static {
		productList.add(new Product(1001, "sneakers", "shoes", 4313.34));
		productList.add(new Product(1002, "macbook", "laptop", 70866.21));
		productList.add(new Product(1003, "xxx", "yyy", 2233.33));
	}

	@Override
	public void addProduct(int id, String name, String desc, double price) throws Exception {
		// TODO Auto-generated method stub
		productList.add(new Product(id, name, desc, price));
	}

	@Override
	public void deleteProduct(int id) throws Exception {
		// TODO Auto-generated method stub
		Iterator<Product> iterator = productList.iterator();
		while(iterator.hasNext()) {
			Product proud = iterator.next();
			if(proud.getId() == id) {
				iterator.remove();
			}
		}
	}

	@Override
	public List<Product> getAllProducts() throws Exception {
		// TODO Auto-generated method stub
		List<Product> getProductList = new ArrayList<Product>();
		for(Product proud : productList) {
			getProductList.add(proud);
		}
		return getProductList;
	}
}
