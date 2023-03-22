package com.masai;

public class Bike implements Vehicle {

	public void ride() {
		System.out.println("Bike ride has just started...");
	}
	
	@Override
	public void go() {
		ride();
	}

}
