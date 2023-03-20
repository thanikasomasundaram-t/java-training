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
