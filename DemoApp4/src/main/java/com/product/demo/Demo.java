package com.product.demo;

import javax.persistence.EntityManager;

import com.product.model.Book;
import com.product.model.Product;
import com.product.utility.EMUtil;

public class Demo {
       public static void main(String[] args){
		    EntityManager em=EMUtil.provideEntityManager(); 
		   
		    
		    Product p=new Product();
		    p.setName("Data Structures And Algorithms");

		    
		    em.getTransaction().begin(); 
		    
		    em.persist(p);
		    
		    em.getTransaction().commit();
		    
		    em.close();
		    
	   }
}
