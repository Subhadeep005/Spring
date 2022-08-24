package com.program.spring.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.program.spring.domain.Customer;

public class TestCustomer {

	public static void main(String[] args) {
		ApplicationContext appcontext = new ClassPathXmlApplicationContext("application.xml");
		Customer customer= appcontext.getBean(Customer.class);
		System.out.println(customer);
		System.out.println("ID :"+customer.getId());
		System.out.println("Name :"+customer.getName());
		System.out.println("Email :"+customer.getEmail());
		System.out.println("Mobile :"+customer.getMobile());
	}

}
