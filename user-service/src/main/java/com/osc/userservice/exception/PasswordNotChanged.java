package com.osc.userservice.exception;

public class PasswordNotChanged extends RuntimeException {
    
	private static final long serialVersionUID = 1L;

	public PasswordNotChanged(String message) {
        super(message);
    }

}
