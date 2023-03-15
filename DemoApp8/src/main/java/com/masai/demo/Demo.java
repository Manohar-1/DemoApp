package com.masai.demo;

import javax.persistence.EntityManager;

import com.masai.entity.PhoneUser;
import com.masai.utitlity.EMUtil;

public class Demo {

	public static void main(String[] args) {
		
		EntityManager em = EMUtil.provideEntityManager(); 
		
		PhoneUser p=new PhoneUser(); 
		
		
		
	}
}
