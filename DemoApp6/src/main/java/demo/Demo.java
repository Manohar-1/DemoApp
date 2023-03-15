package demo;

import javax.persistence.EntityManager;

import model.Honda;
import model.Vehicle;
import utility.EMUtil;

public class Demo {

	public static void main(String[] args) {
		Honda h=new Honda("Pulsar","Black",60);
		h.setVehicleId(45);
		h.setManufacturer("Mahindra");
		
		EntityManager em=EMUtil.provideEntityManager(); 
		
		em.getTransaction().begin();
		em.persist(h);
		em.getTransaction().commit(); 
		em.close(); 
		System.out.println("DONE...");
	}
	
}
