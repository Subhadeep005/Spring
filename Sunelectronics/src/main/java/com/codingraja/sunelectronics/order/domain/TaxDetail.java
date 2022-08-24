package com.codingraja.sunelectronics.order.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import com.codingraja.sunelectronics.commons.domain.SunElectronicsCurrency;

public class TaxDetail implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String type;
	private BigDecimal amount;
	private BigDecimal rate;
	private String jurisdictionName;
	private String country;
	private String region;
	private String taxName;
	private SunElectronicsCurrency currency;

	public TaxDetail() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getRate() {
		return rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	public String getJurisdictionName() {
		return jurisdictionName;
	}

	public void setJurisdictionName(String jurisdictionName) {
		this.jurisdictionName = jurisdictionName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getTaxName() {
		return taxName;
	}

	public void setTaxName(String taxName) {
		this.taxName = taxName;
	}

	public SunElectronicsCurrency getCurrency() {
		return currency;
	}

	public void setCurrency(SunElectronicsCurrency currency) {
		this.currency = currency;
	}

}
