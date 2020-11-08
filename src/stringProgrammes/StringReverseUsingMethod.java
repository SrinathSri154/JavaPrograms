package stringProgrammes;

import java.util.Scanner;

public class StringReverseUsingMethod {

	public static void main(String[] args) {
         
		
		// methd 1
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter string to be reversed: ");
//		String str = sc.next();
//		
//		
//		StringBuffer sb = new StringBuffer(str);
//		sb.reverse();
//		System.out.println(sb + ": is reverse string" );
//	}
		
		//method 2
		
		System.out.println(stringbuffer("abcdefghijklmnopqrstuvwxyz"));
	
		
	}
	
	public static String stringbuffer(String str)
	{
		
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		return sb.toString();
		
	}
}
