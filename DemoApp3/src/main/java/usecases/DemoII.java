package usecases;

import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.Address;
import model.Employee;
import utility.EMUtil;

public class DemoII {

	public static void main(String[] args) {
		
		
		EntityManager em= EMUtil.provideEntityManager();
		
		//get all the Address of a Employee whose name is Ramesh
		
		String jpql="Select e from Employee e where ename='Ganesh'";
		
		Query q= em.createQuery(jpql);
	
		List<Employee> emps= q.getResultList();
		
		for(Employee emp:emps) {
//			System.out.println(emp);
			Set<Address> addrs= emp.getAddresses();
			
			for(Address adr:addrs) {
				
				System.out.println(adr);
			}
			
			
		}
		
		em.close();
		
	}
	
	
}