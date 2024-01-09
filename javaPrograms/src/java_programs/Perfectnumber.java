package java_programs;

import java.util.Scanner;

public class Perfectnumber {

	/*
	 Enter a number : 496
	 496 is a perfect number.
	 */
	
	   public static void main(String[] args)
	   {
		   int number,sum=0,num;
		   Scanner scanner = new Scanner(System.in);
		   System.out.print("Enter a number : ");
		   number = scanner.nextInt();
		   num = number;
		   
		   for(int i=1;i<number;i++) {
			   if(number%i==0) {
				   sum=sum+i;
			   }
		   }

		   if(number==sum) {
			   System.out.println(num +" is a perfect number.");
		   }
		   else {
			   System.out.println(num +" is not a perfect number.");

		   }
		   
		   scanner.close();
   }
}

