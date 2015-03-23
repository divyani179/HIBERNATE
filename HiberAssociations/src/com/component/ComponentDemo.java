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
p.setName("raman");
PersonAddress ps=new PersonAddress();
ps.setCity("chennAI");
ps.setState("TN");
ps.setZipcode(303313);
p.setAddress(ps);
session.save(p);
	t.commit();
	}

}
