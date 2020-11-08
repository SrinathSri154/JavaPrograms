package stringProgrammes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PrimeNumber {
	
	
	
	public static void input(String input) {
		
		char[] ch = input.toCharArray();
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for(char words : ch)
		{
	if(map.containsKey(words))
	{
		map.put(words, map.get(words)+1);	
		
	}
			
	else {
		
		map.put(words,1);
		
	}	
			
			
		}
		
		for(char words:ch) {
		
		if(map.get(words)>1) {
			
		System.out.println("The First repeated chacter is :" + words);
		break;
		}}
		
		for(char words:ch) {
			
			if(map.get(words)==1) {
				
			System.out.println("The First Non repeated chacter is :" + words);
			break;
			}
		}
		
	}


	public static void main(String[] args) {
        //int num = 17;
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a number :");
//		int number = sc.nextInt();
//		
//		int low = 2;
//		int high = 50;
//		boolean flag = false;
		
//		for(int i =2; i<=number/2 ; ++i)
//		{
//			if (number%i==0)
//			{
//				flag = true;
//				break;
//			}
//		}
//			if(!flag)
//			{
//				
//				System.out.println(number + " : It is prime number " );
//			}
//			else
//			{
//				
//				System.out.println(number + " : It is not prime number ");
//			}
//			
//		}
//		
		
//		while(low<high)
//		{
//			
//		
//		
//		
//		
//		}
//		}
		
		
		input("srinaths");
		
		
		
	}	
		
	}

