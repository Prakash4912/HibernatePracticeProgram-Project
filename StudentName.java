package Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class StudentName {
	@Column (name="stfirstname")
	String fn;
	@Column (name="stmiddlename")
	String mn;
	@Column (name="stlastname")
	String ln;
	public String getFn() {
		return fn;
	}
	public void setFn(String fn) {
		this.fn = fn;
	}
	public String getMn() {
		return mn;
	}
	public void setMn(String mn) {
		this.mn = mn;
	}
	public String getLn() {
		return ln;
	}
	public void setLn(String ln) {
		this.ln = ln;
	}
	

}
