package counter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Counter {

	public static void main(String[] args) {

		ExecutorService es = Executors.newFixedThreadPool(1);
		
		es.execute(()-> {
			for(int times = 1; times <=100; times++) {
				try {
					Thread.sleep(50);
					System.out.println(times);
					
					if(times%10 == 0)
							System.out.println("in thread" + Thread.currentThread().getName());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		});
		
	}

}
