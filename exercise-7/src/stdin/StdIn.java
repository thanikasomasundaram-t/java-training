package stdin;

import java.io.IOException;
import java.util.Scanner;

public class StdIn {
	public static void main(String[] args) throws IOException {
		Scanner scanner= new Scanner(System.in);
	
		while (scanner.hasNextLine()) {
		    System.out.println("You wrote: " + scanner.nextLine());
		}
		System.out.println("Ended");
		scanner.close();
	}
}
