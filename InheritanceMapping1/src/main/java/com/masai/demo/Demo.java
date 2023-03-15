package com.masai.demo;

import javax.persistence.EntityManager;

import com.masai.entity.ContractualEmployee;
import com.masai.entity.Employee;
import com.masai.entity.salariedEmployee;
import com.masai.utility.EMUtil;

public class Demo {

	public static void main(String[] args) {
		EntityManager em = EMUtil.getEntityManager();
	
		em.getTransaction().begin(); 
		Employee emp =new Employee();
		
		emp.setName("Ram");
		
		salariedEmployee emp2= new salariedEmployee(); 
		
		emp2.setName("Krishna");
		emp2.setSalary(4000); 
		
		
		ContractualEmployee emp3 =new ContractualEmployee();
		emp3.setCost_per_day(500);
		emp3.setNo_of_working_days(7);
		
		emp3.setName("Arjun");
		em.persist(emp); 
		
		em.persist(emp2);
		em.persist(emp3); 
		
		em.getTransaction().commit(); 
		
		em.close();
		
		
	}
}
