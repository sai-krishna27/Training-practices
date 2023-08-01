package com.sample.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductDao {
	
	@Autowired
	public ProductRepo crud;
	
	public Product insert(Product product) {
		return crud.save(product);
	}
	
	public List<Product> getAll(){
		return crud.findAll();
	}


}
