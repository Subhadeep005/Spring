package com.codingraja.spring.domain;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Address {
	private long id;
	private String houseNo;
	private String street;
	private String city;
	private String state;
	private long zipcode;
	
	public Address(){ System.out.println("Address Object is Created");}

	public long getId() {
		return id;
	}

	@Required
	@Value("2001")
	public void setId(long id) {
		System.out.println("Address Setter are called");
		this.id = id;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public long getZipcode() {
		return zipcode;
	}

	public void setZipcode(long zipcode) {
		this.zipcode = zipcode;
	}
	
	//Initialization Callback
	public void init(){
		city="Kolkata";
		System.out.println("Address Object is Initialized");
	}
	//Destruction Callback
	public void destroy(){
		System.out.println("Address Object is Destroyed");
	}
}
