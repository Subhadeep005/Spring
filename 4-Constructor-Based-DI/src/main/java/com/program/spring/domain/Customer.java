package com.program.spring.domain;

public class Customer {
	private long id;
	private String name;
	private String email;
	private long mobile;

	public Customer() {
		System.out.println("Customer D.C");
	}

	public Customer(long id, String name, String email, long mobile) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		System.out.println("Customer Constructor");
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", email=" + email + ", mobile=" + mobile;
	}

}
