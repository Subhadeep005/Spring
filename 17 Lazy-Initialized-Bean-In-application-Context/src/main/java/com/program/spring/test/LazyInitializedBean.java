package com.program.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.program.spring.domain.Customer;

public class LazyInitializedBean {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("application1.xml");

		Customer customer = appContext.getBean(Customer.class);
	}

}
