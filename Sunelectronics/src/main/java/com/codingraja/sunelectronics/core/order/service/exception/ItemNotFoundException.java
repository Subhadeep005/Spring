package com.codingraja.sunelectronics.core.order.service.exception;

public class ItemNotFoundException extends Exception {
	private static final long serialVersionUID = 1L;

	public ItemNotFoundException() {
		// Do Nothing
	}

	public ItemNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public ItemNotFoundException(String message) {
		super(message);
	}

	public ItemNotFoundException(Throwable cause) {
		super(cause);
	}
}
