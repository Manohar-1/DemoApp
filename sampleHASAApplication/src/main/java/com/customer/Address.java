package com.customer;

import javax.persistence.*;


public class Address {

	private String city; 
	private String pincode; 
	private String state; 
	private String type;
	
	
	public Address() {
		// TODO Auto-generated constructor stub
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getPincode() {
		return pincode;
	}


	public void setPincode(String pincode) {
		this.pincode = pincode;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}

	
	
}
