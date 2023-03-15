package com.masai.demo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;

import com.masai.entity.Course;
import com.masai.entity.Student;
import com.masai.utitlity.EMUtil;

public class Demo{

        public static void main(String[] args) {

                EntityManager em = EMUtil.provideEntityManager();

 

                em.getTransaction().begin();

//                Course c1 = new Course();
//                c1.setCname("JAVA");
//
//                Course c2 = new Course();
//                c2.setCname("SERVLET");
//
//                Course c3 = new Course();
//                c3.setCname("JSP");
//
//                Student s1 = new Student();
//                s1.setSname("Manu Manjunatha");
//
//                Student s2 = new Student();
//                s2.setSname("Advith Tyagraj");
//
// 
//                Set<Course> sc = new HashSet<>();
//                sc.add(c1);
//                sc.add(c2);
//                sc.add(c3);
//
//                Set<Student> ss = new HashSet<>();
//                ss.add(s1);
//                ss.add(s2);
//
//                // ASSOCIATING STUDENT WITH COURSE
//
//                c1.setStudents(ss);
//                c2.setStudents(ss);
//                c3.setStudents(ss);
//
//                // ASSOCIATING COURSE WITH STUDENT
//                s1.setCourses(sc);
//                s2.setCourses(sc);
//
//                em.persist(s1);
//                em.persist(s2);

                em.getTransaction().commit();

 

                em.getTransaction().begin();

                // STUDENT CAN ACCESS COURSE

                Student s = em.find(Student.class, 1);

                System.out.println("Student id is " + s.getSid());

                System.out.println("Student name is " + s.getSname());

                Set<Course> z = s.getCourses();

                for (Course course : z) {

                        System.out.println("This student has joined for following courses " + course.getCname());

                }

 
                // COURSE CAN ACCESS STUDENT

                Course c = em.find(Course.class, 2);

                System.out.println("Course id is " + c.getCid());

                System.out.println("Course name is " + c.getCname());

                Set<Student> students = c.getStudents();

                for (Student stu : students) {

                        System.out.println("Following students have joined for this course " + stu.getSname());

                }

                em.getTransaction().commit();

        }

}