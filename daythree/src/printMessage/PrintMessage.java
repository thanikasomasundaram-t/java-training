package printMessage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrintMessage {
	
	public static void display(String message) {
		for(int i = 0; i< 3; i++)
			System.out.println("[ ------" + message + "------ ]");
	}


	public static void main(String[] args) {
		
		ExecutorService es = Executors.newFixedThreadPool(3);
		System.out.println(Thread.currentThread().getName());
		
		es.execute(()-> {
			
			display("thread one");
		});
		es.execute(()-> {
			
			display("thread two");
		});
		es.execute(()-> {
			
			display("thread three");
		});

	}

}
