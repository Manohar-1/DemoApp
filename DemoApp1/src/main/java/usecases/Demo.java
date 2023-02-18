package usecases;

import javax.persistence.EntityManager;

import model.Address;
import model.Employee;
import utility.EMUtil;



	public class Demo {
		
		public static void main(String[] args) {
			
			EntityManager em= EMUtil.provideEntityManager();
			
			Employee emp=new Employee(); 
			
			emp.setEname("Gaurav"); 
			emp.setSalary(40000);
			emp.setHome_addr(new Address("patna","Bihar","32228"));
			emp.setOffice_addr(new Address("Hyderabad","Telangana","23423")); 
			
			em.getTransaction().begin(); 
			
			em.persist(emp);
			
			em.getTransaction().commit(); 
			
			em.close(); 
			
		}

	}
