package com.masai.P1;

public class Teacher implements Person{

	public void teaches(){
	      System.out.println("Teacher teaches");
	}

	@Override
	public void job() {
		teaches();
		
	}
	
	

}
