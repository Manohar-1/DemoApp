package com.college.manyToOneBiDirectional;

import java.util.List;

import javax.persistence.*;

@Entity
public class College {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int collegeID;
	private String name; 
	private String address; 
	
	
	@OneToMany(mappedBy="college",cascade=CascadeType.ALL)
	private List<Student> students;
	
	public College() {
		// TODO Auto-generated constructor stub
	}


	
	public College(int collegeID, String name, String address) {
		super();
		this.collegeID = collegeID;
		this.name = name;
		this.address = address;
	}

	

	public List<Student> getStudents() {
		return students;
	}



	public void setStudents(List<Student> students) {
		this.students = students;
	}



	public int getCollegeID() {
		return collegeID;
	}


	public void setCollegeID(int collegeID) {
		this.collegeID = collegeID;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String principal) {
		this.address = principal;
	}

	
	
}
