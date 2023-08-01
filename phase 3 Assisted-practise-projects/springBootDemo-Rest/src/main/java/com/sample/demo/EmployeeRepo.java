package com.sample.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepo extends JpaRepository<Employee,Integer>{
	@Query("select e.phono from Employee e where e.empname=?1 and e.empno=?2")
	public String findPhonenobyidname(String name,int id);

}
