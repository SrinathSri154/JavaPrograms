package stringProgrammes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PrintInPairs {
	
//	public static void pairsum(int[] arr,int sum,int n) {
//		for(int i=0; i<n;i++)
//		{
//			for(int j=i+1; j<n;j++)
//			{
//				
//				if(arr[i] + arr[j]==sum)
//				{
//					
//					//System.out.println("("+ arr[i] + "," + arr[j]+")");
//					System.out.println( "("+ arr[i] + ","  + arr[j]+ ")");
//					}}}	}
//
//	
//	public static void main(String[] args) {
//
//		int[] arr= {1,5,7,-1,5};
//		int sum = 6;
//		int n = arr.length;
//		pairsum(arr,sum,n);
//		
//		
//	}}
	
	public static void main (String[] args)
	{
		
	
	int[] a1 = {1,2,3,4,5};
	int[] a2= {2,5,3,4,6};
	
	Arrays.sort(a1);
	Set<Integer> set = new HashSet<>();
	for(Integer integer : a1)
	{
		
		set.add(integer);
		System.out.println();
		
	}
	
	
	
	
	
	
	
	}
	}