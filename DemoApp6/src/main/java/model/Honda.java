package model;

import javax.persistence.Entity;

@Entity
public class Honda extends Vehicle{
    String name;
	String color;
	int mileage;
//	
	public Honda(String name, String color, int mileage) {
		super();
		this.name = name;
		this.color = color;
		this.mileage = mileage;
	}
	
	
	
	
}
