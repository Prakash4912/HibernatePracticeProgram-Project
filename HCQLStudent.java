package HQL;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import Hibernate.EmployeeHql;


public class HCQLStudent {
	
	public static void main(String[] args) {
		

				
				Configuration cfg = new Configuration();
				cfg.configure("hibernate.cfg.xml");
				cfg.addAnnotatedClass(Student.class);
				SessionFactory session=cfg.buildSessionFactory();
				Session s = session.openSession();
				Transaction t =s.beginTransaction();
				

				Criteria c = s.createCriteria(Student.class);  
				
				List<Student> stuList = c.list();
				for (Student stu : stuList)
				{
					System.out.println(stu);
				} 
				
			   System.out.println();
			

			  Criteria c1 = s.createCriteria(Student.class);  
			  c1.addOrder(Order.desc("marks"));
			//c1.addOrder(Order.asc("marks"));
			  List<Student> stuList1 = c1.list();
		     for (Student stu : stuList1)
			{
				System.out.println(stu);
			}
			
			System.out.println();
			
			Criteria c2 = s.createCriteria(Student.class);  
			c2.add(Restrictions.gt("marks",40));
			List<Student> stuList2 = c2.list();
			for (Student stu : stuList2)
			{
				System.out.println(stu);
			}
			
			
	        System.out.println();
			
			Criteria c3 = s.createCriteria(Student.class);  
			c3.setProjection(Projections.property("address"));
			List<String> stuList3 = c3.list();
			for (String stu : stuList3)
			{
				System.out.println(stu);
			}
			
			
	        System.out.println();
			
			Criteria c4 = s.createCriteria(Student.class);  
			c4.setFirstResult(1);    //ignore 1st 
			c4.setMaxResults(2);
			List<Student> stuList4 = c4.list();
			for (Student stu : stuList4)
			{
				System.out.println(stu);
			}
			
			
	             t.commit();
	             session.close();
				System.out.println("Successfully Done");
			}

		}



