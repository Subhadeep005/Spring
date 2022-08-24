package com.codingraja.sunelectronics.core.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.codingraja.sunelectronics.core.dao.CustomerDao;
import com.codingraja.sunelectronics.core.domain.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {
	@Autowired
	private SessionFactory sessionFactory;

	public Long saveCustomer(Customer customer) {
		return (Long) this.sessionFactory.getCurrentSession().save(customer);
	}

	public Customer findCustomerById(Long id) {
		return this.sessionFactory.getCurrentSession().get(Customer.class, id);
	}

	public void updateCustomer(Customer customer) {
		this.sessionFactory.getCurrentSession().update(customer);
	}

}
