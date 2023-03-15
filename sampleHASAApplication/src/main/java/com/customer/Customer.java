package com.customer;
import java.util.List;

import javax.persistence.*;

@Entity
public class Customer {
   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cid;
	private String name;
	private String mobileNumber;
	private String email;
	
	@Embedded
	@ElementCollection(fetch=FetchType.EAGER)
	@JoinTable(name = "Address",joinColumns=@JoinColumn(name="cid"))
	private List<Address> addresses;
	
	
	public Customer() {
		
	}


	public int getCid() {
		return cid;
	}


	public void setCid(int cid) {
		this.cid = cid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public List<Address> getAddresses() {
		return addresses;
	}


	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	
	
	
	

}
