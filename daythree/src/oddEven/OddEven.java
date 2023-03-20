package oddEven;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class OddEven {
	
	
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(2);

		es.execute(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 2; i <= 100; i+=2) {
					System.out.println("even" + i);
				}
			}
		});
		
		es.execute(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 1; i < 100; i+=2) {
					System.out.println("odd" + i);
				}
			}

		});
	}	

}
// I made two threads using Executor service and used runnable as a anonymous method to override run method.
// I used this way just to show that threads can be run this way too.