package com.program.spring.test;

import java.util.*;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.program.spring.domain.Product;

public class SetterBasedSetDI {

	public static void main(String[] args) {
		ApplicationContext appcontext = new ClassPathXmlApplicationContext("application2.xml");
		Product product= (Product)appcontext.getBean("product"); //Passing the id of bean Object.
		//Product product= (Product)appcontext.getBean("product1");
		System.out.println(product);
		System.out.println("Product ID :"+product.getId());
		System.out.println("Product Name :"+product.getName());
		System.out.println("Product Model :"+product.getModel());
		System.out.println("Product Brand :"+product.getBrand());
		System.out.println("Product Price :"+product.getPrice());
		System.out.println("Product Colors :"+product.getColors());
		
		Set<String> colors=product.getColors();
		Iterator<String> itr=colors.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
