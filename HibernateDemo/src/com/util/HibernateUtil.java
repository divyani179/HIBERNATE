package com.util;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	
	private static SessionFactory sessionfactory;
	static{
		Configuration configuration=new Configuration().configure("hibernate.cfg.xml");
		sessionfactory=configuration.buildSessionFactory();
		
	}
	
	
	private HibernateUtil(){
		super();
		
	}
	public static SessionFactory getSessionFactory(){
		return sessionfactory;
	}
}
