package com.golden.realstate.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class GrsException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public GrsException(String message) {
		super(message);
	}
	
	
	public GrsException(String message,Throwable throwable) {
		super(message,throwable);
	}
	
	

}
