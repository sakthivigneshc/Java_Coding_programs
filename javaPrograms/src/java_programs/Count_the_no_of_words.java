package java_programs;

import java.util.Scanner;

public class Count_the_no_of_words {
public static void main(String[] args) {
	
	
	/*
	 Example input and output
	 
	 Enter a string: This program will calculate the number of words.
	 The number of words in the given string are: 8 
	  
	
	 */
	
	
	String str;
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter a string: ");
	str=scanner.nextLine();
	String[] result =	str.split(" ");
	System.out.println("The number of words in the given string are: "+result.length);
	scanner.close();

}
}
