package com.sample.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PatientRepository extends JpaRepository<Patient, Integer> {
	@Query("from Patient where age>?1")
	public List<Patient> customQuery(int age);
}
