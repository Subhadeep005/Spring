package com.codingraja.sunelectronics.core.checkout.service.workflow;

import java.util.HashMap;
import java.util.Map;

import com.codingraja.sunelectronics.order.domain.Order;

public class CheckoutSeed implements CheckoutResponse {
	protected Order order;
	protected Map<String, Object> userDefinedFields = new HashMap<>();

	public CheckoutSeed(Order order, Map<String, Object> userDefinedFields) {
		this.order = order;
		this.userDefinedFields = userDefinedFields;
	}

	@Override
	public Order getOrder() {
		return this.order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Map<String, Object> getUserDefinedFields() {
		return this.userDefinedFields;
	}
}
