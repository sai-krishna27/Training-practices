package com.java2;



class EmployeeSalary{
	protected int bonus;
	protected String employee;
	
	void finalSalary(int salary) {
		System.out.println("Salary of "+ employee+" is "+(salary+bonus));
	}
}

//parent class inherited by child class
class ContractEmployee extends EmployeeSalary{
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public void setEmployee(String employee) {
		this.employee = employee;
	}
	
}


class PermanentEmployee extends EmployeeSalary{
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public void setEmployee(String employee) {
		this.employee = employee;
	}
	
}

public class InheritanceDemo{

	public static void main(String[] args) {
		
		System.out.println("------Inheritance------");
		ContractEmployee cE=new ContractEmployee();
		cE.setBonus(5000);
		cE.setEmployee("contract employee");
		cE.finalSalary(20000);
		PermanentEmployee pE=new PermanentEmployee();
		pE.setBonus(10000);
		pE.setEmployee("permanen employee");
		pE.finalSalary(20000);
	}

}

