package com.osc.userservice.exception;

public class InvalidOTPException extends RuntimeException {
    
	private static final long serialVersionUID = 1L;

	public InvalidOTPException(String message) {
        super(message);
    }
}
