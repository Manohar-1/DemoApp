package com.masai.onetomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userID;
	private String name; 
	private String email; 
	
	@OneToMany(cascade=CascadeType.ALL) 
	@JoinColumn(name="USERID")
	private List<Phone> phone;

	
	
	
	public User(int userID, String name, String email, List<Phone> phone) {
		super();
		this.userID = userID;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	public User() {
		
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Phone> getPhone() {
		return phone;
	}

	public void setPhone(List<Phone> phone) {
		this.phone = phone;
	} 
	
	
	

}
