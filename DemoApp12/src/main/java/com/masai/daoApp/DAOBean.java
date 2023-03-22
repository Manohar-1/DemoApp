package com.masai.daoApp;

import javax.persistence.*;

import com.masai.entity.Account;


public class DAOBean {

    public Account findAccount(int id) {
		
		//taking jdbc or ORM approcah to get the account info from the DB

    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("employee-unit"); 
    	EntityManager em = emf.createEntityManager(); 
    	
    	Account ac = em.find(Account.class, id);
    	
		System.out.println("Account details feteched and given by DAO Bean of DAL");
		
		return ac;
	}
	
}
