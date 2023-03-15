package com.masai.entity;

import javax.persistence.ManyToOne;

public class Phone {
	int phoneID;
	String phoneType;
	String phoneNo;
	int userID;

	
	public Phone() {
		super();
	}


	public Phone(int phoneID, String phoneType, String phoneNo, int userID) {
		super();
		this.phoneID = phoneID;
		this.phoneType = phoneType;
		this.phoneNo = phoneNo;
		this.userID = userID;
	}


	public int getPhoneID() {
		return phoneID;
	}


	public void setPhoneID(int phoneID) {
		this.phoneID = phoneID;
	}


	public String getPhoneType() {
		return phoneType;
	}


	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}


	public String getPhoneNo() {
		return phoneNo;
	}


	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}


	public int getUserID() {
		return userID;
	}


	public void setUserID(int userID) {
		this.userID = userID;
	}


	@Override
	public String toString() {
		return "Phone [phoneID=" + phoneID + ", phoneType=" + phoneType + ", phoneNo=" + phoneNo + ", userID=" + userID
				+ "]";
	} 

	
	

}
