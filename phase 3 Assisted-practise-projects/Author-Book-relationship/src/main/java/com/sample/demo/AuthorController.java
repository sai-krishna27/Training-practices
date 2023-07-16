package com.sample.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorController {
	@Autowired
	AuthorRepo crud;
	
	@PostMapping("insert")
	public Author addData(@RequestBody Author author) {
		return crud.save(author);
	}
	
	@GetMapping("getall")
	public List<Author> getData() {
		return crud.findAll();
	}
	
	@GetMapping("getbooks/{name}")
	public List<String> getBooksByAuthor(@PathVariable String name){
		return crud.getBooks(name);
	}
}
