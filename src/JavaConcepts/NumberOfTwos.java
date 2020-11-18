package JavaConcepts;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class NumberOfTwos {
	
//	
//	public static void pattern(int num)
//	{
//		
//		int fact = 1;
//		for(int i=num;i>=1;i--)
//		{
//		fact=fact*i;	
//		
//		}
//		System.out.println(fact);
//		}
//		
		
	
		
//		for(int i=1;i<=num ;i++)
//		{
//			
//			
//			for(int j=1; j<=i;j++)
//			{
//				
//				System.out.print("*");
//				
//			}
//			System.out.println();
//		}
//			for(int i=1;i<=num ;i++)
//			{
//
//			for(int j=num-1; j>=i;j--)
//			{
//				
//				System.out.print("*");
//				
//			}
//			
//			System.out.println();
//		}
		
		
		
//		for(int i=1; i<=num; i++) //1
//		{
//			
//			for(int j=num-1;j>=i;j--)
//			{
//				
//				System.out.print(" ");	
//			}
//			
//		
//		for(int k=1; k<=i; k++) //1
//		{
//			System.out.print("*");
//			
//			}
//			
//		System.out.println();}
//	
//	
//	
//	
//	for(int i=1; i<=num; i++) //1
//	{
//		
//			for(int k=1; k<=i; k++) //1
//	{
//		System.out.print(" ");
//		
//		}
//			
//			for(int j=num-1;j>=i;j--)
//			{
//				
//				System.out.print("*");	
//			}
//		
//	System.out.println();}
//		
//	for(int i=1;i<=num;i++)
//	{
//		
//		for(int j=1;j<=num;j++)
//		{
//			
//			if(i>=2 && j>=2 && i<=3 && j<=3) {
//			System.out.print(" ");}
//			
//			else {
//				
//				
//				System.out.print("*");
//			}
//		}
//		
//		System.out.println("");
//	}
//	
//	
//	}
	
	
//  for(int i=1;i<=num;i++)
//  {
//	  
//	  for(int j=1;j<=num;j++)
//	  {
//		  if(i>=2 && j>=2 && i<=4 && j<=4) {
//		  
//		System.out.print(" ");}
//		  else {
//		  
//		  System.out.print("*");}
//		  
//	  }
//	  
//	  System.out.println();
//	  
//  }}
		
		
		
		
//		for(int i=1;i<=num;i++)
//		{
//			
//			for(int j=num-1;j>=i;j--)
//			{
//				
//				System.out.print(" ");
//			}
//
//			for(int k=1;k<=i;k++)
//			{
//				
//				System.out.print("*");
//				
//			}
//			
//			System.out.println();
//		
//		}
//		for(int i=1;i<=num;i++)
//		{
//			
//			for(int j=1;j<=i;j++)
//			{
//				
//				System.out.print(" ");
//			}
//
//			for(int k=num-1;k>=i;k--)
//			{
//				
//				System.out.print("*");
//				
//			}
//			
//			System.out.println();
//		
//		}
		
//		for(int i=1;i<=num ;i++)
//		{
//			
//			for(int j=num-2;j>=i;j++)
//			{
//				
//			System.out.print(" ");	}
//			
//			
//			
//			
//		}
//		
//		
//		
//		}


	//factorial of number
	public static void main(String[] args) {
		
		
		//Seperating alphanumeric
		
		String str = "srinath156435sri#@$%^&*()+_!~";
		
		String numeric="";
		String alpha="";
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			
//			if(Character.isAlphabetic(ch))
//			{
//				alpha = alpha+ch;		
//			}
//			else {
//				
//				
//				numeric = numeric+ch;
//			}
			
			if(Character.isDigit(ch))
			{	
				
				numeric = numeric+ch;
				
				
			}
			
			else {
				
				
				alpha = alpha+ch;
				
			}
			
			
		}
		
		
		System.out.println("The alphabes in the given string is :" + alpha);
		System.out.println("The numbers in the given string is :" + numeric);		
	}}
		

		// print number of 2's from given array
//		int[] arr = {1,2,222,32,4,22222,5};
//
//int twooccurence=0;
//for(int i=0; i<arr.length;i++)
//{
//	
//String str = String.valueOf(arr[i]);
//char[] ch = str.toCharArray();
//
//for(char Char :ch)
//	
//if(Char=='2')
//{
//	twooccurence = twooccurence+ 1;
//	
//
//}
//
//}
//System.out.println(twooccurence);}
//}




		
//		public static void main(String[] args) {
//		// print charcters from given string
//		String string = "W1ORD";
//		
//		String characterscount = "";
//		String numericount = "";
//		
//		
//		for(int i=0;i<string.length();i++)
//		{
//	
//			char ch = string.charAt(i);
//		if(!Character.isDigit(ch))
//		{
//			
//			characterscount = characterscount+ch;
//	
//			
//			
//		}
//		else {
//			
//			numericount = numericount+ch;
//			
//		}
//		
//		
//		}
//		System.out.println(characterscount);
//		System.out.println(numericount);
//		}}
//		
//		
//		
//		
//	}
//	}}
	
	
	
//	public static void main(String[] args) {
//		
//		int number1 = 3;
//		int number2 = 5;
//		
//		for(int i=1;i<=20;i++)
//		{
//			int number3 = number1*i;
//			System.out.println("Multiples of 3 : " + number3 + " " + "--->" + "Fizz" );
//			
//		}
//	
//	}
	//}
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		