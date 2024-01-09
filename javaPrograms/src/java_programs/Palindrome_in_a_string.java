package java_programs;

import java.util.Scanner;

public class Palindrome_in_a_string {
	public static void main(String[] args) {

		/*
		  Enter a string to reverse : radar 
		  It is a palindrome
		  
		 */

		String str, words = "", temp;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string to reverse : ");
		str = scanner.nextLine().toLowerCase();
		temp = str;

		for (int i = temp.length() - 1; i >= 0; i--) {
			words = words + temp.charAt(i);
		}
		if (str.equals(words)) {
			System.out.println(str + " word is a palindrome");
		} else {
			System.out.println(str + " word is not a palindrome");
		}

		scanner.close();
	}
}
