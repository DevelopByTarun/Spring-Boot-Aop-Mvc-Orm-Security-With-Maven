package com.app.MavenSpringBootEmbeddedDocumentsWithMongoRepositoryAndMongodbThruAnnotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.app.MavenSpringBootEmbeddedDocumentsWithMongoRepositoryAndMongodbThruAnnotation.dto.Company;
import com.app.MavenSpringBootEmbeddedDocumentsWithMongoRepositoryAndMongodbThruAnnotation.dto.Contact;
import com.app.MavenSpringBootEmbeddedDocumentsWithMongoRepositoryAndMongodbThruAnnotation.dto.Product;
import com.app.MavenSpringBootEmbeddedDocumentsWithMongoRepositoryAndMongodbThruAnnotation.service.CompanyService;

@SpringBootApplication
@EnableAutoConfiguration
public class MavenSpringBootEmbeddedDocumentsWithMongoRepositoryAndMongodbThruAnnotationApplication {
	
//	@Autowired
//	CompanyRepository companyRepo;
//	
//	@Override
//	public void run(String... args) throws Exception {
//		// clear database
//		System.out.println("==========Delete all company entities==========");
//		companyRepo.deleteAll();
//		
//		// save Documents to MongoDB
//		System.out.println("==========Save list of company entities==========");
//		companyRepo.save(Arrays.asList(
//				// Apple company & products
//				new Company(1, "Apple",
//						
//						        // list of products
//								Arrays.asList(new Product("A-123", "Iphone 7", "Price: 649.00 USD & FREE shipping"),
//													  new Product("A-456", "IPadPro", "Price: 417.67 USD & FREE shipping")),
//								
//								// contact
//								new Contact("Cupertino, CA 95014", "1-408-996-1010")),
//				
//				// Samsung company & products
//				new Company(2, "Samsung",
//						
//						       // list of products
//						       Arrays.asList(new Product("S-012", "GalaxyJ7", "Price: 219.00 USD & FREE shipping"),
//														new Product("S-456", "GalaxyTabA", "Price: 299.99 USD & FREE shipping")),
//						       
//						       // contact
//						       new Contact("Seocho District, Seoul, South Korea", "+82-2-2053-3000"))));
//		// initial List Companies variable
//		List<Company> companies = null;
//		
//		// fetch all documents
//		System.out.println("==========Fetch aLL companies:==========");
//		companies = companyRepo.findAll();
//		companies.forEach(System.out::println);
//		
//		// find Company by name
//		System.out.println("==========Find a company by name:==========");
//		companies = companyRepo.findByName("Samsung");
//		companies.forEach(System.out::println);
//		
//		// find Company by address
//		System.out.println("==========Find a company by address:==========");
//		companies = companyRepo.findByAddress("Cupertino, CA 95014");
//		companies.forEach(System.out::println);
//	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MavenSpringBootEmbeddedDocumentsWithMongoRepositoryAndMongodbThruAnnotationApplication.class, args);
		CompanyService service = (CompanyService) context.getBean("dCompany");
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1. Add Customer");
			System.out.println("2. Exit");
			System.out.print("Enter Your Choice :: ");
			int choice = sc.nextInt();
			if(choice == 1) {
				System.out.print("Company Id :: ");
				int id = sc.nextInt();
				System.out.print("Company Name :: ");
				String name = sc.next();
				System.out.print("Product Code1 :: ");
				String code1 = sc.next();
				System.out.print("Product Name1 :: ");
				String name1 = sc.next();
				System.out.print("Product Deatils1 :: ");
				String details1 = sc.next();
				System.out.print("Product Code2 :: ");
				String code2 = sc.next();
				System.out.print("Product Name2 :: ");
				String name2 = sc.next();
				System.out.print("Product Deatils2 :: ");
				String details2 = sc.next();
				System.out.print("Contact Address :: ");
				String address = sc.next();
				System.out.print("Contact Phone :: ");
				String phone = sc.next();
				
				Product proud1 = new Product(code1, name1, details1);
				Product proud2 = new Product(code2, name2, details2);
				List<Product> productList1 = new ArrayList<Product>();
				productList1.add(proud1);
				List<Product> productList2 = new ArrayList<Product>();
				productList2.addAll(productList1);
				productList2.add(proud2);
				
				Contact cont = new Contact(address, phone);
				
				Company com = new Company();
				com.setId(id);
				com.setName(name);
				com.setProducts(productList2);
				com.setContact(cont);
				
				service.saveCustomer(com);
				System.out.println("Company Record Added Successfully");
			}
			else {
				System.out.println("Good Byee");
				return;
			}
		}	
	}
}
