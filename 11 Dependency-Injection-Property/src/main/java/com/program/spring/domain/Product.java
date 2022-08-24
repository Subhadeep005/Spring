package com.program.spring.domain;

import java.util.Properties;

public class Product {
	private long id;
	private String name;
	private String model;
	private String brand;
	private long price;
	private Properties properties;
	
	public Product(){}
	public Product(long id, String name, String model, String brand, long price, Properties properties) {
		super();
		this.id = id;
		this.name = name;
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.properties = properties;
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
	public void setProperties(Properties properties) {
		this.properties = properties;
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
	public Properties getProperties() {
		return properties;
	}
}
