package average;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		CalculateAverage obj = new CalculateAverage();
		
		obj.calculateAverage();
	}

}

class CalculateAverage {
	
	public void calculateAverage() {
			
		try {
			int[] marks = new int[10];
			
			Scanner sc = new Scanner(System.in);
			int sum = 0;
			
			for(int index= 0; index < 10; index++) {
				try {
					System.out.println("Enter mark of student " + (index+1));
					marks[index] = sc.nextInt();	
					sum += marks[index];
				}
				catch(Exception e) {
					System.out.println("Exception  occured is: " + e);
					sc.next();
					index--;
				}
			}	
			
			int result = sum/marks.length;
			System.out.println(result);
			sc.close();
		}
		catch(Exception e) {
			System.out.println("Exception occured outside logic: " + e);
		}
	}	
}
