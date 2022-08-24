package com.coadingraja.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coadingraja.spring.domain.Customer;

public class TestAnnotationConfig {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("application.xml");
		Customer customer = appContext.getBean(Customer.class);
		Customer customer1 = (Customer) appContext.getBean("customer");
		System.out.println("Customer ID :" + customer1.getId());
		System.out.println("Customer Name :" + customer.getFname());
		System.out.println("Mobile :" + customer.getMobile());
		System.out.println("Address ID :" + customer.getAddress().getId());
		System.out.println("City :" + customer.getAddress().getCity());
	}

}
