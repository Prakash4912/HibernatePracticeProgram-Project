package InheritanceMappingIsarelationship;

import javax.persistence.Entity;

@Entity
public class RegularEmpolyee extends Employee{
	
	int bonus;
	int salary;
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

}
