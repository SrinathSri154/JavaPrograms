package JavaConcepts;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemovingDuplicateCharacter {
	
	
	
	public static void input(String input) {
		
		char[] character = input.toCharArray();
		
		HashSet set = new LinkedHashSet();
		StringBuffer str = new StringBuffer();
		
		for (char words : character) {
			
			if(set.add(words))
			{
				 str.append(words);
				}}
		System.out.println(str);
		
		
//		for(char words : character)
//		{
//			if(set.add(words)==false)
//			{
//				
//				System.out.println(set);
//				
//			}
//			
//			
//		}
		
		
	}

	public static void main(String[] args) {
		
            input("srinathsep");

	}

}
