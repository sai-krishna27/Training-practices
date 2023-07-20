package com.sample.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeRepo repo;
	
	
	@RequestMapping("register/{name}/{email}/{password}")
	public String register(HttpServletRequest request,HttpServletResponse response,@PathVariable("name") String name,@PathVariable("email") String email,@PathVariable("password") String password) {
		
		Employee e=new Employee();
		e.setName(name);
		e.setEmail(email);
		e.setPassword(password);
		repo.save(e);
		return "registered";
	}
}
