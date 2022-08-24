package com.program.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.program.spring.domain.Address;
import com.program.spring.domain.Customer;

@SuppressWarnings("resource")
public class TestCustomerInfo {

	public static void main(String[] args) {
		// Loading Spring Configuration File and Creating IoC Container and it
		// is Aggressive loading/ Early Loading
		ApplicationContext appcontext = new ClassPathXmlApplicationContext("application.xml");

		// Getting Bean Object
		Customer customer = appcontext.getBean(Customer.class);
		Address address = appcontext.getBean(Address.class);

		long cid = customer.getId();
		String em = customer.getEmail();
		String nm = customer.getName();
		long mo = customer.getMobile();

		System.out.println("Customer Id :" + cid);
		System.out.println("Customer Email :" + em);
		System.out.println("Customer Name :" + nm);
		System.out.println("Customer Mobile :" + mo);
		System.out.println();

		long aid = address.getId();
		String hno = address.getHouseNo();
		String street = address.getStreet();
		String ct = address.getCity();
		String state = address.getState();
		String zip = address.getZipCode();

		System.out.println("Address Id :" + aid);
		System.out.println("Address Houseno :" + hno);
		System.out.println("Address Street :" + street);
		System.out.println("Address City :" + ct);
		System.out.println("Address State :" + state);
		System.out.println("Address Zipcode :" + zip);
	}

}
