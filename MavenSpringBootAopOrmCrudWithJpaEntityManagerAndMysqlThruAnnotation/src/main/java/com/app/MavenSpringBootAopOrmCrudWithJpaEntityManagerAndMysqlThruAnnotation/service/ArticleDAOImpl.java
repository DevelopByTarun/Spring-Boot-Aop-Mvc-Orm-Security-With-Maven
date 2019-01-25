package com.app.MavenSpringBootAopOrmCrudWithJpaEntityManagerAndMysqlThruAnnotation.service;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.app.MavenSpringBootAopOrmCrudWithJpaEntityManagerAndMysqlThruAnnotation.dao.IArticleDAO;
import com.app.MavenSpringBootAopOrmCrudWithJpaEntityManagerAndMysqlThruAnnotation.dto.Article;

@Service
@Transactional
public class ArticleDAOImpl implements IArticleDAO {
	
	@PersistenceContext	
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<Article> getAllArticles() throws Exception {
		// TODO Auto-generated method stub
		String hql = "FROM Article as atcl ORDER BY atcl.articleId";
		return (List<Article>) entityManager.createQuery(hql).getResultList();
	}

	@Override
	public Article getArticleById(int articleId) throws Exception {
		// TODO Auto-generated method stub
		return entityManager.find(Article.class, articleId);
	}

	@Override
	public void addArticle(Article article) throws Exception {
		// TODO Auto-generated method stub
		entityManager.persist(article);
	}

	@Override
	public void updateArticle(Article article) throws Exception {
		// TODO Auto-generated method stub
		Article artcl = getArticleById(article.getArticleId());
		artcl.setTitle(article.getTitle());
		artcl.setCategory(article.getCategory());
		entityManager.flush();
	}

	@Override
	public void deleteArticle(int articleId) throws Exception {
		// TODO Auto-generated method stub
		entityManager.remove(getArticleById(articleId));
	}
}
