package com.program.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.program.spring.domain.Address;
import com.program.spring.domain.Customer;

public class LazyInitializedBeans {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("application2.xml");

		Customer customer = appContext.getBean(Customer.class);
		Address address = (Address) appContext.getBean("address");
	}
}
