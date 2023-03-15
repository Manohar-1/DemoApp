package com.masai.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;
@Entity
public class PhoneUser {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	int userID;
	String userName;
	String userEmail;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="USERID")
	private List<Phone> phoneTables;
	
	public PhoneUser() {
	     super();
	}
	
	
	public PhoneUser(int userID, String userName, String userEmail) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.userEmail = userEmail;
	}
	
	
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	
	
	}
	
	
	@Override
	public String toString() {
		return "PhoneUser [userID=" + userID + ", userName=" + userName + ", userEmail=" + userEmail + "]";
	}
	
}
