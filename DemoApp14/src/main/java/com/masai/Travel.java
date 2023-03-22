package com.masai;

public class Travel {

	Vehicle v; 
	
	public void setV(Vehicle v) {
		this.v = v;
	}




	public void journey() {
		System.out.println("Travel calss journey");
		v.go();
	}
	
	
}
