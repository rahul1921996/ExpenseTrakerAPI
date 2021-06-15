package com.rest.expensetraker.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rest.expensetraker.domain.User;
import com.rest.expensetraker.exception.EtAuthException;
import com.rest.expensetraker.repository.UserRepository;

@Service  //similar to @componenet ,b which Spring can scan it and create the object
@Transactional  //this annotation now treat all the methods as transaction, as example if any runtime exception happens it will automatically roll back the enitre transaction
public class UserServiceImpl implements  UserServices {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public User validateUser(String email, String password) throws EtAuthException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User registerUser(String firstName, String lastName, String email, String password) throws EtAuthException {
		// TODO Auto-generated method stub
		return null;
	}
 
}
