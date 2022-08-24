package com.coadingraja.spring.domain;

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

	public void setId(long id) {
		System.out.println("Address setter are called");
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
	
	//Destruction Callback
		public void destroy() {
			System.out.println("Address Bean is destroyed !");
		}

		//Initialization Callback
		public void init() {
			zipcode= 560068L;
			System.out.println("Address Bean is initialized !");
		}
}
