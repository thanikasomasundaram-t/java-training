package averageCustomException;

import java.util.Scanner;

public class AverageCustomException {

	public static void main(String[] args) {
		Average obj = new Average();
		obj.calculateAverage();
	}

}


class Average {
	
	public void calculateAverage() {
		try {
			int[] marks = new int[10];
			
			Scanner sc = new Scanner(System.in);
			int sum = 0;
			
			for(int index= 0; index < 10; index++) {
				try {
					System.out.println("Enter mark of student " + (index+1));
					int value = sc.nextInt();
					if(value > 100 || value < 0) {
						throw new ValueOutOfRangeException();
					}
					
					marks[index] = value;	
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