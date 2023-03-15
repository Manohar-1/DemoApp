package com.OneToOneBD;

import javax.persistence.*;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userid; 
	private String userName;  
	
	@OneToOne
	private Passport passport;
	
	public User() {
		
	}

	public User(int userid, String userName, Passport passport) {
		super();
		this.userid = userid;
		this.userName = userName;
		this.passport = passport;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}
	
	

}
