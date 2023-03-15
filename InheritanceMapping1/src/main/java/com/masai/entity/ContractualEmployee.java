package com.masai.entity;

import javax.persistence.Entity;

@Entity
public class ContractualEmployee extends Employee {

	private int no_of_working_days;
	private int cost_per_day;
	public int getNo_of_working_days() {
		return no_of_working_days;
	}
	public void setNo_of_working_days(int no_of_working_days) {
		this.no_of_working_days = no_of_working_days;
	}
	public int getCost_per_day() {
		return cost_per_day;
	}
	public void setCost_per_day(int cost_per_day) {
		this.cost_per_day = cost_per_day;
	}
	
	
	
}
