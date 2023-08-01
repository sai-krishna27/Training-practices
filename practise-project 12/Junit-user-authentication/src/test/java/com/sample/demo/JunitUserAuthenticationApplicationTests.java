package com.sample.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JunitUserAuthenticationApplicationTests {
	
	@Autowired
	UserDao dao;

	@Test
	public void test1() {
		
		User user=new User();
		user.setName("admin");
		user.setPassword("pass");
		assertNotNull(dao.insertUser(user));
	}
	
	@Test
	public void test2() {
		
		assertEquals("user is found",dao.checkUser("admin", "pass"));
	}

	@Test
	public void test3() {
		
		assertEquals("user not found",dao.checkUser("admin", "admin"));
	}

}
