package com.codingraja.sunelectronics.core.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.codingraja.sunelectronics.core.dao.ContactusDao;
import com.codingraja.sunelectronics.core.domain.Contactus;

@Repository
public class ContactusDaoImpl implements ContactusDao {
	@Autowired
	private SessionFactory sessionFactory;

	public Long saveContactusForm(Contactus contactus) {
		return (Long) this.sessionFactory.getCurrentSession().save(contactus);
	}

	public Contactus findContactDetailById(Long id) {
		return this.sessionFactory.getCurrentSession().get(Contactus.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Contactus> findAllContactDetails() {
		return this.sessionFactory.getCurrentSession().createCriteria(Contactus.class).list();
	}

	@SuppressWarnings("unchecked")
	public List<Contactus> findAllContactDetails(Integer limit) {
		return this.sessionFactory.getCurrentSession().createCriteria(Contactus.class).setMaxResults(limit).list();
	}

	public List<Contactus> findContactDetailsByDate(String date) {
		return null;
	}

}
