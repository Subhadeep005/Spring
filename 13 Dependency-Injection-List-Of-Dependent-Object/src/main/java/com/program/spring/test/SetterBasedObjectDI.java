package com.program.spring.test;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.program.spring.domain.Address;
import com.program.spring.domain.Customer;

public class SetterBasedObjectDI {

	public static void main(String[] args) {
		ApplicationContext appcontext = new ClassPathXmlApplicationContext("application2.xml");
		Customer customer= appcontext.getBean(Customer.class);
		
		long cid=customer.getId();
		String fname=customer.getFname();
		String lname=customer.getLname();
		String em=customer.getEmail();
		long mo=customer.getMobile();
		List<Address> add=customer.getAddresses();
		
		System.out.println("Customer Id :"+cid);
		System.out.println("Customer First Name :"+fname);
		System.out.println("Customer Last Name :"+lname);
		System.out.println("Customer Email :"+em);
		System.out.println("Customer Mobile :"+mo);
		System.out.println();
		System.out.println("<----------Customer Address--------->");
		//System.out.println(add);
		for(Object adds : add){
			Address address=(Address)adds;
			System.out.println("Address ID :"+address.getId());
			System.out.println("House No :"+address.getHouseNo());
			System.out.println("Street :"+address.getStreet());
			System.out.println("City :"+address.getCity());
			System.out.println("State :"+address.getState());
			System.out.println("Zipcode :"+address.getZipCode());
		}
		
		/*List<Address> addresses=customer.getAddresses();
		Iterator<Address> itr=addresses.iterator();
		while(itr.hasNext()){
			Address address=itr.next();
			System.out.println("Address ID :"+address.getId());
			System.out.println("House No :"+address.getHouseNo());
			System.out.println("Street :"+address.getStreet());
			System.out.println("City :"+address.getCity());
			System.out.println("State :"+address.getState());
			System.out.println("Zipcode :"+address.getZipCode());
		}*/
		
		/*System.out.println("Address ID :"+add.getId());
		System.out.println("House No :"+add.getHouseNo());
		System.out.println("Street :"+add.getStreet());
		System.out.println("City :"+add.getCity());
		System.out.println("State :"+add.getState());
		System.out.println("Zipcode :"+add.getZipCode());*/
	}

}
