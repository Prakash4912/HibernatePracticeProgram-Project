package HibernateMapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class OneTooneUser {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int uid;
	String name;
	@OneToOne
	VechicleOneToone vd;
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public VechicleOneToone getVd() {
		return vd;
	}
	public void setVd(VechicleOneToone vd) {
		this.vd = vd;
	}
	

}
