package InheritanceMappingIsarelationship;

import javax.persistence.Entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



@Entity
public class Main {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setId(1);
		e.setName("Akanksha");
		e.setAddress("Pune");
		
		RegularEmpolyee re = new RegularEmpolyee();
		re.setId(2);
		re.setName("Prakash");
		re.setAddress("yevat");
		re.setBonus(5000);
		re.setSalary(50000000);
		
		
		ContractEmployee ce = new ContractEmployee();
		ce.setId(3);
		ce.setName("Akash");
		ce.setAddress("pimpari");
		ce.setContract_duration(56);
		ce.setPayperhour(600);
		
		Configuration cfg = new Configuration();
		cfg.configure().addAnnotatedClass(Employee.class);
		cfg.addAnnotatedClass(RegularEmpolyee.class);
		cfg.addAnnotatedClass(ContractEmployee.class);
		SessionFactory session=cfg.buildSessionFactory();
		Session s = session.openSession();
		Transaction t =s.beginTransaction();
		
		s.save(e);
		s.save(re);
		s.save(ce);
		t.commit();
		s.close();
		session.close();
		System.out.println("Done");
	}

}
