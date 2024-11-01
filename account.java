package encapsulation;

public class account {
	private double balance=450000;
	
	public double check_balance() {
		return this.balance;
	}

	public void deposti(int amt) {
		this.balance+=amt;
	}
	
	public void withdarw(int amt) {
		this.balance-=amt;
	}
}
