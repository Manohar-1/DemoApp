package com.masai.entity;
import javax.persistence.Entity;

@Entity
public class salariedEmployee extends Employee {

	private int salary;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
