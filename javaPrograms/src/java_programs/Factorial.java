package java_programs;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		/*
		 Example input and output
	 		Enter a number: 3
	 		The factorial value of 3 is 6

		 */
		
		Scanner scanner = new Scanner(System.in);
		int number;
		int factorial=1;
		System.out.print("Enter a number: ");
		number = scanner.nextInt();
		
		for(int i=1 ; i<=number ; i++) {
			factorial = factorial*i;// 1*1 = 1  1*2=2  2*3 =6
		}
		System.out.println("The factorial value of "+ number +" is "+ factorial);

		
		scanner.close();
	}

}
