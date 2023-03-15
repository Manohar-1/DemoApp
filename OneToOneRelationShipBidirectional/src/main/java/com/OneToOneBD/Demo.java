package com.OneToOneBD;

import javax.persistence.*;

public class Demo {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("passport-unit"); 
		EntityManager em = emf.createEntityManager(); 
		
		em.getTransaction().begin(); 
		
		Passport p =new Passport(); 
		p.setPno("1001"); 
		
		User u =new User(); 
		u.setUserName("Gourav");
		
		p.setUser(u); 
		u.setPassport(p); 
		
		em.persist(p);
		
		em.getTransaction().commit(); 
		
		Passport p1 = em.find(Passport.class, 1);
		System.out.println(p1.getPid());
		System.out.println(p1.getPno()); 
		
		User u1 = p1.getUser(); 
		
		System.out.println(u1.getUserName()); 
		System.out.println(u1.getUserid());
		
		em.close();
	}
}
