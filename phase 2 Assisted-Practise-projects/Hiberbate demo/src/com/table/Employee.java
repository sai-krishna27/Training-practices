package com.table;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private int e_id;
	//@Column(name="ename")
	private String e_name;
	private String e_email;
	private double e_salary;
	public int getEid() {
		return e_id;
	}
	public void setE_id(int eid) {
		this.e_id = eid;
	}
	public String getE_name() {
		return e_name;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	public String getE_email() {
		return e_email;
	}
	public void setE_email(String e_email) {
		this.e_email = e_email;
	}
	public double getE_salary() {
		return e_salary;
	}
	public void setE_salary(double e_salary) {
		this.e_salary = e_salary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + e_id + ", e_name=" + e_name + ", e_email=" + e_email + ", e_salary=" + e_salary + "]";
	}
	
	
	
	

}
