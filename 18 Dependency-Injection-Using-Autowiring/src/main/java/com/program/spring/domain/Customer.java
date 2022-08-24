package com.program.spring.domain;

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

	public Customer(Address address) {
		this.address = address;
		System.out.println("Object is Created using Parameter");
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
