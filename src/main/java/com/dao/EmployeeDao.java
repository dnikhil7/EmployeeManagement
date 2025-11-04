package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.model.Employee;
import com.util.HibernateUtil;

public class EmployeeDao {
	
	public List<Employee> getAllEmployees(){
		List<Employee> emp = new ArrayList<Employee>();
		SessionFactory sessionFactory = HibernateUtil.getSession();
		Session session = sessionFactory.openSession();
		try {
			emp=session.createQuery("From Employee", Employee.class).list();
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		session.close();
		return emp;
	}
	
	public void addEmployee(Employee emp) {
		try {
			SessionFactory sessionFactory = HibernateUtil.getSession();
			Session session = sessionFactory.openSession();
			
			session.beginTransaction();
			Employee emp1 = new Employee(emp.getName(), emp.getAge(), emp.getEmail(), emp.getPhoneNo(), emp.getSalary());
			session.persist(emp1);
			session.getTransaction().commit();
		}
		catch(Exception e) {
			e.printStackTrace();
		}		
	}
	
	public void deleteEmployee(int id) {
		
		try {
			SessionFactory sessionFactory = HibernateUtil.getSession();
			Session session = sessionFactory.openSession();
			session.beginTransaction();
			Employee emp = new Employee(id, " ", 0," "," ", 0.0);
			session.remove(emp);
			session.getTransaction().commit();
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
	
	}
	
	public Employee getEmployee(int id) {
		Employee emp=null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSession();
			Session session = sessionFactory.openSession();
			 emp = session.find(Employee.class, id);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return emp;
	}
	
	public void updateEmployee(Employee employee) {
		try {
			SessionFactory sessionFactory = HibernateUtil.getSession();
			Session session = sessionFactory.openSession();
			session.beginTransaction();
			Employee emp=session.find(Employee.class, employee.getEmpId());
			emp.setName(employee.getName());
			emp.setAge(employee.getAge());
			emp.setEmail(employee.getEmail());
			emp.setPhoneNo(employee.getPhoneNo());
			emp.setSalary(employee.getSalary());
			emp.setEmpId(employee.getEmpId());
			session.merge(emp);
			session.getTransaction().commit();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
