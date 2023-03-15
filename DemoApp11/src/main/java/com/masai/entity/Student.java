package com.masai.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "STUDENT")
public class Student {

        @Id
        @Column(name = "SID")
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int sid;
       
        @Column(name = "SNAME")
        private String sname;

        @ManyToMany(cascade = CascadeType.ALL)
        @JoinTable(name = "STUDENTCOURSE", joinColumns = {@JoinColumn(name = "SID") }, inverseJoinColumns = { @JoinColumn(name = "CID") })
        private Set<Course> courses;

		public int getSid() {
			return sid;
		}

		public void setSid(int sid) {
			this.sid = sid;
		}

		public String getSname() {
			return sname;
		}

		public void setSname(String sname) {
			this.sname = sname;
		}

		public Set<Course> getCourses() {
			return courses;
		}

		public void setCourses(Set<Course> courses) {
			this.courses = courses;
		}

	    
}