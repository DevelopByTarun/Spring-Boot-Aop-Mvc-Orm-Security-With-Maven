package com.app.MavenSpringBootAopOrmCrudWithJpaEntityManagerAndMysqlThruAnnotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import com.app.MavenSpringBootAopOrmCrudWithJpaEntityManagerAndMysqlThruAnnotation.dao.IArticleDAO;
import com.app.MavenSpringBootAopOrmCrudWithJpaEntityManagerAndMysqlThruAnnotation.service.ArticleDAOImpl;

@Configuration
@ComponentScan(basePackages = "com.app.MavenSpringBootAopOrmCrudWithJpaEntityManagerAndMysqlThruAnnotation")
@EnableTransactionManagement
@EnableAspectJAutoProxy
public class ArticleConfig {
	
	@Bean(name = "iarticle")
	@Scope("prototype")
	@Lazy
	IArticleDAO getIArticleDAO() {
		return new ArticleDAOImpl();
	}
}
