package ManytoMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Course {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int cid;
	String cname;
	@ManyToMany
	List<StudentInfo> Ll=new ArrayList<StudentInfo>();
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public List<StudentInfo> getLl() {
		return Ll;
	}
	public void setLl(List<StudentInfo> ll) {
		Ll = ll;
	}
	

}
