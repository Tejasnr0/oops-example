package encapsulation;

import java.util.Scanner;

public class p7 {
	public static int pin = 2002;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the pin");
		int num1 = sc.nextInt();
		if (num1 == pin) {
			System.out.println("valid pin");
		} else {
			System.out.println("invalid pin");
			throw new ArithmeticException();
		}
	}
}
