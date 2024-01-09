package java_programs;

import java.util.Scanner;

public class LeapyearOrNot {
	public static void main(String[] args) {

		/*
		 Example input and output
		 
		  Enter a number: 2024 
		  2024 is a leap year.

		 */

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int year = scanner.nextInt();

		if (year % 4 == 0) {

			if (year % 100 == 0) {
				if (year % 400 == 0)
					System.out.println(year + " is a leap year.");
				else
					System.out.println(year + " is not a leap year.");

			}

			else
				System.out.println(year + " is a leap year.");

		}

		else {
			System.out.println(year + " is not a leap year");
		}

		scanner.close();

	}
}
