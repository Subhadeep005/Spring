package com.program.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.program.spring.domain.Address;

public class TestAddress {

	public static void main(String[] args) {
		ApplicationContext appcontext = new ClassPathXmlApplicationContext("application.xml");
		Address address= appcontext.getBean(Address.class);
		System.out.println(address);
		System.out.println("ID :"+address.getId());
		System.out.println("Houseno :"+address.getHouseNo());
		System.out.println("Street :"+address.getStreet());
		System.out.println("City :"+address.getCity());
		System.out.println("State :"+address.getState());
		System.out.println("Zipcode :"+address.getZipcode());
	}

}
