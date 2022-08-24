package com.program.spring.domain;

import java.util.*;

public class Product {
	private long id;
	private String name;
	private String model;
	private String brand;
	private long price;
	private Map<String, String> props;
	
	
	public Product(){
		System.out.println("Customer D.C");
	}

	public Product(long id, String name, String model, String brand, long price, Map props) {
		super();
		this.id = id;
		this.name = name;
		this.model = model;
		this.brand = brand;
		this.price=price;
		this.props=props;
		System.out.println("Customer Constructor");
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getModel() {
		return model;
	}

	public String getBrand() {
		return brand;
	}

	public long getPrice() {
		return price;
	}

	public Map<String, String> getProps() {
		return props;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public void setProps(Map<String, String> props) {
		this.props = props;
	}


}
