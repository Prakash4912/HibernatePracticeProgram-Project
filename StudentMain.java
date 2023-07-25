package Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentMain {
	public static void main(String[] args) {
		
		StudentName sn = new StudentName();
		sn.setFn("Prakash");
		sn.setMn("Saudagar");
		sn.setLn("Pawar");
		
		Student st = new Student();
		st.setAddress("yevat");
		st.setMarks(80.27);
		st.setRoll(1);
		st.setName(sn);
		
		Configuration cfg = new Configuration();
		cfg.configure().addAnnotatedClass(Student.class);
		SessionFactory session=cfg.buildSessionFactory();
		Session s = session.openSession();
		Transaction t =s.beginTransaction();
		s.save(st);
		t.commit();
		s.close();
		session.close();
		System.out.println("Done...");
		
	}

}
