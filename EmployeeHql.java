package Hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
//THIS IS THE PROGRAM OF THE HQL MEANS THE IT IS THE QUERY LANGUAGE OF THE HIBERNATE WE USE THE HQL
@Entity
public class EmployeeHql {
	@Id
	int id;
	String name,address;
	double salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeeHql [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
	
}