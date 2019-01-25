package com.app.MavenSpringBootCompositePrimaryKeyWithJpaRepositoryAndMysqlThruAnnotation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.app.MavenSpringBootCompositePrimaryKeyWithJpaRepositoryAndMysqlThruAnnotation.dto.OrderDetail;

@Repository
public interface OrderRepository extends JpaRepository<OrderDetail, Integer>{
}