package stdin;

import java.io.IOException;
import java.util.Scanner;

public class StdIn {
	public static void main(String[] args) throws IOException {
		Scanner sc= new Scanner(System.in);
	
		while (sc.hasNextLine()) {
		    System.out.println("You wrote: " + sc.nextLine());
		}
		System.out.println("Ended");
		sc.close();
	}
}
