package com.rest.expensetraker.repository;

import com.rest.expensetraker.domain.User;

public interface UserRepository {
	
	Integer create(String first_name,String  last_name, String email, String password);
	
	User findEmailandPassword(String email,String password);
	
	User findByID(Integer id);
}
