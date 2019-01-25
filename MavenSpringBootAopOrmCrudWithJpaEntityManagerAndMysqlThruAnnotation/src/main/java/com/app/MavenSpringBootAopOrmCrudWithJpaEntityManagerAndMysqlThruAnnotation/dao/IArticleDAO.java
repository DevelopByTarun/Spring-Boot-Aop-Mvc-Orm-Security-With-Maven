package com.app.MavenSpringBootAopOrmCrudWithJpaEntityManagerAndMysqlThruAnnotation.dao;

import java.util.List;
import com.app.MavenSpringBootAopOrmCrudWithJpaEntityManagerAndMysqlThruAnnotation.dto.Article;

public interface IArticleDAO {
	
	public List<Article> getAllArticles() throws Exception;
	
	public Article getArticleById(int articleId) throws Exception;
	
	public void addArticle(Article article) throws Exception;
	
	public void updateArticle(Article article) throws Exception;
	
	public void deleteArticle(int articleId) throws Exception;
}
