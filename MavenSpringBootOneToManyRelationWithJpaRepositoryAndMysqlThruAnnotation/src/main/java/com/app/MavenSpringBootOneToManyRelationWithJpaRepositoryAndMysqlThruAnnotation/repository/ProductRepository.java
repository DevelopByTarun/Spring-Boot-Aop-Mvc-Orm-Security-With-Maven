package com.app.MavenSpringBootOneToManyRelationWithJpaRepositoryAndMysqlThruAnnotation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.app.MavenSpringBootOneToManyRelationWithJpaRepositoryAndMysqlThruAnnotation.dto.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
}