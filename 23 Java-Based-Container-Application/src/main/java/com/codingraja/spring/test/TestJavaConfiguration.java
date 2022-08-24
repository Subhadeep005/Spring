package com.codingraja.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.codingraja.spring.config.Javaconfig;
import com.codingraja.spring.domain.Address;
import com.codingraja.spring.domain.Customer;

public class TestJavaConfiguration {

	public static void main(String[] args) {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(Javaconfig.class);
		Customer customer = appContext.getBean(Customer.class);
		// Customer customer1=appContext.getBean(Customer.class);
		Customer customer2 = (Customer) appContext.getBean("customer");
		System.out.println("Customer ID :" + customer.getId());
		System.out.println("Address Id :" + customer2.getAddress());
		Address address = appContext.getBean(Address.class);
		System.out.println("Address ID :" + address.getId());
		System.out.println("Address Id1 :" + customer2.getAddress().getId());
	}

}
