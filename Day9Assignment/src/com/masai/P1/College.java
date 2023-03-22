package com.masai.P1;

public class College {

	
	 Person p; 
	
	 College(Person p){
		 this.p = p;
	 }
	
	
	 public void doJob() {
		  System.out.println("Job has started...");
		  p.job();
	 }
	 
}
