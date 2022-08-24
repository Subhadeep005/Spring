package com.codingraja.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import com.codingraja.spring.domain.Address;
import com.codingraja.spring.domain.Customer;

@Configuration
public class Javaconfig {
	@Bean("customer")
	@Lazy(true)
	public Customer getCustomer() {
		return new Customer();
	}

	@Bean
	public Address getAddress() {
		return new Address();
	}
}
