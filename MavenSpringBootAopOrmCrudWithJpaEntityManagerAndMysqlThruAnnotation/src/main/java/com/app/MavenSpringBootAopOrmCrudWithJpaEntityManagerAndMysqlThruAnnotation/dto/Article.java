package com.app.MavenSpringBootAopOrmCrudWithJpaEntityManagerAndMysqlThruAnnotation.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "article_springboot_jpa_entity")
public class Article {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE , generator="article_id_generator")
	@TableGenerator(
			name = "article_id_generator",
			table = "article_springboot_jpa_entity_id_generator",
			pkColumnName = "myid",
			valueColumnName = "next",
			pkColumnValue = "course",
			allocationSize = 1
			)
	@Column(name = "article_id", precision = 4, nullable = false)
    private int articleId; 
	
	@Column(name = "title", length = 20, insertable = true, updatable = true, nullable = false)
    private String title;
	
	@Column(name = "category", length = 20, insertable = true, updatable = true, nullable = false)
	private String category;

	/**
	 * @return the articleId
	 */
	public int getArticleId() {
		return articleId;
	}

	/**
	 * @param articleId the articleId to set
	 */
	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/*
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Article [articleId=" + articleId + ", title=" + title + ", category=" + category + "]";
	}
}
