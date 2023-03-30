package countWords;

import java.util.Scanner;

public class CountWords {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();

		String[] array = input.split("");
		System.out.println("Word count " + array.length);

		scanner.close();
	}
}
