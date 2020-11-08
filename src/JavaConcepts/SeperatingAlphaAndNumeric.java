package JavaConcepts;

import java.util.HashSet;
import java.util.Set;

public class SeperatingAlphaAndNumeric {
	
	
	
	public static void input(String input) {
		
		String numericvalue ="";
		String character = "";
		for (int i = 0; i<input.length();i++)
		{
			char ch = input.charAt(i);
			if(Character.isDigit(ch))
			{
			numericvalue =numericvalue+ch;			
			}
			
			else {
				
				character = character + ch;
				
			}
			
		}
		
		
		System.out.println("The Numeric values are :" +numericvalue );
		System.out.println("The Strng is :" +character );
		
		
	}

	public static void main(String[] args) {
		
		input("Srinath01 sri234");
		

	}

}
