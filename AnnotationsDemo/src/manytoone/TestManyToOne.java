package manytoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.util.HibernateUtil;



public class TestManyToOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SessionFactory factory=HibernateUtil.getSessionFactory();

			Session session = factory.openSession();
			Transaction t = session.beginTransaction();
		    Category c = new Category("Technical");
		    Book b = new Book("java","Kathy",c);
		    Book b1 = new Book("JSP","wrox",c);
		    session.save(b);
		    session.save(b1);
		    //session.flush();
		    t.commit();
		

	}

}
