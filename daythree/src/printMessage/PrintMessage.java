package printMessage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrintMessage {
	
	synchronized public static void display(String message) {
			System.out.print(message);
	}


	public static void main(String[] args) {
		
		ExecutorService es = Executors.newFixedThreadPool(5);
		
		es.execute(()-> {
			
			display("[");
		});
		es.execute(()-> {
			
			display("-----");
		});
		es.execute(()-> {
			
			display("Message");
		});
		es.execute(()-> {
			
			display("-----");
		});
		es.execute(()-> {
			
			display("]");
		});

	}

}
