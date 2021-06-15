package com.rest.expensetraker.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNAUTHORIZED)  // so that when we call this call ,it will automatically give the status code of unauthorized
public class EtAuthException extends RuntimeException {

	public EtAuthException(String message) {
		super(message);
		
	
	}
	 
}
