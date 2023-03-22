package com.masai.daoApp;

import com.masai.entity.Account;

public class ServiceBean {


	private DAOBean dao;

	public void setDao(DAOBean dao) {
		this.dao = dao;
	}
	
	
	public void calculateInterest() {
		Account ac=dao.findAccount(3);
		
		System.out.println("Interest calculated in Service Layer..");
	}


}
