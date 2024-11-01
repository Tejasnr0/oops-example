/*
 * MAIN PROGRAM FOR BANKING APPLICATION
 * can be used in many imp program
 * needs some minior changes than everthing is set 
 */



package encapsulation;

public class account_driver {
	public static void main(String[] args) {
		account ob=new account();
		System.out.println(ob.check_balance());
		ob.deposti(350000);
		System.out.println(ob.check_balance());
		ob.withdarw(50000);
		System.out.println(ob.check_balance());
	}
		
}
 