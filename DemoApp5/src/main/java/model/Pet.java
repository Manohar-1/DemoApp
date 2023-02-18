package model;

import javax.persistence.Entity;

@Entity
public class Pet extends Animal {

	private String name;


	
	public Pet(String name, String species) {
		super(species);
		this.name=name;
	}

	
	
	

	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	@Override
	public String toString() {
		return "Pet [name=" + name + "]";
	}

	
	

}