package HibernateMapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class VechicleOneToone {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int vid;
	String vname; 
	@OneToOne
	OneTooneUser u;
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	public OneTooneUser getU() {
		return u;
	}
	public void setU(OneTooneUser u) {
		this.u = u;
	}
	
}
