package com.codingraja.sunelectronics.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.codingraja.sunelectronics.core.dao.CustomerDao;
import com.codingraja.sunelectronics.core.domain.Customer;
import com.codingraja.sunelectronics.core.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerDao customerDao;

	@Transactional
	public Long saveCustomer(Customer customer) {
		return this.customerDao.saveCustomer(customer);
	}

	@Transactional
	public Customer findCustomerById(Long id) {
		return this.customerDao.findCustomerById(id);
	}

	@Transactional
	public void updateCustomer(Customer customer) {
		this.customerDao.updateCustomer(customer);
	}

}
