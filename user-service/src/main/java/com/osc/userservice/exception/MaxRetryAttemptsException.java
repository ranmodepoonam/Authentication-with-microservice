package com.osc.userservice.exception;

public class MaxRetryAttemptsException extends RuntimeException {
    
	private static final long serialVersionUID = 1L;

	public MaxRetryAttemptsException(String message) {
        super(message);
    }

}
