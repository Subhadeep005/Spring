package com.codingraja.sunelectronics.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingraja.sunelectronics.core.dao.ContactusDao;
import com.codingraja.sunelectronics.core.domain.Contactus;
import com.codingraja.sunelectronics.core.service.ContactusService;

@Service
public class ContactusServiceImpl implements ContactusService {
	@Autowired
	private ContactusDao contactusDao;

	public Long saveContactusForm(Contactus contactus) {
		return this.contactusDao.saveContactusForm(contactus);
	}

	public Contactus findContactDetailById(Long id) {
		return this.contactusDao.findContactDetailById(id);
	}

	public List<Contactus> findAllContactDetails() {
		return this.contactusDao.findAllContactDetails();
	}

	public List<Contactus> findAllContactDetails(Integer limit) {
		return this.contactusDao.findAllContactDetails(limit);
	}

	public List<Contactus> findContactDetailsByDate(String date) {
		return this.contactusDao.findContactDetailsByDate(date);
	}
}