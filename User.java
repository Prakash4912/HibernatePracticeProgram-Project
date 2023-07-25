package ONEtoMANY;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	int uid;
	String name;
	String uaddress;
	@OneToMany(mappedBy = "u")
	Collection<Vechicle> vd = new ArrayList<Vechicle>();
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
	public String getUaddress() {
		return uaddress;
	}
	public void setUaddress(String uaddress) {
		this.uaddress = uaddress;
	}
	public Collection<Vechicle> getVd() {
		return vd;
	}
	public void setVd(Collection<Vechicle> vd) {
		this.vd = vd;
	}
	
	
}

