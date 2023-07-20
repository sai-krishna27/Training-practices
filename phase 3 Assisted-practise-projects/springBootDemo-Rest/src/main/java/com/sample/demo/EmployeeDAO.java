package com.sample.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeDAO {

	//interface EmpRepo extends JpaRepository<Employee,Integer>  =>all the predefined crud methods are brought into the EmpRepo
	@Autowired   //used to generate a refernce to the object automatically 
	EmployeeRepo repo;
	
	//insert operation 
	public Employee insert(Employee e) {
		return repo.save(e);
	}
	
	
	//list of inserts 
	public List<Employee> insertall(List<Employee> e){
		return repo.saveAll(e);
	}
	
	
	//update does not have any predefied function
	public Employee updatebyname(Employee e) {
		Employee ee=repo.findById(e.getEmpno()).orElse(null);
		
		/*ee =>
	 {
	    "empno": 2,
	    "empname": "Ravi",
	    "phono": "9644"
	   }
	*/
		ee.setEmpname(e.getEmpname());
		return repo.save(ee);	
	}

	
	
}
