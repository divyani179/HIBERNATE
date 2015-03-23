package com.onetomany;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.util.HibernateUtil;

public class Client1 {
public static void main(String[] args) {
	 SessionFactory factory=HibernateUtil.getSessionFactory();
     Session session=null;
     Transaction t=null;
     session=factory.openSession();
     Scanner sc=new Scanner(System.in);
     t=session.beginTransaction();
     Book b1=new Book();
     b1.setAuthor("chopra");
     b1.setBookname("life");
     b1.setBookprice(100);
     Book b2=new Book();
     b2.setAuthor("yash");
     b2.setBookname("sur");
     b2.setBookprice(200);
     Set<Book> bs=new HashSet<Book>();
     bs.add(b1);
     bs.add(b2);
     Category c1=new Category();
     c1.setCategoryName("selfhelp");
     c1.setBookNames(bs);
     long catid=(Long) session.save(c1);
     System.out.println("catid"+catid);
     t.commit();
}
}
