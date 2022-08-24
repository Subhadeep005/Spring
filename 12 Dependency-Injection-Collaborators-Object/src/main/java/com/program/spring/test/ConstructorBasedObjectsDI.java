package com.program.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.program.spring.domain.Address;
import com.program.spring.domain.Customer;

public class ConstructorBasedObjectsDI {

	public static void main(String[] args) {
		ApplicationContext appcontext = new ClassPathXmlApplicationContext("application1.xml");
		Customer customer= appcontext.getBean(Customer.class);
		/*Address address= appcontext.getBean(Address.class);*/
		
		long cid=customer.getId();
		String fname=customer.getFname();
		String lname=customer.getLname();
		String em=customer.getEmail();
		long mo=customer.getMobile();
		Address add=customer.getAddress();
		
		System.out.println("Customer Id :"+cid);
		System.out.println("Customer First Name :"+fname);
		System.out.println("Customer Last Name :"+lname);
		System.out.println("Customer Email :"+em);
		System.out.println("Customer Mobile :"+mo);
		System.out.println();
		System.out.println("<----------Customer Address--------->");
		System.out.println("Address ID :"+add.getId());
		System.out.println("House No :"+add.getHouseNo());
		System.out.println("Street :"+add.getStreet());
		System.out.println("City :"+add.getCity());
		System.out.println("State :"+add.getState());
		System.out.println("Zipcode :"+add.getZipCode());

		/*long aid=address.getId();
		String hno=address.getHouseNo();
		String street=address.getStreet();
		String ct=address.getCity();
		String state=address.getState();
		String zip=address.getZipCode();
		
		System.out.println("Address Id :"+aid);
		System.out.println("Address Houseno :"+hno);
		System.out.println("Address Street :"+street);
		System.out.println("Address City :"+ct);
		System.out.println("Address State :"+state);
		System.out.println("Address Zipcode :"+zip);*/
	}

}
