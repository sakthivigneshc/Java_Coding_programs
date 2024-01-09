package java_programs;

import java.util.Scanner;

public class Prime_number_or_not {
	public static void main(String[] args) {
		/*
		 Enter a number : 23
		 23 is a prime number.
		 */
		Scanner scanner = new Scanner(System.in);
		int n;
		boolean check=true;
		System.out.print("Enter a number : ");
		n = scanner.nextInt();
		if(n<=1) {
			check=false;			
		}
		for(int i=2;i<n;i++) {  

			if(n%i==0) {
				check=false;			
				break;
			}

		}

		if(check) {
			System.out.println(n +" is a prime number.");
		}

		else {
			System.out.println(n +" is not a prime number.");

		}

		scanner.close();

	}

}
