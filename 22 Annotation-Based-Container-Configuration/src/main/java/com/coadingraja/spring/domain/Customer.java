package com.coadingraja.spring.domain;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("customer")
@Lazy(true)
public class Customer {
	private long id;
	private String fname;
	private String lname;
	private String email;
	private long mobile;
	@Autowired
	// @Qualifier("address2") // For byName
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

	@Value("Subha")
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

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	// Initialization Callback
	@PostConstruct
	public void init() {
		mobile = 8345096411L;
		System.out.println("Customer Object is Initialized");
	}

	// Destruction Callback
	@PreDestroy
	public void destroy() {
		System.out.println("Customer Object is Destroyed");
	}
}
