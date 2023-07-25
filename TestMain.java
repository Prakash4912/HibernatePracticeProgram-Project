package ManytoMany;

import javax.persistence.Entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


@Entity
public class TestMain {
	public static void main(String[] args) {
		StudentInfo st = new StudentInfo();
		st.setSname("Akanksha");
		StudentInfo st1 = new StudentInfo();
		st1.setSname("Prakash");
		
		Course c = new Course();
		c.setCname("Full Stack Java Developer");
		
		Course c1 = new Course();
		c1.setCname("Python Developer");
		
		st.getAl().add(c);
		st.getAl().add(c1);
		
		st1.getAl().add(c);
		st1.getAl().add(c1);
		
		
		c.getLl().add(st);
		c.getLl().add(st1);
		
		c1.getLl().add(st);
		c1.getLl().add(st1);
		
		
		
		
		Configuration cfg = new Configuration();
		cfg.configure().addAnnotatedClass(StudentInfo.class).addAnnotatedClass(Course.class);
		SessionFactory session=cfg.buildSessionFactory();
		Session s = session.openSession();
		Transaction t =s.beginTransaction();
		s.save(c);
		s.save(c1);
		
		s.save(st1);
		s.save(st);
		t.commit();
		s.close();
		session.close();
		System.out.println("Done");
	}

}
