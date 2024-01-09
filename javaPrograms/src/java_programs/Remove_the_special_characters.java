package java_programs;

import java.util.Scanner;

public class Remove_the_special_characters {
	
	
	/*
	 Enter a string :
	 My name is @#$%&*( Ram
	 After removed the special characters: MynameisRam
	 */
	
	public static void main(String[] args) {
		
		
	String str, result;
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a string :");
	 str =  scanner.nextLine();
	 
	 result	= str.replaceAll("[^a-zA-Z0-9]", "");
	 System.out.println("After removed the special characters: "+result);
	 
	 scanner.close();
	}
}
