package encapsulation;

public class p9 {

	public static void main(String[] args) {
		System.out.println("main begin");
		try {
			int a = 10 / 0;
		} finally {
			System.out.println("form finally block ");
		}
	}
}