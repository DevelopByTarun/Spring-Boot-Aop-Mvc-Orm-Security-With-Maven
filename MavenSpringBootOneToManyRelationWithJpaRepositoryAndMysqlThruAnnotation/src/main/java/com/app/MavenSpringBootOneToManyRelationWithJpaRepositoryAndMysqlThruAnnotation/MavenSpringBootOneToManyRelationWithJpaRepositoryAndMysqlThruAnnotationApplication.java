package com.app.MavenSpringBootOneToManyRelationWithJpaRepositoryAndMysqlThruAnnotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.app.MavenSpringBootOneToManyRelationWithJpaRepositoryAndMysqlThruAnnotation.dto.Company;
import com.app.MavenSpringBootOneToManyRelationWithJpaRepositoryAndMysqlThruAnnotation.dto.Product;
import com.app.MavenSpringBootOneToManyRelationWithJpaRepositoryAndMysqlThruAnnotation.repository.CompanyRepository;
import com.app.MavenSpringBootOneToManyRelationWithJpaRepositoryAndMysqlThruAnnotation.repository.ProductRepository;
import java.util.HashSet;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class MavenSpringBootOneToManyRelationWithJpaRepositoryAndMysqlThruAnnotationApplication implements CommandLineRunner {
	
	 	@Autowired
	    CompanyRepository companyRepository;
	     
	    @Autowired
	    ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(MavenSpringBootOneToManyRelationWithJpaRepositoryAndMysqlThruAnnotationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		clearData();
    	saveData();
    	showData();
	}
	
	 @Transactional
	    private void clearData(){
	    	companyRepository.deleteAll();
	        productRepository.deleteAll();
	    }
	    
	    @Transactional
	    private void saveData(){
	    	saveDataWithApproach1();
	    }
	    
	    /**
	     * Save Company objects that include Product list
	     */
	    @SuppressWarnings("serial")
		private void saveDataWithApproach1(){
	    	
	        Company apple = new Company("Apple");
	        Company samsung = new Company("Samsung");
	        
	        Product iphone7 = new Product("Iphone 7", apple);
	        Product iPadPro = new Product("IPadPro", apple);
	        
	        Product galaxyJ7 = new Product("GalaxyJ7", samsung);
	        Product galaxyTabA = new Product("GalaxyTabA", samsung);
	        
	        apple.setProducts(new HashSet<Product>(){{
	            add(iphone7);
	            add(iPadPro);
	        }});
	        
	        samsung.setProducts(new HashSet<Product>(){{
	            add(galaxyJ7);
	            add(galaxyTabA);
	        }});
	        
	        // save companies
	        companyRepository.save(apple);
	        companyRepository.save(samsung);
	    }
	    
	    
	    /**
	     * Save company first (not include product list). Then saving products which had attached a company for each.  
	     */
	    @SuppressWarnings("unused")
		private void saveDataWithApproach2(){
	    	
	    	/*
	    	 * Firstly persist companies (not include product list)
	    	 */
	        Company apple = new Company("Apple");
	        Company samsung = new Company("Samsung");
	        
	        //save companies
	        companyRepository.save(apple);
	        companyRepository.save(samsung);
	        
	        /*
	         * Then store products with had persisted companies.
	         */
	    	Product iphone7 = new Product("Iphone 7", apple);
	        Product iPadPro = new Product("IPadPro", apple);
	        
	        Product galaxyJ7 = new Product("GalaxyJ7", samsung);
	        Product galaxyTabA = new Product("GalaxyTabA", samsung);
	 
	        // save products
	        productRepository.save(iphone7);
	        productRepository.save(iPadPro);
	        
	        productRepository.save(galaxyJ7);
	        productRepository.save(galaxyTabA);
	    }
	    
	    @Transactional
	    private void showData(){
	    	// get All data
	    	List<Company> companyLst = companyRepository.findAll();
	        List<Product> productLst = productRepository.findAll();
	         
	        System.out.println("===================Product List:==================");
	        productLst.forEach(System.out::println);
	         
	        System.out.println("===================Company List:==================");
	        companyLst.forEach(System.out::println);
	    }
}
