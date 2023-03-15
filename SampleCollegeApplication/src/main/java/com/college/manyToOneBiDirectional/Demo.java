package com.college.manyToOneBiDirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import java.util.*;
public class Demo {

	
	public static void main(String[] args) {
		
		//Usage1
		College c1 =new College(); 
		c1.setAddress("Bangalore");
		c1.setName("Masai School"); 
		
		Student s1 =new Student();
		Student s2 =new Student();
		Student s3 =new Student();
		Student s4 =new Student();
		
		
		s1.setName("Ramesh"); 
		s1.setMobileNumber("9839383333");
		s1.setEmail("ramesh@gmail.com");
		s1.setCollege(c1); 
		
		
		s2.setName("Ram"); 
		s2.setMobileNumber("7329292833");
		s2.setEmail("ram@gmail.com");
		s2.setCollege(c1); 
		
		s3.setName("Ganesh"); 
		s3.setMobileNumber("9233283333");
		s3.setEmail("ganesh@gmail.com");
		s3.setCollege(c1); 
		
		
		s4.setName("yadav"); 
		s4.setMobileNumber("1234283833");
		s4.setEmail("yadav@gmail.com");
		s4.setCollege(c1); 
		
		List<Student> students = new ArrayList<>(); 
		students.add(s1); 
		students.add(s2); 
		students.add(s3); 
		students.add(s4);
		c1.setStudents(students);
		
		College c2 =new College(); 
		c2.setName("Aditya Degree College");
		c2.setAddress("Hyderabad");
		
		Student s5 =new Student();
		Student s6 =new Student();
		Student s7 =new Student();
		Student s8 =new Student();
		
		s5.setName("NTR"); 
		s5.setMobileNumber("9933736262");
		s5.setEmail("ntr@gmail.com");
		s5.setCollege(c2);
		
		s6.setName("Ramcharan"); 
		s6.setMobileNumber("3939376346");
		s6.setEmail("ramcharan@gmail.com");
		s6.setCollege(c2);
	
		s7.setName("saipallavi"); 
		s7.setMobileNumber("99387373336");
		s7.setEmail("saipallavi@gmail.com");
		s7.setCollege(c2);
		
		
		s8.setName("nivetha"); 
		s8.setMobileNumber("9939373733");
		s8.setEmail("nivethapethuraj@gmail.com");
		s8.setCollege(c2);
		
		
		List<Student> students2 =new ArrayList<>(); 
		students2.add(s5);
		students2.add(s6);
		students2.add(s7);
		students2.add(s8);
		
		
		c2.setStudents(students2);
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("college-unit"); 
		
		EntityManager em = emf.createEntityManager(); 
		
		em.getTransaction().begin();
		
		em.persist(c1); 
		em.persist(c2); 
		
		em.getTransaction().commit(); 
		
		
		
		
		//Usage 2: Write a JPQL to get all the Student details based on collageId and print the details.
		
		Query q1 = em.createQuery("select s from Student s where collegeID = :collegeID");
		q1.setParameter("collegeID", 1);
		
		
		List<Student> studentListq1=q1.getResultList();
		
		System.out.println("Printing all student details:"); 
		
		for(Student x: studentListq1) {
			System.out.println("Name:"+x.getName());
			System.out.println("RollNumber:"+x.getStudentID()); 
			System.out.println("Email:"+x.getEmail());
			System.out.println("PhoneNumber:"+x.getMobileNumber());
		}
		
		
		//Usage 3: Write a JPQL to get the College details based on studentRoll and print the details.
			
		Student findStudent = em.find(Student.class, 4);
		Query q2 = em.createQuery("select c from College c where collegeID = :collegeID");
		q2.setParameter("collegeID", findStudent.getCollege().getCollegeID()); 
		
		College studentCollege = (College) q2.getSingleResult();
		
		System.out.println("Printing all college details:\n\n");
		
		System.out.println("name:"+studentCollege.getName());
		System.out.println("address:"+studentCollege.getAddress());
		System.out.println("collegeID:"+studentCollege.getCollegeID());
		
		
	}
	

}
