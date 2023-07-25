package ONEtoMANY;

import javax.persistence.Entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


@Entity
public class TestMain {
	
	
	public static void main(String[] args) {
		
		User u = new User();
		u.setName("Akanksha");
		u.setUaddress("Yevat");
		
		
		
		Vechicle v = new Vechicle();
		v.setVname("Audi");
		v.setVtype("FourWheeler");
		
		Vechicle v1 = new Vechicle();
		v1.setVname("Mahindra");
		v1.setVtype("Tractor");
		
		u.getVd().add(v1);
		u.getVd().add(v);
		v.setU(u);
		v1.setU(u);
		
		Configuration cfg = new Configuration();
		cfg.configure().addAnnotatedClass(User.class).addAnnotatedClass(Vechicle.class);
		SessionFactory session=cfg.buildSessionFactory();
		Session s = session.openSession();
		Transaction t =s.beginTransaction();
		s.save(v1);
		s.save(v);
		s.save(u);
		t.commit();
		s.close();
		session.close();
		System.out.println("Done");
		
	}

}
