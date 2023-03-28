package canthreadruntwotimes;


public class ThreadRepeat{

	
	public static void main(String[] args) {
		Thread one = new Thread(() -> {
			System.out.println("thread called");
		});
		one.start();
		
		try {
		one.start();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}
	
}

//A thread which is instantiated and ran once cannot be called for a second time because it handled
//what it is given to handle. If we give another process to handle it throws IllegalThreadStateException.

