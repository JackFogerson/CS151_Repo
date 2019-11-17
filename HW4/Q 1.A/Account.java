
public class Account {
	
	public double balance;

	public Account(double amount){
		balance = amount;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void makeDeposit(double dep){
	   System.out.println("Inserting $" + dep);
	   balance += dep;
	   System.out.println("Balance: $" + balance);
	}
	
	public void makeWithdrawl(double with){
		   System.out.println("Removing $" + with);
		   balance -= with;
		   System.out.println("Balance: $" + balance);
		}
	
}
