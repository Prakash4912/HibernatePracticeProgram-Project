package Hibernate;


import java.util.List;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Hqltest{
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(EmployeeHql.class);
		SessionFactory session=cfg.buildSessionFactory();
		Session s = session.openSession();
		Transaction t =s.beginTransaction();
		
		Query query = s.createQuery("from EmployeeHql");
		List<EmployeeHql> empList = query.list();
		for (EmployeeHql emp : empList)
		{
			System.out.println(emp);
		}
	
	
/*Select Query*/		
		Query selectquery = s.createQuery("select name from EmployeeHql	 where id =101");
		String n = (String) selectquery.uniqueResult();
		System.out.println("Employee Name is:"+n);
		
/*update query*/	
		Query updatequery = s.createQuery("update  EmployeeHql set name =:a where id=:b");
		updatequery.setParameter("a", "Akash");
		updatequery.setParameter("b", 104);
		int result = updatequery.executeUpdate();
		System.out.println("Employee Update Status="+result);
		
/*delete query*/	
		Query deletequery = s.createQuery("delete  from EmployeeHql	 where id=:a");
		deletequery.setParameter("a",101);
		int result1 = deletequery.executeUpdate();
		System.out.println("Employee delete status"+result1);
		
/*Aggregate Query to find avg,*/
		
		Query aggquery = s.createQuery("select avg(salary) from EmployeeHql");
	    double c = (Double) aggquery.uniqueResult();
		System.out.println(c);

		
/*count Query*/
		Query countquery = s.createQuery("select count(id) from EmployeeHql");
		long l = (Long) countquery.uniqueResult();
		System.out.println(l);
		t.commit();
		System.out.println("Successfully Done");
		session.close();
	}

}

