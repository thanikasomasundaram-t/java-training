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
