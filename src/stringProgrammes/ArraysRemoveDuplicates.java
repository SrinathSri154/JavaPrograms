package stringProgrammes;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysRemoveDuplicates {
	
public static boolean input(String str1, String str2) {
		
	char[] char1= str1.toCharArray();
	char[] char2 = str2.toCharArray();
	
	Arrays.sort(char1);
	Arrays.sort(char2);
	
	if(str1.length()!=(str2.length())) {
		
		System.out.println("These two are not anagram");
		return false;
		
	}
		
	for(int i=0;i<=str1.length()-1;i++)
	{
		
	if(char1[i]!=char2[i]) {
		
		
		System.out.println("These two are not anagram");
		return false;
		
		
		
	}
	
	}
		
		System.out.println("These two are  anagram");
		return true;
		
}	

	public static void main(String[] args) {

//		ArrayList<String> listone = new ArrayList<>(Arrays.asList("a","b","a","c","d","d"));
//		ArrayList<String> listtwo = new ArrayList<>(Arrays.asList("a","b","f","w","z"));
//		//listone.retainAll(listtwo);
//		//listtwo.removeAll(listone);
//		listone.removeAll(listtwo);
//		System.out.println(listone);
//		//System.out.println(listtwo);
//		//System.out.println(listone);
//		
//		
//		String str = "Srinath hyderabad delhi Srinath";
//		String replace=str.replace("hyderabad", "1");
//		System.out.println(replace);
//		String replace1=replace.replace("delhi", "2");
//		System.out.println(replace1);
//		String replace2=replace1.replaceFirst("S", "%");
//		System.out.println(replace2);
//		String replace3 = replace2.replaceAll("1","");
//		System.out.println(replace3);
//		
//		CharSequence substring = str.subSequence(2,10);
//		System.out.println(substring);
//		
//		
//		System.out.println("-------------------------------");
//		
//		
//		
//		
//		String string = "       srinath      ";
//	
//		System.out.println("before removing spaces :" + string);
//		//String replace4 = string.replaceAll("\\s", "");
//		String replace4 = string.trim();
//		//for(int i=0; i<=)
//		System.out.println("After removing spaces :" +replace4);
//		
//		
//		
//		int i = 200;
//	 System.out.println(String.valueOf(i));
//	 
//	 String s = Integer.toString(i);
//	 System.out.println(s);
		
	input("seek", "eesk");
		
		
		
	}

}
