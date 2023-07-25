package HQL;

import javax.persistence.Entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

@Entity
public class Student1main {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.setId(1);
		s1.setFirstname("Prakash");
		s1.setMiddlename("Saudagar");
		s1.setLastname("Pawar");
		s1.setAddress("Yevat");
		s1.setMarks(80);
		
		Student s2 = new Student();
		s2.setId(2);
		s2.setFirstname("Akanksha");
		s2.setMiddlename("Navnath");
		s2.setLastname("Pingale");
		s2.setAddress("Pimpari");
		s2.setMarks(70);
		
		Student s3 = new Student();
		s3.setId(3);
		s3.setFirstname("Nayan");
		s3.setMiddlename("Ashok");
		s3.setLastname("Phadke");
		s3.setAddress("satara");
		s3.setMarks(90);
		
		Student s4 = new Student();
		s4.setId(4);
		s4.setFirstname("Akshay");
		s4.setMiddlename("dyandeo");
		s4.setLastname("devekar");
		s4.setAddress("solapur");
		s4.setMarks(50);
		
		Configuration cfg=new Configuration();
		cfg.configure().addAnnotatedClass(Student.class);
		SessionFactory session=cfg.buildSessionFactory();
		Session s=session.openSession();
		Transaction t=s.beginTransaction();
		s.save(s1);
		s.save(s2);
		s.save(s3);
		s.save(s4);
		
		s.update(s1);
	    //s.delete(s2);
	     t.commit();
		s.close();
		session.close();
		System.out.println("Done..");
	}
}
