package com.query;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.util.HibernateUtil;

public class FirstCache {

	public static void main(String[] args) {
		
		SessionFactory factory=HibernateUtil.getSessionFactory();
	     Session session=null;
	     Transaction t=null;
	     session=factory.openSession();
	     Scanner sc=new Scanner(System.in);
	     t=session.beginTransaction();
	     User u1=(User) session.get(User.class,12);
	     System.out.println("name"+u1.getName());
	     session.clear();
	     //session.evict(u1);
	 /*    session.close();
	     session=factory.openSession();
	     t=session.beginTransaction();*/
	     u1=(User) session.get(User.class,12);
	     System.out.println("myname"+u1.getName());
	}

}
