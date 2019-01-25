package com.app.MavenSpringBootAopOrmCrudWithJpaEntityManagerAndMysqlThruAnnotation;

import java.util.List;
import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import com.app.MavenSpringBootAopOrmCrudWithJpaEntityManagerAndMysqlThruAnnotation.dao.IArticleDAO;
import com.app.MavenSpringBootAopOrmCrudWithJpaEntityManagerAndMysqlThruAnnotation.dto.Article;

@SpringBootApplication
@EnableAutoConfiguration
public class MavenSpringBootAopOrmCrudWithJpaEntityManagerAndMysqlThruAnnotationApplication {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) throws Exception {
		ApplicationContext context = SpringApplication.run(MavenSpringBootAopOrmCrudWithJpaEntityManagerAndMysqlThruAnnotationApplication.class, args);
		IArticleDAO service = (IArticleDAO) context.getBean("iarticle");
		((AbstractApplicationContext)context).start();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("");
    		System.out.println("1. Add Article");
    		System.out.println("2. Update Article");
    		System.out.println("3. Delete Article");
    		System.out.println("4. Fetch All Employees");
    		System.out.println("5. Fetch Employee By Id");
    		System.out.println("6. Exit");
    		System.out.print("Enter Your Choice :: ");
    		int choice = sc.nextInt();
    		if(choice == 1) {
    			System.out.print("Enter Article Title :: ");
    			String title = sc.next();
    			
    			System.out.print("Enter Article Category :: ");
    			String category = sc.next();
    			
    			Article addition = new Article();
    			addition.setTitle(title);
    			addition.setCategory(category);
    			
    			service.addArticle(addition);
    			if(addition != null) {
    				System.out.println("Article Added Successfully");
    			}
    			else {
    				System.out.println("Unable To Add Article");
    			}
    		}
    		else if(choice == 2) {
    			System.out.print("Enter Article Id Want To Update :: ");
    			int id = sc.nextInt();
    			
    			System.out.print("Enter Article Title :: ");
    			String title = sc.next();
    			
    			System.out.print("Enter Article Category :: ");
    			String category = sc.next();
    			
    			Article updation = new Article();
    			updation.setArticleId(id);
    			updation.setTitle(title);
    			updation.setCategory(category);
    			
    			service.updateArticle(updation);
    			if(updation != null) {
    				System.out.println("Article Updated Successfully");
    			}
    			else {
    				System.out.println("Unable To Update Article");
    			}
    		}
    		else if(choice == 3) {
    			System.out.print("Enter Article Id Want To Delete :: ");
    			int id = sc.nextInt();
    			
    			service.deleteArticle(id);
    			if(service != null) {
    				System.out.println("Article Deleted Successfully");
    			}
    			else {
    				System.out.println("Unable To Delete Article");
    			}
    		}
    		else if(choice == 4) {
    			List<Article> articleList = service.getAllArticles();
    			if(articleList != null && articleList.size() > 0) {
    				for(Article art : articleList) {
        				System.out.println("Article Id Is :: "+art.getArticleId());
        				System.out.println("Article Title Is :: "+art.getTitle());
        				System.out.println("Article Category Is :: "+art.getCategory());
        				System.out.println("");
        			}
    			}
    			else {
    				System.out.println("Unable To Find Articles");
    			}
    		}
    		else if(choice == 5) {
    			System.out.print("Enter Article Id Want To Fetch Record :: ");
    			int id = sc.nextInt();
    			
    			Article searchArticle = service.getArticleById(id);
    			if(searchArticle != null) {
    				System.out.println(searchArticle.toString());
    			}
    			else {
    				System.out.println("Unable To Search Article");
    			}
    		}
    		else {
    			System.out.println("Good Byeee....");
    			return;
    		}
		}
	}
}
