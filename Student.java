package Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Student {
	@Id
	@Column(name="stroll")
	int roll;
	@Column(name="staddress")
	String address;
	@Column(name="stmarks")
	double marks;
	
	StudentName name;

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public StudentName getName() {
		return name;
	}

	public void setName(StudentName name) {
		this.name = name;
	}
	

}
