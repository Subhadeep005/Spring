package com.codingraja.sunelectronics.core.order.service.exception;

public class RequiredAttributeNotProvidedException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	protected String productId;
	public static final String ERROR_CODE = "REQUIRED_ATTRIBUTE";
	protected String attributeName;

	public RequiredAttributeNotProvidedException(String message, String attributeName, String productId) {
		super(message);
		setAttributeName(attributeName);
		setProductId(productId);
	}

	public RequiredAttributeNotProvidedException(String message, String attributeName) {
		super(message);
		setAttributeName(attributeName);
	}

	public RequiredAttributeNotProvidedException(String message, String attributeName, Throwable cause) {
		super(message, cause);
		setAttributeName(attributeName);
	}

	public RequiredAttributeNotProvidedException(String attributeName) {
		super("The attribute " + attributeName + " was not provided");
		setAttributeName(attributeName);
	}

	public String getAttributeName() {
		return this.attributeName;
	}

	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

	public String getProductId() {
		return this.productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}
}
