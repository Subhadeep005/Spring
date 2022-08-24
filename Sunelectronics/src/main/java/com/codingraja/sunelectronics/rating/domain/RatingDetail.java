package com.codingraja.sunelectronics.rating.domain;

import java.util.Date;

import com.codingraja.sunelectronics.core.domain.Customer;

public class RatingDetail {
	private Long id;
	private Double rating;
	private Date ratingSubmittedDate;
	private Customer customer;
	private RatingSummary ratingSummary;
	public RatingDetail(){}
}
