package com.codingraja.sunelectronics.core.service;

import java.util.List;

import com.codingraja.sunelectronics.core.domain.Contactus;

public interface ContactusService {
	public Long saveContactusForm(Contactus contactus);

	public Contactus findContactDetailById(Long id);

	public List<Contactus> findAllContactDetails();

	public List<Contactus> findAllContactDetails(Integer limit);

	public List<Contactus> findContactDetailsByDate(String date);
}
