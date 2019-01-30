package com.app.MavenSpringBootMvcAopSecurityCrudWithLog4jEmailMongoRepositoryAndMongodbThruAnnotation.dao;

import java.util.ArrayList;

import com.app.MavenSpringBootMvcAopSecurityCrudWithLog4jEmailMongoRepositoryAndMongodbThruAnnotation.model.ProductDTO;

public interface IProductDAO {
	
	public void addProduct(ProductDTO product) throws Exception;
	
	public void updateProduct(ProductDTO product) throws Exception;
	
	public void deleteProduct(String productId) throws Exception;
	
	public ProductDTO getProductById(String productId) throws Exception;
	
	public ArrayList<ProductDTO> getAllProducts() throws Exception;
}
