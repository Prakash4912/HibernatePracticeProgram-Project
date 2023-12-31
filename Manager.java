package HQL;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Manager {
	@Id
	int id;
	String name;
	String address;
	int salary;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Manager [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
	
	

}
