package model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int eid;
	private String ename;
	private int salary;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="state",column=@Column(name="HOME_STATE")), 
		@AttributeOverride(name="city",column=@Column(name="HOME_CITY")),
		@AttributeOverride(name="pincode",column=@Column(name="HOME_PINCODE"))
	})
	private Address home_addr; 
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="state",column=@Column(name="OFFICE_STATE")),
		@AttributeOverride(name="city",column=@Column(name="OFFICE_CITY")),
		@AttributeOverride(name="pincode",column=@Column(name="OFFICE_PINCODE"))
	})
	private Address office_addr;
	
	public Employee() {
		
	}

	public Employee(int eid, String ename, int salary, Address home_addr, Address office_addr) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.home_addr = home_addr;
		this.office_addr = office_addr;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", home_addr=" + home_addr
				+ ", office_addr=" + office_addr + "]";
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

	public Address getHome_addr() {
		return home_addr;
	}

	public void setHome_addr(Address home_addr) {
		this.home_addr = home_addr;
	}

	public Address getOffice_addr() {
		return office_addr;
	}

	public void setOffice_addr(Address office_addr) {
		this.office_addr = office_addr;
	}

	
}