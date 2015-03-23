package com.compositekey;

import java.util.Scanner;

import org.hibernate.*;
import com.util.HibernateUtil;

public class ClientBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SessionFactory factory=HibernateUtil.getSessionFactory();
	     Session session=null;
	     Transaction t=null;
	     session=factory.openSession();
	     Scanner sc=new Scanner(System.in);
	     t=session.beginTransaction();
	     BookPk bookpk=new BookPk();
	     bookpk.setBookid(10);
	     bookpk.setIsbn_no(20);
	     Book b=new Book();
	     b.setAuthor("divyani");
	     b.setPrice(2345);
	     b.setTitle("the fault in our stars");
	     b.setBookpk(bookpk);
	     session.save(b);
	     t.commit();
	     System.out.println("success");
	     
	    		 
	}

}
