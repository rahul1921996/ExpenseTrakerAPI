package com.rest.expensetraker.services;

import com.rest.expensetraker.domain.User;
import com.rest.expensetraker.exception.EtAuthException;

public interface UserServices {
	
	User validateUser(String email, String password) throws EtAuthException;
	
	User registerUser(String firstName,String lastName,String email, String password) throws EtAuthException;
		
}
