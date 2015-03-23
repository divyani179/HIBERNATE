package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.bean.Employee;
import com.util.HibernateUtil;

public class Empimpl implements EmpDAO {
private	SessionFactory factory;
	@Override
	public Long addEmployee(Employee e) {
		// TODO Auto-generated method stub
 factory = HibernateUtil.getSessionFactory();
 Session session =factory.openSession();
 Transaction t=session.beginTransaction();
 Long empid=(Long) session.save(e);
 t.commit();
 session.close();
 return empid;
		}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		factory=HibernateUtil.getSessionFactory();
		 Session session =factory.openSession();
		 Query q=session.createQuery("from Employee");
		 List<Employee> alist=q.list();
		 session.close();
		 
		return alist;
	}

	@Override
	public void updateEmployee(long id, int newsalary) {
		// TODO Auto-generated method stub
		factory=HibernateUtil.getSessionFactory();
		 Session session =factory.openSession();
		 Transaction t=session.beginTransaction();
		 Employee e=(Employee) session.get(Employee.class, id);
		 e.setSalary(newsalary);
		 t.commit();
		 session.close();
		 
	}

	@Override
	public List<Employee> getEmployeeBySalary(int sal) {
		// TODO Auto-generated method stub
		String q1="from Employee u where u.salary like:sal";
		String q2="from Employee u where u.salary like ?";
		factory =HibernateUtil.getSessionFactory();
		Session session =factory.openSession();
		Transaction t=session.beginTransaction();
		Query q=session.createQuery(q1);
		q.setInteger("sal", sal);
		Query q3=session.createQuery(q2);
		q3.setParameter(0, sal);
		List<Employee> alist=q.list();
		t.commit();
		return alist;
	}

	@Override
	public void deleteEmp(long id) {
		// TODO Auto-generated method stub
		factory=HibernateUtil.getSessionFactory();
		 Session session =factory.openSession();
		 Transaction t=session.beginTransaction();
		 Employee e=(Employee) session.get(Employee.class, id);
		 session.delete(e);
		 t.commit();
		 session.close();
	}

}
