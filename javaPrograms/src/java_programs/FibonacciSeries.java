package java_programs;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {

		/*
		  Example input and output 
		  
		  Enter a number: 3 
		  Below is the Fibonnaci Series for number 5
		  0 1 1 2 3 
		 */

		int a, b, c, number;
		a = 0;
		b = 1;
		c = 0;

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		number = scan.nextInt();
		System.out.println("Below is the Fibonnaci Series for number "+number);
		System.out.print(a + " " + b + " ");

		for (int i = 2; i < number; i++) {
			c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;

		}

		scan.close();

	}
}
