package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	
	private String name;
	
	private int age;
	
	private String email;
	
	private String phone_no;
	
	private double salary;
	
	public Employee() {
		
	}

	public Employee(int empId, String name, int age, String email, String phoneNo, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.age = age;
		this.email = email;
		this.phone_no = phoneNo;
		this.salary = salary;
	}

	public Employee(String name, int age, String email, String phoneNo, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.phone_no = phoneNo;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return phone_no;
	}

	public void setPhoneNo(String phoneNo) {
		this.phone_no = phoneNo;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", age=" + age + ", email=" + email + ", phoneNo="
				+ phone_no + ", salary=" + salary + "]";
	}
	
	
	

}
