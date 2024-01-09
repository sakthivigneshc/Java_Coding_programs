package java_programs;

import java.util.Scanner;

public class FactorialUsingRecursion {
	
	/*
	 Example input and output
		Enter a number: 3
		The factorial value of 3 is 6

	 */

	public static int recuFunction(int number) {

		if (number == 0) {
			return 1;
		}

		else {
			return number * recuFunction(number - 1);
		}

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		int result = recuFunction(number);
		System.out.println("The factorial value of "+ number +" is "+result);
		scanner.close();

	}

}
