package com.program.spring.domain;

import java.util.*;

public class Product {
	private long id;
	private String name;
	private String model;
	private String brand;
	private long price;
	private Set<String> colors;
	
	
	public Product(){
		System.out.println("Customer D.C");
	}

	public Product(long id, String name, String model, String brand, long price, Set colors) {
		super();
		this.id = id;
		this.name = name;
		this.model = model;
		this.brand = brand;
		this.price=price;
		this.colors=colors;
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

	public Set<String> getColors() {
		return colors;
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

	public void setColors(Set<String> colors) {
		this.colors = colors;
	}


}
