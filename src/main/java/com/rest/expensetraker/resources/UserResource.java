package com.rest.expensetraker.resources;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserResource {
	
	@GetMapping("/home")
	String welcome() {
		
		return "welcome to this website";
	}
	
	@PostMapping("/register")
	public String registeruser(@RequestBody Map<String, Object> userMapp) {
		String firstName=(String)userMapp.get("firstName");
		String lastName=(String)userMapp.get("lastName");
		String email=(String)userMapp.get("email");
		String password=(String)userMapp.get("password");
		
		return firstName+"  "+lastName+"  "+email+"  "+password;
	}
	
}
