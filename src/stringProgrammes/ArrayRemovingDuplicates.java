package stringProgrammes;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ArrayRemovingDuplicates {
	
	public static void duplicates() {
	
		//int[] array = {1,2,3,1,2,5};

		String[] words = {"java","selenium","java","c++"};
		
		for (int i= 0 ; i<=words.length-1; i++)
	    {
	    	for (int j= i+1 ; j<=words.length-1; j++) 
	    	{
	    		
	    		if(words[i]==words[j])
	    		{
	    			
	    			System.out.println( " Duplicate word is :" + words[i] + " ");
	    			
	    			
	    			
	    		}
	    		
	    		
	    		
	    	}	
	    	
	    }
		
		
		
		
	}

	

	public static void main(String[] args) {

		duplicates();
		
	}
}
