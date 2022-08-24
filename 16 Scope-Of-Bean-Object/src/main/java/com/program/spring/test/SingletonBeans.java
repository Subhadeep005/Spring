package com.program.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.program.spring.domain.Address;
import com.program.spring.domain.Customer;

public class SingletonBeans {

	public static void main(String[] args) {
		ApplicationContext appcontext = new ClassPathXmlApplicationContext("applicationSingleton.xml");
		/*
		 * Both beans are singleton, so IoC will be created only two objects.
		 * One Customer Object an One Address Object. In case of singleton
		 * scope, IoC will perform Eagerly/Aggressive Loading.
		 */
		Customer customer1 = (Customer) appcontext.getBean("customer");
		Customer customer2 = appcontext.getBean(Customer.class);

		Address address1 = customer1.getAddress();
		Address address2 = appcontext.getBean(Address.class);
	}

}
