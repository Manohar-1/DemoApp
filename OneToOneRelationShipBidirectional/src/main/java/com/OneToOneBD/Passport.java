package com.OneToOneBD;

import javax.persistence.*;

@Entity
public class Passport {
 
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int pid; 
	private String pno; 
	
	@OneToOne(mappedBy="passport",cascade=CascadeType.ALL)
	private User user;
	
	public Passport() {
		
	}

	
	
	public Passport(int pid, String pno, User user) {
		super();
		this.pid = pid;
		this.pno = pno;
		this.user = user;
	}



	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPno() {
		return pno;
	}

	public void setPno(String pno) {
		this.pno = pno;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	

}
