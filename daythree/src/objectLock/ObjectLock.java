package objectLock;


public class ObjectLock{

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("a");
		
		
		
		Thread one = new PrintCharacterThread(sb);
		Thread two = new PrintCharacterThread(sb);
		Thread three = new PrintCharacterThread(sb);
		
		one.start();
		two.start();
		three.start();
		
		
	}

}

class PrintCharacterThread extends Thread {
	StringBuffer sb;
	
	PrintCharacterThread(StringBuffer sb) {
		this.sb = sb;
	}
	
	public void run() {
		synchronized(sb) {
			for(int i = 0; i< 100; i++) {
				System.out.print(sb + " ");
			}
			System.out.println("\n" + this);
			sb.setCharAt(0, (char)(sb.charAt(0) + 1) );
		}
	}
	
}
