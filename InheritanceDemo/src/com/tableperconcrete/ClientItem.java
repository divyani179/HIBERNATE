package com.tableperconcrete;

import java.util.*;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.util.HibernateUtil;


public class ClientItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=HibernateUtil.getSessionFactory();
		 
		Session session=factory.openSession();
	Transaction t=session.beginTransaction();
	
	
	
	Item i1=new Item();
	i1.setName("item1");
	i1.setCost(120);
	session.save(i1);
	
	
SportsItem si1=new  SportsItem();
si1.setSportstype("football");
si1.setCost(1200);
si1.setName("item2");
session.save(si1);

ElectronicItem ei1=new  ElectronicItem();
ei1.setFeatures("batterylife");
ei1.setModel("X2");
ei1.setCost(3456);
ei1.setName("mobile");
session.save(ei1);

	Query q=session.createQuery("from ElectronicItem");
	List list=q.list();
	Iterator i=list.iterator();
	while(i.hasNext()){
		ElectronicItem scd1=(ElectronicItem) i.next();
		System.out.println(scd1.getName()+" " +scd1.getCost()+" "+scd1.getFeatures()+" "+scd1.getModel()+" "+scd1.getId());
	}
	t.commit();
	session.close();
	System.out.println("success");
	
	
	}

}
