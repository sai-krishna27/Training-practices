package com.sample.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository<User,Integer >{
	
	@Query("select count(*) from User where id=?1")
	int findByUserId(int id);
	
	List<User> findByemail(String email);
}
