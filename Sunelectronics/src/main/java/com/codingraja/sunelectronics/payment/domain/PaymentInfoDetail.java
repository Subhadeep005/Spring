package com.codingraja.sunelectronics.payment.domain;

import java.math.BigDecimal;
import java.util.Date;

import com.codingraja.sunelectronics.commons.domain.SunElectronicsCurrency;

public class PaymentInfoDetail {
	private Long id;
	private PaymentInfo paymentInfo;
	private String type;
	private BigDecimal amount;
	private SunElectronicsCurrency currency;
	private Date date;

	public PaymentInfoDetail() {
	}
}
