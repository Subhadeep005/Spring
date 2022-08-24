package com.program.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.program.spring.domain.Address;
import com.program.spring.domain.Customer;

public class PrototypeBeans {

	public static void main(String[] args) {
		ApplicationContext appcontext = new ClassPathXmlApplicationContext("applicationPrototype.xml");
		/*
		 * Both beans are prototype, so IoC will be created a new Object for
		 * every time. In case of prototype scope, IoC will perform Lazy
		 * Loading.
		 */
		Customer customer1 = (Customer) appcontext.getBean("customer");
		Customer customer2 = appcontext.getBean(Customer.class);

		// Address address1 = customer1.getAddress();
		Address address2 = appcontext.getBean(Address.class);
		Address address3 = (Address) appcontext.getBean("address");
	}

}
