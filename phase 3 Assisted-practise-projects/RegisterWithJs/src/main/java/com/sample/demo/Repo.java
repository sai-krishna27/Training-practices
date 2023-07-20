package com.sample.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface Repo extends JpaRepository<Register,String>{
	
	@Query("select count(*) from Register where email=?1")
	public int getAdmin(String email);
}
