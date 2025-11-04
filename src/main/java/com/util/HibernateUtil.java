package com.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Employee;
import com.model.Users;

public class HibernateUtil {
	
private static SessionFactory sessionFactory=null;
	
	public static SessionFactory getSession() {
		
		if(sessionFactory==null) {
			Configuration cfg=new Configuration();
			
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(Users.class);
			cfg.addAnnotatedClass(Employee.class);
			
			SessionFactory sessionFactory=cfg.buildSessionFactory();
			return sessionFactory;
		}
		return sessionFactory;
	}

}
