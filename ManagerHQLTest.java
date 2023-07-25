package HQL;

import javax.persistence.Entity;


import java.util.List;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


@Entity
public class ManagerHQLTest{
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Manager.class);
		SessionFactory session=cfg.buildSessionFactory();
		Session s = session.openSession();
		Transaction t =s.beginTransaction();
		
		Query query = s.createQuery("from Manager");
		List<Manager> ManList = query.list();
		for (Manager man : ManList)
		{
			System.out.println(man);
		}
	
	
/*Select Query*/		
		Query selectquery = s.createQuery("select name from Manager where id = 1");
		String n = (String) selectquery.uniqueResult();
		System.out.println("Manager Name is:"+n);
		
/*update query*/	
		Query updatequery = s.createQuery("update Manager set name =:a where id=:b");
		updatequery.setParameter("a", "Akash");
		updatequery.setParameter("b", 1);
		int result = updatequery.executeUpdate();
		System.out.println("Manager Update Status="+result);
		
/*delete query*/	
		Query deletequery = s.createQuery("delete Manager where id=:a");
		deletequery.setParameter("a",2);
		int result1 = deletequery.executeUpdate();
		System.out.println(" delete status" +result1);
		
/*Aggregate Query to find avg,*/
		
		Query aggquery = s.createQuery("select avg(salary) from Manager");
	    double c = (Double) aggquery.uniqueResult();
		System.out.println(c);

		
/*count Query*/
		Query countquery = s.createQuery("select count(id) from Manager");
		long l = (Long) countquery.uniqueResult();
		System.out.println(l);
		
		t.commit();
		s.close();
		session.close();
		System.out.println("Successfully Done");
	}

}

