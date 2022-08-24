package com.coadingraja.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coadingraja.spring.domain.Address;
import com.coadingraja.spring.domain.Customer;

public class TestLifecycleCallbacks {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("application.xml");

		Customer customer = appContext.getBean(Customer.class);
		System.out.println("\n********Customer Information********");
		System.out.println("Customer ID :" + customer.getId());
		System.out.println("Customer First Name :" + customer.getFname());
		System.out.println("Customer Last Name :" + customer.getLname());
		System.out.println("Customer Email :" + customer.getEmail());
		System.out.println("Customer Mobile :" + customer.getMobile());

		Address address = (Address) appContext.getBean("address");
		System.out.println("\n********Customer Address********");
		System.out.println("Address ID :" + address.getId());
		System.out.println("House No :" + address.getHouseNo());
		System.out.println("Street :" + address.getStreet());
		System.out.println("City :" + address.getCity());
		System.out.println("State :" + address.getState());
		System.out.println("Zipcode :" + address.getZipcode());
	}

}
