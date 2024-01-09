package java_programs;

import java.util.Scanner;

public class Swap_two_numbers {
	
	
	/*
	 Example input and output
	 
	 
	 ------   using temporary variable ------ 
Enter first number: 
2
Enter second number: 
3
Before Swapping :
 I value is :2	  J value is :3
After swapping :
 I value is :3	  B value is :2
 
 
------ with out using temporary variable ------ 
Enter first number: 
4
Enter second number: 
5
Before Swapping :
 A value is :4	  B value is :5
After swapping :
 A value is :5	  B value is :4
	 */
	
	private static void withouttemporaryVariable(int a, int b) {
		System.out.println("Before Swapping :" + "\n" + " A value is :" + a + "\t " + " B value is :" + b);

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After swapping :" + "\n" + " A value is :" + a + "\t " + " B value is :" + b);

	}

	private static void withtemporaryVariable(int i, int j) {
		System.out.println("Before Swapping :" + "\n" + " I value is :" + i + "\t " + " J value is :" + j);

		int temp = i;
		i = j;
		j = temp;

		System.out.println("After swapping :" + "\n" + " I value is :" + i + "\t " + " B value is :" + j);

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("------   using temporary variable ------ ");

		System.out.println("Enter first number: ");
		int a = scanner.nextInt();
		System.out.println("Enter second number: ");
		int b = scanner.nextInt();

		// using temporary variable
		withtemporaryVariable(a, b);

		System.out.println("------ with out using temporary variable ------ ");

		System.out.println("Enter first number: ");
		int i = scanner.nextInt();
		System.out.println("Enter second number: ");
		int j = scanner.nextInt();

		// with out using temporary variable
		withouttemporaryVariable(i, j);
		scanner.close();
	}

}
