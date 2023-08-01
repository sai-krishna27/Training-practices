package com.sample.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDao {
	@Autowired
	UserRepo crud;
	
	public String checkUser(String name,String password){
		if(crud.AuthUser(name, password)!=null) {
			return "user is found";
		}
		return "user not found";
		
	}
	
	public User insertUser(User user) {
		return crud.save(user);
		
	}
}
