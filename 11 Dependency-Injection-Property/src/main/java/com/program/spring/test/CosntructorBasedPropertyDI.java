package com.program.spring.test;

import java.util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.program.spring.domain.Product;

public class CosntructorBasedPropertyDI {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("application1.xml");
		Product product=context.getBean(Product.class);
		System.out.println("Product ID :"+product.getId());
		System.out.println("Product Name :"+product.getName());
		System.out.println("Product Model :"+product.getModel());
		System.out.println("Product Brand :"+product.getBrand());
		System.out.println("Product Price :"+product.getPrice());
		System.out.println("Product Properties :"+product.getProperties());
		
		Properties props = product.getProperties();
		System.out.println("RAM :"+props.getProperty("RAM"));
		System.out.println("Memory :"+props.getProperty("Memory"));
		System.out.println("Processor :"+props.getProperty("Processor"));
	}

}
