package encapsulation;

public class student_driver {
	public static void main(String[] args) {
		student s = new student("tejas",111, "CSE");
		System.out.println(s.sname());
		System.out.println(s.regno());
		System.out.println(s.branch());
		s.rename("Tejas R");
		System.out.println("--------------------");
		System.out.println(s.sname());
		System.out.println(s.regno());
		System.out.println(s.branch());
	}

}
