package java_programs;

import java.util.Scanner;

public class OddOrEven {
	public static void main(String[] args) {
	
		/*
		 Example input and output
		 
		 Enter a number:5
		 5 is an odd number
		 */
		int number;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		number = scanner.nextInt();
		if(number%2==0||number==0) {
			System.out.println( number + " is an even number");
			}
		else if (number<0) {
			
			System.out.println("Give number above zero.");
		}
		else {
			System.out.println(number + " is an odd number.");
		}
		scanner.close();

	}


}
