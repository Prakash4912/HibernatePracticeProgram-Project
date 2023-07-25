package ONEtoMANY;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Vechicle {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  int vid;
  String vname;
  String vtype;
  @ManyToOne
   User u;
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


public String getVtype() {
	return vtype;
}


public void setVtype(String vtype) {
	this.vtype = vtype;
}


public User getU() {
	return u;
}


public void setU(User u) {
	this.u = u;
}
  
  
  
}
