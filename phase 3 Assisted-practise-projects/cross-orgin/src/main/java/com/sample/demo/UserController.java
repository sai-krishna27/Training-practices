package com.sample.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*")//for all external networks we can use hitting this requests
public class UserController {
@Autowired
UserRepo repo;
//insert
@PostMapping("/register")
public String register(@RequestBody User user) {
	repo.save(user);
	return "Hi " +user.getName()+" is registered successfully";
}

//list of users 
@GetMapping("/getAllusers")
public List<User> findAllUsers(){
	return repo.findAll();
}


//delete record with id 

@DeleteMapping("/cancel/{id}")
public List<User> cancelregistration(@PathVariable int id){
	repo.deleteById(id);
	//after delete i need to show the list of recors that are updated
	return repo.findAll();
}

//search with email
@GetMapping("/findbyemail/{email}")
public List<User> findUser(@PathVariable String email){
	return repo.findByemail(email);
}

//
@PutMapping("/update")
public User updateUser(@RequestBody User user) {
	if(repo.findByUserId(user.getId())==1) {
		return repo.save(user);
	}
	else
		return user;
}
	
}
