package com.app.MavenSpringBootLifecycleWithPostProcessorThruXml.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import com.app.MavenSpringBootLifecycleWithPostProcessorThruXml.bean.Customer;

public class CustomerService implements InitializingBean, DisposableBean {

	private Customer customer;

	public CustomerService() {
		System.out.println("Call constructor for CustomerService");
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet() - implements InitializingBean");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy() - implements DisposableBean");
	}

	public void customInitBean() throws Exception {
		System.out.println("customInitBean()");
	}

	public void customDestroyBean() throws Exception {
		System.out.println("customDestroyBean()");
	}

	@PostConstruct
	public void postconstruct() {
		System.out.println(
				"@PostConstruct: perform some initialization after all the setter methods have been called");
	}

	@PreDestroy
	public void predestroy() {
		System.out.println("@PreDestroy");
	}
}
