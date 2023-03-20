package reapeater;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Reapeater {

	public static void main(String[] args) {
		DivisionOperation obj = new DivisionOperation();
		obj.breakLoopOnCondition();

	}

}


class DivisionOperation {
	
	public void continueLooping() {
		while(true) {
			System.out.println("Enter numerator and divisor: ");
			Scanner s = new Scanner(System.in);
			
			int numerator = s.nextInt();
			int divisor = s.nextInt();
			
			try {
				int result = numerator/divisor;
				System.out.println("Result: " + result);
			}
			
			catch(Exception e) {
				System.out.println("Exception occured is: " + e);
			}
			s.close();
		}

	}
	
	public void breakLoopOnCondition() {
		while(true) {
			System.out.println("Enter numerator and divisor: ");
			Scanner s = new Scanner(System.in);
			
			try {
				int numerator = s.nextInt();
				int divisor = s.nextInt();
				int result = numerator/divisor;
				System.out.println("Result: " + result);
			}
			catch(InputMismatchException e) {
				char check = s.next().charAt(0);
				
				if(check == 'q' || check == 'Q') {
					System.out.println("exits...");
					break;
					
				}
			}
			
			catch(Exception e) {
				System.out.println("Exception occured is: " + e);
			}
			s.close();
		}

	}
}