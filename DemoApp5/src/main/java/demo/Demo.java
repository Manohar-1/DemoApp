package demo;

import javax.persistence.EntityManager;

import model.Pet;
import utility.EMUtil;

public class Demo {

	public static void main(String[] args) {
		Pet p=new Pet("Chintu","Lion"); 
		
		EntityManager em=EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit(); 
		em.close();
	}
}
