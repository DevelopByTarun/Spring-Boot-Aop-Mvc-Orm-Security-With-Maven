package com.app.MavenSpringBootCompositePrimaryKeyWithJpaRepositoryAndMysqlThruAnnotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.MavenSpringBootCompositePrimaryKeyWithJpaRepositoryAndMysqlThruAnnotation.dto.OrderDetail;
import com.app.MavenSpringBootCompositePrimaryKeyWithJpaRepositoryAndMysqlThruAnnotation.repository.OrderRepository;

@Service
public class OrderServices {
	
	@Autowired
	OrderRepository orderRepository;
	
	public void save(OrderDetail order){
		orderRepository.save(order);
	}
	
	public void deleteAll(){
		orderRepository.deleteAll();
	}
}