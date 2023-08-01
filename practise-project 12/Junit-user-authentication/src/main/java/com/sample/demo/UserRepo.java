package com.sample.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository<User, String> {
	
	@Query("select name from User where name=?1 and password=?2")
	public String AuthUser(String name,String password);

}
