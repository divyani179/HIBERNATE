package com.basic;

import java.util.Iterator;
import java.util.List;

import org.hibernate.*;


import com.util.HibernateUtil;

public class MobTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=HibernateUtil.getSessionFactory();
		 
		Session session=factory.openSession();
	Transaction t=session.beginTransaction();
	Mobile m=new Mobile();
	m.setModel("x2");
	m.setPrice(2345);
	session.save(m);
	
	
	Query q=session.createQuery("from Mobile");
	List list=q.list();
	Iterator i=list.iterator();
	while(i.hasNext()){
		Mobile m1= (Mobile) i.next();
		System.out.println(m1.getModel()+" " +m1.getPrice()+" "+m1.getId());
	}
	t.commit();
	session.close();
	System.out.println("success");
	}

}
