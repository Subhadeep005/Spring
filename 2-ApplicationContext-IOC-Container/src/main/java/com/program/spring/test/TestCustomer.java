package com.program.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.program.spring.domain.Customer;

@SuppressWarnings("resource")
public class TestCustomer {

	public static void main(String[] args) {

		// Loading Spring Configuration File and Creating IoC Container and it is
		// Aggressive loading/ Early Loading
		ApplicationContext appcontext = new ClassPathXmlApplicationContext("application.xml");

		// Getting Bean Object
		Customer customer = (Customer) appcontext.getBean("customer");

		// By Default, IoC container is a singleton Object. only one Object is created
		// Customer customer1 = (Customer) appcontext.getBean("customer");

		// Customer customer2= factory.getBean(Customer.class);
		long id = customer.getId();
		String em = customer.getEmail();
		String nm = customer.getName();
		long mo = customer.getMobile();
		System.out.println(id);
		System.out.println(em);
		System.out.println(nm);
		System.out.println(mo);
	}

}
