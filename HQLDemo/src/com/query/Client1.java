package com.query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;


public class Client1 {
	static SessionFactory factory;
	public static void main(String[] args) {
		//sf is the second level cache across sessions
				factory = new AnnotationConfiguration().configure().buildSessionFactory();
				Session session = factory.openSession();
				Transaction t = session.beginTransaction();
				User  u1 =(User)session.get(User.class, 12);
				System.out.println("Name "+u1.getName()+u1.getCity());
				t.commit();
				session.close();
				factory.close();
				factory = new AnnotationConfiguration().configure().buildSessionFactory();
				// if factory is closed creates two query statements.
				session = factory.openSession();
				t = session.beginTransaction();
				u1 =(User)session.get(User.class, 12);
				System.out.println("Name "+u1.getName());
				t.commit();
				session.close();

	}

}
