package com.codingraja.sunelectronics.core.service;

import com.codingraja.sunelectronics.core.domain.Customer;

public interface CustomerService {
	public Long saveCustomer(Customer customer);

	public Customer findCustomerById(Long id);

	public void updateCustomer(Customer customer);
}
