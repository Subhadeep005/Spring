package com.codingraja.spring.domain;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Customer {
	private long id;
	private String fname;
	private String lname;
	private String email;
	private long mobile;
	private Address address;

	public Customer() {
		System.out.println("Customer Object is Created");
	}

	public long getId() {
		return id;
	}

	@Required
	@Value("1001")
	public void setId(long id) {
		System.out.println("Customer setter are called");
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobile() {
		return mobile;
	}

	@Value("100987654")
	public void setMobile(long mobile) {
		System.out.println("Mobile setter");
		this.mobile = mobile;
	}

	public Address getAddress() {
		return address;
	}

	// @Autowired
	public void setAddress(Address address) {
		System.out.println("Address setter");
		this.address = address;
	}

	// Initialization Callback
	public void init() {
		mobile = 8345096411L;
		System.out.println("Customer Object is Initialized");
	}

	// Destruction Callback
	public void destroy() {
		System.out.println("Customer Object is Destroyed");
	}
}
