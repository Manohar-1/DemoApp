package com.masai.onetomany;

import java.util.ArrayList;
import java.util.List;

public class Demo4 {

	public static void main(String[] args) {
		User u1 =new User(); 
		
		u1.setName("Rahul");
		u1.setEmail("rahul@gmail.com");
		
		
		Phone p1 =new Phone(); 
		p1.setPhoneNo("728282"); 
		 
		Phone p2 =new Phone(); 
		p2.setPhoneNo("999992"); 
		
		List<Phone> phones =new ArrayList<>(); 
		phones.add(p1) ;
		phones.add(p2); 
		
		u1.setPhone(phones); 
		
		
		
	}

}
