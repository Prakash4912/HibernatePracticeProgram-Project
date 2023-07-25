package Hibernate;

import java.util.Scanner;

import javax.persistence.Entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
@Entity
public class TestMain {
	public static void main(String[] args) {
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Employee Detail");
		int id=sc.nextInt();
		String name=sc.next();
		String address=sc.next();
		double salary = sc.nextDouble();
		Employee e1 = new Employee();
		e1.setId(id);
		e1.setName(name);
		e1.setAddress(address);
		e1.setSalary(salary);*/
		
		 
		EmployeeHql e1 = new EmployeeHql();
		e1.setId(101);
		e1.setName("Prakash");
		e1.setAddress("Yevat");
		e1.setSalary(1000000);
		
		
		EmployeeHql e2 = new EmployeeHql();
		e2.setId(102);
		e2.setName("akanksha");
		e2.setAddress("Khamgaon");
		e2.setSalary(2000000);
		
		
		EmployeeHql e3 = new EmployeeHql();
		e3.setId(103);
		e3.setName("Nayan");
		e3.setAddress("Barshi");
		e3.setSalary(400000);
		
		
		EmployeeHql e4 = new EmployeeHql();
		e4.setId(104);
		e4.setName("akshay");
		e4.setAddress("Satara");
		e4.setSalary(900000);
		
		
		Configuration cfg = new Configuration();
		cfg.configure().addAnnotatedClass(EmployeeHql.class);
		SessionFactory session=cfg.buildSessionFactory();
		Session s = session.openSession();
		Transaction t =s.beginTransaction();
		s.save(e1);
		s.save(e2);
		s.save(e3);
		s.save(e4);
		// s.update(e1);
		//s.update(e2);
		//s.delete(e1);
		t.commit();
		s.close();
		session.close();
		System.out.println("Done");
		
		/**Employee e = (Employee) s.get(Employee.class, 102);
		System.out.println(e);
		
		Employee ee = (Employee) s.get(Employee.class, 102);
		System.out.println(ee);
		t.commit();
		s.close();
		session.close();**/
		}

}
