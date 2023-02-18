package usecases;

import javax.persistence.EntityManager;

import model.Address;
import model.Employee;
import utility.EMUtil;



public class Demo {
	
	public static void main(String[] args) {
		
		EntityManager em= EMUtil.provideEntityManager();
		
//		Employee emp=new Employee();
//		emp.setEname("Ram");
//		emp.setSalary(7800);
		
		Employee emp= new Employee();
		emp.setEname("Ganesh");
		emp.setSalary(8000);
		emp.getAddresses().add(new Address("AP", "Amaravati", "787887","home"));
		emp.getAddresses().add(new Address("TS", "Hyderabad", "584542","office"));
		
		
		em.getTransaction().begin();
		
		em.persist(emp);
		
		em.getTransaction().commit();
		
		System.out.println("done...");
				
	}

}