package com.app.MavenSpringBootCompositePrimaryKeyWithJpaRepositoryAndMysqlThruAnnotation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.app.MavenSpringBootCompositePrimaryKeyWithJpaRepositoryAndMysqlThruAnnotation.dto.Customer;
import com.app.MavenSpringBootCompositePrimaryKeyWithJpaRepositoryAndMysqlThruAnnotation.dto.CustomerId;
import com.app.MavenSpringBootCompositePrimaryKeyWithJpaRepositoryAndMysqlThruAnnotation.dto.OrderDetail;
import com.app.MavenSpringBootCompositePrimaryKeyWithJpaRepositoryAndMysqlThruAnnotation.service.CustomerServices;
import com.app.MavenSpringBootCompositePrimaryKeyWithJpaRepositoryAndMysqlThruAnnotation.service.OrderServices;

@SpringBootApplication
public class MavenSpringBootCompositePrimaryKeyWithJpaRepositoryAndMysqlThruAnnotationApplication implements CommandLineRunner {
	
	@Autowired
	CustomerServices customerService;
	
	@Autowired
	OrderServices orderServices;

	public static void main(String[] args) {
		SpringApplication.run(MavenSpringBootCompositePrimaryKeyWithJpaRepositoryAndMysqlThruAnnotationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		deleteAll();
		saveData();
		showAll();
	}
	
	public void deleteAll(){
		System.out.println("===============Delete All Customers===============");
		
		orderServices.deleteAll();
		customerService.deleteAll();
	}
	
	public void saveData(){
		System.out.println("===============Storing Customers===============");
		
		// ===============Create customers===============
		// 1. Jack
		CustomerId jackId = new CustomerId(1000, "azc");
		Customer jack = new Customer(jackId, "A & Z", "Jack");
		
		OrderDetail jackIphoneOrder = new OrderDetail("001", "IPhone 7", jack);
		OrderDetail jackIPadMiniOrder = new OrderDetail("002", "IPad Mini 2", jack);
		
		Set<OrderDetail> jackOrderDetails = new HashSet<OrderDetail>(Arrays.asList(jackIphoneOrder, jackIPadMiniOrder));
		
		jack.setOrderDetails(jackOrderDetails);
		
		// 2. Mary
		CustomerId maryId = new CustomerId(2000, "mkl");
		Customer mary = new Customer(maryId, "Fashion Company", "Mary");
		
		OrderDetail maryNote7Order = new OrderDetail("003", "Samsung Galaxy Note 7", mary);
		
		Set<OrderDetail> maryOrderDetails = new HashSet<OrderDetail>(Arrays.asList(maryNote7Order));
		
		mary.setOrderDetails(maryOrderDetails);
		
		// ===============Saving to DB===============
		
		customerService.save(jack);
		customerService.save(mary);
		
	}
	
	public void showAll(){
		System.out.println("===============Show All Customers' Info===============");
		customerService.showAll();
	}
}
