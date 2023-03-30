package amstrongOrPalindromeOrPerfect;

import java.util.Scanner;

public class AmstrongNumberOrPalindromeOrPerfect {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter ");
		int input = sc.nextInt();
		if(CheckAmstrongNumber(input) == input) {
			System.out.println("Amstrong number");
		}
		if(CheckPalindrome(input) == input) {
			System.out.println("Palindrome number");
		}
		if(CheckPerfectNumber(input) == input) {
			System.out.println("Perfect number");
		}
		
		sc.close();
	}
	public static int CheckPalindrome(int number) {
		int temp  = number;
		int checkPalindrome = 0;
		
		while(temp > 0) {
			checkPalindrome *= 10;
			checkPalindrome += temp%10;
			temp /= 10;	
		}
		
		return checkPalindrome;
	
	}
	
	public static int CheckPerfectNumber(int number) {
		int result = 0;
		for(int check = 1; check <= number/2; check++) {
			if(number%check == 0) {
				result += check;
			}
		}
		return result;
	}
	
	public static int CheckAmstrongNumber(int number) {
		int length =  Integer.toString(number).length();
		int result = 0;
		
		while(number > 0) {
			result += Math.pow(number%10, length);
			number/= 10;	
		}

		return result;
	}
}
