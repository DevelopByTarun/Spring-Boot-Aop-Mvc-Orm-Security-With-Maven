package com.app.MavenSpringBootAopCrudWithMongoTemplateAndMongodbThruAnnotation;

import java.util.List;
import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import com.app.MavenSpringBootAopCrudWithMongoTemplateAndMongodbThruAnnotation.dao.ICustomerDAO;
import com.app.MavenSpringBootAopCrudWithMongoTemplateAndMongodbThruAnnotation.dto.CustomerDTO;

@SpringBootApplication
@EnableAutoConfiguration
public class MavenSpringBootAopCrudWithMongoTemplateAndMongodbThruAnnotationApplication {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) throws Exception {
		ApplicationContext context = SpringApplication.run(MavenSpringBootAopCrudWithMongoTemplateAndMongodbThruAnnotationApplication.class, args);
		ICustomerDAO service = (ICustomerDAO) context.getBean("icustomer");
		((AbstractApplicationContext)context).start();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("");
    		System.out.println("1. Add Customer");
    		System.out.println("2. Update Customer");
    		System.out.println("3. Delete Customer");
    		System.out.println("4. Fetch All Customers");
    		System.out.println("5. Fetch Customer By Id");
    		System.out.println("6. Exit");
    		System.out.print("Enter Your Choice :: ");
    		int choice = sc.nextInt();
    		if(choice == 1) {
    			System.out.print("Enter Customer Id :: ");
    			String id = sc.next();
    			
    			System.out.print("Enter Customer FirstName :: ");
    			String fname = sc.next();
    			
    			System.out.print("Enter Customer LastName :: ");
    			String lname = sc.next();
    			
    			System.out.print("Enter Customer Age :: ");
    			int age = sc.nextInt();
    			
    			System.out.print("Enter Customer State :: ");
    			String state = sc.next();
    			
    			System.out.print("Enter Customer Country :: ");
    			String country = sc.next();
    			
    			CustomerDTO addCustomer = new CustomerDTO();
       			addCustomer.setId(id);
       			addCustomer.setFirstName(fname);
       			addCustomer.setLastName(lname);
       			addCustomer.setAge(age);
       			addCustomer.setState(state);
       			addCustomer.setCountry(country);
    			
    			service.saveCustomer(addCustomer);
    			if(addCustomer != null) {
    				System.out.println("Customer Added Successfully");
    			}
    			else {
    				System.out.println("Unable To Add Customer");
    			}
    		}
    		else if(choice == 2) {
    			System.out.print("Enter Customer Id Want To Update :: ");
    			String id = sc.next();
    			
    			System.out.print("Enter Customer FirstName :: ");
    			String fname = sc.next();
    			
    			System.out.print("Enter Customer LastName :: ");
    			String lname = sc.next();
    			
    			System.out.print("Enter Customer Age :: ");
    			int age = sc.nextInt();
    			
    			System.out.print("Enter Customer State :: ");
    			String state = sc.next();
    			
    			System.out.print("Enter Customer Country :: ");
    			String country = sc.next();
    			
    			CustomerDTO updtCustomer = new CustomerDTO();
    			updtCustomer.setId(id);
    			updtCustomer.setFirstName(fname);
    			updtCustomer.setLastName(lname);
    			updtCustomer.setAge(age);
    			updtCustomer.setState(state);
    			updtCustomer.setCountry(country);
    			
    			service.updateCustomer(updtCustomer);
    			if(updtCustomer != null) {
    				System.out.println("Customer Updated Successfully");
    			}
    			else {
    				System.out.println("Unable To Update Customer");
    			}
    		}
    		else if(choice == 3) {
    			System.out.print("Enter Customer Id Want To Delete :: ");
    			String id = sc.next();
    			
    			service.deleteCustomer(id);
    			if(service != null) {
    				System.out.println("Customer Deleted Successfully");
    			}
    			else {
    				System.out.println("Unable To Delete Customer");
    			}
    		}
    		else if(choice == 4) {
    			List<CustomerDTO> customerList = service.getAllCustomers();
    			if(customerList != null && customerList.size() > 0) {
    				for(CustomerDTO customer : customerList) {
        				System.out.println("Customer Id Is :: "+customer.getId());
        				System.out.println("Customer FirstName Is :: "+customer.getFirstName());
        				System.out.println("Customer LastName Is :: "+customer.getLastName());
        				System.out.println("Customer Age Is :: "+customer.getAge());
        				System.out.println("Customer State Is :: "+customer.getState());
        				System.out.println("Customer Country Is :: "+customer.getCountry());
        				System.out.println("");
        			}
    			}
    			else {
    				System.out.println("Unable To Find Customers");
    			}
    		}
    		else if(choice == 5) {
    			System.out.print("Enter Customer Id Want To Fetch Record :: ");
    			String id = sc.next();
    			
    			CustomerDTO search = service.getCustomerById(id);
    			if(search != null) {
    				System.out.println(search);
    			}
    			else {
    				System.out.println("Unable To Search Customer");
    			}
    		}	
    		else {
    			System.out.println("Good Byeee....");
    			return;
    		}
		}
	}
}
