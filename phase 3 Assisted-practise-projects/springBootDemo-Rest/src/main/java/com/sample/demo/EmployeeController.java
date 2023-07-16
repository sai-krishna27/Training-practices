package com.sample.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeDAO dao;
	
	@Autowired
	EmployeeRepo crud;
	
	@PostMapping("/")
	public String secure() {
		return "you are authenticated";
	}
	
	@PostMapping("/insert")
	public Employee insert(@RequestBody Employee e) {
		return dao.insert(e); 
	}
	
	@PostMapping("/insertall")
	public List<Employee> insertall(@RequestBody List<Employee> e) {
		return dao.insertall(e);
	}
	
	@GetMapping("/getall")
	public List<Employee> getall() {
		return crud.findAll();
	}
	
	
	@GetMapping("/getbyid/{id}")
	public Optional<Employee> getById(@PathVariable int id) {
		return crud.findById(id);
	}
	
	@DeleteMapping("/deletebyid/{id}")
	public String deleteById(@PathVariable int id) {
		crud.deleteById(id);
		return "deleted successfully";
	}
	
	@PutMapping("/update")
		public Employee updatebyname(@RequestBody Employee e) {
		return dao.updatebyname(e);	
		}

	@GetMapping("/getphono/{name}/{id}")
	public String getphono(@PathVariable("name") String name,@PathVariable("id") int id) throws Exception {
		if(crud.findPhonenobyidname(name, id)!=null) {
			return crud.findPhonenobyidname(name, id);
		}
		else {
			throw new ResourceNotFoundException("the phono is not found");
		}
	}

}
