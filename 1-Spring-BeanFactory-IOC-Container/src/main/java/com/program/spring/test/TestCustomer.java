package com.program.spring.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.program.spring.domain.Customer;

@SuppressWarnings("deprecation")
public class TestCustomer {

	public static void main(String[] args) {
		// Loading Spring Configuration File
		Resource resource = new ClassPathResource("application.xml");

		// Creating IoC Container
		BeanFactory factory = new XmlBeanFactory(resource);

		// Getting Bean Object
		// Customer customer = (Customer) factory.getBean("customer");

		// By Default, IoC container is a singleton Object. only one Object is created
		// Customer customer1 = (Customer) factory.getBean("customer");

		Customer customer2 = factory.getBean(Customer.class);
		long id = customer2.getId();
		String em = customer2.getEmail();
		String nm = customer2.getName();
		long mo = customer2.getMobile();
		System.out.println(id);
		System.out.println(em);
		System.out.println(nm);
		System.out.println(mo);
	}

}
