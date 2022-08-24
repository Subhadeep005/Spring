package com.program.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.program.spring.domain.Address;
import com.program.spring.domain.Admin;
import com.program.spring.domain.Customer;

public class PrototypeBeanInPrototype {

	public static void main(String[] args) {
		ApplicationContext appcontext = new ClassPathXmlApplicationContext("PrototypeBeanInPrototype.xml");

		Customer customer1 = appcontext.getBean(Customer.class);
		Customer customer2 = appcontext.getBean(Customer.class);
		Customer customer3 = appcontext.getBean(Customer.class);
		Customer customer4 = appcontext.getBean(Customer.class);

		Admin admin1 = appcontext.getBean(Admin.class);
		Admin admin2 = appcontext.getBean(Admin.class);
		Admin admin3 = appcontext.getBean(Admin.class);
		Admin admin4 = appcontext.getBean(Admin.class);

		Address address = appcontext.getBean(Address.class);
	}

}
