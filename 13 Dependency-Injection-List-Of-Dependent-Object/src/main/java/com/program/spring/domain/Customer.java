package com.program.spring.domain;

import java.util.List;

public class Customer {
	private long id;
	private String fname;
	private String lname;
	private String email;
	private long mobile;
	private List<Address> addresses;
	
	public Customer(){}

	public Customer(long id, String fname, String lname, String email, long mobile, List<Address> addresses) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.mobile = mobile;
		this.addresses = addresses;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public List getAddresses() {
		return addresses;
	}

	public void setAddresses(List addresses) {
		this.addresses = addresses;
	}
	
}
