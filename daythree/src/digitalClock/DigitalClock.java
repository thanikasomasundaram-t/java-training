package digitalClock;

import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DigitalClock {

	public static void main(String[] args) {
		Clock dg = new Clock();
		
		ExecutorService es = Executors.newFixedThreadPool(3);
		
		
		es.execute(()-> {
			while(true) {
				dg.second();
//				System.out.println(Clock.time);
	
			}
		});
		
		es.execute(()-> {
			while(true) {
				dg.minute();
			}
		});
		
		es.execute(()-> {
			while(true) {
				dg.hour();
			}
		});
	}
	
}


class Clock {
	
	static LocalDateTime time = LocalDateTime.now();
	
//	int hour = time.getHour();
//	int minute = time.getMinute();
//	int second = time.getSecond();
	
	int hour = 23;
	int minute = 59;
	int second = 55;
	
	synchronized public void hour(){
		try {
				wait();
//				System.out.println(hour + "hour...before");
				if(minute == 60) {
//					System.out.println(minute + " " + hour);
					minute = 0;
					if(hour == 23) {
						hour = 0;				
					}
					else {
						hour += 1;	
					}

				}	

			}
			catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	synchronized public void minute(){
		try {
			wait();

			if(second == 60) {
//				System.out.println("min" + minute);
				second = 0;
			}
			minute += 1;
			

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	synchronized public void second() {
		try {
			wait(1000);
			if(second == 59) {
				notifyAll();

			}
			System.out.println(hour + ":" + minute + ":" + second);
			second += 1;

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
