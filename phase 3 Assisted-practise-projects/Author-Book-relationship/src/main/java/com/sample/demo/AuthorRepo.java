package com.sample.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AuthorRepo extends JpaRepository<Author, Integer> {
	
	@Query("select b.title from Author a join a.books b where a.name=?1")
	public List<String> getBooks(String name);
	
}
