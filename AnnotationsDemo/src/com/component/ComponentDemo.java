package com.component;

import org.hibernate.*;
import org.hibernate.SessionFactory;

import com.util.HibernateUtil;

public class ComponentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SessionFactory factory =HibernateUtil.getSessionFactory();
	Session session=null;
	Transaction t=null;
	session=factory.openSession();
	t=session.beginTransaction();
	Person p=new Person();
p.setName("divyani");
PersonAddress ps=new PersonAddress();
ps.setCity("bengaluru");
ps.setState("karnataka");
ps.setZipcode(560048);
p.setAddress(ps);
System.out.println(p);
session.save(p);
	t.commit();
	}

}
