package com.masai;

public class Car implements Vehicle{

	public void start() {
		System.out.println("Car has started...");
	}

	@Override
	public void go() {
		start();
		
	}
	
	
	
}
