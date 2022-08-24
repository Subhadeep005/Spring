package com.program.spring.test;

import java.util.*;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.program.spring.domain.Product;

public class SetterBasedListDI {

	public static void main(String[] args) {
		ApplicationContext appcontext = new ClassPathXmlApplicationContext("application2.xml");
		Product product= appcontext.getBean(Product.class);
		System.out.println(product);
		System.out.println("Product ID :"+product.getId());
		System.out.println("Product Name :"+product.getName());
		System.out.println("Product Model :"+product.getModel());
		System.out.println("Product Brand :"+product.getBrand());
		System.out.println("Product Price :"+product.getPrice());
		System.out.println("Product Colors :"+product.getColors());
		
		List<String> colors=product.getColors();
		Iterator<String> itr=colors.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
