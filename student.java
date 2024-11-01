package encapsulation;

public class student {
	private String sname;
	private int regno;
	private String branch;
	
	//getter method
	public String sname() {
		return this.sname;
	}
	
	// getter method
	public int regno() {
		return this.regno;
	}
	
	//getter method
	public String branch() {
		return this.branch;
	}
	
	//setter method
	public void rename(String name) {
		this.sname=name;
	}
	public student(String sname,int regno,String branch) {
		this.sname=sname;
		this.regno=regno;
		this.branch=branch;
	}
}
