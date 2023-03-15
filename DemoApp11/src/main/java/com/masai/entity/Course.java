package com.masai.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "COURSE")
public class Course {

        @Id
        @Column(name = "CID")
        @GeneratedValue(strategy=GenerationType.AUTO)
        private int cid;

        @Column(name = "CNAME")
        private String cname;

        @ManyToMany(mappedBy = "courses",cascade=CascadeType.ALL)
        private Set<Student> students;

		public int getCid() {
			return cid;
		}

		public void setCid(int cid) {
			this.cid = cid;
		}

		public String getCname() {
			return cname;
		}

		public void setCname(String cname) {
			this.cname = cname;
		}

		public Set<Student> getStudents() {
			return students;
		}

		public void setStudents(Set<Student> students) {
			this.students = students;
		}
	
				
        

}