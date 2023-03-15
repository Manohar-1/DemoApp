package com.customer;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import javax.persistence.Persistence;

public class Demo {

	public static void main(String[] args) {
		Customer c1 =new Customer(); 
		Customer c2 =new Customer(); 
		
		
		c1.setName("Ram");
		c1.setMobileNumber("99388338");
		c1.setEmail("ram@gmail.com");
		
		Address ac11= new Address(); 
		Address ac12=new Address(); 
		
		ac11.setCity("Hyderabad");
		ac11.setState("Telangana");
		ac11.setPincode("299222");
		ac11.setType("OFFICE");
		
		ac12.setCity("Bangalore");
		ac12.setState("Karnataka");
		ac12.setPincode("2994322");
		ac12.setType("HOME");
		
		List<Address> addressListC1 =new ArrayList<>(); 
		addressListC1.add(ac11);
		addressListC1.add(ac12); 
		
		c1.setAddresses(addressListC1);
		
		
		c2.setName("Shiva");
		c2.setMobileNumber("37739494");
		c2.setEmail("shiva@gmail.com");
		
		Address ac21= new Address(); 
		Address ac22=new Address(); 
		
		ac21.setCity("Patna");
		ac21.setState("Bihar");
		ac21.setPincode("88373");
		ac21.setType("OFFICE");
		
		ac22.setCity("Srinagar");
		ac22.setState("Kashmir");
		ac22.setPincode("883833");
		ac22.setType("HOME");
		
		List<Address> addressListC2 =new ArrayList<>(); 
		addressListC2.add(ac21);
		addressListC2.add(ac22); 
		
		c2.setAddresses(addressListC2); 
		 
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("customer-unit");

		EntityManager em = emf.createEntityManager(); 
		em.getTransaction().begin();
		em.persist(c1); 
		em.persist(c2); 
		em.getTransaction().commit();
		
		
		Query q = em.createQuery("from Customer where cid = :cid"); 
  		q.setParameter("cid", 2);
		
		Customer fc =(Customer)q.getSingleResult(); 
		
		List<Address> fetchedAddress=fc.getAddresses();
		
		for(Address x: fetchedAddress) {
			System.out.println(x.getCity());
			System.out.println(x.getPincode()); 
			System.out.println(x.getType());
		}
		
		
		
	}

}
