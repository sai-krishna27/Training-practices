package com.sample.demo;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class productTest2 {
	@Autowired
	ProductDao dao;
	@Test
	public void test() {
		assertEquals("id of "+5+" is deleted",dao.deleteProduct(5));
	}

} 
