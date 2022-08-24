package com.codingraja.sunelectronics.order.domain;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

public class OrderStatus implements Serializable {

	private static final long serialVersionUID = 1L;

	private static final Map<String, OrderStatus> TYPES = new LinkedHashMap<String, OrderStatus>();
	public static final OrderStatus NAMED = new OrderStatus("NAMED", "Named");
	public static final OrderStatus IN_PROCESS = new OrderStatus("IN_PROCESS", "In Process");
	public static final OrderStatus SUBMITTED = new OrderStatus("SUBMITTED", "Submitted");
	public static final OrderStatus CANCELLED = new OrderStatus("CANCELLED", "Cancelled");

	public static OrderStatus getInstance(final String type) {
		return TYPES.get(type);
	}

	private String type;
	private String frindlyType;

	public OrderStatus() {
	}

	public OrderStatus(String type, String frindlyType) {
		super();
		this.frindlyType = frindlyType;
		setType(type);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
		if (!TYPES.containsKey(type)) {
			TYPES.put(type, this);
		}
	}

	public String getFrindlyType() {
		return frindlyType;
	}

	public void setFrindlyType(String frindlyType) {
		this.frindlyType = frindlyType;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public static Map<String, OrderStatus> getTypes() {
		return TYPES;
	}

	public static OrderStatus getNamed() {
		return NAMED;
	}

	public static OrderStatus getInProcess() {
		return IN_PROCESS;
	}

	public static OrderStatus getCancelled() {
		return CANCELLED;
	}

}
