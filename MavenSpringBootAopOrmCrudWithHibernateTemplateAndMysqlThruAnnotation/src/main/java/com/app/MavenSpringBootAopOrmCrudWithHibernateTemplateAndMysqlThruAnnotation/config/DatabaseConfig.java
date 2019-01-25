package com.app.MavenSpringBootAopOrmCrudWithHibernateTemplateAndMysqlThruAnnotation.config;

import java.io.IOException;
import java.util.Properties;
import javax.sql.DataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import com.app.MavenSpringBootAopOrmCrudWithHibernateTemplateAndMysqlThruAnnotation.dao.IStudentDAO;
import com.app.MavenSpringBootAopOrmCrudWithHibernateTemplateAndMysqlThruAnnotation.service.StudentService;

@Configuration
@ComponentScan(basePackages = "com.app.MavenSpringBootAopOrmCrudWithHibernateTemplateAndMysqlThruAnnotation")
@EnableAspectJAutoProxy
@PropertySource("classpath:application.properties")
@EnableTransactionManagement
public class DatabaseConfig {
	
	 @Autowired
	 private Environment env;
	 
	 @Bean
	 public DataSource getDataSource() {
		 DriverManagerDataSource dataSource = new DriverManagerDataSource();
		 dataSource.setDriverClassName(env.getProperty("mysql.driverClassName"));
		 dataSource.setUrl(env.getProperty("mysql.url"));
		 dataSource.setUsername(env.getProperty("mysql.username"));
		 dataSource.setPassword(env.getProperty("mysql.password"));
		 return dataSource;
	 }
	 
	 public Properties getHibernateProperties() {
		 Properties hibernateProperties = new Properties();
		 hibernateProperties.put("hibernate.dialect", env.getProperty("hibernate.dialect"));
		 hibernateProperties.put("hibernate.hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl"));
		 hibernateProperties.put("hibernate.show_sql", env.getProperty("hibernate.show_sql"));
		 return hibernateProperties;
	 }
	 
	 @Bean
	 public SessionFactory getSessionFactory() throws IOException {
		 LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		 sessionFactory.setDataSource(getDataSource());
		 sessionFactory.setHibernateProperties(getHibernateProperties());
		 sessionFactory.setPackagesToScan("com.app.MavenSpringBootAopOrmCrudWithHibernateTemplateAndMysqlThruAnnotation");
		 try {
			 sessionFactory.afterPropertiesSet();
		 } catch(IOException ex) {
			 ex.printStackTrace();
		 }
		 return sessionFactory.getObject();
	 }
	 
	 @Bean
	 public HibernateTemplate getHibernateTemplate() throws IOException {
		 return new HibernateTemplate(getSessionFactory());
	 }
	 
	 @Bean
	 public HibernateTransactionManager getHibernateTransactionManager() throws IOException {
		 HibernateTransactionManager transactionManager = new HibernateTransactionManager();
		 transactionManager.setSessionFactory(getSessionFactory());
		 return transactionManager;
	 }
	 
	 @Bean(name = "myService")
	 @Lazy
	 @Scope("prototype")
	 IStudentDAO getIStudentDAO() throws IOException {
		 StudentService studentService = new StudentService();
		 studentService.setHibernateTemplate(getHibernateTemplate());
		 return studentService;
	 }	 
}
