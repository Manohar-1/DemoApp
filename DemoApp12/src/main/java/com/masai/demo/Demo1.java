package com.masai.demo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.masai.entity.Account;
import com.masai.entity.AccountHolder;

public class Demo1 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("employee-unit");
		EntityManager em = emf.createEntityManager(); 
		
		
		AccountHolder ac1 =new AccountHolder(); 
		ac1.setName("Krishna"); 
		
		AccountHolder ac2 =new AccountHolder();
		ac2.setName("Rama"); 
		
		
		Account a1 =new Account(); 
		Account a2=new Account();  
		
		a1.setType("Savings"); 
		a1.setAccNo("11111"); 
		a1.setAccountHolder(ac1); 
		a1.setBalance(5000);
		
		
		
		a2.setType("Salary"); 
		a2.setAccNo("22222"); 
		a2.setAccountHolder(ac1);
		a2.setBalance(6000);
		
		List<Account> ac1List = new ArrayList<>(); 
		ac1List.add(a1);
		ac1List.add(a2);
		
		ac1.setAccount(ac1List);
		
		
		Account a3 =new Account(); 
		Account a4 =new Account(); 
		
		a3.setType("Savings"); 
		a3.setAccNo("33333"); 
		a3.setAccountHolder(ac2); 
		a3.setBalance(8000);
		
		
		a4.setType("Salary"); 
		a4.setAccNo("44444"); 
		a4.setAccountHolder(ac2); 
		a4.setBalance(9000);
		
		List<Account> ac2List =new ArrayList<>(); 
		ac2List.add(a3); 
		ac2List.add(a4); 
		
		
		ac2.setAccount(ac2List);
		
		em.getTransaction().begin(); 
		
		em.persist(ac1); 
		em.persist(ac2); 
		
		em.getTransaction().commit(); 
		em.close(); 
		emf.close();
		
	}
	
}
