package usecases;

import javax.persistence.EntityManager;

import model.Address;
import model.Employee;
import utility.EMUtil;



	public class Demo {
		
		public static void main(String[] args) {
			
			EntityManager em= EMUtil.provideEntityManager();
			
			Employee emp=new Employee();
			emp.setEname("Gourav");
			emp.setSalary(8000);
			emp.setAddr(new Address("Telangana", "Hyderabad", "23455"));
			
			
			
			em.getTransaction().begin();
			
			em.persist(emp);
			
			em.getTransaction().commit();
			
			System.out.println("done...");
			
		}

	}
