package com.program.spring.test;

import java.util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.program.spring.domain.Product;

public class SetterBasedPropertyDI {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("application2.xml");
		Product product=(Product)context.getBean("product");
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
