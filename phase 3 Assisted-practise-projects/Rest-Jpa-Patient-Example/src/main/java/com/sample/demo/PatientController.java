package com.sample.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {
	
	@Autowired
	PatientRepository crud;
	
	@PostMapping("/insert")
	public Patient insert(@RequestBody Patient p) {
		return crud.save(p);
	}
	
	@GetMapping("getdetails")
	public List<Patient> getDetails(){
		return crud.findAll();
	}
	
	@PutMapping("updatedisease")
	public Patient updateDisease(@RequestBody Patient patient){
		Patient p=crud.findById(patient.getId()).orElse(null);
		p.setDisease(patient.getDisease());
		return p;
	}
	
	@DeleteMapping("deletebyid/{id}")
	public String deleteById(@PathVariable int id) {
		crud.deleteById(id);
		return "item deleted";
	}
	
	@GetMapping("customquery/{age}")
	public List<Patient> custom(@PathVariable int age){
		return crud.customQuery(age);
	}
}
