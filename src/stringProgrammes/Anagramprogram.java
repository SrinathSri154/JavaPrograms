package stringProgrammes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Anagramprogram {
	
//	public static boolean compare(String strng1, String strng2)
//	{
//		
//		
//		
//		char[] char1 = strng1.toCharArray();
//		char[] char2 = strng2.toCharArray();
//		
//		
//		Arrays.sort(char1);
//		Arrays.sort(char2);
//		
//		if(strng1.length()!=strng2.length())
//		{
//			
//			System.out.println("These 2 strings are not anagram");
//			return false;}
//		
//		for(int i=0; i<strng1.length();i++)
//		{
//		if(char1[i]!=char2[i])
//		{
//		
//			System.out.println("These 2 strings are not anagram");
//		return false;	
//			
//		}
//	   		
//			
//		}
//		
//		System.out.println("These 2 strings are anagram");
//		return true;
//		
//		
//		
//		
//		
//		
//		
//		
//	}

	public static void main(String[] args) {

		//compare("cat","acte");
		
		int num =10;
		boolean flag = false;
		for(int i=2; i<num/2;++i)
		{
			
			if(num%i==0)
			{
				
				flag= true;
				break;
				
				
			}
	   }
		
		if(!flag) {
			System.out.println("It is a prime number");
			
			
			
			
		}
		else{
			
			System.out.println("Not a prime number");
			
		}
		
		
		
//		Map<String,String> map = new HashMap<String,String>();
//		map.put("1", "Sri");
//		map.put("2", "nath");
//		
//		//1st method of iteration in hashmap
//		Iterator<String> itr =map.keySet().iterator();
//		while(itr.hasNext())
//		{
//			String key = itr.next();
//			System.out.print(key);
//			String value = map.get(key);
//			System.out.print(" " +value);
//			System.out.println();
//			
//		}
//		System.out.println("----------------------");
//		
//		//2nd method of iteration in hashmap
//		Iterator<Entry<String,String>> itr1 =map.entrySet().iterator();
//		while(itr1.hasNext())
//		{
//			Entry<String,String> entry =itr1.next();
//			System.out.println("Key is :" + entry.getKey() + "  Value is :" + entry.getValue());
//			
//			
//		}
//		
//		
//		
//		
//	}

}}
