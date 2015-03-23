package com.tableperclass;

import java.util.*;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.util.HibernateUtil;

public class CdClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory =HibernateUtil.getSessionFactory();
		Session session=null;
		Transaction t=null;
		session=factory.openSession();
		t=session.beginTransaction();
		
		
		CdClass cd=new CdClass();
		cd.setCost(345.67);
		cd.setTitle("speed");
		session.save(cd);
		
		
		SpecialCd scd=new SpecialCd();
		scd.setGenre("genres");
		scd.setCost(1234.56);
		scd.setTitle("speedspecial");
		session.save(scd);
		
		InterCd icd=new InterCd();
		icd.setCost(123.45);
		icd.setTitle("speedInter");
		icd.setLanguage("english");
		icd.setRegion("bengaluru");
		session.save(icd);
		
		SpecialCd sp1=(SpecialCd) session.get(SpecialCd.class,123);
		System.out.println(sp1);
		Query q=session.createQuery("from SpecialCd");
		List list=q.list();
		Iterator i=list.iterator();
		while(i.hasNext()){
			SpecialCd scd1=(SpecialCd) i.next();
			System.out.println(scd1.getTitle()+" " +scd1.getCost()+" "+scd1.getGenre());
		}
		t.commit();
		
		System.out.println("success");
		
	}

}
