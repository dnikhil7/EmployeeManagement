package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.model.Users;
import com.util.HibernateUtil;

public class UserDao {
	
	public void saveUser(Users user) {
		try {
			SessionFactory sessionFactory = HibernateUtil.getSession();
			Session session = sessionFactory.openSession();
			
			session.beginTransaction();
			user.setEmail(user.getEmail());
			user.setPassword(user.getPassword());
			
			session.persist(user);
			
			session.getTransaction().commit();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
		public boolean validateUser(Users user) {
			
			try {
				SessionFactory sessionFactory = HibernateUtil.getSession();
				Session session = sessionFactory.openSession();
				
			   Users user1=session.find(Users.class, user.getEmail());
			   System.out.println(user1);
			   
			   return user !=null && user.getPassword().equals(user1.getPassword());
			     
			}
			
			catch(Exception e) {
				e.printStackTrace();
			}
			return false;
		}
}

