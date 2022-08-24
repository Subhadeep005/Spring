package com.program.spring.domain;

public class Customer {
	private long id;
	private String name;
	private String email;
	private long mobile;
	
	public Customer(){
		System.out.println("Customer D.C");
	}
	/*public Customer(long id, String name, String email, long mobile) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.mobile = mobile;
	System.out.println("Customer Constructor");
}*/

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

}
