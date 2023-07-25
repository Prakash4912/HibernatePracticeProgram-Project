package HQL;


import java.util.List;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class HqlTest{
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		SessionFactory session=cfg.buildSessionFactory();
		Session s = session.openSession();
		Transaction t =s.beginTransaction();
		
		Query query = s.createQuery("from Student");
		List<Student> stuList = query.list();
		for (Student stu : stuList)
		{
			System.out.println(stu);
		}
	
	
/*Select Query*/		
		Query selectquery = s.createQuery("select firstname from  Student where id = 1");
		String n = (String) selectquery.uniqueResult();
		System.out.println("Student Name is:"+n);
		
/*update query*/	
		Query updatequery = s.createQuery("update Student set firstname =:a where id=:b");
		updatequery.setParameter("a", "Akash");
		updatequery.setParameter("b", 1);
		int result = updatequery.executeUpdate();
		System.out.println("Student Update Status="+result);
		
/*delete query*/	
		Query deletequery = s.createQuery("delete  Student where id=:a");
		deletequery.setParameter("a",2);
		int result1 = deletequery.executeUpdate();
		System.out.println(" delete status" +result1);
		
/*Aggregate Query to find avg,*/
		
		Query aggquery = s.createQuery("select avg(marks) from Student");
	    double c = (Double) aggquery.uniqueResult();
		System.out.println(c);

		
/*count Query*/
		Query countquery = s.createQuery("select count(id) from Student");
		long l = (Long) countquery.uniqueResult();
		System.out.println(l);
		
		t.commit();
		s.close();
		session.close();
		System.out.println("Successfully Done");
	}

}

