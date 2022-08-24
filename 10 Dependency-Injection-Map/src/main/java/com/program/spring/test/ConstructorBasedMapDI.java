package com.program.spring.test;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.program.spring.domain.Product;

public class ConstructorBasedMapDI {

	public static void main(String[] args) {
		ApplicationContext appcontext = new ClassPathXmlApplicationContext("application1.xml");
		Product product = appcontext.getBean(Product.class);
		System.out.println(product);
		System.out.println("Product ID :" + product.getId());
		System.out.println("Product Name :" + product.getName());
		System.out.println("Product Model :" + product.getModel());
		System.out.println("Product Brand :" + product.getBrand());
		System.out.println("Product Price :" + product.getPrice());
		System.out.println("Product Properties :" + product.getProps());

		Map<String, String> props = product.getProps();
		// Iterator itr=props.entrySet().iterator();
		Set set = props.entrySet();
		Iterator itr = set.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
