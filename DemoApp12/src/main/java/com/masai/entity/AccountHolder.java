package com.masai.entity;

import java.util.List;

import javax.persistence.*;

@Entity
public class AccountHolder {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int ID; 
	private String name; 
	
	@OneToMany(mappedBy="accountID",cascade=CascadeType.ALL)
	private List<Account> account;
	
	public AccountHolder() {
		
	}
	
	public AccountHolder(int iD, String name, List<Account> account) {
		super();
		ID = iD;
		this.name = name;
		this.account = account;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Account> getAccount() {
		return account;
	}

	public void setAccount(List<Account> account) {
		this.account = account;
	} 
	
	
	
	
	
	
	
	
	
}
