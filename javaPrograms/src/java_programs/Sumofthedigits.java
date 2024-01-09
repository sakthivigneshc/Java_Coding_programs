package java_programs;

import java.util.Scanner;

public class Sumofthedigits {

	public static void main(String[] args) {

		/*
		  Example input and output
		 
		  Enter a number: 234
		  The sum of 234 is : 9
		 */

		Scanner scanner = new Scanner(System.in);
		int a, remainder, temporary, sum = 0;

		System.out.print("Enter a number: ");
		a = scanner.nextInt();
		temporary = a;

		while (temporary > 0) {

			remainder = temporary % 10;
			sum = sum + remainder;
			temporary = temporary / 10;

		}

		System.out.println("The sum of " + a + " is : " + sum);
		scanner.close();
	}

}
