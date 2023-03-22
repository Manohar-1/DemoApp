package com.masai.entity;

import javax.persistence.*;

@Entity
public class Account {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int accountID; 
	private String accNo;
	private String type;
	private int balance;
	
	

	@ManyToOne
	private AccountHolder accountHolder;

	
	public Account() {
		
	}
	
	public Account(int accountID, String accNo,String type, AccountHolder accountHolder) {
		super();
		this.accountID = accountID;
		this.accNo = accNo;
		this.type=type;
		this.accountHolder = accountHolder;
	}

	public int getAccountID() {
		return accountID;
	}

	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}

	
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public AccountHolder getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(AccountHolder accountHolder) {
		this.accountHolder = accountHolder;
	} 
	
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
}
