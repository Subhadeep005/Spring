package com.codingraja.sunelectronics.core.dao;

import com.codingraja.sunelectronics.core.domain.Customer;

public interface CustomerDao {
	public Long saveCustomer(Customer customer);

	public Customer findCustomerById(Long id);

	public void updateCustomer(Customer customer);
}
