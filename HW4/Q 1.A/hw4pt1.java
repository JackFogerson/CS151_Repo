import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class hw4pt1 {

	public static Runnable deposit(Account bankAccount, double depAmount,int repetitions) {
		   return () ->
		      {
		         for (int i = 0; i < repetitions; i++)
		            bankAccount.makeDeposit(depAmount);
		      };
	}
	
	public static Runnable withdrawl(Account bankAccount, double withAmount,int repetitions) {
		   return () ->
		      {
		         for (int i = 0; i < repetitions; i++)
		            bankAccount.makeWithdrawl(withAmount);
		      };
	}
	
	public static void main(String[] args) {
		Account bankAccount = new Account(50);
		int repetitions = 500;
		
		ExecutorService service = Executors.newCachedThreadPool();
		Runnable r1 = deposit(bankAccount,25,repetitions);
		Runnable r2 = withdrawl(bankAccount,25,repetitions);
		service.execute(r1);
		service.execute(r2);
		service.shutdown();
	}
	
}

// The program can become corrupted when one thread gets interupted by the other thread before it can finish.
// Example:
// Inserting $25.0 Balance: $75.0
// Removing $25.0 Balance: $50.0
// Removing $25.0 Balance: $75.0
// Inserting $25.0 Balance: $100.0
