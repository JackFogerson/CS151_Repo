
public class Account {
	
	public double balance;

	public Account(double amount){
		balance = amount;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double changeBalance(double dep){
	   balance = balance + dep;
	   System.out.println("Change: " + dep + " Balance: $" + balance);
	   return balance;
	}
	
}
