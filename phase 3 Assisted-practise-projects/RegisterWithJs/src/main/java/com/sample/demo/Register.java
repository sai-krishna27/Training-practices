package com.sample.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Register {
	
	@Id
	String email;
	String password;
	String name;
	
	
}
