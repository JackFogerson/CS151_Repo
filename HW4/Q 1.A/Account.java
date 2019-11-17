
public class Account {
	
	public double balance;

	public Account(double amount){
		balance = amount;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void makeDeposit(double dep){
	   balance = balance + dep;
	   System.out.println("Inserting $" + dep + " Balance: $" + balance);
	}
	
	public void makeWithdrawl(double with){
		   balance = balance - with;
		   System.out.println("Removing $" + with + " Balance: $" + balance);
		}
	
}
