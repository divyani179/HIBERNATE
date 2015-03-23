package com.query;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;

import com.util.HibernateUtil;

public class Clientquery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=HibernateUtil.getSessionFactory();
	     Session session=null;
	     Transaction t=null;
	     session=factory.openSession();
	     Scanner sc=new Scanner(System.in);
	     t=session.beginTransaction();
	     User u=new User();
	     u.setCity("bengaluru");
	     u.setName("divya");
	     u.setSalary(3456);
	     
	  
	     
	     Query query =session.createQuery("from User u order by u.name asc");
	     query.setFirstResult(2);
	     query.setMaxResults(10);
	     
	     List al=query.list();
	     Iterator it=al.iterator();
	     while(it.hasNext()){
	    	 User us=(User) it.next();
	    	 System.out.println(us.getName()+" "+us.getSalary());
	     }
	     System.out.println();
	     System.out.println("USING CRITERIa----");
	     System.out.println();
	     
	     
	     Criteria crit=session.createCriteria(User.class);
	     crit.addOrder(Order.asc("name"));
	     crit.setMaxResults(10);
	     
	     List al1=crit.list();
	     Iterator it1=al1.iterator();
	     while(it1.hasNext()){
	    	 User us1=(User) it1.next();
	    	 System.out.println(us1.getName()+" "+us1.getSalary());
	     }
	     
	     System.out.println();
	     System.out.println("NAMED PARAMETERS");
	     System.out.println();
	     
	     String querystring="from User u where u.name like :name and u.city like:city";
	     Query q1=session.createQuery(querystring).setString("name", "divyani");
	     q1.setString("city", "chennai");
	     
	     List list=q1.list();
	     Iterator it2=list.iterator();
	     while(it2.hasNext()){
	    	 User us1=(User) it2.next();
	    	 System.out.println(us1.getName()+" "+us1.getSalary());
	     }
	     
	     System.out.println();
	     System.out.println("POSITIONAL PARAMETERS---");
	     
	     String querystr="from User u where u.city like ? ";
	     Query quer=session.createQuery(querystr);
	     quer.setParameter(0, "bengaluru");
	     
	     List list1=quer.list();
	     Iterator it3=list1.iterator();
	     while(it3.hasNext()){
	    	 User us1=(User) it3.next();
	    	 System.out.println(us1.getName()+" "+us1.getSalary());
	     }
	     
	     System.out.println();
	     System.out.println("UNIQUE RESULT-----");
	     
	     //UNIQUE RESULT 
	 	//throws exception if there are more than one result.

	 	Query q2 = session.createQuery("from User u where u.name like ?");
	 			q2.setParameter(0,"hari");
	 	User use = (User)q2.uniqueResult();
	 	//System.out.println(use.getName());
	 	list = q2.list();
	 	Iterator its=list.iterator();
	 	while(its.hasNext()){
	 		User us = (User)its.next();
	 		System.out.println(us.getName()+" "+us.getSalary());
	 	}
	 	/*	// USING ITERATOR
	 		System.out.println("using iterator");
	 		Iterator  result = q1.iterate();
	 		while(result.hasNext()){
	 			User us = (User)result.next();
	 			System.out.println(us.getName()+" "+us.getSalary());
	 		}
	 	 */	
	
	 	//			q1 = session.createQuery("delete from User u where u.name like:name").setParameter("name","madhu" );
	 	//		q1.executeUpdate();



	 	//Namedqueries
	 	System.out.println();
	 	System.out.println("NAMED QUERIES"); 

	 query = 
	 session.getNamedQuery("findUserBySalary").setParameter("salary",3456);
	 	List all = query.list();
	 	its=all.iterator();
	 	while(its.hasNext()){
	 		User us = (User)its.next();
	 		System.out.println(us.getName()+" "+us.getSalary());

	 	}
	 	//USING SQL QUERY
	 	System.out.println();
	 	System.out.println("Using Sql Query");
	 	//can use unique result also
	 	Query sqlQuery = 
	 	session.createSQLQuery("select {user1.*} from USERs {user1} where user1.name "
	 			+ "like :name").addEntity("user1", User.class);
	 	sqlQuery.setParameter("name", "Seema");
	 	al = sqlQuery.list();
	 	its=al.iterator();
	 	while(its.hasNext()){
	 		User us = (User)its.next();
	 		System.out.println(us.getName()+" "+us.getSalary());
	 	}
	 	//REPORTING
	 	System.out.println();
	 	System.out.println("REPORTING");
	 System.out.println(session.createQuery(
	 		"select count(i) from User i").uniqueResult());
	 System.out.println(session.createQuery(
	 		"select i.name  from User i group by"
	 		+ " i.name having i.name like 'M%'").list());
	     session.save(u);
	     t.commit();
	}

}
