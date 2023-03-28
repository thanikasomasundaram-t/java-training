package inventory;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class IventorySystem {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName());
		
		Inventory in = new Inventory();
		
		ExecutorService es = Executors.newFixedThreadPool(2);
		
		es.execute(()-> {
			for(int iterate = 0; iterate < 5; iterate++) {
				System.out.println("\n...p...\n");
				in.produceProduct();
			}
		});
		
		es.execute(()-> {
			for(int iterate = 0; iterate < 5; iterate++) {
				System.out.println("\n....c....\n");
				in.consumeProduct();
			}
		});
		
		
	}

}

class Inventory {
	
	static boolean flag;
	
	Inventory() {
		System.out.println("constructor called");
	}
	
	synchronized public void produceProduct() {
		if(flag) {
			try {
				System.out.println("Producer: I am waiting for consumer to consume product...");
//				Thread.sleep(5000);
				wait();
				System.out.println("Producer: Got clearance from consumer");
				
			}
			catch(Exception e) {}
		}

		System.out.println("product added by " + Thread.currentThread().getName() + " Producer");
		flag = true;
		notify();
	}
	
	synchronized public void consumeProduct() {
		if(!flag) {
			try {
				System.out.println("Consumer: I am waiting for producer to add product...");
//				Thread.sleep(5000);
				wait();
				System.out.println("Consumer: Got clearance from producer");
				
			}
			catch(Exception e) {}
		}

		System.out.println("product consumed by " + Thread.currentThread().getName() + " consumer");
		flag = false;
		notify();
	}
}
