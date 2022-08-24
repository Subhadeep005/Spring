package com.codingraja.sunelectronics.core.checkout.service.workflow;

import com.codingraja.sunelectronics.order.domain.Order;

public interface CheckoutResponse {
	public abstract Order getOrder();
}
