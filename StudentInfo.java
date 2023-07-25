package ManytoMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class StudentInfo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int sid;
	String sname;
	@ManyToMany
	List<Course> al=new ArrayList<Course>();
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public List<Course> getAl() {
		return al;
	}
	public void setAl(List<Course> al) {
		this.al = al;
	}
	
	

}
