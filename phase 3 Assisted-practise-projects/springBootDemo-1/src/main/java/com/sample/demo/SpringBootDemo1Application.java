package com.sample.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootDemo1Application {

	@Autowired
	public static Rooms r;
	public SpringBootDemo1Application(Rooms r) {
		this.r=r;
	}
	

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringBootDemo1Application.class, args);
		r.kitchen();
		
	}

}
