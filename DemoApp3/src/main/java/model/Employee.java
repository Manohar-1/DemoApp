package model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable; 
import javax.persistence.JoinColumn;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int eid;
	private String ename;
	private int salary;

	@ElementCollection(fetch=FetchType.EAGER)
	@Embedded
	@JoinTable(name="empaddress",joinColumns=@JoinColumn(name="emp_id"))
	private Set<Address> addresses=new HashSet<Address>();

	public Employee(int eid, String ename, int salary, Set<Address> addresses) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.addresses = addresses;
	}

	public Employee() {
		
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Set<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", addresses=" + addresses + "]";
	}



}