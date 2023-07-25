package InheritanceMappingIsarelationship;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
//Table Per Heirachy demo (tph class)
import javax.persistence.Table;

@Entity
@Table(name ="employeetph" )
@Inheritance (strategy = InheritanceType.SINGLE_TABLE)
//@Inheritance (strategy = InheritanceType.TABLE_PER_CLASS)  //tpc  table per constraint class           sirf ye strategy change karna or table name jo class name ok
//@Inheritance (strategy = InheritanceType.JOINED) //tps table per subclass
public class Employee {
	@Id
	int id;
	String name;
	String address;
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
	
}
