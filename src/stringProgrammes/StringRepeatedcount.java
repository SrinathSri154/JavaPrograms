package stringProgrammes;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringRepeatedcount {
	 public static void inputstring(String input) {
		 
		 Map<String,Integer> wordcount = new HashMap<>();
		 String[] words = input.split(" ");
		 
		 for(String word : words)
		 {
			if(wordcount.containsKey(word))
			{
				
				wordcount.put(word,wordcount.get(word)+1);
			}
			
			else {
				
				wordcount.put(word,1);
				
				
			}	
		 }
			 
			 
		Set<String> keyset = wordcount.keySet();
		
		 for(String word : words)
		 {
			 if(wordcount.get(word)>1)
				{
			 System.out.println(word + " : " + wordcount.get(word));
		 }
		 
		 
		 } 	 }
	
	public static void main(String[] args) {
		
		inputstring("This is srinath srinath is ");

	}

}
