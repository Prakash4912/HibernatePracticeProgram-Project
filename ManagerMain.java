package HQL;

import javax.persistence.Entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

@Entity
public class ManagerMain {

	public static void main(String[] args) {
		
		Manager m1 = new Manager();
		m1.setId(1);
		m1.setName("Prakash");
		m1.setAddress("Pune");
		m1.setSalary(70000);
		
		Manager m2 = new Manager();
		m2.setId(2);
		m2.setName("Akash");
		m2.setAddress("satara");
		m2.setSalary(90000);
		
		Manager m3 = new Manager();
		m3.setId(3);
		m3.setName("Dilip");
		m3.setAddress("Latur");
		m3.setSalary(50000);
		
		Configuration cfg=new Configuration();
		cfg.configure().addAnnotatedClass(Manager.class);
		SessionFactory session=cfg.buildSessionFactory();
		Session s=session.openSession();
		Transaction t=s.beginTransaction();
		s.save(m1);
		s.save(m2);
		s.save(m3);
		s.update(m1);
		//s.delete(s2);
	     t.commit();
		s.close();
		session.close();
		System.out.println("Done..");
	}
}

