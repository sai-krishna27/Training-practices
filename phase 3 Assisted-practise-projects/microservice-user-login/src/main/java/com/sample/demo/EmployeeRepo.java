package com.sample.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepo extends JpaRepository<Employee, String>{
	@Query("select name from Employee where email=?1 and password=?2")
	public String getUser(String email,String password);
}
