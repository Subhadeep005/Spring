package com.coadingraja.spring.domain;

public class Customer {
	private long id;
	private String fname;
	private String lname;
	private String email;
	private long mobile;
	
	public Customer(){ System.out.println("Customer Object Is Created");}

	public long getId() {
		return id;
	}

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

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	//Destruction Callback
	public void destroy() {
		System.out.println("Customer Bean is destroyed !");
	}

	//Initialization Callback
	public void init() {
		mobile= 9066074856L;
		System.out.println("Customer Bean is initialized !");
	}
}
