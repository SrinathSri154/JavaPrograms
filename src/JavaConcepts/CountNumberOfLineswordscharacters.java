package JavaConcepts;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountNumberOfLineswordscharacters {
	
	


	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\goturi\\Desktop\\input.txt"));
		int linecount=0;
		int wordscount = 0;
		int charactercount = 0;
		
		String currentline= reader.readLine();
		while(currentline!=null)
		{
			linecount++;
			
			String[] words = currentline.split(" ");
			
			for(String word : words)
			{
				wordscount++;
				
			char[] character = word.toCharArray();
			for(char ch : character)
			{
				
				charactercount++;
				
				
			}
			
			}

			currentline=reader.readLine();
			
			
		}
		
		System.out.println("Number of lines in given text is : " + linecount);
		System.out.println("Number of words in given text is : " + wordscount);
		System.out.println("Number of characters in given text is : " + charactercount);
	}

}
