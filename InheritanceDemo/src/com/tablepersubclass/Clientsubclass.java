package com.tablepersubclass;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import com.util.HibernateUtil;

public class Clientsubclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory =HibernateUtil.getSessionFactory();
	 
			Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		
		Employee e=new Employee();
		e.setCity("bengaluru");
		e.setName("div");
		e.setSalary(3456);
		session.save(e);
		
		Director d=new Director();
		d.setBenefits("extraperks");
		d.setName("shiv");
		d.setCity("jhs");
		d.setSalary(3456);
		int did=(int) session.save(d);
		
		Manager m=new Manager();
		m.setName("soumya");
		m.setCity("jaipur");
		m.setSalary(4567);
		m.setAllowance(34621);
		session.save(m);
		
		Director sp1=(Director) session.get(Director.class,123);
		System.out.println(sp1);
		Director d1=(Director) session.get(Director.class, did);
		System.out.println(d1);
		Query q=session.createQuery("from Director");
		List list=q.list();
		Iterator i=list.iterator();
		while(i.hasNext()){
			Director scd1=(Director) i.next();
			System.out.println(scd1.getName()+" " +scd1.getBenefits()+" "+scd1.getSalary()+" "+scd1.getCity());
		}
		t.commit();
		
		System.out.println("success");
		
		
	}

}
