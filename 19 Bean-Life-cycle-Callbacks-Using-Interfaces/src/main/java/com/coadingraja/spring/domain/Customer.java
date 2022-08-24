package com.coadingraja.spring.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Customer implements InitializingBean, DisposableBean{
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
		System.out.println("Customer setter Method");
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

	//Destruction callback implemented from DisposableBean Interface
	public void destroy() throws Exception {
		System.out.println("Customer Bean is destroyed !");
	}

	//Initialization callback implemented from InitializingBean Interface
	public void afterPropertiesSet() throws Exception {
		mobile= 9066074856L;
		System.out.println("Customer Bean is initialized !");
	}
}
