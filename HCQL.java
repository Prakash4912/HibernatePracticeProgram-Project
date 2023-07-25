package Hibernate;
//Hibernate Criteria Query Language
   import java.util.List;

    import org.hibernate.Criteria;
	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;
	import org.hibernate.cfg.Configuration;
    import org.hibernate.criterion.Order;
    import org.hibernate.criterion.Projections;
    import org.hibernate.criterion.Restrictions;
	
public class HCQL
{
		
		public static void main(String[] args) {
			
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(EmployeeHql.class);
			SessionFactory session=cfg.buildSessionFactory();
			Session s = session.openSession();
			Transaction t =s.beginTransaction();
			
			Criteria c = s.createCriteria(EmployeeHql.class);  
			
			List<EmployeeHql> empList = c.list();
			for (EmployeeHql emp : empList)
			{
				System.out.println(emp);
			} 
			
		   System.out.println();
		

		  Criteria c1 = s.createCriteria(EmployeeHql.class);  
		  c1.addOrder(Order.desc("salary"));
		//c1.addOrder(Order.asc("salary"));
		  List<EmployeeHql> empList1 = c1.list();
		for (EmployeeHql emp : empList1)
		{
			System.out.println(emp);
		}
		
		System.out.println();
		
		Criteria c2 = s.createCriteria(EmployeeHql.class);  
		c2.add(Restrictions.gt("salary",400000.00));
		List<EmployeeHql> empList2 = c2.list();
		for (EmployeeHql emp : empList2)
		{
			System.out.println(emp);
		}
		
		
        System.out.println();
		
		Criteria c3 = s.createCriteria(EmployeeHql.class);  
		c3.setProjection(Projections.property("address"));
		List<String> empList3 = c3.list();
		for (String emp : empList3)
		{
			System.out.println(emp);
		}
		
		
        System.out.println();
		
		Criteria c4 = s.createCriteria(EmployeeHql.class);  
		c4.setFirstResult(1);
		c4.setMaxResults(2);
		List<EmployeeHql> empList4 = c4.list();
		for (EmployeeHql emp : empList4)
		{
			System.out.println(emp);
		}
		
		
             t.commit();
             session.close();
			System.out.println("Successfully Done");
		}

	}



