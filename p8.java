package encapsulation;

public class p8 {
	public static void main(String[] args) {
		System.out.println("main beign");
		try {
			int a = 10 / 0;
		} catch (Exception e) {
			System.out.println("from catch block");
		} finally {
			System.out.println("from finally");
		}
	}
}
