package com.onetoone;

import java.util.List;
import java.util.Scanner;

import org.hibernate.*;

import com.util.*;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         SessionFactory factory=HibernateUtil.getSessionFactory();
         Session session=null;
         Transaction t=null;
         session=factory.openSession();
         Scanner sc=new Scanner(System.in);
         for(int i=1;i<3;i++){
        	 t=session.beginTransaction();
        	 Student stud=new Student();
        	 System.out.println("enter name");
        	 stud.setName(sc.next());
        	 System.out.println("enter department");
        	 stud.setDepartment(sc.next());
        	 Address a=new Address();
        	 System.out.println("enter city");
        
        	 a.setCity(sc.next());
        	 System.out.println("enter state");
        	 a.setState(sc.next());
        	 stud.setAddress(a);
        	 session.save(stud);
        	 t.commit();

         
         }
         String qstring="from Student s where s.address.city like:city";
         Query query =session.createQuery(qstring);
         query.setString("city", "bangalore");
         List<Student> al=query.list();
         for(Student u : al){
        	 System.out.println(u.getName()+u.getAddress().getCity()+u.getDepartment());
         }
	}

}
