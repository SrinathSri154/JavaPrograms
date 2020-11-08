package stringProgrammes;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
      
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = scr.nextInt();
		int fact = 1;
			
		for(int i=num; i>=1; i--)
		{
			
		fact = fact*i;	
			
		}
		
		System.out.println("Factorial of given number " + num + " is :" + fact);
	}

}
