package java_programs;

import java.util.Scanner;

public class Reverse_a_number {
public static void main(String[] args) {
	
	/*
	 
	 Enter a number: 546
	 The reverse of 546 is : 645
	 
	 */
	Scanner scanner = new Scanner(System.in);
	int number,remainder,reversenumber=0,temporary;
	System.out.print("Enter a number: ");
	number = scanner.nextInt();
	temporary =  number;
	while(temporary>0) {
		remainder= temporary%10;
		reversenumber=reversenumber*10+remainder;
		temporary=temporary/10;
	}
	System.out.println("The reverse of "+number +" is : " + reversenumber);
	scanner.close();
}
}
