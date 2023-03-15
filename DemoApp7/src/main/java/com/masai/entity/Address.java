package com.masai.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name = "ADDRESS") 
public class Address {
	@Id 
	private int aid; 
	private String city; 
	private String zipcode;
	
	
	
	public Address() {
		
	}
	
	public Address(int aid, String city, String zipcode) {
		super();
		this.aid = aid;
		this.city = city;
		this.zipcode = zipcode;
	}
	
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return "Address [aid=" + aid + ", city=" + city + ", zipcode=" + zipcode + "]";
	}
	
	
}