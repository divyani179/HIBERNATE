package com.util;

import org.hibernate.*;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	
	private static SessionFactory sessionfactory;
	static{
		sessionfactory=new AnnotationConfiguration().configure().buildSessionFactory();
	
		
	}
	
	
	private HibernateUtil(){
		super();
		
	}
	public static SessionFactory getSessionFactory(){
		return sessionfactory;
	}
}
