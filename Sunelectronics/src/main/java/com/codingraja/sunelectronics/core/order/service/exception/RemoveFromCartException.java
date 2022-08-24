package com.codingraja.sunelectronics.core.order.service.exception;

public class RemoveFromCartException extends Exception {
	private static final long serialVersionUID = 1L;

	public RemoveFromCartException() {
		// Do Nothing
	}

	public RemoveFromCartException(String message, Throwable cause) {
		super(message, cause);
	}

	public RemoveFromCartException(String message) {
		super(message);
	}

	public RemoveFromCartException(Throwable cause) {
		super(cause);
	}
}
