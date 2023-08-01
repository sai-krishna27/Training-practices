package com.sample.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StudentRepo extends JpaRepository<Student, Integer> {
	
	String query="select s from Student s join s.courses sc join sc.teachers";
	@Query(query)
	public List<Student> getalldetails();
	
	
	//i need teacher name of a student
	String query1="select sct.name from Student s join s.courses sc join sc.teachers sct where s.name=?1";
	@Query(query1)
	public List<String> getTeacher(String name);
	//i need teacher name of a student whose course is java
	String query2="select sct.name from Student s join s.courses sc join sc.teachers sct where s.name=?1 and sc.name='java'";
	@Query(query2)
	public List<String> getTeacherOfJava(String name);


}
