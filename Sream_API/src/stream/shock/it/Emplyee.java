package stream.shock.it;

public class Emplyee {
	public int eid;
	public String sname;
	public Number sal;
	public Emplyee(int eid, String sname, Number sal) {
		super();
		this.eid = eid;
		this.sname = sname;
		this.sal = sal;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Number getSal() {
		return sal;
	}
	public void setSal(Number sal) {
		this.sal = sal;
	}
	
}
