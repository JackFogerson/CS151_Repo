import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class hw4pt2 {

	public synchronized static Runnable changeBalance(Account bankAccount, double changeAmount, BoundedQueue<Double> q, int repetitions) {
		   return () ->
		      {
		         for (int i = 0; i < repetitions; i++) {
		            q.add(bankAccount.changeBalance(changeAmount));
		         }
		      };
	}
	
	public synchronized static Runnable action(BoundedQueue<Double> q, int repetitions) {
		   return () ->
		      {
		         for (int i = 0; i < repetitions; i++) {
		            q.remove();
		         }
		      };
	}
	
	public static void main(String[] args) {
		Account bankAccount = new Account(50);
		int repetitions = 10;
		
	    BoundedQueue<Double> q = new BoundedQueue<>(2 * repetitions);
		ExecutorService service = Executors.newCachedThreadPool();
		Runnable r1 = changeBalance(bankAccount,25,q,repetitions);
		Runnable r2 = changeBalance(bankAccount,-25,q,repetitions);
		Runnable r3 = action(q,2*repetitions);
		System.out.println(bankAccount.getBalance());
		service.execute(r1);
		service.execute(r2);
		service.execute(r3);
		service.shutdown();
	}
	
}
