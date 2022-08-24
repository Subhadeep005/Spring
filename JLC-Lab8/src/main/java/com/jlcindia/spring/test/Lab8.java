package com.jlcindia.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jlcindia.spring.domain.Customer;
import com.jlcindia.spring.domain.Jlcconfig;

public class Lab8 {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Jlcconfig.class);
		Customer cust = (Customer) ctx.getBean("cust");
		cust.show();
	}

}
