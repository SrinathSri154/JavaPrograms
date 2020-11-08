package stringProgrammes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SumOfNumberInTextFile {

	public static void main(String[] args) throws IOException {
		

		FileReader file = new FileReader("C:\\Users\\goturi\\Desktop\\Number.txt");
		
		BufferedReader reader = new BufferedReader(file);
//		
//		int currentline = reader.
//		int r,sum=0, num=312;
//		while(num!=0)
//		{
//			r = num%10; //1
//			sum = sum+r; //21
//			num = num/10; //3
//			
//		}
//		
//		System.out.println("Reverse of given number is :" + sum);
//	}
		
         String str;
         int count =0;
         while((str= reader.readLine())!=null)
         {
        	 
        	 count = count+Integer.parseInt(str);
        	 
        	
         }
		
		
		System.out.println(count);
		
		
		
		
	}}


