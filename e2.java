package encapsulation;

public class e2 {
	public static void main(String[] args) {
		e1 ob=new e1();
		System.out.println(ob.read());
		ob.write(100);
		System.out.println(ob.read());
	}

}
