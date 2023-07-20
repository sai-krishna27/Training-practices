package com.sample.demo;

import static org.junit.Assert.assertNotNull;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
public class ProductJspMvcApplicationTests {
@Autowired
ProductDao dao;
	
	@Test
	public void test1() {
		Product p=new Product();
		p.setName("fridge");
		p.setType("AC");
		p.setManufacturing_date(new Date());
		 assertNotNull(dao.insert(p));
		
	}

}
