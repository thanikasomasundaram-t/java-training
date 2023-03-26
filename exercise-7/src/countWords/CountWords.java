package countWords;

import java.util.Scanner;

public class CountWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		String[] array = input.split(" ");
		System.out.println("Word count " + array.length);
		
		sc.close();
	}
}
