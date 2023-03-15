package com.masai.onetomany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Phone {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int phoneID; 
	private String phoneNo;
	
	
	public Phone() {
		
	}
	
	public Phone(int phoneID, String phoneNo) {
		super();
		this.phoneID = phoneID;
		this.phoneNo = phoneNo;
	}
	public int getPhoneID() {
		return phoneID;
	}
	public void setPhoneID(int phoneID) {
		this.phoneID = phoneID;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	
	
}
